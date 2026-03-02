import java.util.Comparator;

public final class clmi implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((clme)object0).c, ((clme)object1).c);
    }
}

