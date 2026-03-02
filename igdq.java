public abstract class igdq implements igdm, Comparable {
    public int a(igdm igdm0) {
        if(this == igdm0) {
            return 0;
        }
        if(this.g() != igdm0.g()) {
            throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        int v = this.g();
        int v1 = 0;
        while(v1 < v) {
            if(this.n(v1) != igdm0.n(v1)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
            ++v1;
            continue;
        }
        int v2 = this.g();
        for(int v3 = 0; v3 < v2; ++v3) {
            if(this.e(v3) > igdm0.e(v3)) {
                return 1;
            }
            if(this.e(v3) < igdm0.e(v3)) {
                return -1;
            }
        }
        return 0;
    }

    @Override  // igdm
    public int b(igcr igcr0) {
        throw null;
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((igdm)object0));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof igdm)) {
            return false;
        }
        if(this.g() != ((igdm)object0).g()) {
            return false;
        }
        int v = this.g();
        int v1 = 0;
        while(v1 < v) {
            if(this.e(v1) == ((igdm)object0).e(v1) && this.n(v1) == ((igdm)object0).n(v1)) {
                ++v1;
                continue;
            }
            return false;
        }
        return iggd.g(this.h(), ((igdm)object0).h());
    }

    @Override
    public int hashCode() {
        int v1 = 0x9D;
        for(int v = 0; v < this.g(); ++v) {
            v1 = (v1 * 23 + this.e(v)) * 23 + this.n(v).hashCode();
        }
        return v1 + this.h().hashCode();
    }

    protected abstract igcp i(int arg1, igcm arg2);

    @Override  // igdm
    public boolean k(igcr igcr0) {
        throw null;
    }

    @Override  // igdm
    public final igcr n(int v) {
        return this.i(v, this.h()).v();
    }

    public final boolean o(igdm igdm0) {
        return this.a(igdm0) < 0;
    }
}

