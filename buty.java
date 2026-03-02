public final class buty extends lsb {
    public static final bboh a;
    public final bujj b;
    public final cchj c;
    public final icnj d;
    public final icnj e;
    public final icnl f;
    public final icnl g;
    private final ibrt h;

    static {
        buty.a = bboh.b("WebviewViewModel", bbcu.hd);
    }

    public buty(ibrt ibrt0, bujj bujj0, cchj cchj0) {
        ibuq.f(cchj0, "accountManager");
        super();
        this.h = ibrt0;
        this.b = bujj0;
        this.c = cchj0;
        icnl icnl0 = icnm.a(butu.a);
        this.f = icnl0;
        this.d = icnl0;
        icnl icnl1 = icnm.a(null);
        this.g = icnl1;
        this.e = icnl1;
    }

    public final void a(ghip ghip0, boolean z) {
        ibuq.f(ghip0, "whatsAppWebViewUrl");
        this.f.g(butu.a);
        icnl icnl0 = this.g;
        if(icnl0.b() != null) {
            icnl0.g(Boolean.valueOf(true));
        }
        icck icck0 = lsc.a(this);
        butx butx0 = new butx(this, ghip0, z, null);
        icbb.b(icck0, this.h, null, butx0, 2);
    }
}

