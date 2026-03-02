import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;

public final class bozl implements kar {
    public final int a;
    public final String b;

    public bozl(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ayvb ayvb0 = ((ayvf)object0).m("SIGHTINGS_PER_BATCH", LocationReportUploadIntentOperation.b);
        ayuy ayuy0 = ayvf.b;
        ayvb0.a(ayvb0.g.a(((long)this.a)), 1L, ayuy0);
        ((ayvf)object0).d("COLLECTED_BATCHES").a(0L, 1L, ayuy0);
        String s = this.b;
        if(s != null) {
            ((ayvf)object0).d(s).a(0L, 1L, ayuy0);
        }
    }
}

