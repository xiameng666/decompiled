import android.view.View;
import java.io.IOException;
import java.util.concurrent.CancellationException;

final class dmfr extends ibsl implements ibtw {
    int a;
    final dmfu b;
    final View c;

    public dmfr(dmfu dmfu0, View view0, ibrl ibrl0) {
        this.b = dmfu0;
        this.c = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmfr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmfr(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                this.b.c.f("CARD_STATUS_TURN_ON_NFC");
                try {
                    evql evql0 = this.b.h.i();
                    this.a = 1;
                    return ictn.b(evql0, this) == object1 ? object1 : ibom.a;
                label_10:
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(dpuk dpuk0) {
                    a.ae(this.b.g.i(), "Failed to enable NFC from card status action.", dpuk0);
                    break;
                }
                catch(IOException iOException0) {
                    a.ae(this.b.g.i(), "Failed to enable NFC from card status action.", iOException0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    a.ae(this.b.g.i(), "Failed to enable NFC from card status action.", cancellationException0);
                    break;
                }
            }
            case 1: {
                goto label_10;
            }
            default: {
                ibnx.b(object0);
                this.c.setClickable(true);
                return ibom.a;
            }
        }
        this.a = 2;
        if(icfv.a(this) == object1) {
            return object1;
        }
        this.c.setClickable(true);
        return ibom.a;
    }
}

