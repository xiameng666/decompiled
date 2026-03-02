import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;

public final class flod {
    public static gfsx a(HashMap hashMap0) {
        try {
            fmew fmew0 = new fmew();
            gfsx gfsx0 = flob.a(((HashMap)hashMap0.get("OWNER")));
            if(!gfsx0.i()) {
                return gfqx.a;
            }
            fmew0.b(((ContactId)gfsx0.d()));
            switch(ConversationId.IdType.a(((Integer)hashMap0.get("TYPE")).intValue()).ordinal()) {
                case 0: {
                    gfsx gfsx1 = flob.a(((HashMap)hashMap0.get("OTHER_PARTICIPANT")));
                    if(!gfsx1.i()) {
                        return gfqx.a;
                    }
                    fmew0.d(((ContactId)gfsx1.d()));
                    break;
                }
                case 1: {
                    gfsx gfsx2 = flog.a(((HashMap)hashMap0.get("GROUP")));
                    if(!gfsx2.i()) {
                        return gfqx.a;
                    }
                    fmew0.c(((ConversationId.GroupId)gfsx2.d()));
                }
            }
            return gfsx.m(fmew0.a());
        }
        catch(Exception unused_ex) {
            flbj.c("ConversationIdConverters", "failed to convert HashMap to ConversationId");
            return gfqx.a;
        }
    }

    public static HashMap b(ConversationId conversationId0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("OWNER", flob.b(conversationId0.a()));
        hashMap0.put("TYPE", Integer.valueOf(conversationId0.e().c));
        switch(conversationId0.e().ordinal()) {
            case 0: {
                hashMap0.put("OTHER_PARTICIPANT", flob.b(conversationId0.c()));
                return hashMap0;
            }
            case 1: {
                hashMap0.put("GROUP", flog.b(conversationId0.d()));
                return hashMap0;
            }
            default: {
                return hashMap0;
            }
        }
    }
}

