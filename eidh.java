import j..time.Instant;
import j..util.Optional;
import j..util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

public final class eidh implements gfsi {
    public final AtomicReference a;

    public eidh(AtomicReference atomicReference0) {
        this.a = atomicReference0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = (eiec)object0;
        Optional optional0 = object1.e == 0L ? Optional.empty() : Optional.of(Instant.ofEpochMilli(object1.e));
        AtomicReference atomicReference0 = this.a;
        DesugarAtomicReference.updateAndGet(atomicReference0, new eidj(optional0));
        DesugarAtomicReference.updateAndGet(atomicReference0, new eidk(object1.f));
        boolean z = true;
        if((object1.b & 1) != 0 && object1.c) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)object1).jf(5, null);
            hftp0.X(((ProtoLiteMessage)object1));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            eiec eiec0 = (eiec)hftp0.b_message;
            eiec0.b |= 1;
            eiec0.c = false;
            object1 = (eiec)hftp0.N_build();
        }
        else {
            z = false;
        }
        DesugarAtomicReference.updateAndGet(atomicReference0, new eidl(z));
        return object1;
    }
}

