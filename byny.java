public final class byny {
    public final String a;

    public byny(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof byny) ? ibuq.m(this.a, ((byny)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "CancelUiRequestState(appDisplayName=" + this.a + ")";
    }
}

