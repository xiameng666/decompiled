import java.util.Comparator;

public final class ewjj implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ibuq.f(((String)object0), "name1");
        ibuq.f(((String)object1), "name2");
        if(((String)object0).length() == 0 && ((String)object1).length() == 0) {
            return 0;
        }
        if(((String)object0).length() == 0) {
            return 1;
        }
        return ((String)object1).length() == 0 ? -1 : ((String)object0).compareTo(((String)object1));
    }
}

