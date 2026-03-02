import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

final class call implements glzn {
    final cank a;
    final caom b;
    final canm c;
    final canx d;
    final Executor e;

    public call(cank cank0, caom caom0, canm canm0, canx canx0, Executor executor0) {
        this.a = cank0;
        this.b = caom0;
        this.c = canm0;
        this.d = canx0;
        this.e = executor0;
        super();
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd0;
        if(((Boolean)object0) != null && ((Boolean)object0).booleanValue()) {
            this.a.g(0L);
        }
        caot caot0 = ((caoi)this.b).a(Long.valueOf(0L), null);
        try {
            if(caot0 == null) {
                this.c.f();
                this.c.h(4);
                return gmbu.i(new calm(Boolean.valueOf(false), null));
            }
            capc capc0 = (capc)caot0.b();
            gmcd0 = glzd.f(this.d.f(caot0, this.c), new calk(this, capc0), this.e);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(caot0, throwable0);
            throw throwable0;
        }
        caot0.close();
        return gmcd0;
    }
}

