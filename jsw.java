import java.util.Arrays;

final class jsw {
    int[] a;
    int[] b;
    int c;
    int[] d;
    float[] e;
    int f;
    int[] g;
    String[] h;
    int i;
    int[] j;
    boolean[] k;
    int l;

    public jsw() {
        this.a = new int[10];
        this.b = new int[10];
        this.c = 0;
        this.d = new int[10];
        this.e = new float[10];
        this.f = 0;
        this.g = new int[5];
        this.h = new String[5];
        this.i = 0;
        this.j = new int[4];
        this.k = new boolean[4];
        this.l = 0;
    }

    final void a(int v, float f) {
        int[] arr_v = this.d;
        if(this.f >= arr_v.length) {
            this.d = Arrays.copyOf(arr_v, arr_v.length + arr_v.length);
            int v1 = this.e.length;
            this.e = Arrays.copyOf(this.e, v1 + v1);
        }
        int v2 = this.f;
        this.d[v2] = v;
        this.f = v2 + 1;
        this.e[v2] = f;
    }

    final void b(int v, int v1) {
        int[] arr_v = this.a;
        if(this.c >= arr_v.length) {
            this.a = Arrays.copyOf(arr_v, arr_v.length + arr_v.length);
            int v2 = this.b.length;
            this.b = Arrays.copyOf(this.b, v2 + v2);
        }
        int v3 = this.c;
        this.a[v3] = v;
        this.c = v3 + 1;
        this.b[v3] = v1;
    }

    final void c(int v, String s) {
        int[] arr_v = this.g;
        if(this.i >= arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length + arr_v.length);
            int v1 = this.h.length;
            this.h = (String[])Arrays.copyOf(this.h, v1 + v1);
        }
        int v2 = this.i;
        this.g[v2] = v;
        this.i = v2 + 1;
        this.h[v2] = s;
    }

    final void d(int v, boolean z) {
        int[] arr_v = this.j;
        if(this.l >= arr_v.length) {
            this.j = Arrays.copyOf(arr_v, arr_v.length + arr_v.length);
            int v1 = this.k.length;
            this.k = Arrays.copyOf(this.k, v1 + v1);
        }
        int v2 = this.l;
        this.j[v2] = v;
        this.l = v2 + 1;
        this.k[v2] = z;
    }
}

