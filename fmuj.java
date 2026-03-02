import android.view.View;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;

final class fmuj implements fmoz {
    final fmus a;

    public fmuj(fmus fmus0) {
        Objects.requireNonNull(fmus0);
        this.a = fmus0;
        super();
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmus fmus0 = this.a;
        if(!fmus0.J) {
            gfsx gfsx0 = ((fmeo)object0).b;
            if(gfsx0.i()) {
                View view0 = fmus0.a;
                if(view0 != null) {
                    if(fmus0.K == null) {
                        fmus0.K = new fmyu(view0.getContext());
                        fmus0.L = new fmqq(fmus0.K.a, ((fmeo)object0));
                        fmus0.L.a();
                    }
                    else {
                        fmqq fmqq0 = fmus0.L;
                        if(fmqq0 != null) {
                            fmqq0.a = (fmeo)object0;
                            fmqq0.b.a(((fmeo)object0));
                        }
                    }
                    fmyu fmyu0 = fmus0.K;
                    String s = view0.getResources().getString(0x7F152A02, new Object[]{gfsx0.d()});  // string:sending_as_format "Sending as %1$s"
                    fmyu0.b.setText(s);
                    if(!fmus0.H && !((ConversationView)view0).j()) {
                        ((ConversationView)view0).k(fmus0.K);
                    }
                    glzd.f(fmus0.d.a(fmus0.e, 25), new fmub(this), flbk.a());
                }
            }
        }
    }
}

