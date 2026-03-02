import android.view.View.OnClickListener;
import com.google.android.libraries.tapandpay.ui.rowprimary.RowPrimary;

public final class fulz implements ibth {
    public final View.OnClickListener a;
    public final RowPrimary b;

    public fulz(View.OnClickListener view$OnClickListener0, RowPrimary rowPrimary0) {
        this.a = view$OnClickListener0;
        this.b = rowPrimary0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

