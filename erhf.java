import android.accounts.Account;

public final class erhf implements jqv {
    public final erhh a;
    public final Account b;
    public final String c;

    public erhf(erhh erhh0, Account account0, String s) {
        this.a = erhh0;
        this.b = account0;
        this.c = s;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        erhg erhg0 = new erhg(jqt0);
        this.a.a.x(this.b, new String[]{this.c}, erhg0);
        return "AccountManager.hasFeatures";
    }
}

