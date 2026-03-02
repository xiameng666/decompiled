import java.util.concurrent.atomic.AtomicReference;

public final class fkxn implements ibts {
    public final AtomicReference a;
    public final fkys b;
    public final AtomicReference c;

    public fkxn(AtomicReference atomicReference0, fkys fkys0, AtomicReference atomicReference1) {
        this.a = atomicReference0;
        this.b = fkys0;
        this.c = atomicReference1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        fkvu fkvu0 = (fkvu)object0;
        Object object1 = this.a.get();
        ibuq.c(object1);
        fkty fkty0 = fktz.b(object1);
        Object object2 = this.c.get();
        ibuq.c(object2);
        ibuq.c(fkvu0);
        fkty0.c = this.b.d(((fkvu)object2), fkvu0);
        return fkty0.a();
    }
}

