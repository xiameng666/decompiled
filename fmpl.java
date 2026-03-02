import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import java.io.Serializable;

public abstract class fmpl implements Serializable {
    public abstract ConversationId.GroupId a();

    public abstract ConversationId.IdType b();

    public abstract ContactId c();
}

