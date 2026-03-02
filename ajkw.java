import android.app.NotificationChannel;
import android.content.Context;

public final class ajkw {
    public final Context a;
    public final bayn b;
    public final Object c;
    public final String d;
    private static ajkw e;

    public ajkw(Context context0) {
        Context context1 = context0.getApplicationContext();
        bayn bayn0 = bayn.f(context0);
        super();
        this.a = context1;
        this.b = bayn0;
        this.c = new Object();
        this.d = "Chromebook";
        bayn0.p(new NotificationChannel("easy-unlock-notification-channel-id", "Smart Lock", 2));
    }

    public static ajkw a(Context context0) {
        synchronized(ajkw.class) {
            if(ajkw.e == null) {
                ajkw.e = new ajkw(context0);
            }
        }
        return ajkw.e;
    }
}

