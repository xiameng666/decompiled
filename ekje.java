import com.google.android.gms.common.Feature;
import com.google.android.gms.romanesco.model.RestoreSourceEntity;
import java.util.ArrayList;
import java.util.List;

final class ekje extends bxox {
    public List h;
    private final ejyv i;
    private final ejyn j;
    private evql k;

    public ekje(ejyv ejyv0, ejyn ejyn0) {
        this.i = ejyv0;
        this.j = ejyn0;
        this.h = new ArrayList();
        this.k = null;
    }

    @Override  // lqd
    protected final void c() {
        if(this.h.isEmpty()) {
            this.ii(Boolean.valueOf(false));
            return;
        }
        if(this.k == null) {
            String s = this.i.g();
            String s1 = this.i.i();
            RestoreSourceEntity[] arr_restoreSourceEntity = new RestoreSourceEntity[this.h.size()];
            for(int v = 0; v < this.h.size(); ++v) {
                ejyy ejyy0 = (ejyy)this.h.get(v);
                ejyy0.h.addAll(ejyy0.i);
                arr_restoreSourceEntity[v] = new RestoreSourceEntity(ejyy0.a, ejyy0.j, ejyy0.h);
            }
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{ejxq.c};
            azzc0.a = new ejxt(this.j, s, s1, arr_restoreSourceEntity);
            azzc0.d = 20406;
            azzd azzd0 = azzc0.a();
            evql evql0 = this.j.jn(azzd0);
            this.k = evql0;
            if(evql0 != null) {
                evql0.b(new ekjc(this));
                this.k.A(new ekjd(this));
            }
        }
    }
}

