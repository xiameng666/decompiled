import android.text.SpannableStringBuilder;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView.BufferType;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import com.google.android.libraries.messaging.lighter.ui.conversationheader.ConversationHeaderView;

public final class fmsy implements gfsi {
    public final fmus a;
    public final fmeo b;

    public fmsy(fmus fmus0, fmeo fmeo0) {
        this.a = fmus0;
        this.b = fmeo0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            gfsx gfsx0 = this.b.j;
            if(gfsx0.i()) {
                fmhm fmhm0 = ((fmhn)gfsx0.d()).a;
                ConversationHeaderView conversationHeaderView0 = ((ConversationView)this.a.a).m;
                SpannableStringBuilder spannableStringBuilder0 = fmrm.b(this.a.a.getContext(), fmhm0, gfqx.a);
                conversationHeaderView0.d.setText(spannableStringBuilder0, TextView.BufferType.SPANNABLE);
                ConversationHeaderView conversationHeaderView1 = ((ConversationView)this.a.a).m;
                fydm fydm0 = (fydm)conversationHeaderView1.a.getLayoutParams();
                float f = conversationHeaderView1.getResources().getDisplayMetrics().density;
                fydm0.setMargins(0, 0, 0, ((int)(42.0f * f)));
                ((LinearLayout.LayoutParams)conversationHeaderView1.c.getLayoutParams()).setMargins(0, ((int)(f + f)), 0, 0);
                conversationHeaderView1.d.setVisibility(0);
            }
        }
        return null;
    }
}

