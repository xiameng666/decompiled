import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.conversationheader.ConversationHeaderView;

public final class fmuz implements fmoz {
    public final fmvc a;

    public fmuz(fmvc fmvc0) {
        this.a = fmvc0;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        Object object1;
        fmvc fmvc0 = this.a;
        fmev fmev0 = (fmev)((fmpd)object0).a(fmvc0.b);
        gged_interceptors gged0 = (gged_interceptors)((fmpd)object0).a(fmvc0.c);
        fmeo[] arr_fmeo = (fmeo[])gged0.toArray(new fmeo[0]);
        fmqs fmqs0 = fmvc0.a;
        if(fmqs0 == null) {
            fmvc0.a = new fmqs(fmvc0.h.h, fmev0, arr_fmeo);
            fmvc0.a.c.a(fmvc0.a.a, fmvc0.a.b);
        }
        else {
            fmqs0.a = fmev0;
            fmqs0.b = arr_fmeo;
            fmqs0.c.a(fmev0, arr_fmeo);
        }
        ConversationHeaderView conversationHeaderView0 = fmvc0.h;
        gfsx gfsx0 = fmev0.b;
        conversationHeaderView0.getContext();
        if(gfsx0.i() && !TextUtils.isEmpty(((CharSequence)gfsx0.d()))) {
            object1 = gfsx0.d();
        }
        else {
            object1 = "";
            ConversationId conversationId0 = fmev0.a;
            if(conversationId0.e() == ConversationId.IdType.b) {
                object1 = "Group Conversation";
            }
            else if(conversationId0.e() == ConversationId.IdType.a) {
                ContactId contactId0 = conversationId0.c();
                for(Object object2: gged0) {
                    fmeo fmeo0 = (fmeo)object2;
                    if(fmeo0.a.equals(contactId0)) {
                        gfsx gfsx1 = fmeo0.b;
                        if(!gfsx1.i()) {
                            break;
                        }
                        object1 = gfsx1.d();
                        break;
                    }
                }
            }
        }
        if(!gfta.c(((String)object1))) {
            conversationHeaderView0.c.setText(((CharSequence)object1));
            conversationHeaderView0.b.setContentDescription(((CharSequence)object1));
        }
        conversationHeaderView0.g = 1;
        fmam.a().e("ConversationHeaderPresenter::start", fmvc0.g);
        fmvc0.f.a();
    }
}

