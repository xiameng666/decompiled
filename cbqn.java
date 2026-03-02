import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.firstparty.shared.SupervisedAccountOptions;
import com.google.android.setupdesign.GlifLayout;

public class cbqn extends du {
    public static final bboh a;
    private final ibnn b;
    private final acp c;

    static {
        cbqn.a = bboh.b("KidUser", bbcu.ac);
    }

    public cbqn(int v) {
        super(v);
        this.b = new ibnz(new cbqi(this));
        this.c = this.registerForActivityResult(new adt(), new cbqj(this));
    }

    public final void A(int v) {
        View view0 = this.getView();
        ibuq.d(view0, "null cannot be cast to non-null type com.google.android.setupdesign.GlifLayout");
        ((GlifLayout)view0).J(v);
    }

    public final void B(View.OnClickListener view$OnClickListener0) {
        View view0 = this.getView();
        ibuq.d(view0, "null cannot be cast to non-null type com.google.android.setupdesign.GlifLayout");
        gafm gafm0 = ((GlifLayout)view0).t(gaff.class);
        ibuq.c(gafm0);
        gafh gafh0 = ((gaff)gafm0).k;
        ibuq.c(gafh0);
        gafh0.f = view$OnClickListener0;
    }

    public final void C() {
        View view0 = this.getView();
        ibuq.d(view0, "null cannot be cast to non-null type com.google.android.setupdesign.GlifLayout");
        gafm gafm0 = ((GlifLayout)view0).t(gaig.class);
        ibuq.c(gafm0);
        ((gaig)gafm0).c(true);
        gafm gafm1 = ((GlifLayout)view0).t(gaff.class);
        ibuq.c(gafm1);
        gafh gafh0 = ((gaff)gafm1).k;
        if(gafh0 != null) {
            gafh0.f(4);
        }
    }

    public final void D(cbqc cbqc0) {
        Account account0 = (Account)this.y().d.ij();
        String s = null;
        String s1 = account0 == null ? null : account0.name;
        if(cbqc0 != null) {
            gvmq gvmq0 = cbqc0.a;
            if(gvmq0 != null) {
                s = gvmq0.b;
            }
        }
        SupervisedAccountOptions supervisedAccountOptions0 = new SupervisedAccountOptions(s1, s);
        Boolean boolean0 = (Boolean)this.y().f.ij();
        Bundle bundle0 = jyu.a(new ibns[]{new ibns("supervised_account_options", bauc.n(supervisedAccountOptions0)), new ibns("setupWizardForFinishSession", Boolean.valueOf(true)), new ibns("kh_ise", Boolean.valueOf((boolean0 == null ? false : boolean0.booleanValue())))});
        xob xob0 = xoc.b(this);
        cchj cchj0 = cchj.b(xob0);
        Activity activity0 = xob0.getContainerActivity();
        cbql cbql0 = new cbql(this);
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "startAddAccountSession", 0x1BF, "AccountManager.startAddAccountSession")) {
            cchj0.a.startAddAccountSession("com.google", "oauthlogin", new String[0], bundle0, activity0, cbql0, null);
        }
    }

    @Override  // du
    public void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.y().b.g(this.getViewLifecycleOwner(), new cbqm(new cbqk(this)));
    }

    public final cbqh y() {
        return (cbqh)this.b.a();
    }

    public final void z() {
        ((ggtj)cbqn.a.h()).B("Navigate state = %s", this.y().b.ij());
        cbqb cbqb0 = (cbqb)this.y().b.ij();
        if(cbqb0 != null) {
            switch(cbqb0.ordinal()) {
                case 2: {
                    azor azor0 = new azor();
                    azor0.c(ibpo.b("com.google"));
                    azor0.e();
                    Intent intent0 = azou.a(azor0.a());
                    this.c.b(intent0);
                    return;
                }
                case 3: {
                    ca ca0 = new ca(this.getChildFragmentManager());
                    ca0.z(0x7F0B217A, new cbrh(), "fragment");  // id:sud_layout_template_content
                    ca0.a();
                    return;
                }
                case 6: {
                    this.D(null);
                    return;
                }
                case 7: {
                    ca ca1 = new ca(this.getChildFragmentManager());
                    ca1.z(0x7F0B217A, new cbrb(), "fragment");  // id:sud_layout_template_content
                    ca1.f();
                    return;
                }
                case 8: {
                    ca ca2 = new ca(this.getChildFragmentManager());
                    ca2.z(0x7F0B217A, new cbqx(), "fragment");  // id:sud_layout_template_content
                    ca2.f();
                    return;
                }
            }
        }
        this.C();
    }
}

