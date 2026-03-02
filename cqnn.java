import android.content.Context;
import android.widget.Toast;
import com.google.android.chimera.android.Activity;

public final class cqnn implements lqj {
    public final cqnv a;
    public final Activity b;

    public cqnn(cqnv cqnv0, Activity activity0) {
        this.a = cqnv0;
        this.b = activity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        cqny cqny0 = ((cqnx)object0).a;
        cqnv cqnv0 = this.a;
        Context context0 = cqnv0.requireContext();
        Activity activity0 = this.b;
        switch(cqny0.ordinal()) {
            case 1: {
                cqnv0.N(true);
                break;
            }
            case 2: {
                Toast.makeText(context0, (cqnv0.ai ? "Security question changed" : "Security question set"), 1).show();
                cqqn.c(cqrb.a(context0, hgzp.dK));
                cqnv0.ai = true;
                activity0.finish();
                break;
            }
            case 3: {
                cqnv0.N(false);
                gftb.check(((cqnx)object0).b);
                cqnv0.P(((cqnx)object0).b, false);
                cqqn.c(cqrb.a(context0, hgzp.dL));
                break;
            }
            case 4: {
                cqix.v.d(Boolean.valueOf(false));
                Toast.makeText(context0, "Security question deleted", 1).show();
                cqnv0.ai = false;
                cqqn.c(cqrb.a(context0, hgzp.dN));
                activity0.finish();
                break;
            }
            case 5: {
                cqnv0.N(false);
                gftb.check(((cqnx)object0).b);
                cqnv0.P(((cqnx)object0).b, true);
                cqqn.c(cqrb.a(context0, hgzp.dO));
            }
        }
        cqnz cqnz0 = cqnv0.ak;
        if(cqnz.a.contains(cqny0)) {
            cqnz0.b(cqny.a);
        }
    }
}

