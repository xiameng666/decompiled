public final class bgdu implements bgdv {
    public final boolean a;

    public bgdu(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bgdu) ? this.a == ((bgdu)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return "WelcomeScreenState(isRefreshing=" + this.a + ")";
    }
}

