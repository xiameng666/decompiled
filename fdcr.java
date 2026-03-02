import android.support.v7.widget.RecyclerView;

public final class fdcr implements fdaf {
    public final fdcv a;
    public final RecyclerView b;

    public fdcr(fdcv fdcv0, RecyclerView recyclerView0) {
        this.a = fdcv0;
        this.b = recyclerView0;
    }

    @Override  // fdaf
    public final void a(int v) {
        this.a.d.c(this.a.requireContext(), v).z(new fdcs(this.a, this.b));
    }
}

