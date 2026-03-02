import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class aied extends luw {
    public final Semaphore c;
    private final Set d;

    public aied(Context context0, Set set0) {
        super(context0);
        this.c = new Semaphore(0);
        this.d = set0;
    }

    @Override  // luw
    public final Object loadInBackground() {
        int v = 0;
        for(Object object0: this.d) {
            if(((aztw)object0).o(this)) {
                ++v;
            }
        }
        try {
            this.c.tryAcquire(v, 5L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", interruptedException0);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    @Override  // lvb
    protected final void onStartLoading() {
        this.c.drainPermits();
        this.forceLoad();
    }
}

