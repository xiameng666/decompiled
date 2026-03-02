import java.util.LinkedHashSet;
import java.util.Set;

public final class aavz {
    private final Set a;
    private boolean b;

    public aavz() {
        this.a = new LinkedHashSet();
    }

    public final void a(aavy aavy0) {
        synchronized(this) {
            Set set0 = this.a;
            if(!set0.contains(aavy0)) {
                set0.add(aavy0);
                if(this.b) {
                    aavy0.a();
                }
            }
        }
    }

    public final void b() {
        synchronized(this) {
            if(!this.b) {
                this.b = true;
                for(Object object0: ibpo.am(this.a)) {
                    ((aavy)object0).a();
                }
            }
        }
    }

    public final boolean c() {
        synchronized(this) {
        }
        return this.b;
    }
}

