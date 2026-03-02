import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;

public final class qnx implements ibts {
    public final Rect a;
    public final hyt b;
    public final hel c;
    public final Matrix d;
    public final qkz e;
    public final boolean f;
    public final qkb g;
    public final qox h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ibth m;
    public final gra n;
    public final int o;
    public final int p;

    public qnx(Rect rect0, hyt hyt0, hel hel0, Matrix matrix0, qkz qkz0, boolean z, int v, int v1, qkb qkb0, qox qox0, boolean z1, boolean z2, boolean z3, boolean z4, ibth ibth0, gra gra0) {
        this.a = rect0;
        this.b = hyt0;
        this.c = hel0;
        this.d = matrix0;
        this.e = qkz0;
        this.f = z;
        this.o = v;
        this.p = v1;
        this.g = qkb0;
        this.h = qox0;
        this.i = z1;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = ibth0;
        this.n = gra0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((hpd)object0), "$this$Canvas");
        hli hli0 = ((hpd)object0).t().b();
        Rect rect0 = this.a;
        float f = (float)rect0.width();
        long v = (long)Float.floatToRawIntBits(rect0.height());
        int v1 = ibvr.c(Float.intBitsToFloat(((int)(((hpd)object0).o() >> 0x20))));
        long v2 = (long)ibvr.c(Float.intBitsToFloat(((int)(((hpd)object0).o() & 0xFFFFFFFFL))));
        long v3 = ((hpd)object0).o();
        long v4 = v & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
        long v5 = this.b.a(v4, v3);
        jlm jlm0 = ((hpd)object0).q();
        long v6 = this.c.a(((long)(((int)(Float.intBitsToFloat(((int)(v4 >> 0x20))) * Float.intBitsToFloat(((int)(v5 >> 0x20))))))) << 0x20 | ((long)(((int)(Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL))) * Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL))))))) & 0xFFFFFFFFL, ((long)v1) << 0x20 | v2 & 0xFFFFFFFFL, jlm0);
        Matrix matrix0 = this.d;
        matrix0.reset();
        matrix0.preTranslate(((float)jlf.a(v6)), ((float)jlf.b(v6)));
        matrix0.preScale(Float.intBitsToFloat(((int)(v5 >> 0x20))), Float.intBitsToFloat(((int)(v5 & 0xFFFFFFFFL))));
        qkz qkz0 = this.e;
        qkz0.j(this.f);
        qkz0.A(this.o);
        qkz0.u = this.p;
        qkz0.y(this.g);
        gra gra0 = this.n;
        qox qox0 = this.h;
        if(qox0 != qob.a(gra0)) {
            qox qox1 = qob.a(gra0);
            if(qox1 != null) {
                ibuq.f(qkz0, "drawable");
                for(Object object1: qox1.a) {
                    qkz0.h(((qpb)object1).b, ((qpb)object1).a, null);
                }
                for(Object object2: qox1.b) {
                    qkz0.h(((qpb)object2).b, ((qpb)object2).a, null);
                }
                for(Object object3: qox1.c) {
                    qkz0.h(((qpb)object3).b, ((qpb)object3).a, null);
                }
                for(Object object4: qox1.d) {
                    qkz0.h(((qpb)object4).b, ((qpb)object4).a, null);
                }
                for(Object object5: qox1.e) {
                    qkz0.h(((qpb)object5).b, ((qpb)object5).a, null);
                }
                for(Object object6: qox1.f) {
                    qkz0.h(((qpb)object6).b, ((qpb)object6).a, null);
                }
                for(Object object7: qox1.g) {
                    qkz0.h(((qpb)object7).b, ((qpb)object7).a, null);
                }
                for(Object object8: qox1.h) {
                    qkz0.h(((qpb)object8).b, ((qpb)object8).a, null);
                }
                for(Object object9: qox1.i) {
                    qkz0.h(((qpb)object9).b, ((qpb)object9).a, null);
                }
                for(Object object10: qox1.j) {
                    qkz0.h(((qpb)object10).b, ((qpb)object10).a, null);
                }
            }
            if(qox0 != null) {
                ibuq.f(qkz0, "drawable");
                for(Object object11: qox0.a) {
                    qoy qoy0 = new qoy(((qpb)object11).c);
                    qkz0.h(((qpb)object11).b, ((qpb)object11).a, qoy0);
                }
                for(Object object12: qox0.b) {
                    qoy qoy1 = new qoy(((qpb)object12).c);
                    qkz0.h(((qpb)object12).b, ((qpb)object12).a, qoy1);
                }
                for(Object object13: qox0.c) {
                    qoy qoy2 = new qoy(((qpb)object13).c);
                    qkz0.h(((qpb)object13).b, ((qpb)object13).a, qoy2);
                }
                for(Object object14: qox0.d) {
                    qoy qoy3 = new qoy(((qpb)object14).c);
                    qkz0.h(((qpb)object14).b, ((qpb)object14).a, qoy3);
                }
                for(Object object15: qox0.e) {
                    qoy qoy4 = new qoy(((qpb)object15).c);
                    qkz0.h(((qpb)object15).b, ((qpb)object15).a, qoy4);
                }
                for(Object object16: qox0.f) {
                    qoy qoy5 = new qoy(((qpb)object16).c);
                    qkz0.h(((qpb)object16).b, ((qpb)object16).a, qoy5);
                }
                for(Object object17: qox0.g) {
                    qoy qoy6 = new qoy(((qpb)object17).c);
                    qkz0.h(((qpb)object17).b, ((qpb)object17).a, qoy6);
                }
                for(Object object18: qox0.h) {
                    qoy qoy7 = new qoy(((qpb)object18).c);
                    qkz0.h(((qpb)object18).b, ((qpb)object18).a, qoy7);
                }
                for(Object object19: qox0.i) {
                    qoy qoy8 = new qoy(((qpb)object19).c);
                    qkz0.h(((qpb)object19).b, ((qpb)object19).a, qoy8);
                }
                for(Object object20: qox0.j) {
                    qoy qoy9 = new qoy(((qpb)object20).c);
                    qkz0.h(((qpb)object20).b, ((qpb)object20).a, qoy9);
                }
            }
            gra0.b(qox0);
        }
        boolean z = this.i;
        if(qkz0.m != z) {
            qkz0.m = z;
            qrg qrg0 = qkz0.k;
            if(qrg0 != null) {
                qrg0.o(z);
            }
        }
        qkz0.n = this.j;
        qkz0.j = this.k;
        qkz0.p(this.l);
        qkz0.o(false);
        qkz0.u(((Number)this.m.a()).floatValue());
        qkz0.setBounds(0, 0, rect0.width(), rect0.height());
        Canvas canvas0 = hkj.a(hli0);
        qrg qrg1 = qkz0.k;
        if(qrg1 != null && qkz0.b != null) {
            try {
                boolean z1 = qkz0.w();
                if(z1) {
                    qkz0.r.acquire();
                    if(qkz0.z()) {
                        qkz0.u(qkz0.c.c());
                    }
                }
                if(qkz0.p) {
                    canvas0.save();
                    canvas0.concat(matrix0);
                    qkz0.m(canvas0, qrg1);
                    canvas0.restore();
                }
                else {
                    qrg1.b(canvas0, matrix0, qkz0.l);
                }
            }
            catch(InterruptedException unused_ex) {
                if(z1) {
                    qkz0.r.release();
                    float f1 = qkz0.c.c();
                    if(qrg1.j != f1) {
                        qkz.a.execute(qkz0.s);
                        return ibom.a;
                    }
                }
                return ibom.a;
            }
            catch(Throwable throwable0) {
                if(z1) {
                    qkz0.r.release();
                    float f2 = qkz0.c.c();
                    if(qrg1.j != f2) {
                        qkz.a.execute(qkz0.s);
                    }
                }
                throw throwable0;
            }
            qkz0.q = false;
            if(z1) {
                qkz0.r.release();
                float f3 = qkz0.c.c();
                if(qrg1.j != f3) {
                    qkz.a.execute(qkz0.s);
                }
            }
        }
        return ibom.a;
    }
}

