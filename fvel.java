import j..util.Objects;

public final class fvel implements Comparable {
    public final fvek a;
    public final fven b;

    public fvel(int v, int v1, fven fven0) {
        fvek fvek0 = new fvek(v, v1);
        super();
        this.a = fvek0;
        this.b = fven0;
    }

    public final double a() {
        gftb.b(this.b != fven.a, "Signal type must not be unknown.");
        return (double)(((Double)new fvuf(((int)this.b.bQ.D), ((double)this.b.bQ.E)).b));
    }

    public final String b() {
        return "GnssSignalId< satId: " + ("GnssSatelliteId< constellationType: " + this.a.a + ", svid: " + this.a.b + " >") + ", signalType: " + this.b + " >";
    }

    @Override
    public final int compareTo(Object object0) {
        fvel fvel0 = (fvel)object0;
        return ggbe.b.d(this.a, fvel0.a).d(this.b, fvel0.b).a();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvel) ? this.a.equals(((fvel)object0).a) && this.b.equals(((fvel)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}

