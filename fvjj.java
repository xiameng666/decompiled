import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fvjj {
    public fvcl a;
    private final fvdq b;
    private final gfuv c;
    private final int d;
    private final fvjl e;

    public fvjj(fvjl fvjl0, int v, fvdq fvdq0, gfuv gfuv0) {
        this.e = fvjl0;
        this.d = v;
        this.a = null;
        this.b = fvdq0;
        this.c = gfuv0;
    }

    public final gfsx a(ggzx ggzx0) {
        double f;
        boolean z = false;
        gged_interceptors gged0 = gged_interceptors.o(ggzx0.k(0), ggzx0.k(1), ggzx0.k(2), ggzx0.k(3));
        gftb.checkTrue(((boolean)(gged0.isEmpty() ^ 1)));
        if(((ggna)gged0).c == 1) {
            f = 0.0;
        }
        else {
            ggzw ggzw0 = ggzw.c();
            ggqk ggqk0 = gged0.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                ggzw0.e(((ggzv)object0));
            }
            f = ggzw0.n().a(ggzw0.l());
        }
        if((f <= 5000.0)) {
            z = true;
        }
        gftb.checkTrue(z);
        if(!fvjj.b(this.a, gged0, this.d)) {
            gfug gfug0 = gfug.c(this.c);
            this.a = this.e.a(gged0);
            int v = (int)gfug0.a(TimeUnit.MICROSECONDS);
            this.b.X(v);
        }
        fvcl fvcl0 = this.a;
        ggqk ggqk1 = gged0.E();
        while(ggqk1.hasNext()) {
            Object object1 = ggqk1.next();
            if(!fvjj.c(fvcl0, ((ggzv)object1))) {
                return gfqx.a;
            }
        }
        return gfsx.m(this.a);
    }

    public static boolean b(fvcl fvcl0, List list0, int v) {
        if(fvcl0 == null) {
            return false;
        }
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            if(!fvcl0.m(((ggzv)object0), v)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(fvcl fvcl0, ggzv ggzv0) {
        int v = (int)fvcl0.a(ggzv0);
        int v1 = (int)fvcl0.b(ggzv0);
        return fvcl0.k(v, v1) && fvcl0.j(fvcl0.e(v, v1)) != hirl.a;
    }
}

