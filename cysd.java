import android.os.IBinder.DeathRecipient;
import java.util.Locale;

public final class cysd implements IBinder.DeathRecipient {
    public final String a;
    public final cyhv b;
    private final kar c;

    public cysd(cyhv cyhv0, kar kar0, String s) {
        this.b = cyhv0;
        this.c = kar0;
        this.a = s;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        ((ggtj)cyjh.a.d().ar(8067)).B("ConnectionSwitchListener: client\'s binder died %s", this.b);
        this.b.a.unlinkToDeath(this, 0);
        this.c.accept(this.b);
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "IConnectionSwitchListener{listener: %s, binder: %s}", this.b, this.b.a);
    }
}

