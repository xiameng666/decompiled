import android.graphics.drawable.Drawable;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import j..util.Objects;

public final class fbzq extends pbk {
    final ProgressSpinnerView b;

    public fbzq(ProgressSpinnerView progressSpinnerView0) {
        Objects.requireNonNull(progressSpinnerView0);
        this.b = progressSpinnerView0;
        super();
    }

    @Override  // pbk
    public final void b(Drawable drawable0) {
        fbzr fbzr0 = new fbzr(this.b);
        this.b.g.post(fbzr0);
    }
}

