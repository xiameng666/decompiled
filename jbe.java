import android.graphics.RectF;
import java.util.List;

public final class jbe {
    public final jbd a;
    public final ixe b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public jbe(jbd jbd0, ixe ixe0, long v) {
        this.a = jbd0;
        this.b = ixe0;
        this.c = v;
        float f = 0.0f;
        this.d = ixe0.h.isEmpty() ? 0.0f : ((ixk)ixe0.h.get(0)).g.a();
        if(!ixe0.h.isEmpty()) {
            ixk ixk0 = (ixk)ibpo.W(ixe0.h);
            f = ixk0.a(ixk0.g.d());
        }
        this.e = f;
        this.f = ixe0.g;
    }

    public final float a(int v) {
        return this.b.a(v);
    }

    public final float b(int v) {
        this.b.k(v);
        int v1 = ixj.b(this.b.h, v);
        ixk ixk0 = (ixk)this.b.h.get(v1);
        int v2 = ixk0.f(v);
        jcf jcf0 = ixk0.g.b;
        float f = jcf0.e.getLineLeft(v2);
        return v2 == jcf0.f - 1 ? f + jcf0.h : f + 0.0f;
    }

    public final float c(int v) {
        this.b.k(v);
        int v1 = ixj.b(this.b.h, v);
        ixk ixk0 = (ixk)this.b.h.get(v1);
        int v2 = ixk0.f(v);
        jcf jcf0 = ixk0.g.b;
        float f = jcf0.e.getLineRight(v2);
        return v2 == jcf0.f - 1 ? f + jcf0.i : f + 0.0f;
    }

    public final float d(int v) {
        return this.b.b(v);
    }

    public final int e() {
        return this.b.f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jbe)) {
            return false;
        }
        if(!ibuq.m(this.a, ((jbe)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((jbe)object0).b)) {
            return false;
        }
        if(!jlk.c(this.c, ((jbe)object0).c)) {
            return false;
        }
        return this.d != ((jbe)object0).d || this.e != ((jbe)object0).e ? false : ibuq.m(this.f, ((jbe)object0).f);
    }

    public final int f(int v, boolean z) {
        return this.b.c(v, z);
    }

    public final int g(int v) {
        return this.b.d(v);
    }

    public final int h(float f) {
        return this.b.e(f);
    }

    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + jlj.a(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + this.f.hashCode();
    }

    public final int i(int v) {
        this.b.k(v);
        int v1 = ixj.b(this.b.h, v);
        ixk ixk0 = (ixk)this.b.h.get(v1);
        return ixk0.c(ixk0.g.b.m(ixk0.f(v)));
    }

    public final int j(long v) {
        return this.b.f(v);
    }

    public final long k(int v) {
        int v3;
        int v2;
        this.b.j(v);
        ixk ixk0 = (ixk)this.b.h.get((v == this.b.h().b() ? ibpo.d(this.b.h) : ixj.a(this.b.h, v)));
        int v1 = ixk0.e(v);
        jcn jcn0 = ixk0.g.b.p();
        if(jcn0.h(jcn0.b(v1))) {
            jcn0.c(v1);
            v2 = v1;
            while(v2 != -1) {
                if(jcn0.h(v2) && !jcn0.e(v2)) {
                    goto label_21;
                }
                v2 = jcn0.b(v2);
            }
            v2 = -1;
        }
        else {
            jcn0.c(v1);
            if(!jcn0.g(v1)) {
                v2 = jcn0.d(v1) ? jcn0.b(v1) : -1;
            }
            else if(jcn0.f(v1) && !jcn0.d(v1)) {
                v2 = v1;
            }
            else {
                v2 = jcn0.b(v1);
            }
        }
    label_21:
        if(v2 == -1) {
            v2 = v1;
        }
        if(jcn0.e(jcn0.a(v1))) {
            jcn0.c(v1);
            v3 = v1;
            while(v3 != -1) {
                if(!jcn0.h(v3) && jcn0.e(v3)) {
                    goto label_40;
                }
                v3 = jcn0.a(v3);
            }
            v3 = -1;
        }
        else {
            jcn0.c(v1);
            if(!jcn0.d(v1)) {
                v3 = jcn0.g(v1) ? jcn0.a(v1) : -1;
            }
            else if(jcn0.f(v1) && !jcn0.g(v1)) {
                v3 = v1;
            }
            else {
                v3 = jcn0.a(v1);
            }
        }
    label_40:
        if(v3 != -1) {
            v1 = v3;
        }
        return ixk0.g(jbl.a(v2, v1), false);
    }

    public final hka l(int v) {
        float f3;
        float f2;
        this.b.i(v);
        int v1 = ixj.a(this.b.h, v);
        ixk ixk0 = (ixk)this.b.h.get(v1);
        iwc iwc0 = ixk0.g;
        int v2 = ixk0.e(v);
        if(v2 < 0 || v2 >= iwc0.c.length()) {
            jie.a(("offset(" + v2 + ") is out of bounds [0," + iwc0.c.length() + ')'));
        }
        jcf jcf0 = iwc0.b;
        int v3 = jcf0.k(v2);
        float f = jcf0.d(v3);
        float f1 = jcf0.b(v3);
        boolean z = jcf0.n(v3) == 1;
        boolean z1 = jcf0.e.isRtlCharAt(v2);
        if(z && !z1) {
            f2 = jcf0.e(v2, false);
            f3 = jcf0.e(v2 + 1, true);
        }
        else if(z) {
            f3 = jcf0.f(v2, false);
            f2 = jcf0.f(v2 + 1, true);
        }
        else if(z1) {
            f3 = jcf0.e(v2, false);
            f2 = jcf0.e(v2 + 1, true);
        }
        else {
            f2 = jcf0.f(v2, false);
            f3 = jcf0.f(v2 + 1, true);
        }
        RectF rectF0 = new RectF(f2, f, f3, f1);
        return ixk0.h(new hka(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom));
    }

    public final hka m(int v) {
        this.b.j(v);
        ixk ixk0 = (ixk)this.b.h.get((v == this.b.h().b() ? ibpo.d(this.b.h) : ixj.a(this.b.h, v)));
        iwc iwc0 = ixk0.g;
        int v1 = ixk0.e(v);
        if(v1 < 0 || v1 > iwc0.c.length()) {
            jie.a(("offset(" + v1 + ") is out of bounds [0," + iwc0.c.length() + ']'));
        }
        float f = jcf.s(iwc0.b, v1);
        int v2 = iwc0.b.k(v1);
        return ixk0.h(new hka(f, iwc0.b.d(v2), f, iwc0.b.b(v2)));
    }

    public final jbe n(jbd jbd0, long v) {
        return new jbe(jbd0, this.b, v);
    }

    public final boolean o() {
        return ((float)(((int)(this.c >> 0x20)))) < this.b.d || this.b.c || ((float)(((int)(this.c & 0xFFFFFFFFL)))) < this.b.e;
    }

    public static int p(jbe jbe0, int v) {
        return jbe0.f(v, false);
    }

    public final int q(int v) {
        this.b.j(v);
        ixk ixk0 = (ixk)this.b.h.get((v == this.b.h().b() ? ibpo.d(this.b.h) : ixj.a(this.b.h, v)));
        int v1 = ixk0.e(v);
        return ixk0.g.l(v1);
    }

    public final int r(int v) {
        this.b.j(v);
        ixk ixk0 = (ixk)this.b.h.get((v == this.b.h().b() ? ibpo.d(this.b.h) : ixj.a(this.b.h, v)));
        int v1 = ixk0.e(v);
        int v2 = ixk0.g.b.k(v1);
        return ixk0.g.b.n(v2) == 1 ? 1 : 2;
    }

    public final hks s(int v, int v1) {
        ixe ixe0 = this.b;
        if(v < 0 || v > v1 || v1 > ixe0.h().b.length()) {
            jie.a(("Start(" + v + ") or End(" + v1 + ") is out of range [0.." + ixe0.h().b.length() + "), or start > end!"));
        }
        if(v == v1) {
            return new hks(null);
        }
        hks hks0 = new hks(null);
        long v2 = jbl.a(v, v1);
        ixd ixd0 = new ixd(hks0, v, v1);
        ixj.d(ixe0.h, v2, ixd0);
        return hks0;
    }

    @Override
    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + jlk.a(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}

