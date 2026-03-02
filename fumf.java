import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;

public final class fumf implements ibth {
    public final View.OnClickListener a;
    public final RowSecondary b;

    public fumf(View.OnClickListener view$OnClickListener0, RowSecondary rowSecondary0) {
        this.a = view$OnClickListener0;
        this.b = rowSecondary0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

