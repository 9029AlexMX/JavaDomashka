package org.example.service;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.ArrayList;
import java.util.List;

public class UserRegistrationValidator {
    void validate(UserRegistrationDto user) {
        UserRegistrationValidationException e = new UserRegistrationValidationException();
        if(user.getEmail() == null) {
            e.errorList.put("email", List.of("Email is required."));
        } else if(!EmailValidator.getInstance().isValid(user.getEmail())) {
            e.errorList.put("email", List.of("Please enter valid email address."));
        }

        if(user.getPhoneNumber() != null) {
            PhoneNumber phoneNumber = new PhoneNumber();
            phoneNumber.setRawInput(user.getPhoneNumber());
            if(!PhoneNumberUtil.getInstance().isValidNumber(phoneNumber)) {
                e.errorList.put("phoneNumber", List.of("Please enter valid phone number."));
            }
        }

        if(user.getPassword() == null) {
            e.errorList.put("password", List.of("Password is required."));
        }

        List<String> repeatPasswordErrors = new ArrayList<>();
        if(user.getRepeatPassword() == null) {
            repeatPasswordErrors.add("Repeat password is required.");
        }
        if(!user.getPassword().equals(user.getRepeatPassword())) {
            repeatPasswordErrors.add("Entered passwords do not match.");
        }
        if(!repeatPasswordErrors.isEmpty()) {
            e.errorList.put("repeatPassword", repeatPasswordErrors);
        }

        if(!e.errorList.isEmpty())
            throw e;
    }
}
