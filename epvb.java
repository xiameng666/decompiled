import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class epvb implements Consumer {
    public final epvc a;
    public final bxod b;

    public epvb(epvc epvc0, bxod bxod0) {
        this.a = epvc0;
        this.b = bxod0;
    }

    @Override
    public final void accept(Object object0) {
        bxof bxof0 = (bxof)object0;
        Class class0 = bxof0.a.getClass();
        bxnj bxnj0 = (bxnj)epvc.a.get(class0);
        gftb.check(bxnj0);
        gixr gixr0 = bxok.a(bxnj0, bxof0, this.a.l);
        this.b.a(gixr0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

