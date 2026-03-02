import j..lang.Iterable.-EL;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcoj implements Consumer {
    public final fcok a;

    public fcoj(fcok fcok0) {
        this.a = fcok0;
    }

    @Override
    public final void accept(Object object0) {
        fcok fcok0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            fcof fcof0 = new fcof(fcok0);
            Iterable.-EL.forEach(fcok0.b, fcof0);
        }
        fcok0.b.clear();
        faij faij0 = (faij)fcok0.c.getAndSet(null);
        if(faij0 != null) {
            fcok0.a.cv(faij0);
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

