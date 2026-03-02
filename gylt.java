import android.os.IBinder.DeathRecipient;
import android.os.IBinder;
import j..util.Objects;

public final class gylt implements IBinder.DeathRecipient {
    public final gyiq a;
    public final String b;
    public final gylu c;

    public gylt(gylu gylu0, String s, gyiq gyiq0) {
        Objects.requireNonNull(gylu0);
        this.c = gylu0;
        super();
        this.b = s;
        batl.s(gyiq0);
        this.a = gyiq0;
        IBinder iBinder0 = gyiq0.asBinder();
        if(iBinder0 != null) {
            iBinder0.linkToDeath(this, 0);
        }
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        this.c.a(this.b);
        IBinder iBinder0 = this.a.asBinder();
        if(iBinder0 != null) {
            iBinder0.unlinkToDeath(this, 0);
        }
    }
}

