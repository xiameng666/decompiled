import android.view.View.OnClickListener;
import android.view.View;

public final class dluy implements View.OnClickListener {
    public final dlvb a;

    public dluy(dlvb dlvb0) {
        this.a = dlvb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        hael hael0 = haek.a(((ProtoLiteMessage)hagk.a).v_newBuilder());
        hael0.b("click_action");
        hael0.c("email_optin_card_dialog_negative_button_gmscore");
        hafk0.c(hael0.a());
        hapr hapr0 = hafk0.a();
        this.a.d.b(hapr0);
    }
}

