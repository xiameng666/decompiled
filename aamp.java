public final class aamp implements fhrs {
    public final grul a;
    public final aatb b;
    public final fhrt c;
    public final boolean d;
    public final boolean e;
    public final grxw f;
    public final grxw g;

    public aamp() {
        throw null;
    }

    public aamp(grul grul0, aatb aatb0, fhrt fhrt0, boolean z, boolean z1, grxw grxw0, grxw grxw1) {
        if(grul0 == null) {
            throw new NullPointerException("Null getAlternative");
        }
        this.a = grul0;
        this.b = aatb0;
        if(fhrt0 == null) {
            throw new NullPointerException("Null getCallingAndroidApp");
        }
        this.c = fhrt0;
        this.d = z;
        this.e = z1;
        if(grxw0 == null) {
            throw new NullPointerException("Null getCurrentScreenKey");
        }
        this.f = grxw0;
        if(grxw1 == null) {
            throw new NullPointerException("Null getTargetScreenKey");
        }
        this.g = grxw1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aamp) && ((ProtoLiteMessage)this.a).equals(((aamp)object0).a) && ((ProtoLiteMessage)this.b).equals(((aamp)object0).b) && this.c.equals(((aamp)object0).c) && this.d == ((aamp)object0).d && this.e == ((aamp)object0).e && ((ProtoLiteMessage)this.f).equals(((aamp)object0).f) && ((ProtoLiteMessage)this.g).equals(((aamp)object0).g);
    }

    @Override
    public final int hashCode() {
        int v7;
        int v2;
        int v;
        grul grul0 = this.a;
        if(((ProtoLiteMessage)grul0).isImmutable()) {
            v = ((ProtoLiteMessage)grul0).s();
        }
        else {
            int v1 = grul0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grul0).s();
                grul0.memoizedHashCode = v1;
            }
            v = v1;
        }
        aatb aatb0 = this.b;
        if(((ProtoLiteMessage)aatb0).isImmutable()) {
            v2 = ((ProtoLiteMessage)aatb0).s();
        }
        else {
            int v3 = aatb0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)aatb0).s();
                aatb0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        int v4 = ((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ this.c.hashCode();
        int v5 = 0x4D5;
        int v6 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v5 = 0x4CF;
        }
        grxw grxw0 = this.f;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v7 = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v8 = grxw0.memoizedHashCode;
            if(v8 == 0) {
                v8 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v8;
            }
            v7 = v8;
        }
        grxw grxw1 = this.g;
        if(((ProtoLiteMessage)grxw1).isImmutable()) {
            return ((ProtoLiteMessage)grxw1).s() ^ (((v4 * 1000003 ^ v6) * 1000003 ^ v5) * 1000003 ^ v7) * 1000003;
        }
        int v9 = grxw1.memoizedHashCode;
        if(v9 == 0) {
            v9 = ((ProtoLiteMessage)grxw1).s();
            grxw1.memoizedHashCode = v9;
        }
        return v9 ^ (((v4 * 1000003 ^ v6) * 1000003 ^ v5) * 1000003 ^ v7) * 1000003;
    }

    @Override
    public final String toString() {
        return "ExternalLaunchAction{getAlternative=" + this.a.toString() + ", getActiveUser=" + this.b.toString() + ", getCallingAndroidApp=" + this.c.toString() + ", isDeepLink=" + this.d + ", replacesCurrentFragment=" + this.e + ", getCurrentScreenKey=" + this.f.toString() + ", getTargetScreenKey=" + this.g.toString() + "}";
    }
}

