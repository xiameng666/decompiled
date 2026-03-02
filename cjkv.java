import android.content.Context;
import dagger.internal.Preconditions;

public class cjkv {
    public final Context a;
    public final ggsf b;
    public final etgl c;
    public fseb d;
    private final evql e;

    public cjkv(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = ggsf.b("cjkv");
        etgl etgl0 = new etgl(context0);
        this.c = etgl0;
        this.e = etgl0.j();
        ibuq.f(context0, "context");
        domv domv0 = domu.a(context0);
        Preconditions.b(domv0);
        new cjkl(domv0).inject(this);
    }

    public final void a(gjdg gjdg0, String s) {
        ibuq.f(gjdg0, "loggingMetadata");
        ibuq.f(s, "dropReason");
        this.b(new cjkn(this, gjdg0, s));
    }

    public final void b(ibts ibts0) {
        cjkt cjkt0 = new cjkt(new cjks(this, ibts0));
        this.e.b(cjkt0);
    }

    public final boolean c(String s, int v, gjdg gjdg0) {
        ibuq.f(gjdg0, "loggingNotificationMetadata");
        bayn bayn0 = bayn.f(this.a);
        if(bayn0 == null) {
            return false;
        }
        if(s == null) {
            bayn0.m(v, evuh.cp);
        }
        else {
            bayn0.o(s, v, evuh.cp);
        }
        this.b(new cjkm(this, gjdg0));
        return true;
    }

    public final fseb d() {
        fseb fseb0 = this.d;
        if(fseb0 != null) {
            return fseb0;
        }
        ibuq.j("notificationLogger");
        return null;
    }
}

