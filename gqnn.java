import java.util.Comparator;

public final class gqnn implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        boolean z = true;
        boolean z1 = 1 == (((hhyo)object0).b & 1);
        if(1 != (((hhyo)object1).b & 1)) {
            z = false;
        }
        return Boolean.compare(z1, z);
    }
}

