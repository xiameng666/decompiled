import java.util.Comparator;

public final class dayz implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return gfqz.e(((heax)object0).n, ((heax)object1).n) ? Long.compare(((heax)object0).c, ((heax)object1).c) : ((heax)object0).n.compareToIgnoreCase(((heax)object1).n);
    }
}

