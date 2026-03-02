import java.util.Comparator;

public final class fpcr implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return (int)(((fpcj)object0).c - ((fpcj)object1).c);
    }
}

