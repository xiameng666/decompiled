import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.kids.auth.flow.KidsAuthAddAccountChimeraActivity;

public final class caqo extends ibsl implements ibtw {
    int a;
    final KidsAuthAddAccountChimeraActivity b;
    final Bundle c;

    public caqo(KidsAuthAddAccountChimeraActivity kidsAuthAddAccountChimeraActivity0, Bundle bundle0, ibrl ibrl0) {
        this.b = kidsAuthAddAccountChimeraActivity0;
        this.c = bundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((caqo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new caqo(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        ibom ibom0;
        Object object1 = ibrx.a;
        int v = this.a;
        if(v == 0) {
            ibnx.b(object0);
            this.a = 1;
            object0 = this.b.m(this);
            if(object0 != object1) {
            label_10:
                if(((Boolean)object0).booleanValue()) {
                    KidsAuthAddAccountChimeraActivity kidsAuthAddAccountChimeraActivity0 = this.b;
                    this.a = 2;
                    cart cart0 = kidsAuthAddAccountChimeraActivity0.n;
                    Intent intent0 = null;
                    if(cart0 == null) {
                        ibuq.j("confirmCredentialsIntentBuilder");
                        cart0 = null;
                    }
                    if(cart0 != null) {
                        intent0 = cart0.a();
                    }
                    if(intent0 == null) {
                        cbfc.a(gvka.ap);
                        ((ggtj)KidsAuthAddAccountChimeraActivity.j.h()).x("No intent for confirm credentials was found.");
                        kidsAuthAddAccountChimeraActivity0.setResult(-1);
                        kidsAuthAddAccountChimeraActivity0.finish();
                    }
                    else {
                        ((ggtj)KidsAuthAddAccountChimeraActivity.j.h()).x("Launching confirm credentials before adding account.");
                        cbfc.a(gvka.aq);
                        kidsAuthAddAccountChimeraActivity0.o.b(intent0);
                    }
                    ibom0 = ibom.a;
                    return ibom0 != object1 ? ibom.a : object1;
                }
                KidsAuthAddAccountChimeraActivity kidsAuthAddAccountChimeraActivity1 = this.b;
                Bundle bundle0 = this.c;
                this.a = 3;
                if(kidsAuthAddAccountChimeraActivity1.q == null) {
                    ibuq.j("launchController");
                }
                if(huix.e()) {
                    object2 = kidsAuthAddAccountChimeraActivity1.l(bundle0, this);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                }
                else {
                    object2 = kidsAuthAddAccountChimeraActivity1.g(bundle0, this);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                }
                if(object2 != object1) {
                    return ibom.a;
                }
            }
        }
        else {
            ibnx.b(object0);
            if(v == 1) {
                goto label_10;
            }
            return ibom.a;
        }
        return object1;
    }
}

