import java.io.Serializable;

public final class grdf implements Serializable {
    public final String a;

    public grdf() {
        throw null;
    }

    public grdf(String s) {
        if(s == null) {
            throw new NullPointerException("Null value");
        }
        this.a = s;
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof grdf) ? this.a.equals(((grdf)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "*";
    }
}

