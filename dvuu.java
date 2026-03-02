import android.graphics.Bitmap;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvuu implements Runnable {
    public final dvuz a;
    public final gged_interceptors b;
    public final Valuable c;

    public dvuu(dvuz dvuz0, gged_interceptors gged0, Valuable valuable0) {
        this.a = dvuz0;
        this.b = gged0;
        this.c = valuable0;
    }

    @Override
    public final void run() {
        dvuz dvuz0 = this.a;
        Valuable valuable0 = this.c;
        gged_interceptors gged0 = this.b;
        if(gged0.isEmpty()) {
            dvuz0.P.a(gjco.b, gjct.c, gjcr.d, valuable0.b);
            dvuz0.B.o(4);
        }
        else {
            if(dvma.m(valuable0)) {
                if(gged0.isEmpty()) {
                    dvuz0.P.a(gjco.b, gjct.c, gjcr.d, valuable0.b);
                    dvuz0.t = gfqx.a;
                }
                else {
                    dvuz0.P.a(gjco.b, gjct.b, gjcr.e, valuable0.b);
                    dvuz0.t = gfsx.m(((Bitmap)gged0.get(0)));
                }
            }
            if(dvkx.f(valuable0)) {
                dvuz0.P.a(gjco.b, gjct.b, gjcr.f, valuable0.b);
                dvuz0.w = gged0;
            }
        }
        dvuz0.g();
        dvuz0.c.setVisibility(8);
    }
}

