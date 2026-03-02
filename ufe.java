import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import jeb.synthetic.FIN;

final class ufe {
    public final Map a;
    public final ufd b;

    public ufe() {
        this.a = new HashMap();
        this.b = new ufd();
    }

    final void a(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        Map map0 = this.a;
        ufc ufc0 = (ufc)map0.get(s);
        uqo.f(ufc0);
        int v1 = ufc0.b;
        if(v1 > 0) {
            ufc0.b = v1 - 1;
            if(v1 - 1 == 0) {
                ufc ufc1 = (ufc)map0.remove(s);
                if(ufc1.equals(ufc0)) {
                    Queue queue0 = this.b.a;
                    __monitor_enter(queue0);
                    int v2 = FIN.finallyOpen$NT();
                    if(queue0.size() < 10) {
                        queue0.offer(ufc1);
                    }
                    FIN.finallyCodeBegin$NT(v2);
                    __monitor_exit(queue0);
                    FIN.finallyCodeEnd$NT(v2);
                    goto label_21;
                }
                throw new IllegalStateException("Removed the wrong lock, expected to remove: " + ufc0.toString() + ", but actually removed: " + ufc1 + ", safeKey: " + s);
            }
        label_21:
            FIN.finallyCodeBegin$NT(v);
            ufc0.a.unlock();
            return;
        }
        throw new IllegalStateException(a.p(v1, s, "Cannot release a lock that is not held, safeKey: ", ", interestedThreads: "));
    }
}

