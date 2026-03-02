import android.view.View.OnClickListener;
import android.view.View;

public final class bdfh implements View.OnClickListener {
    public final bdfk a;
    public final graz b;
    public final gqmd c;
    public final gfsx d;

    public bdfh(bdfk bdfk0, graz graz0, gqmd gqmd0, gfsx gfsx0) {
        this.a = bdfk0;
        this.b = graz0;
        this.c = gqmd0;
        this.d = gfsx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibuq.f(this.b, "issueType");
        ibuq.f(this.b, "issueType");
        bdfk bdfk0 = this.a;
        bejg bejg0 = bdfk0.b.a;
        switch(this.b.ordinal()) {
            case 0: {
                break;
            }
            case 1: {
                bejg0.b(gqsm.Ok);
                break;
            }
            case 2: {
                bejg0.b(gqsm.Ol);
                break;
            }
            case 3: {
                bejg0.b(gqsm.Om);
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        bdfm.a(this.c, ((xni)bdfk0.a), this.d);
    }
}

