import j..util.Objects;
import java.util.List;

final class dvjh {
    public final String a;
    public final List b;

    public dvjh(String s, List list0) {
        this.a = s;
        this.b = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof dvjh) && Objects.equals(this.a, ((dvjh)object0).a) && Objects.equals(this.b, ((dvjh)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}

