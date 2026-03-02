public class bdzc extends lsb {
    public final bejg a;
    public final bdyy b;
    public final lqd c;
    public final lqd d;
    public final bxox e;
    public final lqd f;
    public final lqd g;

    static {
        bboh.b("DeviceSettingsViewModel", bbcu.cX);
    }

    public bdzc(bejg bejg0, bdyy bdyy0) {
        ibuq.f(bejg0, "userMetricsRepository");
        ibuq.f(bdyy0, "deviceSettingsRepository");
        super();
        this.a = bejg0;
        this.b = bdyy0;
        ibrt ibrt0 = ((lug)lsc.a(this)).a;
        this.c = lox.c(bdyy0.c, ibrt0, 2);
        ibrt ibrt1 = ((lug)lsc.a(this)).a;
        this.d = lox.c(bdyy0.b, ibrt1, 2);
        bxox bxox0 = new bxox();
        this.e = bxox0;
        this.f = bxox0;
        this.g = new lqi(Boolean.valueOf(true));
    }
}

