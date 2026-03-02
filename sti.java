public enum sti {
    CRYPTOGRAM((byte)0x85),
    LENGTH_EXPECTED(-105),
    MAC((byte)0x8E),
    STATUS_WORD(-103),
    ALGORITHM_INFO(-51);

    public final byte f;

    private sti(byte b) {
        this.f = b;
    }
}

