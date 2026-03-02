import java.util.Iterator;

public final class ebrt implements evqc {
    public final ebsf a;
    public final Iterator b;
    public final evqp c;
    public final dyfk d;

    public ebrt(ebsf ebsf0, Iterator iterator0, evqp evqp0, dyfk dyfk0) {
        this.a = ebsf0;
        this.b = iterator0;
        this.c = evqp0;
        this.d = dyfk0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebsf.a.i(), "Schedule to download card task with delay failed.", exception0);
        dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
        String s = this.d.c;
        ibuq.e(s, "getCid(...)");
        dyfn0.b(s);
        dyna dyna0 = dyna.b(this.d.f) == null ? dyna.k : dyna.b(this.d.f);
        ibuq.e(dyna0, "getServiceProvider(...)");
        dyfn0.c(dyna0);
        dyfn0.d(dyfj.c);
        dyfk dyfk0 = dyfn0.a();
        this.a.o(dyfk0, this.b);
        this.c.c(null);
    }
}

