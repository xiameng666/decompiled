import dagger.android.AndroidInjector;

final class doiv implements AndroidInjector {
    private final dolg a;
    private final domv b;
    private final domw c;

    public doiv(domv domv0, dolg dolg0, domw domw0) {
        this.a = dolg0;
        this.b = domv0;
        this.c = domw0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((doiy)object0).E = new dsor(this.a.a(), new dlnx(this.b.a(), new bblp(1, 10)), new hfid(null));
    }
}

