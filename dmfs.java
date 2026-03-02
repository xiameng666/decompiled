import android.app.Activity;
import android.view.View;
import java.io.IOException;
import java.util.concurrent.CancellationException;

final class dmfs extends ibsl implements ibtw {
    int a;
    final dmfu b;
    final String c;
    final View d;

    public dmfs(dmfu dmfu0, String s, View view0, ibrl ibrl0) {
        this.b = dmfu0;
        this.c = s;
        this.d = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmfs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmfs(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                this.b.c.f("CARD_STATUS_TOKENIZE_PAN");
                try {
                    etbu etbu0 = new etbu();
                    etbu0.a(this.c);
                    etbu0.c(11);
                    etbu0.g(2);
                    etbu0.j(this.b.e.a());
                    Activity activity0 = this.b.a.getContainerActivity();
                    evql evql0 = this.b.h.cW(activity0, 201, etbu0);
                    this.a = 1;
                    return ictn.b(evql0, this) == object1 ? object1 : ibom.a;
                label_16:
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(dpuk dpuk0) {
                    a.ae(this.b.g.i(), "Failed to start yellow path from card status action.", dpuk0);
                    break;
                }
                catch(IOException iOException0) {
                    a.ae(this.b.g.i(), "Failed to start yellow path from card status action.", iOException0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a.ae(this.b.g.i(), "Failed to start yellow path from card status action.", cancellationException0);
                    break;
                }
            }
            case 1: {
                goto label_16;
            }
            default: {
                ibnx.b(object0);
                this.d.setClickable(true);
                return ibom.a;
            }
        }
        this.a = 2;
        if(icfv.a(this) == object1) {
            return object1;
        }
        this.d.setClickable(true);
        return ibom.a;
    }
}

