import com.google.android.gms.chromesync.zeroparty.ChromeSyncState;

public final class beev {
    public final lqi a;
    public final lqd b;
    public final azts c;

    public beev(azts azts0) {
        this.c = azts0;
        lqi lqi0 = new lqi();
        this.a = lqi0;
        this.b = lsa.b(lqi0, new beel());
    }

    public final evql a() {
        evql evql0 = this.c.Y();
        evql0.b(new beer(new beeq(this)));
        return evql0;
    }

    public final gfsx b() {
        bedv bedv0 = (bedv)this.a.ij();
        return bedv0 == null ? gfqx.a : gfsx.l(bedv0.b).b(new been(new beem())).b(new beep(new beeo()));
    }

    public static Object c(beev beev0, ibrl ibrl0) {
        lqi lqi0 = beev0.a;
        if(bedv.d(((bedv)lqi0.ij()))) {
            bedv bedv0 = (bedv)lqi0.ij();
            Object object0 = bedv0 == null ? null : ((ChromeSyncState)bedv0.b);
            if(object0 != null) {
                return object0;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return ictn.b(beev0.a(), ibrl0);
    }
}

