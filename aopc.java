import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class aopc implements Consumer {
    @Override
    public final void accept(Object object0) {
        apfc apfc0 = (apfc)object0;
        apez apez0 = new apez(apfc0);
        gmbu.t(apfc0.a.b(apez0, gmap.a), new aopm(), gmap.a);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

