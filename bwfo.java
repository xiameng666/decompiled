import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bwfo implements Consumer {
    public final String a;

    public bwfo(String s) {
        this.a = s;
    }

    @Override
    public final void accept(Object object0) {
        ((ggtj)((ggtj)bwfr.a.j()).s(((Throwable)object0))).B("Storage failure during trackAppInstall(%s, session)", this.a);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

