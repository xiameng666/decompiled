import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;
import java.util.concurrent.Executor;

final class iasc extends iaou {
    public static final iakk a;
    public final Intent b;
    public final UserHandle c;
    public final Context d;
    public final Executor e;
    public final iaps f;
    public final iaot g;
    public iasb h;
    public boolean i;
    public iaoq j;
    public gmcd k;
    private final Executor l;
    private boolean m;

    static {
        iaki iaki0 = new iaki(iakk.a);
        iaki0.b(iaqm.c, Boolean.valueOf(true));
        iasc.a = iaki0.a();
    }

    public iasc(Intent intent0, iaon iaon0) {
        this.b = intent0;
        UserHandle userHandle0 = (UserHandle)iaon0.a(iaqm.b);
        this.c = userHandle0;
        Context context0 = (Context)iaon0.a(iaqm.a);
        gftb.z(context0, "SOURCE_ANDROID_CONTEXT");
        Context context1 = context0.getApplicationContext();
        if(userHandle0 != null) {
            context1 = iasc.f(context1, userHandle0);
        }
        this.d = context1;
        gftb.z(iaon0.f, "NameResolver.Args.getOffloadExecutor()");
        this.e = iaon0.f;
        this.l = new gmct(iaon0.f);
        this.f = iaon0.c;
        this.g = iaon0.d;
    }

    @Override  // iaou
    public final String a() {
        return "localhost";
    }

    @Override  // iaou
    public final void b() {
        gftb.r(this.j != null, "Not started!");
        this.e();
    }

    @Override  // iaou
    public final void c() {
        this.f.d();
        if(!this.m) {
            this.m = true;
            iarx iarx0 = new iarx(this);
            this.l.execute(iarx0);
        }
    }

    @Override  // iaou
    public final void d(iaoq iaoq0) {
        gftb.r(this.j == null, "Already started!");
        gftb.r(((boolean)(this.m ^ 1)), "Resolver is shutdown");
        this.j = iaoq0;
        iaru iaru0 = new iaru(this);
        this.l.execute(iaru0);
        this.e();
    }

    public final void e() {
        iaps iaps0 = this.f;
        iaps0.d();
        if(this.m) {
            return;
        }
        if(this.k == null) {
            gmcd gmcd0 = gmbu.m(new iarv(this), this.l);
            this.k = gmcd0;
            gmcd0.hB(new iarw(this), iaps0);
            return;
        }
        this.i = true;
    }

    private static Context f(Context context0, UserHandle userHandle0) {
        try {
            if(iasx.a == null) {
                Class class0 = iasx.class;
                synchronized(class0) {
                    if(iasx.a == null) {
                        iasx.a = Context.class.getMethod("createContextAsUser", UserHandle.class, Integer.TYPE);
                    }
                }
            }
            return (Context)iasx.a.invoke(context0, userHandle0, ((int)0));
        }
        catch(ReflectiveOperationException unused_ex) {
            throw new IllegalArgumentException("TARGET_ANDROID_USER NameResolver.Arg requires SDK_INT >= R and @SystemApi visibility");
        }
    }
}

