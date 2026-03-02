import android.accounts.Account;

public final class dmlv extends dmlw {
    public final dmmb a;
    public final guez b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final boolean g;
    public boolean h;
    private final Account i;

    public dmlv(Account account0, dmmb dmmb0, guez guez0, String s, String s1, Integer integer0, Integer integer1) {
        this(account0, dmmb0, guez0, s, s1, integer0, integer1, true, true);
    }

    public dmlv(Account account0, dmmb dmmb0, guez guez0, String s, String s1, Integer integer0, Integer integer1, boolean z, boolean z1) {
        ibuq.f(account0, "account");
        ibuq.f(guez0, "cardArtImage");
        ibuq.f(s, "cardName");
        ibuq.f(s1, "cardBalance");
        super();
        this.i = account0;
        this.a = dmmb0;
        this.b = guez0;
        this.c = s;
        this.d = s1;
        this.e = integer0;
        this.f = integer1;
        this.g = z;
        this.h = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dmlv)) {
            return false;
        }
        if(!ibuq.m(this.i, ((dmlv)object0).i)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dmlv)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dmlv)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dmlv)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dmlv)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.e, ((dmlv)object0).e)) {
            return false;
        }
        if(!ibuq.m(this.f, ((dmlv)object0).f)) {
            return false;
        }
        return this.g == ((dmlv)object0).g ? this.h == ((dmlv)object0).h : false;
    }

    @Override
    public final int hashCode() {
        int v1;
        int v = this.i.hashCode() * 0x1F + this.a.hashCode();
        guez guez0 = this.b;
        if(((ProtoLiteMessage)guez0).isImmutable()) {
            v1 = ((ProtoLiteMessage)guez0).s();
        }
        else {
            int v2 = guez0.memoizedHashCode;
            if(v2 == 0) {
                v2 = ((ProtoLiteMessage)guez0).s();
                guez0.memoizedHashCode = v2;
            }
            v1 = v2;
        }
        int v3 = (((v * 0x1F + v1) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F;
        int v4 = 0;
        int v5 = this.e == null ? 0 : this.e.hashCode();
        Integer integer0 = this.f;
        if(integer0 != null) {
            v4 = integer0.hashCode();
        }
        return (((v3 + v5) * 0x1F + v4) * 0x1F + dmlu.a(this.g)) * 0x1F + dmlu.a(this.h);
    }

    @Override
    public final String toString() {
        return "CardItem(account=" + this.i + ", cardToHandle=" + this.a + ", cardArtImage=" + this.b + ", cardName=" + this.c + ", cardBalance=" + this.d + ", cardNameColor=" + this.e + ", cardBalanceColor=" + this.f + ", eligibleForBackup=" + this.g + ", selected=" + this.h + ")";
    }
}

