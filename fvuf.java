public final class fvuf {
    public final Object a;
    public final Object b;

    public fvuf(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @Override
    public final boolean equals(Object object0) {
        fvuf fvuf0;
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof fvuf)) {
            return false;
        }
        try {
            fvuf0 = (fvuf)object0;
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
        int v = this.a.equals(fvuf0.a);
        Object object1 = this.b;
        return object1 != null ? object1.equals(fvuf0.b) & v : v != 0;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() + 0x1F) * 17;
        return this.b == null ? v : v * (this.b.hashCode() + 0x1F);
    }
}

