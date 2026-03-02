import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;

public final class duip implements ibth {
    public final View.OnClickListener a;
    public final ComposeActionBar b;

    public duip(View.OnClickListener view$OnClickListener0, ComposeActionBar composeActionBar0) {
        this.a = view$OnClickListener0;
        this.b = composeActionBar0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

