import android.app.Dialog;
import android.content.Intent;
import android.os.CountDownTimer;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.bankscamwarning.operations.BankScamMitigationIntentOperation;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;

final class atpr extends ibsl implements ibtw {
    int a;
    final BankWarningDialogChimeraActivity b;

    public atpr(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0, ibrl ibrl0) {
        this.b = bankWarningDialogChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atpr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new atpr(this.b, ibrl0);
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
            atoy atoy0 = new atoy(new atox(s, s1));
            Object object2 = icpu.c(((atpa)atpc0).a.b(atoy0, gmap.a), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        try {
            BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity1 = this.b;
            String s2 = bankWarningDialogChimeraActivity1.getIntent().getStringExtra("com.google.android.gms.bankscamwarning.EXTRA_PROJECTION_PACKAGE_NAME");
            Intent intent0 = IntentOperation.getStartIntent(bankWarningDialogChimeraActivity1, BankScamMitigationIntentOperation.class, "com.google.android.gms.bankscamwarning.MITIGATE_SCAM");
            if(intent0 != null) {
                intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_PROJECTION_PACKAGE_NAME", s2);
            }
            if(intent0 != null) {
                intent0.putExtra("com.google.android.gms.bankscamwarning.WAS_FORCE_STOP_PERMISSION_GRANTED_WHILE_RENDERING_UI", bankWarningDialogChimeraActivity1.m);
            }
            bankWarningDialogChimeraActivity1.startService(intent0);
            ((ggtj)BankWarningDialogChimeraActivity.j.h()).B("Intent sent %s", "com.google.android.gms.bankscamwarning.MITIGATE_SCAM");
        }
        catch(SecurityException securityException0) {
            a.ae(BankWarningDialogChimeraActivity.j.i(), "Error in sendEndCallAndScreenSharingIntent.", securityException0);
        }
        catch(IllegalStateException illegalStateException0) {
            a.ae(BankWarningDialogChimeraActivity.j.i(), "Error in sendEndCallAndScreenSharingIntent.", illegalStateException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(BankWarningDialogChimeraActivity.j.i(), "Error in sendEndCallAndScreenSharingIntent.", illegalArgumentException0);
        }
        ggtj ggtj0 = (ggtj)BankWarningDialogChimeraActivity.j.h();
        BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity2 = this.b;
        String s3 = bankWarningDialogChimeraActivity2.u;
        if(s3 == null) {
            ibuq.j("bankAppPackageName");
            s3 = null;
        }
        String s4 = bankWarningDialogChimeraActivity2.w;
        if(s4 == null) {
            ibuq.j("currentSessionId");
            s4 = null;
        }
        ggtj0.R("Mitigation acceptance recorded for %s and session %s", s3, s4);
        CountDownTimer countDownTimer0 = bankWarningDialogChimeraActivity2.l;
        if(countDownTimer0 != null) {
            countDownTimer0.cancel();
        }
        Dialog dialog1 = bankWarningDialogChimeraActivity2.p;
        if(dialog1 == null) {
            ibuq.j("dialog");
        }
        else {
            dialog0 = dialog1;
        }
        dialog0.dismiss();
        bankWarningDialogChimeraActivity2.finish();
        return ibom.a;
    }
}

