import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class ben {
    private final Set a;
    private final Object b;
    private bnc c;
    private bnc d;
    private bin e;
    private bin f;
    public final bnc g;
    public Set h;
    public bnc i;
    public bmi j;
    public Rect k;
    public Matrix l;
    public bmb m;
    public bmb n;
    private int o;

    protected ben(bnc bnc0) {
        this.a = new HashSet();
        this.b = new Object();
        this.o = 2;
        this.l = new Matrix();
        this.m = bmb.e();
        this.n = bmb.e();
        this.g = bnc0;
        this.i = bnc0;
    }

    public final Size A() {
        return this.j == null ? null : this.j.b;
    }

    public final bih B() {
        bin bin0;
        synchronized(this.b) {
            bin0 = this.e;
            if(bin0 == null) {
                return bih.k;
            }
        }
        return bin0.d();
    }

    public final bin C() {
        synchronized(this.b) {
        }
        return this.e;
    }

    public final bin D() {
        synchronized(this.b) {
        }
        return null;
    }

    public final bnc E(bik bik0, bnc bnc0, bnc bnc1) {
        blb blb0;
        if(bnc1 == null) {
            blb0 = blb.a();
        }
        else {
            blb0 = blb.b(bnc1);
            blb0.e(bqt.n);
        }
        bnc bnc2 = this.g;
        bjr bjr0 = bko.G;
        if(bnc2.s(bjr0) || bnc2.s(bko.K)) {
            bjr bjr1 = bko.O;
            if(blb0.s(bjr1)) {
                blb0.e(bjr1);
            }
        }
        bjr bjr2 = bko.O;
        if(bnc2.s(bjr2)) {
            bjr bjr3 = bko.M;
            if(blb0.s(bjr3)) {
                btu btu0 = (btu)bnc2.l(bjr2);
                blb0.e(bjr3);
            }
        }
        for(Object object0: bnc2.r()) {
            bjq.b(blb0, blb0, bnc2, ((bjr)object0));
        }
        if(bnc0 != null) {
            for(Object object1: bnc0.r()) {
                bjr bjr4 = (bjr)object1;
                if(!bjr4.a.equals(bqt.n.a)) {
                    bjq.b(blb0, blb0, bnc0, bjr4);
                }
            }
        }
        if(blb0.s(bko.K) && blb0.s(bjr0)) {
            blb0.e(bjr0);
        }
        if(blb0.s(bjr2)) {
            btu btu1 = (btu)blb0.l(bjr2);
        }
        Objects.toString(this.h);
        bcs.h("UseCase");
        if(this.h != null) {
            bat bat0 = beu.a;
            Range range0 = bmi.a;
            bey bey0 = bez.a;
            for(Object object2: this.h) {
                bep bep0 = (bep)object2;
                if((bep0 instanceof beu)) {
                    bat0 = ((beu)bep0).b;
                }
                else if((bep0 instanceof bew)) {
                    bew bew0 = (bew)bep0;
                    Integer integer0 = (int)60;
                    range0 = new Range(integer0, integer0);
                }
                else {
                    if(!(bep0 instanceof bez)) {
                        continue;
                    }
                    bey0 = ((bez)bep0).b;
                }
            }
            if((this instanceof bdf) || bqi.i(this)) {
                blb0.c(bkm.F, bat0);
            }
            blb0.c(bnc.u, range0);
            int v = bey0.ordinal();
            if(v != 0) {
                switch(v) {
                    case 1: {
                        blb0.c(bnc.z, Integer.valueOf(0));
                        blb0.c(bnc.A, Integer.valueOf(2));
                        return this.e(bik0, this.c(blb0));
                    }
                    case 2: {
                        blb0.c(bnc.z, Integer.valueOf(2));
                        blb0.c(bnc.A, Integer.valueOf(0));
                        return this.e(bik0, this.c(blb0));
                    }
                    default: {
                        return this.e(bik0, this.c(blb0));
                    }
                }
            }
            Integer integer1 = (int)1;
            blb0.c(bnc.z, integer1);
            blb0.c(bnc.A, integer1);
        }
        return this.e(bik0, this.c(blb0));
    }

    protected final String F() {
        bin bin0 = this.C();
        kay.j(bin0, "No camera attached to use case: " + this.toString());
        return bin0.e().j();
    }

    public final String G() {
        return (String)j..util.Objects.requireNonNull(this.i.p("<UnknownUseCase-" + this.hashCode() + ">"));
    }

    public final void H(bin bin0, bin bin1, bnc bnc0, bnc bnc1) {
        synchronized(this.b) {
            this.e = bin0;
            this.f = null;
            this.a(bin0);
        }
        this.c = bnc0;
        this.d = bnc1;
        this.i = this.E(bin0.e(), this.c, this.d);
        this.aa();
    }

    protected final void I() {
        this.o = 1;
        this.L();
    }

    public final void J() {
        this.o = 2;
        this.L();
    }

    public final void K() {
        for(Object object0: this.a) {
            ((bem)object0).u(this);
        }
    }

    public final void L() {
        int v = this.o - 1;
        if(this.o != 0) {
            switch(v) {
                case 0: {
                    for(Object object0: this.a) {
                        ((bem)object0).s(this);
                    }
                    return;
                }
                case 1: {
                    for(Object object1: this.a) {
                        ((bem)object1).t(this);
                    }
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw null;
    }

    public void M() {
    }

    public final void N(Set set0) {
        this.h = set0 == null ? null : new HashSet(set0);
    }

    public final void O(bin bin0) {
        this.h();
        synchronized(this.b) {
            bin bin1 = this.e;
            if(bin0 == bin1) {
                this.f(bin1);
                this.e = null;
            }
            if(bin0 == null) {
                this.f(null);
                this.f = null;
            }
        }
        this.j = null;
        this.k = null;
        this.i = this.g;
        this.c = null;
        this.d = null;
    }

    public final void P(List list0) {
        if(!list0.isEmpty()) {
            this.m = (bmb)list0.get(0);
            if(list0.size() > 1) {
                this.n = (bmb)list0.get(1);
            }
            for(Object object0: list0) {
                for(Object object1: ((bmb)object0).g()) {
                    bka bka0 = (bka)object1;
                    if(bka0.n == null) {
                        bka0.n = this.getClass();
                    }
                }
            }
        }
    }

    public final void Q(bmi bmi0, bmi bmi1) {
        this.n(bmi0, null);
        this.j = bmi0;
    }

    public final boolean R(int v) {
        for(Object object0: this.Z()) {
            int v1 = (int)(((Integer)object0));
            if((v & v1) == v1) {
                return true;
            }
        }
        return false;
    }

    public final boolean S(bin bin0) {
        int v = this.w();
        if(v != -1 && v != 0) {
            switch(v) {
                case 1: {
                    return true;
                }
                case 2: {
                    return bin0.G();
                }
                default: {
                    throw new AssertionError("Unknown mirrorMode: " + v);
                }
            }
        }
        return false;
    }

    protected final void T(blt blt0, bmi bmi0) {
        Range range0 = bmi0.f;
        if(!bmi.a.equals(range0)) {
            blt0.n(range0);
            return;
        }
        synchronized(this.b) {
            bin bin0 = this.e;
            kay.i(bin0);
            List list0 = bin0.e().g().b(AeFpsRangeQuirk.class);
            kay.b(list0.size() <= 1, "There should not have more than one AeFpsRangeQuirk.");
            if(!list0.isEmpty()) {
                blt0.n(((AeFpsRangeQuirk)list0.get(0)).a());
            }
        }
    }

    protected Set Z() {
        return Collections.EMPTY_SET;
    }

    private final void a(bem bem0) {
        this.a.add(bem0);
    }

    public void aa() {
    }

    public void ab() {
    }

    public bmi b(bjt bjt0) {
        throw null;
    }

    public abstract bnb c(bjt arg1);

    public abstract bnc d(boolean arg1, bng arg2);

    protected bnc e(bik bik0, bnb bnb0) {
        throw null;
    }

    private final void f(bem bem0) {
        this.a.remove(bem0);
    }

    public void h() {
    }

    public void j(Matrix matrix0) {
        this.l = new Matrix(matrix0);
    }

    public void k(Rect rect0) {
        this.k = rect0;
    }

    protected void n(bmi bmi0, bmi bmi1) {
        throw null;
    }

    public void o() {
    }

    protected final int u() {
        return ((bko)this.i).G();
    }

    public final int v() {
        return this.i.a();
    }

    protected final int w() {
        return ((bko)this.i).L();
    }

    protected final int x(bin bin0) {
        return this.y(bin0, false);
    }

    protected final int y(bin bin0, boolean z) {
        int v = bin0.e().c(this.z());
        return bin0.F() || !z ? v : bok.b(-v);
    }

    protected final int z() {
        return ((bko)this.i).P();
    }
}

