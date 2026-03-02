final class dgec {
    public final ibts a;
    public final ibts b;
    public final ibts c;
    public final ibtx d;

    public dgec(ibts ibts0, ibts ibts1, ibts ibts2, ibtx ibtx0) {
        this.a = ibts0;
        this.b = ibts1;
        this.c = ibts2;
        this.d = ibtx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgec)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dgec)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgec)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((dgec)object0).c) ? ibuq.m(this.d, ((dgec)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "DiscoveryCallbacks(onDiscovered=" + this.a + ", onUpdated=" + this.b + ", onLost=" + this.c + ", onRangingData=" + this.d + ")";
    }
}

