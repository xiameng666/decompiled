import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

public final class uk {
    public int a;
    private int b;
    private int c;
    private int d;
    private Interpolator e;
    private boolean f;
    private int g;

    public uk() {
        this.a = -1;
        this.f = false;
        this.g = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0x80000000;
        this.e = null;
    }

    final void a(RecyclerView recyclerView0) {
        int v = this.a;
        if(v >= 0) {
            this.a = -1;
            recyclerView0.X(v);
            this.f = false;
            return;
        }
        if(this.f) {
            Interpolator interpolator0 = this.e;
            if(interpolator0 != null && this.d <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int v1 = this.d;
            if(v1 <= 0) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView0.K.c(this.b, this.c, v1, interpolator0);
            int v2 = this.g + 1;
            this.g = v2;
            if(v2 > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f = false;
            return;
        }
        this.g = 0;
    }

    public final void b(int v, int v1, int v2, Interpolator interpolator0) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = interpolator0;
        this.f = true;
    }
}

