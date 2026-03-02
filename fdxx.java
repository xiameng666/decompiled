import android.util.Log;
import j..util.Objects;

public final class fdxx implements Runnable {
    final fdxz a;

    public fdxx(fdxz fdxz0) {
        Objects.requireNonNull(fdxz0);
        this.a = fdxz0;
        super();
    }

    @Override
    public final void run() {
        try {
            fdxz fdxz0 = this.a;
            jwe.b(fdxz0.b, fdxz0.e, fdxz.a, 4);
            fdxz0.d();
            if(Log.isLoggable("pairingservice", 2)) {
                Log.v("pairingservice", "processEnrolledDataItem");
            }
            String s = fdxz0.f.a().a;
            fcez fcez0 = fdur.c(((fdvl)fdxz0.d.get()), s, "/enrolled");
            if(fcez0 != null) {
                fdxz0.f(fcez0);
            }
        }
        catch(Exception exception0) {
            Log.e("pairingservice", "start crashed", exception0);
        }
    }
}

