import java.util.List;

public final class fudg {
    public final List a;
    public final int b;
    public final fudf c;

    public fudg() {
        this(null);
    }

    public fudg(List list0, int v, fudf fudf0) {
        ibuq.f(fudf0, "style");
        super();
        this.a = list0;
        this.b = v;
        this.c = fudf0;
        int v1 = list0.size();
        if(v1 <= 0 || v1 >= 4) {
            throw new IllegalArgumentException("Must have between 1 and 3 images");
        }
        if(v != 0) {
            if(v <= 1) {
                throw new IllegalArgumentException("Extra count must be greater than 1");
            }
            if(list0.size() != 2) {
                throw new IllegalArgumentException("Extra count only supported with 2 images");
            }
        }
    }

    public fudg(byte[] arr_b) {
        this(ibps.a, 0, fudf.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fudg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fudg)object0).a)) {
            return false;
        }
        return this.b == ((fudg)object0).b ? this.c == ((fudg)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "TileImages(images=" + this.a + ", extraCount=" + this.b + ", style=" + this.c + ")";
    }
}

