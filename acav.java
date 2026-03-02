import android.content.res.Resources;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import j..util.Objects;

public final class acav implements View.OnFocusChangeListener {
    final AppInviteChimeraActivity a;

    public acav(AppInviteChimeraActivity appInviteChimeraActivity0) {
        Objects.requireNonNull(appInviteChimeraActivity0);
        this.a = appInviteChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        AppInviteChimeraActivity appInviteChimeraActivity0 = this.a;
        Resources resources0 = appInviteChimeraActivity0.getResources();
        if(z) {
            if(!appInviteChimeraActivity0.r) {
                appInviteChimeraActivity0.r = true;
                appInviteChimeraActivity0.n.post(new acau(this));
            }
            int v = resources0.getColor(0x7F060BC3);  // color:material_google_blue_800
            appInviteChimeraActivity0.k.t.setTextColor(v);
            View view1 = appInviteChimeraActivity0.k.v;
            view1.setLayoutParams(new LinearLayout.LayoutParams(-1, resources0.getDimensionPixelSize(0x7F070152)));  // dimen:appinvite_separator_bold
            view1.setBackgroundColor(v);
            return;
        }
        int v1 = resources0.getColor(0x7F06004C);  // color:appinvite_medium_black
        appInviteChimeraActivity0.k.t.setTextColor(v1);
        View view2 = appInviteChimeraActivity0.k.v;
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, resources0.getDimensionPixelSize(0x7F070151)));  // dimen:appinvite_separator
        view2.setBackgroundColor(resources0.getColor(0x7F060053));  // color:appinvite_separator
        appInviteChimeraActivity0.m.setText("");
        if(appInviteChimeraActivity0.q) {
            boolean z1 = false;
            appInviteChimeraActivity0.q = false;
            int v2 = ((EditText)view0).getText().length();
            acbc acbc0 = appInviteChimeraActivity0.p;
            if(100 - v2 > 0) {
                z1 = true;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giit.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giit)hftv0).b |= 1;
            ((giit)hftv0).c = z1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            giit giit0 = (giit)hftp0.b_message;
            giit0.b |= 2;
            giit0.d = v2;
            acbc0.f(((giit)hftp0.N_build()), 4, acbc0.a);
        }
    }
}

