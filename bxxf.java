public enum bxxf {
    GET_CREDENTIAL("registry.pb"),
    CREATE_CREDENTIAL("create_registry.pb"),
    CREDENTIAL_TRANSFER("credential_transfer.pb");

    final String d;

    private bxxf(String s1) {
        this.d = s1;
    }
}

