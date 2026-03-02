import android.location.Location;

@ibnh
public final class boyc {
    public final Object a;
    public Location b;
    private Location c;

    public boyc() {
        this.a = new Object();
        this.b = null;
        this.c = null;
    }

    public final Location a(Location location0, long v, gfsx gfsx0) {
        synchronized(this.a) {
            if(!boyf.c(location0)) {
                return this.b;
            }
            if(gfsx0.i() && (this.c == null || (((double)location0.distanceTo(this.c)) > ((double)(((Double)gfsx0.d())))))) {
                this.c = location0;
            }
            if(this.b == null) {
                this.b = location0;
                return location0;
            }
            float f = boyf.a(location0, v);
            float f1 = boyf.a(this.b, v);
            if(f >= f1 && (location0.distanceTo(this.b) <= f + f1 || location0.getElapsedRealtimeNanos() <= this.b.getElapsedRealtimeNanos())) {
                return this.b;
            }
            this.b = location0;
        }
        return location0;
    }

    public final gfsx b() {
        synchronized(this.a) {
        }
        return gfsx.l(this.c).b(new boyb());
    }
}

