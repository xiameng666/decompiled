import com.google.android.chimera.android.Activity;
import java.util.List;

final class deub implements ibtx {
    final devp a;
    final ibth b;
    final boolean c;
    final ibth d;
    final deco e;
    final ibth f;
    final gui g;
    final Activity h;
    final ibts i;
    final ibts j;
    final icck k;
    final ibts l;
    final ibth m;
    final ibth n;
    final ibth o;
    final ibth p;
    final ibth q;
    final ibth r;
    final ibth s;
    final ibth t;
    final ibth u;
    final fzp v;
    final gra w;
    final gra x;
    final gei y;

    public deub(devp devp0, ibth ibth0, boolean z, ibth ibth1, deco deco0, ibth ibth2, gei gei0, gui gui0, Activity activity0, ibts ibts0, ibts ibts1, icck icck0, ibts ibts2, ibth ibth3, ibth ibth4, ibth ibth5, ibth ibth6, ibth ibth7, ibth ibth8, ibth ibth9, ibth ibth10, ibth ibth11, fzp fzp0, gra gra0, gra gra1) {
        this.a = devp0;
        this.b = ibth0;
        this.c = z;
        this.d = ibth1;
        this.e = deco0;
        this.f = ibth2;
        this.y = gei0;
        this.g = gui0;
        this.h = activity0;
        this.i = ibts0;
        this.j = ibts1;
        this.k = icck0;
        this.l = ibts2;
        this.m = ibth3;
        this.n = ibth4;
        this.o = ibth5;
        this.p = ibth6;
        this.q = ibth7;
        this.r = ibth8;
        this.s = ibth9;
        this.t = ibth10;
        this.u = ibth11;
        this.v = fzp0;
        this.w = gra0;
        this.x = gra1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dfhr dfhr1;
        ibth ibth2;
        goz goz1;
        devp devp1;
        goz goz0;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$ScrollableScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        devp devp0 = this.a;
        deco deco0 = deco.a;
        gra gra0 = this.w;
        boolean z = devo.k(gra0);
        devo.w(devp0.c == deco0, devp0.a, this.b, z, this.c, ((goz)object1), 0);
        dfhr dfhr0 = devp0.a;
        ibth ibth0 = this.b;
        ((goz)object1).M(0xD87A1F23);
        if(ibuq.m(devq.a(dfhr0.c), Boolean.valueOf(false))) {
            ddhe.b(dla.j(hfc.e, 16.0f, 20.0f, 16.0f, 0.0f, 8), this.d, ((goz)object1), 0, 0);
        }
        ((goz)object1).A();
        ((goz)object1).M(0xD87A40BF);
        if(this.e == deco0) {
            List list0 = devp0.f;
            ibth ibth1 = this.f;
            gei gei0 = this.y;
            ddxv.b(((goz)object1));
            hfc hfc0 = dla.j(hfc.e, 0.0f, 20.0f, 0.0f, 0.0f, 13);
            ((goz)object1).M(-1633490746);
            gui gui0 = this.g;
            int v1 = ((goz)object1).X(gui0);
            Activity activity0 = this.h;
            int v2 = v1 | ((goz)object1).Z(activity0);
            Object object3 = ((goz)object1).k();
            if(v2 != 0 || object3 == gop.a) {
                object3 = new detu(activity0, gui0);
                ((goz)object1).R(object3);
            }
            boolean z1 = false;
            ((goz)object1).A();
            List list1 = ibpo.ak(devp0.d.a, devp0.d.b);
            if(!list1.isEmpty()) {
                for(Object object4: list1) {
                    if(devq.c(((dffg)object4).h)) {
                        z1 = true;
                        break;
                    }
                }
            }
            devo.G(list0, ibth1, gei0, hfc0, ((ibth)object3), z1, ((goz)object1), 0);
        }
        goz0 = (goz)object1;
        goz0.A();
        if(devo.o(devp0)) {
            goz0.M(0x36DA8F97);
            List list2 = devp0.f;
            boolean z2 = devo.k(gra0);
            ibts ibts0 = this.i;
            ibts ibts1 = this.j;
            goz0.M(-1633490746);
            icck icck0 = this.k;
            int v3 = goz0.Z(icck0);
            gei gei1 = this.y;
            int v4 = v3 | goz0.Z(gei1);
            Object object5 = goz0.k();
            if(v4 != 0 || object5 == gop.a) {
                object5 = new detv(icck0, gei1);
                goz0.R(object5);
            }
            goz0.A();
            devp1 = devp0;
            devo.K(devp1, list2, z2, ibts0, ibts1, ((ibth)object5), this.l, goz0);
            goz1 = goz0;
            goz1.A();
            ibth2 = ibth0;
            dfhr1 = dfhr0;
        }
        else {
            devp1 = devp0;
            goz1 = goz0;
            goz1.M(0x36E08866);
            ibts ibts2 = this.i;
            ibth ibth3 = this.m;
            ibth ibth4 = this.n;
            ibth ibth5 = this.o;
            ibth ibth6 = this.p;
            ibth ibth7 = this.q;
            goz1.M(5004770);
            gra gra1 = this.x;
            Object object6 = goz1.k();
            if(object6 == gop.a) {
                object6 = new detw(gra1);
                goz1.R(object6);
            }
            goz1.A();
            ibth2 = ibth0;
            dfhr1 = dfhr0;
            devo.N(devp1, ibts2, ibth3, ibth4, ibth5, ibth6, ibth7, ((ibts)object6), this.r, this.s, this.t, this.u, goz1);
            goz1.A();
        }
        Boolean boolean0 = (Boolean)devq.a(dfhr1.d);
        ibts ibts3 = this.i;
        devo.r((boolean0 == null ? false : boolean0.booleanValue()), devp1, ibts3, goz1, 0);
        gra gra2 = this.x;
        cusz cusz0 = devo.a(gra2);
        if(cusz0 == null) {
            goz1.M(0xD87B82F6);
            goz1.A();
        }
        else {
            switch(cusz0.ordinal()) {
                case 1: {
                    goz1.M(0xD87B7039);
                    fzp fzp0 = this.v;
                    goz1.M(5004770);
                    Object object7 = goz1.k();
                    if(object7 == gop.a) {
                        object7 = new dety(gra2);
                        goz1.R(object7);
                    }
                    goz1.A();
                    devo.L(fzp0, ibts3, ((ibth)object7), goz1);
                    goz1.A();
                    break;
                }
                case 2: {
                    goz1.M(-663005068);
                    fzp fzp1 = this.v;
                    goz1.M(5004770);
                    Object object8 = goz1.k();
                    if(object8 == gop.a) {
                        object8 = new detx(gra2);
                        goz1.R(object8);
                    }
                    goz1.A();
                    devo.Q(fzp1, ibts3, ((ibth)object8), goz1);
                    goz1.A();
                    break;
                }
                default: {
                    goz1.M(0xD87B82F6);
                    goz1.A();
                }
            }
        }
        fzp fzp2 = this.v;
        goz1.M(5004770);
        boolean z3 = goz1.X(ibts3);
        Object object9 = goz1.k();
        if(z3 || object9 == gop.a) {
            object9 = new detz(ibts3);
            goz1.R(object9);
        }
        goz1.A();
        devo.M(fzp2, devp1, ((ibth)object9), ibth2, goz1);
        return ibom.a;
    }
}

