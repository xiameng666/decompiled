import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;

public final class dtvk implements dtvt {
    @Override  // dtvt
    public final PendingIntent a(Context context0, String s, hkoy hkoy0) {
        Intent intent0 = dlnf.T(s, context0);
        TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.create(context0).addNextIntent(dtyr.a);
        dtyr.a(intent0, s, hkoy0);
        return taskStackBuilder0.addNextIntent(intent0).getPendingIntent(0, 0xC000000);
    }
}

