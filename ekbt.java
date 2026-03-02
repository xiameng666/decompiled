import j..util.Map.-EL;
import j..util.function.Consumer.-CC;
import java.util.Map;
import java.util.function.Consumer;

public final class ekbt implements Consumer {
    public final Map a;

    public ekbt(Map map0) {
        this.a = map0;
    }

    @Override
    public final void accept(Object object0) {
        ekbp ekbp0 = new ekbp(((ekbv)object0));
        ekbw ekbw0 = (ekbw)Map.-EL.computeIfAbsent(this.a, ((ekbv)object0).a, ekbp0);
        String s = ((ekbv)object0).b;
        if(ekbw0.c == null || s.compareTo(ekbw0.c) < 0) {
            ekbw0.c = s;
        }
        ekbw0.b.i(Long.valueOf(((ekbv)object0).c));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

