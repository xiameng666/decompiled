import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class fecs implements Runnable {
    public final fecw a;
    public final Set b;
    public final String c;

    public fecs(fecw fecw0, Set set0, String s) {
        this.a = fecw0;
        this.b = set0;
        this.c = s;
    }

    @Override
    public final void run() {
        fecw fecw0 = this.a;
        fecw0.d.lock();
        Set set0 = this.b;
        String s = this.c;
        try {
            if(fecw0.b.isPresent()) {
                try {
                    ((glyq)((frli)fecw0.b.get()).b(new fecu(set0, s), gmap.a)).u();
                }
                catch(InterruptedException | ExecutionException exception0) {
                    ffmn.c("AppCatalogData", exception0, "replaceAppCatalogInDiskAsync - nodeId: %s.", new Object[]{s});
                }
            }
        }
        finally {
            fecw0.d.unlock();
        }
    }
}

