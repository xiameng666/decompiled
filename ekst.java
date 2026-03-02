import android.util.Log;

public final class ekst implements Runnable {
    public final eksz a;

    public ekst(eksz eksz0) {
        this.a = eksz0;
    }

    @Override
    public final void run() {
        eksz eksz0 = this.a;
        synchronized(eksz0.h.a) {
            if(!eksz0.e) {
                Log.w("NetworkScheduler.TED", "Enforcing binder timeout for " + eksz0.b.c.toString());
                eksz0.g();
            }
        }
    }
}

