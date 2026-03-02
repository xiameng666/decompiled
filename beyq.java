import android.support.v7.widget.RecyclerView;
import com.google.android.gms.credential.manager.passwordimport.ImportResultFragment;

public final class beyq implements ibts {
    public final RecyclerView a;
    public final ibnn b;

    public beyq(RecyclerView recyclerView0, ibnn ibnn0) {
        this.a = recyclerView0;
        this.b = ibnn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s = ImportResultFragment.z(this.b).b();
        RecyclerView recyclerView0 = this.a;
        if((((bfaa)object0) instanceof bezx)) {
            ibuq.c(recyclerView0);
            bgnw bgnw0 = new bgnw(0x7F0E086B, new beyn(s, ((bezx)(((bfaa)object0)))));  // layout:pwm_import_status
            recyclerView0.an(new qq(new tk[]{ImportResultFragment.A(s), bgnw0}));
            return ibom.a;
        }
        if((((bfaa)object0) instanceof bezz)) {
            ibuq.c(recyclerView0);
            bgnw bgnw1 = new bgnw(0x7F0E086B, new beyi(s, ((bezz)(((bfaa)object0)))));  // layout:pwm_import_status
            bgnw bgnw2 = new bgnw(0x7F0E0861, new beyj());  // layout:pwm_import_password_list_header
            bgnw bgnw3 = hsam.f() ? new bgnw(0x7F0E0869) : new bgnw(0x7F0E086A);  // layout:pwm_import_section_separator
            bgnw bgnw4 = new bgnw(0x7F0E0861, new beyk());  // layout:pwm_import_password_list_header
            recyclerView0.an(new qq(new tk[]{ImportResultFragment.A(s), bgnw1, bgnw2, new bfau(((bezz)(((bfaa)object0))).b), bgnw3, bgnw4, new bfau(((bezz)(((bfaa)object0))).a)}));
            return ibom.a;
        }
        if(!(((bfaa)object0) instanceof bezy)) {
            throw new ibnq();
        }
        ibuq.c(recyclerView0);
        bgnw bgnw5 = new bgnw(0x7F0E086B, new beym(s, ((bezy)(((bfaa)object0)))));  // layout:pwm_import_status
        recyclerView0.an(new qq(new tk[]{ImportResultFragment.A(s), bgnw5}));
        return ibom.a;
    }
}

