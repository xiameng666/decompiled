import java.io.Closeable;

public abstract class cjcr extends cjcp {
    public final bxd c;
    private final cjcq d;

    public cjcr(Object object0) {
        super(object0);
        this.d = new cjcq(this);
        this.c = new bxd();
    }

    protected abstract Object A(cjdm arg1);

    protected abstract void B(Object arg1, cjdm arg2);

    protected void C(Object object0, Object object1, cjdm cjdm0) {
        throw null;
    }

    protected abstract void D(cjdm arg1);

    @Override  // cjcp
    public final Closeable e() {
        ++this.d.a;
        return this.d;
    }

    @Override  // cjcp
    protected final String iy(cjdm cjdm0) {
        ibuq.f(cjdm0, "registration");
        Object object0 = this.c.get(cjdm0);
        return object0 == null ? null : object0.toString();
    }

    @Override  // cjcp
    public final void v(cjdm cjdm0) {
        ibuq.f(cjdm0, "registration");
        cjcq cjcq0 = this.d;
        if(cjcq0.a != 0) {
            ibuq.f(cjdm0, "registration");
            if(cjcq0.a == 0) {
                throw new IllegalStateException("Check failed.");
            }
            bxf bxf0 = cjcq0.b;
            if(bxf0 != null) {
                bxf0.remove(cjdm0);
            }
        }
        if(this.c.remove(cjdm0) != null) {
            this.D(cjdm0);
        }
    }

    @Override  // cjcp
    public final void x(cjdm cjdm0) {
        ibuq.f(cjdm0, "registration");
        cjcq cjcq0 = this.d;
        if(cjcq0.a == 0) {
            Object object0 = this.A(cjdm0);
            Object object1 = this.c.put(cjdm0, object0);
            if(object1 == null) {
                this.B(object0, cjdm0);
                return;
            }
            if(!ibuq.m(object1, object0)) {
                this.C(object1, object0, cjdm0);
            }
            return;
        }
        ibuq.f(cjdm0, "registration");
        if(cjcq0.a == 0) {
            throw new IllegalStateException("Check failed.");
        }
        bxf bxf0 = cjcq0.b;
        if(bxf0 == null) {
            bxf bxf1 = new bxf(cjcq0.c.c.d_num);
            cjcq0.b = bxf1;
            bxf0 = bxf1;
        }
        bxf0.add(cjdm0);
    }
}

