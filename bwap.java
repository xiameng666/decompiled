import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;

public final class bwap implements ibts {
    public final SummaryCard a;

    public bwap(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$addOnGlobalLayoutListener");
        bwdz.g(view0, new bvzw(this.a));
        return ibom.a;
    }
}

