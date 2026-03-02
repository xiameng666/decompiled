import java.util.EnumSet;

public final class hnmd {
    public static final hnnf a;
    public static final String b;
    public final hnly c;
    public final hnmb d;
    public final essg e;
    public final essb f;
    public hnlz g;
    public final hnkd h;
    public final hnkb i;
    public final hnkb j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final hnko p;

    static {
        hnmd.a = new hnnf("PureRemoteSession");
        hnmd.b = "hnmd";
    }

    public hnmd(hnly hnly0, hnmb hnmb0, byte[] arr_b, essg essg0, essb essb0) {
        this.h = hnkd.a(((byte)0));
        this.i = hnkb.a(5);
        this.j = hnkb.a(1);
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = hnly0;
        this.d = hnmb0;
        this.e = essg0;
        this.f = essb0;
        this.p = new hnko();
        hnnf.b(new Object[]{"accumulators:" + hnne.a(arr_b)});
        hnnf.b(new Object[]{"inAppTransaction:", "amountMicros:", ((long)essg0.c), "currencyCode:", ((int)essg0.b), "merchantIdentification:", essg0.f, "transactionDate:", essg0.d, "bindTransactionData:", Boolean.valueOf(essg0.g), "terminalCountryCode:", ((int)essg0.e), "merchantCapabilities:", ((long)essg0.a)});
        EnumSet enumSet0 = essg0.h;
        if(enumSet0 != null) {
            for(Object object0: enumSet0) {
                hnnf.b(new Object[]{"merchantCapabilities:" + ((essf)object0).toString()});
            }
        }
        Boolean boolean0 = Boolean.valueOf(true);
        hnnf.b(new Object[]{"cvmCallback:", "isCdCvmPassed=", boolean0, "isVelocityCheckPassed=", boolean0, "shouldResetRiskCounter=", Boolean.valueOf(essb0.d()), "getUnlockMethod=", essb0.a()});
    }

    public final hnlb a() {
        if(hnnb.d(this.g.d[5], ((byte)1))) {
            hnnf.b(new Object[]{"Key Algo: AES"});
            return hnlc.a(1);
        }
        hnnf.b(new Object[]{"Key Algo: TDES"});
        return hnlc.a(2);
    }
}

