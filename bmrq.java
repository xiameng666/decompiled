import com.google.android.gms.common.api.Status;
import java.util.List;

public final class bmrq implements Runnable {
    public final bmrs a;
    public final acp b;

    public bmrq(bmrs bmrs0, acp acp0) {
        this.a = bmrs0;
        this.b = acp0;
    }

    @Override
    public final void run() {
        bmrs bmrs0 = this.a;
        bmrs0.b.l(blhf.i);
        List list0 = (List)bmrs0.b.e.ij();
        if(bbnh.k(list0)) {
            bmrs0.b.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
            return;
        }
        bmrs0.b.m(((foec)list0.get(0)).a, gfsx.m(this.b), bmrs.a);
    }
}

