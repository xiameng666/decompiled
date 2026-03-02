import android.app.Dialog;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;

final class atps extends ibsl implements ibtw {
    int a;
    final BankWarningDialogChimeraActivity b;

    public atps(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0, ibrl ibrl0) {
        this.b = bankWarningDialogChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atps)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new atps(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        Dialog dialog0 = null;
        ibnx.b(object0);
        if(v == 0) {
            BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0 = this.b;
            atpc atpc0 = bankWarningDialogChimeraActivity0.n;
            if(atpc0 == null) {
                ibuq.j("bankScamWarningSettingsDataStore");
                atpc0 = null;
            }
            String s = bankWarningDialogChimeraActivity0.u;
            if(s == null) {
                ibuq.j("bankAppPackageName");
                s = null;
            }
            String s1 = bankWarningDialogChimeraActivity0.w;
            if(s1 == null) {
                ibuq.j("currentSessionId");
                s1 = null;
            }
            this.a = 1;
            atow atow0 = new atow(new atov(s, s1));
            Object object2 = icpu.c(((atpa)atpc0).a.b(atow0, gmap.a), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        ggtj ggtj0 = (ggtj)BankWarningDialogChimeraActivity.j.h();
        BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity1 = this.b;
        String s2 = bankWarningDialogChimeraActivity1.u;
        if(s2 == null) {
            ibuq.j("bankAppPackageName");
            s2 = null;
        }
        String s3 = bankWarningDialogChimeraActivity1.w;
        if(s3 == null) {
            ibuq.j("currentSessionId");
            s3 = null;
        }
        ggtj0.R("Risk acceptance recorded for %s and session %s", s2, s3);
        Dialog dialog1 = bankWarningDialogChimeraActivity1.p;
        if(dialog1 == null) {
            ibuq.j("dialog");
        }
        else {
            dialog0 = dialog1;
        }
        dialog0.dismiss();
        bankWarningDialogChimeraActivity1.finish();
        return ibom.a;
    }
}

