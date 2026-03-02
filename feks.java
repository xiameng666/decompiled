import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class feks implements Consumer {
    public final felm a;

    public feks(felm felm0) {
        this.a = felm0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.c.a(((fczq)object0).b);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

