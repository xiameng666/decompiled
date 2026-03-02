import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.gms.accountsettings.widget.WelcomeHeaderCollapsingView;

final class aakq extends ibuo implements ibts {
    public aakq(Object object0) {
        super(1, object0, aakt.class, "onContentStateChanged", "onContentStateChanged(Lcom/google/android/gms/accountsettings/mg/poc/ui/viewmodel/WelcomeHeaderViewModel$ContentState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s;
        ibuq.f(((aaqu)object0), "p0");
        aakt aakt0 = (aakt)this.e;
        ProductLockupToolbar productLockupToolbar0 = null;
        if((((aaqu)object0) instanceof aaqt)) {
            WelcomeHeaderCollapsingView welcomeHeaderCollapsingView0 = aakt0.aj;
            if(welcomeHeaderCollapsingView0 != null) {
                gfsx gfsx0 = ((aaqt)(((aaqu)object0))).c;
                ibuq.f(((aaqt)(((aaqu)object0))).a, "welcomeText");
                welcomeHeaderCollapsingView0.c.setText(((aaqt)(((aaqu)object0))).a);
                welcomeHeaderCollapsingView0.d.setText(((aaqt)(((aaqu)object0))).b);
                Object object1 = welcomeHeaderCollapsingView0.f.a();
                ibuq.e(object1, "getValue(...)");
                ((aabm)object1).a(gfsx0);
                if(gfsx0.i()) {
                    s = welcomeHeaderCollapsingView0.getContext().getString(0x7F1507C8, new Object[]{((aatc)gfsx0.d()).c, ((aatc)gfsx0.d()).b});  // string:common_account_identity_a11y_description "Google Account: %1$s (%2$s)"
                    ibuq.e(s, "getString(...)");
                }
                else {
                    s = new String();
                }
                WelcomeHeaderCollapsingView.c(welcomeHeaderCollapsingView0.b, s);
                WelcomeHeaderCollapsingView.c(welcomeHeaderCollapsingView0.e, s);
            }
            WelcomeHeaderCollapsingView welcomeHeaderCollapsingView1 = aakt0.aj;
            if(welcomeHeaderCollapsingView1 != null) {
                WelcomeHeaderCollapsingView.b(welcomeHeaderCollapsingView1.b, ((aaqt)(((aaqu)object0))).e);
                WelcomeHeaderCollapsingView.b(welcomeHeaderCollapsingView1.e, ((aaqt)(((aaqu)object0))).d);
            }
            ProductLockupToolbar productLockupToolbar1 = aakt0.ai;
            if(productLockupToolbar1 == null) {
                ibuq.j("toolbar");
                productLockupToolbar1 = null;
            }
            productLockupToolbar1.P(((aaqt)(((aaqu)object0))).e);
            ProductLockupToolbar productLockupToolbar2 = aakt0.ai;
            if(productLockupToolbar2 == null) {
                ibuq.j("toolbar");
            }
            else {
                productLockupToolbar0 = productLockupToolbar2;
            }
            productLockupToolbar0.Q(((aaqt)(((aaqu)object0))).c);
            return ibom.a;
        }
        if(!(((aaqu)object0) instanceof aaqs)) {
            throw new ibnq();
        }
        ProductLockupToolbar productLockupToolbar3 = aakt0.ai;
        if(productLockupToolbar3 == null) {
            ibuq.j("toolbar");
            productLockupToolbar3 = null;
        }
        productLockupToolbar3.P(((aaqs)(((aaqu)object0))).b);
        ProductLockupToolbar productLockupToolbar4 = aakt0.ai;
        if(productLockupToolbar4 == null) {
            ibuq.j("toolbar");
        }
        else {
            productLockupToolbar0 = productLockupToolbar4;
        }
        productLockupToolbar0.Q(((aaqs)(((aaqu)object0))).a);
        return ibom.a;
    }
}

