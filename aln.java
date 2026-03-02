import java.lang.ref.WeakReference;

final class aln implements lom {
    private final WeakReference a;

    public aln(amj amj0) {
        this.a = new WeakReference(amj0);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        WeakReference weakReference0 = this.a;
        if(weakReference0.get() != null) {
            ((amj)weakReference0.get()).b = null;
        }
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

