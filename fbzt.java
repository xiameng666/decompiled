import android.graphics.drawable.Drawable;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import j..util.Objects;

public final class fbzt extends pbk {
    final ProgressSpinnerView b;

    public fbzt(ProgressSpinnerView progressSpinnerView0) {
        Objects.requireNonNull(progressSpinnerView0);
        this.b = progressSpinnerView0;
        super();
    }

    @Override  // pbk
    public final void b(Drawable drawable0) {
        fbzs fbzs0 = new fbzs(this.b);
        this.b.g.post(fbzs0);
    }
}

