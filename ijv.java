import android.graphics.Rect;

public final class ijv extends ijs {
    public static ijv b;
    public jbe c;
    public iug d;

    public ijv() {
        new Rect();
    }

    @Override  // ijx
    public final int[] c(int v) {
        jbe jbe0;
        int v2;
        int v1;
        if(this.a().length() > 0 && v < this.a().length()) {
            try {
                iug iug0 = this.d;
                if(iug0 == null) {
                    ibuq.j("node");
                    iug0 = null;
                }
                hka hka0 = iug0.b();
                v1 = Math.round(hka0.e - hka0.c);
                v2 = ibwt.g(0, v);
                jbe0 = this.c;
                if(jbe0 == null) {
                    goto label_10;
                }
                goto label_12;
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
        label_10:
            ibuq.j("layoutResult");
            jbe0 = null;
        label_12:
            int v3 = jbe0.g(v2);
            jbe jbe1 = this.c;
            if(jbe1 == null) {
                ibuq.j("layoutResult");
                jbe1 = null;
            }
            float f = jbe1.d(v3) + ((float)v1);
            jbe jbe2 = this.c;
            if(jbe2 == null) {
                ibuq.j("layoutResult");
                jbe2 = null;
            }
            jbe jbe3 = this.c;
            if(jbe3 == null) {
                ibuq.j("layoutResult");
                jbe3 = null;
            }
            if((f < jbe2.d(jbe3.e() - 1))) {
                jbe jbe4 = this.c;
                if(jbe4 == null) {
                    ibuq.j("layoutResult");
                    return this.b(v2, this.e(null.h(f) - 1, 1) + 1);
                }
                return this.b(v2, this.e(jbe4.h(f) - 1, 1) + 1);
            }
            jbe jbe5 = this.c;
            if(jbe5 == null) {
                ibuq.j("layoutResult");
                return this.b(v2, this.e(null.e() - 1, 1) + 1);
            }
            return this.b(v2, this.e(jbe5.e() - 1, 1) + 1);
        }
        return null;
    }

    @Override  // ijx
    public final int[] d(int v) {
        int v4;
        int v1;
        jbe jbe0 = null;
        if(this.a().length() > 0 && v > 0) {
            try {
                iug iug0 = this.d;
                if(iug0 == null) {
                    ibuq.j("node");
                    iug0 = null;
                }
                hka hka0 = iug0.b();
                v1 = Math.round(hka0.e - hka0.c);
            }
            catch(IllegalStateException unused_ex) {
                return null;
            }
            int v2 = ibwt.h(this.a().length(), v);
            jbe jbe1 = this.c;
            if(jbe1 == null) {
                ibuq.j("layoutResult");
                jbe1 = null;
            }
            int v3 = jbe1.g(v2);
            jbe jbe2 = this.c;
            if(jbe2 == null) {
                ibuq.j("layoutResult");
                jbe2 = null;
            }
            float f = jbe2.d(v3) - ((float)v1);
            if((f > 0.0f)) {
                jbe jbe3 = this.c;
                if(jbe3 == null) {
                    ibuq.j("layoutResult");
                }
                else {
                    jbe0 = jbe3;
                }
                v4 = jbe0.h(f);
            }
            else {
                v4 = 0;
            }
            if(v2 == this.a().length() && v4 < v3) {
                ++v4;
            }
            return this.b(this.e(v4, 2), v2);
        }
        return null;
    }

    private final int e(int v, int v1) {
        jbe jbe0 = this.c;
        if(jbe0 == null) {
            ibuq.j("layoutResult");
            jbe0 = null;
        }
        int v2 = jbe0.i(v);
        jbe jbe1 = this.c;
        if(jbe1 == null) {
            ibuq.j("layoutResult");
            jbe1 = null;
        }
        if(v1 != jbe1.r(v2)) {
            jbe jbe2 = this.c;
            if(jbe2 == null) {
                ibuq.j("layoutResult");
                return null.i(v);
            }
            return jbe2.i(v);
        }
        jbe jbe3 = this.c;
        if(jbe3 == null) {
            ibuq.j("layoutResult");
            return jbe.p(null, v) - 1;
        }
        return jbe.p(jbe3, v) - 1;
    }
}

