import java.util.concurrent.atomic.AtomicReference;

public final class fkxe implements ibts {
    public final fkys a;
    public final AtomicReference b;

    public fkxe(fkys fkys0, AtomicReference atomicReference0) {
        this.a = fkys0;
        this.b = atomicReference0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gssv gssv0 = ((fkvu)object0).c;
        if(gssv0 == null) {
            gssv0 = gssv.a;
        }
        fkty fkty0 = fktz.b(gssv0);
        Object object1 = this.b.get();
        ibuq.c(object1);
        ibuq.c(((fkvu)object0));
        fkty0.c = this.a.d(((fkvu)object1), ((fkvu)object0));
        return fkty0.a();
    }
}

