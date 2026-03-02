import j..util.Optional;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqod implements Consumer {
    public final cqpi a;
    public final cqpb b;

    public cqod(cqpi cqpi0, cqpb cqpb0) {
        this.a = cqpi0;
        this.b = cqpb0;
    }

    @Override
    public final void accept(Object object0) {
        cqpi cqpi0 = this.a;
        Optional optional0 = this.b.b;
        if(!cqpi0.ah) {
            cqpi0.W(((cqpc)object0), optional0);
            return;
        }
        cqpi0.Q(((cqpc)object0), hgzp.dz, optional0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

