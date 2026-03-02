public final class fktu {
    public final hfub a;
    public final int b;

    public fktu() {
        throw null;
    }

    public fktu(hfub hfub0, int v) {
        if(hfub0 == null) {
            throw new NullPointerException("Null syncId");
        }
        this.a = hfub0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fktu) && this.a.equals(((fktu)object0).a) && this.b == ((fktu)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "SyncInfo{syncId=" + this.a.toString() + ", syncContextType=" + fkts.a(this.b) + "}";
    }
}

