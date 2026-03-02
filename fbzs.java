import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import j..util.Objects;

final class fbzs implements Runnable {
    final ProgressSpinnerView a;

    public fbzs(ProgressSpinnerView progressSpinnerView0) {
        Objects.requireNonNull(progressSpinnerView0);
        this.a = progressSpinnerView0;
        super();
    }

    @Override
    public final void run() {
        this.a.h.start();
    }
}

