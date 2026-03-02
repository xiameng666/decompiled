import android.os.IBinder.DeathRecipient;
import j..util.Objects;

final class fdrh implements IBinder.DeathRecipient {
    public final fdrq a;
    final fdri b;

    public fdrh(fdri fdri0, fdrq fdrq0) {
        Objects.requireNonNull(fdri0);
        this.b = fdri0;
        super();
        this.a = fdrq0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        fdrg fdrg0 = new fdrg(this);
        this.b.b(fdrg0);
    }
}

