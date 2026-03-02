public enum bmja {
    SIGN("fido2_sign_response"),
    REGISTER("fido2_register_response"),
    ERROR("fido2_error_response");

    public final String d;

    private bmja(String s1) {
        this.d = s1;
    }

    @Override
    public final String toString() {
        return this.d;
    }
}

