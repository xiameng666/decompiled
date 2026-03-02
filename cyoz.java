import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;

public final class cyoz implements Runnable {
    public final cype a;
    public final Bitmap b;
    public final PendingIntent c;

    public cyoz(cype cype0, Bitmap bitmap0, PendingIntent pendingIntent0) {
        this.a = cype0;
        this.b = bitmap0;
        this.c = pendingIntent0;
    }

    @Override
    public final void run() {
        this.a.e();
        juo juo0 = this.a.a();
        juo0.H(this.b);
        juo0.D(this.a.c("fast_pair_sass_onboard_title", new Object[0]));
        Object[] arr_object = {this.a.b()};
        juo0.k(this.a.c("fast_pair_sass_onboard_desc", arr_object));
        juo0.h(true);
        juo0.h = this.c;
        Notification notification0 = juo0.a();
        this.a.g(123003, notification0);
    }
}

