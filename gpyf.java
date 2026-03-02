import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class gpyf implements Consumer {
    public final gpyg a;
    public final long b;

    public gpyf(gpyg gpyg0, long v) {
        this.a = gpyg0;
        this.b = v;
    }

    @Override
    public final void accept(Object object0) {
        gpyg gpyg0 = this.a;
        long v = gpyg0.b;
        long v1 = ((icvq)object0).c;
        long v2 = ((icvq)object0).b;
        icvr icvr0 = ((icvq)object0).d;
        if(icvr0 == null) {
            icvr0 = icvr.a;
        }
        float f = icvr0.b;
        icvr icvr1 = ((icvq)object0).d;
        if(icvr1 == null) {
            icvr1 = icvr.a;
        }
        gwbu gwbu0 = gpyd.e(v1, null, v2, f, icvr1.c, this.b);
        gpyg0.a.c(v, ((MessageLite)gwbu0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

