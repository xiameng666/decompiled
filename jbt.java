public final class jbt {
    private final jcf a;
    private int b;
    private float c;

    public jbt(jcf jcf0) {
        this.a = jcf0;
        this.b = -1;
    }

    public final float a(int v) {
        return this.e(v, false, false, true);
    }

    public final float b(int v) {
        return this.e(v, true, true, true);
    }

    public final float c(int v) {
        return this.e(v, false, false, false);
    }

    public final float d(int v) {
        return this.e(v, true, true, false);
    }

    private final float e(int v, boolean z, boolean z1, boolean z2) {
        boolean z3;
        int v1 = 1;
        if(z) {
            int v2 = jbv.a(this.a.e, v);
            z3 = v == this.a.m(v2) || v == this.a.j(v2);
        }
        else {
            z3 = false;
        }
        if(!z2) {
            v1 = z3 ? 2 : 3;
        }
        else if(z3) {
            v1 = 0;
        }
        int v3 = v * 4 + v1;
        if(this.b == v3) {
            return this.c;
        }
        float f = z2 ? this.a.e(v, z) : this.a.f(v, z);
        if(z1) {
            this.b = v3;
            this.c = f;
        }
        return f;
    }
}

