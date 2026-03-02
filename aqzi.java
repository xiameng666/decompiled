import android.os.AsyncTask;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

public final class aqzi {
    private final Set a;
    private final Executor b;

    public aqzi(Executor executor0) {
        this.a = new HashSet();
        gftb.check(executor0);
        this.b = executor0;
    }

    public final void a() {
        for(Object object0: this.a) {
            ((AsyncTask)object0).cancel(true);
        }
    }

    public final void b(aqzl aqzl0) {
        aqzh aqzh0 = new aqzh(aqzl0, this.a);
        this.a.add(aqzh0);
        aqzh0.executeOnExecutor(this.b, new Void[0]);
    }
}

