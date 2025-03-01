package org.example.service;

import java.util.HashMap;
import java.util.List;

public class UserRegistrationValidationException extends RuntimeException {
    HashMap<String, List<String>> errorList = new HashMap<>();
}
