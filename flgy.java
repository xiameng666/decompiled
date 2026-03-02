import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

public final class flgy implements gfsi {
    public final flit a;
    public final AccountContext b;
    public final ConversationId c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final fmfz[] g;

    public flgy(flit flit0, AccountContext accountContext0, ConversationId conversationId0, Integer integer0, Integer integer1, Integer integer2, fmfz[] arr_fmfz) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = conversationId0;
        this.d = integer0;
        this.e = integer1;
        this.f = integer2;
        this.g = arr_fmfz;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)object0;
        Object object1 = this.a.d(this.b).as(this.c, (this.d == null ? this.e : this.d).intValue(), this.g);
        ((fmpa)object1).k(new flfw(this.a.t, this.b));
        return object1;
    }
}

