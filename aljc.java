import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.multidevice.DisableBetterTogetherIntentOperation;

public final class aljc implements DialogInterface.OnClickListener {
    public final aljd a;
    public final aliu b;
    public final boolean c;
    public final String d;

    public aljc(aljd aljd0, aliu aliu0, boolean z, String s) {
        this.a = aljd0;
        this.b = aliu0;
        this.c = z;
        this.d = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        boolean z = this.c;
        if(hpzi.g()) {
            aliu aliu0 = this.b;
            aliu0.b("better_together_settings_confirm_disable_dialog_count");
            if(z) {
                aliu0.b("phone_hub_confirm_disable_from_notification_count");
            }
            aliu0.c();
        }
        aljd.ag.h("Removing Better Together for account %s, fromPhoneHubNotification: %s", new Object[]{this.d, Boolean.valueOf(z)});
        Context context0 = this.a.getContext();
        Intent intent0 = IntentOperation.getStartIntent(this.a.getContext(), DisableBetterTogetherIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.DISABLE_BETTER_TOGETHER");
        intent0.putExtra("EXTRA_ACCOUNT_NAME", this.d);
        context0.startService(intent0);
    }
}

