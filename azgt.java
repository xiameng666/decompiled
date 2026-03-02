import android.content.Context;
import android.content.Intent;
import j..time.Duration;

public abstract class azgt {
    public final Context a;
    private final gful_cronetEngineProvider b;

    public azgt(Context context0, gful_cronetEngineProvider gful0) {
        this.a = context0;
        this.b = gful0;
    }

    public abstract boolean a(boolean arg1, azdl arg2);

    final long b() {
        return (long)(((Long)this.b.mr()));
    }

    final boolean c() {
        if(hraz.a.e().F()) {
            Intent intent0 = azib.b(this.a);
            if(intent0 == null) {
                return false;
            }
            switch(intent0.getIntExtra("status", -1)) {
                case 2: {
                    return true;
                }
                case 5: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return azib.d(this.a);
    }

    final boolean d() {
        return azib.f(this.a);
    }

    static final long e() {
        return System.currentTimeMillis() + Duration.ofMinutes(hraz.a.e().k()).toMillis();
    }
}

