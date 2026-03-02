public final class PositionProcessor extends GenericObservationProcessor {
    public final gpwd a;
    public final gpwf b;
    public gptu_Position c;

    public PositionProcessor(BaseParticleFilter gpxs0, ProjectionManager gpwz0, flp18Flags_phenotype huqw0) {
        super(gpxs0);
        this.a = new gpwd(gpwz0, huqw0);
        this.b = new gpwf(gpwz0, huqw0);
    }
}

