import android.support.v7.widget.RecyclerView;
import j..util.Objects;

final class csas extends uc {
    final im a;
    final csat b;

    public csas(csat csat0, im im0) {
        this.a = im0;
        Objects.requireNonNull(csat0);
        this.b = csat0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        float f = recyclerView0.getChildCount() == 0 || recyclerView0.getChildAt(0).getTop() == 0 ? 0.0f : this.b.b;
        this.a.t(f);
    }
}

