public final class bujj {
    public final String a;

    public bujj(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof bujj) ? ibuq.m(this.a, ((bujj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AccountInfo(accountName=" + this.a + ")";
    }
}

