import android.support.v7.widget.RecyclerView;
import com.google.android.gms.pay.fops.details.FopDetailsFragment;

public final class dnjx extends uc {
    final FopDetailsFragment a;

    public dnjx(FopDetailsFragment fopDetailsFragment0) {
        this.a = fopDetailsFragment0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        this.a.A().m.l(Boolean.valueOf(recyclerView0.canScrollVertically(-1)));
    }
}

