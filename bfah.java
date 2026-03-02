import android.net.Uri;
import java.io.IOException;
import java.util.List;

public class bfah extends lsb {
    public final beye a;
    public final bfbe b;
    public final bejg c;
    public List d;
    public Uri e;
    public String f;
    public final lqi g;
    public final lqd h;
    public final lqi i;
    public final lqd j;
    public final lqi k;
    public final lqd l;
    public final lqi m;
    public final lqd n;
    public final lqi o;
    public final lqd p;
    public final lqi q;
    public final lqd r;
    public final lqi s;
    public final lqd t;
    public final lqi u;
    public final lqd v;
    private final bewc w;
    private final bfar x;

    public bfah(beye beye0, bfbe bfbe0, bewc bewc0, bfar bfar0, bejg bejg0) {
        ibuq.f(bejg0, "userMetricsRepository");
        super();
        this.a = beye0;
        this.b = bfbe0;
        this.w = bewc0;
        this.x = bfar0;
        this.c = bejg0;
        this.d = ibps.a;
        Boolean boolean0 = Boolean.valueOf(false);
        lqi lqi0 = new lqi(boolean0);
        this.g = lqi0;
        this.h = lqi0;
        lqi lqi1 = new lqi();
        this.i = lqi1;
        this.j = lqi1;
        lqi lqi2 = new lqi(boolean0);
        this.k = lqi2;
        this.l = lqi2;
        lqi lqi3 = new lqi(boolean0);
        this.m = lqi3;
        this.n = lqi3;
        lqi lqi4 = new lqi(boolean0);
        this.o = lqi4;
        this.p = lqi4;
        lqi lqi5 = new lqi();
        this.q = lqi5;
        this.r = lqi5;
        lqi lqi6 = new lqi(boolean0);
        this.s = lqi6;
        this.t = lqi6;
        lqi lqi7 = new lqi(boolean0);
        this.u = lqi7;
        this.v = lqi7;
        bejg0.c(gqsm.Nh);
    }

    public final Object a(Uri uri0, ibrl ibrl0) {
        bewl bewl0;
        bfae bfae0;
        if((ibrl0 instanceof bfae)) {
            bfae0 = (bfae)ibrl0;
            int v = bfae0.c;
            if((v & 0x80000000) == 0) {
                bfae0 = new bfae(this, ibrl0);
            }
            else {
                bfae0.c = v - 0x80000000;
            }
        }
        else {
            bfae0 = new bfae(this, ibrl0);
        }
        Object object0 = bfae0.a;
        Object object1 = ibrx.a;
        switch(bfae0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    bfae0.c = 1;
                    bewb bewb0 = new bewb(this.w, uri0, null);
                    object0 = icbd.a(this.w.a, bewb0, bfae0);
                    if(object0 == object1) {
                        return object1;
                    }
                    bewl0 = (bewl)object0;
                    goto label_25;
                label_19:
                    ibnx.b(object0);
                    bewl0 = (bewl)object0;
                    goto label_25;
                }
                catch(bfal unused_ex) {
                    return new bfab(bezs.a);
                }
                catch(bfba unused_ex) {
                    return new bfab(bezv.a);
                }
                catch(IOException unused_ex) {
                    return new bfab(bezq.a);
                }
            }
            case 1: {
                goto label_19;
                try {
                label_25:
                    bfae0.d = bewl0;
                    bfae0.c = 2;
                    object0 = this.x.a(bewl0.a, bfae0);
                    if(object0 == object1) {
                        return object1;
                    }
                    bewl bewl1 = bewl0;
                    return new bfac(bewl1, ((bewm)object0));
                label_32:
                    bewl1 = bfae0.d;
                    ibnx.b(object0);
                    return new bfac(bewl1, ((bewm)object0));
                }
                catch(beze unused_ex) {
                    break;
                }
            }
            case 2: {
                goto label_32;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return new bfab(bezr.a);
    }

    public final String b() {
        String s = this.f;
        if(s != null) {
            return s;
        }
        ibuq.j("importFileName");
        return null;
    }
}

