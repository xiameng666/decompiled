import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;

public final class bvzz implements ibts {
    public final SummaryCard a;

    public bvzz(SummaryCard summaryCard0) {
        this.a = summaryCard0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "$this$addOnGlobalLayoutListener");
        ConstraintLayout constraintLayout0 = this.a.g;
        if(constraintLayout0 == null) {
            ibuq.j("constraintLayout");
            constraintLayout0 = null;
        }
        bwea.d(constraintLayout0, new bvzx(((View)object0)));
        return ibom.a;
    }
}

