import dagger.android.AndroidInjector;

public final class ducf implements AndroidInjector {
    private final dlmk a;
    private final dolg b;

    public ducf(dlmk dlmk0, dolg dolg0) {
        this.a = dlmk0;
        this.b = dolg0;
    }

    final azts a() {
        return new azts(dlmm.a(this.a));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duie duie0 = (duie)object0;
        duie0.a = dpsx.a(dlmm.a(this.a), this.b.a());
        duie0.e = this.a();
        dlnj.a();
        duie0.b = new dtph(new dmgi(this.b.d(), dmgy.a()), edob.a(dlnj.a()), new dtpi());
        duie0.c = new dtzt(new duay(this.a()), this.b.d(), dmgv.e(dmgy.a()));
    }
}

