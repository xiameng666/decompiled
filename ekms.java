import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreOptionsEntity;
import com.google.android.gms.romanesco.model.RestoreResultEntity;
import com.google.android.gms.romanesco.model.RestoreSourceEntity;
import java.util.ArrayList;
import java.util.List;

public final class ekms extends bxox {
    private final ejyv h;
    private final ejyn i;
    private final boolean j;
    private List k;
    private evql l;

    public ekms(ejyv ejyv0, ejyn ejyn0, boolean z) {
        this.h = ejyv0;
        this.i = ejyn0;
        this.k = new ArrayList();
        this.j = z;
    }

    public final void b(List list0) {
        this.k = list0;
        this.l = null;
    }

    @Override  // lqd
    protected final void c() {
        if(this.k != null && !this.k.isEmpty()) {
            if(this.l != null) {
                return;
            }
            ejyv ejyv0 = this.h;
            String s = ejyv0.g();
            String s1 = ejyv0.i();
            RestoreSourceEntity[] arr_restoreSourceEntity = new RestoreSourceEntity[this.k.size()];
            for(int v = 0; v < this.k.size(); ++v) {
                ejyy ejyy0 = (ejyy)this.k.get(v);
                ejyy0.h.addAll(ejyy0.i);
                arr_restoreSourceEntity[v] = new RestoreSourceEntity((this.j ? Long.toString(ejyy0.b.longValue()) : ejyy0.a), ejyy0.j, ejyy0.h);
            }
            RestoreOptionsEntity restoreOptionsEntity0 = new RestoreOptionsEntity(ejyv0.B(), true);
            if(this.j) {
                azzc azzc0 = new azzc();
                azzc0.c = new Feature[]{ejxq.a};
                azzc0.a = new ejxv(this.i, s, s1, restoreOptionsEntity0, arr_restoreSourceEntity);
                azzc0.d = 0x4FBB;
                azzd azzd0 = azzc0.a();
                this.l = this.i.jn(azzd0);
            }
            else {
                azzc azzc1 = new azzc();
                azzc1.c = new Feature[]{ejxq.c};
                azzc1.a = new ejxw(this.i, s, s1, restoreOptionsEntity0, arr_restoreSourceEntity);
                azzc1.d = 0x4FBC;
                azzd azzd1 = azzc1.a();
                this.l = this.i.jn(azzd1);
            }
            this.l.b(new ekmq(this));
            this.l.A(new ekmr(this));
            return;
        }
        this.ii(new RestoreResultEntity(0, 0, Status.f));
    }
}

