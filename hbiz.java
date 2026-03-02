import java.util.Arrays;

public final class hbiz {
    public final gged_interceptors a;

    public hbiz(hbix hbix0) {
        this.a = hbix0.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof hbiz) ? bata.b(this.a, ((hbiz)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

