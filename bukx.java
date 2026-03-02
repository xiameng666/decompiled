import java.util.Locale;

public final class bukx {
    private final String a;
    private final Locale b;
    private final hiux c;

    public bukx(String s, Locale locale0, hiux hiux0) {
        ibuq.f(locale0, "locale");
        ibuq.f(hiux0, "request");
        super();
        this.a = s;
        this.b = locale0;
        this.c = hiux0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bukx)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bukx)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bukx)object0).b) ? ibuq.m(this.c, ((bukx)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        hiux hiux0 = this.c;
        if(((ProtoLiteMessage)hiux0).isImmutable()) {
            return v * 0x1F + ((ProtoLiteMessage)hiux0).s();
        }
        int v1 = hiux0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)hiux0).s();
            hiux0.memoizedHashCode = v1;
        }
        return v * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "CacheKey(accountName=" + this.a + ", locale=" + this.b + ", request=" + this.c + ")";
    }
}

