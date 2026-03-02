import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gatj implements gayl {
    public WidgetConfig a;
    public final xob b;
    public final gcrx c;
    LayoutInflater d;
    public final ContextWrapper e;
    public final gayt f;
    public gaym g;
    public gayq h;
    public gbot i;
    public final gbpb j;
    public final gbpa k;
    public gavf l;
    public gbaf m;
    public gazw n;

    public gatj(WidgetConfig widgetConfig0, gbpb gbpb0, gbpa gbpa0, xob xob0, gcrx gcrx0, gayt gayt0) {
        this.a = widgetConfig0;
        this.j = gbpb0;
        this.k = gbpa0;
        this.b = xob0;
        this.c = gcrx0;
        this.f = gayt0;
        this.e = xob0;
        gatf.a(xob0, widgetConfig0);
        gatf.b(xob0, widgetConfig0);
    }

    public final fm a() {
        return this.b.getSupportFragmentManager();
    }

    public final LayoutInflater b() {
        if(this.d == null) {
            this.d = LayoutInflater.from(this.e);
        }
        return this.d;
    }

    public final ganv c(ganu ganu0, Bundle bundle0) {
        gatk gatk0 = new gatk(ganu0, this);
        gati gati0 = new gati(this);
        return ganv.b(this.b, gatk0, bundle0, gati0);
    }

    public final gayq d() {
        gayq gayq0 = this.h;
        gftb.check(gayq0);
        return gayq0;
    }

    @Override  // gayl
    public final void e(String s) {
        throw null;
    }

    @Override  // gayl
    public final void f(String s, Object[] arr_object) {
        gayj.a.f(s, arr_object);
    }

    public final gavf g() {
        gavf gavf0 = this.l;
        gftb.check(gavf0);
        return gavf0;
    }

    public final void h(gbaf gbaf0) {
        gbaf gbaf1 = this.m;
        if(gbaf1 != null) {
            Object object0 = gbaf1.c.b();
            gaxl.a();
            gbaj gbaj0 = gaxm.y() ? gbaj.a : gbae.a;
            Throwable throwable0 = ibnw.a(object0);
            if(throwable0 != null) {
                try {
                    object0 = gbaj0.a(throwable0);
                }
                catch(Throwable throwable1) {
                    object0 = ibnx.a(throwable1);
                }
            }
            ibnx.b(object0);
        }
        this.m = gbaf0;
    }
}

