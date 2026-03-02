import android.content.Context;

public final class ehwj {
    public final lqh a;
    private final Context b;
    private final String c;
    private final int d;
    private final ehwo e;
    private final ehxi f;
    private ehxk g;

    public ehwj(Context context0, String s, int v, ehwo ehwo0, ehxi ehxi0) {
        this.a = new lqh(ehwq.a);
        this.b = context0;
        this.c = s;
        this.d = v;
        this.e = ehwo0;
        this.f = ehxi0;
    }

    public final void a() {
        this.e.a = this;
        String s = this.c;
        this.e.d(this.b, s, this.d);
        this.g = new ehxk();
        if(hxjr.c()) {
            ehxi ehxi0 = this.f;
            ehxi0.e = this;
            ((ggtj)ehxi.a.h()).B("Starting a find-device scan for device %s", eice.c(s));
            eigk eigk0 = ehxi0.c;
            if(eigk0 != null) {
                eigk0.f(ehxi0, eigj.e);
            }
            ehxi0.b.g(gwgu.f);
            ehxi0.d = s;
        }
    }

    public final void b() {
        this.e.c();
        this.e.a = null;
        this.g = null;
        if(hxjr.c()) {
            ehxi ehxi0 = this.f;
            ((ggtj)ehxi.a.h()).x("Stopping find-device scan");
            ehxi0.b.o(gwgu.f);
            eigk eigk0 = ehxi0.c;
            if(eigk0 != null) {
                eigk0.g(eigj.e);
            }
            ehxi0.d = null;
            ehxi0.e = null;
        }
    }

    public final void c(int v, int v1) {
        int v2 = this.d;
        int v3 = 0;
        if(v2 != 1) {
            if(v2 == 1) {
            label_7:
                if(v1 == 2) {
                    v3 = (int)hxjr.a.b().b();
                }
            }
        }
        else if(v1 == 1) {
            v3 = (int)hxjr.a.b().c();
        }
        else {
            goto label_7;
        }
        int v4 = v3 + v;
        if(v1 == 1) {
            this.d(v, v4, 1, 2);
            return;
        }
        lqh lqh0 = this.a;
        ehwq ehwq0 = (ehwq)lqh0.ij();
        gftb.check(ehwq0);
        if(ehwq0.f != 3) {
            ehwq ehwq1 = (ehwq)lqh0.ij();
            gftb.check(ehwq1);
            if(ehwq1.f != 4) {
                return;
            }
        }
        this.d(v, v4, 2, 4);
    }

    private final void d(int v, int v1, int v2, int v3) {
        ehxk ehxk0 = this.g;
        if(ehxk0 == null) {
            return;
        }
        ehxk0.b(v1, System.currentTimeMillis());
        float f = (float)this.g.a(System.currentTimeMillis());
        this.a.ii(new ehwq(v3, gfqx.a, gfsx.m(Integer.valueOf(v1)), gfsx.m(Float.valueOf(f)), gfqx.a));
        if(v2 == 2) {
            ehwk.a("com.google.android.personalsafety.internal.finddevice.BLE_RSSI_INTENT_ACTION", this.b, this.c, this.d, v, v1, f, System.currentTimeMillis());
            return;
        }
        ehwk.a("com.google.android.personalsafety.internal.finddevice.GATT_RSSI_INTENT_ACTION", this.b, this.c, this.d, v, v1, f, System.currentTimeMillis());
    }
}

