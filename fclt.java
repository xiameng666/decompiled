import j..util.Collection.-EL;
import j..util.stream.Stream;
import java.util.List;

public final class fclt implements evqf {
    public final String a;
    public final evqp b;

    public fclt(String s, evqp evqp0) {
        this.a = s;
        this.b = evqp0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Stream stream0 = Collection.-EL.stream(((List)object0));
        String s = this.a;
        boolean z = stream0.anyMatch(new fclx(s));
        evqp evqp0 = this.b;
        if(z) {
            evqp0.b(null);
            return;
        }
        RuntimeException runtimeException0 = new RuntimeException("Node " + s + " is not connected");
        fcly.a.n("Node %s unreachable", runtimeException0, new Object[]{s});
        evqp0.a(runtimeException0);
    }
}

