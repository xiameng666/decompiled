import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.reminders.notification.ScheduleTimeRemindersIntentOperation;
import java.util.HashMap;
import java.util.HashSet;
import jeb.synthetic.TWR;

public final class ejva implements Runnable {
    public static final String a;
    public static final String[] b;
    private static final bboh c;
    private final Context d;
    private final Cursor e;

    static {
        ejva.c = bboh.b("RemindersNS", bbcu.s);
        ejva.a = a.T(ejxd.a, "archived != 1 AND deleted != 1 AND (recurrence_master IS NULL OR recurrence_master=0) AND task_list IN (", ",", ")");
        ejva.b = new String[]{"_id", "trigger_time", "pinned", "archived", "deleted", "due_date_millis", "task_list", "recurrence_master", "due_date_absolute_time_ms"};
    }

    public ejva(Context context0, Cursor cursor0) {
        this.d = context0;
        this.e = cursor0;
    }

    @Override
    public final void run() {
        Cursor cursor0 = this.e;
        if(cursor0 != null) {
            long v = ejxd.b(System.currentTimeMillis());
            HashMap hashMap0 = new HashMap();
            HashSet hashSet0 = new HashSet();
            try {
                while(cursor0.moveToNext()) {
                    long v1 = cursor0.getLong(0);
                    ejxe.c(cursor0, 2);
                    boolean z = ejxe.c(cursor0, 4);
                    boolean z1 = ejxe.c(cursor0, 3);
                    boolean z2 = ejxe.c(cursor0, 7);
                    Integer integer0 = ejxe.a(cursor0, 6);
                    Long long0 = ejxe.b(cursor0, 5);
                    Long long1 = ejxe.b(cursor0, 1);
                    Long long2 = v1;
                    try {
                        if(!z && !z1 && !z2 && integer0 != null && ejxd.f(integer0.intValue())) {
                            if(long0 == null) {
                                hashSet0.add(long2);
                            }
                            else {
                                if(long0.equals(long1)) {
                                    continue;
                                }
                                if(((long)long0) > System.currentTimeMillis() - hxsx.f() && ((long)long0) < v) {
                                    hashMap0.put(long2, long0);
                                }
                                else {
                                    hashSet0.add(long2);
                                }
                            }
                            continue;
                        }
                        hashSet0.add(long2);
                    }
                    catch(Exception exception0) {
                        ((ggtj)((ggtj)((ggtj)ejva.c.i()).s(exception0)).ar(0x3417)).L("Failed to handle reminder %d, continuing with other reminders %s", v1, ejxg.a());
                    }
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(this.e, throwable0);
                throw throwable0;
            }
            this.e.close();
            if(!hashMap0.isEmpty()) {
                Intent intent0 = IntentOperation.getStartIntent(this.d, ScheduleTimeRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_BY_IDS");
                intent0.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS_AND_TRIGGER_TIME", hashMap0);
                this.d.startService(intent0);
            }
            if(!hashSet0.isEmpty()) {
                Intent intent1 = IntentOperation.getStartIntent(this.d, ScheduleTimeRemindersIntentOperation.class, "com.google.android.gms.reminders.notification.ACTION_TIME_REMINDERS_SCHEDULE_UNSCHEDULE_BY_IDS");
                intent1.putExtra("SCHEDULE_TIME_REMINDERS_EXTRA_REMINDER_IDS", bbmt.h(hashSet0));
                this.d.startService(intent1);
            }
        }
    }
}

