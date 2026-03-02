import android.accounts.Account;

public final class aath {
    public final Account a;
    public final gryt b;

    public aath() {
        throw null;
    }

    public aath(Account account0, gryt gryt0) {
        if(account0 == null) {
            throw new NullPointerException("Null account");
        }
        this.a = account0;
        if(gryt0 == null) {
            throw new NullPointerException("Null securityHubPromptItem");
        }
        this.b = gryt0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aath) && this.a.equals(((aath)object0).a) && ((ProtoLiteMessage)this.b).equals(((aath)object0).b);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        gryt gryt0 = this.b;
        if(((ProtoLiteMessage)gryt0).isImmutable()) {
            return ((ProtoLiteMessage)gryt0).s() ^ v * 1000003;
        }
        int v1 = gryt0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gryt0).s();
            gryt0.memoizedHashCode = v1;
        }
        return v1 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "AccountSettingsIssueDetails{account=" + this.a.toString() + ", securityHubPromptItem=" + this.b.toString() + "}";
    }
}

