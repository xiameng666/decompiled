import j..util.Objects;

final class caeu extends oko {
    public caeu(caeq caeq0) {
        Objects.requireNonNull(caeq0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `selected_accounts` (`id`,`account_name`) VALUES (nullif(?, 0),?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        caep caep0 = (caep)object0;
        owg0.f(1, caep0.a);
        owg0.h(2, caep0.b);
    }
}

