import java.util.ArrayList;
import java.util.Objects;

public class jrb {
    jri a;
    public float b;
    final ArrayList c;
    boolean d;
    public jra e;

    public jrb() {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
    }

    public jrb(jrc jrc0) {
        this.a = null;
        this.b = 0.0f;
        this.c = new ArrayList();
        this.d = false;
        this.e = new jra(this, jrc0);
    }

    public final jri a(boolean[] arr_z, jri jri0) {
        int v = this.e.a;
        jri jri1 = null;
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f1 = this.e.b(v1);
            if((f1 < 0.0f)) {
                jri jri2 = this.e.d(v1);
                if((arr_z == null || !arr_z[jri2.c]) && jri2 != jri0 && (jri2.n == 3 || jri2.n == 4) && (f1 < f)) {
                    f = f1;
                    jri1 = jri2;
                }
            }
        }
        return jri1;
    }

    final void b(jri jri0) {
        jri jri1 = this.a;
        if(jri1 != null) {
            this.e.g(jri1, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(jri0, true);
        this.a = jri0;
        if(f == 1.0f) {
            return;
        }
        this.b /= f;
        jra jra0 = this.e;
        int v = jra0.f;
        for(int v1 = 0; v != -1 && v1 < jra0.a; ++v1) {
            jra0.e[v] /= f;
            v = jra0.d[v];
        }
    }

    public final void c(jrd jrd0, jri jri0, boolean z) {
        if(jri0 != null && jri0.g) {
            float f = jri0.f * this.e.a(jri0);
            this.b += f;
            this.e.c(jri0, z);
            if(z) {
                jri0.b(this);
            }
            if(this.e.a == 0) {
                this.d = true;
                jrd0.c = true;
            }
        }
    }

    public void d(jrd jrd0, jrb jrb0, boolean z) {
        jra jra0 = this.e;
        float f = jra0.a(jrb0.a);
        jra0.c(jrb0.a, z);
        jra jra1 = jrb0.e;
        int v = jra1.a;
        for(int v1 = 0; v1 < v; ++v1) {
            jri jri0 = jra1.d(v1);
            jra0.e(jri0, jra1.a(jri0) * f, z);
        }
        this.b += jrb0.b * f;
        if(z) {
            jrb0.a.b(this);
        }
        if(this.a != null && this.e.a == 0) {
            this.d = true;
            jrd0.c = true;
        }
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(jrd jrd0, int v) {
        this.e.g(jrd0.p(v), 1.0f);
        this.e.g(jrd0.p(v), -1.0f);
    }

    public final void g(jri jri0, jri jri1, jri jri2, jri jri3, float f) {
        this.e.g(jri0, -1.0f);
        this.e.g(jri1, 1.0f);
        this.e.g(jri2, f);
        this.e.g(jri3, -f);
    }

    public final void h(jri jri0, jri jri1, jri jri2, int v) {
        boolean z;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            else {
                z = false;
            }
            this.b = (float)v;
            if(z) {
                this.e.g(jri0, 1.0f);
                this.e.g(jri1, -1.0f);
                this.e.g(jri2, -1.0f);
                return;
            }
        }
        this.e.g(jri0, -1.0f);
        this.e.g(jri1, 1.0f);
        this.e.g(jri2, 1.0f);
    }

    public final void i(jri jri0, jri jri1, jri jri2, int v) {
        boolean z;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            else {
                z = false;
            }
            this.b = (float)v;
            if(z) {
                this.e.g(jri0, 1.0f);
                this.e.g(jri1, -1.0f);
                this.e.g(jri2, 1.0f);
                return;
            }
        }
        this.e.g(jri0, -1.0f);
        this.e.g(jri1, 1.0f);
        this.e.g(jri2, -1.0f);
    }

    public final void j(jri jri0, jri jri1, jri jri2, jri jri3, float f) {
        this.e.g(jri2, 0.5f);
        this.e.g(jri3, 0.5f);
        this.e.g(jri0, -0.5f);
        this.e.g(jri1, -0.5f);
        this.b = -f;
    }

    public jri k(boolean[] arr_z) {
        return this.a(arr_z, null);
    }

    public static final boolean l(jri jri0) {
        return jri0.l <= 1;
    }

    @Override
    public String toString() {
        String s3;
        boolean z;
        String s;
        if(this.a == null) {
            s = "0";
        }
        else {
            jri jri0 = this.a;
            Objects.toString(jri0);
            s = "" + jri0;
        }
        String s1 = s + " = ";
        if(Float.compare(this.b, 0.0f) == 0) {
            z = false;
        }
        else {
            s1 = s1 + this.b;
            z = true;
        }
        int v1 = this.e.a;
        for(int v = 0; v < v1; ++v) {
            jri jri1 = this.e.d(v);
            if(jri1 != null) {
                float f = this.e.b(v);
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    String s2 = jri1.toString();
                    if(z) {
                        if(v2 > 0) {
                            s3 = " + ";
                        }
                        else {
                            f = -f;
                            s3 = " - ";
                        }
                        s1 = s1 + s3;
                    }
                    else if((f < 0.0f)) {
                        f = -f;
                        s1 = s1 + "- ";
                    }
                    s1 = f == 1.0f ? s1 + s2 : s1 + f + " " + s2;
                    z = true;
                }
            }
        }
        return z ? s1 : s1 + "0.0";
    }
}

