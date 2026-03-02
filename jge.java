public final class jge {
    public int a;
    public int b;
    public int c;
    public int d;
    private final jha e;

    public jge(iwj iwj0, long v) {
        this.e = new jha(iwj0.b);
        this.a = jbk.d(v);
        this.b = jbk.c(v);
        this.c = -1;
        this.d = -1;
        int v1 = jbk.d(v);
        int v2 = jbk.c(v);
        if(v1 < 0 || v1 > iwj0.b()) {
            throw new IndexOutOfBoundsException("start (" + v1 + ") offset is outside of text region " + iwj0.b());
        }
        if(v2 < 0 || v2 > iwj0.b()) {
            throw new IndexOutOfBoundsException("end (" + v2 + ") offset is outside of text region " + iwj0.b());
        }
        if(v1 <= v2) {
            return;
        }
        throw new IllegalArgumentException(a.z(v2, v1, "Do not set reversed range: ", " > "));
    }

    public final char a(int v) {
        jha jha0 = this.e;
        jgh jgh0 = jha0.b;
        if(jgh0 == null) {
            return jha0.a.charAt(v);
        }
        int v1 = jha0.c;
        if(v < v1) {
            return jha0.a.charAt(v);
        }
        int v2 = jgh0.b();
        if(v < v2 + v1) {
            int v3 = v - v1;
            return v3 >= jgh0.c ? jgh0.b[v3 - jgh0.c + jgh0.d] : jgh0.b[v3];
        }
        return jha0.a.charAt(v - (v2 - jha0.d + v1));
    }

    public final int b() {
        return this.a == this.b ? this.b : -1;
    }

    public final int c() {
        return this.e.a();
    }

    public final long d() {
        return jbl.a(this.a, this.b);
    }

    public final jbk e() {
        return this.k() ? new jbk(jbl.a(this.c, this.d)) : null;
    }

    public final void f() {
        this.c = -1;
        this.d = -1;
    }

    public final void g(int v, int v1) {
        long v2 = jbl.a(v, v1);
        this.e.b(v, v1, "");
        long v3 = jgf.a(jbl.a(this.a, this.b), v2);
        this.m(jbk.d(v3));
        this.l(jbk.c(v3));
        if(this.k()) {
            long v4 = jgf.a(jbl.a(this.c, this.d), v2);
            if(jbk.j(v4)) {
                this.f();
                return;
            }
            this.c = jbk.d(v4);
            this.d = jbk.c(v4);
        }
    }

    public final void h(int v, int v1, String s) {
        if(v >= 0) {
            jha jha0 = this.e;
            if(v <= jha0.a()) {
                if(v1 < 0 || v1 > jha0.a()) {
                    throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + jha0.a());
                }
                if(v > v1) {
                    throw new IllegalArgumentException(a.z(v1, v, "Do not set reversed range: ", " > "));
                }
                jha0.b(v, v1, s);
                this.m(s.length() + v);
                this.l(v + s.length());
                this.c = -1;
                this.d = -1;
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.e.a());
    }

    public final void i(int v, int v1) {
        if(v >= 0) {
            jha jha0 = this.e;
            if(v <= jha0.a()) {
                if(v1 < 0 || v1 > jha0.a()) {
                    throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + jha0.a());
                }
                if(v >= v1) {
                    throw new IllegalArgumentException(a.z(v1, v, "Do not set reversed or empty range: ", " > "));
                }
                this.c = v;
                this.d = v1;
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.e.a());
    }

    public final void j(int v, int v1) {
        if(v >= 0) {
            jha jha0 = this.e;
            if(v <= jha0.a()) {
                if(v1 < 0 || v1 > jha0.a()) {
                    throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + jha0.a());
                }
                if(v > v1) {
                    throw new IllegalArgumentException(a.z(v1, v, "Do not set reversed range: ", " > "));
                }
                this.m(v);
                this.l(v1);
                return;
            }
        }
        throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.e.a());
    }

    public final boolean k() {
        return this.c != -1;
    }

    private final void l(int v) {
        if(v < 0) {
            jie.a(a.h(v, "Cannot set selectionEnd to a negative value: "));
        }
        this.b = v;
    }

    private final void m(int v) {
        if(v < 0) {
            jie.a(("Cannot set selectionStart to a negative value: " + v));
        }
        this.a = v;
    }

    @Override
    public final String toString() {
        return this.e.toString();
    }
}

