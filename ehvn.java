import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ehvn implements Consumer {
    public final ehvw a;

    public ehvn(ehvw ehvw0) {
        this.a = ehvw0;
    }

    @Override
    public final void accept(Object object0) {
        evql evql0 = ((emvd)object0).c();
        ehvo ehvo0 = new ehvo(this.a);
        evql0.y(this.a.a, ehvo0);
        ehvp ehvp0 = new ehvp();
        evql0.v(this.a.a, ehvp0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

