import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgsw implements Consumer {
    public final bgtb a;

    public bgsw(bgtb bgtb0) {
        this.a = bgtb0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.a(((Integer)object0).intValue(), gxod.c);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

