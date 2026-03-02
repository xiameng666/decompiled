import com.google.android.gms.auth.cryptauth.synckeys.SyncKeysChimeraService;

public final class ajks implements gfsi {
    public final ajfw a;
    public final erzz b;
    public final bnaj c;
    public final boolean d;

    public ajks(ajfw ajfw0, erzz erzz0, bnaj bnaj0, boolean z) {
        this.a = ajfw0;
        this.b = erzz0;
        this.c = bnaj0;
        this.d = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        SyncKeysChimeraService.a.g("Error while syncing.", ((Exception)object0), new Object[0]);
        this.a.f();
        this.b.a();
        this.c.E(5, 5, this.d);
        return (int)1;
    }
}

