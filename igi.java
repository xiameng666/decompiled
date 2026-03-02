import java.util.Arrays;

public final class igi implements jks {
    public boolean a;
    public long b;
    public long c;
    final igl d;

    public igi(igl igl0) {
        this.d = igl0;
        super();
        this.b = 0x7FFFFFFF7FFFFFFFL;
        this.c = 0L;
    }

    @Override  // jks
    public final float dX() {
        return this.d.dX();
    }

    @Override  // jlc
    public final float dY() {
        return this.d.dY();
    }

    @Override  // jlc
    public final float ea(long v) {
        return jlb.a(this, v);
    }

    @Override  // jks
    public final float eb(float f) {
        return jkr.a(this, f);
    }

    @Override  // jks
    public final float ec(int v) {
        return jkr.b(this, v);
    }

    @Override  // jks
    public final float ed(long v) {
        return jkr.c(this, v);
    }

    @Override  // jks
    public final float eg(float f) {
        return jkr.d(this, f);
    }

    @Override  // jks
    public final int eh(long v) {
        return jkr.e(this, v);
    }

    @Override  // jks
    public final int ei(float f) {
        return jkr.f(this, f);
    }

    @Override  // jks
    public final long ej(long v) {
        return jkr.g(this, v);
    }

    @Override  // jks
    public final long ek(long v) {
        return jkr.h(this, v);
    }

    @Override  // jlc
    public final long el(float f) {
        return jlb.b(this, f);
    }

    @Override  // jks
    public final long em(float f) {
        return jkr.i(this, f);
    }

    public final hzk n() {
        this.a = true;
        igl igl0 = this.d;
        hzk hzk0 = igl0.J();
        if(jlf.f(this.b, 0x7FFFFFFF7FFFFFFFL)) {
            this.b = jlg.b(hzl.c(hzk0));
            this.c = hzk0.g();
        }
        igl0.L().v.f();
        return hzk0;
    }

    public final void o(ica ica0, float f) {
        igl igl0 = this.d;
        ijd ijd0 = igl0.n;
        if(ijd0 == null) {
            ijd0 = new ijd();
            igl0.n = ijd0;
        }
        int v = ibpg.A(ijd0.b, ica0);
        if(v < 0) {
            int v1 = ijd0.a;
            ica[] arr_ica = ijd0.b;
            if(v1 == arr_ica.length) {
                int v2 = v1 + v1;
                Object[] arr_object = Arrays.copyOf(arr_ica, v2);
                ibuq.e(arr_object, "copyOf(...)");
                ijd0.b = (ica[])arr_object;
                float[] arr_f = Arrays.copyOf(ijd0.c, v2);
                ibuq.e(arr_f, "copyOf(...)");
                ijd0.c = arr_f;
                byte[] arr_b = Arrays.copyOf(ijd0.d, v2);
                ibuq.e(arr_b, "copyOf(...)");
                ijd0.d = arr_b;
            }
            ijd0.b[v1] = ica0;
            ijd0.d[v1] = 3;
            ijd0.c[v1] = f;
            ++ijd0.a;
            return;
        }
        float[] arr_f1 = ijd0.c;
        if(arr_f1[v] == f) {
            byte[] arr_b1 = ijd0.d;
            if(arr_b1[v] == 2) {
                arr_b1[v] = 0;
            }
            return;
        }
        arr_f1[v] = f;
        ijd0.d[v] = 1;
    }
}

