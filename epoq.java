final class epoq {
    public final epng a;
    public int b;

    public epoq(epng epng0) {
        ibuq.f(epng0, "place");
        super();
        this.a = epng0;
        this.b = 8;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof epoq)) {
            return false;
        }
        return ibuq.m(this.a, ((epoq)object0).a) ? this.b == ((epoq)object0).b : false;
    }

    @Override
    public final int hashCode() {
        epng epng0 = this.a;
        if(((ProtoLiteMessage)epng0).isImmutable()) {
            return ((ProtoLiteMessage)epng0).s() * 0x1F + this.b;
        }
        int v = epng0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)epng0).s();
            epng0.memoizedHashCode = v;
        }
        return v * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        return "SignificantPlaceTracker(place=" + this.a + ", geofenceState=" + this.b + ")";
    }
}

