public final class asga {
    public final boolean a;
    public final Float b;
    private final Integer c;
    private final Integer d;

    public asga(boolean z) {
        this(z, null, null, null);
    }

    public asga(boolean z, Integer integer0, Integer integer1, Float float0) {
        this.a = z;
        this.c = integer0;
        this.d = integer1;
        this.b = float0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof asga)) {
            return false;
        }
        if(this.a != ((asga)object0).a) {
            return false;
        }
        if(!ibuq.m(this.c, ((asga)object0).c)) {
            return false;
        }
        return ibuq.m(this.d, ((asga)object0).d) ? ibuq.m(this.b, ((asga)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.c == null ? 0 : this.c.hashCode();
        int v2 = this.a ? 0x4CF : 0x4D5;
        int v3 = this.d == null ? 0 : this.d.hashCode();
        Float float0 = this.b;
        if(float0 != null) {
            v = float0.hashCode();
        }
        return ((v2 * 0x1F + v1) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "BackUpNowProgress(inProgress=" + this.a + ", totalNumberOfPackages=" + this.c + ", numberOfProcessedPackages=" + this.d + ", totalProgressFraction=" + this.b + ")";
    }
}

