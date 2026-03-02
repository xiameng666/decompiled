import java.net.URI;

public final class bekn {
    public final URI a;

    public bekn(URI uRI0) {
        this.a = uRI0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bekn) ? ibuq.m(this.a, ((bekn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AddedPasswordOrigin(uri=" + this.a + ")";
    }
}

