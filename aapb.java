import android.os.Bundle;

public final class aapb {
    public final aapa a;
    public final lqd b;
    public final lqd c;
    private final aaln d;
    private final aaon e;

    public aapb(Bundle bundle0, aaln aaln0, aaon aaon0) {
        aapa aapa0 = aapa.a(zhp.g(bundle0.getByteArray("topNavKey")), zhp.g(bundle0.getByteArray("leftNavKey")));
        this.a = aapa0;
        this.d = aaln0;
        this.e = aaon0;
        this.b = aaln0.a(aapa0.a);
        this.c = aaln0.a(aapa0.b);
    }

    public final grxw a() {
        return this.a.b;
    }

    public final void b(grxw grxw0) {
        this.d.i(grxw0);
    }

    public final void c(grxw grxw0, int v) {
        this.e.i(grxw0, v);
    }
}

