import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgsi implements Consumer {
    @Override
    public final void accept(Object object0) {
        ((evpn)object0).a();
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

