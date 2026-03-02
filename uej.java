import java.util.ArrayDeque;
import java.util.Queue;

abstract class uej {
    private final Queue a;

    public uej() {
        this.a = new ArrayDeque(20);
    }

    public abstract uev a();

    final uev b() {
        uev uev0 = (uev)this.a.poll();
        return uev0 == null ? this.a() : uev0;
    }

    public final void c(uev uev0) {
        Queue queue0 = this.a;
        if(queue0.size() < 20) {
            queue0.offer(uev0);
        }
    }
}

