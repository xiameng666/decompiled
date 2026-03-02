import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

public final class eqkc implements azys {
    public final D2DDevice a;
    public final String b;
    public final epzo c;
    public final epzz d;

    public eqkc(epzz epzz0, D2DDevice d2DDevice0, String s, epzo epzo0) {
        this.d = epzz0;
        this.a = d2DDevice0;
        this.b = s;
        this.c = epzo0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqjr eqjr0 = (eqjr)object0;
        eqko eqko0 = new eqko(((evqp)object1));
        eqih eqih0 = this.d.e(this.c);
        eqin eqin0 = (eqin)eqjr0.H();
        eqjj eqjj0 = new eqjj(eqko0);
        ApiMetadata apiMetadata0 = cclr.a(eqjr0.r);
        eqin0.f(eqjj0, this.a, this.b, eqih0, apiMetadata0);
    }
}

