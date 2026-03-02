import android.view.Surface;

public final class brq implements kar {
    public final bsb a;
    public final bsv b;

    public brq(bsb bsb0, bsv bsv0) {
        this.a = bsb0;
        this.b = bsv0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        bdr bdr0 = (bdr)object0;
        this.b.close();
        bsb bsb0 = this.a;
        Surface surface0 = (Surface)bsb0.f.remove(this.b);
        if(surface0 != null) {
            bsb0.a.h(surface0);
        }
    }
}

