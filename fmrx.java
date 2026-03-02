import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;

public final class fmrx {
    public static int a;
    public final PagedRecyclerView b;
    public final fmrt c;
    public final uc d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final tm i;
    public final fmya j;
    private final int k;

    public fmrx(PagedRecyclerView pagedRecyclerView0, fmya fmya0, fmrt fmrt0) {
        this.e = false;
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = new fmrw(this);
        this.b = pagedRecyclerView0;
        this.j = fmya0;
        this.c = fmrt0;
        this.k = 1;
        pagedRecyclerView0.an(fmrt0);
        fmrt0.f = pagedRecyclerView0.ad;
        this.d = new fmrv(this);
    }

    public final void a(int v) {
        int v1 = this.k;
        if(v <= v1) {
            LinearLayoutManager linearLayoutManager0 = this.b.ac;
            if(linearLayoutManager0.L() <= v1) {
                linearLayoutManager0.aa(0, 0);
            }
        }
    }

    public final void b(boolean z, gged_interceptors gged0) {
        if(!z) {
            this.c.I();
        }
        this.c.jQ(gged0);
        fmru fmru0 = new fmru(this, z);
        this.b.post(fmru0);
        flbj.a("PagedRcyPresenter", "load done, hasMore:" + z);
    }
}

