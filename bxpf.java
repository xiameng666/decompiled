import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bxpf implements Consumer {
    public final bxps a;

    public bxpf(bxps bxps0) {
        this.a = bxps0;
    }

    @Override
    public final void accept(Object object0) {
        bxpm bxpm0 = (bxpm)object0;
        this.a.c.setCookie(bxpm0.a, bxpm0.b);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

