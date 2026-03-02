public final class zjo {
    public final grxw a;
    public final grxw b;
    public final fhrt c;
    public final int d;

    public zjo() {
        throw null;
    }

    public zjo(grxw grxw0, int v, grxw grxw1, fhrt fhrt0) {
        if(grxw0 == null) {
            throw new NullPointerException("Null resourceKey");
        }
        this.a = grxw0;
        this.d = v;
        if(grxw1 == null) {
            throw new NullPointerException("Null screenIdResourceKey");
        }
        this.b = grxw1;
        if(fhrt0 == null) {
            throw new NullPointerException("Null callingAndroidApp");
        }
        this.c = fhrt0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof zjo) && ((ProtoLiteMessage)this.a).equals(((zjo)object0).a) && this.d == ((zjo)object0).d && ((ProtoLiteMessage)this.b).equals(((zjo)object0).b) && this.c.equals(((zjo)object0).c);
    }

    @Override
    public final int hashCode() {
        int v;
        grxw grxw0 = this.a;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            v = ((ProtoLiteMessage)grxw0).s();
        }
        else {
            int v1 = grxw0.memoizedHashCode;
            if(v1 == 0) {
                v1 = ((ProtoLiteMessage)grxw0).s();
                grxw0.memoizedHashCode = v1;
            }
            v = v1;
        }
        int v2 = this.d;
        grxw grxw1 = this.b;
        if(((ProtoLiteMessage)grxw1).isImmutable()) {
            int v3 = ((ProtoLiteMessage)grxw1).s();
            return this.c.hashCode() ^ (((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v3) * 1000003;
        }
        int v4 = grxw1.memoizedHashCode;
        if(v4 == 0) {
            v4 = ((ProtoLiteMessage)grxw1).s();
            grxw1.memoizedHashCode = v4;
        }
        return this.c.hashCode() ^ (((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v4) * 1000003;
    }

    @Override
    public final String toString() {
        String s = this.a.toString();
        return this.d == 1 ? "PromptCardStateChangeAction{resourceKey=" + s + ", actionType=" + "DISMISS" + ", screenIdResourceKey=" + this.b.toString() + ", callingAndroidApp=" + this.c.toString() + "}" : "PromptCardStateChangeAction{resourceKey=" + s + ", actionType=" + "UNDO_DISMISS" + ", screenIdResourceKey=" + this.b.toString() + ", callingAndroidApp=" + this.c.toString() + "}";
    }
}

