import android.content.ContentValues;
import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;

public final class flme implements Runnable {
    public final flmu a;
    public final boolean b;
    public final fmpl c;

    public flme(flmu flmu0, boolean z, fmpl fmpl0) {
        this.a = flmu0;
        this.b = z;
        this.c = fmpl0;
    }

    @Override
    public final void run() {
        fmpl fmpl0 = this.c;
        flmu flmu0 = this.a;
        if(this.b) {
            flnc flnc0 = flmu0.e;
            Uri uri0 = flmu0.l("blocks");
            ContentValues contentValues0 = new ContentValues();
            if(fmpl0.b() == ConversationId.IdType.a) {
                ContactId.ContactType contactId$ContactType0 = fmpl0.c().b();
                flnx flnx0 = (flnx)flny.a.kt(contactId$ContactType0);
                contentValues0.put("lighter_id_id", fmpl0.c().d());
                contentValues0.put("lighter_id_normalized_id", (flnx0 == flnx.c ? flbd.a(fmpl0.c().d()) : fmpl0.c().d()));
                contentValues0.put("lighter_id_type", Integer.valueOf(flnx0.g));
                contentValues0.put("lighter_handler_id", ((String)fmpl0.c().c().f("")));
                contentValues0.put("lighter_id_app_name", fmpl0.c().e());
            }
            else {
                contentValues0.put("lighter_id_type", Integer.toString(flnx.e.g));
                contentValues0.put("lighter_id_id", fmpl0.a().b());
                contentValues0.put("lighter_id_normalized_id", fmpl0.a().b());
                contentValues0.put("lighter_id_app_name", fmpl0.a().a());
                contentValues0.put("lighter_handler_id", "");
            }
            if(flnc0.c(uri0, contentValues0, 5) > 0L) {
                goto label_25;
            }
        }
        else {
            Pair pair0 = flmu.aq(fmpl0);
            Uri uri1 = flmu0.l("blocks");
            if(flmu0.e.a(uri1, ((String)pair0.first), ((String[])pair0.second)) > 0) {
            label_25:
                ArrayList arrayList0 = new ArrayList();
                gged_interceptors gged0 = flmu0.a.c().g();
                int v = ((ggna)gged0).c;
                for(int v1 = 0; v1 < v; ++v1) {
                    ContactId contactId0 = (ContactId)gged0.get(v1);
                    fmew fmew0 = new fmew();
                    fmew0.b(contactId0);
                    if(fmpl0.b() == ConversationId.IdType.a) {
                        fmew0.d(fmpl0.c());
                    }
                    else {
                        fmew0.c(fmpl0.a());
                    }
                    ConversationId conversationId0 = fmew0.a();
                    if(flmu0.d(conversationId0) != -1L) {
                        arrayList0.add(conversationId0);
                    }
                }
                for(Object object0: arrayList0) {
                    flmu0.Z(((ConversationId)object0));
                    flbj.a("SQLiteMessagingStore", "Sending block status updated event");
                    flbj.f("SQLiteMessagingStore", "Block status updated event is not sent due to absent datastore events receiver");
                }
                flqe.a().b(flqb.a(flmu0.b, fmpl0));
            }
        }
    }
}

