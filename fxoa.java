import android.location.Location;

public final class fxoa {
    public final Location a;
    public final long b;
    public final int c;

    public fxoa() {
        throw null;
    }

    public fxoa(Location location0, long v, int v1) {
        this.a = location0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxoa) && this.a.equals(((fxoa)object0).a) && this.b == ((fxoa)object0).b && this.c == ((fxoa)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20))) * 1000003;
    }

    @Override
    public final String toString() {
        return "Area{location=" + this.a.getProvider() + ", s2CellId=" + this.b + ", regionId=" + this.c + "}";
    }
}

