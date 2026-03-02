public final class dexn implements dcyy {
    public final int a;

    public dexn(int v) {
        this.a = v;
    }

    @Override  // dcyy
    public final icig a(ddag ddag0) {
        ibuq.f(ddag0, "repository");
        return new icht(new dexm(ddag0, this, null));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dexn) ? this.a == ((dexn)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "PersistVisibility(visibility=" + this.a + ")";
    }
}

