public abstract class igdp implements igdi, igdk {
    @Override
    public final int compareTo(Object object0) {
        if(this == ((igdk)object0)) {
            return 0;
        }
        long v = ((igdk)object0).oT();
        int v1 = Long.compare(this.oT(), v);
        if(v1 == 0) {
            return 0;
        }
        return v1 >= 0 ? 1 : -1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof igdk) ? this.oT() == ((igdk)object0).oT() && iggd.g(this.oU(), ((igdk)object0).oU()) : false;
    }

    @Override  // igdk
    public final boolean f(igdk igdk0) {
        long v = igct.b(igdk0);
        return this.oT() < v;
    }

    public final igco g() {
        return new igco(this.oT(), this.h());
    }

    public final igcw h() {
        return this.oU().B();
    }

    @Override
    public final int hashCode() {
        return ((int)(this.oT() ^ this.oT() >>> 0x20)) + this.oU().hashCode();
    }

    public final igdd i() {
        return new igdd(this.oT());
    }

    public final igdh j() {
        return new igdh(this.oT(), this.h());
    }

    public final boolean k(igdk igdk0) {
        long v = igct.b(igdk0);
        return this.oT() > v;
    }

    @Override
    public final String toString() {
        return igho.b.b(this);
    }
}

