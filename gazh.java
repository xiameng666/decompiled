import java.util.Set;

public final class gazh extends gazi {
    public final Set a;

    public gazh() {
        this(null);
    }

    public gazh(Set set0) {
        ibuq.f(set0, "initialValues");
        super(gazj.c);
        this.a = ibpo.ax(set0);
    }

    public gazh(byte[] arr_b) {
        this(ibpu.a);
    }

    public final Set a() {
        Set set0;
        synchronized(this.a) {
            set0 = ibpo.ay(this.a);
        }
        return set0;
    }

    public final void b(long v) {
        synchronized(this.a) {
            this.a.add(Long.valueOf(v));
        }
    }
}

