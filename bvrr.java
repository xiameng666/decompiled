import android.provider.Settings.Secure;
import java.util.concurrent.Callable;

public final class bvrr implements Callable {
    public final bvsd a;
    public final gqpw b;
    public final String c;

    public bvrr(bvsd bvsd0, gqpw gqpw0, String s) {
        this.a = bvsd0;
        this.b = gqpw0;
        this.c = s;
    }

    @Override
    public final Object call() {
        String s = Settings.Secure.getString(this.a.a.getContentResolver(), this.b.b);
        return this.b.c.contains(s) ? bvsc.c() : bvsc.a(this.c);
    }
}

