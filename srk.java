public enum srk {
    TRIPLE_DES_2K(2, 8),
    AES_128(9, 16);

    public final byte c;
    public final int d;
    public final int e;

    private srk(byte b, int v1) {
        this.c = b;
        this.d = v1;
        this.e = 16;
    }

    public final int a() {
        return this.c(2);
    }

    public final int b() {
        return this.c(4);
    }

    private final int c(int v) {
        return this.e * v + this.d;
    }
}

