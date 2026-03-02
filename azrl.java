import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import j..util.Objects;

public final class azrl implements ViewTreeObserver.OnGlobalLayoutListener {
    final RecyclerView a;
    final AccountPickerChimeraActivity b;

    public azrl(AccountPickerChimeraActivity accountPickerChimeraActivity0, RecyclerView recyclerView0) {
        this.a = recyclerView0;
        Objects.requireNonNull(accountPickerChimeraActivity0);
        this.b = accountPickerChimeraActivity0;
        super();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        lqi lqi0 = this.b.u.d;
        azrk azrk0 = new azrk(this);
        lqi0.g(this.b, azrk0);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

