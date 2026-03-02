public final class fkuf {
    public final boolean a;

    public fkuf() {
        throw null;
    }

    public fkuf(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fkuf) && this.a == ((fkuf)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a ? 1001100 : 1001110;
    }

    @Override
    public final String toString() {
        return "PhotoOptions{allowDefaultImage=" + this.a + "}";
    }
}

