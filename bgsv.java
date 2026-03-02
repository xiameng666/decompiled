import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgsv implements Consumer {
    public final bgtb a;

    public bgsv(bgtb bgtb0) {
        this.a = bgtb0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.a(((Integer)object0).intValue(), gxod.d);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

