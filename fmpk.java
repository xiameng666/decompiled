import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fmpk implements gfsi {
    public static final fmpl a(ConversationId conversationId0) {
        return conversationId0.e() == ConversationId.IdType.b ? fmpj.a(conversationId0.d()) : fmpj.b(conversationId0.c());
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return fmpk.a(((ConversationId)object0));
    }
}

