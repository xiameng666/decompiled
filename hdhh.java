import j..util.DesugarCollections;
import java.util.List;

public final class hdhh {
    private final hdhi a;

    public hdhh(hdhi hdhi0) {
        this.a = hdhi0;
    }

    public final hdhl a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdhl)hftv0;
    }

    public final void b(hdhk hdhk0) {
        ibuq.f(hdhk0, "value");
        hdhi hdhi0 = this.a;
        if(!hdhi0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hdhi0).ensureMutable();
        }
        ((hdhl)hdhi0.b_message).d = hdhk0.i;
        ((hdhl)hdhi0.b_message).b |= 1;
    }

    public final void c(Iterable iterable0) {
        ibuq.f(iterable0, "values");
        this.a.a(iterable0);
    }

    public final void d(hdrl hdrl0) {
        ibuq.f(hdrl0, "value");
        this.a.k(hdrl0);
    }

    public final void e() {
        List list0 = DesugarCollections.unmodifiableList(((hdhl)this.a.b_message).c);
        ibuq.e(list0, "getChildList(...)");
        new hfxu(list0);
    }
}

