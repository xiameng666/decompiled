import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

public class cqjk extends IntentOperation {
    private final cqig a;

    public cqjk(cqig cqig0) {
        this.a = cqig0;
    }

    public static PendingIntent a(String s, Context context0, String s1) {
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.mdm.receivers.NotificationChimeraBroadcastReceiver", s);
        if(intent0 == null) {
            cqqt.a("Failed to create pending intent for action %s", new Object[]{s});
            return null;
        }
        intent0.putExtra("echo_server_token", s1);
        return fqaw.f(context0, 0, intent0, 0xC000000);
    }

    public static PendingIntent b(Intent intent0, Context context0) {
        return fqaw.a(context0, 0, intent0, 0xC000000);
    }

    private static void c(Context context0) {
        bayn bayn0 = bayn.f(context0);
        if(bayn0 == null) {
            cqqt.a("Failed to cancel TOS notification due to null NotificationManager", new Object[0]);
            return;
        }
        bayn0.o("mdm.notification_tos_update", 1, evuh.cu);
    }

    private static void d(Context context0) {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hxvi.a.e().j()));
        intent0.addFlags(0x10000000);
        context0.startActivity(intent0);
    }

    private final void e(hltz hltz0, Context context0, String s) {
        boolean z = cqqg.a(context0);
        this.a.a(new hltz[]{hltz0}, null, null, null, gfta.b(s), null, z);
    }

    @Override  // com.google.android.chimera.IntentOperation
    final void init(Context context0) {
        super.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        cqqt.c("Notification action received.", new Object[0]);
        String s = intent0.getAction();
        String s1 = intent0.getStringExtra("echo_server_token");
        if(s == null) {
            cqqt.d("Received unexpected broadcast with no action", new Object[0]);
            return;
        }
        if(s1 == null && (s != 271308 && s != 271309)) {
            cqqt.d("Received broadcast without echoServerToken", new Object[0]);
        }
        switch(s) {
            case "com.google.android.gms.mdm.notifications.actions.located_actioned": {
                Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=device_manager_location"));
                intent1.addFlags(0x10000000);
                this.startActivity(intent1);
                return;
            }
            case "com.google.android.gms.mdm.notifications.actions.ringing_actioned": {
                cqju.g(this);
                return;
            }
            case "com.google.android.gms.mdm.notifications.actions.tos_prompt_click": {
                this.e(hltz.B, this, s1);
                cqjk.d(this);
                return;
            }
            case "com.google.android.gms.mdm.notifications.actions.tos_prompt_dismiss": {
                this.e(hltz.C, this, s1);
                return;
            }
            case "com.google.android.gms.mdm.notifications.actions.tos_prompt_negative_button": {
                this.e(hltz.D, this, s1);
                cqjk.c(this);
                return;
            }
            case "com.google.android.gms.mdm.notifications.actions.tos_prompt_positive_button": {
                this.e(hltz.B, this, s1);
                cqjk.c(this);
                cqjk.d(this);
                return;
            }
            default: {
                cqqt.d("Received unexpected broadcast for action %s", new Object[]{s});
            }
        }
    }
}

