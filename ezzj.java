import android.os.RecoverySystem;
import java.io.File;
import java.util.concurrent.Callable;

public final class ezzj implements Callable {
    public final ezzk a;

    public ezzj(ezzk ezzk0) {
        this.a = ezzk0;
    }

    @Override
    public final Object call() {
        ezzk ezzk0;
        try {
            ezzk0 = this.a;
            File file0 = hrnt.i() ? new File(ccsb.a.a(((String)ezzk0.c(ezzk.g)))) : new File(((String)ezzk0.c(ezzk.g)));
            faab.g(file0, true);
            RecoverySystem.installPackage(ezzk0.k, file0);
        }
        catch(Exception exception0) {
            ezzk0.f(exception0);
        }
        return null;
    }
}

