import java.util.Arrays;

public final class jri implements Comparable {
    public static int a = 1;
    public boolean b;
    public int c;
    int d;
    public int e;
    public float f;
    public boolean g;
    final float[] h;
    final float[] i;
    jrb[] j;
    int k;
    public int l;
    boolean m;
    int n;

    static {
    }

    public jri(int v) {
        this.c = -1;
        this.d = -1;
        this.e = 0;
        this.g = false;
        this.h = new float[9];
        this.i = new float[9];
        this.j = new jrb[16];
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = v;
    }

    public final void a(jrb jrb0) {
        for(int v = 0; true; ++v) {
            int v1 = this.k;
            if(v >= v1) {
                break;
            }
            if(this.j[v] == jrb0) {
                return;
            }
        }
        jrb[] arr_jrb = this.j;
        if(v1 >= arr_jrb.length) {
            this.j = (jrb[])Arrays.copyOf(arr_jrb, arr_jrb.length + arr_jrb.length);
        }
        int v2 = this.k;
        this.j[v2] = jrb0;
        this.k = v2 + 1;
    }

    public final void b(jrb jrb0) {
        int v = this.k;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.j[v1] == jrb0) {
                while(v1 < v - 1) {
                    this.j[v1] = this.j[v1 + 1];
                    ++v1;
                }
                --this.k;
                return;
            }
        }
    }

    public final void c() {
        this.n = 5;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.m = false;
        int v = this.k;
        for(int v1 = 0; v1 < v; ++v1) {
            this.j[v1] = null;
        }
        this.k = 0;
        this.l = 0;
        this.b = false;
        Arrays.fill(this.i, 0.0f);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.c - ((jri)object0).c;
    }

    public final void d(jrd jrd0, float f) {
        this.f = f;
        this.g = true;
        this.m = false;
        int v = this.k;
        this.d = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            this.j[v1].c(jrd0, this, false);
        }
        this.k = 0;
    }

    public final void e(jrd jrd0, jrb jrb0) {
        int v = this.k;
        for(int v1 = 0; v1 < v; ++v1) {
            this.j[v1].d(jrd0, jrb0, false);
        }
        this.k = 0;
    }

    @Override
    public final String toString() {
        return "" + this.c;
    }
}

