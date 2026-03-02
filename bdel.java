import java.util.concurrent.TimeUnit;

public final class bdel implements bglk {
    public final belv a;
    public final bdeq b;

    public bdel(belv belv0, bdeq bdeq0) {
        this.a = belv0;
        this.b = bdeq0;
    }

    @Override  // bglk
    public final void a(bglj bglj0) {
        belv belv0 = this.a;
        if(hsas.d()) {
            ibuq.e(bglj0.a, "androidAppDomain(...)");
            ibuq.f(bglj0.a, "appId");
            icbb.b(lsc.a(belv0), null, null, new belt(belv0, bglj0.a, null), 3);
            return;
        }
        ibuq.e(bglj0.a, "androidAppDomain(...)");
        ibuq.f(bglj0.a, "appId");
        ibuq.f(bglj0.a, "appId");
        heqd heqd0 = heqc.a(((ProtoLiteMessage)heqb.a).v_newBuilder());
        heqd0.e(bglj0.a);
        heqd0.h(bglj0.a);
        heqd0.b(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        heqd0.k();
        heqb heqb0 = heqd0.a();
        lqi lqi0 = new lqi(new bedv(bedu.b, null, null));
        evql evql0 = belv0.b.b.e(((MessageLite)heqb0));
        evql0.b(new behh(new behf(belv0.b, heqb0, lqi0)));
        evql0.A(new behi(lqi0));
        lqi0.g(this.b.getViewLifecycleOwner(), new bdeo(new bdep(this.b)));
    }
}

