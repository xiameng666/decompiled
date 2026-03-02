public final class gpmr {
    public final iaoa a;
    private final ialn b;
    private final ialn c;
    private final ialn d;

    public gpmr(iaoa iaoa0, ialn ialn0, ialn ialn1, ialn ialn2) {
        this.a = iaoa0;
        this.b = ialn0;
        this.c = ialn1;
        this.d = ialn2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gpmr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gpmr)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((gpmr)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((gpmr)object0).c) ? ibuq.m(this.d, ((gpmr)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ")";
    }
}

