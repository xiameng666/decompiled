import android.view.View;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;

public final class dlsg implements ibts {
    public final dlte a;

    public dlsg(dlte dlte0) {
        this.a = dlte0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "v");
        boolean z = ((View)object0).canScrollVertically(1);
        dlte dlte0 = this.a;
        Object object1 = null;
        if(z) {
            ActionBar actionBar0 = dlte0.aj;
            if(actionBar0 == null) {
                ibuq.j("actionBar");
            }
            else {
                object1 = actionBar0;
            }
            ((ActionBar)object1).j();
            return object1;
        }
        ActionBar actionBar1 = dlte0.aj;
        if(actionBar1 == null) {
            ibuq.j("actionBar");
        }
        else {
            object1 = actionBar1;
        }
        ((ActionBar)object1).k();
        return object1;
    }
}

