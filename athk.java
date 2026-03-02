import javax.crypto.SecretKey;

public final class athk {
    public final SecretKey a;
    public final arax b;
    public final boolean c;
    private final String d;

    public athk() {
        throw null;
    }

    public athk(String s, SecretKey secretKey0, arax arax0, boolean z) {
        if(s == null) {
            throw new NullPointerException("Null packageName");
        }
        this.d = s;
        if(secretKey0 == null) {
            throw new NullPointerException("Null secretKey");
        }
        this.a = secretKey0;
        if(arax0 == null) {
            throw new NullPointerException("Null wrappedKey");
        }
        this.b = arax0;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof athk) && this.d.equals(((athk)object0).d) && this.a.equals(((athk)object0).a) && ((ProtoLiteMessage)this.b).equals(((athk)object0).b) && this.c == ((athk)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = (this.d.hashCode() ^ 1000003) * 1000003 ^ this.a.hashCode();
        arax arax0 = this.b;
        if(((ProtoLiteMessage)arax0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)arax0).s();
            return this.c ? 0x4CF ^ (v * 1000003 ^ v1) * 1000003 : 0x4D5 ^ (v * 1000003 ^ v1) * 1000003;
        }
        int v2 = arax0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)arax0).s();
            arax0.memoizedHashCode = v2;
        }
        return this.c ? 0x4CF ^ (v * 1000003 ^ v2) * 1000003 : 0x4D5 ^ (v * 1000003 ^ v2) * 1000003;
    }

    @Override
    public final String toString() {
        return "TertiaryKey{packageName=" + this.d + ", secretKey=" + this.a.toString() + ", wrappedKey=" + this.b.toString() + ", wasKeyRotated=" + this.c + "}";
    }
}

