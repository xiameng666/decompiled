import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class entt implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        int v = ((enyp)object0).c;
        if(v == 1) {
            enys enys0 = (enys)((enyp)object0).d;
            int v1 = enys0.c;
            if(v1 == 5) {
                enza enza0 = ((enzb)enys0.d).e;
                if(enza0 == null) {
                    enza0 = enza.a;
                }
                return gged_interceptors.l((enza0.g == null ? hguv.a : enza0.g));
            }
            if(v1 == 6) {
                hguv hguv0 = ((enyo)enys0.d).c;
                if(hguv0 == null) {
                    hguv0 = hguv.a;
                }
                enyo enyo0 = enys0.c == 6 ? ((enyo)enys0.d) : enyo.a;
                return gged_interceptors.m(hguv0, (enyo0.d == null ? hguv.a : enyo0.d));
            }
            return ggna.a;
        }
        return v == 2 ? ((gged_interceptors)Collection.-EL.stream(((enyx)((enyp)object0).d).b).map(new enth()).collect(ggaf.a)) : ggna.a;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

