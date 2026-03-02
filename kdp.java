import android.view.DisplayCutout;
import j..util.Objects;

public final class kdp {
    public final DisplayCutout a;

    public kdp(DisplayCutout displayCutout0) {
        this.a = displayCutout0;
    }

    public final jxn a() {
        return jxn.f(this.a.getWaterfallInsets());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : Objects.equals(this.a, ((kdp)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

