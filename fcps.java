import android.accounts.Account;

public final class fcps {
    public final Account a;
    public final String b;
    public final long c;
    public final aqej d;
    public final String e;

    public fcps() {
        throw null;
    }

    public fcps(Account account0, String s, long v, aqej aqej0, String s1) {
        this.a = account0;
        this.b = s;
        this.c = v;
        this.d = aqej0;
        this.e = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fcps) && this.a.equals(((fcps)object0).a) && this.b.equals(((fcps)object0).b) && this.c == ((fcps)object0).c && ((ProtoLiteMessage)this.d).equals(((fcps)object0).d) && this.e.equals(((fcps)object0).e);
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
        aqej aqej0 = this.d;
        if(((ProtoLiteMessage)aqej0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)aqej0).s();
            return this.e.hashCode() ^ ((v * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ v1) * 1000003;
        }
        int v2 = aqej0.memoizedHashCode;
        if(v2 == 0) {
            v2 = ((ProtoLiteMessage)aqej0).s();
            aqej0.memoizedHashCode = v2;
        }
        return this.e.hashCode() ^ ((v * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ v2) * 1000003;
    }

    @Override
    public final String toString() {
        return "RecoveryParams{account=" + this.a + ", secondaryKeyVersion=" + this.b + ", androidId=" + this.c + ", vault=" + this.d + ", companionNodeId=" + this.e + "}";
    }
}

