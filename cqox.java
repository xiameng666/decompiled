import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqox implements Consumer {
    public final cqoy a;
    public final cqpb b;

    public cqox(cqoy cqoy0, cqpb cqpb0) {
        this.a = cqoy0;
        this.b = cqpb0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.a.Q(((cqpc)object0), hgzp.dy, this.b.b);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

