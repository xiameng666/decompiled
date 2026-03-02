import android.content.Context;
import android.os.SystemClock;
import j..util.Objects;
import java.io.IOException;

public final class czug implements Runnable {
    public final czun a;
    public final Context b;
    public final czql c;

    public czug(czun czun0, Context context0, czql czql0) {
        this.a = czun0;
        this.b = context0;
        this.c = czql0;
    }

    @Override
    public final void run() {
        fgvb fgvb0;
        long v = SystemClock.elapsedRealtime();
        czun czun0 = this.a;
        try {
            Objects.requireNonNull(czun0);
            fgvd fgvd0 = new fgvd();
            fgvb0 = null;
            fgvb0 = czun.l(this.b, this.c.a, czun0.b, this.c.f, fgvd0);
            fgvb0.i(((int)hvog.i()));
        }
        catch(IOException unused_ex) {
        }
        if(hvol.aa()) {
            czkq.a.b().i("[PERFORMANCE] Update Mtu in background took %d ms, success = %s.", Long.valueOf(SystemClock.elapsedRealtime() - v), Boolean.valueOf(fgvb0 != null));
        }
        czun0.j = fgvb0;
        if(czun0.a) {
            fgvb fgvb1 = czun0.j;
            if(fgvb1 != null) {
                fgvb1.d();
            }
        }
    }
}

