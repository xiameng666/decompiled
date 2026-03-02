import java.lang.ref.WeakReference;

final class eszp implements esek {
    private final WeakReference a;

    public eszp(eszq eszq0) {
        this.a = new WeakReference(eszq0);
    }

    @Override  // esek
    public final void af() {
        eszq eszq0 = (eszq)this.a.get();
        if(eszq0 != null) {
            eszq0.B();
        }
    }
}

