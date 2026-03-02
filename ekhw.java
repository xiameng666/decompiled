import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import j..util.Objects;

final class ekhw extends LinearLayoutManager {
    final RecyclerView a;
    final ekia b;

    public ekhw(ekia ekia0, RecyclerView recyclerView0) {
        this.a = recyclerView0;
        Objects.requireNonNull(ekia0);
        this.b = ekia0;
        super();
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    public final void o(uf uf0, un un0) {
        super.o(uf0, un0);
        int v = this.M() - this.L();
        ekia ekia0 = this.b;
        if(ekia0.a.b() > v + 1) {
            this.a.setVerticalScrollBarEnabled(false);
            ekia0.ah.setVisibility(0);
            ekhy ekhy0 = new ekhy(ekia0);
            this.a.D(ekhy0);
            return;
        }
        ekia0.ah.setVisibility(8);
    }
}

