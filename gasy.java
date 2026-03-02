import android.util.Pair;
import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class gasy {
    public final byi a;
    public final bzt b;
    public final gatc c;
    private final List d;
    private final gatj e;

    public gasy(gatj gatj0, gatc gatc0) {
        this.a = new byi();
        this.b = new bzt();
        this.d = new ArrayList(1);
        this.e = gatj0;
        this.c = gatc0;
    }

    public final View a() {
        return this.c.a();
    }

    public final gass b(gast gast0, hdrl hdrl0) {
        gass gass0;
        gatj gatj0 = this.e;
        switch(hdrl0.g) {
            case 1001: {
                gass0 = new gbxd(gast0);
                break;
            }
            case 1002: {
                gass0 = new gbxb(gast0);
                break;
            }
            case 1005: {
                gass0 = new gbpr(gast0);
                break;
            }
            case 0x3F0: {
                gass0 = new gceq(gast0);
                break;
            }
            case 0x3B47D60: {
                gass0 = new gcek(gast0);
                break;
            }
            case 0x3BDFEB7: {
                gass0 = new gceb(gast0);
                break;
            }
            case 0x3D826BD: {
                gass0 = new gcdc(gast0);
                break;
            }
            case 65148490: {
                gass0 = new gccf(gast0);
                break;
            }
            case 0xCBC79CE: {
                gass0 = new gcac(gast0);
                break;
            }
            case 0xCBCFFCE: {
                gass0 = new gcfn(gast0);
                break;
            }
            case 0xCC5F491: {
                gass0 = new gbxm(gast0, gatj0.j.a);
                break;
            }
            case 0xD290F60: {
                gass0 = new gcbm(gast0);
                break;
            }
            case 228971050: {
                gass0 = new gcfk(gast0);
                break;
            }
            case 228971051: {
                gass0 = new gbpp(gast0);
                break;
            }
            case 0xDA6009B: {
                gass0 = new gceo(gast0);
                break;
            }
            case 0xDA6009D: {
                gass0 = new gcew(gast0);
                break;
            }
            case 0xDAFA0A6: {
                gass0 = new gcdn(gast0);
                break;
            }
            case 0xDAFA0A8: {
                gass0 = new gbpw(gast0);
                break;
            }
            case 231420908: {
                gass0 = new gcdh(gast0);
                break;
            }
            case 232057537: {
                gass0 = new gbph(gast0);
                break;
            }
            case 232060281: {
                gass0 = new gccr(gast0);
                break;
            }
            case 0xF005D92: {
                gass0 = new gcer(gast0);
                break;
            }
            case 0xF2DEBB0: {
                gass0 = new gbwm(gast0);
                break;
            }
            case 0xF3A4A5C: {
                gass0 = new gcem(gast0);
                break;
            }
            case 0xF8297C5: {
                gass0 = new gbpv(gast0);
                break;
            }
            case 0xF8297C7: {
                gass0 = new gcfh(gast0);
                break;
            }
            case 0xF9288CE: {
                gass0 = new gbyf(gast0);
                break;
            }
            case 0xFC2F347: {
                gass0 = new gbqo(gast0);
                break;
            }
            case 0xFD65FDB: {
                gass0 = new gcah(gast0);
                break;
            }
            case 0x103EF528: {
                gass0 = new gcfd(gast0);
                break;
            }
            case 296254005: {
                gass0 = new gcfa(gast0);
                break;
            }
            case 296254006: {
                gass0 = new gcec(gast0);
                break;
            }
            case 296254007: {
                gass0 = new gcez(gast0);
                break;
            }
            case 301214406: {
                gass0 = new gcaa(gast0);
                break;
            }
            case 0x1215BF65: {
                gass0 = new gbpy(gast0);
                break;
            }
            case 306931272: {
                gass0 = new gcej(gast0);
                break;
            }
            case 0x128D0247: {
                gass0 = new gbsn(gast0);
                break;
            }
            case 0x12F97C55: {
                gass0 = new gbrf(gast0);
                break;
            }
            case 0x130113FD: {
                gass0 = new gccu(gast0);
                break;
            }
            case 0x143308AC: {
                gass0 = new gbpe(gast0);
                break;
            }
            case 0x144F9EAD: {
                gass0 = new gbpk(gast0);
                break;
            }
            case 0x1498557F: {
                gass0 = new gcet(gast0);
                break;
            }
            case 0x14A146D2: {
                gass0 = new gcbx(gast0);
                break;
            }
            case 346198508: {
                gass0 = new gbyp(gast0);
                break;
            }
            case 350044330: {
                gass0 = new gceu(gast0);
                break;
            }
            case 358920566: {
                gass0 = new gbwa(gast0);
                break;
            }
            case 0x176EF6B9: {
                gass0 = new gbqu(gast0);
                break;
            }
            case 0x17728F07: {
                gass0 = new gbqs(gast0);
                break;
            }
            case 0x177C8A70: {
                gass0 = new gbqr(gast0);
                break;
            }
            case 394075062: {
                gass0 = new gbqv(gast0);
                break;
            }
            case 0x196FD575: {
                gass0 = new gbrs(gast0);
                break;
            }
            case 0x1A460BC4: {
                gass0 = new gbqd(gast0);
                break;
            }
            case 0x1A460BC5: {
                gass0 = new gbqh(gast0);
                break;
            }
            default: {
                gass0 = null;
            }
        }
        gavr.b(gass0, "BE_PM_03", gatj0.g, gavs.a, String.format("Unable to create node presenter from node ui reference: %s", ((long)hdrl0.c)));
        gass0.U();
        return gass0;
    }

    public final gass c(gast gast0, hdrl hdrl0) {
        bzt bzt0 = this.b;
        int v = hdrl0.g;
        gass gass0 = null;
        if(bzt0.i(v)) {
            ArrayDeque arrayDeque0 = (ArrayDeque)bzu.a(bzt0, v);
            if(arrayDeque0 != null && !arrayDeque0.isEmpty()) {
                gass gass1 = (gass)arrayDeque0.peek();
                gavs.g(gass1, "BE_PM_02", this.e.g);
                int v1 = gass1.b.g;
                if(v1 == 0xF8297C7) {
                label_12:
                    gass0 = (gass)arrayDeque0.pop();
                    long v2 = gass0.no();
                    this.a.i(v2);
                }
                else {
                    gaxl.a();
                    if(v1 == 0xF8297C5) {
                        goto label_12;
                    }
                }
            }
        }
        return gass0 == null ? this.b(gast0, hdrl0) : gass0;
    }

    public final void d(long v) {
        for(int v1 = 0; true; ++v1) {
            List list0 = this.d;
            if(v1 >= list0.size()) {
                break;
            }
            if(((long)(((Long)((Pair)list0.get(v1)).first))) == v) {
                list0.remove(v1);
                break;
            }
        }
        this.h();
    }

    public final void e(gass gass0) {
        long v = gass0.no();
        this.a.i(v);
    }

    public final void f(long v, hcpi hcpi0) {
        for(int v1 = 0; true; ++v1) {
            List list0 = this.d;
            if(v1 >= list0.size()) {
                list0.add(Pair.create(Long.valueOf(v), hcpi0));
                break;
            }
            Pair pair0 = (Pair)list0.get(v1);
            if(((long)(((Long)pair0.first))) == v) {
                if(pair0.second == hcpi0) {
                    break;
                }
                list0.set(v1, Pair.create(Long.valueOf(v), hcpi0));
                break;
            }
        }
        this.h();
    }

    public final void g(hdrl hdrl0, gass gass0) {
        this.a.h(hdrl0.c, gass0);
        gass0.as(hdrl0);
    }

    private final void h() {
        hcpi hcpi0 = hcpi.b;
        List list0 = this.d;
        int v = -1;
        for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
            hcpi hcpi1 = (hcpi)((Pair)list0.get(v1)).second;
            if(hcpi1 != hcpi.e && hcpi1 != hcpi.a) {
                hcpi0 = hcpi1;
                break;
            }
        }
        switch(hcpi0.ordinal()) {
            case 2: {
                v = 1;
                break;
            }
            case 3: {
                v = 0;
            }
        }
        xob xob0 = this.e.b;
        if(xob0.getRequestedOrientation() != v) {
            xob0.setRequestedOrientation(v);
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PresenterManager: [");
        byi byi0 = this.a;
        int v = byi0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(byi0.f(v1));
            stringBuilder0.append(",");
        }
        stringBuilder0.append(" ] ");
        return stringBuilder0.toString();
    }
}

