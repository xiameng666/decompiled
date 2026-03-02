public final class fdww {
    public final fdwu a;

    public fdww() {
        throw null;
    }

    public fdww(fdwu fdwu0) {
        this.a = fdwu0;
    }

    public static fdwv a() {
        fdwv fdwv0 = new fdwv();
        fdwv0.b(fdwu.a);
        return fdwv0;
    }

    public static fdww b() {
        return fdww.a().a();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fdww) ? this.a.equals(((fdww)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "MessageTransportConfig{dataSyncMode=" + this.a + "}";
    }
}

