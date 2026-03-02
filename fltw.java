import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

public final class fltw {
    public final int a;
    public final String b;
    public final List c;
    public final ContactId d;
    public final ConversationId e;

    public fltw() {
        throw null;
    }

    public fltw(int v, String s, List list0, ContactId contactId0, ConversationId conversationId0) {
        this.a = v;
        this.b = s;
        this.c = list0;
        this.d = contactId0;
        this.e = conversationId0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fltw) && this.a == ((fltw)object0).a && this.b.equals(((fltw)object0).b) && this.c.equals(((fltw)object0).c) && this.d.equals(((fltw)object0).d) && this.e.equals(((fltw)object0).e);
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() ^ ((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Receipt{receiptType=" + this.a + ", receiptId=" + this.b + ", messageIds=" + this.c + ", recipient=" + this.d + ", conversationId=" + this.e + "}";
    }
}

