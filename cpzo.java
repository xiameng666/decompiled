import android.accounts.Account;

public final class cpzo implements azst {
    public final glxv a;
    private final Account b;

    public cpzo() {
        throw null;
    }

    public cpzo(Account account0, glxv glxv0) {
        if(account0 == null) {
            throw new NullPointerException("Null account");
        }
        this.b = account0;
        if(glxv0 == null) {
            throw new NullPointerException("Null timeSource");
        }
        this.a = glxv0;
    }

    @Override  // azst
    public final Account a() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof cpzo) && this.b.equals(((cpzo)object0).b) && this.a.equals(((cpzo)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ (this.b.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.b.toString() + ", timeSource=TimeSource.system()}";
    }
}

