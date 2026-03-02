import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ehvv implements Consumer {
    public final ehvw a;

    public ehvv(ehvw ehvw0) {
        this.a = ehvw0;
    }

    @Override
    public final void accept(Object object0) {
        evql evql0 = ((emvd)object0).b();
        ehvt ehvt0 = new ehvt(this.a);
        evql0.y(this.a.a, ehvt0);
        ehvu ehvu0 = new ehvu();
        evql0.v(this.a.a, ehvu0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

