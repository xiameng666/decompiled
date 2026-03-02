import java.net.URI;

public final class beko {
    public final URI a;

    public beko(URI uRI0) {
        this.a = uRI0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof beko) ? ibuq.m(this.a, ((beko)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AddedPasswordSignOnRealm(uri=" + this.a + ")";
    }
}

