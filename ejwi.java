import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

public final class ejwi extends ejvt {
    private final TaskEntity h;

    public ejwi(ejtq ejtq0, String s, String s1, TaskEntity taskEntity0, azug azug0) {
        super(ejtq0, s, s1, "MakeTaskRecurring", azug0);
        this.h = taskEntity0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6008;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gefc.a).v_newBuilder();
        gefy gefy0 = ejxi.g(this.h);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gefy0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gefy0));
        gedm gedm0 = ((gefy)hftp1.b_message).c;
        if(gedm0 == null) {
            gedm0 = gedm.a;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefc gefc0 = (gefc)hftp0.b_message;
        gedm0.getClass();
        gefc0.d = gedm0;
        gefc0.b |= 2;
        gedk gedk0 = ((gefy)hftp1.b_message).t;
        if(gedk0 == null) {
            gedk0 = gedk.a;
        }
        gedj gedj0 = gedk0.d == null ? gedj.a : gedk0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefc gefc1 = (gefc)hftp0.b_message;
        gedj0.getClass();
        gefc1.e = gedj0;
        gefc1.b |= 4;
        gedk gedk1 = ((gefy)hftp1.b_message).t;
        if(gedk1 == null) {
            gedk1 = gedk.a;
        }
        gedi gedi0 = gedk1.c == null ? gedi.a : gedk1.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefc gefc2 = (gefc)hftp0.b_message;
        gedi0.getClass();
        gefc2.f = gedi0;
        gefc2.b |= 8;
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefc gefc3 = (gefc)hftp0.b_message;
        gefz0.getClass();
        gefc3.c = gefz0;
        gefc3.b |= 1;
        ejwi.w(hftp1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefc gefc4 = (gefc)hftp0.b_message;
        gefy gefy1 = (gefy)hftp1.N_build();
        gefy1.getClass();
        gefc4.g = gefy1;
        gefc4.b |= 16;
        arrayList0.add(this.c(7, ((MessageLite)(((gefc)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        String[] arr_s = this.t(this.h.a);
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0", arr_s).withExpectedCount(1).build());
        arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection("client_assigned_id=? AND account_id=? AND deleted=0 AND recurrence_id IS NOT NULL", arr_s).withExpectedCount(0).build());
        this.g(arrayList0, this.h.q.e());
        this.i(arrayList0, this.h.a);
        this.h(arrayList0, this.h);
    }
}

