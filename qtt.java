import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public final class qtt {
    public static final int a;
    private static final PointF b;

    static {
        qtt.b = new PointF();
    }

    public static float a(float f, float f1, float f2) {
        return Math.max(f1, Math.min(f2, f));
    }

    static int b(float f, float f1) {
        int v = ((int)f) / ((int)f1);
        if((((int)f) ^ ((int)f1)) < 0 && ((int)f) % ((int)f1) != 0) {
            --v;
        }
        return ((int)f) - ((int)f1) * v;
    }

    public static PointF c(PointF pointF0, PointF pointF1) {
        return new PointF(pointF0.x + pointF1.x, pointF0.y + pointF1.y);
    }

    public static void d(qqw qqw0, Path path0) {
        Path path1;
        path0.reset();
        PointF pointF0 = qqw0.b;
        path0.moveTo(pointF0.x, pointF0.y);
        PointF pointF1 = qtt.b;
        pointF1.set(pointF0.x, pointF0.y);
        int v = 0;
        while(true) {
            List list0 = qqw0.a;
            if(v >= list0.size()) {
                break;
            }
            qpm qpm0 = (qpm)list0.get(v);
            PointF pointF2 = qpm0.a;
            PointF pointF3 = qpm0.b;
            PointF pointF4 = qpm0.c;
            if(pointF2.equals(pointF1) && pointF3.equals(pointF4)) {
                path0.lineTo(pointF4.x, pointF4.y);
                path1 = path0;
            }
            else {
                path1 = path0;
                path1.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            }
            pointF1.set(pointF4.x, pointF4.y);
            ++v;
            path0 = path1;
        }
        if(qqw0.c) {
            path0.close();
        }
    }

    public static void e(qpq qpq0, int v, List list0, qpq qpq1, qmb qmb0) {
        if(qpq0.d(qmb0.g(), v)) {
            list0.add(qpq1.b(qmb0.g()).c(qmb0));
        }
    }

    public static int f(int v) {
        return Math.max(0, Math.min(0xFF, v));
    }
}

