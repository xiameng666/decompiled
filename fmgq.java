import com.google.android.libraries.messaging.lighter.model.AutoValue_Renotification;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Renotification;

public final class fmgq {
    private ConversationId a;
    private int b;
    private gged_interceptors c;
    private byte d;

    public fmgq() {
    }

    public fmgq(Renotification renotification0) {
        this.a = renotification0.b();
        this.b = renotification0.a();
        this.c = renotification0.d();
        this.d = 1;
    }

    public final Renotification a() {
        if(this.d == 1) {
            ConversationId conversationId0 = this.a;
            if(conversationId0 != null) {
                gged_interceptors gged0 = this.c;
                if(gged0 != null) {
                    return new AutoValue_Renotification(conversationId0, this.b, gged0);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" conversationId");
        }
        if(this.d == 0) {
            stringBuilder0.append(" renotificationState");
        }
        if(this.c == null) {
            stringBuilder0.append(" messageReceivedNotifications");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(ConversationId conversationId0) {
        if(conversationId0 == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationId0;
    }

    public final void c(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null messageReceivedNotifications");
        }
        this.c = gged0;
    }

    public final void d(int v) {
        this.b = v;
        this.d = 1;
    }
}

