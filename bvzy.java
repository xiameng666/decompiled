import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;

public final class bvzy implements ibts {
    public final SummaryCard a;

    public bvzy(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ViewGroup.LayoutParams)object0), "$this$modifyLayoutParams");
        ((ViewGroup.LayoutParams)object0).height = this.a.k ? this.a.i : -2;
        return ibom.a;
    }
}

