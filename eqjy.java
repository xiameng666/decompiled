import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

public final class eqjy implements azys {
    public final D2DDevice a;
    public final BootstrapConfigurations b;
    public final epzm c;
    public final epzz d;

    public eqjy(epzz epzz0, D2DDevice d2DDevice0, BootstrapConfigurations bootstrapConfigurations0, epzm epzm0) {
        this.d = epzz0;
        this.a = d2DDevice0;
        this.b = bootstrapConfigurations0;
        this.c = epzm0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqjr eqjr0 = (eqjr)object0;
        eqko eqko0 = new eqko(((evqp)object1));
        eqid eqid0 = new eqid(new eqkm(this.d, this.c));
        eqin eqin0 = (eqin)eqjr0.H();
        eqji eqji0 = new eqji(eqko0);
        ApiMetadata apiMetadata0 = cclr.a(eqjr0.r);
        eqin0.d(eqji0, this.a, this.b, eqid0, apiMetadata0);
    }
}

