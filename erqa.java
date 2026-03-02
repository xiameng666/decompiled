import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings.System;
import java.util.concurrent.TimeUnit;

public final class erqa {
    public static final int a;
    public final ContentResolver b;
    public int c;
    public boolean d;
    public erpe e;
    private final Context f;

    static {
        erqa.a = (int)TimeUnit.SECONDS.toMillis(0x79L);
    }

    public erqa(Context context0) {
        Context context1 = context0.getApplicationContext();
        this.f = context1;
        this.b = context1.getContentResolver();
    }

    public final void a() {
        erqg.a();
        if(!this.d) {
            return;
        }
        this.d = false;
        int v = Settings.System.getInt(this.b, "screen_off_timeout", 0);
        int v1 = this.c;
        if(v1 > 0 && v == erqa.a) {
            this.b(v1);
        }
        Thread.setDefaultUncaughtExceptionHandler(this.e.a);
    }

    public final void b(int v) {
        Settings.System.putInt(this.b, "screen_off_timeout", v);
    }
}

