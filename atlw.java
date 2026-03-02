import j..util.Objects;

final class atlw extends oko {
    public atlw(atly atly0) {
        Objects.requireNonNull(atly0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR IGNORE INTO `PostD2dAppDataCleanupInfo` (`pkg`,`appState`,`firstOpenTimestamp`) VALUES (?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        owg0.h(1, ((atlo)object0).a);
        int v = ((atlo)object0).c;
        if(v == 0) {
            owg0.g(2);
        }
        else {
            owg0.h(2, atly.c(v));
        }
        Long long0 = ((atlo)object0).b;
        if(long0 == null) {
            owg0.g(3);
            return;
        }
        owg0.f(3, long0.longValue());
    }
}

