import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;

public final class dwiw extends uc {
    final dwix a;

    public dwiw(dwix dwix0) {
        this.a = dwix0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        ActionBar actionBar0 = null;
        if(recyclerView0.canScrollVertically(1)) {
            if(hwfk.av()) {
                dwix dwix0 = this.a;
                ComposeActionBar composeActionBar0 = dwix0.ai;
                if(composeActionBar0 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar0 = null;
                }
                ComposeActionBar composeActionBar1 = dwix0.ai;
                if(composeActionBar1 == null) {
                    ibuq.j("composeActionBar");
                }
                else {
                    actionBar0 = composeActionBar1;
                }
                composeActionBar0.d(ftuw.a(((ComposeActionBar)actionBar0).b(), null, null, true, null, null, false, 0xFB));
                return;
            }
            ActionBar actionBar1 = this.a.ah;
            if(actionBar1 == null) {
                ibuq.j("actionBar");
            }
            else {
                actionBar0 = actionBar1;
            }
            actionBar0.j();
            return;
        }
        if(hwfk.av()) {
            dwix dwix1 = this.a;
            ComposeActionBar composeActionBar2 = dwix1.ai;
            if(composeActionBar2 == null) {
                ibuq.j("composeActionBar");
                composeActionBar2 = null;
            }
            ComposeActionBar composeActionBar3 = dwix1.ai;
            if(composeActionBar3 == null) {
                ibuq.j("composeActionBar");
            }
            else {
                actionBar0 = composeActionBar3;
            }
            composeActionBar2.d(ftuw.a(((ComposeActionBar)actionBar0).b(), null, null, false, null, null, false, 0xFB));
            return;
        }
        ActionBar actionBar2 = this.a.ah;
        if(actionBar2 == null) {
            ibuq.j("actionBar");
        }
        else {
            actionBar0 = actionBar2;
        }
        actionBar0.k();
    }
}

