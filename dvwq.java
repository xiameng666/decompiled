import android.util.Pair;
import android.view.View.OnClickListener;
import android.view.View;

public final class dvwq implements View.OnClickListener {
    public final dvxj a;

    public dvwq(dvxj dvxj0) {
        this.a = dvxj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gfsx gfsx0;
        int v = this.a.aB.c;
        ggqk ggqk0 = ((gged_interceptors)this.a.aF.u()).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            Pair pair0 = (Pair)object0;
            if(((int)(((Integer)pair0.first))) != v) {
                continue;
            }
            gfsx0 = gfsx.m(((dvxx)pair0.second));
            goto label_9;
        }
        gfsx0 = gfqx.a;
    label_9:
        ((dvxx)gfsx0.d()).f();
    }
}

