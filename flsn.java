import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flsn {
    public final ConversationId a;
    public final fltn b;

    public flsn() {
        throw null;
    }

    public flsn(ConversationId conversationId0, fltn fltn0) {
        this.a = conversationId0;
        this.b = fltn0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof flsn) && this.a.equals(((flsn)object0).a) && this.b.equals(((flsn)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "AddKickGroupUsers{conversationId=" + this.a + ", groupInfoChanges=" + this.b + "}";
    }
}

