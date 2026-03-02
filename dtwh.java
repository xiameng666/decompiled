import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class dtwh implements Consumer {
    public final dtwk a;
    public final dttk b;

    public dtwh(dtwk dtwk0, dttk dttk0) {
        this.a = dtwk0;
        this.b = dttk0;
    }

    @Override
    public final void accept(Object object0) {
        dtxk dtxk0 = new dtxk(this.a.c, ((gtxg)object0).b, this.b);
        this.a.c.a.execute(dtxk0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

