import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;

final class eqeq extends cjtm {
    public final BootstrapOptions a;
    public final eqit b;
    public final eqff c;
    public final eqiw d;
    private final Handler e;

    public eqeq(eqiw eqiw0, eqff eqff0, BootstrapOptions bootstrapOptions0, eqit eqit0, Handler handler0, azug azug0) {
        super(76, "EnableTargetModeOperation", azug0);
        this.a = bootstrapOptions0;
        this.b = eqit0;
        this.c = eqff0;
        this.d = eqiw0;
        this.e = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqep eqep0 = new eqep(this);
        this.e.post(eqep0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.c(status0);
    }
}

