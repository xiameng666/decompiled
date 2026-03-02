import java.util.concurrent.CancellationException;

public final class dcyz implements ibts {
    public final Object a;

    public dcyz(Object object0) {
        this.a = object0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = this.a;
        if(((Throwable)object0) != null && (((Throwable)object0) instanceof CancellationException)) {
            dcvz.a.b().h("[SettingsMiddleware] %s cancelled", object1);
            return ibom.a;
        }
        if(((Throwable)object0) != null) {
            dcvz.a.e().f(((Throwable)object0)).h("[SettingsMiddleware] %s completed exceptionally", object1);
            return ibom.a;
        }
        dcvz.a.b().h("[SettingsMiddleware] %s completed", object1);
        return ibom.a;
    }
}

