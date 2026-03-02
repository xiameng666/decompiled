import android.content.Context;
import j..util.Objects;

final class eheg implements gaep {
    final boolean a;
    final Context b;
    final String c;
    final eheh d;

    public eheg(eheh eheh0, boolean z, Context context0, String s) {
        this.a = z;
        this.b = context0;
        this.c = s;
        Objects.requireNonNull(eheh0);
        this.d = eheh0;
        super();
    }

    @Override  // gaep
    public final void a(Throwable throwable0) {
        eheh eheh0 = this.d;
        eheh0.c = 4;
        egig.e("FSA2_PortalServiceRegister", "register to Portal bind service failed");
        if(hxcv.a.c().i() && this.a && eheh0.b) {
            eheh0.c(this.b, this.c);
        }
    }

    @Override  // gaep
    public final void b(boolean z) {
        eheh eheh0 = this.d;
        if(this.a) {
            eheh0.c = 2;
        }
        else {
            eheh0.c = 4;
            if(!hxcv.d()) {
                eheh0.a = 0;
            }
        }
        egig.e("FSA2_PortalServiceRegister", "register to Portal bind service successfully");
    }
}

