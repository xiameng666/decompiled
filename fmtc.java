import android.view.MenuItem;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;

public final class fmtc implements fmoz {
    public final fmus a;

    public fmtc(fmus fmus0) {
        this.a = fmus0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        fmus fmus0 = this.a;
        fmus0.n();
        fmus0.Q = ((fmeo)object0).h;
        gged_interceptors gged0 = fmus0.Q;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmfj fmfj0 = (fmfj)gged0.get(v1);
            fmbi fmbi0 = fmfj0.b;
            if(fmus0.b(fmbi0) && !fmbi0.a().equals(fmba.a)) {
                int v2 = fmus0.q;
                fmus0.q = v2 + 1;
                MenuItem menuItem0 = ((ConversationView)fmus0.a).m.a.g().add(0, v2, 1, fmfj0.a).setOnMenuItemClickListener(fmus0.ae);
                int v3 = menuItem0.getItemId();
                fmus0.r.put(v3, fmbi0);
                menuItem0.setOnMenuItemClickListener(fmus0.af);
                fmus0.s.add(menuItem0);
            }
        }
        fmus0.R = ((fmeo)object0).i;
        flbv flbv0 = fmus0.d;
        AccountContext accountContext0 = fmus0.e;
        glzd.f(flbv0.a(accountContext0, 12), new fmso(fmus0), flbk.a());
        if(fmus0.b.e().equals(ConversationId.IdType.a)) {
            gfsx gfsx0 = ((fmeo)object0).b;
            if(gfsx0.i()) {
                fmus0.g = (String)gfsx0.d();
            }
        }
        glzd.f(flbv0.a(accountContext0, 15), new fmsy(fmus0, ((fmeo)object0)), flbk.a());
    }
}

