import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flud {
    public final String a;
    public final ConversationId b;
    public final ContactId c;
    public final int d;
    public final long e;
    public final long f;

    public flud() {
        throw null;
    }

    public flud(String s, ConversationId conversationId0, ContactId contactId0, int v, long v1, long v2) {
        this.a = s;
        this.b = conversationId0;
        this.c = contactId0;
        this.d = v;
        this.e = v1;
        this.f = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof flud) && this.a.equals(((flud)object0).a) && this.b.equals(((flud)object0).b) && this.c.equals(((flud)object0).c) && this.d == ((flud)object0).d && this.e == ((flud)object0).e && this.f == ((flud)object0).f;
    }

    @Override
    public final int hashCode() {
        return ((this.d ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003) * 1000003 ^ ((int)(this.e >>> 0x20 ^ this.e))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20));
    }

    @Override
    public final String toString() {
        return "TypingIndicator{typingIndicatorId=" + this.a + ", conversationId=" + this.b + ", sender=" + this.c + ", typingIndicatorStatus=" + this.d + ", refreshIntervalUSec=" + this.e + ", serverTimestampUSec=" + this.f + "}";
    }
}

