import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

final class qso {
    static final qtj a;
    static final qtj b;
    private static final Interpolator c;

    static {
        qso.c = new LinearInterpolator();
        qso.a = qtj.a(new String[]{"t", "s", "e", "o", "i", "h", "to", "ti"});
        qso.b = qtj.a(new String[]{"x", "y"});
    }

    static qtz a(qtl qtl0, qkb qkb0, float f, qtg qtg0, boolean z, boolean z1) {
        Object object7;
        Interpolator interpolator3;
        Interpolator interpolator2;
        Interpolator interpolator1;
        Object object4;
        Interpolator interpolator0;
        Object object3;
        PointF pointF10;
        PointF pointF9;
        Object object2;
        if(z) {
            if(z1) {
                qtl0.i();
                PointF pointF0 = null;
                PointF pointF1 = null;
                int v = 0;
                PointF pointF2 = null;
                PointF pointF3 = null;
                PointF pointF4 = null;
                Object object0 = null;
                PointF pointF5 = null;
                PointF pointF6 = null;
                PointF pointF7 = null;
                float f1 = 0.0f;
                Object object1 = null;
                while(qtl0.o()) {
                    switch(qtl0.c(qso.a)) {
                        case 0: {
                            f1 = (float)qtl0.a();
                            pointF2 = pointF2;
                            pointF3 = pointF3;
                            v = v;
                            break;
                        }
                        case 1: {
                            object0 = qtg0.a(qtl0, f);
                            v = v;
                            break;
                        }
                        case 2: {
                            object1 = qtg0.a(qtl0, f);
                            v = v;
                            break;
                        }
                        case 3: {
                            PointF pointF8 = pointF2;
                            if(qtl0.q() == 3) {
                                qtl0.i();
                                float f2 = 0.0f;
                                float f3 = 0.0f;
                                float f4 = 0.0f;
                                float f5 = 0.0f;
                                while(qtl0.o()) {
                                    switch(qtl0.c(qso.b)) {
                                        case 0: {
                                            if(qtl0.q() == 7) {
                                                f4 = (float)qtl0.a();
                                                pointF8 = pointF8;
                                                f2 = f4;
                                                continue;
                                            }
                                            else {
                                                qtl0.h();
                                                f2 = (float)qtl0.a();
                                                f4 = qtl0.q() == 7 ? ((float)qtl0.a()) : f2;
                                                qtl0.j();
                                                pointF8 = pointF8;
                                                break;
                                            }
                                            goto label_53;
                                        }
                                        case 1: {
                                        label_53:
                                            if(qtl0.q() == 7) {
                                                f5 = (float)qtl0.a();
                                                pointF8 = pointF8;
                                                f3 = f5;
                                            }
                                            else {
                                                qtl0.h();
                                                f3 = (float)qtl0.a();
                                                f5 = qtl0.q() == 7 ? ((float)qtl0.a()) : f3;
                                                qtl0.j();
                                                pointF8 = pointF8;
                                            }
                                            break;
                                        }
                                        default: {
                                            qtl0.n();
                                        }
                                    }
                                }
                                pointF4 = new PointF(f2, f3);
                                pointF5 = new PointF(f4, f5);
                                qtl0.k();
                                pointF2 = pointF8;
                            }
                            else {
                                pointF2 = qsn.c(qtl0, f);
                            }
                            pointF3 = pointF3;
                            v = v;
                            object0 = object0;
                            break;
                        }
                        case 4: {
                            if(qtl0.q() == 3) {
                                qtl0.i();
                                float f6 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                float f9 = 0.0f;
                                while(qtl0.o()) {
                                    int v1 = qtl0.c(qso.b);
                                    if(v1 == 0) {
                                    label_103:
                                        pointF10 = pointF3;
                                        object2 = object0;
                                        pointF9 = pointF2;
                                        if(qtl0.q() == 7) {
                                            f8 = (float)qtl0.a();
                                            pointF3 = pointF10;
                                            pointF2 = pointF9;
                                            f6 = f8;
                                            goto label_118;
                                        }
                                        else {
                                            qtl0.h();
                                            f6 = (float)qtl0.a();
                                            f8 = qtl0.q() == 7 ? ((float)qtl0.a()) : f6;
                                        }
                                    }
                                    else {
                                        object2 = object0;
                                        if(v1 != 1) {
                                            qtl0.n();
                                            goto label_118;
                                        }
                                        else if(qtl0.q() == 7) {
                                            f9 = (float)qtl0.a();
                                            pointF2 = pointF2;
                                            f7 = f9;
                                            goto label_118;
                                        }
                                        else {
                                            pointF9 = pointF2;
                                            qtl0.h();
                                            f7 = (float)qtl0.a();
                                            if(qtl0.q() == 7) {
                                                pointF10 = pointF3;
                                                f9 = (float)qtl0.a();
                                            }
                                            else {
                                                pointF10 = pointF3;
                                                f9 = f7;
                                            }
                                            goto label_115;
                                        }
                                        goto label_103;
                                    }
                                label_115:
                                    qtl0.j();
                                    pointF3 = pointF10;
                                    pointF2 = pointF9;
                                label_118:
                                    v = v;
                                    object0 = object2;
                                }
                                object3 = object0;
                                PointF pointF11 = new PointF(f6, f7);
                                PointF pointF12 = new PointF(f8, f9);
                                qtl0.k();
                                pointF7 = pointF12;
                                pointF6 = pointF11;
                                pointF2 = pointF2;
                                v = v;
                            }
                            else {
                                object3 = object0;
                                pointF3 = qsn.c(qtl0, f);
                            }
                            object0 = object3;
                            break;
                        }
                        case 5: {
                            if(qtl0.b() == 1) {
                                v = 1;
                                continue;
                            }
                            else {
                                v = 0;
                                break;
                            }
                            pointF0 = qsn.c(qtl0, f);
                            break;
                        }
                        case 6: {
                            pointF0 = qsn.c(qtl0, f);
                            break;
                        }
                        case 7: {
                            pointF1 = qsn.c(qtl0, f);
                            break;
                        }
                        default: {
                            qtl0.n();
                            v = v;
                        }
                    }
                }
                qtl0.k();
                if(v != 0) {
                    interpolator0 = qso.c;
                    object4 = object0;
                    interpolator1 = null;
                    interpolator2 = null;
                }
                else if(pointF2 != null && pointF3 != null) {
                    interpolator0 = qso.b(pointF2, pointF3);
                    object4 = object1;
                    interpolator1 = null;
                    interpolator2 = null;
                }
                else if(pointF4 != null && pointF5 != null && pointF6 != null && pointF7 != null) {
                    interpolator1 = qso.b(pointF4, pointF6);
                    interpolator2 = qso.b(pointF5, pointF7);
                    object4 = object1;
                    interpolator0 = null;
                }
                else {
                    interpolator0 = qso.c;
                    object4 = object1;
                    interpolator1 = null;
                    interpolator2 = null;
                }
                qtz qtz0 = interpolator1 == null ? new qtz(qkb0, object0, object4, interpolator0, f1, null) : new qtz(qkb0, object0, object4, interpolator1, interpolator2, f1);
                qtz0.l = pointF0;
                qtz0.m = pointF1;
                return qtz0;
            }
            qtl0.i();
            PointF pointF13 = null;
            PointF pointF14 = null;
            PointF pointF15 = null;
            boolean z2 = false;
            PointF pointF16 = null;
            Object object5 = null;
            float f10 = 0.0f;
            Object object6 = null;
            while(qtl0.o()) {
                switch(qtl0.c(qso.a)) {
                    case 0: {
                        f10 = (float)qtl0.a();
                        break;
                    }
                    case 1: {
                        object5 = qtg0.a(qtl0, f);
                        break;
                    }
                    case 2: {
                        object6 = qtg0.a(qtl0, f);
                        break;
                    }
                    case 3: {
                        pointF13 = qsn.c(qtl0, 1.0f);
                        break;
                    }
                    case 4: {
                        pointF14 = qsn.c(qtl0, 1.0f);
                        break;
                    }
                    case 5: {
                        if(qtl0.b() == 1) {
                            z2 = true;
                            continue;
                        }
                        else {
                            z2 = false;
                            break;
                        }
                        pointF15 = qsn.c(qtl0, f);
                        break;
                    }
                    case 6: {
                        pointF15 = qsn.c(qtl0, f);
                        break;
                    }
                    case 7: {
                        pointF16 = qsn.c(qtl0, f);
                        break;
                    }
                    default: {
                        qtl0.n();
                    }
                }
            }
            qtl0.k();
            if(z2) {
                interpolator3 = qso.c;
                object7 = object5;
            }
            else {
                interpolator3 = pointF13 == null || pointF14 == null ? qso.c : qso.b(pointF13, pointF14);
                object7 = object6;
            }
            qtz qtz1 = new qtz(qkb0, object5, object7, interpolator3, f10, null);
            qtz1.l = pointF15;
            qtz1.m = pointF16;
            return qtz1;
        }
        return new qtz(qtg0.a(qtl0, f));
    }

    private static Interpolator b(PointF pointF0, PointF pointF1) {
        try {
            pointF0.x = qtt.a(pointF0.x, -1.0f, 1.0f);
            pointF0.y = qtt.a(pointF0.y, -100.0f, 100.0f);
            pointF1.x = qtt.a(pointF1.x, -1.0f, 1.0f);
            pointF1.y = qtt.a(pointF1.y, -100.0f, 100.0f);
            return new PathInterpolator(pointF0.x, pointF0.y, pointF1.x, pointF1.y);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            return "The Path cannot loop back on itself.".equals(illegalArgumentException0.getMessage()) ? new PathInterpolator(Math.min(pointF0.x, 1.0f), pointF0.y, Math.max(pointF1.x, 0.0f), pointF1.y) : new LinearInterpolator();
        }
    }
}

