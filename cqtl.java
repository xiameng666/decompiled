import j..util.Objects;
import java.util.TimerTask;

final class cqtl extends TimerTask {
    final cqtn a;

    public cqtl(cqtn cqtn0) {
        Objects.requireNonNull(cqtn0);
        this.a = cqtn0;
        super();
    }

    @Override
    public final void run() {
        cqtn cqtn0 = this.a;
        synchronized(cqtn0.i) {
            if(cqtn0.p == null) {
                return;
            }
            if(!cqtn0.q && cqtn0.r) {
                ((ggtj)cqtn.a.a.i()).B("Haven\'t received multicast response in the last %d ms.", cqtn0.d.mr());
                cqtn0.s.set(true);
                cqud cqud0 = new cqud(cqtn0.j);
                cqtn0.j.a.execute(cqud0);
            }
            cqtn0.p = null;
        }
    }
}

