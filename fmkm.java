final class fmkm extends fmko {
    private final fmjm b;

    public fmkm(fmjm fmjm0) {
        this.b = fmjm0;
    }

    @Override  // fmko
    public final fmjm a() {
        return this.b;
    }

    @Override  // fmlw
    public final fmlv b() {
        return fmlv.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmlw)) {
            fmlv fmlv0 = ((fmlw)object0).b();
            if(fmlv.a == fmlv0) {
                fmjm fmjm0 = ((fmlw)object0).a();
                return this.b.equals(fmjm0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "MediaSource{mediaId=" + this.b.toString() + "}";
    }
}

