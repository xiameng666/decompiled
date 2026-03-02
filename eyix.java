public final class eyix implements ibts {
    public final eyjw a;
    public final iccs b;
    public final eyce c;

    public eyix(eyjw eyjw0, iccs iccs0, eyce eyce0) {
        this.a = eyjw0;
        this.b = iccs0;
        this.c = eyce0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        this.a.h = eyiz.a;
        ((ggtj)this.a.d.h()).B("relockDistanceCrossedDeferred completed, stopping ranging, changing distanceBasedRelockStatus to %s.", this.a.h);
        eyji eyji0 = new eyji(this.b, this.c, null);
        icbb.b(this.a.c, null, null, eyji0, 3);
        return ibom.a;
    }
}

