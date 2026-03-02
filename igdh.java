import java.io.Serializable;

public final class igdh extends igdr implements igdi, igdk, Serializable, Cloneable {
    private static final long serialVersionUID = 0x2796807CF37E0267L;

    public igdh() {
    }

    public igdh(long v, igcw igcw0) {
        super(v, igcw0);
    }

    @Override
    public final Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new InternalError("Clone error");
        }
    }

    public final void d(igcw igcw0) {
        igcw igcw1 = igct.e(igcw0);
        igcw igcw2 = igct.e(this.h());
        if(igcw1 == igcw2) {
            return;
        }
        long v = igcw2.k(igcw1, this.a);
        this.b = igct.d(this.b.d(igcw1));
        super.oV(v);
    }

    @Override  // igdr
    public final void oV(long v) {
        super.oV(v);
    }
}

