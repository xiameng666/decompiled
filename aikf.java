import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aikf {
    azts a;
    private final Context b;

    public aikf(Context context0) {
        this.b = context0;
    }

    public final aike a() {
        if(this.a == null) {
            this.a = new azts(this.b, null);
        }
        if(!azts.ci(this.b)) {
            return new aike(false, false);
        }
        try {
            return new aike(true, ((ezco)evrg.o(this.a.cg(), 5L, TimeUnit.SECONDS)).b);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return new aike(true, false);
        }
    }
}

