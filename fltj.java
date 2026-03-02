public final class fltj {
    private final flti a;

    public fltj() {
        throw null;
    }

    public fltj(flti flti0) {
        this.a = flti0;
    }

    public final fltl a() {
        return ((flso)this.a).a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fltj) ? this.a.equals(((fltj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "CloudUpdate{oneOfType=" + this.a + "}";
    }
}

