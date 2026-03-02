import android.accounts.Account;

public final class dlti extends lsb implements dlsc, lom {
    public static final bboh a;
    public final frxn b;
    public final Account c;
    public final dlou d;

    static {
        dlti.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlti(Account account0, dlou dlou0) {
        this.b = new frxn();
        this.c = account0;
        this.d = dlou0;
    }

    @Override  // dlsc
    public final void a() {
        icbb.b(lsc.a(this), null, null, new dlth(this, null), 3);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

