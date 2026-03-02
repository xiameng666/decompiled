import android.content.Context;
import com.google.android.gms.fitness.service.maintenance.StoreMaintenanceIntentOperation;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class brld {
    public static void a(Context context0, String s) {
        if(((int)htav.b()) > 0) {
            Set set0 = StoreMaintenanceIntentOperation.a;
            synchronized(set0) {
                set0.add(s);
                if(!set0.isEmpty()) {
                    return;
                }
                bbib bbib0 = new bbib(context0);
                long v1 = TimeUnit.SECONDS.toMillis(htav.b());
                bbib0.k("StoreMaintenanceChimeraService:Trim", 3, v1, v1, StoreMaintenanceIntentOperation.a(context0), "com.google.android.gms");
            }
        }
    }
}

