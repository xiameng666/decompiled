import android.os.MessageQueue.IdleHandler;
import java.util.concurrent.TimeUnit;

public final class fojy implements MessageQueue.IdleHandler {
    public final fokb a;

    public fojy(fokb fokb0) {
        this.a = fokb0;
    }

    @Override  // android.os.MessageQueue$IdleHandler
    public final boolean queueIdle() {
        fojz fojz0 = new fojz(this.a);
        this.a.a.h(fojz0, 7000L, TimeUnit.MILLISECONDS);
        return false;
    }
}

