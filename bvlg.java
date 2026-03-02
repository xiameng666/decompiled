import java.util.Comparator;

public final class bvlg implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        clob clob0 = (clob)object0;
        clob clob1 = (clob)object1;
        ibuq.f(clob0, "a");
        ibuq.f(clob1, "b");
        return clob0.c.compareTo(clob1.c);
    }
}

