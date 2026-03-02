import j..util.Map.-EL;
import j..util.function.Consumer.-CC;
import java.util.Map;
import java.util.function.Consumer;

public final class ekdb implements Consumer {
    public final Map a;

    public ekdb(Map map0) {
        this.a = map0;
    }

    @Override
    public final void accept(Object object0) {
        ekcy ekcy0 = new ekcy(((ekde)object0));
        ekdf ekdf0 = (ekdf)Map.-EL.computeIfAbsent(this.a, ((ekde)object0).a, ekcy0);
        String s = ((ekde)object0).b;
        if(ekdf0.c == null || s.compareTo(ekdf0.c) < 0) {
            ekdf0.c = s;
        }
        ekdf0.b.i(Long.valueOf(((ekde)object0).c));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

