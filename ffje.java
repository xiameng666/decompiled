import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ffje extends ffee {
    final fdiy c;

    public ffje(fflv fflv0, fdiy fdiy0) {
        this.c = fdiy0;
        Objects.requireNonNull(fflv0);
        super("clearStorage");
    }

    @Override  // ffee
    public final void a() {
        try {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage");
            }
            for(Object object0: ffgm.b) {
                ((ffmd)object0).G();
            }
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage: clearing prefs");
            }
            ffem.a().edit().clear().commit();
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage: killing process");
            }
            System.exit(1);
            this.c.a(Status.b);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "clearStorage: exception during clearing storage: " + exception0.toString());
            this.c.a(Status.d);
        }
    }
}

