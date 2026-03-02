import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;

public final class flob {
    public static gfsx a(HashMap hashMap0) {
        try {
            fmep fmep0 = new fmep(null);
            fmep0.c(((String)hashMap0.get("ID")));
            fmep0.d(((String)hashMap0.get("TACHYON_APP_NAME")));
            fmep0.e(ContactId.ContactType.a(((Integer)hashMap0.get("TYPE")).intValue()));
            fmep0.b(((String)hashMap0.get("HANDLER_ID")));
            return gfsx.m(fmep0.a());
        }
        catch(Exception unused_ex) {
            flbj.c("ContactIdConverters", "failed to convert HashMap to ContactId");
            return gfqx.a;
        }
    }

    public static HashMap b(ContactId contactId0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("ID", contactId0.d());
        hashMap0.put("TACHYON_APP_NAME", contactId0.e());
        hashMap0.put("TYPE", Integer.valueOf(contactId0.b().f));
        gfsx gfsx0 = contactId0.c();
        if(gfsx0.i()) {
            hashMap0.put("HANDLER_ID", gfsx0.d());
        }
        return hashMap0;
    }
}

