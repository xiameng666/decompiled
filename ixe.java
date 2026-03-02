import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils.TruncateAt;
import java.util.ArrayList;
import java.util.List;

public final class ixe {
    public final ixh a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public ixe(ixh ixh0, long v, int v1, int v2) {
        boolean z;
        this.a = ixh0;
        this.b = v1;
        if(jkp.d(v) != 0 || jkp.c(v) != 0) {
            jie.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList0 = new ArrayList();
        List list0 = ixh0.d;
        int v3 = list0.size();
        int v5 = 0;
        float f = 0.0f;
        int v6 = 0;
        while(v6 < v3) {
            ixl ixl0 = (ixl)list0.get(v6);
            iwc iwc0 = new iwc(((jin)ixl0.a), this.b - v5, v2, jkq.k(0, jkp.b(v), (jkp.i(v) ? ibwt.g(jkp.a(v) - ixn.a(f), 0) : jkp.a(v)), 5));
            int v7 = v5 + iwc0.g();
            float f1 = iwc0.b() + f;
            arrayList0.add(new ixk(iwc0, ixl0.b, ixl0.c, v5, v7, f, f1));
            z = true;
            if(!iwc0.j() && (v7 != this.b || v6 == ibpo.d(this.a.d))) {
                ++v6;
                v5 = v7;
                f = f1;
                continue;
            }
            v5 = v7;
            f = f1;
            goto label_28;
        }
        z = false;
    label_28:
        this.e = f;
        this.f = v5;
        this.c = z;
        this.h = arrayList0;
        this.d = (float)jkp.b(v);
        List list1 = new ArrayList(arrayList0.size());
        int v8 = arrayList0.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            ixk ixk0 = (ixk)arrayList0.get(v9);
            List list2 = ixk0.g.d;
            ArrayList arrayList1 = new ArrayList(list2.size());
            int v10 = list2.size();
            for(int v11 = 0; v11 < v10; ++v11) {
                hka hka0 = (hka)list2.get(v11);
                arrayList1.add((hka0 == null ? null : ixk0.h(hka0)));
            }
            ibpo.D(list1, arrayList1);
        }
        if(list1.size() < this.a.b.size()) {
            int v12 = this.a.b.size() - list1.size();
            ArrayList arrayList2 = new ArrayList(v12);
            for(int v4 = 0; v4 < v12; ++v4) {
                arrayList2.add(null);
            }
            list1 = ibpo.ak(list1, arrayList2);
        }
        this.g = list1;
    }

    public final float a(int v) {
        this.k(v);
        int v1 = ixj.b(this.h, v);
        ixk ixk0 = (ixk)this.h.get(v1);
        return ixk0.a(ixk0.g.b.b(ixk0.f(v)));
    }

    public final float b(int v) {
        this.k(v);
        int v1 = ixj.b(this.h, v);
        ixk ixk0 = (ixk)this.h.get(v1);
        return ixk0.a(ixk0.g.b.d(ixk0.f(v)));
    }

    public final int c(int v, boolean z) {
        this.k(v);
        int v1 = ixj.b(this.h, v);
        ixk ixk0 = (ixk)this.h.get(v1);
        iwc iwc0 = ixk0.g;
        int v2 = ixk0.f(v);
        if(z) {
            jcf jcf0 = iwc0.b;
            Layout layout0 = jcf0.e;
            if(jch.c(layout0, v2) && jcf0.b == TextUtils.TruncateAt.END) {
                return ixk0.c(layout0.getLineStart(v2) + layout0.getEllipsisStart(v2));
            }
            jbx jbx0 = jcf0.o();
            return ixk0.c(jbx0.d(jbx0.a.getLineEnd(v2), jbx0.a.getLineStart(v2)));
        }
        return ixk0.c(iwc0.b.j(v2));
    }

    public final int d(int v) {
        int v1;
        if(v >= this.h().b()) {
            v1 = ibpo.d(this.h);
        }
        else {
            v1 = v >= 0 ? ixj.a(this.h, v) : 0;
        }
        ixk ixk0 = (ixk)this.h.get(v1);
        int v2 = ixk0.e(v);
        return ixk0.d(ixk0.g.b.k(v2));
    }

    public final int e(float f) {
        int v = ixj.c(this.h, f);
        ixk ixk0 = (ixk)this.h.get(v);
        return ixk0.b() == 0 ? ixk0.c : ixk0.d(ixk0.g.b.l(((int)(f - ixk0.e))));
    }

    public final int f(long v) {
        ixk ixk0 = (ixk)this.h.get(ixj.c(this.h, Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)))));
        if(ixk0.b() == 0) {
            return ixk0.a;
        }
        long v1 = ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - ixk0.e)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))))) << 0x20;
        int v2 = ixk0.g.b.l(((int)Float.intBitsToFloat(((int)(0xFFFFFFFFL & v1)))));
        return ixk0.c(ixk0.g.b.e.getOffsetForHorizontal(v2, Float.intBitsToFloat(((int)(v1 >> 0x20))) + -ixk0.g.b.a(v2)));
    }

    public final long g(hka hka0, int v, jbb jbb0) {
        List list0 = this.h;
        int v1 = ixj.c(list0, hka0.c);
        float f = ((ixk)list0.get(v1)).f;
        float f1 = hka0.e;
        if(f < f1 && v1 != ibpo.d(list0)) {
            int v2 = ixj.c(list0, f1);
            long v3 = jbk.a;
            long v4 = v3;
            while(jbk.i(v4, v3) && v1 <= v2) {
                ixk ixk0 = (ixk)list0.get(v1);
                hka hka1 = ixk0.i(hka0);
                v4 = ixk.j(ixk0, ixk0.g.h(hka1, v, jbb0));
                ++v1;
            }
            if(!jbk.i(v4, v3)) {
                long v5 = v3;
                while(jbk.i(v5, v3) && v1 <= v2) {
                    ixk ixk1 = (ixk)list0.get(v2);
                    hka hka2 = ixk1.i(hka0);
                    v5 = ixk.j(ixk1, ixk1.g.h(hka2, v, jbb0));
                    --v2;
                }
                return jbk.i(v5, v3) ? v4 : jbl.a(jbk.e(v4), jbk.a(v5));
            }
            return v3;
        }
        ixk ixk2 = (ixk)list0.get(v1);
        hka hka3 = ixk2.i(hka0);
        return ixk.j(ixk2, ixk2.g.h(hka3, v, jbb0));
    }

    public final iwj h() {
        return this.a.a;
    }

    public final void i(int v) {
        if(v >= 0 && v < this.h().b.length()) {
            return;
        }
        jie.a(("offset(" + v + ") is out of bounds [0, " + this.h().b() + ')'));
    }

    public final void j(int v) {
        if(v >= 0 && v <= this.h().b.length()) {
            return;
        }
        jie.a(("offset(" + v + ") is out of bounds [0, " + this.h().b() + ']'));
    }

    public final void k(int v) {
        if(v >= 0 && v < this.f) {
            return;
        }
        jie.a(("lineIndex(" + v + ") is out of bounds [0, " + this.f + ')'));
    }

    public final void l(long v, float[] arr_f) {
        this.i(jbk.d(v));
        this.j(jbk.c(v));
        ibvb ibvb0 = new ibvb();
        ibvb0.a = 0;
        ixc ixc0 = new ixc(v, arr_f, ibvb0, new ibva());
        ixj.d(this.h, v, ixc0);
    }

    public static void m(ixe ixe0, hli hli0, long v, hmt hmt0, jjz jjz0, hpe hpe0) {
        hli0.l();
        List list0 = ixe0.h;
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            iwc iwc0 = ((ixk)list0.get(v2)).g;
            iwc0.m(hli0, v, hmt0, jjz0, hpe0);
            hli0.o(0.0f, iwc0.b());
        }
        hli0.j();
    }

    public static void n(ixe ixe0, hli hli0, hlf hlf0, float f, hmt hmt0, jjz jjz0, hpe hpe0) {
        hli0.l();
        List list0 = ixe0.h;
        int v = 0;
        if(list0.size() <= 1) {
            int v1 = list0.size();
            while(v < v1) {
                iwc iwc0 = ((ixk)list0.get(v)).g;
                iwc0.n(hli0, hlf0, f, hmt0, jjz0, hpe0);
                hli0.o(0.0f, iwc0.b());
                ++v;
            }
        }
        else {
            int v2 = list0.size();
            float f1 = 0.0f;
            float f2 = 0.0f;
            for(int v3 = 0; v3 < v2; ++v3) {
                iwc iwc1 = ((ixk)list0.get(v3)).g;
                f2 += iwc1.b();
                f1 = Math.max(f1, iwc1.f());
            }
            Shader shader0 = ((hms)hlf0).b(((long)Float.floatToRawIntBits(f1)) << 0x20 | ((long)Float.floatToRawIntBits(f2)) & 0xFFFFFFFFL);
            Matrix matrix0 = new Matrix();
            shader0.getLocalMatrix(matrix0);
            int v4 = list0.size();
            while(v < v4) {
                iwc iwc2 = ((ixk)list0.get(v)).g;
                iwc2.n(hli0, new hlg(shader0), f, hmt0, jjz0, hpe0);
                hli0.o(0.0f, iwc2.b());
                matrix0.setTranslate(0.0f, -iwc2.b());
                shader0.setLocalMatrix(matrix0);
                ++v;
            }
        }
        hli0.j();
    }
}

