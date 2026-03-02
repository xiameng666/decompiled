import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmtl implements gfsi {
    public final fmus a;
    public final fmaz b;

    public fmtl(fmus fmus0, fmaz fmaz0) {
        this.a = fmus0;
        this.b = fmaz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fmaz fmaz0 = this.b;
        fmus fmus0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            fmus0.i(fmaz0.k());
            return null;
        }
        String s = fmaz0.k();
        gfsx gfsx0 = gfsx.m(((ConversationView)fmus0.a).e);
        fmus0.M.a.c(s, gfsx0, ((ConversationView)fmus0.a).a);
        fmro.c(fmus0.a);
        return null;
    }
}

