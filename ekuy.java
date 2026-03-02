import android.util.Log;
import java.util.List;
import java.util.Map;

final class ekuy implements evpz {
    private final ekvm a;
    private final eksl b;
    private final btar c;

    public ekuy(ekvm ekvm0, eksl eksl0, btar btar0) {
        this.a = ekvm0;
        this.b = eksl0;
        this.c = btar0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v = (int)(((Integer)evql0.j()));
        if(v == 1) {
            long v1 = this.b.d();
            this.a.p.l(this.c, this.b.a, v1);
            return;
        }
        ekvm ekvm0 = this.a;
        eksl eksl0 = this.b;
        eksc eksc0 = eksl0.a;
        ekvm0.p.k(eksc0, 4);
        btak btak0 = ekvm0.c();
        ekvm0.p.p(btak0, eksl0, ekum.l(v));
        List list0 = ekvm0.a;
        synchronized(list0) {
            Map map0 = (Map)ekvm0.c.get(eksl0.a());
            if(map0 == null || map0.remove(eksc0) == null) {
                Log.w("NetworkScheduler", a.ab(eksl0, "No record of active task "));
            }
            if(ekte.c(v)) {
                eksc eksc1 = ekvm0.e.b(eksc0);
                eksc1.m = 2;
                list0.add(eksc1);
            }
            else {
                ekvm0.k(eksc0);
            }
        }
    }
}

