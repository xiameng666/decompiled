import android.accounts.Account;
import android.content.Context;

public final class dmlx extends dmmb {
    public final Account a;
    public final fsyk b;

    public dmlx(Account account0, fsyk fsyk0) {
        ibuq.f(account0, "account");
        ibuq.f(fsyk0, "card");
        super();
        this.a = account0;
        this.b = fsyk0;
    }

    @Override  // dmmb
    public final Account a() {
        return this.a;
    }

    @Override  // dmmb
    public final dmlw b(Context context0) {
        gueq gueq0;
        gtkg gtkg0 = this.b.e == null ? gtkg.a : this.b.e;
        gumi gumi0 = gtkg0.i == null ? gumi.a : gtkg0.i;
        gues gues0 = gumi0.l == null ? gues.a : gumi0.l;
        ibuq.e(gues0, "getHomescreenInfo(...)");
        guer guer0 = gues0.d == null ? guer.a : gues0.d;
        ibuq.e(guer0, "getDescription(...)");
        dmly dmly0 = new dmly(this.b);
        if(fsce.a(context0)) {
            gueq0 = guer0.g;
            if(gueq0 == null) {
                gueq0 = gueq.a;
            }
        }
        else {
            gueq0 = guer0.f;
            if(gueq0 == null) {
                gueq0 = gueq.a;
            }
        }
        ibuq.c(gueq0);
        guep guep0 = gues0.c == null ? guep.a : gues0.c;
        guaf guaf0 = guep0.d == null ? guaf.a : guep0.d;
        guez guez0 = guaf0.h == null ? guez.a : guaf0.h;
        ibuq.e(guez0, "getCardArtImage(...)");
        String s = dspl.e((guer0.c == null ? gunw.a : guer0.c), dmly0);
        ibuq.e(s, "dereference(...)");
        String s1 = dspl.e((guer0.d == null ? gunw.a : guer0.d), dmly0);
        ibuq.e(s1, "dereference(...)");
        return new dmlv(this.a, this, guez0, s, s1, efky.e((gueq0.b == null ? hjie.a : gueq0.b)), efky.e((gueq0.c == null ? hjie.a : gueq0.c)));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dmlx)) {
            return false;
        }
        return ibuq.m(this.a, ((dmlx)object0).a) ? ibuq.m(this.b, ((dmlx)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        fsyk fsyk0 = this.b;
        if(((ProtoLiteMessage)fsyk0).isImmutable()) {
            return v + ((ProtoLiteMessage)fsyk0).s();
        }
        int v1 = fsyk0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)fsyk0).s();
            fsyk0.memoizedHashCode = v1;
        }
        return v + v1;
    }

    @Override
    public final String toString() {
        return "ClosedLoop(account=" + this.a + ", card=" + this.b + ")";
    }
}

