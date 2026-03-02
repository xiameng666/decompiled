import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import com.google.android.gms.reminders.notification.HandleTriggerIntentOperation;

public final class ejvb {
    public static final String[] a;
    public final Context b;
    final bbib c;

    static {
        bboh.b("RemindersNS", bbcu.s);
        ejvb.a = new String[]{"_id", "due_date_millis"};
    }

    public ejvb(Context context0) {
        this.b = context0;
        this.c = new bbib(context0);
    }

    public final void a(long v, long v1) {
        this.b(v);
        PendingIntent pendingIntent0 = HandleTriggerIntentOperation.a(this.b, v);
        this.c.l("RemindersNSTIME_REMINDER_ALARM", v1, pendingIntent0);
        this.c(v, Long.valueOf(v1));
    }

    public final void b(long v) {
        PendingIntent pendingIntent0 = HandleTriggerIntentOperation.a(this.b, v);
        this.c.a(pendingIntent0);
        this.c(v, null);
    }

    private final void c(long v, Long long0) {
        ContentValues contentValues0 = new ContentValues();
        if(long0 == null) {
            contentValues0.putNull("trigger_time");
        }
        else {
            contentValues0.put("trigger_time", long0);
        }
        this.b.getContentResolver().update(ContentUris.withAppendedId(ejtv.a, v), contentValues0, null, null);
    }
}

