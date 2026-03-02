import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

public final class qne extends qmq {
    protected qub e;
    protected qub f;
    private final PointF g;
    private final PointF h;
    private final qmq i;
    private final qmq j;

    public qne(qmq qmq0, qmq qmq1) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = qmq0;
        this.j = qmq1;
        this.j(this.c);
    }

    @Override  // qmq
    public final Object e() {
        return this.k(0.0f);
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        return this.k(f);
    }

    @Override  // qmq
    public final void j(float f) {
        this.i.j(f);
        this.j.j(f);
        float f1 = (float)(((Float)this.i.e()));
        float f2 = (float)(((Float)this.j.e()));
        this.g.set(f1, f2);
        for(int v = 0; true; ++v) {
            List list0 = this.a;
            if(v >= list0.size()) {
                break;
            }
            ((qml)list0.get(v)).d();
        }
    }

    final PointF k(float f) {
        Float float1;
        float f2;
        Float float0 = null;
        if(this.e == null) {
            f2 = f;
            float1 = null;
        }
        else {
            qmq qmq0 = this.i;
            qtz qtz0 = qmq0.d();
            if(qtz0 == null) {
                f2 = f;
                float1 = null;
            }
            else {
                float f1 = qmq0.b();
                f2 = f;
                float1 = (Float)this.e.b(qtz0.g, (qtz0.h == null ? qtz0.g : ((float)qtz0.h)), ((Float)qtz0.b), ((Float)qtz0.c), f, f, f1);
            }
        }
        if(this.f != null) {
            qmq qmq1 = this.j;
            qtz qtz1 = qmq1.d();
            if(qtz1 != null) {
                float f3 = qmq1.b();
                float0 = (Float)this.f.b(qtz1.g, (qtz1.h == null ? qtz1.g : ((float)qtz1.h)), ((Float)qtz1.b), ((Float)qtz1.c), f2, f2, f3);
            }
        }
        if(float1 == null) {
            this.h.set(this.g.x, 0.0f);
        }
        else {
            this.h.set(float1.floatValue(), 0.0f);
        }
        if(float0 == null) {
            this.h.set(this.h.x, this.g.y);
            return this.h;
        }
        this.h.set(this.h.x, float0.floatValue());
        return this.h;
    }
}

