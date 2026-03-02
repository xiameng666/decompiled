public final class dgbe {
    public final dgbd a;
    public final dbxx b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public dgbe() {
        throw null;
    }

    public dgbe(dgbd dgbd0, dbxx dbxx0, boolean z, boolean z1, boolean z2, boolean z3) {
        if(dgbd0 == null) {
            throw new NullPointerException("Null syncResult");
        }
        this.a = dgbd0;
        if(dbxx0 == null) {
            throw new NullPointerException("Null contactBook");
        }
        this.b = dbxx0;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof dgbe) && this.a.equals(((dgbe)object0).a) && ((ProtoLiteMessage)this.b).equals(((dgbe)object0).b) && this.c == ((dgbe)object0).c && this.d == ((dgbe)object0).d && this.e == ((dgbe)object0).e && this.f == ((dgbe)object0).f;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.a.hashCode() ^ 1000003;
        dbxx dbxx0 = this.b;
        if(((ProtoLiteMessage)dbxx0).isImmutable()) {
            v1 = ((ProtoLiteMessage)dbxx0).s();
        }
        else {
            int v2 = dbxx0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)dbxx0).s();
                dbxx0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = 0x4D5;
        int v4 = this.c ? 0x4CF : 0x4D5;
        int v5 = this.d ? 0x4CF : 0x4D5;
        int v6 = this.e ? 0x4CF : 0x4D5;
        if(this.f) {
            v3 = 0x4CF;
        }
        return ((((v * 1000003 ^ v1) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v3;
    }

    @Override
    public final String toString() {
        return "SyncResultWrapper{syncResult=" + this.a.toString() + ", contactBook=" + this.b.toString() + ", wasEmailAddressAdded=" + this.c + ", wasPhoneNumberAdded=" + this.d + ", wasEmailAddressRemoved=" + this.e + ", wasPhoneNumberRemoved=" + this.f + "}";
    }
}

