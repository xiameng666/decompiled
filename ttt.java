import java.util.Iterator;
import java.util.LinkedList;

public class ttt implements tts {
    public syc b;

    public ttt() {
        this.b = null;
        this.b = new syc();
    }

    public ttt(byte[] arr_b) {
        this.b = null;
        this.b = syb.c(arr_b);
    }

    public final tob A() {
        return new tob(this.f(new syf(tob.b)));
    }

    public final tof B() {
        return new tof(this.f(new syf(tof.b)));
    }

    public final tpq C() {
        return new tpq(this.f(new syf(tob.b)));
    }

    public final void d(ttk ttk0) {
        byte[] arr_b = ttk0.d.b;
        syc syc0 = this.b;
        syd syd0 = syc0.c(new syf(arr_b));
        if(syd0 == null) {
            syc0.e(syb.b(arr_b, ttk0.r()));
            return;
        }
        syd0.a(ttk0.r());
    }

    public final void e(syc syc0) {
        syc syc1 = this.b;
        Iterator iterator0 = syc0.iterator();
        LinkedList linkedList0 = new LinkedList();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            syd syd0 = (syd)object0;
            syd syd1 = syc1.b(syd0.a);
            if(syd1 == null) {
                linkedList0.add(syd0.e());
            }
            else {
                syd1.h(syd0);
            }
        }
        for(Object object1: linkedList0) {
            syc1.e(((syd)object1));
        }
    }

    public final byte[] f(syf syf0) {
        return ttu.d(this.b, syf0);
    }

    public final tvt g() {
        return this.j(tvt.a) ? new tvt(this.k(tvt.a)) : null;
    }

    public final tvu h() {
        return this.j(tvu.a) ? new tvu(this.k(tvu.a)) : null;
    }

    public final tvv i() {
        return this.j(tvv.a) ? new tvv(this.k(tvv.a)) : null;
    }

    @Override  // tts
    public final boolean j(byte[] arr_b) {
        return ttu.b(this.b, arr_b);
    }

    @Override  // tts
    public final byte[] k(byte[] arr_b) {
        return ttu.e(this.b, arr_b);
    }

    public final tvx l() {
        return this.j(tvx.a) ? new tvx(this.k(tvx.a)) : null;
    }

    public final tvy m() {
        return this.j(tvy.a) ? new tvy(this.k(tvy.a)) : null;
    }

    public final tvz n() {
        return this.j(tvz.a) ? new tvz(this.k(tvz.a)) : null;
    }

    public final twa o() {
        return this.j(twa.a) ? new twa(this.k(twa.a)) : null;
    }

    public final twb p() {
        return this.j(twb.a) ? new twb(this.k(twb.a)) : null;
    }

    public final tpy q() {
        return new tpy(this.k(tpy.a));
    }

    public final tpz r() {
        return new tpz(this.k(tpz.a));
    }

    public final tqa s() {
        return new tqa(this.k(tqa.a));
    }

    public final ttx t() {
        return new ttx(this.f(new syf(ttx.a)), null);
    }

    @Override
    public final String toString() {
        return String.valueOf(this.b);
    }

    public final tua u() {
        return new tua(this.w(), false);
    }

    public final tuf v() {
        return new tuf(this.f(new syf(tuf.a)));
    }

    public final byte[] w() {
        return this.f(new syf(tua.a));
    }

    public final tns x() {
        return new tns(this.f(new syf(tns.a)));
    }

    public final tnx y() {
        return new tnx(this.f(new syf(tnx.b)));
    }

    public final tny z() {
        return new tny(this.f(new syf(tny.b)));
    }
}

