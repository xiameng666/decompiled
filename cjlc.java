import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

public final class cjlc implements ibtw {
    public final cjlv a;
    public final gjdg b;

    public cjlc(cjlv cjlv0, gjdg gjdg0) {
        this.a = cjlv0;
        this.b = gjdg0;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        String s;
        ibuq.f(((fsef)object1), "source");
        ibuq.f(((fsef)object1), "source");
        fsee fsee0 = ((fsef)object1).a;
        switch(fsee0.ordinal()) {
            case 0: {
                s = "com.google.android.libraries.tapandpay.notification.logging.NOTIFICATION_CONTENT_INTENT";
                break;
            }
            case 1: {
                s = "com.google.android.libraries.tapandpay.notification.logging.NOTIFICATION_ACTION_PENDING_INTENT";
                break;
            }
            case 2: {
                s = "com.google.android.libraries.tapandpay.notification.logging.NOTIFICATION_DELETE_INTENT";
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        cjlv cjlv0 = this.a;
        Context context0 = cjlv0.a;
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.pay.notifications.NotificationLoggingIntentOperation", s);
        if(intent0 == null) {
            ((ggsc)cjlv0.b.j().ar(0x17F1)).x("Failed to get the start intent for NotificationLoggingIntentOperation");
            return (PendingIntent)object0;
        }
        gjdg gjdg0 = this.b;
        ibuq.f(gjdg0, "loggingNotificationMetadata");
        ibuq.f(((fsef)object1), "source");
        if(((PendingIntent)object0) != null && ((PendingIntent)object0).isActivity()) {
            throw new IllegalArgumentException("Use addLoggingExtrasToIntentStartsActivity to build the PendingIntent starts an Activity.");
        }
        if(fsee0 == fsee.b) {
            intent0.putExtra("nontranslated_action_button_label", ((fsef)object1).b);
        }
        if(((PendingIntent)object0) != null) {
            intent0.putExtra("inner_intent", ((PendingIntent)object0));
        }
        intent0.putExtra("logging_notification_metadata", gjdg0.toBytesArray());
        return PendingIntent.getService(context0, intent0.hashCode(), intent0, 0x4000000);
    }
}

