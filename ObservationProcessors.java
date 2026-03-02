public final class ObservationProcessors {
    public final BarometerProcessor a;
    public final PositionProcessor b;
    public final MagnetometerProcessor c;
    public final gfsx d;
    public final GenericObservationProcessor e;
    public final GenericObservationProcessor f;

    public ObservationProcessors(BarometerProcessor gpvz0, PositionProcessor gpwa0, GenericObservationProcessor gpvw0, MagnetometerProcessor gpvy0, GenericObservationProcessor gpvw1, gfsx gfsx0) {
        this.a = gpvz0;
        this.b = gpwa0;
        this.e = gpvw0;
        this.c = gpvy0;
        this.f = gpvw1;
        this.d = gfsx0;
    }
}

