import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;

final class fmul implements gmbg {
    final fmus a;

    public fmul(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        flbj.c("ConvPresenter", "error blocking conversation: " + this.a.b + ", error: " + throwable0.getMessage());
        View view0 = this.a.a;
        if(view0 != null) {
            ((ConversationView)view0).g();
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        View view0 = this.a.a;
        if(view0 != null) {
            ((ConversationView)view0).g();
        }
    }
}

