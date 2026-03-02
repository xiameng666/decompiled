import j..util.Objects;

final class erum extends oko {
    public erum(erun erun0) {
        Objects.requireNonNull(erun0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `spatula_settings` (`account_name`,`is_preference_enabled`) VALUES (?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        eruo eruo0 = (eruo)object0;
        owg0.h(1, eruo0.a);
        owg0.f(2, ((long)eruo0.b));
    }
}

