import java.lang.ref.WeakReference;

final class akvn implements geky {
    public final String a;
    public final Runnable b;
    public final alit c;
    private final WeakReference d;

    public akvn(akvp akvp0, String s, Runnable runnable0, alit alit0) {
        this.d = new WeakReference(akvp0);
        this.a = s;
        this.b = runnable0;
        this.c = alit0;
    }

    @Override  // geky
    public final void a(gele gele0) {
        akvp akvp0 = (akvp)this.d.get();
        if(akvp0 == null) {
            ((ggtj)akvp.a.j()).x("Channel was destroyed before socket write finished; cannot proceed.");
            return;
        }
        akvm akvm0 = new akvm(this, akvp0, gele0);
        akvp0.b.execute(akvm0);
    }
}

