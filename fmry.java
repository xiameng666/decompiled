import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview.PagedRecyclerView;
import j..util.Objects;

public final class fmry extends LinearLayoutManager {
    final PagedRecyclerView a;
    private int b;

    public fmry(PagedRecyclerView pagedRecyclerView0) {
        Objects.requireNonNull(pagedRecyclerView0);
        this.a = pagedRecyclerView0;
        super();
        this.b = 0;
    }

    @Override  // android.support.v7.widget.LinearLayoutManager
    public final void p(un un0) {
        super.p(un0);
        int v = un0.a();
        if(v != this.b) {
            this.b = v;
            fmxp fmxp0 = this.a.ae;
            if(fmxp0 != null) {
                fmya fmya0 = fmxp0.a;
                fmtq fmtq0 = fmya0.A;
                if(fmtq0 != null) {
                    Objects.requireNonNull(fmtq0);
                    fmxx fmxx0 = new fmxx(fmtq0);
                    fmya0.x.post(fmxx0);
                }
            }
        }
    }
}

