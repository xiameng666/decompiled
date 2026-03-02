import android.location.Location;
import j..time.Duration;

public final class bpch implements glzn {
    public final bpcn a;
    public final Location b;
    public final long c;

    public bpch(bpcn bpcn0, Location location0, long v) {
        this.a = bpcn0;
        this.b = location0;
        this.c = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        bpcn bpcn0 = this.a;
        if((((fqze)object0).b & 1) != 0) {
            hfwn hfwn0 = ((fqze)object0).c;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            if(hfyg.d(hfwn0).plus(Duration.ofHours(hsxv.a.y().af())).isBefore(bpcn0.e.d())) {
                goto label_6;
            }
            goto label_9;
        }
    label_6:
        if(!hsww.c() || bpcn0.e.a() >= bpcn0.g) {
            bprs.l(cljp.a(bpcn0.b));
        }
        if((((fqze)object0).b & 1) != 0) {
        label_9:
            for(Object object1: ((fqze)object0).d) {
                if(bpcn.b(((fqzd)object1).c, ((fqzd)object1).d, this.b.getLatitude(), this.b.getLongitude(), this.c)) {
                    return gmbu.i(bpcm.b);
                }
            }
            return gmbu.i(bpcm.c);
        }
        return gmbu.i(bpcm.a);
    }
}

