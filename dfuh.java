import java.util.Comparator;

public final class dfuh implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.compare(((dfui)object0).a.a, ((dfui)object1).a.a);
    }
}

