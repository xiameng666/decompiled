import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;
import java.util.Map;

final class ctgt implements icih {
    final Map a;
    final ctvf b;
    final ctva c;

    public ctgt(Map map0, ctvf ctvf0, ctva ctva0) {
        this.a = map0;
        this.b = ctvf0;
        this.c = ctva0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((ctpc)object0) instanceof ctoy)) {
            QuickAccessDevice quickAccessDevice0 = new QuickAccessDevice(((ctoy)(((ctpc)object0))).a.g(), ((ctoy)(((ctpc)object0))).a.f());
            this.a.put(quickAccessDevice0.a, quickAccessDevice0);
            this.b.b.put(quickAccessDevice0.a, ((ctoy)(((ctpc)object0))).a);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.dr);
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, quickAccessDevice0);
            wbz.f(parcel0, apiMetadata0);
            this.c.jq(1, parcel0);
            return ibom.a;
        }
        if((((ctpc)object0) instanceof ctoz)) {
            String s = ((ctoz)(((ctpc)object0))).a.g();
            this.b.b.remove(s);
            String s1 = ((ctoz)(((ctpc)object0))).a.g();
            QuickAccessDevice quickAccessDevice1 = (QuickAccessDevice)this.a.remove(s1);
            if(quickAccessDevice1 != null) {
                ApiMetadata apiMetadata1 = cckf.d(bbdp.dr);
                this.c.a(quickAccessDevice1, apiMetadata1);
            }
        }
        return ibom.a;
    }
}

