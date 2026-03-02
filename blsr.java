import j..util.Objects;
import java.util.concurrent.TimeoutException;

final class blsr implements gmbg {
    final blss a;
    final blsp b;

    public blsr(blss blss0, blsp blsp0) {
        this.b = blsp0;
        Objects.requireNonNull(blss0);
        this.a = blss0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof TimeoutException)) {
            this.a.a.a();
            this.b.a(Integer.valueOf(16));
            return;
        }
        this.b.a(Integer.valueOf(8));
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.b.a(((Integer)object0));
    }
}

