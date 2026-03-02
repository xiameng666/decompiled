import java.util.Comparator;

public final class gqlr implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((gqmd)object0).i().compareTo(((gqmd)object1).i());
    }
}

