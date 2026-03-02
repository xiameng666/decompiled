import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification.NotificationType;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.Renotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;

public final class flmn implements Callable {
    public final flmu a;
    public final ConversationId b;
    public final String c;
    public final gfsi d;
    public final MessageReceivedNotification e;

    public flmn(flmu flmu0, ConversationId conversationId0, String s, gfsi gfsi0, MessageReceivedNotification messageReceivedNotification0) {
        this.a = flmu0;
        this.b = conversationId0;
        this.c = s;
        this.d = gfsi0;
        this.e = messageReceivedNotification0;
    }

    @Override
    public final Object call() {
        Object object0;
        ConversationId conversationId0 = this.b;
        flbj.a("SQLiteMessagingStore", "Querying for existing renotification entry for conversation: " + conversationId0);
        flmu flmu0 = this.a;
        String s = this.c;
        gfsx gfsx0 = flmu0.u(s);
        boolean z = false;
        if(gfsx0.i()) {
            flbj.a("SQLiteMessagingStore", "Existing renotification entry found.");
            object0 = gfsx0.d();
        }
        else {
            flbj.a("SQLiteMessagingStore", "No renotification entry found, creating basic entry.");
            fmgj fmgj0 = new fmgj();
            fmgj0.b(s);
            flba.a();
            fmgj0.c(System.currentTimeMillis());
            fmgq fmgq0 = Renotification.e();
            fmgq0.b(conversationId0);
            fmgq0.d(0);
            fmgj0.f(fmgq0.a());
            fmgj0.e(new HashMap());
            object0 = fmgj0.a();
        }
        if(((Notification)object0).f() == Notification.NotificationType.b && ((Notification)object0).g() != null) {
            MessageReceivedNotification messageReceivedNotification0 = this.e;
            fmgj fmgj1 = new fmgj(((Notification)object0));
            flba.a();
            fmgj1.c(System.currentTimeMillis());
            fmgq fmgq1 = ((Notification)object0).g().c();
            flbj.a("SQLiteMessagingStore", "Updating renotification state");
            Integer integer0 = ((Notification)object0).g().a();
            fmgq1.d(((Integer)this.d.apply(integer0)).intValue());
            if(messageReceivedNotification0 != null) {
                ArrayList arrayList0 = new ArrayList();
                gged_interceptors gged0 = ((Notification)object0).g().d();
                int v = gged0.size();
                boolean z1 = false;
                for(int v1 = 0; v1 < v; ++v1) {
                    MessageReceivedNotification messageReceivedNotification1 = (MessageReceivedNotification)gged0.get(v1);
                    if(messageReceivedNotification1.i().equals(messageReceivedNotification0.i())) {
                        if(messageReceivedNotification1.a() > messageReceivedNotification0.a()) {
                            flbj.a("SQLiteMessagingStore", String.format(Locale.US, "Message data update ignored, cannot regress message state from %d to %d.", messageReceivedNotification1.a(), messageReceivedNotification0.a()));
                            arrayList0.add(messageReceivedNotification1);
                        }
                        else {
                            arrayList0.add(messageReceivedNotification0);
                            flbj.a("SQLiteMessagingStore", "Message data updated");
                        }
                        z1 = true;
                    }
                    else {
                        arrayList0.add(messageReceivedNotification1);
                    }
                }
                if(!z1) {
                    arrayList0.add(messageReceivedNotification0);
                    flbj.a("SQLiteMessagingStore", "Message data inserted");
                    z = true;
                }
                Collections.sort(arrayList0, new fmgi());
                fmgq1.c(gged_interceptors.i(arrayList0));
            }
            fmgj1.f(fmgq1.a());
            Uri uri0 = flmu0.l("notifications");
            ContentValues contentValues0 = flor.a(fmgj1.a());
            if(flmu0.e.c(uri0, contentValues0, 5) < 0L) {
                throw new SQLiteException("Failed to save notification.");
            }
            flbj.a("SQLiteMessagingStore", "Saved renotification");
            flmu0.R();
            return Boolean.valueOf(z);
        }
        flbj.c("SQLiteMessagingStore", "Notification entry is not of type RENOTIFICATION.");
        return Boolean.valueOf(false);
    }
}

