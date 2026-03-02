import android.content.ContentProviderOperation;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import java.util.ArrayList;

public final class ejwb extends ejvt {
    private final String h;
    private final UpdateRecurrenceOptions i;

    public ejwb(ejtq ejtq0, String s, String s1, String s2, UpdateRecurrenceOptions updateRecurrenceOptions0, azug azug0) {
        super(ejtq0, s, s1, "DeleteRecurrence", azug0);
        this.h = s2;
        this.i = updateRecurrenceOptions0;
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geeh.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gedj.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gedj gedj0 = (gedj)hftp1.b_message;
        this.h.getClass();
        gedj0.b |= 1;
        gedj0.c = this.h;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geeh geeh0 = (geeh)hftp0.b_message;
        gedj gedj1 = (gedj)hftp1.N_build();
        gedj1.getClass();
        geeh0.d = gedj1;
        geeh0.b |= 2;
        UpdateRecurrenceOptions updateRecurrenceOptions0 = this.i;
        if(updateRecurrenceOptions0 != null) {
            gefq gefq0 = ejxi.f(updateRecurrenceOptions0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geeh geeh1 = (geeh)hftp0.b_message;
            gefq0.getClass();
            geeh1.e = gefq0;
            geeh1.b |= 4;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geeh geeh2 = (geeh)hftp0.b_message;
        gefz0.getClass();
        geeh2.c = gefz0;
        geeh2.b |= 1;
        arrayList0.add(this.c(4, ((MessageLite)(((geeh)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        String s = ejwb.v(this.i);
        String[] arr_s = this.u(this.h, this.i);
        this.l(arrayList0, this.h, this.i);
        arrayList0.add(ContentProviderOperation.newUpdate(ejtz.a).withValue("deleted", Integer.valueOf(1)).withSelection(s, arr_s).build());
    }
}

