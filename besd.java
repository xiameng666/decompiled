public class besd extends lsb {
    public final bdbh a;
    public final bdbk b;
    public final lqi c;
    public final lqd d;
    public final lqd e;
    public final lqd f;
    public final lqd g;
    public final lqd h;
    public final bxox i;

    public besd(beih beih0, beev beev0, bdbh bdbh0, bdbk bdbk0) {
        this.c = new lqi();
        this.i = new bxox();
        this.a = bdbh0;
        this.b = bdbk0;
        berx berx0 = new berx(beev0);
        lqd lqd0 = lsa.b(beih0.f, berx0);
        this.d = lqd0;
        lqd lqd1 = lsa.b(lsa.b(beos.b(lqd0, new bery()), new berz()), new besa());
        this.e = lqd1;
        this.f = lsa.b(lqd1, new besb());
        this.g = lsa.b(beos.b(lqd0, new besc()), new berp());
        this.h = lsa.b(beos.b(lqd0, new berq()), new berr());
    }

    public static boolean a(bedv bedv0) {
        return bedv0.c == null ? false : (bedv0.c instanceof aztb) && ((aztb)bedv0.c).b() == 7;
    }
}

