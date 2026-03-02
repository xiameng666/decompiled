import android.util.Log;
import j..util.Objects;

final class fdrg extends fdrc {
    final fdrh a;

    public fdrg(fdrh fdrh0) {
        Objects.requireNonNull(fdrh0);
        this.a = fdrh0;
        super(fdrh0.b);
    }

    @Override  // fdrc
    protected final void a() {
        fdro fdro0 = (fdro)this.a.b.d.a(this.a.a);
        if(fdro0 != null) {
            try {
                this.g = fdro0;
                Log.w("ChannelStateMachine", "Stream callback binder died. Closing channel");
                ffhh ffhh0 = fdro0.v;
                if(ffhh0 != null) {
                    ffhh0.a(16, null, fdro0.h);
                    fdro0.v = null;
                }
                fdro0.f(3, 0);
                fdro0.e(3, 0);
                fdro0.s(0);
                throw fdro0.q(3, 0);
            }
            catch(fdrm fdrm0) {
                this.c(fdrm0.a);
            }
        }
    }
}

