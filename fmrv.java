import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import j..util.Objects;

final class fmrv extends uc {
    final fmrx a;

    public fmrv(fmrx fmrx0) {
        Objects.requireNonNull(fmrx0);
        this.a = fmrx0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        fmrx fmrx0 = this.a;
        if(fmrx0.e && !fmrx0.f && fmrx0.g) {
            LinearLayoutManager linearLayoutManager0 = fmrx0.b.ac;
            int v2 = linearLayoutManager0.at();
            if(v2 > 0) {
                int v3 = linearLayoutManager0.L();
                if(linearLayoutManager0.ar() + v3 + fmrx.a >= v2) {
                    fmrx0.f = true;
                    fmrx0.j.b();
                    flbj.a("PagedRcyPresenter", "scrolled to edge, triggering load");
                }
            }
        }
    }
}

