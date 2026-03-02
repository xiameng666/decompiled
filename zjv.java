public final class zjv {
    public final aatb a;
    public final grxw b;
    public final String c;
    public final fhrt d;
    public final int e;

    public zjv() {
        throw null;
    }

    public zjv(aatb aatb0, grxw grxw0, String s, fhrt fhrt0, int v) {
        if(aatb0 == null) {
            throw new NullPointerException("Null activeUser");
        }
        this.a = aatb0;
        if(grxw0 == null) {
            throw new NullPointerException("Null resourceKey");
        }
        this.b = grxw0;
        if(s == null) {
            throw new NullPointerException("Null languageTag");
        }
        this.c = s;
        if(fhrt0 == null) {
            throw new NullPointerException("Null callingAndroidApp");
        }
        this.d = fhrt0;
        this.e = v;
    }

    public static zjv a(aatb aatb0, grxw grxw0, fhrt fhrt0, int v) {
        return new zjv(aatb0, grxw0, aaus.a(), fhrt0, v);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof zjv) && ((ProtoLiteMessage)this.a).equals(((zjv)object0).a) && ((ProtoLiteMessage)this.b).equals(((zjv)object0).b) && this.c.equals(((zjv)object0).c) && this.d.equals(((zjv)object0).d) && this.e == ((zjv)object0).e;
    }

    @Override
    public final int hashCode() {
        int v;
        aatb aatb0 = this.a;
        if(((ProtoLiteMessage)aatb0).isImmutable()) {
            v = ((ProtoLiteMessage)aatb0).s();
        }
        else {
            int v1 = aatb0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)aatb0).s();
                aatb0.memoizedHashCode = v1;
            }
            v = v1;
        }
        grxw grxw0 = this.b;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            int v2 = ((ProtoLiteMessage)grxw0).s();
            return this.e ^ (((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ this.c.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ this.d.hashCode()) * 1000003;
        }
        int v3 = grxw0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)grxw0).s();
            grxw0.memoizedHashCode = v3;
        }
        return this.e ^ (((((v ^ 1000003) * 1000003 ^ v3) * 1000003 ^ this.c.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "CacheKey{activeUser=" + this.a.toString() + ", resourceKey=" + this.b.toString() + ", languageTag=" + this.c + ", darkModeEnabled=false, callingAndroidApp=" + this.d.toString() + ", capabilitiesKey=" + this.e + "}";
    }
}

