public enum blzs {
    AUTHENTICATOR_MAKE_CREDENTIAL(1),
    AUTHENTICATOR_GET_ASSERTION(2),
    AUTHENTICATOR_CANCEL(3),
    AUTHENTICATOR_GET_INFO(4),
    AUTHENTICATOR_CLIENT_PIN(6),
    AUTHENTICATOR_RESET(7),
    AUTHENTICATOR_GET_NEXT_ASSERTION(8);

    public final byte h;

    private blzs(byte b) {
        this.h = b;
    }
}

