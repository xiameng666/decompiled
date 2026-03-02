import java.util.Iterator;
import java.util.LinkedList;

public class tgl implements tgk {
    public tfd a;

    public tgl() {
        this.a = null;
        this.a = new tfd();
    }

    public tgl(byte[] arr_b) {
        this.a = null;
        this.a = tfc.c(arr_b);
    }

    @Override  // tgk
    public final boolean a(byte[] arr_b) {
        return tgm.b(this.a, arr_b);
    }

    @Override  // tgk
    public final byte[] b(byte[] arr_b) {
        return tgm.e(this.a, arr_b);
    }

    public final void c(tgc tgc0) {
        byte[] arr_b = tgc0.b.b;
        tfd tfd0 = this.a;
        tfe tfe0 = tfd0.c(new tfg(arr_b));
        if(tfe0 == null) {
            tfd0.e(tfc.a(arr_b, tgc0.k()));
            return;
        }
        tfe0.a(tgc0.k());
    }

    public final void d(tfd tfd0) {
        tfd tfd1 = this.a;
        if(tfd0 == null) {
            throw new IllegalArgumentException("The provided template is null");
        }
        Iterator iterator0 = tfd0.iterator();
        LinkedList linkedList0 = new LinkedList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            tfe tfe0 = (tfe)object0;
            tfe tfe1 = tfd1.b(tfe0.a);
            if(tfe1 == null) {
                linkedList0.add(tfe0.e());
            }
            else {
                tfe1.h(tfe0);
            }
        }
        for(Object object1: linkedList0) {
            tfd1.e(((tfe)object1));
        }
    }

    public final byte[] e(tfg tfg0) {
        return tgm.d(this.a, tfg0);
    }

    public final til f() {
        return this.a(til.a) ? new til(this.b(til.a)) : null;
    }

    public final tim g() {
        return this.a(tim.a) ? new tim(this.b(tim.a)) : null;
    }

    public final tin h() {
        return this.a(tin.a) ? new tin(this.b(tin.a)) : null;
    }

    public final tip i() {
        return this.a(tip.a) ? new tip(this.b(tip.a)) : null;
    }

    public final tiq j() {
        return this.a(tiq.a) ? new tiq(this.b(tiq.a)) : null;
    }

    public final tir k() {
        return this.a(tir.a) ? new tir(this.b(tir.a)) : null;
    }

    public final tis l() {
        return this.a(tis.a) ? new tis(this.b(tis.a)) : null;
    }

    public final tit m() {
        return this.a(tit.a) ? new tit(this.b(tit.a)) : null;
    }

    public final tsz n() {
        return new tsz(this.b(tsz.a));
    }

    public final tta o() {
        return new tta(this.b(tta.a));
    }

    public final ttb p() {
        return new ttb(this.b(ttb.a));
    }

    public final tgp q() {
        return new tgp(this.e(new tfg(tgp.a)), null);
    }

    public final tgs r() {
        return new tgs(this.t(), false);
    }

    public final tgx s() {
        return new tgx(this.e(new tfg(tgx.a)));
    }

    public final byte[] t() {
        return this.e(new tfg(tgs.a));
    }

    @Override
    public final String toString() {
        return String.valueOf(this.a);
    }

    public final tqr u() {
        return new tqr(this.e(new tfg(tqr.a)));
    }

    public final tqw v() {
        return new tqw(this.e(new tfg(tqw.d)));
    }

    public final tqx w() {
        return new tqx(this.e(new tfg(tqx.d)));
    }

    public final tra x() {
        return new tra(this.e(new tfg(tra.a)));
    }

    public final tre y() {
        return new tre(this.e(new tfg(tre.d)));
    }

    public final tsr z() {
        return new tsr(this.e(new tfg(tra.a)));
    }
}

