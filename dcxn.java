import java.util.concurrent.CancellationException;

public final class dcxn implements ibts {
    public final Object a;

    public dcxn(Object object0) {
        this.a = object0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = this.a;
        if(((Throwable)object0) != null && (((Throwable)object0) instanceof CancellationException)) {
            dcvz.a.b().h("[SharingClientMiddleware] %s cancelled", object1);
            return ibom.a;
        }
        if(((Throwable)object0) != null) {
            dcvz.a.e().f(((Throwable)object0)).h("[RadioStatusMiddleware] %s completed exceptionally", object1);
            return ibom.a;
        }
        dcvz.a.b().h("[RadioStatusMiddleware] %s completed", object1);
        return ibom.a;
    }
}

