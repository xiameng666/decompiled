import android.content.Context;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvux implements kar {
    public final dvuz a;
    public final Valuable b;

    public dvux(dvuz dvuz0, Valuable valuable0) {
        this.a = dvuz0;
        this.b = valuable0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        gfsx gfsx0;
        dvuz dvuz0 = this.a;
        Valuable valuable0 = this.b;
        int v = 0;
        if(!((gged_interceptors)object0).isEmpty()) {
            Context context0 = dvuz0.getContext();
            if(context0 != null) {
                int v1 = ((gged_interceptors)object0).size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    gtyt gtyt0 = (gtyt)((gged_interceptors)object0).get(v2);
                    if(!gtyt0.b.isEmpty() && !gtyt0.c.isEmpty()) {
                        String s = context0.getString(0x7F15232E, new Object[]{valuable0.d});  // string:pay_valuable_field_update_callout_content "%1$s updated your pass"
                        dvuz0.d.n(s);
                        dvuw dvuw0 = new dvuw(dvuz0, ((xob)context0), context0, valuable0, ((gged_interceptors)object0));
                        dvuz0.d.p(0x7F15232F, dvuw0);  // string:pay_valuable_field_update_callout_cta "Review update"
                        dvuz0.d.m(0x7F0805E0);  // drawable:gs_notifications_vd_theme_24
                        dvuz0.d.setVisibility(0);
                        dvuz0.B.l(((Valuable)dvuz0.r.d()), 9, 3);
                        return;
                    }
                }
            }
        }
        gged_interceptors gged0 = valuable0.n();
        guvk guvk0 = valuable0.z;
        if((guvk0.b & 0x1000) == 0) {
            gfsx0 = gfqx.a;
        }
        else {
            switch((guvk0.y == null ? guvt.a : guvk0.y).d) {
                case 0: {
                    v = 2;
                    break;
                }
                case 1: {
                    v = 3;
                }
            }
            gfsx0 = v == 3 ? gfqx.a : gfsx.m((guvk0.y == null ? guvt.a : guvk0.y));
        }
        ggdy ggdy0 = new ggdy();
        for(Object object1: (guvk0.z == null ? guus.a : guvk0.z).d) {
            guur guur0 = (guur)object1;
            if(guuq.a(guur0.c) != 3) {
                ggdy0.i(guur0.b);
            }
        }
        gged_interceptors gged1 = ggdy0.h();
        gfsx gfsx1 = (guvk0.b & 0x8000) == 0 ? gfqx.a : gfsx.m((guvk0.B == null ? guvq.a : guvk0.B));
        if(gged0.isEmpty() && !gfsx0.i() && gged1.isEmpty() && !gfsx1.i()) {
            dvuz0.d.setVisibility(8);
            return;
        }
        dybn dybn0 = dvuz0.h;
        dvup dvup0 = new dvup(dvuz0, gged0, gfsx0, gged1, gfsx1, valuable0);
        glzd.f(dybn0.a.b().a(), new dyba(valuable0.b, dvup0), gmap.a);
    }
}

