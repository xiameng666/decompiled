import java.util.Arrays;
import java.util.Locale;

public final class fuxi {
    public final fuxh a;
    public final int b;

    public fuxi(fuxh fuxh0, int v) {
        this.a = fuxh0;
        this.b = Math.max(0, Math.min(v, 100));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fuxi) && this.a.equals(((fuxi)object0).a) && this.b == ((fuxi)object0).b;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "DetectedActivityInternal [activityType=%s, confidence=%d]", this.a.name(), ((int)this.b));
    }
}

