import java.util.ArrayDeque;
import java.util.ArrayList;

public class BaseParticleFilter implements IEstimator {
    protected final RandomGenerator i;
    public final ParticleFilterEngine j;
    protected final ArrayList k;
    protected final ArrayList l;
    public final ArrayDeque m;

    public BaseParticleFilter(RandomGenerator gpya0, int v, double f, boolean z, ObserverRegistry gpyo0) {
        gftb.r(v > 0, "numberOfParticles must be greater than 0!");
        this.i = gpya0;
        ParticleFilterEngine gpxv0 = new ParticleFilterEngine(gpya0, v, f, z, gpyo0);
        this.j = gpxv0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayDeque();
        gpxv0.a(this);
    }

    public void processObservation(gpxm_Observation gpxm0) {
        throw null;
    }

    @Override  // IEstimator
    public final void y(double f, ParticlePopulation gpxp0) {
    }
}

