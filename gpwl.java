public final class gpwl extends gpxm_Observation {
    public final gpxm_Observation a;
    public final gpxm_Observation b;

    public gpwl(double f, gpxm_Observation gpxm0, gpxm_Observation gpxm1) {
        super(3, f);
        this.a = gpxm0;
        this.b = gpxm1;
    }

    @Override  // gpxm_Observation
    public final void a(StringBuilder stringBuilder0) {
        double f = 0.0;
        stringBuilder0.append((this.a == null ? 0.0 : this.a.timestamp_));
        stringBuilder0.append(",");
        gpxm_Observation gpxm0 = this.b;
        if(gpxm0 != null) {
            f = gpxm0.timestamp_;
        }
        stringBuilder0.append(f);
    }
}

