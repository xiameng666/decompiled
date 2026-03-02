import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;

public final class fcxx {
    private final Context a;
    private final Executor b;
    private fcxj c;

    public fcxx(Context context0, Executor executor0) {
        this.a = context0;
        this.b = executor0;
    }

    public final fcxj a() {
        if(Log.isLoggable("BugreportConsent", 3)) {
            Log.d("BugreportConsent", "getBugreportWearClient");
        }
        if(this.c == null) {
            this.c = new fcxj(fcfo.d(this.a), this.b);
        }
        return this.c;
    }
}

