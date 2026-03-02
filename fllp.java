import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class fllp implements gfsi {
    public final ConversationId a;

    public fllp(ConversationId conversationId0) {
        this.a = conversationId0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return !((Cursor)object0).moveToFirst() ? gfqx.a : gfsx.m(flon.a(this.a, ((Cursor)object0)));
    }
}

