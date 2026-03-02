import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.Button;
import android.widget.ScrollView;
import dagger.internal.Preconditions;

public final class dxjs extends dokz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, fshb {
    public static final bboh a;
    azts ag;
    private Button ah;
    private Button ai;
    private Button aj;
    private View ak;
    private dxih al;
    Account b;
    dmgi c;
    public ScrollView d;

    static {
        dxjs.a = bboh.b("Pay", bbcu.cZ);
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.al == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            this.al = new dxih(new doma(this), dolg0);
        }
        this.al.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((hwfk.a.b().aA() ? 0x7F0E07B5 : 0x7F0E07B4), viewGroup0, false);  // layout:pc1_consent_fragment_subheader_text_aligned
        xni xni0 = (xni)this.getContext();
        if(xni0 != null) {
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            xni0.hG(toolbar0);
            im im0 = xni0.hL();
            if(im0 != null) {
                im0.A(0x7F1508D9);  // string:common_settings "Settings"
                im0.p(4);
                im0.v(this.getString(0x7F151C03));  // string:pay_back "Back"
                toolbar0.x(new dxjn(this));
            }
        }
        this.ah = (Button)view0.findViewById(0x7F0B06B4);  // id:PrimaryButton
        this.ai = (Button)view0.findViewById(0x7F0B013B);  // id:CancelButton
        this.aj = (Button)view0.findViewById(0x7F0B05A5);  // id:MoreButton
        this.ai.setOnClickListener(new dxjp(this));
        this.ah.setOnClickListener(new dxjq(this));
        LinearLayoutCompat linearLayoutCompat0 = (LinearLayoutCompat)view0.findViewById(0x7F0B0123);  // id:ButtonContainer
        linearLayoutCompat0.setBackground(fyuj.Q(linearLayoutCompat0.getContext(), 8.0f));
        ScrollView scrollView0 = (ScrollView)view0.findViewById(0x7F0B07A9);  // id:ScrollView
        this.d = scrollView0;
        scrollView0.getViewTreeObserver().addOnGlobalLayoutListener(this);
        dmgi dmgi0 = this.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapn.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hapn)hftv0).b = 4;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hapn)hftv1).c = 3;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hapn)hftp1.b_message).d = 2;
        hapn hapn0 = (hapn)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hapn0.getClass();
        hapr0.bf = hapn0;
        hapr0.e |= 0x40000000;
        dmgi0.b(((hapr)hftp0.N_build()));
        return view0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view0 = this.d.getChildAt(0);
        this.ak = view0;
        if(view0.getHeight() > this.d.getHeight()) {
            this.aj.setVisibility(0);
            this.aj.setOnClickListener(new dxjo(this));
            this.d.getViewTreeObserver().addOnScrollChangedListener(this);
        }
        else {
            this.aj.setVisibility(8);
            this.ah.setVisibility(0);
            this.ai.setVisibility(0);
        }
        this.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        if(this.d.getScrollY() >= this.ak.getHeight() - this.d.getHeight()) {
            int v = this.d.getHeight();
            this.aj.setVisibility(8);
            this.ah.setVisibility(0);
            this.ai.setVisibility(0);
            this.d.getViewTreeObserver().removeOnScrollChangedListener(this);
            this.d.getViewTreeObserver().addOnGlobalLayoutListener(new dxjr(this, v));
        }
    }
}

