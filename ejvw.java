import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

public final class ejvw extends ejvt {
    private final String h;
    private final TaskEntity i;
    private final UpdateRecurrenceOptions j;

    public ejvw(ejtq ejtq0, String s, String s1, String s2, TaskEntity taskEntity0, UpdateRecurrenceOptions updateRecurrenceOptions0, azug azug0) {
        super(ejtq0, s, s1, "ChangeRecurrence", azug0);
        this.h = s2;
        this.i = taskEntity0;
        this.j = updateRecurrenceOptions0;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gedw.a).v_newBuilder();
        gedj gedj0 = ejxi.d(this.h);
        if(gedj0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gedw)hftp0.b_message).d = gedj0;
            ((gedw)hftp0.b_message).b |= 2;
        }
        TaskEntity taskEntity0 = this.i;
        gedj gedj1 = ejxi.d(taskEntity0.q.e());
        if(gedj1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gedw)hftp0.b_message).e = gedj1;
            ((gedw)hftp0.b_message).b |= 4;
        }
        gefy gefy0 = ejxi.g(taskEntity0);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gefy0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gefy0));
        gedk gedk0 = ((gefy)hftp1.b_message).t;
        if(gedk0 == null) {
            gedk0 = gedk.a;
        }
        gedi gedi0 = gedk0.c == null ? gedi.a : gedk0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gedw gedw0 = (gedw)hftp0.b_message;
        gedi0.getClass();
        gedw0.f = gedi0;
        gedw0.b |= 8;
        ejvw.w(hftp1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gedw gedw1 = (gedw)hftp0.b_message;
        gefy gefy1 = (gefy)hftp1.N_build();
        gefy1.getClass();
        gedw1.g = gefy1;
        gedw1.b |= 16;
        gefq gefq0 = ejxi.f(this.j);
        if(gefq0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gedw)hftp0.b_message).h = gefq0;
            ((gedw)hftp0.b_message).b |= 0x20;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gedw gedw2 = (gedw)hftp0.b_message;
        gefz0.getClass();
        gedw2.c = gefz0;
        gedw2.b |= 1;
        arrayList0.add(this.c(9, ((MessageLite)(((gedw)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withValue("deleted", Integer.valueOf(1)).withSelection(ejvw.v(this.j), this.u(this.h, this.j)).build());
        this.l(arrayList0, this.h, this.j);
        this.h(arrayList0, this.i);
    }
}

