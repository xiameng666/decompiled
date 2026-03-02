import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;

final class fmph extends fmpi {
    private final ContactId a;

    public fmph(ContactId contactId0) {
        this.a = contactId0;
    }

    @Override  // fmpl
    public final ConversationId.IdType b() {
        return ConversationId.IdType.a;
    }

    @Override  // fmpi
    public final ContactId c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof fmpl)) {
            ConversationId.IdType conversationId$IdType0 = ((fmpl)object0).b();
            if(ConversationId.IdType.a == conversationId$IdType0) {
                ContactId contactId0 = ((fmpl)object0).c();
                return this.a.equals(contactId0);
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
        return "BlockId{oneToOne=" + this.a + "}";
    }
}

