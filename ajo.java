import j..util.Objects;
import java.util.List;

public final class ajo extends ajk {
    public final boolean a;
    public final List b;

    public ajo(boolean z, List list0) {
        this.a = z;
        this.b = (List)Objects.requireNonNull(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ajo) ? Objects.equals(Boolean.valueOf(this.a), Boolean.valueOf(((ajo)object0).a)) && Objects.equals(this.b, ((ajo)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override
    public final String toString() {
        return "{indexNestedProperties: " + this.a + ", indexableNestedPropertiesList: " + this.b + "}";
    }
}

