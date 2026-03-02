final class foxd {
    public final foxk a;
    public final gfsx b;
    public final gfsx c;
    private final gfsx d;
    private final gfsx e;

    public foxd() {
        throw null;
    }

    public foxd(foxk foxk0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3) {
        this.a = foxk0;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = gfsx2;
        this.e = gfsx3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foxd) && this.a.equals(((foxd)object0).a) && this.b.equals(((foxd)object0).b) && this.c.equals(((foxd)object0).c) && this.d.equals(((foxd)object0).d) && this.e.equals(((foxd)object0).e);
    }

    @Override
    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 0xD5009D89 ^ 0x4D5) * 1000003 ^ 2040732332) * 1000003 ^ 2040732332) * 1000003 ^ 2040732332) * 1000003 ^ 2040732332;
    }

    @Override
    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=null, enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent(), perfettoTriggerJankFrameRatioThresholdOverride=Optional.absent(), perfettoTriggerJankDurationThresholdOverride=Optional.absent()}";
    }
}

