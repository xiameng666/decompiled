import android.location.Location;

public final class bpjo {
    public final Iterable a;
    public final Location b;
    public final gfsx c;

    public bpjo() {
        throw null;
    }

    public bpjo(Iterable iterable0, Location location0, gfsx gfsx0) {
        if(iterable0 == null) {
            throw new NullPointerException("Null advertisements");
        }
        this.a = iterable0;
        if(location0 == null) {
            throw new NullPointerException("Null location");
        }
        this.b = location0;
        this.c = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bpjo) && this.a.equals(((bpjo)object0).a) && this.b.equals(((bpjo)object0).b) && this.c.equals(((bpjo)object0).c);
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "SightingsToAggregate{advertisements=" + this.a.toString() + ", location=" + this.b.toString() + ", account=" + this.c + "}";
    }
}

