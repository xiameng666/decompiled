import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class qqw {
    public final List a;
    public PointF b;
    public boolean c;

    public qqw() {
        this.a = new ArrayList();
    }

    public qqw(PointF pointF0, boolean z, List list0) {
        this.b = pointF0;
        this.c = z;
        this.a = new ArrayList(list0);
    }

    public final void a(float f, float f1) {
        if(this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f1);
    }

    @Override
    public final String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + "}";
    }
}

