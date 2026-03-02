import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.valuable.view.ucp.ProcessUcpAnimationView;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.material.appbar.MaterialToolbar;
import dagger.internal.Preconditions;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class dwef extends dokz implements ednc, fshb {
    public ibnf a;
    public domj ag;
    public fuok ah;
    public NestedScrollView ai;
    public TextView aj;
    public ActionBar ak;
    public ComposeActionBar al;
    public Button am;
    public Button an;
    public ProgressBar ao;
    public ProcessUcpAnimationView ap;
    public static final int aq;
    private final ibnn ar;
    private View as;
    private MaterialToolbar at;
    public fhwk b;
    public fhxi c;
    public fhvw d;

    static {
        bboh.b("NoticeAcknowledgementFragment", bbcu.cZ);
    }

    public dwef() {
        dwea dwea0 = new dwea(this);
        dwec dwec0 = new dwec(new dweb(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dwec0);
        this.ar = new lsd(new ibuk(dwfb.class), new dwed(ibnn0), dwea0, new dwee(ibnn0));
    }

    public final dwfb A() {
        return (dwfb)this.ar.a();
    }

    public final fhvw B() {
        fhvw fhvw0 = this.d;
        if(fhvw0 != null) {
            return fhvw0;
        }
        ibuq.j("interactionLogger");
        return null;
    }

    public final fhwk D() {
        fhwk fhwk0 = this.b;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return hwik.n();
    }

    @Override  // fshb
    public final int kd() {
        return 1;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        done done0 = new done();
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dwcn(dolg0, done0, domv0).inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        gged_interceptors gged0;
        ArrayList arrayList0;
        super.onCreate(bundle0);
        dwfb dwfb0 = this.A();
        Bundle bundle1 = this.getArguments();
        int v = 0;
        dwfb0.j = bundle1 == null ? null : bundle1.getInt("PASS_CATEGORY_HINT", 0);
        dwfb0.k = bundle1 == null ? false : bundle1.getBoolean("UCP_RETURN_WHEN_COMPLETE", false);
        dwfb0.l = bundle1 == null ? false : bundle1.getBoolean("RETURN_UCP_BIG_NOTICE_RESULT", false);
        dwfb0.n = bundle1 == null ? false : bundle1.getBoolean("SHOULD_KEEP_SESSION_ID", false);
        dwfb0.o = bundle1 == null ? 0 : bundle1.getInt("USER_CREATED_PASS_ORIGIN", 0);
        if(bundle1 != null) {
            v = bundle1.getInt("PASS_SOURCE", 0);
        }
        dwfb0.m = v;
        if(!bbqa.c()) {
            arrayList0 = bundle1 == null ? null : bundle1.getParcelableArrayList("IMAGE_URIS");
        }
        else if(bundle1 != null) {
            arrayList0 = bundle1.getParcelableArrayList("IMAGE_URIS", Uri.class);
        }
        else {
            arrayList0 = null;
        }
        if(arrayList0 == null) {
            gged0 = ggna.a;
            ibuq.e(gged0, "of(...)");
        }
        else {
            gged0 = ggdx.a(arrayList0);
            if(gged0 == null) {
                gged0 = ggna.a;
                ibuq.e(gged0, "of(...)");
            }
        }
        dwfb0.h = gged0;
        gged_interceptors gged1 = dwfb0.h;
        ArrayList arrayList1 = new ArrayList(ibpo.q(gged1, 10));
        for(Object object0: gged1) {
            String s = dwfb0.e.name;
            ibuq.e(s, "name");
            ibuq.c(((Uri)object0));
            arrayList1.add(dvky.a(dwfb0.d, s, ((Uri)object0)));
        }
        dwfb0.i = ggdx.a(arrayList1);
        if(!this.A().n) {
            this.y().d();
        }
        dwfb dwfb1 = this.A();
        icbb.b(lsc.a(dwfb1), null, null, new dwfa(dwfb1, null), 3);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        View view0 = layoutInflater0.inflate(0x7F0E0DD7, viewGroup0, false);  // layout:wallet_ucpv2_notice_acknowledgement_layout
        this.as = view0;
        if(view0 == null) {
            ibuq.j("rootView");
            view0 = null;
        }
        this.ap = (ProcessUcpAnimationView)view0.findViewById(0x7F0B0942);  // id:UcpProcessingAnimation
        View view1 = this.as;
        if(view1 == null) {
            ibuq.j("rootView");
            view1 = null;
        }
        this.ao = (ProgressBar)view1.findViewById(0x7F0B06D8);  // id:ProgressBar
        View view2 = this.as;
        if(view2 == null) {
            ibuq.j("rootView");
            view2 = null;
        }
        this.ai = (NestedScrollView)view2.findViewById(0x7F0B0602);  // id:NoticeTextContainer
        View view3 = this.as;
        if(view3 == null) {
            ibuq.j("rootView");
            view3 = null;
        }
        TextView textView0 = (TextView)view3.findViewById(0x7F0B0601);  // id:NoticeText
        this.aj = textView0;
        if(textView0 == null) {
            ibuq.j("noticeText");
            textView0 = null;
        }
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        View view4 = this.as;
        if(view4 == null) {
            ibuq.j("rootView");
            view4 = null;
        }
        this.ak = (ActionBar)view4.findViewById(0x7F0B0012);  // id:ActionBar
        View view5 = this.as;
        if(view5 == null) {
            ibuq.j("rootView");
            view5 = null;
        }
        this.al = (ComposeActionBar)view5.findViewById(0x7F0B020A);  // id:ComposeActionBar
        ActionBar actionBar0 = this.ak;
        if(actionBar0 == null) {
            ibuq.j("actionBar");
            actionBar0 = null;
        }
        this.am = (Button)actionBar0.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        ActionBar actionBar1 = this.ak;
        if(actionBar1 == null) {
            ibuq.j("actionBar");
            actionBar1 = null;
        }
        this.an = (Button)actionBar1.findViewById(0x7F0B07C8);  // id:SecondaryActionButton
        View view6 = this.as;
        if(view6 == null) {
            ibuq.j("rootView");
            view6 = null;
        }
        MaterialToolbar materialToolbar0 = (MaterialToolbar)view6.findViewById(0x7F0B08D8);  // id:Toolbar
        this.at = materialToolbar0;
        if(materialToolbar0 == null) {
            ibuq.j("toolbar");
            materialToolbar0 = null;
        }
        materialToolbar0.x(new dwdm(this));
        dwdj dwdj0 = new dwdj(this);
        boolean z = hwvf.d();
        NestedScrollView nestedScrollView0 = this.ai;
        if(nestedScrollView0 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView0 = null;
        }
        nestedScrollView0.e = new dwdk(z, this, dwdj0);
        NestedScrollView nestedScrollView1 = this.ai;
        if(nestedScrollView1 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView1 = null;
        }
        nestedScrollView1.addOnLayoutChangeListener(new dwdl(dwdj0));
        ProcessUcpAnimationView processUcpAnimationView0 = this.ap;
        if(processUcpAnimationView0 == null) {
            ibuq.j("animationView");
            processUcpAnimationView0 = null;
        }
        processUcpAnimationView0.setVisibility(0);
        NestedScrollView nestedScrollView2 = this.ai;
        if(nestedScrollView2 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView2 = null;
        }
        nestedScrollView2.setVisibility(8);
        ProcessUcpAnimationView processUcpAnimationView1 = this.ap;
        if(processUcpAnimationView1 == null) {
            ibuq.j("animationView");
            processUcpAnimationView1 = null;
        }
        processUcpAnimationView1.a(this.aw());
        NestedScrollView nestedScrollView3 = this.ai;
        if(nestedScrollView3 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView3 = null;
        }
        nestedScrollView3.getViewTreeObserver().addOnGlobalLayoutListener(new dwdy(this));
        fhwk fhwk0 = this.D();
        View view7 = this.as;
        if(view7 == null) {
            ibuq.j("rootView");
            view7 = null;
        }
        fhvo fhvo0 = this.D().a.a(209833);
        gjdt gjdt0 = gjds.a(((ProtoLiteMessage)gjdw.a).v_newBuilder());
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        gjzn gjzn0 = gjzm.a(((ProtoLiteMessage)gkbd.a).v_newBuilder());
        gjzn0.c(this.A().o);
        gjzs0.e(gjzn0.a());
        gjdt0.f(gjzs0.a());
        String s = this.y().a();
        gjdt0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
        fhvo0.d(douf.b(gjdt0.a()));
        fhwk0.f(view7, fhvo0);
        if(!hwfk.av()) {
            fhwk fhwk1 = this.D();
            Button button0 = this.am;
            if(button0 == null) {
                ibuq.j("acceptButton");
                button0 = null;
            }
            fhwk1.f(button0, this.D().a.a(210094));
            fhwk fhwk2 = this.D();
            Button button1 = this.an;
            if(button1 == null) {
                ibuq.j("cancelButton");
                button1 = null;
            }
            fhwk2.f(button1, this.D().a.a(210095));
        }
        fhwk fhwk3 = this.D();
        NestedScrollView nestedScrollView4 = this.ai;
        if(nestedScrollView4 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView4 = null;
        }
        fhwk3.f(nestedScrollView4, this.D().a.a(210096));
        View view8 = this.as;
        if(view8 == null) {
            ibuq.j("rootView");
            return null;
        }
        return view8;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icmq icmq0 = this.A().b.a;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dwdu(lps0, icmq0, null, this), 3);
        icmq icmq1 = this.A().c.c;
        lps lps1 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps1), null, null, new dwdx(lps1, icmq1, null, this), 3);
        this.getLifecycle().c(this.A());
    }

    public final domj y() {
        domj domj0 = this.ag;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }
}

