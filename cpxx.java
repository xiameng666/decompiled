import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class cpxx implements glzn {
    public final cpyc a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final List d;

    public cpxx(cpyc cpyc0, AtomicReference atomicReference0, AtomicReference atomicReference1, List list0) {
        this.a = cpyc0;
        this.b = atomicReference0;
        this.c = atomicReference1;
        this.d = list0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((fjbs)object0) == null) {
            return gmbu.i(gfqx.a);
        }
        this.b.set(((fjbs)object0));
        int v = ((fjbs)object0).k;
        AtomicReference atomicReference0 = this.c;
        cpyc cpyc0 = this.a;
        if((fjbp.a(v) == 0 ? 1 : fjbp.a(v)) != 3 && !(fjbp.a(v) == 0 || fjbp.a(v) == 1 ? cpyc0.g == 1 || cpyc0.g == 2 : fjbp.a(v) == 2 && cpyc0.g == 1)) {
            atomicReference0.set(glsl.e);
            throw new cjuh(10, "GetFileGroupOp : Group not accessible");
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((fjbs)object0).p) {
            arrayList0.add(glzd.g(gdtf.j(cpyc0.a.j(((fjbs)object0), true, false), new fjte(((fjbm)object1)), gmap.a), new cpya(cpyc0, this.d, ((fjbm)object1), atomicReference0), gmap.a));
        }
        return gmbu.c(arrayList0).a(new cpyb(((fjbs)object0)), gmap.a);
    }
}

