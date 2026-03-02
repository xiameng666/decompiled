import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

public final class eifc {
    public final Context a;
    public final eijg b;
    public final eijr c;
    public final Executor d;

    public eifc(Context context0, eijg eijg0, eijr eijr0, Executor executor0) {
        this.a = context0;
        this.b = eijg0;
        this.c = eijr0;
        this.d = executor0;
    }

    public final PendingIntent a() {
        Intent intent0 = new Intent("com.google.android.personalsafety.settings.PERSONAL_SAFETY_SETTINGS").setPackage("com.google.android.gms");
        return cjok.a(this.a, 0, intent0, 0x4000000);
    }
}

