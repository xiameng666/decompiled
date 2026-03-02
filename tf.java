import android.support.v7.widget.RecyclerView;

public final class tf {
    public final RecyclerView a;

    public tf(RecyclerView recyclerView0) {
        this.a = recyclerView0;
        super();
    }

    public final void a(uq uq0, tq tq0, tq tq1) {
        uq0.n(false);
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0.D.n(uq0, tq0, tq1)) {
            recyclerView0.ad();
        }
    }

    public final void b(uq uq0, tq tq0, tq tq1) {
        RecyclerView recyclerView0 = this.a;
        recyclerView0.d.o(uq0);
        recyclerView0.z(uq0);
        uq0.n(false);
        if(recyclerView0.D.p(uq0, tq0, tq1)) {
            recyclerView0.ad();
        }
    }

    public final void c(uq uq0) {
        this.a.n.aR(uq0.a, this.a.d);
    }
}

