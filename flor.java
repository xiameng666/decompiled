import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model..AutoValue_Notification;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification.NotificationType;
import com.google.android.libraries.messaging.lighter.model.Notification;
import com.google.android.libraries.messaging.lighter.model.Renotification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public final class flor {
    public static ContentValues a(Notification notification0) {
        HashMap hashMap0 = new HashMap();
        switch(notification0.f().ordinal()) {
            case 0: {
                hashMap0.put("message_received_notification", floq.b(notification0.e()));
                break;
            }
            case 1: {
                Renotification renotification0 = notification0.g();
                HashMap hashMap1 = new HashMap();
                hashMap1.put("CONVERSATION_ID", flod.b(renotification0.b()));
                hashMap1.put("RENOTIFICATION_STATE", Integer.valueOf(renotification0.a()));
                hashMap1.put("MESSAGE_RECEIVED_NOTIFICATIONS", flbp.d(renotification0.d(), new flou()));
                hashMap0.put("renotification", hashMap1);
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("notification_id", ((.AutoValue_Notification)notification0).a);
        contentValues0.put("notification_type", Integer.valueOf(notification0.f().c));
        contentValues0.put("notification_timestamp_received_ms", Long.valueOf(((.AutoValue_Notification)notification0).b));
        try {
            contentValues0.put("notification_metadata", flbm.i(new HashMap(((.AutoValue_Notification)notification0).c.a)));
            contentValues0.put("notification_properties", flbm.i(hashMap0));
            return contentValues0;
        }
        catch(IOException iOException0) {
            flbj.d("NotificationCursors", "Failed to serialize notification data.", iOException0);
            return null;
        }
    }

    public static gfsx b(Cursor cursor0) {
        gfsx gfsx5;
        if(cursor0.getPosition() != -1 || cursor0.moveToFirst()) {
            fmgj fmgj0 = new fmgj();
            fmgj0.b(cursor0.getString(1));
            fmgj0.c(cursor0.getLong(5));
            fmgj0.e(flbm.h(cursor0.getBlob(3)));
            HashMap hashMap0 = flbm.g(cursor0.getBlob(4));
            gfsx gfsx0 = Notification.NotificationType.a(cursor0.getInt(2));
            if(gfsx0.i()) {
                switch(((Notification.NotificationType)gfsx0.d()).ordinal()) {
                    case 0: {
                        goto label_10;
                    }
                    case 1: {
                        goto label_16;
                    }
                }
                return gfsx.m(fmgj0.a());
            label_10:
                gfsx gfsx1 = flbm.b(hashMap0.get("message_received_notification"));
                if(gfsx1.i()) {
                    gfsx gfsx2 = floq.a(((HashMap)gfsx1.d()));
                    if(gfsx2.i()) {
                        fmgj0.d(((MessageReceivedNotification)gfsx2.d()));
                        return gfsx.m(fmgj0.a());
                    label_16:
                        gfsx gfsx3 = flbm.b(hashMap0.get("renotification"));
                        if(!gfsx3.i()) {
                            flbj.c("NotificationCursors", "Failed to cast renotification hash map.");
                            return gfqx.a;
                        }
                        Object object0 = gfsx3.d();
                        try {
                            fmgq fmgq0 = Renotification.e();
                            gfsx gfsx4 = flod.a(((HashMap)((HashMap)object0).get("CONVERSATION_ID")));
                            if(gfsx4.i()) {
                                fmgq0.b(((ConversationId)gfsx4.d()));
                                fmgq0.d(((Integer)((HashMap)object0).get("RENOTIFICATION_STATE")).intValue());
                                fmgq0.c(flbp.c(((ArrayList)((HashMap)object0).get("MESSAGE_RECEIVED_NOTIFICATIONS")), new flot()));
                                gfsx5 = gfsx.m(fmgq0.a());
                            }
                            else {
                                gfsx5 = gfqx.a;
                            }
                        }
                        catch(RuntimeException unused_ex) {
                            flbj.c(flov.a, "failed to convert HashMap to Renotification");
                            gfsx5 = gfqx.a;
                        }
                        if(!gfsx5.i()) {
                            flbj.c("NotificationCursors", "Failed to deserialize renotification hash map.");
                            return gfqx.a;
                        }
                        fmgj0.f(((Renotification)gfsx5.d()));
                        return gfsx.m(fmgj0.a());
                    }
                }
            }
        }
        return gfqx.a;
    }
}

