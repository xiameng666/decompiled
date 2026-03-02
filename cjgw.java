import com.google.android.gms.libs.location.validation.platform.GnssLocationListener;
import com.google.android.gms.location.fused.engine.controllers.GnssProviderController..ExternalSyntheticLambda0;
import java.util.List;
import java.util.function.Consumer;

final class cjgw extends ibuo implements ibts {
    public cjgw(Object object0) {
        super(1, object0, cjgx.class, "onLocationsChanged", "onLocationsChanged(Ljava/util/List;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Consumer consumer0;
        GnssLocationListener gnssLocationListener0;
        ibuq.f(((List)object0), "p0");
        cjgx cjgx0 = (cjgx)this.e;
        synchronized(cjgx0) {
            gnssLocationListener0 = cjgx0.e;
        }
        if(gnssLocationListener0 != null) {
            List list0 = cjhp.d(((List)object0));
            cmve_GNSS cmve0 = ((GnssProviderController..ExternalSyntheticLambda0)gnssLocationListener0).a;
            synchronized(cmve0) {
                if(cjgx0 != cmve0.b) {
                    return ibom.a;
                }
                consumer0 = cmve0.a;
            }
            if(consumer0 != null) {
                consumer0.accept(list0);
            }
        }
        return ibom.a;
    }
}

