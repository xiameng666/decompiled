public final class fufh extends fufj {
    public final fryv a;
    public final fryk b;
    public final fufg c;

    public fufh(fryv fryv0, fryk fryk0, fufg fufg0) {
        ibuq.f(fufg0, "status");
        super();
        this.a = fryv0;
        this.b = fryk0;
        this.c = fufg0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fufh)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fufh)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((fufh)object0).b) ? this.c == ((fufh)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v * 0x1F + this.c.hashCode() : (v + ((fryh)this.b).a) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Custom(text=" + this.a + ", icon=" + this.b + ", status=" + this.c + ")";
    }
}

