import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class ucm extends WeakReference {
    final uay a;
    final boolean b;
    ueb c;

    public ucm(uay uay0, udt udt0, ReferenceQueue referenceQueue0) {
        super(udt0, referenceQueue0);
        uqo.f(uay0);
        this.a = uay0;
        this.c = null;
        this.b = udt0.a;
    }

    final void a() {
        this.c = null;
        this.clear();
    }
}

