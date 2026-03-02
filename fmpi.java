import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;

abstract class fmpi extends fmpl {
    @Override  // fmpl
    public ConversationId.GroupId a() {
        throw new UnsupportedOperationException(this.b().toString());
    }

    @Override  // fmpl
    public ContactId c() {
        throw new UnsupportedOperationException(this.b().toString());
    }
}

