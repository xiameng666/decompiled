import android.os.SystemClock;
import java.io.IOException;

public final class bmaw implements Runnable {
    public final bmaz a;

    public bmaw(bmaz bmaz0) {
        this.a = bmaz0;
    }

    @Override
    public final void run() {
        try {
            long v = SystemClock.elapsedRealtime();
            this.a.c.a.connect();
            this.a.c.b();
            ((ggtj)bmaz.a.h()).L("Connected in %d ms. I/O timeout: %s ms", SystemClock.elapsedRealtime() - v, Integer.valueOf(this.a.c.a.getTimeout()));
        }
        catch(IOException iOException0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = iOException0;
            throw new gmdd(bxly0.a());
        }
    }
}

