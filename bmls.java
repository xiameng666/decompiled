public enum bmls {
    SUCCESS(0),
    CTAP2_ERR_CREDENTIAL_EXCLUDED(25),
    CTAP2_ERR_UNSUPPORTED_OPTIONS(43),
    CTAP2_ERR_NO_CREDENTIALS(46),
    CTAP2_ERR_INVALID_CREDENTIAL(34),
    CTAP2_ERR_OTHER(0x7F),
    CTAP2_ERR_OPERATION_DENIED(39);

    public final byte h;

    private bmls(byte b) {
        this.h = b;
    }
}

