import java.util.Comparator;

public final class mte implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((mtf)object0).e && ((mtf)object0).h) {
            return ggbe.b.e(Integer.valueOf(((mtf)object0).k), Integer.valueOf(((mtf)object1).k), mtg.a).e(Integer.valueOf(((mtf)object0).j), Integer.valueOf(((mtf)object1).j), mtg.a).a();
        }
        ggmo ggmo0 = mtg.a.b();
        return ggbe.b.e(Integer.valueOf(((mtf)object0).k), Integer.valueOf(((mtf)object1).k), ggmo0).e(Integer.valueOf(((mtf)object0).j), Integer.valueOf(((mtf)object1).j), ggmo0).a();
    }
}

