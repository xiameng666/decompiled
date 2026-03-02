import com.google.android.gms.findmydevice.spot.locationreporting.LocationAssigningIntentOperation;
import java.util.List;

public final class boyj implements gfsi {
    public final LocationAssigningIntentOperation a;
    public final long b;
    public final long c;
    public final double d;
    public final fqzl e;

    public boyj(LocationAssigningIntentOperation locationAssigningIntentOperation0, long v, long v1, double f, fqzl fqzl0) {
        this.a = locationAssigningIntentOperation0;
        this.b = v;
        this.c = v1;
        this.d = f;
        this.e = fqzl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = ggch.j(((List)object0)).i(new boyt()).l(new boyu()).i(new boyv()).l(new boyw(this.b, this.c, this.d));
        if(!gggq.x(((Iterable)object1))) {
            this.a.k.a(bbdg.iU);
            int v = gggq.b(((Iterable)object1));
            LocationAssigningIntentOperation.a(haea.g, this.e, v);
        }
        return object1;
    }
}

