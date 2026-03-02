import com.google.android.gms.common.data.DataHolder;

public final class fdhf extends bakp implements fces {
    private final int d;

    public fdhf(DataHolder dataHolder0, int v, int v1) {
        super(dataHolder0, v);
        this.d = v1;
    }

    @Override  // fces
    public final int a() {
        return this.q("event_type");
    }

    @Override  // fces
    public final fceu b() {
        return new fdhl(this.a, this.b, this.d);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new fdhe(this);
    }

    @Override
    public final String toString() {
        switch(this.a()) {
            case 1: {
                return "DataEventRef{ type=changed, dataitem=" + this.b().toString() + " }";
            }
            case 2: {
                return "DataEventRef{ type=deleted, dataitem=" + this.b().toString() + " }";
            }
            default: {
                return "DataEventRef{ type=unknown, dataitem=" + this.b().toString() + " }";
            }
        }
    }
}

