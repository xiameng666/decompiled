final class fmkn extends fmko {
    private final String b;

    public fmkn(String s) {
        this.b = s;
    }

    @Override  // fmlw
    public final fmlv b() {
        return fmlv.b;
    }

    @Override  // fmko
    public final String c() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmlw)) {
            fmlv fmlv0 = ((fmlw)object0).b();
            if(fmlv.b == fmlv0) {
                String s = ((fmlw)object0).c();
                return this.b.equals(s);
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
        return "MediaSource{url=" + this.b + "}";
    }
}

