public final class bezx extends bfaa {
    public final int a;

    public bezx(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bezx) ? this.a == ((bezx)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "AllPasswordsImported(importedCount=" + this.a + ")";
    }
}

