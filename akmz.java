import android.util.Log;
import j..util.Objects;
import java.util.Locale;

final class akmz implements Runnable {
    final long a;
    final long b;
    final akna c;
    private int d;

    public akmz(akna akna0, long v, long v1) {
        this.a = v;
        this.b = v1;
        Objects.requireNonNull(akna0);
        this.c = akna0;
        super();
        this.d = 0;
    }

    @Override
    public final void run() {
        boolean z = true;
        ++this.d;
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, ManagingAppInstallLoader] periodic check : " + this.d));
        if(((long)this.d) <= this.a) {
            z = false;
        }
        akna akna0 = this.c;
        if(!akna0.c(z) && !z) {
            akna0.a.postDelayed(this, this.b);
        }
    }
}

