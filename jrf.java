import java.util.Comparator;

final class jrf implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((jri)object0).c - ((jri)object1).c;
    }
}

