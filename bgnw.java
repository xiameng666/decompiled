import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bgnw extends tk {
    private final int a;
    private final ibts e;

    public bgnw(int v) {
        this(v, new bgnv());
    }

    public bgnw(int v, ibts ibts0) {
        this.a = v;
        this.e = ibts0;
    }

    @Override  // tk
    public final int b() {
        return 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(this.a, viewGroup0, false);
        ibuq.c(view0);
        this.e.a(view0);
        ibuq.e(view0, "apply(...)");
        ibuq.f(view0, "itemView");
        return new uq(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
    }
}

