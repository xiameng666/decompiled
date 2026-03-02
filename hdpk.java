import j..util.DesugarCollections;
import java.util.List;

public final class hdpk {
    private final hdru a;

    public hdpk(hdru hdru0) {
        this.a = hdru0;
    }

    public final hdrv a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdrv)hftv0;
    }

    public final void b(hdrz hdrz0) {
        ibuq.f(hdrz0, "value");
        hdru hdru0 = this.a;
        if(!hdru0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hdru0).ensureMutable();
        }
        hdrv hdrv0 = (hdrv)hdru0.b_message;
        hdrz0.getClass();
        hdrv0.f = hdrz0;
        hdrv0.c |= 1;
    }

    public final void c(hdpp hdpp0) {
        ibuq.f(hdpp0, "value");
        this.a.a(hdpp0);
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((hdrv)this.a.b_message).d);
        ibuq.e(list0, "getDeviceStateConditionList(...)");
        new hfxu(list0);
    }
}

