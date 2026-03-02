import android.app.Notification;

public final class argj implements Runnable {
    public final argm a;

    public argj(argm argm0) {
        this.a = argm0;
    }

    @Override
    public final void run() {
        argm argm0 = this.a;
        if(argm0.d != 3) {
            return;
        }
        Notification notification0 = argm0.c.a();
        argm0.b.a();
        argm0.b.a.w(1, evuh.aC, notification0);
        argm0.d = 2;
    }
}

