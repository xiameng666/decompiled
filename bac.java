public final class bac {
    public final int a;
    private final Throwable b;

    public bac() {
        throw null;
    }

    public bac(int v, Throwable throwable0) {
        this.a = v;
        this.b = throwable0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof bac) && this.a == ((bac)object0).a) {
            return this.b == null ? ((bac)object0).b == null : this.b.equals(((bac)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? (this.a ^ 1000003) * 1000003 : (this.a ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}

