import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ekef implements Consumer {
    public final ekbz a;

    public ekef(ekbz ekbz0) {
        this.a = ekbz0;
    }

    @Override
    public final void accept(Object object0) {
        Long long0 = ((ekek)object0).a();
        ggdy ggdy0 = (ggdy)this.a.b.get(long0);
        gged_interceptors gged0 = ggdy0 == null ? ggna.a : ggdy0.h();
        if(gged0 == null) {
            throw new NullPointerException("Null appContactData");
        }
        ((ekek)object0).i = gged0;
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

