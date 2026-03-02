import android.os.MessageQueue.IdleHandler;

public final class gxug implements MessageQueue.IdleHandler {
    public final gxuk a;
    public final gxum b;

    public gxug(gxuk gxuk0, gxum gxum0) {
        this.a = gxuk0;
        this.b = gxum0;
    }

    @Override  // android.os.MessageQueue$IdleHandler
    public final boolean queueIdle() {
        if(this.a.c.hasMessages(0)) {
            return true;
        }
        this.b.run();
        return false;
    }
}

