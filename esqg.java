public final class esqg {
    public String a;
    public String b;
    public boolean c;
    public esqh d;
    public gfsx e;
    @Deprecated
    public boolean f;
    public boolean g;
    public String h;
    public int i;
    public boolean j;
    public gjuf k;
    public int l;
    private static final bboh m;

    static {
        esqg.m = bboh.b("TapAndPay", bbcu.aM);
    }

    public esqg() {
        this.e = gfqx.a;
        this.g = false;
        this.j = false;
        this.k = gjuf.a;
        this.l = 0;
    }

    public final void a(esqo esqo0, gfsx gfsx0) {
        boolean z = true;
        if(hyua.e()) {
            gfsx gfsx1 = this.e;
            if(gfsx0.i() && ((String)gfsx0.d()).equals("canonical_pure_bundle")) {
                z = esqj.c(esqo0);
            }
            else {
                gfsx gfsx2 = esqj.a(esqo0, gfsx0);
                if(!esqj.d(esqo0) || !gfsx2.i() || !((Boolean)gfsx2.d()).booleanValue()) {
                    z = false;
                }
            }
            this.b(((Boolean)gfsx1.f(Boolean.valueOf(z))).booleanValue());
            gfsx gfsx3 = esqj.a(esqo0, gfsx0);
            if(gfsx3.i()) {
                this.g = ((Boolean)gfsx3.d()).booleanValue();
            }
            return;
        }
        int v = esqg.c(esqo0.d(0x9F02));
        if(!esqj.b(((short)esqg.c(esqo0.d(0x9F15)))) || ((long)v) > hyua.c()) {
            z = false;
        }
        this.f = z;
        this.e = gfsx.m(Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.f = z;
        this.e = gfsx.m(Boolean.valueOf(z));
    }

    private static int c(byte[] arr_b) {
        try {
            return (int)esyw.a(arr_b);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(esqg.m.j(), "Terminal sent wrong BCD data", illegalArgumentException0);
            return 0;
        }
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = new ToStringHelper("CapturedAppletData");
        gfsv0.add("message", this.a);
        gfsv0.add("selectedAid", this.b);
        gfsv0.addBool("isHighValueTransaction", this.c);
        gfsv0.add("cvmMethod", this.d);
        gfsv0.addBool("isTransit", this.f);
        gfsv0.addBool("isOda", this.g);
        gfsv0.add("transactionIdentifier", this.h);
        gfsv0.f("paymentKeysLeft", this.i);
        gfsv0.add("tapPath", this.k);
        gfsv0.f("atc", this.l);
        return gfsv0.toString();
    }
}

