import android.accounts.Account;

public final class aiwp {
    public final Account a;
    public final long b;
    public final int c;

    public aiwp() {
        throw null;
    }

    public aiwp(int v, Account account0, long v1) {
        this.c = v;
        this.a = account0;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aiwp)) {
            int v = this.c;
            int v1 = ((aiwp)object0).c;
            if(v == 0) {
                throw null;
            }
            if(v == v1) {
                Account account0 = this.a;
                if(account0 == null) {
                    return ((aiwp)object0).a == null ? this.b == ((aiwp)object0).b : false;
                }
                return account0.equals(((aiwp)object0).a) ? this.b == ((aiwp)object0).b : false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.c;
        if(v != 0) {
            return this.a == null ? ((int)(this.b ^ this.b >>> 0x20)) ^ (v ^ 1000003) * 1000003 * 1000003 : ((int)(this.b ^ this.b >>> 0x20)) ^ ((v ^ 1000003) * 1000003 ^ this.a.hashCode()) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        switch(this.c) {
            case 1: {
                return "SynchronizerPullBlockstoreDataRequest{pullMode=UNKNOWN, account=" + this.a + ", androidId=" + this.b + "}";
            }
            case 2: {
                return "SynchronizerPullBlockstoreDataRequest{pullMode=SINGLE_DEVICE, account=" + this.a + ", androidId=" + this.b + "}";
            }
            default: {
                return "SynchronizerPullBlockstoreDataRequest{pullMode=null, account=" + this.a + ", androidId=" + this.b + "}";
            }
        }
    }
}

