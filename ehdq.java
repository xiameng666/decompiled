import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import com.google.android.gms.people.sync.focus.progressupdate.notification.NotificationReceiver;
import java.util.HashMap;
import java.util.Map;

final class ehdq {
    private static final Map a;

    static {
        ehdq.a = new HashMap();
    }

    public static void a(Context context0, efur efur0, ehdv ehdv0) {
        synchronized(ehdq.class) {
            Pair pair0 = new Pair(ehdv0.n().b, ((int)ehdv0.n().c));
            Map map0 = ehdq.a;
            NotificationReceiver notificationReceiver0 = (NotificationReceiver)map0.get(pair0);
            if(notificationReceiver0 == null) {
                NotificationReceiver notificationReceiver1 = new NotificationReceiver(efur0, ehdv0);
                jwe.b(context0, notificationReceiver1, new IntentFilter(ehdv0.h()), 2);
                jwe.b(context0, notificationReceiver1, new IntentFilter(ehdv0.i()), 2);
                map0.put(pair0, notificationReceiver1);
                return;
            }
            notificationReceiver0.a = ehdv0;
        }
    }
}

