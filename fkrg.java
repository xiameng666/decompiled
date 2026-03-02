public final class fkrg {
    public final hfub a;
    public final Integer b;

    public fkrg() {
        throw null;
    }

    public fkrg(hfub hfub0, Integer integer0) {
        if(hfub0 == null) {
            throw new NullPointerException("Null customResult");
        }
        this.a = hfub0;
        this.b = integer0;
    }

    public static fkrg a(hfub hfub0, iapk iapk0) {
        return iapk0 == null ? new fkrg(hfub0, null) : new fkrg(hfub0, ((int)iapk0.t.r));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fkrg) && this.a.equals(((fkrg)object0).a)) {
            return this.b == null ? ((fkrg)object0).b == null : this.b.equals(((fkrg)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.b == null ? v * 1000003 : this.b.hashCode() ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "SyncTaskResult{customResult=" + this.a.toString() + ", customSecondaryResultCode=" + this.b + "}";
    }
}

