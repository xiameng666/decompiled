import android.app.PendingIntent;
import android.graphics.Bitmap;

public final class cyoy implements Runnable {
    public final cype a;
    public final Bitmap b;
    public final PendingIntent c;
    public final boolean d;

    public cyoy(cype cype0, Bitmap bitmap0, PendingIntent pendingIntent0, boolean z) {
        this.a = cype0;
        this.b = bitmap0;
        this.c = pendingIntent0;
        this.d = z;
    }

    @Override
    public final void run() {
        this.a.e();
        juo juo0 = this.a.a();
        juo0.H(this.b);
        juo0.D(this.a.c("fast_pair_sass_revert_title", new Object[]{this.a.b()}));
        juo0.k(this.a.c((this.d ? "fast_pair_sass_revert_desc_to_no_connection" : "fast_pair_sass_revert_desc"), new Object[0]));
        juo0.h(false);
        juo0.h = this.c;
        this.a.g(123000, juo0.a());
    }
}

