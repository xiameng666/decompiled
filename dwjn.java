import android.view.View;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.material.appbar.AppBarLayout;

public final class dwjn implements ibts {
    public final dwjx a;

    public dwjn(dwjx dwjx0) {
        this.a = dwjx0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "v");
        boolean z = ((View)object0).canScrollVertically(1);
        dwjx dwjx0 = this.a;
        AppBarLayout appBarLayout0 = null;
        if(!z) {
            if(hwfk.av()) {
                ComposeActionBar composeActionBar2 = dwjx0.aq;
                if(composeActionBar2 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar2 = null;
                }
                ComposeActionBar composeActionBar3 = dwjx0.aq;
                if(composeActionBar3 == null) {
                    ibuq.j("composeActionBar");
                    composeActionBar3 = null;
                }
                composeActionBar2.d(ftuw.a(composeActionBar3.b(), null, null, false, null, null, false, 0xFB));
            }
            else {
                ActionBar actionBar1 = dwjx0.ap;
                if(actionBar1 == null) {
                    ibuq.j("actionBar");
                    actionBar1 = null;
                }
                actionBar1.k();
            }
        }
        else if(hwfk.av()) {
            ComposeActionBar composeActionBar0 = dwjx0.aq;
            if(composeActionBar0 == null) {
                ibuq.j("composeActionBar");
                composeActionBar0 = null;
            }
            ComposeActionBar composeActionBar1 = dwjx0.aq;
            if(composeActionBar1 == null) {
                ibuq.j("composeActionBar");
                composeActionBar1 = null;
            }
            composeActionBar0.d(ftuw.a(composeActionBar1.b(), null, null, true, null, null, false, 0xFB));
        }
        else {
            ActionBar actionBar0 = dwjx0.ap;
            if(actionBar0 == null) {
                ibuq.j("actionBar");
                actionBar0 = null;
            }
            actionBar0.j();
        }
        boolean z1 = ((View)object0).canScrollVertically(-1);
        AppBarLayout appBarLayout1 = dwjx0.au;
        if(appBarLayout1 == null) {
            ibuq.j("appBarLayout");
        }
        else {
            appBarLayout0 = appBarLayout1;
        }
        appBarLayout0.t(z1);
        return ibom.a;
    }
}

