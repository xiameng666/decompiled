import com.google.android.gms.location.LocationRequest;

public final class cjgs {
    public final LocationRequest a;

    public cjgs(LocationRequest locationRequest0) {
        this.a = locationRequest0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof cjgs) ? ibuq.m(this.a, ((cjgs)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

