public enum tkz {
    NOT_AVAILABLE(0),
    CONFIRMATION_CODE_ENTERED(1),
    FINGERPRINT(2),
    CONFIRMATION_PATTERN_DRAWN(3);

    public final byte e;

    private tkz(int v1) {
        this.e = (byte)v1;
    }
}

