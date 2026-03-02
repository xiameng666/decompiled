import java.util.HashSet;
import java.util.Set;

public final class eiyt implements eixl, ejbl {
    private final Set a;
    private boolean b;

    public eiyt() {
        this.a = new HashSet();
        this.b = false;
    }

    public final void a() {
        eixy.a();
        this.b = true;
        for(Object object0: this.a) {
            iccl.i(((aqla)object0).a);
        }
    }

    @Override  // ejbl
    public final void b(aqla aqla0) {
        eixy.a();
        if(this.b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
        this.a.add(aqla0);
    }
}

