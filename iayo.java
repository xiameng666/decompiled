import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public abstract class iayo {
    public final Set a;

    public iayo() {
        this.a = Collections.newSetFromMap(new IdentityHashMap());
    }

    protected abstract void a();

    protected abstract void b();

    public final void c(Object object0, boolean z) {
        Set set0 = this.a;
        int v = set0.size();
        if(z) {
            set0.add(object0);
            if(v == 0) {
                this.a();
            }
        }
        else if(set0.remove(object0) && v == 1) {
            this.b();
        }
    }
}

