import java.util.concurrent.Callable;

public final class czqo implements Callable {
    public final czqp a;

    public czqo(czqp czqp0) {
        this.a = czqp0;
    }

    @Override
    public final Object call() {
        czqp czqp0 = this.a;
        int v = czqp0.e + 1;
        czqp0.e = v;
        String s = czqp0.b;
        czle czle0 = czuc.a(czqp0.a, czqp0.d, s, czqp0.c, v);
        czuc czuc0 = (czuc)czle0.a.g();
        if(czuc0 == null) {
            czqp0.f = czle0.b;
            if(czqp0.f != gyxo.da) {
                throw new RuntimeException(String.format("Failed to create an outgoing MultiplexBleSocket to %s", gxyf.b(gxye.a, s)));
            }
            czkq.a.b().p("Don\'t retry L2CAP connecting after timeout.", new Object[0]);
            return gfqx.a;
        }
        return gfsx.m(czuc0);
    }
}

