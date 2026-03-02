public final class fugu extends fugv {
    public final fryk a;
    public final fryk b;
    private final fryv c;
    private final frxs d;
    private final frxs e;

    public fugu(fryk fryk0, fryk fryk1) {
        this.c = null;
        this.a = fryk0;
        this.d = null;
        this.b = fryk1;
        this.e = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fugu)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fugu)object0).a)) {
            return false;
        }
        if(!ibuq.m(null, null)) {
            return false;
        }
        return ibuq.m(this.b, ((fugu)object0).b) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() * 0x1F : (((fryh)this.a).a * 961 + this.b.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "InfoShare(mergedContentDescription=null, incomingIcon=" + this.a + ", incomingIconTint=null, outGoingIcon=" + this.b + ", outGoingIconTint=null)";
    }
}

