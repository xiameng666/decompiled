import java.util.Arrays;

public final class hxm {
    public int a;
    public long[] b;

    public hxm() {
        this.b = new long[2];
    }

    public final boolean a(long v) {
        int v1 = this.a;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.b[v2] == v) {
                return true;
            }
        }
        return false;
    }

    public final void b(long v) {
        if(!this.a(v)) {
            int v1 = this.a;
            long[] arr_v = this.b;
            if(v1 >= arr_v.length) {
                arr_v = Arrays.copyOf(arr_v, Math.max(v1 + 1, arr_v.length + arr_v.length));
                ibuq.e(arr_v, "copyOf(...)");
                this.b = arr_v;
            }
            arr_v[v1] = v;
            if(v1 >= this.a) {
                this.a = v1 + 1;
            }
        }
    }

    public final void c(long v) {
        int v1 = this.a;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v == this.b[v2]) {
                int v3 = this.a - 1;
                while(v2 < v3) {
                    this.b[v2] = this.b[v2 + 1];
                    ++v2;
                }
                --this.a;
                return;
            }
        }
    }
}

