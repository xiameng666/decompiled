import j..util.Objects;

final class atlx extends okn {
    public atlx(atly atly0) {
        Objects.requireNonNull(atly0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "UPDATE OR ABORT `PostD2dAppDataCleanupInfo` SET `pkg` = ?,`appState` = ?,`firstOpenTimestamp` = ? WHERE `pkg` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        String s = ((atlo)object0).a;
        owg0.h(1, s);
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
        }
        else {
            owg0.f(3, long0.longValue());
        }
        owg0.h(4, s);
    }
}

