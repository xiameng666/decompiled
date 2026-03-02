import android.view.ViewGroup;
import java.util.Objects;

public final class cv implements ibth {
    public final cx a;
    public final ViewGroup b;
    public final Object c;
    public final ibvd d;

    public cv(cx cx0, ViewGroup viewGroup0, Object object0, ibvd ibvd0) {
        this.a = cx0;
        this.b = viewGroup0;
        this.c = object0;
        this.d = ibvd0;
    }

    @Override  // ibth
    public final Object a() {
        fm.ar(2);
        cx cx0 = this.a;
        Object object0 = this.c;
        ViewGroup viewGroup0 = this.b;
        cx0.g = cx0.d.s(viewGroup0, object0);
        if(cx0.g == null) {
            fm.ar(2);
            cx0.h = true;
            return ibom.a;
        }
        this.d.a = new cm(cx0, object0, viewGroup0);
        if(fm.ar(2)) {
            Objects.toString(cx0.b);
            Objects.toString(cx0.c);
        }
        return ibom.a;
    }
}

