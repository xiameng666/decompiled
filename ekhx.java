import android.support.v7.widget.RecyclerView;
import android.view.View.OnScrollChangeListener;
import android.view.View;
import j..util.Objects;

final class ekhx implements View.OnScrollChangeListener {
    final RecyclerView a;
    final ekia b;

    public ekhx(ekia ekia0, RecyclerView recyclerView0) {
        this.a = recyclerView0;
        Objects.requireNonNull(ekia0);
        this.b = ekia0;
        super();
    }

    @Override  // android.view.View$OnScrollChangeListener
    public final void onScrollChange(View view0, int v, int v1, int v2, int v3) {
        this.b.ah.b(this.a);
    }
}

