import java.io.Serializable;

public final class fuzf implements Serializable {
    private final float[] a;
    private int b;
    private boolean c;
    private float d;

    public fuzf(int v) {
        this.a = new float[v];
        this.c = false;
        this.b = 0;
    }

    public final float a(int v) {
        if(this.c() == 0) {
            throw new IndexOutOfBoundsException("Array is empty.");
        }
        if(v >= this.c()) {
            throw new IndexOutOfBoundsException("Index of " + v + " is larger than array size of " + this.c());
        }
        if(this.c) {
            int v1 = v + this.b;
            return this.a[(v1 < this.a.length ? v + this.b : v1 - this.a.length)];
        }
        return this.a[v];
    }

    public final float b() {
        if(this.c() == 0) {
            throw new IndexOutOfBoundsException("Array is empty.");
        }
        float[] arr_f = this.a;
        if(this.c) {
            return this.b <= 0 ? arr_f[this.c() - 1] : arr_f[this.b - 1];
        }
        return arr_f[this.c() - 1];
    }

    public final int c() {
        return this.c ? this.a.length : this.b;
    }

    public final void d(float f) {
        if(this.c) {
            this.d -= this.a[this.b];
        }
        int v = this.b;
        this.a[v] = f;
        this.d += f;
        if(v == this.a.length - 1) {
            this.b = 0;
            this.c = true;
            return;
        }
        this.b = v + 1;
    }

    public final void e(float f) {
        int v1;
        if(this.c() == 0) {
            throw new IndexOutOfBoundsException("Array is empty.");
        }
        float[] arr_f = this.a;
        if(this.c) {
            int v = this.b;
            v1 = v > 0 ? v - 1 : this.c() - 1;
        }
        else {
            v1 = this.c() - 1;
        }
        arr_f[v1] = f;
    }

    public final float[] f() {
        if(this.c() <= 1) {
            return new float[0];
        }
        int v1 = this.c() - 1;
        float[] arr_f = new float[v1];
        int v2 = this.b - this.c();
        float[] arr_f1 = this.a;
        for(int v = 0; v < v1; ++v) {
            int v3 = (v2 + arr_f1.length) % arr_f1.length + v;
            arr_f[v] = arr_f1[(v3 + 1) % arr_f1.length] - arr_f1[v3 % arr_f1.length];
        }
        return arr_f;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c) {
            int v1 = this.b;
            while(true) {
                float[] arr_f = this.a;
                if(v1 >= arr_f.length) {
                    goto label_10;
                }
                stringBuilder0.append(arr_f[v1]);
                stringBuilder0.append(", ");
                ++v1;
            }
        }
        else {
        label_10:
            for(int v = 0; v < this.b; ++v) {
                stringBuilder0.append(this.a[v]);
                stringBuilder0.append(", ");
            }
        }
        return stringBuilder0.toString();
    }
}

