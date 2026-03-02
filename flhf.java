import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class flhf implements fmoz {
    public final flit a;
    public final AccountContext b;
    public final ContactId c;
    public final fltq d;

    public flhf(flit flit0, AccountContext accountContext0, ContactId contactId0, fltq fltq0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = contactId0;
        this.d = fltq0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        boolean z = ((gfsx)object0).i();
        ContactId contactId0 = this.c;
        if(!z) {
            flbj.c("LiMsgController", "Profile changes received for non-existent contactId: " + contactId0);
            return;
        }
        fltq fltq0 = this.d;
        fmeo fmeo0 = (fmeo)((gfsx)object0).d();
        gfsx gfsx0 = fltq0.k;
        if(gfsx0.i()) {
            long v = (long)(((Long)gfsx0.d()));
            if(fmeo0.l > v) {
                flbj.c("LiMsgController", "Profile changes received that were older than current contact.");
                return;
            }
        }
        flbj.a("LiMsgController", a.Q(contactId0, fltq0, "Profile changes: ", " for contact: "));
        flgg flgg0 = new flgg(this.a, this.b, fmeo0, fltq0);
        this.a.b.d(flgg0);
    }
}

