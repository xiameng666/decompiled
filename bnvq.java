import android.accounts.Account;

public final class bnvq implements bnvm {
    private final Account a;
    private final gmch b;
    private final bnvs c;

    public bnvq(Account account0, gmch gmch0, bnvs bnvs0) {
        this.a = account0;
        this.b = gmch0;
        this.c = bnvs0;
    }

    @Override  // bnvm
    public final bnvk a(bnxi bnxi0) {
        return this.b(this.c(bnxi0), bnxi0);
    }

    @Override  // bnvm
    public final bnvk b(String s, bnxi bnxi0) {
        ajqo ajqo0 = new ajqo();
        ajqo0.a = bnvl.a(s) ? s.substring(1) : s;
        ajqp ajqp0 = ajqo0.a();
        return new bnvp(s, bnxi0, new azts(this.c.a, ajqp0), this.a, this.b);
    }

    @Override  // bnvm
    public final String c(bnxi bnxi0) {
        return bnxi0.ordinal() == 1 ? hsxv.a.y().aB() : hsxv.a.y().aC();
    }
}

