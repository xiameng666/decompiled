import android.view.View;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;

public final class dwdj implements ibts {
    public final dwef a;

    public dwdj(dwef dwef0) {
        this.a = dwef0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "v");
        boolean z = ((View)object0).canScrollVertically(1);
        dwef dwef0 = this.a;
        Object object1 = null;
        if(z) {
            if(hwfk.av()) {
                ComposeActionBar composeActionBar0 = dwef0.al;
                if(composeActionBar0 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar0 = null;
                }
                ComposeActionBar composeActionBar1 = dwef0.al;
                if(composeActionBar1 == null) {
                    ibuq.j("composeActionBar");
                }
                else {
                    object1 = composeActionBar1;
                }
                composeActionBar0.d(ftuw.a(((ComposeActionBar)object1).b(), null, null, true, null, null, false, 0xFB));
                return ibom.a;
            }
            ActionBar actionBar0 = dwef0.ak;
            if(actionBar0 == null) {
                ibuq.j("actionBar");
            }
            else {
                object1 = actionBar0;
            }
            ((ActionBar)object1).j();
            return object1;
        }
        if(hwfk.av()) {
            ComposeActionBar composeActionBar2 = dwef0.al;
            if(composeActionBar2 == null) {
                ibuq.j("composeActionBar");
                composeActionBar2 = null;
            }
            ComposeActionBar composeActionBar3 = dwef0.al;
            if(composeActionBar3 == null) {
                ibuq.j("composeActionBar");
            }
            else {
                object1 = composeActionBar3;
            }
            composeActionBar2.d(ftuw.a(((ComposeActionBar)object1).b(), null, null, false, null, null, false, 0xFB));
            return ibom.a;
        }
        ActionBar actionBar1 = dwef0.ak;
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

