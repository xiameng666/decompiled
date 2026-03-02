import java.util.HashMap;

public final class fdwp {
    public final boolean a;
    final HashMap b;

    public fdwp() {
        this(false);
    }

    public fdwp(boolean z) {
        this.b = new HashMap();
        this.a = z;
    }

    public final fdwo a(Object object0) {
        fdwo fdwo0;
        synchronized(this) {
            HashMap hashMap0 = this.b;
            fdwo0 = (fdwo)hashMap0.get(object0);
            if(fdwo0 == null) {
                fdwo0 = new fdwo(this, object0);
                hashMap0.put(object0, fdwo0);
            }
            ++fdwo0.c;
        }
        fdwo0.b.lock();
        return fdwo0;
    }
}

