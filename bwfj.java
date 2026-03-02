import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bwfj implements Consumer {
    public final String a;

    public bwfj(String s) {
        this.a = s;
    }

    @Override
    public final void accept(Object object0) {
        ((ggtj)((ggtj)bwfr.a.j()).s(((Throwable)object0))).B("Storage failure during onAppInstall(%s)", this.a);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

