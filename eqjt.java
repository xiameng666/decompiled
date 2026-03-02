import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

public final class eqjt implements azys {
    public final BootstrapConfigurations a;
    public final ParcelFileDescriptor[] b;
    public final epyk c;
    public final epzz d;

    public eqjt(epzz epzz0, BootstrapConfigurations bootstrapConfigurations0, ParcelFileDescriptor[] arr_parcelFileDescriptor, epyk epyk0) {
        this.d = epzz0;
        this.a = bootstrapConfigurations0;
        this.b = arr_parcelFileDescriptor;
        this.c = epyk0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqjr eqjr0 = (eqjr)object0;
        eqko eqko0 = new eqko(((evqp)object1));
        eqhx eqhx0 = new eqhx(this.c, this.d, this.d.a);
        eqhz eqhz0 = new eqhz(Looper.getMainLooper(), eqhx0);
        eqin eqin0 = (eqin)eqjr0.H();
        eqjo eqjo0 = new eqjo(eqko0);
        ApiMetadata apiMetadata0 = cclr.a(eqjr0.r);
        eqin0.q(eqjo0, this.a, this.b, eqhz0, apiMetadata0);
    }
}

