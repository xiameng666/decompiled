public class belv extends lsb {
    public static final bboh a;
    public final beih b;
    public final beev c;
    public final lqd d;
    public final lqd e;
    private final bxox f;
    private final bxox g;

    static {
        belv.a = bboh.b("BlocklistViewModel", bbcu.cX);
    }

    public belv(beih beih0, beev beev0) {
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(beev0, "chromeSyncStateRepository");
        super();
        this.b = beih0;
        this.c = beev0;
        bxox bxox0 = new bxox();
        this.f = bxox0;
        this.d = bxox0;
        bxox bxox1 = new bxox();
        this.g = bxox1;
        this.e = bxox1;
    }

    public final lqd a() {
        bels bels0 = new bels(this);
        return lsa.b(this.b.l, bels0);
    }

    public final void b(bedv bedv0) {
        ibuq.f(bedv0, "response");
        if(bedv0.a != bedu.c) {
            return;
        }
        Exception exception0 = bedv0.c;
        if((exception0 instanceof aztb) && ((aztb)exception0).b() == 7) {
            a.ae(belv.a.i(), "Deleting/adding blocklist entry failed with network error.", exception0);
            this.f.l(ibom.a);
            return;
        }
        a.ae(belv.a.i(), "Deleting/adding blocklist app failed with unknown error.", exception0);
        this.g.l(ibom.a);
    }
}

