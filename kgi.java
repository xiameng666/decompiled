import android.view.DisplayCutout;
import android.view.WindowInsets;
import j..util.Objects;

class kgi extends kgh {
    public kgi(kgq kgq0, WindowInsets windowInsets0) {
        super(kgq0, windowInsets0);
    }

    public kgi(kgq kgq0, kgi kgi0) {
        super(kgq0, kgi0);
    }

    @Override  // kgg
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kgi) ? Objects.equals(this.a, ((kgi)object0).a) && Objects.equals(this.b, ((kgi)object0).b) && kgi.o(this.c, ((kgi)object0).c) : false;
    }

    @Override  // kgn
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kgn
    public kdp t() {
        DisplayCutout displayCutout0 = this.a.getDisplayCutout();
        return displayCutout0 == null ? null : new kdp(displayCutout0);
    }

    @Override  // kgn
    public kgq u() {
        return kgq.r(this.a.consumeDisplayCutout());
    }
}

