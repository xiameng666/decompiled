public final class fuei extends fuek {
    public final fryh a;

    public fuei() {
        this(new fryh(0));
    }

    public fuei(fryh fryh0) {
        ibuq.f(fryh0, "icon");
        super();
        this.a = fryh0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fuei) ? ibuq.m(this.a, ((fuei)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.a;
    }

    @Override
    public final String toString() {
        return "TileStandardEndContentIcon(icon=" + this.a + ")";
    }
}

