import java.util.ArrayList;
import java.util.List;

public class bddm extends lsb {
    public final bddu a;
    public final bejg b;
    public final List c;
    public final List d;
    public final List e;
    public final lqi f;
    public final lqd g;
    public final lqi h;
    public final lqd i;
    public final bxox j;
    public final lqd k;
    public final lqi l;
    public final lqd m;
    public final lqi n;
    public final lqd o;
    public final lqi p;
    public final lqd q;
    public final bxox r;
    public final lqd s;
    public final bxox t;
    public final lqd u;
    public final bxox v;
    public final lqd w;
    public final bxox x;
    public final lqd y;
    private final String z;

    public bddm(beih beih0, bcyv bcyv0, bddu bddu0, bejg bejg0, String s) {
        ibuq.f(beih0, "passwordDataRepository");
        ibps ibps0;
        ibuq.f(bddu0, "passwordMover");
        ibuq.f(bejg0, "userMetricsRepository");
        super();
        this.a = bddu0;
        this.b = bejg0;
        this.z = s;
        bedv bedv0 = (bedv)beih0.f.ij();
        if(bedv0 == null) {
            ibps0 = ibps.a;
        }
        else {
            gged_interceptors gged0 = (gged_interceptors)bedv0.b;
            if(gged0 == null) {
                ibps0 = ibps.a;
            }
            else {
                ibps0 = new ArrayList();
                for(Object object0: gged0) {
                    gqlt gqlt0 = (gqlt)object0;
                    ibuq.e(gqlt0.c, "getCredentialGroups(...)");
                    ArrayList arrayList0 = new ArrayList(ibpo.q(gqlt0.c, 10));
                    ggqk ggqk0 = gqlt0.c.E();
                    while(ggqk0.hasNext()) {
                        Object object1 = ggqk0.next();
                        arrayList0.add(new ibns(((gqmd)object1), gqlt0.b));
                    }
                    ibpo.D(ibps0, arrayList0);
                }
            }
        }
        this.c = ibps0;
        int v = ibps0.size();
        ArrayList arrayList1 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(Boolean.valueOf(true));
        }
        this.d = arrayList1;
        List list0 = ibpo.ai(bcyv0.a(), this.z);
        this.e = list0;
        lqi lqi0 = new lqi(bdde.b(this.c, arrayList1));
        this.f = lqi0;
        this.g = lqi0;
        lqi lqi1 = new lqi();
        this.h = lqi1;
        this.i = lqi1;
        bxox bxox0 = new bxox();
        this.j = bxox0;
        this.k = bxox0;
        lqi lqi2 = new lqi();
        this.l = lqi2;
        this.m = lqi2;
        lqi lqi3 = new lqi();
        this.n = lqi3;
        this.o = lqi3;
        lqi lqi4 = new lqi((list0.size() == 1 ? bddf.a : bddf.b));
        this.p = lqi4;
        this.q = lqi4;
        bxox bxox1 = new bxox();
        this.r = bxox1;
        this.s = bxox1;
        bxox bxox2 = new bxox();
        this.t = bxox2;
        this.u = bxox2;
        bxox bxox3 = new bxox();
        this.v = bxox3;
        this.w = bxox3;
        bxox bxox4 = new bxox();
        this.x = bxox4;
        this.y = bxox4;
        this.b.c(gqsm.NV);
    }

    public final void a(String s) {
        icbb.b(lsc.a(this), null, null, new bddl(this, s, null), 3);
    }

    public static final boolean b(List list0) {
        if(list0.isEmpty()) {
            return true;
        }
        for(Object object0: list0) {
            if(!((Boolean)object0).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}

