public enum bmhq implements bmgm {
    ED256(-260),
    ED512(0xFFFFFEFB),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    public final int h;

    private bmhq(int v1) {
        this.h = v1;
    }

    @Override  // bmgm
    public final int a() {
        return this.h;
    }
}

