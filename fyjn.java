import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

class fyjn extends LinearLayoutManager {
    public fyjn(int v) {
        super(v, false);
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    public final void ap(RecyclerView recyclerView0, int v) {
        fyjm fyjm0 = new fyjm(this, recyclerView0.getContext());
        fyjm0.b = v;
        this.bb(fyjm0);
    }
}

