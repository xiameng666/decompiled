import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gamy {
    public final gana a;
    private final gaxf b;

    public gamy(gana gana0, gaxf gaxf0) {
        this.a = gana0;
        this.b = gaxf0;
    }

    public final ganp a(gano gano0) {
        ibuq.f(gano0, "actionRequest");
        WidgetConfig widgetConfig0 = gano0.f();
        gaym gaym0 = this.b.f.a(widgetConfig0);
        Object object0 = this.b.c.get();
        Object object1 = this.b.d.get();
        ibuq.e(object1, "get(...)");
        Object object2 = this.b.e.a(gaym0);
        ibuq.f(this.b.a, "appContext");
        ibuq.f(object1, "paySeApiCaller");
        gamx gamx0 = new gamx(this.b.a, this, gaym0, this.b.b, widgetConfig0, ((fbov)object0), ((gctm)object1), ((gbjh)object2));
        gano0.b = gamx0;
        ganp ganp0 = this.a.a(gano0);
        ibuq.c(ganp0);
        gamz.a(gamx0.b, ganp0);
        gged_interceptors gged0 = gamx0.b.a();
        gawi.s(ganp0.a, "extraIntegratorAnalyticLogEvents", gged0);
        return ganp0;
    }
}

