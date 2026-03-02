import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.button.MaterialButton;
import dagger.internal.Preconditions;

public final class duma extends dokz {
    public static final bboh a;
    edky b;
    final gfsx c;
    public acp d;

    static {
        duma.a = bboh.b("Pay", bbcu.cZ);
    }

    public duma() {
        this.c = gfqx.a;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        Preconditions.b(this.ap());
        dumg dumg0 = new dumg(doly0);
        this.c.f(dumg0);
        dumg0.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.d = this.registerForActivityResult(new adt(), new dult(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        Context context0 = this.requireContext();
        if(hwev.c()) {
            View view0 = layoutInflater0.inflate(0x7F0E073E, viewGroup0, false);  // layout:pay_setup_auth_screen_fragment
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            toolbar0.x(new dulv(this));
            toolbar0.t(0x7F151C03);  // string:pay_back "Back"
            ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
            Context context1 = this.getContext();
            if(context1 != null) {
                String s = this.getString(0x7F151EAF);  // string:pay_id_auth_setup_lock_body_text "In most cases, your phone needs to be unlocked 
                                                        // to use your digital ID. To make changes go to your [keyguardSettingsLink]settings[/keyguardSettingsLink]."
                fryh fryh0 = new fryh(0x7F080E72);  // drawable:safer_with_google
                frxp frxp0 = new frxp(0);
                fugt fugt0 = new fugt(fryh0, null, null, fugw.a, frxp0);
                frxo frxo0 = new frxo(0x7F04030C);  // attr:colorPrimary
                iwj iwj0 = dsns.c(context1, dsns.d(context1, s, frxo0), "keyguardSettingsLink", frxo0, new dulz(this));
                composeViewHeader0.b(new fuhm(fugt0, new fryr(0x7F15230E), new fryq(iwj0)));  // string:pay_util_auth_setup_lock_acknowledgement_text "Set a screen lock"
            }
            ComposeActionBar composeActionBar0 = (ComposeActionBar)view0.findViewById(0x7F0B00EB);  // id:BottomActionBar
            ftts ftts0 = ftts.a(new fryr(0x7F15230E), new dulu(this)).a();  // string:pay_util_auth_setup_lock_acknowledgement_text "Set a screen lock"
            ftuy ftuy0 = new ftuy();
            ftuy0.h(ftts0);
            ftuy0.c(true);
            composeActionBar0.d(ftuy0.a());
            return view0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E073F, viewGroup0, false);  // layout:pay_setup_lockscreen_dialog_frament
        dvco.a(view1, context0);
        edqf.f(((TextView)view1.findViewById(0x7F0B00E0)), this.getString(0x7F151BFD), new View.OnClickListener[]{new dulw(this), new dulx(this)});  // id:Body
        ((ImageView)view1.findViewById(0x7F0B0545)).setImageResource((fsce.a(view1.getContext()) ? 0x7F0809C3 : 0x7F0809C4));  // id:LockScreenImage
        ((MaterialButton)view1.findViewById(0x7F0B0120)).setOnClickListener(new duly(this));  // id:Button
        return view1;
    }
}

