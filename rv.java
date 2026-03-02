import android.support.v7.widget.RecyclerView;
import java.util.Arrays;

public final class rv {
    int a;
    int b;
    int[] c;
    int d;

    public final void a(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int v2 = this.d + this.d;
        int[] arr_v = this.c;
        if(arr_v == null) {
            int[] arr_v1 = new int[4];
            this.c = arr_v1;
            Arrays.fill(arr_v1, -1);
        }
        else if(v2 >= arr_v.length) {
            int[] arr_v2 = new int[v2 + v2];
            this.c = arr_v2;
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
        }
        int[] arr_v3 = this.c;
        arr_v3[v2] = v;
        arr_v3[v2 + 1] = v1;
        ++this.d;
    }

    final void b() {
        int[] arr_v = this.c;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
        this.d = 0;
    }

    final void c(RecyclerView recyclerView0, boolean z) {
        this.d = 0;
        int[] arr_v = this.c;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
        tx tx0 = recyclerView0.n;
        if(recyclerView0.m != null && tx0 != null && tx0.B) {
            if(!z) {
                if(!recyclerView0.aA()) {
                    tx0.ak(this.a, this.b, recyclerView0.N, this);
                }
            }
            else if(!recyclerView0.f.l()) {
                tx0.al(recyclerView0.m.b(), this);
            }
            int v = this.d;
            if(v > tx0.C) {
                tx0.C = v;
                tx0.D = z;
                recyclerView0.d.p();
            }
        }
    }

    final boolean d(int v) {
        if(this.c != null) {
            int v1 = this.d + this.d;
            for(int v2 = 0; v2 < v1; v2 += 2) {
                if(this.c[v2] == v) {
                    return true;
                }
            }
        }
        return false;
    }
}

