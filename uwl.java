import java.util.Comparator;

public final class uwl implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((uwm)object0).a == null) {
            return ((uwm)object1).a == null ? 0 : -1;
        }
        return ((uwm)object1).a == null ? 1 : Integer.compare(((uwm)object0).a(), ((uwm)object1).a());
    }
}

