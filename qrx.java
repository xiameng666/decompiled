import android.graphics.PointF;
import java.util.List;

public final class qrx {
    private static final qtj a;
    private static final qtj b;

    static {
        qrx.a = qtj.a(new String[]{"a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa"});
        qrx.b = qtj.a(new String[]{"k"});
    }

    public static qqg a(qtl qtl0, qkb qkb0) {
        qpw qpw8;
        qqb qqb1;
        qpw qpw7;
        qpw qpw6;
        int v = qtl0.q();
        if(v == 3) {
            qtl0.i();
        }
        qpw qpw0 = null;
        qpz qpz0 = null;
        qqh qqh0 = null;
        qqb qqb0 = null;
        qpw qpw1 = null;
        qpw qpw2 = null;
        qpy qpy0 = null;
        qpw qpw3 = null;
        qpw qpw4 = null;
        while(qtl0.o()) {
            switch(qtl0.c(qrx.a)) {
                case 0: {
                    qtl0.i();
                    while(qtl0.o()) {
                        if(qtl0.c(qrx.b) == 0) {
                            qpz0 = qrv.a(qtl0, qkb0);
                        }
                        else {
                            qtl0.m();
                            qtl0.n();
                        }
                    }
                    qtl0.k();
                    break;
                }
                case 1: {
                    qqh0 = qrv.b(qtl0, qkb0);
                    break;
                }
                case 2: {
                    qqb0 = new qqb(qry.h(qtl0, qkb0, qsz.a));
                    break;
                }
                case 3: {
                    qkb0.f("Lottie doesn\'t support 3D layers.");
                    goto label_32;
                }
                case 4: {
                label_32:
                    qpw qpw5 = qry.c(qtl0, qkb0, false);
                    List list0 = qpw5.a;
                    if(list0.isEmpty()) {
                        Float float0 = (float)0.0f;
                        qpw6 = qpw5;
                        list0.add(new qtz(qkb0, float0, float0, null, 0.0f, ((float)qkb0.l)));
                    }
                    else {
                        qpw6 = qpw5;
                        if(((qtz)list0.get(0)).b == null) {
                            Float float1 = (float)0.0f;
                            list0.set(0, new qtz(qkb0, float1, float1, null, 0.0f, ((float)qkb0.l)));
                        }
                    }
                    qpw0 = qpw6;
                    break;
                }
                case 5: {
                    qpy0 = qry.e(qtl0, qkb0);
                    break;
                }
                case 6: {
                    qpw3 = qry.c(qtl0, qkb0, false);
                    break;
                }
                case 7: {
                    qpw4 = qry.c(qtl0, qkb0, false);
                    break;
                }
                case 8: {
                    qpw1 = qry.c(qtl0, qkb0, false);
                    break;
                }
                case 9: {
                    qpw2 = qry.c(qtl0, qkb0, false);
                    break;
                }
                default: {
                    qtl0.m();
                    qtl0.n();
                }
            }
        }
        if(v == 3) {
            qtl0.k();
        }
        if(qpz0 == null || qpz0.c() && ((PointF)((qtz)qpz0.a.get(0)).b).equals(0.0f, 0.0f)) {
            qpz0 = null;
        }
        qqh qqh1 = qqh0 == null || !(qqh0 instanceof qqd) && qqh0.c() && ((PointF)((qtz)qqh0.b().get(0)).b).equals(0.0f, 0.0f) ? null : qqh0;
        if(qpw0 == null) {
            qpw7 = null;
        }
        else if(qpw0.c() && ((float)(((Float)((qtz)qpw0.a.get(0)).b))) == 0.0f) {
            qpw7 = null;
        }
        else {
            qpw7 = qpw0;
        }
        if(qqb0 == null) {
            qqb1 = null;
        }
        else if(qqb0.c()) {
            quc quc0 = (quc)((qtz)qqb0.a.get(0)).b;
            qqb1 = quc0.a == 1.0f && quc0.b == 1.0f ? null : qqb0;
        }
        else {
            qqb1 = qqb0;
        }
        if(qpw1 == null) {
            qpw8 = null;
        }
        else if(qpw1.c() && ((float)(((Float)((qtz)qpw1.a.get(0)).b))) == 0.0f) {
            qpw8 = null;
        }
        else {
            qpw8 = qpw1;
        }
        if(qpw2 != null) {
            return !qpw2.c() || ((float)(((Float)((qtz)qpw2.a.get(0)).b))) != 0.0f ? new qqg(qpz0, qqh1, qqb1, qpw7, qpy0, qpw3, qpw4, qpw8, qpw2) : new qqg(qpz0, qqh1, qqb1, qpw7, qpy0, qpw3, qpw4, qpw8, null);
        }
        return new qqg(qpz0, qqh1, qqb1, qpw7, qpy0, qpw3, qpw4, qpw8, null);
    }
}

