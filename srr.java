import j..util.Objects;
import java.util.Comparator;

final class srr implements Comparator {
    public srr(srt srt0) {
        Objects.requireNonNull(srt0);
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return Integer.valueOf(((srv)object0).a.a).compareTo(Integer.valueOf(((srv)object1).a.a));
    }
}

