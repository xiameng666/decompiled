import java.util.Locale;

public final class cqgz {
    public final cqgx a;
    public final cqgy b;

    public cqgz() {
        throw null;
    }

    public cqgz(cqgx cqgx0, cqgy cqgy0) {
        if(cqgx0 == null) {
            throw new NullPointerException("Null taskId");
        }
        this.a = cqgx0;
        if(cqgy0 == null) {
            throw new NullPointerException("Null scheduleType");
        }
        this.b = cqgy0;
    }

    public final String a() {
        return String.format(Locale.ROOT, "%d%s%s", ((int)this.a.e), Character.valueOf('_'), this.b.c);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof cqgz) && this.a.equals(((cqgz)object0).a) && this.b.equals(((cqgz)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return this.a.e + " " + this.b.toString() + " (" + this.a() + ")";
    }
}

