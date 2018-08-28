boolean isMAC48Address(String inputString) {
    return inputString.matches("((([A-F]|\\d){2})\\-){5}([A-F]|\\d){2}$");
}

