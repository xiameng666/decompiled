import android.support.v7.widget.RecyclerView;
import android.view.View.OnScrollChangeListener;
import android.view.View;

public final class ekle implements View.OnScrollChangeListener {
    public final eklg a;
    public final RecyclerView b;

    public ekle(eklg eklg0, RecyclerView recyclerView0) {
        this.a = eklg0;
        this.b = recyclerView0;
    }

    @Override  // android.view.View$OnScrollChangeListener
    public final void onScrollChange(View view0, int v, int v1, int v2, int v3) {
        this.a.ag.b(this.b);
    }
}

