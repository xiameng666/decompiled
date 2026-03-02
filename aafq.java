import android.widget.TextView;
import com.google.android.gms.accountsettings.mg.poc.ui.view.AppBarBehavior;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.material.appbar.AppBarLayout;

final class aafq extends ibuo implements ibts {
    public aafq(Object object0) {
        super(1, object0, aafw.class, "onToolbarTitleStateChanged", "onToolbarTitleStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/appbar/ToolbarTitleState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        AppBarBehavior appBarBehavior0;
        ibuq.f(((aask)object0), "p0");
        aafw aafw0 = (aafw)this.e;
        ProductLockupToolbar productLockupToolbar0 = aafw0.ai;
        AppBarLayout appBarLayout0 = null;
        if(productLockupToolbar0 == null) {
            ibuq.j("toolbar");
            productLockupToolbar0 = null;
        }
        productLockupToolbar0.D("");
        boolean z = false;
        if(ibuq.m(((aask)object0), aasg.a)) {
            productLockupToolbar0.T(8);
            productLockupToolbar0.C(0x7F1507E3);  // string:common_asm_google_account_title "Google Account"
            TextView textView0 = aafw0.aj;
            if(textView0 == null) {
                ibuq.j("expandedTitle");
                textView0 = null;
            }
            textView0.setVisibility(8);
            aafw0.C(false);
            appBarBehavior0 = aafw0.al;
            if(appBarBehavior0 != null) {
                goto label_71;
            }
            ibuq.j("appBarBehavior");
            appBarBehavior0 = null;
        }
        else {
            if((((aask)object0) instanceof aash)) {
                TextView textView1 = aafw0.aj;
                if(textView1 == null) {
                    ibuq.j("expandedTitle");
                    textView1 = null;
                }
                String s = ((aash)(((aask)object0))).a;
                textView1.setText(s);
                TextView textView2 = aafw0.ak;
                if(textView2 == null) {
                    ibuq.j("collapsedTitle");
                    textView2 = null;
                }
                textView2.setText(s);
                productLockupToolbar0.T(0);
                TextView textView3 = aafw0.aj;
                if(textView3 == null) {
                    ibuq.j("expandedTitle");
                    textView3 = null;
                }
                textView3.setVisibility(0);
                z = true;
                aafw0.C(true);
                appBarBehavior0 = aafw0.al;
                if(appBarBehavior0 != null) {
                    goto label_71;
                }
                ibuq.j("appBarBehavior");
                appBarBehavior0 = null;
                goto label_71;
            }
            if(ibuq.m(((aask)object0), aasj.a)) {
                productLockupToolbar0.T(0);
                TextView textView4 = aafw0.aj;
                if(textView4 == null) {
                    ibuq.j("expandedTitle");
                    textView4 = null;
                }
                textView4.setVisibility(8);
                aafw0.C(false);
                appBarBehavior0 = aafw0.al;
                if(appBarBehavior0 != null) {
                    goto label_71;
                }
                ibuq.j("appBarBehavior");
                appBarBehavior0 = null;
                goto label_71;
            }
            if(!ibuq.m(((aask)object0), aasi.a)) {
                throw new ibnq();
            }
            productLockupToolbar0.T(8);
            TextView textView5 = aafw0.aj;
            if(textView5 == null) {
                ibuq.j("expandedTitle");
                textView5 = null;
            }
            textView5.setVisibility(8);
            aafw0.C(false);
            appBarBehavior0 = aafw0.al;
            if(appBarBehavior0 == null) {
                ibuq.j("appBarBehavior");
                appBarBehavior0 = null;
            }
        }
    label_71:
        appBarBehavior0.b = z;
        AppBarLayout appBarLayout1 = aafw0.ah;
        if(appBarLayout1 == null) {
            ibuq.j("appbarLayout");
        }
        else {
            appBarLayout0 = appBarLayout1;
        }
        appBarLayout0.requestLayout();
        return ibom.a;
    }
}

