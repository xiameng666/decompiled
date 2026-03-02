import java.net.URI;

public class bekz extends lsb {
    public lqd B;
    public lqj C;
    public final lqi D;
    public final lqi E;
    public final lqi F;
    public final lqi G;
    public static final bekp a;
    public static final bboh b;
    public final beih c;
    public final begt d;
    public final bbng e;
    public final lqi f;
    public final lqi g;
    public final lqi h;
    public boolean i;
    public final lqi j;
    public final lqd k;
    public final lqi l;
    public final lqi m;
    public final lqi n;
    public final lqi o;
    public final lqd p;
    public final lqi q;
    public final lqi r;
    public boolean s;
    public final lqi t;
    public final lqi u;
    public final lqd v;
    public final lqd w;
    public final lqi x;
    public final lqd y;
    public final lqd z;

    static {
        bekz.a = new bekp();
        bekz.b = bboh.b("AddCredentialViewModel", bbcu.cX);
    }

    public bekz(beih beih0, begt begt0) {
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begt0, "passwordCheckupRepository");
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begt0, "passwordCheckupRepository");
        super();
        this.c = beih0;
        this.d = begt0;
        this.e = bbnk.a;
        this.f = new lqi(bekv.a);
        lqi lqi0 = new lqi(beku.a);
        this.g = lqi0;
        lqi lqi1 = new lqi("");
        this.h = lqi1;
        this.j = new lqi();
        this.k = lsa.b(lqi0, new beju());
        Boolean boolean0 = Boolean.valueOf(false);
        lqi lqi2 = new lqi(boolean0);
        this.l = lqi2;
        this.m = new lqi(boolean0);
        lqi lqi3 = new lqi();
        this.n = lqi3;
        this.o = new lqi(Boolean.valueOf(true));
        this.p = lsa.b(lqi0, new bejv());
        lqi lqi4 = new lqi("");
        this.q = lqi4;
        lqi lqi5 = new lqi("");
        this.r = lqi5;
        this.t = new lqi(boolean0);
        lqi lqi6 = new lqi("");
        this.u = lqi6;
        lqh lqh0 = new lqh();
        bejy bejy0 = new bejy(beih0.f, beih0.j, lqh0);
        beky beky0 = new beky(new beke(bejy0));
        lqh0.o(beih0.j, beky0);
        beky beky1 = new beky(new bekf(bejy0));
        lqh0.o(beih0.f, beky1);
        this.v = lqh0;
        lqh lqh1 = new lqh();
        bekg bekg0 = new bekg(lqi0, lqi1, lqi3, lqi4, lqh0, lqh1);
        lqh1.o(lqi0, new beky(new bekh(bekg0)));
        lqh1.o(lqi1, new beky(new beki(bekg0)));
        lqh1.o(lqi3, new beky(new bekj(bekg0)));
        lqh1.o(lqi4, new beky(new bekk(bekg0)));
        lqh1.o(lqh0, new beky(new bekl(bekg0)));
        this.w = lqh1;
        lqi lqi7 = new lqi(boolean0);
        this.x = lqi7;
        lqh lqh2 = new lqh();
        bekm bekm0 = new bekm(lqi2, lqi5, lqi6, lqi7, lqh1, lqh2);
        lqh2.o(lqi2, new beky(new bejz(bekm0)));
        lqh2.o(lqi5, new beky(new beka(bekm0)));
        lqh2.o(lqi6, new beky(new bekb(bekm0)));
        lqh2.o(lqi7, new beky(new bekc(bekm0)));
        lqh2.o(lqh1, new beky(new bekd(bekm0)));
        this.y = lqh2;
        this.z = beih0.l;
        this.D = new lqi(boolean0);
        this.E = new lqi(boolean0);
        this.F = new lqi(boolean0);
        this.G = new lqi(boolean0);
    }

    public final void a() {
        lqj lqj0 = this.C;
        if(lqj0 != null) {
            lqd lqd0 = this.B;
            if(lqd0 != null) {
                lqd0.j(lqj0);
            }
        }
        this.B = null;
        this.C = null;
    }

    public final void b() {
        this.D.l(Boolean.valueOf(true));
        this.x.l(Boolean.valueOf(false));
        this.f.l(bekv.i);
    }

    public final void c(bedv bedv0) {
        bedu bedu0 = bedv0.a;
        switch(bedu0.ordinal()) {
            case 0: {
                ((ggtj)bekz.b.i()).B("Unhandled result of type %s", bedu0);
                this.b();
                return;
            }
            case 1: {
                this.x.l(Boolean.valueOf(true));
                return;
            }
            case 2: {
                ((ggtj)((ggtj)bekz.b.i()).s(bedv0.c)).x("Error while adding credential");
                this.b();
                this.a();
                return;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public final boolean e() {
        lqi lqi0 = this.h;
        String s = bekp.a(((String)beos.e(lqi0)));
        int v = bekp.d(s);
        if(v) {
            ibuq.f(s, "<this>");
            URI uRI0 = bekp.f(s);
            if(uRI0 != null) {
                URI uRI1 = bekp.e(uRI0);
                if(uRI1 != null) {
                    String s1 = uRI1.toString();
                    if(s1 != null) {
                        s = s1;
                    }
                }
            }
            lqi0.l(s);
            this.j.l(s);
        }
        else {
            String s2 = (String)beos.e(lqi0);
            int v1 = s2.length() - 1;
            int v2 = 0;
            int v3 = 0;
            while(v2 <= v1) {
                int v4 = ibuq.a(s2.charAt((1 == v3 ? v1 : v2)), 0x20);
                if(v3 == 0) {
                    if(v4 > 0) {
                        v3 = 1;
                    }
                    else {
                        ++v2;
                    }
                    continue;
                }
                else if(v4 <= 0) {
                    --v1;
                    continue;
                }
                break;
            }
            String s3 = s2.subSequence(v2, v1 + 1).toString();
            lqi0.l(s3);
            this.j.l(s3);
        }
        this.i = true;
        this.l.l(Boolean.valueOf(((boolean)(v ^ 1))));
        this.f.l((v == 0 ? bekv.c : bekv.b));
        return v != 0;
    }

    public final boolean f() {
        int v = ((CharSequence)beos.e(this.r)).length();
        this.s = true;
        this.t.l(Boolean.valueOf(v == 0));
        return v != 0;
    }

    @Override  // lsb
    protected final void km() {
        this.a();
    }
}

