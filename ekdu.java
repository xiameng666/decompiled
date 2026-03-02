import j..util.Map.-EL;
import j..util.function.Consumer.-CC;
import java.util.Map;
import java.util.function.Consumer;

public final class ekdu implements Consumer {
    public final Map a;

    public ekdu(Map map0) {
        this.a = map0;
    }

    @Override
    public final void accept(Object object0) {
        ekdw ekdw0 = new ekdw(((ekdx)object0));
        ekdy ekdy0 = (ekdy)Map.-EL.computeIfAbsent(this.a, ((ekdx)object0).a, ekdw0);
        String s = ((ekdx)object0).b;
        if(ekdy0.c == null || s.compareTo(ekdy0.c) < 0) {
            ekdy0.c = s;
        }
        ekdy0.b.i(Long.valueOf(((ekdx)object0).c));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

