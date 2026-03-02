import java.util.List;
import java.util.Map;

public final class bgod {
    public final List a;
    public final Map b;

    public bgod(List list0, Map map0) {
        this.a = list0;
        this.b = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bgod)) {
            return false;
        }
        return ibuq.m(this.a, ((bgod)object0).a) ? ibuq.m(this.b, ((bgod)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ConflictDetectionResult(noConflicts=" + this.a + ", conflictsWithExisting=" + this.b + ")";
    }
}

