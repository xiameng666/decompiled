import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;

public final class ejvv extends ejvt {
    private final TaskIdEntity h;

    public ejvv(ejtq ejtq0, String s, String s1, TaskIdEntity taskIdEntity0, azug azug0) {
        super(ejtq0, s, s1, "BumpReminder", azug0);
        this.h = taskIdEntity0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6010;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gedu.a).v_newBuilder();
        TaskIdEntity taskIdEntity0 = this.h;
        if(taskIdEntity0 != null) {
            gedm gedm0 = ejxi.e(taskIdEntity0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gedu gedu0 = (gedu)hftp0.b_message;
            gedm0.getClass();
            gedu0.d = gedm0;
            gedu0.b |= 2;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gedu gedu1 = (gedu)hftp0.b_message;
        gefz0.getClass();
        gedu1.c = gefz0;
        gedu1.b |= 1;
        arrayList0.add(this.c(0, ((MessageLite)(((gedu)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        String[] arr_s = this.t(this.h);
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", arr_s).withExpectedCount(1).build());
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.f).withValue("fired_time_millis", Integer.valueOf(0)).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", arr_s).build());
    }
}

