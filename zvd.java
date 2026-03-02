import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Arrays;

public final class zvd extends aaep {
    private final Context A;
    private final TextView B;
    private final TextView C;
    private final View D;
    private final ibnn E;
    public final aacf t;
    public final aaca u;
    public final aabl v;
    public final aabz w;
    public final AccountParticleDisc x;
    private final du y;
    private final fnle z;

    @AssistedInject
    public zvd(@Assisted View view0, du du0, aacf aacf0, aaca aaca0, aabl aabl0, aabz aabz0, fnle fnle0) {
        ibuq.f(view0, "view");
        ibuq.f(du0, "fragment");
        ibuq.f(aacf0, "linkClickListener");
        ibuq.f(aaca0, "accountSwitcherClickListener");
        ibuq.f(aabz0, "accountMenuOpenListener");
        ibuq.f(fnle0, "accountMenuManager");
        super(view0);
        this.y = du0;
        this.t = aacf0;
        this.u = aaca0;
        this.v = aabl0;
        this.w = aabz0;
        this.z = fnle0;
        Context context0 = view0.getContext();
        ibuq.e(context0, "getContext(...)");
        this.A = context0;
        View view1 = view0.findViewById(0x7F0B0A55);  // id:accountAvatar
        ibuq.e(view1, "findViewById(...)");
        this.x = (AccountParticleDisc)view1;
        View view2 = view0.findViewById(0x7F0B22B8);  // id:title
        ibuq.e(view2, "findViewById(...)");
        this.B = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0A56);  // id:accountName
        ibuq.e(view3, "findViewById(...)");
        this.C = (TextView)view3;
        this.D = view0.findViewById(0x7F0B0A58);  // id:accountSwitcherContainer
        this.E = new ibnz(new zuy(this));
    }

    @Override  // aaep
    public final void D(aaem aaem0) {
        String s5;
        ibuq.f(aaem0, "listItem");
        if(!(aaem0 instanceof zuu)) {
            return;
        }
        Object object0 = this.E.a();
        ibuq.e(object0, "getValue(...)");
        ((aabm)object0).a(gfsx.l(((zuu)aaem0).b));
        String s = ((zuu)aaem0).c;
        if(s == null) {
            String s2 = zvd.G(((zuu)aaem0).a);
            this.J(this.x, s2);
        }
        else {
            String s1 = zvd.G(((zuu)aaem0).a);
            this.I(this.x, s1, s);
        }
        gsam gsam0 = ((zuu)aaem0).a;
        if((gsam0.b & 0x2000) == 0) {
            this.x.setImportantForAccessibility(2);
        }
        else {
            String s3 = gsam0.e;
            ibuq.e(s3, "getProfilePictureAccessibilityLabel(...)");
            zvd.H(this.x, s3);
            this.x.setImportantForAccessibility(0);
        }
        zuz zuz0 = new zuz(this, ((zuu)aaem0));
        this.x.setOnClickListener(zuz0);
        String s4 = zvd.G(gsam0);
        this.B.setText(s4);
        TextView textView0 = this.C;
        if(s == null) {
            s5 = "Switch account";
            ibuq.e("Switch account", "getString(...)");
        }
        else {
            s5 = s;
        }
        textView0.setText(s5);
        if(s == null) {
            ibuq.e(this.D, "accountSwitcherContainer");
            String s7 = zvd.G(gsam0);
            this.J(this.D, s7);
        }
        else {
            ibuq.e(this.D, "accountSwitcherContainer");
            String s6 = zvd.G(gsam0);
            this.I(this.D, s6, s);
        }
        View view0 = this.D;
        ibuq.e(view0, "accountSwitcherContainer");
        ibuq.e("switch account", "getString(...)");
        zvd.H(view0, "switch account");
        if(hoju.k()) {
            fnlw fnlw0 = fnlw.a(this.y, this.z, view0);
            fnlw0.c = new zva(this);
            fnlw0.b();
            return;
        }
        view0.setOnClickListener(new zvb(this));
    }

    private static final String G(gsam gsam0) {
        String s1;
        if((gsam0.b & 0x4000) == 0) {
            s1 = gsam0.c;
        }
        else {
            String s = gsam0.f;
            ibuq.e(s, "getDisplayName(...)");
            s1 = s.length() == 0 ? gsam0.c : gsam0.f;
        }
        ibuq.e(s1, "with(...)");
        return s1;
    }

    private static final void H(View view0, String s) {
        kfe.j(view0, new zvc(s));
    }

    private final void I(View view0, String s, String s1) {
        String s2 = String.format("Google Account: %1$s (%2$s)", Arrays.copyOf(new Object[]{s, s1}, 2));
        ibuq.e(s2, "format(...)");
        view0.setContentDescription(s2);
    }

    private final void J(View view0, String s) {
        String s1 = String.format("Google Account: %s", Arrays.copyOf(new Object[]{s}, 1));
        ibuq.e(s1, "format(...)");
        view0.setContentDescription(s1);
    }
}

