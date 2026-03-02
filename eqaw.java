import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

final class eqaw extends cjtm {
    public final eqik a;
    public final eqbv b;
    public final D2DDevice c;
    public final BootstrapConfigurations d;
    public final eqie e;
    private final Handler f;

    public eqaw(eqik eqik0, D2DDevice d2DDevice0, BootstrapConfigurations bootstrapConfigurations0, eqie eqie0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "BootstrapOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = d2DDevice0;
        this.d = bootstrapConfigurations0;
        this.e = eqie0;
        this.f = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqav eqav0 = new eqav(this);
        this.f.post(eqav0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.b(status0);
    }
}

