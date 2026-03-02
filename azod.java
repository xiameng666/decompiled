import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class azod {
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final faik c;

    public azod(faik faik0) {
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.c = faik0;
    }

    public final boolean a(azlv azlv0) {
        if(this.a.get()) {
            return this.b.get();
        }
        this.b(azlv0);
        return this.b.get();
    }

    private final void b(azlv azlv0) {
        boolean z;
        try {
            z = ((azui)aznz.a(this.c.cp(), TimeUnit.SECONDS)).q();
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            this.a.set(false);
            azlv0.a();
            return;
        }
        this.b.set(z);
        this.a.set(true);
        azoa azoa0 = new azoa(this);
        this.c.ct(azoa0);
    }
}

