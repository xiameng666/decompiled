import android.content.Context;
import com.google.android.gms.ads.identifier.settings.d;
import com.google.android.gms.appset.tasks.DeveloperGroupIdRefreshTaskService;

public final class acnf implements glzn {
    public final DeveloperGroupIdRefreshTaskService a;
    public final Context b;

    public acnf(DeveloperGroupIdRefreshTaskService developerGroupIdRefreshTaskService0, Context context0) {
        this.a = developerGroupIdRefreshTaskService0;
        this.b = context0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        glzd.f(this.a.a, new acng(), acni.a());
        d.d(this.b, "DeveloperIdRefreshTaskFailure", "Developer ID refresh task failed.");
        return gmbu.i(Integer.valueOf(2));
    }
}

