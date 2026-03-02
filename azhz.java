public final class azhz {
    public final boolean a;
    public final int b;
    public final long c;
    public final long d;
    public final gged_interceptors e;

    public azhz() {
        throw null;
    }

    public azhz(boolean z, int v, long v1, long v2, gged_interceptors gged0) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = gged0;
    }

    public static azhy a() {
        azhy azhy0 = new azhy();
        azhy0.g(false);
        azhy0.e(-1);
        azhy0.f(-1L);
        azhy0.d(-1L);
        return azhy0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azhz) && this.a == ((azhz)object0).a && this.b == ((azhz)object0).b && this.c == ((azhz)object0).c && this.d == ((azhz)object0).d && ggia.i(this.e, ((azhz)object0).e);
    }

    @Override
    public final int hashCode() {
        return this.a ? this.e.hashCode() ^ (((0x16638EA4 ^ this.b) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 : this.e.hashCode() ^ (((0x16FC2542 ^ this.b) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003;
    }

    @Override
    public final String toString() {
        return "UploadResult{uploadSucceeded=" + this.a + ", lastServerResponseCode=" + this.b + ", lastServerSuccessResponseTimeMillis=" + this.c + ", lastServerErrorResponseTimeMillis=" + this.d + ", uploadedQosTiers=" + this.e + "}";
    }
}

