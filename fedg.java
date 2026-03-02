import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fedg implements Function {
    public final fexc a;

    public fedg(fexc fexc0) {
        this.a = fexc0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        fexc fexc0 = this.a;
        int v = 0;
        if(fexc0.c.equals(((fexc)object0).c)) {
            int v1 = (fexc0.d == null ? fexg.a : fexc0.d).b.size();
            fexg fexg0 = ((fexc)object0).d;
            if(fexg0 == null) {
                fexg0 = fexg.a;
            }
            if(v1 == fexg0.b.size()) {
                ggfp ggfp0 = ggfp.G((fexc0.d == null ? fexg.a : fexc0.d).b);
                fexg fexg1 = ((fexc)object0).d;
                if(fexg1 == null) {
                    fexg1 = fexg.a;
                }
                v = ggfp0.equals(ggfp.G(fexg1.b));
            }
        }
        return Boolean.valueOf(((boolean)(v ^ 1)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

