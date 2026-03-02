import j..util.Objects;

final class gbld extends oko {
    public gbld(gble gble0) {
        Objects.requireNonNull(gble0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `instantBuySessionTable` (`instantBuySessionId`,`state`,`lastUpdatedTimeMillis`) VALUES (?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        gblf gblf0 = (gblf)object0;
        owg0.h(1, gblf0.a);
        ibuq.f(gblf0.b, "proto");
        owg0.e(2, gblf0.b.toBytesArray());
        owg0.f(3, gblf0.c);
    }
}

