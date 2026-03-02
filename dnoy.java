import android.net.Uri;
import android.view.View;

public final class dnoy implements ibth {
    public final dnph a;
    public final Uri b;

    public dnoy(dnph dnph0, Uri uri0) {
        this.a = dnph0;
        this.b = uri0;
    }

    @Override  // ibth
    public final Object a() {
        anl anl0 = new ank().a();
        View view0 = this.a.a;
        if(view0 == null) {
            ibuq.j("rootView");
            view0 = null;
        }
        anl0.a(view0.getContext(), this.b);
        return ibom.a;
    }
}

