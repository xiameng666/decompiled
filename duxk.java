public final class duxk {
    public final hkas a;
    public final ByteString b;
    public final boolean c;
    public final gtxg d;
    public final boolean e;
    private final Throwable f;

    public duxk() {
        this(null);
    }

    public duxk(hkas hkas0, ByteString hfsf0, boolean z, Throwable throwable0, gtxg gtxg0, boolean z1) {
        this.a = hkas0;
        this.b = hfsf0;
        this.c = z;
        this.f = throwable0;
        this.d = gtxg0;
        this.e = z1;
    }

    public duxk(byte[] arr_b) {
        this(null, null, false, null, null, false);
    }

    public static duxk a(duxk duxk0, hkas hkas0, ByteString hfsf0, boolean z, Throwable throwable0, gtxg gtxg0, boolean z1, int v) {
        if((v & 1) != 0) {
            hkas0 = duxk0.a;
        }
        if((v & 2) != 0) {
            hfsf0 = duxk0.b;
        }
        if((v & 4) != 0) {
            z = duxk0.c;
        }
        if((v & 8) != 0) {
            throwable0 = duxk0.f;
        }
        if((v & 16) != 0) {
            gtxg0 = duxk0.d;
        }
        if((v & 0x20) != 0) {
            z1 = duxk0.e;
        }
        return new duxk(hkas0, hfsf0, z, throwable0, gtxg0, z1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof duxk)) {
            return false;
        }
        if(!ibuq.m(this.a, ((duxk)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((duxk)object0).b)) {
            return false;
        }
        if(this.c != ((duxk)object0).c) {
            return false;
        }
        if(!ibuq.m(this.f, ((duxk)object0).f)) {
            return false;
        }
        return ibuq.m(this.d, ((duxk)object0).d) ? this.e == ((duxk)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v1;
        hkas hkas0 = this.a;
        int v = 0;
        if(hkas0 == null) {
            v1 = 0;
        }
        else if(((ProtoLiteMessage)hkas0).isImmutable()) {
            v1 = ((ProtoLiteMessage)hkas0).s();
        }
        else {
            int v2 = hkas0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)hkas0).s();
                hkas0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = (((v1 * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + duxj.a(this.c)) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F;
        gtxg gtxg0 = this.d;
        if(gtxg0 != null) {
            if(((ProtoLiteMessage)gtxg0).isImmutable()) {
                return (v3 + ((ProtoLiteMessage)gtxg0).s()) * 0x1F + duxj.a(this.e);
            }
            v = gtxg0.memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)gtxg0).s();
                gtxg0.memoizedHashCode = v;
            }
        }
        return (v3 + v) * 0x1F + duxj.a(this.e);
    }

    @Override
    public final String toString() {
        return "IdPushProvisioningState(issuer=" + this.a + ", actionToken=" + this.b + ", isLoading=" + this.c + ", error=" + this.f + ", preExistingId=" + this.d + ", requireSetupBiometric=" + this.e + ")";
    }
}

