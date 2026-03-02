public enum srl {
    SHA_1(6),
    SHA_256(7),
    CMAC_AES(9);

    public final byte d;

    private srl(byte b) {
        this.d = b;
    }
}

