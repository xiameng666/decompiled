final class bxsx {
    public final gful_cronetEngineProvider a;
    public final bboh b;

    public bxsx() {
        throw null;
    }

    public bxsx(gful_cronetEngineProvider gful0, bboh bboh0) {
        this.a = gful0;
        this.b = bboh0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bxsx) && this.a.equals(((bxsx)object0).a)) {
            return this.b == null ? ((bxsx)object0).b == null : this.b.equals(((bxsx)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b == null ? v * 1000003 : this.b.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "Parameters{executorSupplier=" + this.a + ", loggerForCaughtExceptions=" + this.b + "}";
    }
}

