import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;

final class fmum implements fmqu {
    final fmus a;

    public fmum(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // fmqu
    public final void a(boolean z) {
        fmus fmus0 = this.a;
        fmuw fmuw0 = fmus0.f;
        fmuw0.c(107);
        if(z) {
            fmuw0.c(0x86);
        }
        fmus0.I = z;
        ((ConversationView)fmus0.a).a();
        gmbu.t((z ? fmus0.aj.e(fmus0.e, fmus0.b) : fmus0.aj.d(fmus0.e, fmus0.b)), new fmul(fmus0), flbk.a());
    }

    @Override  // fmqu
    public final void b() {
    }
}

