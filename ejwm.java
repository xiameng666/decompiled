import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

public final class ejwm extends ejvt {
    private static final gegh h;
    private final String i;
    private final TaskEntity j;
    private final UpdateRecurrenceOptions n;

    static {
        gegf gegf0 = (gegf)((ProtoLiteMessage)gegh.a).v_newBuilder();
        gegf0.a(2);
        gegf0.a(11);
        gegf0.a(12);
        gegf0.a(9);
        gegf0.a(1);
        ejwm.h = (gegh)((ProtoLiteBuilder)gegf0).N_build();
    }

    public ejwm(ejtq ejtq0, String s, String s1, String s2, TaskEntity taskEntity0, UpdateRecurrenceOptions updateRecurrenceOptions0, azug azug0) {
        super(ejtq0, s, s1, "UpdateRecurrence", azug0);
        this.i = s2;
        this.j = taskEntity0;
        this.n = updateRecurrenceOptions0;
    }

    @Override  // ejvt
    protected final int b() {
        return 13;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gegd.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gedj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gedj gedj0 = (gedj)hftp1.b_message;
        this.i.getClass();
        gedj0.b |= 1;
        gedj0.c = this.i;
        gedj gedj1 = (gedj)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        gedj1.getClass();
        ((gegd)hftv0).d = gedj1;
        ((gegd)hftv0).b |= 2;
        gegh gegh0 = ejwm.h;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gegd gegd0 = (gegd)hftp0.b_message;
        gegh0.getClass();
        gegd0.e = gegh0;
        gegd0.b |= 4;
        gefy gefy0 = ejxi.g(this.j);
        if(gefy0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gegd)hftp0.b_message).f = gefy0;
            ((gegd)hftp0.b_message).b |= 8;
        }
        gefq gefq0 = ejxi.f(this.n);
        if(gefq0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gegd)hftp0.b_message).g = gefq0;
            ((gegd)hftp0.b_message).b |= 16;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gegd gegd1 = (gegd)hftp0.b_message;
        gefz0.getClass();
        gegd1.c = gefz0;
        gegd1.b |= 1;
        arrayList0.add(this.c(6, ((MessageLite)(((gegd)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        ContentValues contentValues0 = new ContentValues();
        ejxh.b(contentValues0, "archived", this.j.f);
        contentValues0.put("archived_time_ms", this.j.e);
        contentValues0.put("assistance", this.j.r);
        contentValues0.put("extensions", this.j.p);
        contentValues0.put("title", this.j.c);
        boolean z = this.n.a == 1;
        long v = z ? ejxi.a(this.n) : 0L;
        String[] arr_s = {String.valueOf(this.d.a), this.i};
        String s = "account_id=? AND recurrence_id=?";
        if(this.n.b) {
            s = ejxf.a("account_id=? AND recurrence_id=?", "recurrence_exceptional=?");
            arr_s = ejxf.c(arr_s, new String[]{"0"});
        }
        if(z) {
            s = ejxf.a(s, "due_date_millis>=?");
            arr_s = ejxf.c(arr_s, new String[]{String.valueOf(v)});
            arrayList0.add(ContentProviderOperation.newAssertQuery(ejtz.a).withSelection(s + " AND recurrence_master=1", arr_s).withExpectedCount(1).build());
        }
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withValues(contentValues0).withSelection(s, arr_s).build());
    }
}

