import j..util.Objects;
import java.util.concurrent.CancellationException;

final class bta implements bpd {
    final bss a;
    final btd b;

    public bta(btd btd0, bss bss0) {
        this.b = btd0;
        this.a = bss0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        int v = this.a.f;
        if(v == 2) {
            if(!(throwable0 instanceof CancellationException)) {
                v = 2;
                goto label_7;
            }
            bcs.h("SurfaceProcessorNode");
            return;
        }
    label_7:
        bcs.e("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + bte.a(v), throwable0);
    }

    @Override  // bpd
    public final void b(Object object0) {
        bsv bsv0 = (bsv)object0;
        kay.i(bsv0);
        try {
            bsw bsw0 = this.b.a;
            if(((bsb)bsw0).e.get()) {
                bsv0.close();
                return;
            }
            brv brv0 = new brv(((bsb)bsw0), bsv0);
            Objects.requireNonNull(bsv0);
            ((bsb)bsw0).c(brv0, new brw(bsv0));
        }
        catch(bdg bdg0) {
            bcs.b("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", bdg0);
        }
    }
}

