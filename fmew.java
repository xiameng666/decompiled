import com.google.android.libraries.messaging.lighter.model.AutoValue_ConversationId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.OneOfId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fmew {
    private ContactId a;
    private ConversationId.OneOfId b;

    public final ConversationId a() {
        ContactId contactId0 = this.a;
        if(contactId0 != null) {
            ConversationId.OneOfId conversationId$OneOfId0 = this.b;
            if(conversationId$OneOfId0 != null) {
                return new AutoValue_ConversationId(contactId0, conversationId$OneOfId0);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" owner");
        }
        if(this.b == null) {
            stringBuilder0.append(" oneOfId");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(ContactId contactId0) {
        if(contactId0 == null) {
            throw new NullPointerException("Null owner");
        }
        this.a = contactId0;
    }

    public final void c(ConversationId.GroupId conversationId$GroupId0) {
        this.b = fmci.a(conversationId$GroupId0);
    }

    public final void d(ContactId contactId0) {
        this.b = fmci.b(contactId0);
    }
}

