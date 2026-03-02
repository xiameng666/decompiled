public final class fuyg {
    public final int[] a;
    public int b;

    public fuyg() {
        this.a = new int[5];
        this.b = 0;
    }

    public final float[] a() {
        float[] arr_f = new float[5];
        for(int v = 0; v < 5; ++v) {
            int v1 = this.b;
            if(v1 == 0) {
                arr_f[v] = 0.5f;
            }
            else {
                arr_f[v] = ((float)this.a[v]) / ((float)v1);
                if(v == 0) {
                    arr_f[0] /= 100.0f;
                    v = 0;
                }
            }
        }
        return arr_f;
    }

    public final void b(fuyi fuyi0) {
        for(int v = 0; v < 5; ++v) {
            this.a[v] += fuyi0.a[v];
        }
        ++this.b;
    }
}

