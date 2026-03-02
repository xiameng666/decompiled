import android.view.View.OnClickListener;
import android.view.View;

public final class bdej implements View.OnClickListener {
    public final bdeq a;
    public final belv b;

    public bdej(bdeq bdeq0, belv belv0) {
        this.a = bdeq0;
        this.b = belv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gged_interceptors gged0;
        belv belv0 = this.b;
        bedv bedv0 = (bedv)belv0.a().ij();
        if(bedv0 == null) {
            gged0 = ggna.a;
            ibuq.e(gged0, "of(...)");
        }
        else {
            gged0 = (gged_interceptors)bedv0.b;
            if(gged0 == null) {
                gged0 = ggna.a;
                ibuq.e(gged0, "of(...)");
            }
        }
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = gged0.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            gfsx gfsx0 = ((bedc)ggqk0.next()).b();
            if(gfsx0.i()) {
                ggdy0.i(gfsx0.d());
            }
        }
        gged_interceptors gged1 = ggdy0.h();
        ibuq.e(gged1, "build(...)");
        bgln.a(((xob)this.a.requireContext()), new bdek(gged1), new bdel(belv0, this.a), new bdem());
    }
}

