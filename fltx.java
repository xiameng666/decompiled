import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fltx {
    public final ConversationId a;
    public final fltq b;

    public fltx() {
        throw null;
    }

    public fltx(ConversationId conversationId0, fltq fltq0) {
        this.a = conversationId0;
        this.b = fltq0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltx) && this.a.equals(((fltx)object0).a) && this.b.equals(((fltx)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "SessionProfileUpdate{conversationId=" + this.a + ", profileInfo=" + this.b + "}";
    }
}

