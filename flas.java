import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;

public final class flas implements gfsi {
    public final Lighter a;

    public flas(Lighter lighter0) {
        this.a = lighter0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = "";
        flbo.b();
        Lighter lighter0 = this.a;
        flcx flcx0 = new flcx(lighter0.a);
        Context context0 = flcx0.a;
        new einq(context0).cz(flcu.a(context0), flcr.a(context0).b, new String[]{"LIGHTER_ANDROID"}, null).z(new flcv());
        for(Object object1: ((gged_interceptors)object0)) {
            AccountContext accountContext0 = (AccountContext)object1;
            ContactId.ContactType contactId$ContactType0 = ((.AutoValue_ContactId)accountContext0.c().f()).c;
            if(ContactId.ContactType.c.equals(contactId$ContactType0)) {
                s = ((.AutoValue_ContactId)accountContext0.c().f()).a;
                break;
            }
        }
        flbj.a("PhenotypeApiImplV12", "Retrieve experiment configurations");
        new flcw(flcx0, new einq(context0), flcu.a(context0)).h(s);
        lighter0.f.D(((gged_interceptors)object0));
        return null;
    }
}

