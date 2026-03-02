import android.accounts.Account;
import android.content.Context;

public final class dmma extends dmmb {
    public final Account a;
    public final dylc b;

    public dmma(Account account0, dylc dylc0) {
        ibuq.f(account0, "account");
        ibuq.f(dylc0, "cardData");
        super();
        this.a = account0;
        this.b = dylc0;
    }

    @Override  // dmmb
    public final Account a() {
        return this.a;
    }

    @Override  // dmmb
    public final dmlw b(Context context0) {
        dylc dylc0 = this.b;
        dyna dyna0 = dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c);
        Object object0 = dzdm.h.get(dyna0);
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Account account0 = this.a;
        guez guez0 = dmmc.a(((dzdm)object0).j);
        String s = context0.getString(((dzdm)object0).m);
        if(s == null) {
            s = "";
        }
        String s1 = dzdt.u((dylc0.e == null ? dymg.a : dylc0.e));
        ibuq.e(s1, "getDisplayableBalance(...)");
        return new dmlv(account0, this, guez0, s, s1, null, null);
    }

    public final boolean c() {
        return (dyna.b(this.b.c) == null ? dyna.k : dyna.b(this.b.c)) == dyna.i;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dmma)) {
            return false;
        }
        return ibuq.m(this.a, ((dmma)object0).a) ? ibuq.m(this.b, ((dmma)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        dylc dylc0 = this.b;
        if(((ProtoLiteMessage)dylc0).isImmutable()) {
            return v + ((ProtoLiteMessage)dylc0).s();
        }
        int v1 = dylc0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)dylc0).s();
            dylc0.memoizedHashCode = v1;
        }
        return v + v1;
    }

    @Override
    public final String toString() {
        return "SePrepaidCard(account=" + this.a + ", cardData=" + this.b + ")";
    }
}

