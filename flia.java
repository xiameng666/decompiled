import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.Callable;

public final class flia implements Callable {
    public final flit a;
    public final AccountContext b;
    public final fmev c;
    public final gmcd d;

    public flia(flit flit0, AccountContext accountContext0, fmev fmev0, gmcd gmcd0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmev0;
        this.d = gmcd0;
    }

    @Override
    public final Object call() {
        int v = (int)iaea.d();
        flit flit0 = this.a;
        int v1 = flit0.i.nextInt(v);
        long v2 = iaea.c();
        flkj flkj0 = (flkj)gmbu.r(this.d);
        long v3 = ((long)flit0.i.nextInt(v1)) + v2;
        int v4 = flkj0.b - 1;
        if(flkj0.b == 0) {
            throw null;
        }
        Object object0 = this.c;
        if(v4 != 1) {
            flbj.e("LiMsgController", "Conversation profile is not supported.");
            fmeu fmeu0 = new fmeu(((fmev)object0));
            flba.a();
            fmeu0.i(System.currentTimeMillis() + v3);
            return fmeu0.a();
        }
        gfsx gfsx0 = flkj0.a;
        if(!gfsx0.i()) {
            flbj.c("LiMsgController", "Got empty conversation profile.");
            return object0;
        }
        AccountContext accountContext0 = this.b;
        Object object1 = flit.c(((fmev)object0), ((fltq)gfsx0.d()), v3);
        flit0.d(accountContext0).al(((fmev)object1));
        if(!((fltq)gfsx0.d()).e.i()) {
            return object1;
        }
        gged_interceptors gged0 = ((fltn)((fltq)gfsx0.d()).e.d()).a;
        flit0.d(accountContext0).z(object1.a, gged0);
        return object1;
    }
}

