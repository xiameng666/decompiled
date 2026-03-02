public final class ddkk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ddkk(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public static ddkk a(ddkk ddkk0, int v, int v1, int v2, int v3) {
        int v4 = (v3 & 1) == 0 ? 0 : ddkk0.a;
        if((v3 & 2) != 0) {
            v = ddkk0.b;
        }
        if((v3 & 4) != 0) {
            v1 = ddkk0.c;
        }
        if((v3 & 8) != 0) {
            v2 = ddkk0.d;
        }
        return new ddkk(v4, v, v1, v2);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ddkk)) {
            return false;
        }
        if(this.a != ((ddkk)object0).a) {
            return false;
        }
        if(this.b != ((ddkk)object0).b) {
            return false;
        }
        return this.c == ((ddkk)object0).c ? this.d == ((ddkk)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "AnalyticsTransferMetadataEntity(id=" + this.a + ", firstSuccessfulTransferDate=" + this.b + ", previousSuccessfulTransferDate=" + this.c + ", transferCount=" + this.d + ")";
    }
}

