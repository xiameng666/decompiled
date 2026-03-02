public final class dexd implements dcyy {
    public final boolean a;

    public dexd(boolean z) {
        this.a = z;
    }

    @Override  // dcyy
    public final icig a(ddag ddag0) {
        ibuq.f(ddag0, "repository");
        return new icht(new dexc(this, ddag0, null));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dexd) ? this.a == ((dexd)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return "OnAllowRadioToggling(isAllowed=" + this.a + ")";
    }
}

