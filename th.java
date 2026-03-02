import android.support.v7.widget.RecyclerView;
import android.view.View;

public final class th {
    public final RecyclerView a;

    public th(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final int b(View view0) {
        return this.a.indexOfChild(view0);
    }

    public final View c(int v) {
        return this.a.getChildAt(v);
    }

    public final void d(View view0) {
        uq uq0 = RecyclerView.p(view0);
        if(uq0 != null) {
            this.a.aG(uq0, uq0.o);
            uq0.o = 0;
        }
    }

    public final void e(int v) {
        RecyclerView recyclerView0 = this.a;
        View view0 = recyclerView0.getChildAt(v);
        if(view0 != null) {
            recyclerView0.L(view0);
            view0.clearAnimation();
        }
        recyclerView0.removeViewAt(v);
    }
}

