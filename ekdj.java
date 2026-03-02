import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.List;
import java.util.function.Function;

public final class ekdj implements Function {
    public final ekdl a;

    public ekdj(ekdl ekdl0) {
        this.a = ekdl0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        List list0 = (List)this.a.a.get(((Long)object0));
        return list0 == null ? null : Collection.-EL.stream(list0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

