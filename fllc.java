import android.content.ContentValues;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class fllc implements Callable {
    public final flmu a;
    public final fmev b;

    public fllc(flmu flmu0, fmev fmev0) {
        this.a = flmu0;
        this.b = fmev0;
    }

    @Override
    public final Object call() {
        fmev fmev0 = this.b;
        ConversationId conversationId0 = fmev0.a;
        ContactId contactId0 = conversationId0.a();
        flmu flmu0 = this.a;
        long v = flmu0.g(contactId0);
        gfsx gfsx0 = conversationId0.e() == ConversationId.IdType.a ? gfsx.m(Long.valueOf(flmu0.g(conversationId0.c()))) : gfqx.a;
        ContentValues contentValues0 = new ContentValues();
        fmeu fmeu0 = new fmeu(fmev0);
        flba.a();
        fmeu0.h(System.currentTimeMillis());
        fmev fmev1 = fmeu0.a();
        contentValues0.put("conversation_properties", floc.e(fmev1));
        contentValues0.put("conversation_app_data", floc.d(new HashMap(fmev1.i)));
        ConversationId conversationId1 = fmev1.a;
        contentValues0.put("conversation_type", Integer.valueOf(conversationId1.e().c));
        contentValues0.put("local_update_timestamp_ms", Long.valueOf(fmev1.o));
        if(conversationId1.e() == ConversationId.IdType.b) {
            contentValues0.put("conversation_group_id", conversationId1.d().b());
            contentValues0.put("conversation_group_app_name", conversationId1.d().a());
        }
        if(gfsx0.i()) {
            contentValues0.put("other_contact_row_id", ((Long)gfsx0.d()));
        }
        Long long0 = v;
        contentValues0.put("owner_row_id", long0);
        contentValues0.put("update_timestamp_us", Long.valueOf(0L));
        Uri uri0 = flmu0.l("conversations");
        long v1 = flmu0.e.c(uri0, contentValues0, 0);
        flmu.ao();
        flmu0.L();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(long0);
        if(gfsx0.i()) {
            arrayList0.add(gfsx0.d());
        }
        flmu0.A(conversationId1, v1, arrayList0);
        return v1;
    }
}

