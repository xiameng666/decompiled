import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.activity.CastTermsOfServiceDialogControl.TermsOfServiceDialogReceiver;

public final class atum {
    public final avjh a;
    public final Context b;
    public final CastTermsOfServiceDialogControl.TermsOfServiceDialogReceiver c;
    public int d;
    public final audp e;
    private final String f;

    public atum(Context context0, audp audp0, String s, String s1) {
        this.b = context0;
        this.e = audp0;
        this.a = new avjh("CastTermsOfServiceDialogControl", s);
        this.d = 1;
        this.c = new CastTermsOfServiceDialogControl.TermsOfServiceDialogReceiver(this);
        this.f = s1;
    }

    public final void a() {
        if(avij.e().E()) {
            int v = this.d;
            if(v == 1) {
                this.a.t("closeTermsOfServiceDialog(): skip close; dialog state is unknown");
                return;
            }
            if(v == 2 || v == 3) {
                this.a.t("closeTermsOfServiceDialog(): skip close; dialog is already closed or closing!");
                return;
            }
        }
        else if(this.d == 2) {
            this.a.t("closeTermsOfServiceDialog(): skip close; dialog is already closed!");
            return;
        }
        this.c.b();
        this.d = 3;
        this.b(6);
    }

    public final void b(int v) {
        synchronized(this) {
            String s = this.f;
            this.a.p("Sending intent with cast terms of service dialog operation \'%d\' for device \'%s\'.", Integer.valueOf(v), s);
            Intent intent0 = new Intent("com.google.android.gms.cast.activity.CAST_TERMS_OF_SERVICE");
            intent0.addFlags(0x34050000);
            Context context0 = this.b;
            intent0.setClassName("com.google.android.gms", "com.google.android.gms.cast.activity.CastPopupActivity");
            intent0.putExtra("com.google.android.gms.cast.activity.DIALOG_KEY_OPERATION", v);
            if(s != null) {
                intent0.putExtra("com.google.android.gms.cast.session.DIALOG_KEY_REMOTE_DEVICE_NAME", s);
            }
            intent0.setPackage("com.google.android.gms");
            context0.startActivity(intent0);
        }
    }
}

