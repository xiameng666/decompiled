import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;

final class fmpg extends fmpi {
    private final ConversationId.GroupId a;

    public fmpg(ConversationId.GroupId conversationId$GroupId0) {
        this.a = conversationId$GroupId0;
    }

    @Override  // fmpi
    public final ConversationId.GroupId a() {
        return this.a;
    }

    @Override  // fmpl
    public final ConversationId.IdType b() {
        return ConversationId.IdType.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmpl)) {
            ConversationId.IdType conversationId$IdType0 = ((fmpl)object0).b();
            if(ConversationId.IdType.b == conversationId$IdType0) {
                ConversationId.GroupId conversationId$GroupId0 = ((fmpl)object0).a();
                return this.a.equals(conversationId$GroupId0);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "BlockId{group=" + this.a + "}";
    }
}

