import android.support.v7.widget.RecyclerView;
import j..util.Objects;

final class acce extends uc {
    final accn a;

    public acce(accn accn0) {
        Objects.requireNonNull(accn0);
        this.a = accn0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        if(v1 > 0) {
            accn accn0 = this.a;
            acek acek0 = accn0.at.d;
            if(acek0 != null && acek0.getVisibility() == 0 && recyclerView0.E == 1) {
                accn0.I(false);
            }
        }
    }

    @Override  // uc
    public final void b(int v) {
    }
}

