public enum bmbw {
    SECP256R1(1, 0x20),
    SECP384R1(2, 0x30),
    SECP521R1(3, 66);

    public final int d;
    public final int e;

    private bmbw(int v1, int v2) {
        this.d = v1;
        this.e = v2;
    }
}

