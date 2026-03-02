import android.content.Context;
import com.google.wear.services.WearServices;
import com.google.wear.services.migration.MigrationManager;
import java.util.function.Function;

public final class fcvh {
    public static final baun a;
    public final gmcg b;
    private final Context c;

    static {
        fcvh.a = new fcgf(new String[]{"WearServicesRestoreHelper"});
    }

    public fcvh(Context context0, gmcg gmcg0) {
        this.c = context0;
        this.b = gmcg0;
    }

    public final gmcd a(String s, fcvg fcvg0, boolean z, Object object0, Function function0) {
        if(!z) {
            fcvh.a.d("MigrationManager#%s call skipped - device platform version too low", new Object[]{s});
            return gmbu.i(object0);
        }
        Context context0 = this.c;
        if(!bbmq.N(context0, "wear-sdk")) {
            fcvh.a.d("MigrationManager#%s call skipped - wear-sdk system library missing", new Object[]{s});
            return gmbu.i(object0);
        }
        MigrationManager migrationManager0 = (MigrationManager)WearServices.getInstance(context0).getWearManager(MigrationManager.class);
        fcvh.a.d("Calling MigrationManager#%s", new Object[]{s});
        return jqy.a(new fcve(this, fcvg0, migrationManager0, s, function0, object0));
    }
}

