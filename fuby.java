public final class fuby extends fuca {
    public final fryv a;
    public final frxs b;

    public fuby(fryv fryv0, frxs frxs0) {
        this.a = fryv0;
        this.b = frxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuby)) {
            return false;
        }
        return ibuq.m(this.a, ((fuby)object0).a) ? ibuq.m(this.b, ((fuby)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + ((frxo)this.b).a;
    }

    @Override
    public final String toString() {
        return "Text(text=" + this.a + ", color=" + this.b + ")";
    }
}

