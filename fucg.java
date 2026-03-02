import java.util.Arrays;

public final class fucg {
    public final fryv a;
    public final int b;
    public final fhvp[] c;
    public final ibth d;
    private final fryk e;

    public fucg(fryv fryv0, int v, fhvp[] arr_fhvp, ibth ibth0) {
        ibuq.f(ibth0, "onClick");
        super();
        this.a = fryv0;
        this.e = null;
        this.b = v;
        this.c = arr_fhvp;
        this.d = ibth0;
    }

    public fucg(fryv fryv0, ibth ibth0) {
        this(fryv0, 0, new fhvp[0], ibth0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fucg)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fucg)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(this.b != ((fucg)object0).b) {
            return false;
        }
        return ibuq.m(this.c, ((fucg)object0).c) ? ibuq.m(this.d, ((fucg)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c);
        return ((this.a.hashCode() * 961 + this.b) * 0x1F + v) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.c);
        return "TileActionButton(text=" + this.a + ", leadingIcon=null, veLogConst=" + this.b + ", veLogMetadata=" + s + ", onClick=" + this.d + ")";
    }
}

