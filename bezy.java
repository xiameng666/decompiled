public final class bezy extends bfaa {
    public final int a;

    public bezy(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bezy) ? this.a == ((bezy)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "NoPasswordsImported(notImportedCount=" + this.a + ")";
    }
}

