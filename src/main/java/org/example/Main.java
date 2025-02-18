package org.example;

import org.example.util.ConnectionUtil;

public final class Main {
    private Main() {
    }

    /**
     * App main entry point.
     *
     * @param args Arguments.
     */
    public static void main(final String[] args) {
        ConnectionUtil.getConnection();
        System.out.println("Hello World !");
    }
}
