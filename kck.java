import android.os.PersistableBundle;
import java.util.concurrent.Executor;

public final class kck implements Runnable {
    public final kcu a;
    public final hjlk b;
    public final djgk c;

    public kck(kcu kcu0, hjlk hjlk0, djgk djgk0) {
        this.a = kcu0;
        this.b = hjlk0;
        this.c = djgk0;
    }

    @Override
    public final void run() {
        PersistableBundle persistableBundle0 = this.b.b();
        Executor executor0 = this.a.f;
        kct kct0 = new kct(this.a, this.c);
        this.a.a.openRangingSession(persistableBundle0, executor0, kct0);
    }
}

