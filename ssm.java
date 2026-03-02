public enum ssm {
    SEOS(0),
    MIFARE(1),
    ICLASS(2);

    public final byte d;

    private ssm(byte b) {
        this.d = b;
    }
}

