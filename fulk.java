import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.foprow.FopRow;

public final class fulk implements ibth {
    public final View.OnClickListener a;
    public final FopRow b;

    public fulk(View.OnClickListener view$OnClickListener0, FopRow fopRow0) {
        this.a = view$OnClickListener0;
        this.b = fopRow0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

