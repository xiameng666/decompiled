import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import j..util.Objects;

final class eklf extends LinearLayoutManager {
    final RecyclerView a;
    final eklg b;

    public eklf(eklg eklg0, RecyclerView recyclerView0) {
        this.a = recyclerView0;
        Objects.requireNonNull(eklg0);
        this.b = eklg0;
        super();
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    public final void o(uf uf0, un un0) {
        super.o(uf0, un0);
        int v = this.M() - this.L();
        eklg eklg0 = this.b;
        if(eklg0.d.b() > v + 1) {
            this.a.setVerticalScrollBarEnabled(false);
            eklg0.ag.setVisibility(0);
            return;
        }
        eklg0.ag.setVisibility(8);
    }
}

