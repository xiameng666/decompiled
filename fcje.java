import java.util.function.Function;

public final class fcje implements evqk {
    public final Function a;
    public final Parser b;

    public fcje(Function function0, Parser hfvs0) {
        this.a = function0;
        this.b = hfvs0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        hftc hftc0 = hftc.a();
        Object object1 = this.b.p(((byte[])object0), hftc0);
        return (evql)this.a.apply(object1);
    }
}

