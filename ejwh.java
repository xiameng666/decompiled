import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

public final class ejwh extends ejvt {
    private final String h;
    private final TaskEntity i;
    private final UpdateRecurrenceOptions j;
    private String n;

    public ejwh(ejtq ejtq0, String s, String s1, String s2, TaskEntity taskEntity0, UpdateRecurrenceOptions updateRecurrenceOptions0, azug azug0) {
        super(ejtq0, s, s1, "MakeRecurrenceSingleInstance", azug0);
        this.h = s2;
        this.i = taskEntity0;
        this.j = updateRecurrenceOptions0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6009;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        gedm gedm0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gefa.a).v_newBuilder();
        gedj gedj0 = ejxi.d(this.h);
        if(gedj0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gefa)hftp0.b_message).d = gedj0;
            ((gefa)hftp0.b_message).b |= 2;
        }
        gefy gefy0 = ejxi.g(this.i);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gefy0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gefy0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gefy)hftp1.b_message).e = null;
        ((gefy)hftp1.b_message).b &= -5;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gefy)hftp1.b_message).t = null;
        ((gefy)hftp1.b_message).b &= 0xFFFBFFFF;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefa gefa0 = (gefa)hftp0.b_message;
        gefy gefy1 = (gefy)hftp1.N_build();
        gefy1.getClass();
        gefa0.f = gefy1;
        gefa0.b |= 8;
        gefy gefy2 = (gefy)hftp1.b_message;
        if((gefy2.b & 1) == 0) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gedm.a).v_newBuilder();
            String s = this.n;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gedm gedm1 = (gedm)hftp2.b_message;
            s.getClass();
            gedm1.b |= 2;
            gedm1.c = s;
            gedm0 = (gedm)hftp2.N_build();
        }
        else {
            gedm0 = gefy2.c;
            if(gedm0 == null) {
                gedm0 = gedm.a;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefa gefa1 = (gefa)hftp0.b_message;
        gedm0.getClass();
        gefa1.e = gedm0;
        gefa1.b |= 4;
        gefq gefq0 = ejxi.f(this.j);
        if(gefq0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gefa)hftp0.b_message).g = gefq0;
            ((gefa)hftp0.b_message).b |= 16;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gefa gefa2 = (gefa)hftp0.b_message;
        gefz0.getClass();
        gefa2.c = gefz0;
        gefa2.b |= 1;
        arrayList0.add(this.c(8, ((MessageLite)(((gefa)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withValue("deleted", Integer.valueOf(1)).withSelection(ejwh.v(this.j), this.u(this.h, this.j)).build());
        this.l(arrayList0, this.h, this.j);
        this.n = this.e(arrayList0, this.i);
    }
}

