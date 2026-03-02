import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutionException;

public final class fffd {
    public static fffd a;
    public final Object b;
    public final frli c;

    public fffd(Context context0) {
        this.b = new Object();
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("wearable");
        frce0.e("wearable_prefs.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)ffcp.a));
        frif frif0 = frie0.a();
        this.c = cjtb.a.a(frif0);
    }

    public final ffcp a() {
        synchronized(this.b) {
            try {
                return (ffcp)this.c.a().get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                if(Log.isLoggable("WearPrefHelper", 5)) {
                    Log.w("WearPrefHelper", String.format("Unable to read from prefs data store. Using default. Error: %s", exception0.getLocalizedMessage()));
                }
                return ffcp.a;
            }
        }
    }

    public final Boolean b() {
        return (this.a().b & 1) == 0 ? null : Boolean.valueOf(this.a().c);
    }
}

