import java.util.Locale;

public final class jig {
    public final Locale a;

    public jig(Locale locale0) {
        this.a = locale0;
    }

    public final String a() {
        return this.a.toLanguageTag();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof jig)) {
            return false;
        }
        return this == object0 ? true : ibuq.m(this.a(), ((jig)object0).a());
    }

    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }

    @Override
    public final String toString() {
        return this.a();
    }
}

