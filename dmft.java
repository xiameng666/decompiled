import android.view.View;
import java.io.IOException;
import java.util.concurrent.CancellationException;

final class dmft extends ibsl implements ibtw {
    int a;
    final dmfu b;
    final String c;
    final View d;

    public dmft(dmfu dmfu0, String s, View view0, ibrl ibrl0) {
        this.b = dmfu0;
        this.c = s;
        this.d = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmft)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmft(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.b.c.f("CARD_STATUS_TOKENIZE_PAN");
            try {
                ibuq.c(this.d);
                eflw eflw0 = new eflw();
                eflw0.a = 0x4DDD4;
                eflw0.b = "Verify your card";
                eflw0.p = 0x7F080B3E;  // drawable:quantum_gm_ic_credit_card_vd_theme_24
                eflw0.c = "For your security the bank wants to make sure this card is yours";
                eflw0.d = "Finish setup";
                eflw0.e = "Not now";
                eflw0.y = new dmfl(this.b, this.c);
                eflw0.z = new dmfp(this.d);
                eflw0.o = true;
                eflw0.a().show(this.b.a.getSupportFragmentManager(), "VERIFY");
                return ibom.a;
            }
            catch(dpuk dpuk0) {
                a.ae(this.b.g.i(), "Failed to start yellow path from card status action.", dpuk0);
            }
            catch(IOException iOException0) {
                a.ae(this.b.g.i(), "Failed to start yellow path from card status action.", iOException0);
            }
            catch(CancellationException cancellationException0) {
                a.ae(this.b.g.i(), "Failed to start yellow path from card status action.", cancellationException0);
            }
            this.a = 1;
            if(icfv.a(this) == object1) {
                return object1;
            }
        }
        this.d.setClickable(true);
        return ibom.a;
    }
}

