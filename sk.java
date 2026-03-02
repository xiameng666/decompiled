import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;

final class sk implements AbsListView.OnScrollListener {
    final sn a;

    public sk(sn sn0) {
        this.a = sn0;
        super();
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScroll(AbsListView absListView0, int v, int v1, int v2) {
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView0, int v) {
        if(v == 1) {
            sn sn0 = this.a;
            if(!sn0.u() && sn0.r.getContentView() != null) {
                sn0.p.removeCallbacks(sn0.o);
                sn0.o.run();
            }
        }
    }
}

