import j..util.DesugarCollections;
import java.util.List;

public final class hdrn {
    private final hftr a;

    public hdrn(hftr hftr0) {
        this.a = hftr0;
    }

    public final hdrw a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdrw)hftv0;
    }

    public final void b(hdrv hdrv0) {
        ibuq.f(hdrv0, "value");
        this.a.dn(hdrv0);
    }

    public final void c() {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrw.c(((hdrw)hftr0.b_message));
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((hdrw)this.a.b_message).d);
        ibuq.e(list0, "getConditionalPropertiesList(...)");
        new hfxu(list0);
    }
}

