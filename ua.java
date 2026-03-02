import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class ua {
    public RecyclerView a;
    private final uc b;

    public ua() {
        this.b = new vm(this);
    }

    public abstract int a(tx arg1, int arg2, int arg3);

    public um b(tx tx0) {
        throw null;
    }

    public abstract View c(tx arg1);

    public abstract int[] d(tx arg1, View arg2);

    public final void e(RecyclerView recyclerView0) {
        RecyclerView recyclerView1 = this.a;
        if(recyclerView1 != recyclerView0) {
            if(recyclerView1 != null) {
                recyclerView1.aj(this.b);
                this.a.G = null;
            }
            this.a = recyclerView0;
            if(recyclerView0 != null) {
                if(recyclerView0.G != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                recyclerView0.D(this.b);
                this.a.G = this;
                new Scroller(this.a.getContext(), new DecelerateInterpolator());
                this.f();
            }
        }
    }

    public final void f() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0 != null) {
            tx tx0 = recyclerView0.h();
            if(tx0 != null) {
                View view0 = this.c(tx0);
                if(view0 != null) {
                    int[] arr_v = this.d(tx0, view0);
                    int v = arr_v[0];
                    if(v != 0) {
                        this.a.aH(v, arr_v[1]);
                    }
                    else if(arr_v[1] != 0) {
                        this.a.aH(0, arr_v[1]);
                    }
                }
            }
        }
    }
}

