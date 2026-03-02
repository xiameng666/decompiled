public final class tld extends tbd {
    public static final tcz e;

    static {
        tld.e = new tcz("Issuer Application Data", "Contains proprietary application data for transmission to the Issuer in an online transaction.", tld.c, 0x20, 0x7FFFFFFF, 3, 1, 1, 5, 1, tld.d, 5);
    }

    public tld() {
        this(new byte[0x20], false);
    }

    public tld(byte[] arr_b, boolean z) {
        super(arr_b, z, tld.e);
    }

    public final byte h() {
        return this.b[1];
    }

    public final byte i() {
        return this.b[26];
    }

    public final int j() {
        return this.b[17];
    }

    public final tak k() {
        byte[] arr_b = new byte[5];
        System.arraycopy(this.b, 3, arr_b, 0, 5);
        return new tlc(arr_b);
    }

    public final tbn l() {
        return new tbn(new byte[]{this.b[2]});
    }

    public final void m(tkx tkx0) {
        System.arraycopy(tkx0.f(), 0, this.b, 1, 1);
    }

    public final void n(tla tla0) {
        System.arraycopy(tla0.f(), 0, this.b, 26, 1);
    }

    public final void o(tlc tlc0) {
        System.arraycopy(tlc0.f(), 0, this.b, 3, 5);
    }

    public final void p(tbn tbn0) {
        System.arraycopy(tbn0.f(), 0, this.b, 2, 1);
    }

    public final void q() {
        byte[] arr_b = this.b;
        arr_b[0] = 15;
        arr_b[16] = 15;
        for(int v = 0; v < 8; ++v) {
            this.b[v + 8] = 0;
        }
    }
}

