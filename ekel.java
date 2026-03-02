final class ekel {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final himd g;
    public final gged_interceptors h;
    public final int i;
    private final long j;

    public ekel() {
        throw null;
    }

    public ekel(long v, long v1, String s, String s1, String s2, int v2, int v3, himd himd0, gged_interceptors gged0, int v4) {
        this.a = v;
        this.j = v1;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = v2;
        this.f = v3;
        this.g = himd0;
        this.h = gged0;
        this.i = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof ekel) && this.a == ((ekel)object0).a && this.j == ((ekel)object0).j) {
            String s = this.b;
            if(s != null) {
                if(s.equals(((ekel)object0).b)) {
                label_8:
                    String s1 = this.c;
                    if(s1 != null) {
                        if(s1.equals(((ekel)object0).c)) {
                        label_13:
                            String s2 = this.d;
                            if(s2 != null) {
                                if(s2.equals(((ekel)object0).d)) {
                                label_18:
                                    if(this.e == ((ekel)object0).e && this.f == ((ekel)object0).f) {
                                        himd himd0 = this.g;
                                        if(himd0 != null) {
                                            if(((ProtoLiteMessage)himd0).equals(((ekel)object0).g)) {
                                            label_24:
                                                if(ggia.i(this.h, ((ekel)object0).h)) {
                                                    return this.i == 0 ? ((ekel)object0).i == 0 : this.i == ((ekel)object0).i;
                                                }
                                            }
                                        }
                                        else if(((ekel)object0).g == null) {
                                            goto label_24;
                                        }
                                    }
                                }
                            }
                            else if(((ekel)object0).d == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((ekel)object0).c == null) {
                        goto label_13;
                    }
                }
            }
            else if(((ekel)object0).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v2;
        int v = 0;
        int v1 = ((((((this.b == null ? 0 : this.b.hashCode()) ^ (((int)(this.j ^ this.j >>> 0x20)) ^ (((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003) * 1000003) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003;
        himd himd0 = this.g;
        if(himd0 == null) {
            v2 = 0;
        }
        else if(((ProtoLiteMessage)himd0).isImmutable()) {
            v2 = ((ProtoLiteMessage)himd0).s();
        }
        else {
            int v3 = himd0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)himd0).s();
                himd0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        int v4 = ((v1 ^ v2) * 1000003 ^ this.h.hashCode()) * 1000003;
        int v5 = this.i;
        if(v5 != 0) {
            v = v5;
        }
        return v4 ^ v;
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.g);
        String s1 = String.valueOf(this.h);
        return this.i == 0 ? "RawContactValues{rawContactId=" + this.a + ", contactId=" + this.j + ", accountName=" + this.b + ", accountType=" + this.c + ", sourceId=" + this.d + ", dirty=" + this.e + ", starred=" + this.f + ", syncInfo=" + s + ", appContactData=" + s1 + ", photoType=" + "null" + "}" : "RawContactValues{rawContactId=" + this.a + ", contactId=" + this.j + ", accountName=" + this.b + ", accountType=" + this.c + ", sourceId=" + this.d + ", dirty=" + this.e + ", starred=" + this.f + ", syncInfo=" + s + ", appContactData=" + s1 + ", photoType=" + Integer.toString(this.i - 1) + "}";
    }
}

