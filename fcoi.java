import android.util.Pair;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcoi implements Consumer {
    public final fcok a;
    public final ghyr b;
    public final ProtoLiteBuilder c;

    public fcoi(fcok fcok0, ProtoLiteBuilder hftp0, ghyr ghyr0) {
        this.a = fcok0;
        this.c = hftp0;
        this.b = ghyr0;
    }

    @Override
    public final void accept(Object object0) {
        fcok fcok0 = this.a;
        ProtoLiteBuilder hftp0 = this.c;
        ghyr ghyr0 = this.b;
        if(((Boolean)object0).booleanValue()) {
            fcok0.f(hftp0, ghyr0);
            return;
        }
        Pair pair0 = Pair.create(hftp0, ghyr0);
        fcok0.b.add(pair0);
        fcoh fcoh0 = new fcoh(fcok0);
        if(fcok0.c.getAndSet(fcoh0) == null) {
            fcok0.a.ct(fcoh0);
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

