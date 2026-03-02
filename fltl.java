import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fltl {
    public final ConversationId a;
    public final long b;

    public fltl() {
        throw null;
    }

    public fltl(ConversationId conversationId0, long v) {
        this.a = conversationId0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltl) && this.a.equals(((fltl)object0).a) && this.b == ((fltl)object0).b;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "DeleteConversation{conversationId=" + this.a + ", deleteTimestampMicroSec=" + this.b + "}";
    }
}

