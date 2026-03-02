import android.util.Log;
import j..util.DesugarCollections;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class fdps implements Runnable {
    public final fdpy a;
    public final fdpq b;
    public final ffau c;

    public fdps(fdpy fdpy0, fdpq fdpq0, ffau ffau0) {
        this.a = fdpy0;
        this.b = fdpq0;
        this.c = ffau0;
    }

    @Override
    public final void run() {
        fezj fezj0 = this.c.e == null ? fezj.a : this.c.e;
        fdpq fdpq0 = this.b;
        if(DesugarCollections.unmodifiableMap(fdpq0.a).containsKey(fezj0.e)) {
            if(!Log.isLoggable("assets", 3)) {
                return;
            }
            Log.d("assets", "handleFetchAsset: [" + fezj0.c + "," + fezj0.d + "] " + fezj0.e + ", ignoring fetch because asset is already in send queue");
            return;
        }
        fdpy fdpy0 = this.a;
        fdpl fdpl0 = fdpl.a(fezj0.c, fezj0.d);
        AtomicReference atomicReference0 = fdpy0.c;
        Set set0 = ((fdvl)atomicReference0.get()).C(fezj0.e);
        File file0 = null;
        if(!set0.contains(fdpl0)) {
            if(Log.isLoggable("assets", 3)) {
                Log.d("assets", "Fetched asset is missing (sending empty response): " + fdpl0.toString() + ", " + fezj0.e);
            }
            if(hzvs.a.b().f()) {
                fdpq0.a(fezj0.e, null, new HashSet());
            }
            return;
        }
        if(!fezj0.f) {
            file0 = ((fdvl)atomicReference0.get()).q(fezj0.e);
            if(file0 != null) {
                fdpy.l(fezj0.e, file0, set0, "handleFetchAsset", fdpy0.b);
            }
            else if(Log.isLoggable("assets", 3)) {
                Log.d("assets", "handleFetchAsset: " + fdpl0.toString() + ", " + fezj0.e + ", no FD returned, no permission?");
            }
        }
        else if(Log.isLoggable("assets", 3)) {
            Log.d("assets", "handleFetchAsset: " + fdpl0.toString() + ", " + fezj0.e + ", permission check, not loading data");
        }
        fdpq0.a(fezj0.e, file0, set0);
        fdpy.k(4, set0, file0);
    }
}

