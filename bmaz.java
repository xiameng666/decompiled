public final class bmaz implements blzd {
    public static final bboh a;
    public final gmcg b;
    public final bmau c;

    static {
        bmaz.a = bnaa.e("NfcChannel");
    }

    public bmaz(gmcg gmcg0, bmau bmau0) {
        gftb.check(gmcg0);
        this.b = gmcg0;
        this.c = bmau0;
    }

    @Override  // blzd
    public final gmcd a() {
        bmax bmax0 = new bmax(this);
        return this.b.f(bmax0, null);
    }

    @Override  // blzd
    public final gmcd b() {
        throw null;
    }

    @Override  // blzd
    public final gmcd c(blzt blzt0) {
        try {
            return glzd.f(this.f(blzt0.e()), new bmaq(blzt0), this.b);
        }
        catch(hhrm hhrm0) {
            bxly bxly0 = new bxly();
            bxly0.c = hhrm0;
            bxly0.a = 8;
            return gmbu.h(bxly0.a());
        }
    }

    @Override  // blzd
    public final gmcd d(bmbb bmbb0) {
        return glzd.f(this.f(bmbb0.a()), new bmbe(), this.b);
    }

    @Override  // blzd
    public final boolean e() {
        return this.c.a.isConnected();
    }

    private final gmcd f(byte[] arr_b) {
        bmay bmay0 = new bmay(this, arr_b);
        return this.b.e(bmay0);
    }
}

