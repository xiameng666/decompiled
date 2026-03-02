import java.io.Serializable;

public final class igco extends igdr implements igdi, Serializable {
    private static final long serialVersionUID = 0xB83C78646A5BDDF9L;

    public igco() {
    }

    public igco(int v, int v1, int v2, int v3, int v4, int v5, int v6, igcm igcm0) {
        super(v, v1, v2, v3, v4, v5, v6, igcm0);
    }

    public igco(long v, igcm igcm0) {
        super(v, igcm0);
    }

    public igco(long v, igcw igcw0) {
        super(v, igcw0);
    }

    public igco(Object object0, igcw igcw0) {
        super(object0, igcw0);
    }

    public final igcn a() {
        return new igcn(this, this.b.h());
    }

    public final igcn b() {
        return new igcn(this, this.b.i());
    }

    public final igcn c() {
        return new igcn(this, this.b.s());
    }

    public final igco d(long v) {
        return v == this.a ? this : new igco(v, this.b);
    }

    public final igde e() {
        return new igde(this.a, this.b);
    }
}

