import j..util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

final class egvk implements gmbg {
    final egvm a;

    public egvk(egvm egvm0) {
        Objects.requireNonNull(egvm0);
        this.a = egvm0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(egvm.a.i(), "Failed to load contacts from SIM.", throwable0);
        egvl egvl0 = egvl.b(3);
        this.a.h.ii(egvl0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        egvm egvm0 = this.a;
        ArrayList arrayList0 = new ArrayList(egvm0.d.a());
        for(Object object1: ((List)object0)) {
            egnp egnp0 = (egnp)object1;
            BitSet bitSet0 = egvm0.d.h;
            if(bitSet0 == null || !bitSet0.get(egnp0.b)) {
                arrayList0.add(egnp0);
            }
        }
        Collections.sort(arrayList0, new egvj(Collator.getInstance(egxj.h(egvm0.b))));
        egvl egvl0 = new egvl(4, arrayList0);
        egvm0.h.ii(egvl0);
    }
}

