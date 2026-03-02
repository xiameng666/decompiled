import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.model.TaskIdEntity;
import java.util.ArrayList;

public final class ejwc extends ejvt {
    private final TaskIdEntity h;

    public ejwc(ejtq ejtq0, String s, String s1, TaskIdEntity taskIdEntity0, azug azug0) {
        super(ejtq0, s, s1, "DeleteReminder", azug0);
        batl.s(taskIdEntity0);
        this.h = taskIdEntity0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6003;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geej.a).v_newBuilder();
        TaskIdEntity taskIdEntity0 = this.h;
        if(taskIdEntity0 != null) {
            gedm gedm0 = ejxi.e(taskIdEntity0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geej geej0 = (geej)hftp0.b_message;
            gedm0.getClass();
            hfuo hfuo0 = geej0.d;
            if(!hfuo0.c()) {
                geej0.d = ProtoLiteMessage.E(hfuo0);
            }
            geej0.d.add(gedm0);
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geej geej1 = (geej)hftp0.b_message;
        gefz0.getClass();
        geej1.c = gefz0;
        geej1.b |= 1;
        arrayList0.add(this.c(3, ((MessageLite)(((geej)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        String[] arr_s = this.t(this.h);
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", arr_s).withExpectedCount(1).build());
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection(ejxf.a("client_assigned_id=? AND account_id=? AND deleted=0", "recurrence_master=1"), arr_s).withExpectedCount(0).build());
        this.i(arrayList0, this.h);
    }
}

