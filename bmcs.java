public enum bmcs {
    KEYSTORE(1),
    SOFTWARE(2),
    STRONGBOX(3),
    SYNCED(4),
    CORP(5);

    public final int f;

    private bmcs(int v1) {
        this.f = v1;
    }

    public static bmcs a(int v) {
        bmcs bmcs0 = bmcs.a;
        if(v == bmcs0.f) {
            return bmcs0;
        }
        bmcs bmcs1 = bmcs.b;
        if(v == bmcs1.f) {
            return bmcs1;
        }
        bmcs bmcs2 = bmcs.c;
        if(v == bmcs2.f) {
            return bmcs2;
        }
        bmcs bmcs3 = bmcs.d;
        if(v == bmcs3.f) {
            return bmcs3;
        }
        bmcs bmcs4 = bmcs.e;
        if(v == bmcs4.f) {
            return bmcs4;
        }
        throw new IllegalArgumentException("Value is not a known key type");
    }
}

