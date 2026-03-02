public final class cjgy {
    private final gwrv a;

    public cjgy(gwrv gwrv0) {
        ibuq.f(gwrv0, "gnssData");
        super();
        this.a = gwrv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof cjgy) ? ibuq.m(this.a, ((cjgy)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        gwrv gwrv0 = this.a;
        if(((ProtoLiteMessage)gwrv0).isImmutable()) {
            return ((ProtoLiteMessage)gwrv0).s();
        }
        int v = gwrv0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)gwrv0).s();
            gwrv0.memoizedHashCode = v;
        }
        return v;
    }

    @Override
    public final String toString() {
        return "GnssMeasurementsEvent(gnssData=" + this.a + ")";
    }
}

