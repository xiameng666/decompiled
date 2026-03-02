import java.util.concurrent.CancellationException;

public final class lau implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Throwable throwable0 = (Throwable)object1;
        ibuq.f(((lcu)object0), "msg");
        icbr icbr0 = ((lcu)object0).d;
        if(throwable0 == null) {
            throwable0 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        icbr0.d(throwable0);
        return ibom.a;
    }
}

