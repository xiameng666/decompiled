import android.widget.ImageView;

public final class dxta {
    public final gfsx a;
    public final gfsx b;
    public final int c;
    public final gfsx d;

    public dxta() {
        throw null;
    }

    public dxta(gfsx gfsx0, gfsx gfsx1, int v, gfsx gfsx2) {
        this.a = gfsx0;
        this.b = gfsx1;
        this.c = v;
        this.d = gfsx2;
    }

    public static dxsz a() {
        dxsz dxsz0 = new dxsz(null);
        dxsz0.b(0);
        return dxsz0;
    }

    public final void b(ImageView imageView0) {
        int v = this.c;
        if(v <= 0) {
            gfsx gfsx0 = this.d;
            if(!gfsx0.i()) {
                throw new IllegalStateException("One of drawableLogoRes or requestCreator must be set to load an instrument logo");
            }
            ((txx)gfsx0.d()).k(imageView0);
            return;
        }
        imageView0.setImageResource(v);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof dxta) && this.a.equals(((dxta)object0).a) && this.b.equals(((dxta)object0).b) && this.c == ((dxta)object0).c && this.d.equals(((dxta)object0).d);
    }

    @Override
    public final int hashCode() {
        return (this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003) * 1000003 ^ this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "InstrumentOption{instrument=" + this.a + ", newInstrument=" + this.b + ", drawableLogoRes=" + this.c + ", requestBuilder=" + this.d + "}";
    }
}

