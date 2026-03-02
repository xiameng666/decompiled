import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;

final class eqbs extends cjtm {
    public final eqik a;
    public final eqbv b;
    public final BootstrapConfigurations c;
    private final Handler d;

    public eqbs(eqik eqik0, BootstrapConfigurations bootstrapConfigurations0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "UpdateBootstrapConfigurationOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = bootstrapConfigurations0;
        this.d = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqbr eqbr0 = new eqbr(this);
        this.d.post(eqbr0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.l(status0);
    }
}

