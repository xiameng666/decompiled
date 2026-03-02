import android.location.Location;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationAssigningIntentOperation;

public final class boyg implements glzn {
    public final LocationAssigningIntentOperation a;
    public final long b;

    public boyg(LocationAssigningIntentOperation locationAssigningIntentOperation0, long v) {
        this.a = locationAssigningIntentOperation0;
        this.b = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbx.a;
        }
        LocationAssigningIntentOperation locationAssigningIntentOperation0 = this.a;
        Location location0 = (Location)((gfsx)object0).d();
        gmcd gmcd0 = locationAssigningIntentOperation0.i.a(location0);
        gmcd gmcd1 = hsxo.h() ? gdta.g(locationAssigningIntentOperation0.f.f()).h(new boyz(), gmap.a) : gmbu.i(Boolean.valueOf(false));
        gdta gdta0 = gdtd.h(new gmcd[]{gmcd0, gmcd1}).b(new boyl(locationAssigningIntentOperation0, gmcd0, gmcd1, location0, this.b), locationAssigningIntentOperation0.l);
        boym boym0 = new boym();
        return gdta0.f(Throwable.class, boym0, gmap.a).i(new boyn(locationAssigningIntentOperation0), locationAssigningIntentOperation0.l);
    }
}

