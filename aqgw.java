import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.common.api.ApiMetadata;

public final class aqgw implements azys {
    public final aqgz a;
    public final BackUpNowConfig b;

    public aqgw(aqgz aqgz0, BackUpNowConfig backUpNowConfig0) {
        this.a = aqgz0;
        this.b = backUpNowConfig0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        asac asac0 = (asac)object0;
        asag asag0 = new asag(this.a, ((evqp)object1));
        asak asak0 = (asak)asac0.H();
        ApiMetadata apiMetadata0 = cclr.a(asac0.r);
        asak0.a(asag0, this.b, apiMetadata0);
    }
}

