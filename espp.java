public final class espp {
    public static final espp a;
    public static final espp b;
    public final String c;
    public final String d;

    static {
        espp.a = new espp("com.google.android.gms.tapandpay.hce.service.TpHceService");
        espp.b = new espp("com.google.android.gms.tapandpay.secureelement.service.TpOffHostApduService");
    }

    private espp(String s) {
        this.c = s;
        this.d = "payment";
    }
}

