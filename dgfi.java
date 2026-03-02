import java.util.List;

public final class dgfi {
    public final List a;
    public final List b;

    public dgfi(List list0, List list1) {
        ibuq.f(list0, "cipherText");
        ibuq.f(list1, "salt");
        super();
        this.a = list0;
        this.b = list1;
        if(list1.size() == 2 && list0.size() == 14) {
            return;
        }
        throw new IllegalArgumentException("SALT and cipher text should be of required sizes. SALT size: 2, cipher text size: 14.");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfi)) {
            return false;
        }
        return ibuq.m(this.a, ((dgfi)object0).a) ? ibuq.m(this.b, ((dgfi)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "EncryptedMetadataKey(cipherText=" + this.a + ", salt=" + this.b + ")";
    }
}

