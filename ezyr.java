import android.os.RecoverySystem;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class ezyr implements Callable {
    public final ezyv a;

    public ezyr(ezyv ezyv0) {
        this.a = ezyv0;
    }

    @Override
    public final Object call() {
        try {
            File file0 = hrnt.i() ? new File(ccsb.a.a(((String)this.a.c(ezyv.h)))) : new File(((String)this.a.c(ezyv.h)));
            RecoverySystem.rebootWipeAb(this.a.j, file0, "wipePackage");
        }
        catch(IOException iOException0) {
            ezyv.g.g("Failed to execute RecoverySystem.rebootWipeAb().", iOException0, new Object[0]);
        }
        return null;
    }
}

