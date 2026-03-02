import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;

public final class dtvq implements dtvt {
    @Override  // dtvt
    public final PendingIntent a(Context context0, String s, hkoy hkoy0) {
        TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.create(context0);
        dtyr.a(dtyr.a, s, hkoy0);
        return taskStackBuilder0.addNextIntent(dtyr.a).getPendingIntent(0, 0xC000000);
    }
}

