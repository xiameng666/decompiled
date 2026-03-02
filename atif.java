import javax.crypto.SecretKey;

public final class atif {
    public final aqlk a;
    public final SecretKey b;
    public final arax c;

    public atif() {
        throw null;
    }

    public atif(aqlk aqlk0, SecretKey secretKey0, arax arax0) {
        this.a = aqlk0;
        this.b = secretKey0;
        this.c = arax0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof atif) && this.a.equals(((atif)object0).a) && this.b.equals(((atif)object0).b) && ((ProtoLiteMessage)this.c).equals(((atif)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        arax arax0 = this.c;
        if(((ProtoLiteMessage)arax0).isImmutable()) {
            return ((ProtoLiteMessage)arax0).s() ^ v * 1000003;
        }
        int v1 = arax0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)arax0).s();
            arax0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "EncryptionParams{secondaryKey=" + this.a.toString() + ", tertiaryKey=" + this.b.toString() + ", wrappedTertiaryKey=" + this.c.toString() + "}";
    }
}

