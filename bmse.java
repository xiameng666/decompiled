import com.google.android.gms.common.api.Status;
import java.util.List;

public final class bmse implements Runnable {
    public final bmsp a;
    public final acp b;

    public bmse(bmsp bmsp0, acp acp0) {
        this.a = bmsp0;
        this.b = acp0;
    }

    @Override
    public final void run() {
        bmsp bmsp0 = this.a;
        List list0 = (List)bmsp0.b.e.ij();
        if(bbnh.k(list0)) {
            bmsp0.b.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
            return;
        }
        bmsp0.b.l(blhf.v);
        foec foec0 = (foec)list0.get(0);
        bmsp0.b.f(foec0, gfsx.m(this.b), bmsp.a);
    }
}

