import android.view.View.OnClickListener;
import com.google.android.gms.pay.pass.idcard.view.components.PresentationBottomSheet;

public final class duik implements ibth {
    public final View.OnClickListener a;
    public final PresentationBottomSheet b;

    public duik(View.OnClickListener view$OnClickListener0, PresentationBottomSheet presentationBottomSheet0) {
        this.a = view$OnClickListener0;
        this.b = presentationBottomSheet0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.onClick(this.b);
        return ibom.a;
    }
}

