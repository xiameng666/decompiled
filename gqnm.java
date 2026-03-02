import java.util.Comparator;

public final class gqnm implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        boolean z = true;
        boolean z1 = 1 == (((hhyh)object0).b & 1);
        if(1 != (((hhyh)object1).b & 1)) {
            z = false;
        }
        return Boolean.compare(z1, z);
    }
}

