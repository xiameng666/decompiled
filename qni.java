import java.util.Collections;

public final class qni extends qmq {
    private final Object e;

    public qni(qub qub0) {
        this(qub0, null);
    }

    public qni(qub qub0, Object object0) {
        super(Collections.EMPTY_LIST);
        this.d = qub0;
        this.e = object0;
    }

    @Override  // qmq
    public final float a() {
        return 1.0f;
    }

    @Override  // qmq
    public final Object e() {
        return this.d.b(0.0f, 0.0f, this.e, this.e, this.c, this.c, this.c);
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        return this.e();
    }

    @Override  // qmq
    public final void i() {
        if(this.d != null) {
            super.i();
        }
    }

    @Override  // qmq
    public final void j(float f) {
        this.c = f;
    }
}

