final class fxjb {
    public final long a;
    public final long b;

    public fxjb() {
        throw null;
    }

    public fxjb(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxjb) && this.a == ((fxjb)object0).a && this.b == ((fxjb)object0).b;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) ^ (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ArwMessageHandlerParam{maxAlertLatencyMillis=" + this.a + ", clockInversionToleranceMillis=" + this.b + "}";
    }
}

