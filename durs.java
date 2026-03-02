final class durs {
    public final fryv a;
    public final fryv b;
    public final fryk c;

    public durs(fryv fryv0, fryv fryv1, fryk fryk0) {
        this.a = fryv0;
        this.b = fryv1;
        this.c = fryk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof durs)) {
            return false;
        }
        if(!ibuq.m(this.a, ((durs)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((durs)object0).b) ? ibuq.m(this.c, ((durs)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (((fryr)this.a).a * 0x1F + this.b.hashCode()) * 0x1F + ((fryh)this.c).a;
    }

    @Override
    public final String toString() {
        return "IdTypeValues(title=" + this.a + ", subtitle=" + this.b + ", icon=" + this.c + ")";
    }
}

