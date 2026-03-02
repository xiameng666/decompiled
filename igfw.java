import java.io.Serializable;
import java.util.Locale;

public abstract class igfw implements Serializable {
    private static final long serialVersionUID = 0x1B5B33E6C8F3F47DL;

    public abstract long a();

    protected igcm b() {
        throw null;
    }

    public abstract igcp d();

    public final int e() {
        return this.d().a(this.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igfw) ? this.e() == ((igfw)object0).e() && this.h().equals(((igfw)object0).h()) && iggd.g(this.b(), ((igfw)object0).b()) : false;
    }

    public final String f(Locale locale0) {
        return this.d().p(this.a(), locale0);
    }

    public final String g(Locale locale0) {
        return this.d().s(this.a(), locale0);
    }

    public final igcr h() {
        return this.d().v();
    }

    @Override
    public final int hashCode() {
        return this.e() * 17 + this.h().hashCode() + this.b().hashCode();
    }

    @Override
    public final String toString() {
        return "Property[" + this.d().u() + "]";
    }
}

