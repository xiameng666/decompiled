import java.util.Arrays;

public final class bxt {
    public int[] a;
    public int b;

    public bxt() {
        this(null);
    }

    public bxt(int v) {
        this.a = v == 0 ? bxy.a : new int[v];
    }

    public bxt(byte[] arr_b) {
        this(16);
    }

    public final int a(int v) {
        if(v < 0 || v >= this.b) {
            cad.c("Index must be between 0 and size");
        }
        return this.a[v];
    }

    public final int b() {
        if(this.b == 0) {
            cad.d("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final boolean c(int v) {
        int[] arr_v = this.a;
        int v1 = this.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(arr_v[v2] == v) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.b = 0;
    }

    public final void e(int v) {
        int[] arr_v = this.a;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v, arr_v.length * 3 / 2));
            ibuq.e(arr_v1, "copyOf(...)");
            this.a = arr_v1;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof bxt)) {
            int v = this.b;
            if(((bxt)object0).b == v) {
                int[] arr_v = this.a;
                int[] arr_v1 = ((bxt)object0).a;
                ibwm ibwm0 = ibwt.q(0, v);
                int v1 = ibwm0.a;
                int v2 = ibwm0.b;
                if(v1 <= v2) {
                    while(true) {
                        if(arr_v[v1] != arr_v1[v1]) {
                            return false;
                        }
                        if(v1 == v2) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int v, int v1) {
        if(v < 0 || (v > this.b || v1 < 0 || v1 > this.b)) {
            cad.c("Index must be between 0 and size");
        }
        if(v1 < v) {
            cad.a("The end index must be < start index");
        }
        if(v1 != v) {
            int v2 = this.b;
            if(v1 < v2) {
                ibpg.aa(this.a, this.a, v, v1, v2);
            }
            this.b -= v1 - v;
        }
    }

    public final void g(int v) {
        this.e(this.b + 1);
        int v1 = this.b;
        this.a[v1] = v;
        this.b = v1 + 1;
    }

    public final void h(int v) {
        if(v < 0 || v >= this.b) {
            cad.c("Index must be between 0 and size");
        }
        int[] arr_v = this.a;
        int v1 = arr_v[v];
        int v2 = this.b;
        if(v != v2 - 1) {
            ibpg.aa(arr_v, arr_v, v, v + 1, v2);
        }
        --this.b;
    }

    @Override
    public final int hashCode() {
        int[] arr_v = this.a;
        int v = this.b;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += arr_v[v1] * 0x1F;
        }
        return v2;
    }

    public final void i(int v, int v1) {
        if(v < 0 || v >= this.b) {
            cad.c("Index must be between 0 and size");
        }
        int[] arr_v = this.a;
        int v2 = arr_v[v];
        arr_v[v] = v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        int[] arr_v = this.a;
        int v = this.b;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = arr_v[v1];
            if(v1 != 0) {
                stringBuilder0.append(", ");
            }
            if(v1 == -1) {
                stringBuilder0.append("...");
                break;
            }
            stringBuilder0.append(v2);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

