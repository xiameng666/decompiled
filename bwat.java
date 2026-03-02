import android.view.View;
import android.widget.TextView;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;

public final class bwat implements ibts {
    public final SummaryCard a;

    public bwat(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        SummaryCard summaryCard0;
        ibuq.f(((View)object0), "$this$addOnGlobalLayoutListener");
        for(int v = 0; true; ++v) {
            summaryCard0 = this.a;
            if(v >= 2) {
                break;
            }
            summaryCard0.q(false);
        }
        bwdm bwdm0 = summaryCard0.j;
        if(bwdm0 == null) {
            ibuq.j("uiFlowFlags");
            bwdm0 = null;
        }
        if(!bwdm0.h()) {
            TextView textView0 = summaryCard0.n();
            ibuq.e(textView0, "<get-title>(...)");
            bwdk.b(textView0);
        }
        return ibom.a;
    }
}

