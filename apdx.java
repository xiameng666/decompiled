import j..util.function.Function.-CC;
import java.util.function.Function;

public final class apdx implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hheg hheg0 = ((hhem)object0).b;
        if(hheg0 == null) {
            hheg0 = hheg.a;
        }
        hhef hhef0 = hheg0.d == null ? hhef.a : hheg0.d;
        return hhef0.b == 4 ? ((hfhv)hhef0.c).d : hfhv.a.d;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

