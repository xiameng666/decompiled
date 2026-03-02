import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.callout.ComposeCallout;

public final class ftte implements ibth {
    public final View.OnClickListener a;
    public final ComposeCallout b;

    public ftte(View.OnClickListener view$OnClickListener0, ComposeCallout composeCallout0) {
        this.a = view$OnClickListener0;
        this.b = composeCallout0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

