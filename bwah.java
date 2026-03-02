import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;

public final class bwah implements ibts {
    public final SummaryCard a;

    public bwah(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$addOnGlobalLayoutListener");
        int v = view0.getTop() + ((Number)this.a.l.a()).intValue() - this.a.j();
        this.a.l().setScrollY(v);
        return ibom.a;
    }
}

