import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class bce extends ben {
    public final int a;
    public final AtomicReference b;
    public final int c;
    public bhd d;
    blt e;
    public static final int f;
    private final bqn o;
    private bfx p;
    private blu q;
    private final bbv r;

    static {
    }

    public bce(bkk bkk0) {
        super(bkk0);
        this.b = new AtomicReference(null);
        this.r = new bbv(this);
        bkk bkk1 = (bkk)this.i;
        this.a = blq.g(bkk1, bkk.a) ? bkk1.D() : 1;
        this.c = (int)(((Integer)blq.c(bkk1, bkk.h, Integer.valueOf(0))));
        this.o = new bqn(((bcc)blq.c(bkk1, bkk.i, null)));
    }

    private final void U() {
        this.o.d();
        this.o.c();
        bhd bhd0 = this.d;
        if(bhd0 != null) {
            bhd0.a();
        }
    }

    private final void V(bcc bcc0) {
        this.B().u(bcc0);
    }

    private static boolean W(List list0, int v) {
        for(Object object0: list0) {
            if(((Integer)((Pair)object0).first).equals(Integer.valueOf(v))) {
                return true;
            }
        }
        return false;
    }

    private final boolean X() {
        return this.C() == null ? false : this.C().c().b() != null;
    }

    private static final boolean Y(Map map0, int v) {
        Integer integer0 = v;
        return map0.containsKey(integer0) && !((List)map0.get(integer0)).isEmpty();
    }

    @Override  // ben
    public final Set Z() {
        Set set0 = new HashSet();
        set0.add(Integer.valueOf(4));
        return set0;
    }

    public final int a() {
        synchronized(this.b) {
        }
        return (int)(((Integer)blq.c(((bkk)this.i), bkk.b, Integer.valueOf(2))));
    }

    @Override  // ben
    public final void aa() {
        kay.j(this.C(), "Attached camera cannot be null");
        if(this.a() == 3) {
            bin bin0 = this.C();
            if(bin0 == null || bin0.b().a() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override  // ben
    public final void ab() {
        bcs.h("ImageCapture");
        this.p();
        this.V(this.o);
    }

    @Override  // ben
    public final bmi b(bjt bjt0) {
        this.e.h(bjt0);
        this.P(bbs.a(this.e.a()));
        bmh bmh0 = new bmh(this.j);
        bmh0.b = bjt0;
        return bmh0.a();
    }

    @Override  // ben
    public final bnb c(bjt bjt0) {
        return bbw.a(bjt0);
    }

    @Override  // ben
    public final bnc d(boolean z, bng bng0) {
        bkk bkk0 = bbx.a;
        bjt bjt0 = bng0.a(bmz.g(bkk0), this.a);
        if(z) {
            bjt0 = bjq.a(bjt0, bkk0);
        }
        return bjt0 == null ? null : bbw.a(bjt0).b();
    }

    @Override  // ben
    protected final bnc e(bik bik0, bnb bnb0) {
        boolean z1;
        Set set0 = this.h;
        boolean z = true;
        if(set0 != null) {
            int v = 0;
            for(Object object0: set0) {
                bep bep0 = (bep)object0;
                if((bep0 instanceof bex)) {
                    bex bex0 = (bex)bep0;
                    v = 1;
                }
            }
            bnb0.f().c(bkk.e, Integer.valueOf(v));
        }
        if(bik0.g().c(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean boolean0 = Boolean.FALSE;
            blb blb0 = bnb0.f();
            bjr bjr0 = bkk.g;
            Boolean boolean1 = Boolean.valueOf(true);
            if(boolean0.equals(blb0.m(bjr0, boolean1))) {
                bcs.d("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            }
            else {
                bcs.c("ImageCapture", "Requesting software JPEG due to device quirk.");
                bnb0.f().c(bjr0, boolean1);
            }
        }
        blb blb1 = bnb0.f();
        bjr bjr1 = bkk.g;
        Boolean boolean2 = Boolean.valueOf(false);
        if(Boolean.TRUE.equals(blb1.m(bjr1, boolean2))) {
            if(this.X()) {
                bcs.d("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z1 = false;
            }
            else {
                z1 = true;
            }
            Integer integer0 = (Integer)blb1.m(bkk.d, null);
            if(integer0 != null && ((int)integer0) != 0x100) {
                bcs.d("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z1 = false;
            }
            if(!z1) {
                bcs.d("ImageCapture", "Unable to support software JPEG. Disabling.");
                blb1.c(bjr1, boolean2);
            }
        }
        else {
            z1 = false;
        }
        Integer integer1 = (Integer)bnb0.f().m(bkk.d, null);
        int v1 = 35;
        if(integer1 != null) {
            if(this.X() && ((int)integer1) != 0x100) {
                z = false;
            }
            kay.b(z, "Cannot set non-JPEG buffer format with Extensions enabled.");
            blb blb2 = bnb0.f();
            bjr bjr2 = bkm.l;
            if(!z1) {
                v1 = (int)integer1;
            }
            blb2.c(bjr2, Integer.valueOf(v1));
            return bnb0.d();
        }
        if(bce.r(bnb0.f())) {
            bnb0.f().c(bkm.l, Integer.valueOf(0x20));
            return bnb0.d();
        }
        if(bce.s(bnb0.f())) {
            bnb0.f().c(bkm.l, Integer.valueOf(0x20));
            bnb0.f().c(bkm.m, Integer.valueOf(0x100));
            return bnb0.d();
        }
        if(bce.t(bnb0.f())) {
            bnb0.f().c(bkm.l, Integer.valueOf(0x1005));
            bnb0.f().c(bkm.F, bat.a);
            return bnb0.d();
        }
        if(z1) {
            bnb0.f().c(bkm.l, Integer.valueOf(35));
            return bnb0.d();
        }
        List list0 = (List)bnb0.f().m(bkk.N, null);
        if(list0 == null) {
            bnb0.f().c(bkm.l, Integer.valueOf(0x100));
            return bnb0.d();
        }
        if(bce.W(list0, 0x100)) {
            bnb0.f().c(bkm.l, Integer.valueOf(0x100));
            return bnb0.d();
        }
        if(bce.W(list0, 35)) {
            bnb0.f().c(bkm.l, Integer.valueOf(35));
        }
        return bnb0.d();
    }

    public final int f() {
        Integer integer0 = (Integer)this.i.m(bkk.e, Integer.valueOf(0));
        kay.i(integer0);
        return (int)integer0;
    }

    @Override  // ben
    public final void h() {
        this.U();
        this.i(false);
        this.V(null);
    }

    public final void i(boolean z) {
        boj.b();
        blu blu0 = this.q;
        if(blu0 != null) {
            blu0.b();
            this.q = null;
        }
        bfx bfx0 = this.p;
        if(bfx0 != null) {
            bfx0.a();
            this.p = null;
        }
        if(!z) {
            bhd bhd0 = this.d;
            if(bhd0 != null) {
                bhd0.a();
                this.d = null;
            }
        }
        this.B().l();
    }

    @Override  // ben
    protected final void n(bmi bmi0, bmi bmi1) {
        Objects.toString(bmi0);
        bcs.h("ImageCapture");
        this.F();
        blt blt0 = this.q(((bkk)this.i), bmi0);
        this.e = blt0;
        this.P(bbs.a(blt0.a()));
        this.I();
    }

    @Override  // ben
    public final void o() {
        this.U();
    }

    public final void p() {
        AtomicReference atomicReference0 = this.b;
        synchronized(atomicReference0) {
            if(atomicReference0.get() != null) {
                return;
            }
            this.B().r(this.a());
        }
    }

    public final blt q(bkk bkk0, bmi bmi0) {
        Object object2;
        bgf bgf1;
        bgf bgf0;
        HashSet hashSet0;
        boj.b();
        Integer integer0 = (int)1;
        int v = ((bin)j..util.Objects.requireNonNull(this.C())).F() ^ 1;
        if(this.p != null) {
            kay.c(((boolean)v));
            this.p.a();
        }
        azz azz0 = this.C().b();
        boolean z = false;
        Object object0 = null;
        if((azz0 instanceof bhi)) {
            bjt bjt0 = ((bhi)azz0).b.a().a(bne.a, 1);
            if(bjt0 == null) {
                hashSet0 = null;
            }
            else {
                bjr bjr0 = bkk.N;
                if(bjt0.s(bjr0)) {
                    hashSet0 = new HashSet();
                    hashSet0.add(Integer.valueOf(0));
                    for(Object object1: ((List)bjt0.l(bjr0))) {
                        if(((int)(((Integer)((Pair)object1).first))) == 0x1005) {
                            hashSet0.add(integer0);
                            break;
                        }
                    }
                }
                else {
                    hashSet0 = null;
                }
            }
        }
        else {
            hashSet0 = null;
        }
        if(hashSet0 == null) {
            hashSet0 = new HashSet();
            hashSet0.add(Integer.valueOf(0));
            if((azz0 instanceof bik) && ((bik)azz0).n().contains(Integer.valueOf(0x1005))) {
                hashSet0.add(integer0);
            }
            if((azz0 instanceof bik)) {
                Integer integer1 = (int)3;
                if(((bik)azz0).m().contains(integer1) && ((bik)azz0).n().contains(Integer.valueOf(0x20))) {
                    hashSet0.add(Integer.valueOf(2));
                    hashSet0.add(integer1);
                }
            }
        }
        kay.b(hashSet0.contains(Integer.valueOf(this.f())), "The specified output format (" + this.f() + ") is not supported by current configuration. Supported output formats: " + hashSet0);
        if(((Boolean)this.i.m(bkk.k, Boolean.valueOf(false))).booleanValue()) {
            bkk0.a();
            bmc bmc0 = this.C().c().b();
            if(bmc0 == null) {
                bgf1 = null;
            }
            else {
                Map map0 = bmc0.d();
                ArrayList arrayList0 = new ArrayList();
                if(bce.Y(map0, 35)) {
                    arrayList0.add(Integer.valueOf(35));
                }
                if(bce.Y(map0, 0x100)) {
                    arrayList0.add(Integer.valueOf(0x100));
                }
                if(bce.Y(map0, 0x1005)) {
                    arrayList0.add(Integer.valueOf(0x1005));
                }
                int v1 = arrayList0.isEmpty() ? 0 : ((bhz)blq.c(this.C().c(), bia.e, bia.g)).a(arrayList0);
                if(v1 == 0) {
                    bgf1 = null;
                }
                else {
                    List list0 = (List)map0.get(Integer.valueOf(v1));
                    btu btu0 = (btu)this.i.m(bkk.j, null);
                    if(btu0 == null) {
                        bgf0 = new bgf(((Size)Collections.max(list0, new bnl())), v1);
                    }
                    else {
                        Collections.sort(list0, new bnl(true));
                        bin bin0 = this.C();
                        Rect rect0 = bin0.e().e();
                        bik bik0 = bin0.e();
                        Rational rational0 = new Rational(rect0.width(), rect0.height());
                        this.z();
                        bik0.b();
                        bik0.a();
                        List list1 = bqq.f(btu0, list0, null, rational0);
                        if(list1.isEmpty()) {
                            throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                        }
                        bgf0 = new bgf(((Size)list1.get(0)), v1);
                    }
                    bgf1 = bgf0;
                }
            }
        }
        else {
            bgf1 = null;
        }
        if(this.C() != null) {
            try {
                object2 = this.C().e().i();
            }
            catch(Exception exception0) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", exception0);
                goto label_84;
            }
            if((object2 instanceof CameraCharacteristics)) {
                object0 = object2;
            }
        }
    label_84:
        this.p = new bfx(bkk0, bmi0.b, ((CameraCharacteristics)object0), ((boolean)v), bgf1);
        if(this.d == null) {
            this.d = this.i.f().a(this.r);
        }
        bhd bhd0 = this.d;
        bfx bfx0 = this.p;
        boj.b();
        bhd0.b = bfx0;
        bfx bfx1 = bhd0.b;
        boj.b();
        bfq bfq0 = bfx1.d;
        boj.b();
        if(bfq0.b != null) {
            z = true;
        }
        kay.d(z, "The ImageReader is not initialized.");
        synchronized(bfq0.b.a) {
            bfq0.b.e = bhd0;
        }
        bfx bfx2 = this.p;
        blt blt0 = blt.b(bfx2.b, bmi0.b);
        bfp bfp0 = bfx2.e;
        blt0.i(bfp0.a());
        if(bfp0.h.size() > 1) {
            bka bka0 = bfp0.d;
            if(bka0 != null) {
                blt0.i(bka0);
            }
        }
        bka bka1 = bfp0.e;
        if(bka1 != null) {
            blt0.i = bly.a(bka1).a();
        }
        blt0.h = bmi0.e;
        if(this.a == 2 && !bmi0.h) {
            this.B().A(blt0);
        }
        bjt bjt1 = bmi0.g;
        if(bjt1 != null) {
            blt0.h(bjt1);
        }
        blu blu0 = this.q;
        if(blu0 != null) {
            blu0.b();
        }
        blu blu1 = new blu(new bbt(this));
        this.q = blu1;
        blt0.f = blu1;
        return blt0;
    }

    public static boolean r(blb blb0) {
        return j..util.Objects.equals(blb0.m(bkk.e, null), Integer.valueOf(2));
    }

    public static boolean s(blb blb0) {
        return j..util.Objects.equals(blb0.m(bkk.e, null), Integer.valueOf(3));
    }

    public static boolean t(blb blb0) {
        return j..util.Objects.equals(blb0.m(bkk.e, null), Integer.valueOf(1));
    }

    @Override
    public final String toString() {
        return "ImageCapture:" + this.G();
    }
}

