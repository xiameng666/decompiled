import android.accounts.Account;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.android.billingclient.api.SkuDetails;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.wallet.analytics.events.NewWidgetActionEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.common.ui.CardActionBarView;
import com.google.android.gms.wallet.common.ui.CardHeaderView;
import com.google.android.gms.wallet.common.ui.CollapsibleCardContentsView;
import com.google.android.gms.wallet.common.ui.SectionView;
import com.google.android.gms.wallet.embeddedlandingpage.InstrumentDetailsView;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.PageDetails;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.gms.wallet.ui.component.filter.FilterCategoryChipButton;
import com.google.android.gms.wallet.ui.component.filter.FilterView;
import com.google.android.gms.wallet.ui.component.filter.ManageFiltersChipButton;
import com.google.android.gms.wallet.ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.android.wallet.ui.common.CallbackListenerScrollView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.LegalMessageView;
import com.google.android.wallet.ui.common.LinkView;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import j..util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

public abstract class fbzp extends gdcm implements fbys, fcay, gamd, gciy, gcjl, gcjp, gcjs, gcjt, gcyj, gcyo, gczl, gczu, rby, rdd {
    private static final String a;
    fbfn aH;
    public gczm aI;
    public View aJ;
    public BuyFlowConfig aK;
    public String aL;
    int aM;
    public fbgo aN;
    public fbgp aO;
    public final gdew aP;
    public TimedEvent aQ;
    public long aR;
    protected Object aS;
    Handler aT;
    public int aU;
    public fbzn aV;
    public fbys aW;
    boolean aX;
    public boolean aY;
    public CharSequence aZ;
    private final ArrayList ag;
    private final ArrayList ah;
    private pao ai;
    private ViewGroup aj;
    private final SparseArray ak;
    private rbo al;
    private boolean am;
    private hcft an;
    private long ao;
    private boolean ap;
    private int aq;
    private boolean b;
    PageDetails bA;
    public Object bB;
    public final ArrayList bC;
    public final ArrayList bD;
    public final ArrayList bE;
    public final ArrayList bF;
    public final ArrayList bG;
    public final ArrayList bH;
    public final ArrayList bI;
    public final ArrayList bJ;
    public final ArrayList bK;
    public final ArrayList bL;
    public final ArrayList bM;
    public final ArrayList bN;
    public final ArrayList bO;
    public FilterView bP;
    protected ViewGroup bQ;
    public final ArrayList bR;
    public final ArrayList bS;
    public final byi bT;
    public CharSequence ba;
    protected final byi bb;
    protected final byi bc;
    public gcqy bd;
    protected int be;
    protected int bf;
    public final ArrayList bg;
    Map bh;
    public final ArrayList bi;
    boolean bj;
    public int bk;
    int bl;
    public boolean bm;
    boolean bn;
    public boolean bo;
    int bp;
    int bq;
    protected ozo br;
    public gchj bs;
    gcju bt;
    boolean bu;
    public boolean bv;
    public String bw;
    public Object bx;
    public PageDetails by;
    public PageDetails bz;
    private final ArrayList c;
    private final ArrayList d;

    static {
        fbzp.a = "orchestrationPage:TransactionRetainerFragment";
    }

    public fbzp() {
        this.aM = -1;
        this.aP = new gdew();
        this.bb = new byi();
        this.bc = new byi();
        this.c = new ArrayList();
        this.bg = new ArrayList();
        this.d = new ArrayList();
        this.ag = new ArrayList();
        this.ah = new ArrayList();
        this.bh = new HashMap();
        this.bi = new ArrayList();
        this.bk = -1;
        this.bl = -2;
        this.bp = -1;
        this.bq = -1;
        this.bu = false;
        this.by = this.A();
        this.aq = 1;
        this.bC = new ArrayList();
        this.bD = new ArrayList();
        this.bE = new ArrayList();
        this.bF = new ArrayList();
        this.bG = new ArrayList();
        this.bH = new ArrayList();
        this.bI = new ArrayList();
        this.bJ = new ArrayList();
        this.bK = new ArrayList();
        this.bL = new ArrayList();
        this.bM = new ArrayList();
        this.bN = new ArrayList();
        this.bO = new ArrayList();
        this.bR = new ArrayList();
        this.bS = new ArrayList();
        this.ak = new SparseArray();
        this.bT = new byi();
        this.am = false;
    }

    protected PageDetails A() {
        throw null;
    }

    protected abstract gfet C();

    protected Parser D() {
        gcfz.c(this.cM(), "PF-31");
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse InitializeRequest protos.");
    }

    protected Parser E() {
        throw null;
    }

    protected Parser F() {
        gcfz.c(this.cM(), "PF-32");
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse SubmitRequest protos.");
    }

    protected Object G(Object object0) {
        gcfz.c(this.cM(), "PF-37");
        throw new UnsupportedOperationException("constructAndSendSubmitRequest not supported.");
    }

    protected Object H(Bundle bundle0, byte[] arr_b, List list0) {
        gcfz.c(this.cM(), "PF-40");
        throw new UnsupportedOperationException("createPageValue not supported.");
    }

    @Override  // fbys
    public final void J(View view0, ik ik0) {
        this.aW.J(view0, ik0);
    }

    @Override  // gcjp
    public void K(gffq gffq0, List list0) {
        int v8;
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        switch(v - 1) {
            case 1: {
                long v4 = gffq0.f;
                if(v4 == 4L) {
                    this.lA();
                    return;
                }
                if(this.bl != -2) {
                    gcfz.c(this.cM(), "PF-19");
                    throw new IllegalArgumentException("Cannot show multiple pages simultaneously");
                }
                if(v4 == this.lf(this.by.i)) {
                    this.bl = -1;
                    return;
                }
                List list1 = this.by.f;
                if(list1 != null) {
                    int v5 = list1.size();
                    for(int v2 = 0; v2 < v5; ++v2) {
                        if(gffq0.f == this.lf(this.by.f.get(v2))) {
                            this.bl = v2;
                            break;
                        }
                    }
                    if(this.bl == -2) {
                        gcfz.c(this.cM(), "PF-20");
                        throw new IllegalArgumentException(String.format(Locale.US, "Could not find page with UI reference %d", ((long)gffq0.f)));
                    }
                }
                return;
            }
            case 11: {
                long v6 = gffq0.f;
                if(v6 != 4L) {
                    if(v6 == this.lf(this.bx)) {
                        this.bj = true;
                        return;
                    }
                    gcfz.c(this.cM(), "PF-21");
                    throw new IllegalArgumentException(String.format(Locale.US, "Could not hide component %d", ((long)gffq0.f)));
                }
                this.ln();
                return;
            }
            case 14: {
                byi byi0 = this.bT;
                hcfk hcfk0 = (hcfk)byi0.d(gffq0.f);
                if(hcfk0 != null) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcfk0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hcfk0));
                    gffp gffp0 = gffq0.c == 10 ? ((gffp)gffq0.d) : gffp.a;
                    hcfl hcfl0 = gffp0.b == null ? hcfl.a : gffp0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hcfk hcfk1 = (hcfk)hftp0.b_message;
                    hcfl0.getClass();
                    hcfk1.d = hcfl0;
                    hcfk1.b |= 2;
                    hcfk hcfk2 = (hcfk)hftp0.N_build();
                    byi0.h(gffq0.f, hcfk2);
                    return;
                }
                gcfz.c(this.cM(), "PF-22");
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid update variable resulting action %d", ((long)gffq0.f)));
            }
            case 18: {
                List list2 = this.by.f;
                if(list2 != null) {
                    int v7 = list2.size();
                    v8 = 0;
                    while(v8 < v7) {
                        if(gffq0.f == this.lf(this.by.f.get(v8))) {
                            goto label_70;
                        }
                        ++v8;
                    }
                }
                v8 = -2;
            label_70:
                if(v8 != -2) {
                    PageDetails pageDetails0 = this.A();
                    pageDetails0.i = this.an(this.by.f.get(v8));
                    pageDetails0.c = hcdu.l;
                    pageDetails0.n = this.by.n;
                    pageDetails0.p = this.by.p;
                    this.kZ(pageDetails0, false, "showPageInOverlayAction");
                    this.bk = v8;
                    return;
                }
                gcfz.c(this.cM(), "PF-18");
                throw new IllegalArgumentException(String.format(Locale.US, "Could not find page with UI reference %d", ((long)gffq0.f)));
            }
            case 21: {
                gffe gffe0 = gffq0.c == 12 ? ((gffe)gffq0.d) : gffe.a;
                hcfu hcfu0 = gffe0.b == null ? hcfu.a : gffe0.b;
                this.au((hcfu0.b == null ? hcfx.a : hcfu0.b));
                return;
            }
            case 25: {
                gffc gffc0 = gffq0.c == 15 ? ((gffc)gffq0.d) : gffc.a;
                int v9 = (hcdu.b(gffc0.b) == null ? hcdu.a : hcdu.b(gffc0.b)).ordinal();
                if(v9 != 5) {
                    switch(v9) {
                        case 6: {
                            this.cB(10);
                            return;
                        }
                        case 15: {
                            PageDetails pageDetails1 = this.by;
                            pageDetails1.c = hcdu.b(gffc0.b) == null ? hcdu.a : hcdu.b(gffc0.b);
                            pageDetails1.b = gffc0.c.toByteArray();
                            this.kZ(this.by, false, "flowInstructionAction");
                            return;
                        }
                        default: {
                            gcfz.c(this.cM(), "PF-23");
                            hcdu hcdu0 = hcdu.b(gffc0.b) == null ? hcdu.a : hcdu.b(gffc0.b);
                            throw new IllegalArgumentException(String.format(Locale.US, "Unsupported FLOW_INSTRUCTION resulting action instruction: %s", ((int)hcdu0.w)));
                        }
                    }
                }
                this.bQ();
                return;
            }
            case 30: {
                ClipData clipData0 = ClipData.newPlainText("", (gffq0.c == 19 ? ((gffa)gffq0.d) : gffa.a).b);
                ClipboardManager clipboardManager0 = (ClipboardManager)this.getContext().getSystemService("clipboard");
                if(clipboardManager0 != null) {
                    clipboardManager0.setPrimaryClip(clipData0);
                    return;
                }
                return;
            }
            case 0x20: {
                Context context0 = this.getContext();
                if(gfev.a(gffq0.e) == 33) {
                    if(gffq0.c != 22) {
                        throw new IllegalArgumentException("showToast() called with null ToastAction");
                    }
                    gffo gffo0 = (gffo)gffq0.d;
                    if(gffn.a(gffo0.c) == 2) {
                        v1 = 0;
                    }
                    Toast.makeText(context0, gffo0.b, v1).show();
                    return;
                }
                Locale locale1 = Locale.US;
                int v10 = gfev.a(gffq0.e);
                if(v10 != 0) {
                    v1 = v10;
                }
                throw new IllegalArgumentException(String.format(locale1, "showToast() called with incorrect action type: %s", ((int)(v1 - 1))));
            }
            default: {
                gcfz.c(this.cM(), "PF-24");
                Locale locale0 = Locale.US;
                int v3 = gfev.a(gffq0.e);
                if(v3 != 0) {
                    v1 = v3;
                }
                throw new IllegalArgumentException(String.format(locale0, "PageFragment does not handle resulting action type %s", ((int)(v1 - 1))));
            }
        }
    }

    protected abstract void L(boolean arg1);

    @Override  // gdcm
    protected void M() {
        boolean z = this.ca;
        ArrayList arrayList0 = this.bJ;
        int v = arrayList0.size();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            ((CardActionBarView)arrayList0.get(v1)).setEnabled(z);
        }
        ArrayList arrayList1 = this.bC;
        int v2 = arrayList1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((gcyd)arrayList1.get(v3)).c().setEnabled(z);
        }
        ArrayList arrayList2 = this.bH;
        int v4 = arrayList2.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            ((ImageWithCaptionView)arrayList2.get(v5)).setEnabled(z);
        }
        ArrayList arrayList3 = this.bI;
        int v6 = arrayList3.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            ((CardHeaderView)arrayList3.get(v7)).setEnabled(z);
        }
        ArrayList arrayList4 = this.bK;
        int v8 = arrayList4.size();
        for(int v9 = 0; v9 < v8; ++v9) {
            ((CollapsibleCardContentsView)arrayList4.get(v9)).setEnabled(z);
        }
        ArrayList arrayList5 = this.bL;
        int v10 = arrayList5.size();
        for(int v11 = 0; v11 < v10; ++v11) {
            ((SectionView)arrayList5.get(v11)).setEnabled(z);
        }
        ArrayList arrayList6 = this.bM;
        int v12 = arrayList6.size();
        for(int v13 = 0; v13 < v12; ++v13) {
            ((InstrumentDetailsView)arrayList6.get(v13)).setEnabled(z);
        }
        ArrayList arrayList7 = this.bG;
        int v14 = arrayList7.size();
        for(int v15 = 0; v15 < v14; ++v15) {
            ((SummaryExpanderWrapper)arrayList7.get(v15)).setEnabled(z);
        }
        FilterView filterView0 = this.bP;
        if(filterView0 != null) {
            filterView0.setEnabled(z);
        }
        ArrayList arrayList8 = this.bR;
        int v16 = arrayList8.size();
        for(int v17 = 0; v17 < v16; ++v17) {
            Object object0 = ((gczs)arrayList8.get(v17)).e;
            if((object0 instanceof gdbw)) {
                ((gdbw)object0).ll(z);
            }
            else if((object0 instanceof View)) {
                ((View)object0).setEnabled(z);
            }
        }
        CharSequence charSequence0 = TextUtils.isEmpty(this.aZ) || this.ca ? this.ba : this.aZ;
        Activity activity0 = (Activity)this.getContext();
        activity0.getTitle();
        activity0.setTitle(charSequence0);
        ((xob)this.getContext()).supportInvalidateOptionsMenu();
        if(!this.ca && !this.bm) {
            z1 = true;
        }
        this.aw(z1);
        if(!hzrv.c() && !this.ca && this.aU == 0) {
            this.aP.l(true);
        }
    }

    @Override  // fbys
    public final void O(boolean z) {
        this.aW.O(z);
    }

    @Override  // fbys
    public final void P(boolean z) {
        this.aW.P(z);
    }

    protected abstract void R();

    @Override  // gdcm
    public void T(int v, Bundle bundle0) {
        String s2;
        int v9;
        if(v != 4) {
            int v2 = 1;
            switch(v) {
                case 5: {
                    getj getj0 = gcik.a(bundle0);
                    String s = bundle0.getString("ErrorUtils.KEY_TITLE");
                    this.ll(true);
                    this.lE(getj0, s, false);
                    return;
                }
                case 9: {
                    if(this.cn()) {
                        this.aP.D(true);
                        return;
                    }
                    break;
                }
                case 10: {
                    this.bO(-1);
                    return;
                }
                case 17: {
                    this.bm = true;
                    return;
                }
                case 18: {
                    this.ll(bundle0.getBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", true));
                    return;
                }
                case 19: {
                    this.cB(6);
                    return;
                }
                case 20: {
                    if(this.cb != null) {
                        ArrayList arrayList0 = this.ag;
                        int v3 = arrayList0.size();
                        for(int v1 = 0; v1 < v3; ++v1) {
                            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
                            this.cb.c(gcjm0);
                        }
                        return;
                    }
                    break;
                }
                case 21: {
                    hcei hcei0 = (hcei)gciq.a(bundle0, "EventListener.EXTRA_LINK_PROTO", ((Parser)((ProtoLiteMessage)hcei.a).jf(7, null)));
                    hcfx hcfx0 = hcei0.f == null ? hcfx.a : hcei0.f;
                    if((hcei0.b & 8) == 0) {
                        hcfx0 = (hcei0.e == null ? hcfu.a : hcei0.e).b;
                        if(hcfx0 == null) {
                            hcfx0 = hcfx.a;
                        }
                    }
                    this.au(hcfx0);
                    return;
                }
                case 22: {
                    byte[] arr_b = bundle0.getByteArray("EventListener.EXTRA_ALERT_ACTION_TOKEN");
                    Intent intent0 = ((Activity)this.getContext()).getIntent();
                    ContextThemeWrapper contextThemeWrapper0 = this.bV;
                    BuyFlowConfig buyFlowConfig0 = this.aK;
                    fbjc fbjc0 = new fbjc(fbgn.i(intent0));
                    fbjc0.h(arr_b);
                    Intent intent1 = fbjc0.a();
                    Intent intent2 = new Intent();
                    intent2.setClassName(contextThemeWrapper0, "com.google.android.gms.wallet.ow.ChooseAccountShimActivity");
                    intent2.putExtras(intent1.getExtras());
                    intent2.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
                    intent2.setAction(intent1.getAction());
                    this.startActivityForResult(intent2, 1003);
                    NewWidgetActionEvent.c(this.bV, this.aL, 1000);
                    return;
                }
                case 25: {
                    if(this.bs == null) {
                        this.bs = new gchj(this.getContext(), this.getLoaderManager(), this);
                    }
                    gchj gchj0 = this.bs;
                    gfgf gfgf0 = (gfgf)gciq.a(bundle0, "EventListener.EXTRA_DROID_GUARD_FORM", ((Parser)((ProtoLiteMessage)gfgf.a).jf(7, null)));
                    if(gchj0.b == null || !((ProtoLiteMessage)gchj0.b).equals(gfgf0)) {
                        gchj0.c = null;
                        gchj0.d();
                    }
                    gchj0.b = gfgf0;
                    if(TextUtils.isEmpty(gchj0.c) && !gchj0.e()) {
                        gchj0.d.c(1, Bundle.EMPTY, gchj0);
                        return;
                    }
                    break;
                }
                case 28: {
                    gfgt gfgt0 = (gfgt)gciq.a(bundle0, "EventListener.EXTRA_LINK_ACTION_PROTO", ((Parser)((ProtoLiteMessage)gfgt.a).jf(7, null)));
                    gftb.z(gfgt0, "A valid LinkAction is required.");
                    Activity activity0 = (Activity)this.requireContext();
                    BuyFlowConfig buyFlowConfig1 = this.aK;
                    int v4 = gfgt0.b;
                    int v5 = gfgs.a(v4);
                    if(v5 != 0) {
                        switch(v5 - 1) {
                            case 0: {
                                gfgn gfgn0 = v4 == 2 ? ((gfgn)gfgt0.c) : gfgn.a;
                                ApplicationParameters applicationParameters0 = buyFlowConfig1.b;
                                Account account0 = applicationParameters0.b;
                                String s1 = buyFlowConfig1.c;
                                int v6 = gfgn0.f;
                                switch((gfgm.a(v6) == 0 ? 1 : gfgm.a(v6)) - 1) {
                                    case 1: {
                                        if((gfgn0.b & 16) != 0) {
                                            s1 = gfgn0.g;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        s1 = "com.google.payments";
                                        break;
                                    }
                                    default: {
                                        int v7 = gfgm.a(v6);
                                        if(v7 != 0) {
                                            v2 = v7;
                                        }
                                        throw new IllegalArgumentException(String.format("Unsupported product type: %s", ((int)(v2 - 1))));
                                    }
                                }
                                int v8 = applicationParameters0.e;
                                if(v8 == 1) {
                                    v9 = 1;
                                }
                                else {
                                    switch(v8) {
                                        case 2: {
                                            v9 = 2;
                                            break;
                                        }
                                        case 3: {
                                            v9 = 3;
                                            break;
                                        }
                                        default: {
                                            throw new IllegalArgumentException(String.format("Unsupported theme: %s", v8));
                                        }
                                    }
                                }
                                gcuz.c();
                                Intent intent3 = gcuz.a(gfgn0.c, account0, s1, DesugarCollections.unmodifiableMap(gfgn0.e), gfgn0.d, v9);
                                gcuz.c();
                                gcuz.b(activity0, intent3);
                                return;
                            }
                            case 1: {
                                switch(gfgs.a(v4)) {
                                    case 1: {
                                        s2 = "GOOGLE_HELP_ACTION";
                                        break;
                                    }
                                    case 2: {
                                        s2 = "ACTION_NOT_SET";
                                        break;
                                    }
                                    default: {
                                        s2 = "null";
                                    }
                                }
                                throw new IllegalArgumentException(String.format("Unsupported LinkAction type: %s", s2));
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    throw null;
                }
            }
        }
        else if(this.bx != null && this.cn()) {
            this.W(this.aU);
        }
    }

    protected abstract void V();

    public void W(int v) {
        ArrayList arrayList0 = this.bi;
        arrayList0.clear();
        if(this.cb != null) {
            List list0 = this.lj();
            if(list0 != null) {
                for(Object object0: list0) {
                    gcji gcji0 = new gcji();
                    gcjo.b(gcji0, ((hcey)object0).d, this.cb);
                    arrayList0.add(gcji0);
                }
            }
            List list1 = this.ao();
            if(list1 != null) {
                for(Object object1: list1) {
                    gcji gcji1 = new gcji();
                    gcjo.b(gcji1, ((gfhc)object1).c, this.cb);
                    arrayList0.add(gcji1);
                }
            }
            this.av(this.by.i);
            List list2 = this.by.f;
            if(list2 != null) {
                int v1 = list2.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    this.av(this.by.f.get(v2));
                }
            }
            gcjo.b(this, 4L, this.cb);
            gcjo.b(this.bt, 5L, this.cb);
            this.cb.e(false);
        }
        if(v != 0) {
            this.bc();
        }
        this.M();
        this.aP.x(true);
        this.aP.z();
        if(this.bP != null && this.ay()) {
            this.bw().f(this.br, this.ac());
            FilterView filterView0 = this.bP;
            pao pao0 = this.bw();
            filterView0.g = true;
            filterView0.h = pao0;
            filterView0.i = this.br;
        }
        if(v == 1 && this.cb != null) {
            ArrayList arrayList1 = this.c;
            int v3 = arrayList1.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                this.cb.c(((gcjm)arrayList1.get(v4)));
            }
            arrayList1.clear();
        }
        this.aU = 0;
    }

    protected abstract void Z(Object arg1);

    private static final boolean aA(View view0) {
        return (view0 instanceof CardView) || (view0 instanceof FilterView);
    }

    @Override  // gczl
    public void aD(int v, int v1) {
        this.aI = null;
        switch(v1) {
            case 1: {
                if(v != 0 && v != 2) {
                    gcfz.c(this.cM(), "PF-15");
                    throw new IllegalArgumentException("Unexpected button code: " + v);
                }
                this.bO(-1);
                return;
            }
            case 2: {
                if(v != 0 && v != 2) {
                    gcfz.c(this.cM(), "PF-14");
                    throw new IllegalArgumentException("Unexpected button code: " + v);
                }
                this.ll(true);
                this.by.q = null;
                this.by.c = hcdu.c;
                return;
            }
            case 3: {
                switch(v) {
                    case 1: {
                        this.Z(this.aS);
                        return;
                    }
                    case 2: {
                        this.cB(6);
                        return;
                    }
                    default: {
                        gcfz.c(this.cM(), "PF-13");
                        throw new IllegalArgumentException("Unexpected button code: " + v);
                    }
                }
            }
            case 5: {
                this.ll(true);
                return;
            }
            case 1000: {
                switch(v) {
                    case 1: {
                        this.Z(this.aS);
                        return;
                    }
                    case 2: {
                        this.cB(7);
                        return;
                    }
                    default: {
                        gcfz.c(this.cM(), "PF-12");
                        throw new IllegalArgumentException("Unexpected button code: " + v);
                    }
                }
            }
        }
    }

    public void aI(WalletExitResult walletExitResult0) {
        ArrayList arrayList0 = this.bg;
        int v = arrayList0.size();
        boolean z = true;
        for(int v1 = 0; v1 < v; ++v1) {
            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
            if(this.cb.f(gcjm0) && gcjm0.a.f) {
                z = false;
            }
        }
        if(z) {
            if(this.co()) {
                this.bQ();
                return;
            }
            this.bN(walletExitResult0);
        }
    }

    protected void aK() {
        gcfz.c(this.cM(), "PF-36");
        throw new UnsupportedOperationException("sendCallbackDataToIntegrator not supported");
    }

    protected void aN() {
        if(!this.aX) {
            gfdq gfdq0 = this.by.l;
            Context context0 = this.getContext();
            int v = gdfl.a(this.bV);
            LogContext logContext0 = this.bZ;
            BuyFlowConfig buyFlowConfig0 = this.aK;
            Account account0 = this.oc();
            Intent intent0 = PopupRedirectChimeraActivity.a(context0, (gfdq0.b == null ? gfcw.a : gfdq0.b), null, gfdq0.c, v, null, logContext0, buyFlowConfig0, account0);
            gciq.k(intent0, "webViewComponent", ((MessageLite)gfdq0));
            this.startActivityForResult(intent0, 1004);
            ((Activity)this.getContext()).overridePendingTransition(0, 0);
        }
    }

    @Override  // gcjs
    public boolean aO(gfga gfga0) {
        int v = gfga0.e;
        int v1 = gffw.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        switch(v1 - 1) {
            case 6: {
                return true;
            }
            case 8: 
            case 9: 
            case 16: 
            case 19: {
                return false;
            }
            case 25: {
                boolean z = this.bv;
                if(gffw.a(v) == 26) {
                    return (gfga0.b == 10 ? ((gffu)gfga0.c) : gffu.a).b == z;
                }
                int v4 = gffw.a(v);
                if(v4 != 0) {
                    v2 = v4;
                }
                throw new IllegalArgumentException(String.format("Unsupported trigger type: %d", ((int)(v2 - 1))));
            }
            default: {
                gcfz.c(this.cM(), "PF-17");
                int v3 = gffw.a(gfga0.e);
                if(v3 != 0) {
                    v2 = v3;
                }
                throw new IllegalArgumentException(a.as(((byte)v2), ((byte)-1), ((byte)"Unsupported trigger type: ")));
            }
        }
    }

    protected boolean aQ() {
        return false;
    }

    protected void aZ(fbze fbze0) {
        gfep gfep0 = fbze0.b;
        if(gfeo.a(gfep0.e) == 3) {
            this.ar(fbze0);
            return;
        }
        gcfz.c(this.cM(), "PF-42");
        throw new IllegalStateException(String.format(Locale.US, "Unsupported uiType for nested component groups : %s", ((int)((gfeo.a(gfep0.e) == 0 ? 1 : gfeo.a(gfep0.e)) - 1))));
    }

    protected boolean aa(PageDetails pageDetails0) {
        gcfz.c(this.cM(), "PF-27");
        throw new UnsupportedOperationException("displayOverlay not supported.");
    }

    @Override  // fbys
    public final void ab() {
        this.aW.ab();
    }

    private final pat ac() {
        pat pat0 = new pat();
        oyw oyw0 = new oyw();
        ViewGroup viewGroup0 = this.aj;
        if(viewGroup0 != null) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                oyw0.K(this.aj.getChildAt(v1));
            }
        }
        pat0.h(oyw0);
        pat0.h(new ozd());
        pat0.T(400L);
        pat0.U(0);
        return pat0;
    }

    protected PageDetails ae(Intent intent0) {
        PageDetails pageDetails0 = this.A();
        pageDetails0.c = hcdu.f;
        return pageDetails0;
    }

    protected PageDetails af(PageDetails pageDetails0) {
        return new PageDetails(pageDetails0);
    }

    private static Object ah(Bundle bundle0, Parser hfvs0) {
        if(hfvs0 != null) {
            try {
                return gciq.a(bundle0, "lastNetworkMessage", hfvs0);
            }
            catch(ClassCastException | AssertionError unused_ex) {
            }
        }
        return null;
    }

    protected gklu ai() {
        return gklu.a;
    }

    protected hcdu ak(PageDetails pageDetails0) {
        if(pageDetails0.q != null) {
            return hcdu.k;
        }
        return pageDetails0.i == null ? hcdu.a : hcdu.b;
    }

    protected MessageLite al(long v) {
        gcfz.c(this.cM(), "PF-47");
        throw new IllegalStateException("Child class should implement this.");
    }

    protected Parser am() {
        gcfz.c(this.cM(), "PF-33");
        throw new UnsupportedOperationException("Must be implemented by subclasses to properly parse RefreshRequest protos.");
    }

    protected Object an(Object object0) {
        gcfz.c(this.cM(), "PF-35");
        throw new UnsupportedOperationException("copyPageWithCurrentPageDependencyGraph not supported.");
    }

    protected List ao() {
        return null;
    }

    protected void ap(gcjm gcjm0) {
        gfga gfga0 = gcjm0.a;
        int v = gffw.a(gfga0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        switch(v - 1) {
            case 6: {
                this.c.add(gcjm0);
                return;
            }
            case 8: {
                this.d.add(gcjm0);
                return;
            }
            case 9: {
                this.ag.add(gcjm0);
                return;
            }
            case 16: {
                this.bg.add(gcjm0);
                return;
            }
            case 19: {
                this.ah.add(gcjm0);
                return;
            }
            case 25: {
                return;
            }
            default: {
                gcfz.c(this.cM(), "PF-16");
                Locale locale0 = Locale.US;
                int v2 = gffw.a(gfga0.e);
                if(v2 != 0) {
                    v1 = v2;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v1 - 1))));
            }
        }
    }

    private final void ar(fbze fbze0) {
        ViewGroup viewGroup0 = fbze0.c;
        SectionView sectionView0 = (SectionView)this.bW.inflate(0x7F0E0E5E, viewGroup0, false);  // layout:wallet_view_section
        sectionView0.setId(this.bd.a());
        gfep gfep0 = fbze0.b;
        gfej gfej0 = gfep0.c == 15 ? ((gfej)gfep0.d) : gfej.a;
        if((gfeg.a(gfej0.b) == 0 ? 1 : gfeg.a(gfej0.b)) - 1 == 2) {
            sectionView0.a = LayoutInflater.from(sectionView0.getContext()).inflate(0x7F0E0E60, sectionView0, false);  // layout:wallet_view_section_new
            TextView textView1 = (TextView)sectionView0.a.findViewById(0x7F0B1F7E);  // id:section_title_text
            gdcb.E(textView1, gfej0.c);
            textView1.setTextColor(gdcb.i(sectionView0.getContext(), 0x7F040296));  // attr:colorAccent
        }
        else {
            gfgo gfgo0 = gfep0.h == null ? gfgo.a : gfep0.h;
            sectionView0.a = LayoutInflater.from(sectionView0.getContext()).inflate(0x7F0E0E5F, sectionView0, false);  // layout:wallet_view_section_default
            ((ImageWithCaptionView)sectionView0.a.findViewById(0x7F0B1F7B)).m(gfgo0);  // id:section_title_image
            gdcb.E(((TextView)sectionView0.a.findViewById(0x7F0B1F7C)), gfej0.c);  // id:section_title_primary
            gdcb.E(((TextView)sectionView0.a.findViewById(0x7F0B1F7D)), gfej0.d);  // id:section_title_secondary
            gdcb.E(((TextView)sectionView0.a.findViewById(0x7F0B1F70)), gfej0.e);  // id:section_description_primary
            gdcb.E(((TextView)sectionView0.a.findViewById(0x7F0B1F71)), gfej0.f);  // id:section_description_secondary
            TextView textView0 = (TextView)sectionView0.a.findViewById(0x7F0B1F79);  // id:section_status
            gdcb.E(textView0, gfej0.g);
            textView0.setTextAppearance(((gfei.a(gfej0.h) == 0 ? 1 : gfei.a(gfej0.h)) - 1 == 1 ? 0x7F160FEC : 0x7F160FDA));  // style:UicDisplayTypePendingText
        }
        sectionView0.addView(sectionView0.a, 0);
        sectionView0.a.setOnClickListener(sectionView0);
        sectionView0.a.setTag(0x7F0B218C, "summaryField");  // id:summary_expander_transition_name
        gdcb.E(((TextView)sectionView0.findViewById(0x7F0B1347)), gfep0.g);  // id:expanded_title_text
        sectionView0.c = sectionView0.findViewById(0x7F0B1346);  // id:expanded_title_container
        sectionView0.c.setOnClickListener(sectionView0);
        sectionView0.c.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        sectionView0.b = (ViewGroup)sectionView0.findViewById(0x7F0B1344);  // id:expanded_section_contents
        sectionView0.b.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        sectionView0.d = sectionView0.findViewById(0x7F0B1F78);  // id:section_separator
        sectionView0.e.a = true;
        sectionView0.e.n = sectionView0;
        sectionView0.e.u(sectionView0);
        viewGroup0.addView(sectionView0);
        this.bL.add(sectionView0);
        fbze0.e.d(sectionView0);
        fbzd fbzd0 = new fbzd(fbze0);
        fbzd0.b(sectionView0.b);
        fbzd0.b = sectionView0.e;
        fbze fbze1 = fbzd0.a();
        for(Object object0: gfep0.j) {
            this.bI(fbze1, ((Long)object0).longValue());
        }
    }

    private final void as(fbze fbze0, String s) {
        if(this.aK.b.a == 1) {
            Log.e("PageFragment", s);
            for(Object object0: fbze0.b.j) {
                this.bI(fbze0, ((Long)object0).longValue());
            }
            return;
        }
        gcfz.c(this.cM(), "PF-45");
        throw new IllegalStateException(s);
    }

    private final void at(PageDetails pageDetails0) {
        this.cf(pageDetails0, false);
        this.bn = this.bm;
        this.bm = false;
        this.aU = 1;
        this.bR();
    }

    private final void au(hcfx hcfx0) {
        Intent intent0 = fbgn.h(hcfx0, ((Activity)this.getContext()).getIntent(), this.bV, this.aK);
        int v = hcfz.a(hcfx0.c);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        this.startActivityForResult(intent0, v - 1);
        ContextThemeWrapper contextThemeWrapper0 = this.bV;
        String s = this.aL;
        int v2 = hcfz.a(hcfx0.c);
        if(v2 != 0) {
            v1 = v2;
        }
        NewWidgetActionEvent.c(contextThemeWrapper0, s, v1 - 1);
    }

    private final void av(Object object0) {
        gcjn gcjn0 = this.cb;
        gcjo.b(this, this.lf(object0), gcjn0);
    }

    private final void aw(boolean z) {
        fbgo fbgo0 = this.aN;
        if(fbgo0 != null) {
            fbgo0.N(this.bw);
            if(this.bm || this.bn && !this.aN.U() && this.ca) {
                this.bn = false;
                fbgn.w(this.aJ, ((boolean)(this.ca ^ 1)), this.bw);
            }
            this.aN.Q(z);
        }
    }

    private final boolean ay() {
        return gdcb.S(this.getContext()) && this.bw() != null;
    }

    @Override  // rby
    public final void b(rcm rcm0) {
        boolean z2;
        int v10;
        int v7;
        boolean z1;
        boolean z;
        int v2;
        String s4;
        ArrayList arrayList1;
        ArrayList arrayList0;
        String s1;
        rcm rcm2;
        hgxx hgxx2;
        hgxz hgxz1;
        int v = rcm0.a;
        if(v == 0) {
            this.am = true;
            rbo rbo0 = this.al;
            if(rbo0 != null) {
                if(rbo0.m(rco.a)) {
                    rcm rcm3 = rbo0.k ? rcn.f : rcn.j;
                    if(rcm3.a == 0) {
                        try {
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgxz.a).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ((hgxz)hftp3.b_message).e = 4;
                            ((hgxz)hftp3.b_message).b |= 1;
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hgyj.a).v_newBuilder();
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ((hgyj)hftp4.b_message).c = 8;
                            ((hgyj)hftp4.b_message).b |= 1;
                            hgyj hgyj1 = (hgyj)hftp4.N_build();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            hgxz hgxz0 = (hgxz)hftp3.b_message;
                            hgyj1.getClass();
                            hgxz0.d = hgyj1;
                            hgxz0.c = 2;
                            hgxz1 = (hgxz)hftp3.N_build();
                        }
                        catch(Exception exception1) {
                            rdk.i("BillingLogger", "Unable to create logging payload", exception1);
                            hgxz1 = null;
                        }
                        rbo0.h(hgxz1);
                    }
                    else {
                        try {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxx.a).v_newBuilder();
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgyc.a).v_newBuilder();
                            int v1 = rcm3.a;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((hgyc)hftv0).b |= 1;
                            ((hgyc)hftv0).c = v1;
                            String s = rcm3.c;
                            if(!hftv0.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp1.b_message;
                            s.getClass();
                            ((hgyc)hftv1).b |= 2;
                            ((hgyc)hftv1).d = s;
                            if(!hftv1.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ((hgyc)hftp1.b_message).e = 60;
                            ((hgyc)hftp1.b_message).b |= 4;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hgxx hgxx0 = (hgxx)hftp0.b_message;
                            hgyc hgyc0 = (hgyc)hftp1.N_build();
                            hgyc0.getClass();
                            hgxx0.f = hgyc0;
                            hgxx0.b |= 2;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hgxx)hftp0.b_message).e = 4;
                            ((hgxx)hftp0.b_message).b |= 1;
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgyj.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ((hgyj)hftp2.b_message).c = 8;
                            ((hgyj)hftp2.b_message).b |= 1;
                            hgyj hgyj0 = (hgyj)hftp2.N_build();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hgxx hgxx1 = (hgxx)hftp0.b_message;
                            hgyj0.getClass();
                            hgxx1.d = hgyj0;
                            hgxx1.c = 4;
                            hgxx2 = (hgxx)hftp0.N_build();
                        }
                        catch(Exception exception0) {
                            rdk.i("BillingLogger", "Unable to create logging payload", exception0);
                            hgxx2 = null;
                        }
                        rbo0.g(hgxx2);
                    }
                    rcm2 = rcm3;
                }
                else {
                    rcm rcm1 = rcn.g;
                    if(rcm1.a == 0) {
                        rbo0.r(5);
                    }
                    else {
                        try {
                            rbo0.g(rcj.b(2, 5, rcm1));
                        }
                        catch(Throwable throwable0) {
                            rdk.i("BillingClient", "Unable to log.", throwable0);
                        }
                    }
                    rcm2 = rcn.g;
                }
                if(rcm2.a == 0) {
                    try {
                        s1 = (this.an.e == null ? hcfm.a : this.an.e).e;
                        if(hzoe.c()) {
                            hcfm hcfm0 = this.an.e;
                            if(((hcfm0 == null ? hcfm.a : hcfm0).b & 0x20) != 0) {
                                rce rce0 = new rce();
                                if(hcfm0 == null) {
                                    hcfm0 = hcfm.a;
                                }
                                rcy rcy0 = new rcy(hcfm0.d);
                                rce0.a = rcy0;
                                if(rcy0.a() != null) {
                                    gftb.check(rcy0.a());
                                    String s2 = rcy0.a().a;
                                    if(s2 != null) {
                                        rce0.b = s2;
                                    }
                                }
                                String s3 = (this.an.e == null ? hcfm.a : this.an.e).h;
                                if(TextUtils.isEmpty(s3)) {
                                    throw new IllegalArgumentException("offerToken can not be empty");
                                }
                                rce0.b = s3;
                                gftb.z(rce0.a, "ProductDetails is required for constructing ProductDetailsParams.");
                                arrayList0 = new ArrayList(gged_interceptors.l(new rcf(rce0)));
                                goto label_122;
                            }
                            goto label_113;
                        }
                        else {
                        label_113:
                            SkuDetails skuDetails0 = new SkuDetails((this.an.e == null ? hcfm.a : this.an.e).d);
                            arrayList1 = new ArrayList();
                            arrayList1.add(skuDetails0);
                            arrayList0 = null;
                        }
                        goto label_123;
                    }
                    catch(JSONException jSONException0) {
                        Log.e("PageFragment", String.format("Exception getting JSON skuDetails: %s.", jSONException0));
                        this.bO(-1);
                        arrayList0 = null;
                    }
                label_122:
                    arrayList1 = null;
                label_123:
                    hcfm hcfm1 = this.an.e;
                    if((8 & (hcfm1 == null ? hcfm.a : hcfm1).b) == 0) {
                        v2 = 0;
                        z = true;
                        s4 = null;
                    }
                    else {
                        if(hcfm1 == null) {
                            hcfm1 = hcfm.a;
                        }
                        hcfm hcfm2 = this.an.e == null ? hcfm.a : this.an.e;
                        hcfs hcfs0 = hcfm2.f == null ? hcfs.a : hcfm2.f;
                        rch rch0 = rcg.a((hcfm1.f == null ? hcfs.a : hcfm1.f).c, false, (hcfr.a(hcfs0.b) == 0 ? 1 : hcfr.a(hcfs0.b)) - 1);
                        s4 = rch0.a;
                        v2 = rch0.b;
                        z = false;
                    }
                    hcfm hcfm3 = this.an.e;
                    if(((hcfm3 == null ? hcfm.a : hcfm3).b & 16) == 0) {
                        z1 = false;
                    }
                    else {
                        if(hcfm3 == null) {
                            hcfm3 = hcfm.a;
                        }
                        z1 = hcfm3.g;
                    }
                    rbo rbo1 = this.al;
                    android.app.Activity activity0 = ((Activity)this.getContext()).getContainerActivity();
                    int v3 = arrayList1 == null || arrayList1.isEmpty() ? 0 : 1;
                    int v4 = arrayList0 == null || arrayList0.isEmpty() ? 0 : 1;
                    if(v3 == 0 && v4 == 0) {
                        throw new IllegalArgumentException("Details of the products must be provided.");
                    }
                    if(v3 != 0 && v4 != 0) {
                        throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
                    }
                    if(v3 == 0) {
                        v7 = 0;
                        v10 = v4;
                        for(Object object0: arrayList0) {
                            if(((rcf)object0) == null) {
                                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                            }
                        }
                    }
                    else {
                        if(arrayList1.contains(null)) {
                            throw new IllegalArgumentException("SKU cannot be null.");
                        }
                        if(arrayList1.size() > 1) {
                            SkuDetails skuDetails1 = (SkuDetails)arrayList1.get(0);
                            String s5 = skuDetails1.d();
                            int v5 = arrayList1.size();
                            int v6 = 0;
                            while(v6 < v5) {
                                SkuDetails skuDetails2 = (SkuDetails)arrayList1.get(v6);
                                if(!s5.equals("play_pass_subs") && !skuDetails2.d().equals("play_pass_subs") && !s5.equals(skuDetails2.d())) {
                                    throw new IllegalArgumentException("SKUs should have the same type.");
                                }
                                ++v6;
                                v3 = v3;
                            }
                            v7 = v3;
                            String s6 = skuDetails1.a();
                            int v8 = arrayList1.size();
                            int v9 = 0;
                            while(v9 < v8) {
                                SkuDetails skuDetails3 = (SkuDetails)arrayList1.get(v9);
                                if(!s5.equals("play_pass_subs") && !skuDetails3.d().equals("play_pass_subs") && !s6.equals(skuDetails3.a())) {
                                    throw new IllegalArgumentException("All SKUs must have the same package name.");
                                }
                                ++v9;
                                v4 = v4;
                            }
                        }
                        else {
                            v7 = v3;
                        }
                        v10 = v4;
                    }
                    rci rci0 = new rci();
                    if(v7 != 0 && !((SkuDetails)arrayList1.get(0)).a().isEmpty()) {
                        z2 = true;
                    }
                    else if(v10 == 0 || ((rcf)arrayList0.get(0)).a.b().isEmpty()) {
                        z2 = false;
                    }
                    else {
                        z2 = true;
                    }
                    rci0.a = z2;
                    rci0.c = rcg.a(s4, z, v2);
                    rci0.e = arrayList1 == null ? new ArrayList() : new ArrayList(arrayList1);
                    rci0.f = z1;
                    rci0.b = s1;
                    rci0.d = arrayList0 == null ? ggna.a : gged_interceptors.i(arrayList0);
                    rbo1.c(activity0, rci0);
                    return;
                }
                this.al.f();
                this.am = false;
                this.al = null;
                this.startActivityForResult(fbeh.a(this.an), 0x3F0);
                return;
            }
            Log.e("PageFragment", "Play Billing not connected.");
            this.bO(-1);
            return;
        }
        Log.e("PageFragment", String.format("Play Billing is not set up correctly, getting result: %s.", v));
        fbzu fbzu0 = WalletExitResult.b();
        fbzu0.c(1);
        fbzu0.d(403);
        fbzu0.a(-1);
        fbzu0.e(rcm0.a);
        this.bP(fbzu0.a);
    }

    public final gdak bA(fbze fbze0, MessageLite hfvm0, int v, int v1) {
        gdak gdak1;
        boolean z = this.bE(14, fcca.class).isEmpty();
        gcjn gcjn0 = this.cb;
        fm fm0 = this.getChildFragmentManager();
        LogContext logContext0 = this.cM();
        String s = this.aL;
        boolean z1 = fbze0.a();
        gklu gklu0 = this.ai();
        int v2 = this.bU;
        BuyFlowConfig buyFlowConfig0 = this.aK;
        gdak gdak0 = (gdak)fm0.g(v1);
        if(!fbze0.a && gdak0 != null) {
            gdak0.cb = gcjn0;
        }
        else {
            if((hfvm0 instanceof geyz)) {
                gdak1 = fcbx.Q(((geyz)hfvm0), v2, s, logContext0, buyFlowConfig0);
            }
            else {
                if((hfvm0 instanceof gewu)) {
                    gewu gewu0 = (gewu)hfvm0;
                    if(fcab.ac(gewu0)) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gewu0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)gewu0));
                        gewu0 = (gewu)((ProtoLiteBuilder)(((gews)hftp0))).N_build();
                    }
                    gdak1 = fcab.J(gewu0, v2, false, s, z1, logContext0, buyFlowConfig0);
                    goto label_92;
                }
                if((hfvm0 instanceof gfhh)) {
                    batl.v(((gfhh)hfvm0).e.size(), "At least one option must be provided.");
                    gdak1 = new fcbc();
                    Bundle bundle0 = fcbc.al(v2, ((MessageLite)(((gfhh)hfvm0))), logContext0);
                    bundle0.putString("analyticsId", s);
                    gdak1.setArguments(bundle0);
                    goto label_92;
                }
                if((hfvm0 instanceof gfdn)) {
                    gdak1 = fccs.Q(((gfdn)hfvm0), v2, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof gfcg)) {
                    gdak1 = new fcca();
                    Bundle bundle1 = fcca.al(v2, ((MessageLite)(((gfcg)hfvm0))), logContext0);
                    bundle1.putBoolean("isTopContainer", z);
                    gdak1.setArguments(bundle1);
                    goto label_92;
                }
                if((hfvm0 instanceof gexg)) {
                    gdak1 = new fcak();
                    gdak1.setArguments(fcak.al(v2, ((MessageLite)(((gexg)hfvm0))), logContext0));
                    goto label_92;
                }
                if((hfvm0 instanceof gexj)) {
                    gdak1 = fcan.G(((gexj)hfvm0), v2, s, gklu0, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof getu)) {
                    gdak1 = fcad.G(((getu)hfvm0), buyFlowConfig0.b.b, v2, s, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof gexm)) {
                    gdak1 = fcap.N(((gexm)hfvm0), v2, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof gfbt)) {
                    gdak1 = fcbz.Q(((gfbt)hfvm0), v2, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof gfbr)) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfbt.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((gfbr)hfvm0).getClass();
                    ((gfbt)hftv0).c = (gfbr)hfvm0;
                    ((gfbt)hftv0).b |= 1;
                    long v3 = ((gfbr)hfvm0).c;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gfbt gfbt0 = (gfbt)hftp1.b_message;
                    gfbt0.b |= 2;
                    gfbt0.e = v3;
                    gdak1 = fcbz.Q(((gfbt)hftp1.N_build()), v2, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof geus)) {
                    gdak1 = fbyx.z(((geus)hfvm0), v2, logContext0, buyFlowConfig0);
                    goto label_92;
                }
                if((hfvm0 instanceof geye)) {
                    gdak1 = gcil.a(((geye)hfvm0), v2, logContext0);
                    goto label_92;
                }
                if((hfvm0 instanceof hcfj)) {
                    gdak1 = new fccj();
                    Bundle bundle2 = fccj.al(v2, ((MessageLite)(((hcfj)hfvm0))), logContext0);
                    bundle2.putString("analyticsId", s);
                    gdak1.setArguments(bundle2);
                    goto label_92;
                }
                if((hfvm0 instanceof gexr)) {
                    gdak1 = new fcat();
                    Bundle bundle3 = fcat.al(v2, ((MessageLite)(((gexr)hfvm0))), logContext0);
                    bundle3.putString("flowAnalyticsId", s);
                    gdak1.setArguments(bundle3);
                    goto label_92;
                }
                if(!(hfvm0 instanceof gewc)) {
                    throw new IllegalArgumentException("Unknown component type");
                }
                gdak1 = fcct.Q(((gewc)hfvm0), v2, s, logContext0);
            }
        label_92:
            gdak0 = gdak1;
            gdak0.cb = gcjn0;
            ca ca0 = new ca(fm0);
            ca0.G(v1, gdak0);
            ca0.a();
        }
        SparseArray sparseArray0 = this.ak;
        ArrayList arrayList0 = (ArrayList)sparseArray0.get(v);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            sparseArray0.put(v, arrayList0);
        }
        arrayList0.add(gdak0);
        String s1 = this.aL;
        OrchestrationViewEvent.d(this.getContext(), s1, gdak0.B());
        gczs gczs0 = new gczs(gdak0);
        this.bR.add(gczs0);
        this.bS.add(gdak0);
        return gdak0;
    }

    public final gdak bB(int v, Class class0) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = (ArrayList)this.ak.get(v, arrayList0);
        if(arrayList1.size() <= 1) {
            return arrayList1.size() == 1 ? ((gdak)class0.cast(arrayList1.get(0))) : null;
        }
        gcfz.c(this.cM(), "PF-11");
        throw new IllegalStateException(String.format(Locale.US, "Only single form fragment is expected of type %d", v));
    }

    @Override  // gdcm
    public final gdcl bC() {
        gdcl gdcl0 = super.bC();
        gdcl0.a = this.cb;
        gdcl0.f = this.aL;
        return gdcl0;
    }

    public final Object bD(Bundle bundle0, byte[] arr_b, List list0) {
        if(this.bs != null && !TextUtils.isEmpty(this.bs.c)) {
            if(bundle0 == null || bundle0 == Bundle.EMPTY) {
                bundle0 = new Bundle();
            }
            gchj gchj0 = this.bs;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfgg.a).v_newBuilder();
            String s = gchj0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfgg gfgg0 = (gfgg)hftp0.b_message;
            s.getClass();
            gfgg0.b |= 1;
            gfgg0.c = s;
            gciq.j(bundle0, "pageDroidGuardFormValue", ((MessageLite)(((gfgg)hftp0.N_build()))));
        }
        return this.H(bundle0, arr_b, list0);
    }

    public final ArrayList bE(int v, Class class0) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = (ArrayList)this.ak.get(v, arrayList0);
        ArrayList arrayList2 = new ArrayList(arrayList1.size());
        int v1 = arrayList1.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            arrayList2.add(((gdak)class0.cast(arrayList1.get(v2))));
        }
        return arrayList2;
    }

    protected final void bF(hcfk hcfk0) {
        if(hcfk0 != null) {
            this.bT.h(hcfk0.c, hcfk0);
        }
    }

    protected final void bG(long v, int v1, int v2) {
        this.bb.h(v, Integer.valueOf(v1));
        this.bc.h(v, Integer.valueOf(v2));
    }

    protected final void bH(fbze fbze0, long v) {
        int v1 = (int)(((Integer)this.bb.d(v)));
        int v2 = this.bd.a();
        fbze0.c.setId(v2);
        MessageLite hfvm0 = this.al(v);
        if((hfvm0 instanceof getu)) {
            hfvm0 = fbgn.r(this.getContext(), ((getu)hfvm0));
            if(hfvm0 != null) {
                goto label_7;
            }
        }
        else {
        label_7:
            gdak gdak0 = this.bA(fbze0, hfvm0, v1, v2);
            boolean z = fbze0.a();
            if(z) {
                fbze0.d.a.d(gdak0);
                gczs gczs0 = new gczs(gdak0);
                fbze0.d.d(gczs0);
                fbze0.d.h();
            }
            else if(gdak0.mb() != null) {
                fbze0.e.d(gdak0);
            }
            gdak0.aC = false;
            if((gdak0 instanceof fcbc) && z) {
                ((fcbc)gdak0).aj = true;
            }
        }
    }

    protected final void bI(fbze fbze0, long v) {
        gfep gfep0;
        for(Object object0: fbze0.b.o) {
            gfep0 = (gfep)object0;
            if(gfep0.f != v) {
                continue;
            }
            goto label_7;
        }
        gfep0 = null;
    label_7:
        if(gfep0 != null) {
            fbzd fbzd0 = new fbzd(fbze0);
            fbzd0.a = gfep0;
            this.aZ(fbzd0.a());
            return;
        }
        this.bf(fbze0, ((Integer)this.bb.d(v)).intValue(), v);
    }

    final void bJ(boolean z) {
        if(z) {
            this.cb = null;
            this.c.clear();
            this.bg.clear();
            this.ah.clear();
            this.d.clear();
            this.ag.clear();
        }
        if(this.C() == null) {
            return;
        }
        gcjn gcjn0 = this.cb;
        if(gcjn0 == null) {
            this.cb = new gcjn(this.C());
            gcjn0 = this.cb;
            gcjn0.i = this;
        }
        gcjn0.e(true);
    }

    protected final void bK(fbze fbze0, long v) {
        int v1 = (int)(((Integer)this.bb.d(v)));
        FrameLayout frameLayout0 = new FrameLayout(this.bV);
        fbze0.c.addView(frameLayout0);
        if(fbze0.b() && (v1 != 9 && v1 != 13 && v1 != 14 && v1 != 22 && v1 != 37)) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)frameLayout0.getLayoutParams();
            viewGroup$MarginLayoutParams0.setMarginStart(this.be);
            viewGroup$MarginLayoutParams0.setMarginEnd(this.be);
        }
        fbzd fbzd0 = new fbzd(fbze0);
        fbzd0.b(frameLayout0);
        this.bH(fbzd0.a(), v);
    }

    protected final void bL(gfgr gfgr0, ViewGroup viewGroup0, boolean z) {
        int v = z ? this.be : 0;
        gcqu gcqu0 = this.cN();
        InfoMessageView infoMessageView0 = fbey.a(this.cb, gfgr0, this.bW, gcqu0, this, viewGroup0, v, v, this.bd.a());
        gczs gczs0 = new gczs(gfgr0.c, infoMessageView0, null);
        this.bR.add(gczs0);
        this.bF.add(infoMessageView0);
    }

    protected final void bM(List list0, ViewGroup viewGroup0, boolean z) {
        this.aj = viewGroup0;
        for(Object object0: list0) {
            this.bb(new fbze(z, ((gfep)object0), viewGroup0, null, this.aP));
        }
        if(viewGroup0.getChildCount() > 0) {
            if(this.bp == -1) {
                this.bp = viewGroup0.getPaddingTop();
            }
            if(this.bq == -1) {
                this.bq = viewGroup0.getPaddingBottom();
            }
            int v = (int)this.getResources().getDimension(0x7F071470);  // dimen:wallet_card_view_page_margin_half
            int v1 = fbzp.aA(viewGroup0.getChildAt(0)) ? v : 0;
            if(!fbzp.aA(viewGroup0.getChildAt(viewGroup0.getChildCount() - 1))) {
                v = 0;
            }
            viewGroup0.setPaddingRelative(viewGroup0.getPaddingStart(), v1 + this.bp, viewGroup0.getPaddingEnd(), v + this.bq);
        }
    }

    public final void bN(WalletExitResult walletExitResult0) {
        if(this.aV != null && !this.aX) {
            this.aX = true;
            if(this.co()) {
                this.aV.E(this.by.o, this.lc());
            }
            else {
                this.aV.A(walletExitResult0);
            }
        }
        rbo rbo0 = this.al;
        if(rbo0 != null) {
            rbo0.f();
            this.am = false;
            this.al = null;
        }
    }

    public final void bO(int v) {
        fbzn fbzn0 = this.aV;
        if(fbzn0 != null && !this.aX) {
            this.aX = true;
            fbzn0.B(v);
        }
        rbo rbo0 = this.al;
        if(rbo0 != null) {
            rbo0.f();
            this.am = false;
            this.al = null;
        }
    }

    protected final void bP(WalletExitResult walletExitResult0) {
        fbzn fbzn0 = this.aV;
        if(fbzn0 != null && !this.aX) {
            this.aX = true;
            fbzn0.C(walletExitResult0);
        }
        rbo rbo0 = this.al;
        if(rbo0 != null) {
            rbo0.f();
            this.am = false;
            this.al = null;
        }
    }

    public final void bQ() {
        fbzn fbzn0 = this.aV;
        if(fbzn0 != null && !this.aX) {
            this.aX = true;
            fbzn0.E(this.by.o, this.lc());
        }
        rbo rbo0 = this.al;
        if(rbo0 != null) {
            rbo0.f();
            this.am = false;
            this.al = null;
        }
    }

    protected final void bR() {
        gfdq gfdq0 = this.by.l;
        boolean z = true;
        if(gfdq0 == null) {
            this.bS.clear();
            this.bR.clear();
            this.bJ(this.aU == 1);
            this.b = true;
            if(this.aU != 1) {
                z = false;
            }
            this.L(z);
            this.b = false;
            if(this.cn()) {
                this.W(this.aU);
            }
        }
        else {
            this.ba = gfdq0.c;
            if(!this.bo && !this.lD()) {
                this.bo = true;
                this.aN();
            }
        }
    }

    public final void bS(int v) {
        this.cE(5, v, null, null, 1);
    }

    public final void bT(Object object0) {
        this.ll(false);
        if(this.bs != null && this.bs.e()) {
            gchj gchj0 = this.bs;
            gchj0.f = new gchi(gchj0);
            gchi gchi0 = gchj0.f;
            long v = (long)(((int)(((Integer)gcjh.y.a()))));
            gchj0.a.postDelayed(gchi0, v);
            return;
        }
        this.bv = true;
        this.cp(this.G(object0), 3);
        this.cC(3);
    }

    @Override  // gcyj
    public final void bU() {
        if(this.cb != null) {
            ArrayList arrayList0 = this.d;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                gcjm gcjm0 = (gcjm)arrayList0.get(v1);
                this.cb.c(gcjm0);
            }
        }
    }

    @Override  // gcjt
    public final void bV(Exception exception0) {
        if((exception0 instanceof UserRecoverableAuthException)) {
            this.ll(false);
            this.startActivityForResult(((UserRecoverableAuthException)exception0).a(), 1005);
            return;
        }
        if((exception0 instanceof acse)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)getj.a).v_newBuilder();
            geti geti0 = geti.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((getj)hftp0.b_message).f = geti0.i;
            ((getj)hftp0.b_message).b |= 8;
            String s = this.getString(0x7F153592);  // string:wallet_uic_download_failed_error_message "Unable to download file."
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            getj getj0 = (getj)hftp0.b_message;
            s.getClass();
            getj0.b |= 1;
            getj0.c = s;
            this.lF(((getj)hftp0.N_build()), false);
            return;
        }
        this.lB(this.getString(0x7F1535C9), this.getString(0x7F153592));  // string:wallet_uic_title_possibly_recoverable_error_dialog "Request Failed"
    }

    @Override  // fcay
    public final void bW(hcer hcer0) {
        ContextThemeWrapper contextThemeWrapper0 = this.bV;
        Intent intent0 = ((Activity)this.getContext()).getIntent();
        BuyFlowConfig buyFlowConfig0 = this.aK;
        gfet gfet0 = this.C();
        String s = this.aL;
        Intent intent1 = fcax.h(contextThemeWrapper0, intent0, this.cM());
        intent1.setAction("com.google.android.gms.wallet.firstparty.ACTION_FILTER_ACTIVITY");
        intent1.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        gciq.k(intent1, "filter", ((MessageLite)hcer0));
        gciq.k(intent1, "dependencyGraph", ((MessageLite)gfet0));
        intent1.putExtra("analyticsSessionId", s);
        this.startActivityForResult(intent1, 1006);
    }

    @Override  // gcyj
    public final void bX(boolean z) {
    }

    @Override  // gcyj
    public final void bY(int v) {
        fbgp fbgp0 = this.aO;
        if(fbgp0 != null) {
            fbgp0.R(v > 0);
        }
    }

    protected final void bZ() {
        byi byi0 = this.bT;
        int v = byi0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            gcjo.b(this, ((hcfk)byi0.f(v1)).c, this.cb);
        }
    }

    protected void bb(fbze fbze0) {
        boolean z;
        int v7;
        long v5;
        fbze fbze1 = fbze0;
        gfep gfep0 = fbze1.b;
        int v = gfep0.e;
        int v1 = 1;
        if(gfeo.a(v) == 2) {
            if(gfdv.a(gfep0.p) == 2) {
                LinearLayout linearLayout0 = new LinearLayout(this.bV);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout0.setBackgroundColor(this.getResources().getColor((gdcb.X(this.bV) ? 0x7F061318 : 0x7F061317)));  // color:wallet_page_error_background_light
                fbze1.c.addView(linearLayout0);
                fbzd fbzd0 = new fbzd(fbze1);
                fbzd0.b(linearLayout0);
                fbze1 = fbzd0.a();
            }
            for(Object object0: fbze1.b.j) {
                this.bI(fbze1, ((Long)object0).longValue());
            }
            return;
        }
        if(gfeo.a(v) != 6 && gfeo.a(v) != 9) {
            switch(gfeo.a(v)) {
                case 3: {
                    this.ar(fbze0);
                    return;
                }
                case 12: {
                    if(gfep0.c == 19) {
                        if(gfel.a(((gfem)gfep0.d).b) == 2) {
                            if(this.lg() == null) {
                                this.as(fbze1, String.format(Locale.US, "Sticky component group (%d) not supported by this widget", ((long)gfep0.f)));
                                return;
                            }
                            for(Object object1: gfep0.j) {
                                Long long0 = (Long)object1;
                                long v3 = (long)long0;
                                switch(((int)(((Integer)this.bb.d(v3))))) {
                                    case 7: 
                                    case 0x1F: {
                                        this.by(((gevs)this.al(v3)), this.lg(), false);
                                        continue;
                                    }
                                    default: {
                                        gcfz.c(this.cM(), "PF-44");
                                        throw new IllegalStateException(String.format(Locale.US, "Unsupported component (%d) in sticky component group (%d)", long0, ((long)gfep0.f)));
                                    }
                                }
                            }
                            return;
                        }
                        Locale locale1 = Locale.US;
                        Long long1 = (long)gfep0.f;
                        int v4 = gfel.a((gfep0.c == 19 ? ((gfem)gfep0.d) : gfem.a).b);
                        if(v4 != 0) {
                            v1 = v4;
                        }
                        this.as(fbze1, String.format(locale1, "Sticky component group (%d) with position %d is not supported", long1, ((int)(v1 - 1))));
                        return;
                    }
                    this.as(fbze1, String.format(Locale.US, "Sticky component group (%d) must specify sticky parameters", ((long)gfep0.f)));
                    return;
                }
                default: {
                    gcfz.c(this.cM(), "PF-41");
                    Locale locale0 = Locale.US;
                    int v2 = gfeo.a(gfep0.e);
                    if(v2 != 0) {
                        v1 = v2;
                    }
                    throw new IllegalStateException(String.format(locale0, "Component group UI type %s is not supported.", ((int)(v1 - 1))));
                }
            }
        }
        CardView cardView0 = (CardView)this.bW.inflate(0x7F0E0E17, fbze1.c, false);  // layout:wallet_view_card_view
        fbze1.c.addView(cardView0);
        CollapsibleCardContentsView collapsibleCardContentsView0 = (CollapsibleCardContentsView)cardView0.findViewById(0x7F0B0E07);  // id:card_content_holder
        collapsibleCardContentsView0.setId(this.bd.a());
        this.bK.add(collapsibleCardContentsView0);
        FrameLayout frameLayout0 = collapsibleCardContentsView0.e;
        if(gfep0.c == 16) {
            v5 = ((gfea)gfep0.d).d;
            if(v5 > 0L) {
                fbzd fbzd1 = new fbzd(fbze1);
                fbzd1.b(frameLayout0);
                this.bI(fbzd1.a(), (gfep0.c == 16 ? ((gfea)gfep0.d) : gfea.a).d);
                View view0 = frameLayout0.getChildAt(0);
                if((view0 instanceof CardHeaderView)) {
                    collapsibleCardContentsView0.g = (CardHeaderView)view0;
                }
            }
            else {
                goto label_70;
            }
        }
        else {
        label_70:
            v5 = -1L;
            if(!gfep0.g.isEmpty()) {
                String s = gfep0.g;
                LayoutInflater layoutInflater0 = this.bW;
                int v6 = this.bd.a();
                CardHeaderView cardHeaderView0 = (CardHeaderView)layoutInflater0.inflate(0x7F0E0E15, frameLayout0, false);  // layout:wallet_view_card_header
                cardHeaderView0.setId(v6);
                cardHeaderView0.b(s);
                frameLayout0.addView(cardHeaderView0);
                this.bI.add(cardHeaderView0);
                collapsibleCardContentsView0.g = (CardHeaderView)frameLayout0.getChildAt(0);
            }
        }
        if(gfep0.c == 16) {
            gfea gfea0 = (gfea)gfep0.d;
            collapsibleCardContentsView0.a = (Activity)this.getContext();
            if(gfea0 == null) {
                v7 = 5;
                collapsibleCardContentsView0.h = 5;
            }
            else {
                v7 = gfdz.a(gfea0.b) == 0 ? 1 : gfdz.a(gfea0.b);
                collapsibleCardContentsView0.h = v7;
            }
            switch(v7 - 1) {
                case 2: {
                    collapsibleCardContentsView0.e.setVisibility(8);
                    collapsibleCardContentsView0.f.setVisibility(0);
                    break;
                }
                case 1: 
                case 3: {
                    collapsibleCardContentsView0.d = gfea0.c ^ 1;
                    CardHeaderView cardHeaderView1 = collapsibleCardContentsView0.g;
                    if(cardHeaderView1 != null) {
                        switch(gfdz.a(gfea0.b)) {
                            case 0: {
                                z = false;
                                break;
                            }
                            case 4: {
                                z = true;
                                break;
                            }
                            default: {
                                z = false;
                            }
                        }
                        cardHeaderView1.i = z;
                        if(z && cardHeaderView1.f == null) {
                            cardHeaderView1.f = new TransitionDrawable(new Drawable[]{gdcb.n(cardHeaderView1.getContext(), 0x7F040DEB), gdcb.n(cardHeaderView1.getContext(), 0x7F040489)});  // attr:uicExpandDrawable
                            cardHeaderView1.f.setCrossFadeEnabled(true);
                            cardHeaderView1.e.setImageDrawable(cardHeaderView1.f);
                        }
                        cardHeaderView1.c(false);
                        collapsibleCardContentsView0.g.setFocusableInTouchMode(true);
                    }
                    collapsibleCardContentsView0.a(false);
                    collapsibleCardContentsView0.e.setOnClickListener(collapsibleCardContentsView0);
                    break;
                }
                case 4: {
                    collapsibleCardContentsView0.e.setVisibility(0);
                    collapsibleCardContentsView0.f.setVisibility(0);
                    break;
                }
                default: {
                    Locale locale2 = Locale.US;
                    int v8 = gfdz.a(gfea0.b);
                    if(v8 != 0) {
                        v1 = v8;
                    }
                    throw new IllegalArgumentException(String.format(locale2, "Unknown cardStyle: %d", ((int)(v1 - 1))));
                }
            }
        }
        LinearLayout linearLayout1 = collapsibleCardContentsView0.f;
        fbzd fbzd2 = new fbzd(fbze1);
        fbzd2.b(linearLayout1);
        fbze fbze2 = fbzd2.a();
        for(Object object2: gfep0.j) {
            long v9 = (long)(((Long)object2));
            if(v9 != v5) {
                this.bI(fbze2, v9);
            }
        }
    }

    protected void bc() {
        this.ll(true);
    }

    @Override  // gcyg
    protected void be(Bundle bundle0) {
        this.bJ(true);
        if(bundle0 == null) {
            gdcb.C(this);
        }
        gczm gczm0 = (gczm)this.getFragmentManager().h("PageFragment.ErrorDialog");
        this.aI = gczm0;
        if(gczm0 != null) {
            gczm0.ag = this;
        }
        this.bt = new gcju(this.getContext().getApplicationContext(), this.getLoaderManager(), this.oc(), fbya.d(this.cK()), this);
    }

    protected void bf(fbze fbze0, int v, long v1) {
        String s = null;
        int v2 = 0;
        switch(v) {
            case 0: {
                this.bL(((gfgr)this.al(v1)), fbze0.c, fbze0.b());
                return;
            }
            case 11: {
                gfgo gfgo0 = (gfgo)this.al(v1);
                ContextThemeWrapper contextThemeWrapper0 = this.bV;
                int v3 = this.bd.a();
                ImageWithCaptionView imageWithCaptionView0 = ImageWithCaptionView.k(gfgo0, contextThemeWrapper0, fbze0.c, v3, this.bf, 0, this.cM());
                fbze0.c.addView(imageWithCaptionView0);
                this.bH.add(imageWithCaptionView0);
                return;
            }
            case 16: {
                View view0 = this.bW.inflate(0x7F0E0E66, fbze0.c, false);  // layout:wallet_view_separator
                fbze0.c.addView(view0);
                this.bD.add(view0);
                gcjo.b(new gcjq(view0), ((gfhj)this.al(v1)).b, this.cb);
                return;
            }
            case 17: {
                gfbr gfbr0 = (gfbr)this.al(v1);
                ViewGroup viewGroup0 = fbze0.c;
                if(fbze0.b()) {
                    v2 = this.be;
                }
                gcjn gcjn0 = this.cb;
                LayoutInflater layoutInflater0 = this.bW;
                gcqu gcqu0 = this.cN();
                int v4 = this.bd.a();
                LegalMessageView legalMessageView0 = new LegalMessageView(layoutInflater0.getContext());
                legalMessageView0.setId(v4);
                legalMessageView0.o(gfbr0);
                legalMessageView0.h(gcqu0);
                legalMessageView0.f(this);
                viewGroup0.addView(legalMessageView0);
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)legalMessageView0.getLayoutParams();
                viewGroup$MarginLayoutParams0.setMarginStart(v2);
                viewGroup$MarginLayoutParams0.setMarginEnd(v2);
                legalMessageView0.setLayoutParams(viewGroup$MarginLayoutParams0);
                legalMessageView0.d(layoutInflater0.getContext().getResources().getDimensionPixelSize(0x7F0715A6));  // dimen:wallet_uic_page_left_column_width
                gcjo.b(legalMessageView0, gfbr0.c, gcjn0);
                gczs gczs0 = new gczs(gfbr0.c, legalMessageView0, null);
                this.bR.add(gczs0);
                this.bE.add(legalMessageView0);
                return;
            }
            case 25: {
                gexi gexi0 = (gexi)this.al(v1);
                ViewGroup viewGroup1 = fbze0.c;
                gcqy gcqy0 = this.bd;
                CardHeaderView cardHeaderView0 = (CardHeaderView)this.bW.inflate(0x7F0E0E15, viewGroup1, false);  // layout:wallet_view_card_header
                cardHeaderView0.setId(gcqy0.a());
                cardHeaderView0.j = gexi0;
                cardHeaderView0.k = this;
                cardHeaderView0.l = String.format("Collapse %1$s", cardHeaderView0.j.h);
                gexi gexi1 = cardHeaderView0.j;
                cardHeaderView0.m = String.format("Expand %1$s", (gexi1.c == 2 ? ((String)gexi1.d) : ""));
                if((16 & gexi1.b) == 0) {
                    cardHeaderView0.g.setVisibility(8);
                }
                else {
                    cardHeaderView0.g.setVisibility(0);
                    gfhs gfhs0 = cardHeaderView0.j.j == null ? gfhs.a : cardHeaderView0.j.j;
                    cardHeaderView0.g.o((gfhs0.c == null ? gfgo.a : gfhs0.c), fbgn.o(cardHeaderView0.getContext()));
                }
                int v5 = cardHeaderView0.getContext().getResources().getDimensionPixelOffset(0x7F071467);  // dimen:wallet_card_header_image_start_margin
                for(Object object0: gexi0.g) {
                    ImageWithCaptionView imageWithCaptionView1 = ImageWithCaptionView.k(((gfgo)object0), cardHeaderView0.getContext(), cardHeaderView0.d, gcqy0.a(), 0, 0, null);
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageWithCaptionView1.getLayoutParams();
                    if((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginStart(v5);
                        imageWithCaptionView1.setLayoutParams(viewGroup$LayoutParams0);
                    }
                    cardHeaderView0.d.addView(imageWithCaptionView1);
                }
                for(Object object1: gexi0.k) {
                    ImageWithCaptionView imageWithCaptionView2 = ImageWithCaptionView.k(((gfgo)object1), cardHeaderView0.getContext(), cardHeaderView0.c, gcqy0.a(), 0, 0, null);
                    ViewGroup.LayoutParams viewGroup$LayoutParams1 = imageWithCaptionView2.getLayoutParams();
                    if((viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams)) {
                        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).setMarginStart(v5);
                        imageWithCaptionView2.setLayoutParams(viewGroup$LayoutParams1);
                    }
                    cardHeaderView0.c.addView(imageWithCaptionView2);
                }
                cardHeaderView0.d(false);
                viewGroup1.addView(cardHeaderView0);
                this.bI.add(cardHeaderView0);
                return;
            }
            case 26: {
                gexf gexf0 = (gexf)this.al(v1);
                ViewGroup viewGroup2 = fbze0.c;
                LayoutInflater layoutInflater1 = this.bW;
                gcqy gcqy1 = this.bd;
                CardActionBarView cardActionBarView0 = (CardActionBarView)layoutInflater1.inflate(0x7F0E0E12, viewGroup2, false);  // layout:wallet_view_card_action_bar
                cardActionBarView0.setId(gcqy1.a());
                for(Object object2: gexf0.c) {
                    hcei hcei0 = (hcei)object2;
                    if(hceh.a(hcei0.g) == 0 || hceh.a(hcei0.g) == 1) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcei0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)hcei0));
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hcei)hftp0.b_message).g = 3;
                        ((hcei)hftp0.b_message).b |= 16;
                        hcei0 = (hcei)hftp0.N_build();
                    }
                    LinkView linkView0 = LinkView.c(hcei0, cardActionBarView0.getContext(), cardActionBarView0.a, layoutInflater1, gcqy1, this);
                    cardActionBarView0.a.addView(linkView0);
                    this = this;
                }
                viewGroup2.addView(cardActionBarView0);
                this.bJ.add(cardActionBarView0);
                return;
            }
            case 27: {
                geyc geyc0 = (geyc)this.al(v1);
                ViewGroup viewGroup3 = fbze0.c;
                LayoutInflater layoutInflater2 = this.bW;
                gcqy gcqy2 = this.bd;
                InstrumentDetailsView instrumentDetailsView0 = (InstrumentDetailsView)layoutInflater2.inflate(0x7F0E0E2E, viewGroup3, false);  // layout:wallet_view_elp_instrument_details
                instrumentDetailsView0.setId(gcqy2.a());
                if((geyc0.b & 2) == 0) {
                    instrumentDetailsView0.a.setVisibility(8);
                }
                else {
                    instrumentDetailsView0.a.o((geyc0.d == null ? gfgo.a : geyc0.d), fbgn.o(instrumentDetailsView0.getContext()));
                }
                TextView textView0 = instrumentDetailsView0.b;
                if((geyc0.b & 8) != 0) {
                    s = geyc0.e;
                }
                gdcb.E(textView0, s);
                int v6 = instrumentDetailsView0.b.getId();
                if(geyc0.f.size() != 0) {
                    for(Object object3: geyc0.f) {
                        InfoMessageView infoMessageView0 = (InfoMessageView)layoutInflater2.inflate(0x7F0E0C4A, instrumentDetailsView0, false);  // layout:view_info_message_text_basic
                        infoMessageView0.p(((gfgr)object3));
                        instrumentDetailsView0.a(infoMessageView0, v6);
                        v6 = gcqy2.a();
                        infoMessageView0.setId(v6);
                        instrumentDetailsView0.addView(infoMessageView0);
                    }
                }
                if((geyc0.b & 0x40) != 0) {
                    for(Object object4: (geyc0.i == null ? hcej.a : geyc0.i).c) {
                        hceo hceo0 = (hceo)object4;
                        if((hceo0.b & 8) != 0) {
                            TextView textView1 = new TextView(instrumentDetailsView0.getContext());
                            textView1.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                            textView1.setText((hceo0.d == null ? hcep.a : hceo0.d).d);
                            textView1.setTextColor(gdcb.i(instrumentDetailsView0.getContext(), 0x7F040E49));  // attr:walletCardViewPageErrorColor
                            instrumentDetailsView0.a(textView1, v6);
                            v6 = gcqy2.a();
                            textView1.setId(v6);
                            instrumentDetailsView0.addView(textView1);
                        }
                    }
                }
                viewGroup3.addView(instrumentDetailsView0);
                this.bM.add(instrumentDetailsView0);
                return;
            }
            case 6: 
            case 28: {
                this.bK(fbze0, v1);
                return;
            }
            case 30: {
                fbzw fbzw0 = new fbzw(((gevv)this.al(v1)), this.bC());
                fbzw0.c(this.cb);
                this.bN.add(fbzw0);
                return;
            }
            case 33: {
                hcer hcer0 = (hcer)this.al(v1);
                ViewGroup viewGroup4 = fbze0.c;
                LayoutInflater layoutInflater3 = this.bW;
                gdcl gdcl0 = this.bC();
                gcjn gcjn1 = this.cb;
                FilterView filterView0 = (FilterView)layoutInflater3.inflate(0x7F0E0E34, viewGroup4, false);  // layout:wallet_view_filter
                filterView0.c = hcer0;
                filterView0.e = gdcl0;
                filterView0.f = this;
                filterView0.d = new fcaw(gdcl0);
                LayoutInflater layoutInflater4 = LayoutInflater.from(filterView0.getContext());
                for(Object object5: hcer0.c) {
                    hces hces0 = (hces)object5;
                    if(!hces0.f.isEmpty()) {
                        FilterCategoryChipButton filterCategoryChipButton0 = (FilterCategoryChipButton)layoutInflater4.inflate(0x7F0E0E35, filterView0, false);  // layout:wallet_view_filter_category
                        filterCategoryChipButton0.d = filterView0.e.a;
                        filterCategoryChipButton0.c = hces0;
                        filterCategoryChipButton0.e = filterView0.d;
                        filterCategoryChipButton0.a.setText((hces0.f.isEmpty() ? hces0.e : String.format("%1$s: %2$s", hces0.e, hces0.f)));
                        if(hces0.i) {
                            filterCategoryChipButton0.b.setVisibility(0);
                            filterCategoryChipButton0.b.setContentDescription(hces0.c);
                            gcjo.b(filterCategoryChipButton0.b, hces0.b, filterCategoryChipButton0.d);
                            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)filterCategoryChipButton0.a.getLayoutParams();
                            linearLayout$LayoutParams0.setMarginEnd(0);
                            filterCategoryChipButton0.a.setLayoutParams(linearLayout$LayoutParams0);
                        }
                        ColorStateList colorStateList0 = gdcb.i(filterCategoryChipButton0.getContext(), 0x7F040DDC);  // attr:uicColorMaterialAccent
                        Drawable drawable0 = filterCategoryChipButton0.getBackground().mutate();
                        drawable0.setTintList(colorStateList0);
                        filterCategoryChipButton0.setBackground(drawable0);
                        filterView0.addView(filterCategoryChipButton0);
                    }
                }
                if(!hcer0.d.isEmpty()) {
                    filterView0.b = (ManageFiltersChipButton)layoutInflater4.inflate(0x7F0E0E4A, filterView0, false);  // layout:wallet_view_manage_filters
                    filterView0.b.setText(hcer0.d);
                    filterView0.b.setOnClickListener(filterView0);
                    filterView0.addView(filterView0.b);
                }
                filterView0.d.c();
                gcjo.b(filterView0, hcer0.b, gcjn1);
                viewGroup4.addView(filterView0);
                this.bP = filterView0;
                gczs gczs1 = new gczs(hcer0.b, this.bP, null);
                this.bR.add(gczs1);
                return;
            }
            case 7: 
            case 0x1F: 
            case 38: {
                this.by(((gevs)this.al(v1)), fbze0.c, true);
                return;
            }
            case 39: {
                fbzz fbzz0 = new fbzz(((gevx)this.al(v1)), this.bC());
                gcjn gcjn2 = this.cb;
                fbzz0.g = gcjn2;
                gcjo.b(fbzz0, fbzz0.a.b, gcjn2);
                du du0 = fbzz0.f.h(fbzz0.a());
                if((du0 instanceof fcaa)) {
                    fbzz0.b = (fcaa)du0;
                    fbzz0.b.ag = gcjn2;
                }
                this.bO.add(fbzz0);
                return;
            }
            default: {
                gcfz.c(this.cM(), "PF-43");
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown component type: %d", v));
            }
        }
    }

    public void bg(PageDetails pageDetails0, boolean z, String s) {
        rbo rbo0;
        switch(pageDetails0.c.ordinal()) {
            case 2: {
                if(this.bx == null) {
                    Log.e("PageFragment", "No mActivePage for continue with current page instruction.");
                    this.bO(-1);
                    return;
                }
                this.cf(pageDetails0, true);
                this.W(0);
                this.bc();
                return;
            }
            case 3: 
            case 4: {
                this.ll(false);
                this.cf(pageDetails0, false);
                Intent intent0 = fbgn.h((pageDetails0.g.b == null ? hcfx.a : pageDetails0.g.b), ((Activity)this.getContext()).getIntent(), this.bV, this.aK);
                if(pageDetails0.c == hcdu.d) {
                    this.startActivityForResult(intent0, 1002);
                    return;
                }
                this.startActivityForResult(intent0, 1007);
                return;
            }
            case 6: {
                this.cB(11);
                return;
            }
            case 1: 
            case 7: 
            case 8: 
            case 9: {
                if(pageDetails0.i == null) {
                    Log.e("PageFragment", "No page proto provided for flow instruction: " + pageDetails0.c.w);
                    this.bO(-1);
                    return;
                }
                this.at(pageDetails0);
                return;
            }
            case 10: {
                if(pageDetails0.q == null) {
                    Log.e("PageFragment", "No error provided for HANDLE_UI_ERROR instruction.");
                    this.bO(-1);
                    return;
                }
                this.cf(pageDetails0, true);
                this.ll(true);
                this.lF(pageDetails0.q, z);
                return;
            }
            case 12: {
                if(pageDetails0.j == null) {
                    Log.e("PageFragment", "No basePage proto provided for flow instruction: " + pageDetails0.c.w);
                    this.bO(-1);
                    return;
                }
                if(pageDetails0.i == null) {
                    Log.e("PageFragment", "No overlay proto provided for flow instruction: " + pageDetails0.c.w);
                    this.bO(-1);
                    return;
                }
                if(!this.aa(this.af(pageDetails0))) {
                    pageDetails0.i = pageDetails0.j;
                    this.at(pageDetails0);
                    return;
                }
                gcfz.c(this.cM(), "PF-10");
                throw new IllegalArgumentException("Overlay can not be displayed inline if the flow_instruction is CONTINUE_FLOW_WITH_NEW_PAGE_IN_OVERLAY_AND_UPDATE_BASE_PAGE");
            }
            case 11: 
            case 14: {
                if(pageDetails0.i == null) {
                    Log.e("PageFragment", "No overlayProto provided for flow instruction: " + pageDetails0.c.w);
                    this.bO(-1);
                    return;
                }
                if(!this.aa(pageDetails0)) {
                    return;
                }
                this.cf(pageDetails0, true);
                this.ll(true);
                return;
            }
            case 5: 
            case 13: 
            case 15: {
                this.cf(pageDetails0, false);
                this.bQ();
                return;
            }
            case 16: {
                this.aU = 2;
                if(this.ay()) {
                    this.bB = pageDetails0.i;
                    ozo ozo0 = this.br;
                    ozo0.b = new fbzo(this);
                    this.bw().f(this.br, this.ac());
                    this.bw().g(this.br);
                }
                else {
                    this.lm(pageDetails0.i);
                }
                if(!this.cn()) {
                    return;
                }
                this.W(this.aU);
                return;
            }
            case 17: {
                hcft hcft0 = pageDetails0.k;
                if((hcft0.b & 4) != 0) {
                    this.an = hcft0;
                    if(this.al == null && !this.am) {
                        rbn rbn0 = new rbn(((Activity)this.getContext()).getContainerActivity());
                        rbn0.d = this;
                        rbn0.b = new rct();
                        rbn0.a = (this.an.e == null ? hcfm.a : this.an.e).c;
                        Context context0 = rbn0.c;
                        if(context0 == null) {
                            throw new IllegalArgumentException("Please provide a valid Context.");
                        }
                        if(rbn0.d == null) {
                            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                        }
                        if(rbn0.b == null) {
                            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                        }
                        if(rbn0.d == null) {
                            String s2 = rbn0.a;
                            rct rct1 = rbn0.b;
                            rbo0 = rbn0.a() ? new rcd(s2, rct1, context0, rbn0) : new rbo(s2, rct1, context0, rbn0);
                        }
                        else {
                            String s1 = rbn0.a;
                            rct rct0 = rbn0.b;
                            rdd rdd0 = rbn0.d;
                            rbo0 = rbn0.a() ? new rcd(s1, rct0, context0, rdd0, rbn0) : new rbo(s1, rct0, context0, rdd0, rbn0);
                        }
                        this.al = rbo0;
                    }
                    if(!this.am) {
                        this.al.k(this);
                        return;
                    }
                    return;
                }
                this.startActivityForResult(fbeh.a(hcft0), 0x3F0);
                return;
            }
            case 18: {
                this.cf(pageDetails0, true);
                this.aK();
                return;
            }
            case 19: {
                this.at(pageDetails0);
                this.aK();
                return;
            }
            case 20: {
                this.cf(pageDetails0, false);
                this.aV.D(pageDetails0.r);
                return;
            }
            default: {
                Log.e("PageFragment", String.format(Locale.US, "Unexpected flow instruction provided: %s", ((int)pageDetails0.c.w)));
                this.bO(-1);
            }
        }
    }

    protected boolean bo(boolean z, boolean z1) {
        return z && z1;
    }

    @Override  // gcyo
    public final long br(hcds hcds0) {
        Integer integer0 = (Integer)this.bh.get(hcds0);
        if(integer0 == null) {
            integer0 = (int)1;
        }
        this.bh.put(hcds0, Integer.valueOf(((int)integer0) + 1));
        return -gcgh.a(hcds0, integer0.intValue());
    }

    @Override  // gdbw
    public final long bs() {
        return 0L;
    }

    public final Handler bt() {
        if(this.aT == null) {
            this.aT = new clht();
        }
        return this.aT;
    }

    @Override  // gciy
    public final SmsManager bu() {
        return bbhx.a(this.getContext());
    }

    @Override  // gdcm
    protected final View bv(Bundle bundle0, View view0) {
        super.bv(bundle0, view0);
        if(bundle0 != null) {
            fbgo fbgo0 = this.aN;
            if(fbgo0 != null) {
                fbgo0.x(bundle0);
            }
        }
        if(this.bx != null && this.aU == 0) {
            this.bR();
        }
        return view0;
    }

    protected final pao bw() {
        if(this.ai == null) {
            View view0 = ((Activity)this.getContext()).findViewById(0x1020002);
            if(view0 != null) {
                this.ai = new pao();
                this.br = new ozo(((ViewGroup)view0));
            }
        }
        return this.ai;
    }

    public final fbfn bx() {
        if(this.aH == null) {
            this.aH = (fbfn)((xob)this.getContext()).getSupportFragmentManager().h(fbzp.a);
        }
        return this.aH;
    }

    public final gcyd by(gevs gevs0, ViewGroup viewGroup0, boolean z) {
        return this.cA(gevs0, (gevr.a(gevs0.j) == 0 ? 1 : gevr.a(gevs0.j)), viewGroup0, z);
    }

    public final CallbackListenerScrollView bz() {
        Activity activity0 = (Activity)this.getContext();
        CallbackListenerScrollView callbackListenerScrollView0 = (CallbackListenerScrollView)activity0.findViewById(0x7F0B0FEA);  // id:content_scroll_view
        if(callbackListenerScrollView0 == null) {
            CallbackListenerScrollView callbackListenerScrollView1 = (CallbackListenerScrollView)activity0.findViewById(0x7F0B2185);  // id:sud_scroll_view
            if(callbackListenerScrollView1 == null) {
                return this.aJ == null ? null : ((CallbackListenerScrollView)this.aJ.findViewById(0x7F0B0FEA));  // id:content_scroll_view
            }
            return callbackListenerScrollView1;
        }
        return callbackListenerScrollView0;
    }

    @Override  // rdd
    public final void c(rcm rcm0) {
        fbzu fbzu0 = WalletExitResult.b();
        switch(rcm0.a) {
            case 0: {
                this.bQ();
                return;
            }
            case 1: {
                fbzu0.c(0);
                fbzu0.d(403);
                fbzu0.e(1);
                fbzu0.b(0);
                this.bN(fbzu0.a);
                return;
            }
            default: {
                fbzu0.c(1);
                fbzu0.d(403);
                fbzu0.e(rcm0.a);
                fbzu0.a(-1);
                this.bP(fbzu0.a);
            }
        }
    }

    public final gcyd cA(gevs gevs0, int v, ViewGroup viewGroup0, boolean z) {
        int v3;
        int v2;
        gevs gevs1;
        int v1 = this.bf;
        if(z) {
            switch(v) {
                case 1: {
                    goto label_11;
                }
                case 13: {
                    gevs1 = gevs0;
                    v3 = 0;
                    v2 = 13;
                    break;
                }
                default: {
                    gevs1 = gevs0;
                    v2 = v;
                    v3 = v1;
                }
            }
        }
        else {
        label_11:
            gevs1 = gevs0;
            v2 = v;
            v3 = 0;
        }
        ViewGroup viewGroup1 = gevp.a(gevs1.k) != 2 || this.lg() == null ? viewGroup0 : this.lg();
        boolean z1 = this.aK.b.g == 1;
        gcyd gcyd0 = gcyh.b(gevs1, v2, this.bV, this.cb, this.cM(), this.bW, viewGroup1, v3, v3, this.bd.a(), z1);
        this.bC.add(gcyd0);
        return gcyd0;
    }

    public final void cB(int v) {
        if(this.aV != null && !this.aX) {
            this.aX = true;
            if(this.co()) {
                this.aV.E(this.by.o, this.lc());
            }
            else {
                this.aV.ac(v);
            }
        }
        rbo rbo0 = this.al;
        if(rbo0 != null) {
            rbo0.f();
            this.am = false;
            this.al = null;
        }
    }

    public final void cC(int v) {
        this.aQ = gcfz.n(this.cM(), v);
    }

    protected final void cD(getj getj0, gete gete0, List list0, int v) {
        int v1 = 2;
        int v2 = 0;
        if(getj0 != null && !((ProtoLiteMessage)getj0).equals(getj.a)) {
            v2 = gdcb.U(getj0) ? 24 : 23;
            v1 = 5;
        }
        this.cE(v1, v2, gete0, list0, v);
    }

    public final void cE(int v, int v1, gete gete0, List list0, int v2) {
        if((this.getContext() instanceof fbdn) && gete0 != null) {
            fbdm fbdm0 = ((fbdn)this.getContext()).p();
            fbdm0.c = gete0.g.toByteArray();
        }
        gcfz.q(this.cM(), this.aQ, v, v1, gete0, list0, v2);
        this.aQ = null;
    }

    public final void cF(PageDetails pageDetails0, int v, int v1) {
        switch(pageDetails0.c.ordinal()) {
            case 11: 
            case 12: {
                pageDetails0.c = hcdu.b;
                break;
            }
            case 14: {
                pageDetails0.c = hcdu.n;
                break;
            }
            default: {
                gcfz.c(this.cM(), "PF-49");
                throw new IllegalArgumentException(String.format(Locale.US, "Overlay launched with unexpected flow instruction: %s", ((int)pageDetails0.c.w)));
            }
        }
        gcrm gcrm0 = (this.getContext() instanceof gcrm) ? ((gcrm)this.getContext()) : null;
        ContextThemeWrapper contextThemeWrapper0 = this.bV;
        BuyFlowConfig buyFlowConfig0 = this.aK;
        String s = this.aL;
        Intent intent0 = new Intent();
        intent0.setClassName(contextThemeWrapper0, "com.google.android.gms.wallet.ui.common.OverlayActivity");
        intent0.putExtra("pageDetails", pageDetails0);
        intent0.putExtra("overlayType", v);
        intent0.putExtra("overlayStyle", v1 - 1);
        intent0.putExtra("logContext", this.cM());
        intent0.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        intent0.putExtra("sessionId", s);
        if(gcrm0 != null) {
            intent0.putExtra("ephemeralPrivateKey", gcrm0.X());
            intent0.putExtra("cReqSessionKey", gcrm0.W());
        }
        this.startActivityForResult(intent0, 1001);
    }

    public final void ca() {
        this.bx().b.d(this.z(), this.aM);
        this.cd();
    }

    public final void cb() {
        if(this.bx() != null) {
            this.cl();
            xob xob0 = (xob)this.getContext();
            ca ca0 = new ca(xob0.getSupportFragmentManager());
            ca0.o(this.aH);
            ca0.a();
            xob0.getSupportFragmentManager().aq();
            this.aH = null;
        }
    }

    protected final void cc(boolean z) {
        if(z) {
            SparseArray sparseArray0 = this.ak;
            int v = sparseArray0.size();
            if(v > 0) {
                ca ca0 = new ca(this.getChildFragmentManager());
                for(int v1 = 0; v1 < v; ++v1) {
                    ArrayList arrayList0 = (ArrayList)sparseArray0.valueAt(v1);
                    int v2 = arrayList0.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        ca0.o(((du)arrayList0.get(v3)));
                    }
                }
                ca0.a();
            }
            this.getChildFragmentManager().aq();
            FilterView filterView0 = this.bP;
            if(filterView0 != null) {
                fcaw fcaw0 = filterView0.d;
                fcaw0.a = (fcav)fcaw0.b.b.h("FilterCategoryDialogFragment");
                fcav fcav0 = fcaw0.a;
                if(fcav0 != null) {
                    fcav0.dismiss();
                    fcaw0.a = null;
                }
            }
            this.bd.f();
        }
        this.ak.clear();
        this.aP.j();
        this.aP.x(false);
        this.bS.clear();
        this.bR.clear();
        this.bb.g();
        this.bc.g();
        this.bD.clear();
        this.bG.clear();
        this.bH.clear();
        this.bE.clear();
        this.bC.clear();
        this.bF.clear();
        this.bT.g();
        this.bI.clear();
        this.bJ.clear();
        this.bK.clear();
        this.bL.clear();
        this.bM.clear();
        this.bN.clear();
        this.bO.clear();
        if(this.lg() != null) {
            this.lg().removeAllViews();
        }
    }

    public final void cd() {
        this.aM = -1;
    }

    protected final void ce(Runnable runnable0) {
        if(this.bx().a) {
            runnable0.run();
            return;
        }
        this.bt().post(runnable0);
    }

    protected final void cf(PageDetails pageDetails0, boolean z) {
        if(z) {
            pageDetails0.i = this.by.i;
            pageDetails0.f = this.by.f;
            pageDetails0.l = this.by.l;
        }
        this.by = pageDetails0;
        if(!z) {
            this.bx = pageDetails0.i;
        }
        gete gete0 = this.by.n;
        if(gete0 != null) {
            hfuh hfuh0 = new hfuh(gete0.i, gete.a);
            List list0 = this.by.d;
            gcgi gcgi0 = gdcb.t(this.getContext());
            if(gcgi0 != null) {
                ArrayList arrayList0 = gcgi0.a[0];
                arrayList0.clear();
                for(Object object0: hfuh0) {
                    arrayList0.add(Integer.valueOf(((getd)object0).h));
                }
            }
            if(list0 != null) {
                gcgi gcgi1 = gdcb.t(this.getContext());
                if(gcgi1 != null) {
                    ArrayList arrayList1 = gcgi1.a[1];
                    arrayList1.clear();
                    for(Object object1: list0) {
                        arrayList1.add(((Integer)object1));
                    }
                }
            }
            this.V();
            this.lp(this.by.n.h.toByteArray());
            LogContext logContext0 = this.cM();
            gete gete1 = this.by.n;
            int v = getb.a(gete1.j) == 0 ? 1 : getb.a(gete1.j);
            hfuh hfuh1 = new hfuh(gete1.k, gete.b);
            boolean z1 = this.by.n.l;
            if(logContext0 == null) {
                Log.e("ClientLog", "setLogLevel unsuccessful (null log context)");
            }
            else {
                if(v == 1) {
                    v = 3;
                }
                Session session0 = logContext0.a();
                int v1 = session0.f;
                if(v1 == 1) {
                    session0.f = v;
                    session0.d = hfuh1;
                    session0.e = z1;
                    return;
                }
                if(v1 != v) {
                    int v2 = session0.f - 1;
                    if(session0.f == 0) {
                        throw null;
                    }
                    Log.w("ClientLog", String.format(Locale.US, "setLogLevel unsuccessful (tried to change from %s to %s during a session)", v2, ((int)(v - 1))));
                    return;
                }
                if(v1 == 7 && !hfuh1.equals(session0.d)) {
                    Log.w("ClientLog", "setLogLevel unsuccessful (tried to change event list during a session)");
                    return;
                }
                if(session0.e != z1) {
                    Log.w("ClientLog", "setLogLevel unsuccessful (tried to change identifiers flag during a session)");
                }
            }
        }
    }

    public final void cg(fbgo fbgo0) {
        this.aN = fbgo0;
        this.M();
    }

    public final void ch(String s) {
        this.bw = s;
        if(this.aN != null && this.aN.U()) {
            this.aw(true);
        }
    }

    public final void ci(gczm gczm0) {
        if(this.aI != null) {
            ca ca0 = new ca(this.getFragmentManager());
            ca0.o(this.aI);
            ca0.a();
        }
        this.by.c = hcdu.k;
        this.aI = gczm0;
        gczm0.ag = this;
        gczm0.show(this.getFragmentManager(), "PageFragment.ErrorDialog");
    }

    public final void cj(PageDetails pageDetails0, int v) {
        this.cF(pageDetails0, v, 2);
    }

    protected final void ck(int v) {
        this.bx = v == -1 ? this.by.i : this.an(this.by.f.get(v));
        this.by.q = null;
        this.aU = 1;
        this.bk = v;
        this.bR();
    }

    public final void cl() {
        if(this.aM < 0) {
            this.aM = this.bx().b.a(this.z());
        }
    }

    public final void cm() {
        if(this.bx() == null) {
            this.aH = fbfn.y((this.aQ() ? 20 : 4), this.aK, this.oc());
            ca ca0 = new ca(((xob)this.getContext()).getSupportFragmentManager());
            ca0.v(this.aH, fbzp.a);
            ca0.a();
        }
    }

    public final boolean cn() {
        return this.isResumed() && gczs.j(this.bR) && !this.b;
    }

    public final boolean co() {
        hcdu hcdu0 = this.by.c;
        return hcdu0 == hcdu.j || hcdu0 == hcdu.i;
    }

    public final void cp(Object object0, int v) {
        this.aS = object0;
        this.aq = v;
    }

    public static Bundle cq(BuyFlowConfig buyFlowConfig0, String s, PageDetails pageDetails0, LogContext logContext0) {
        batl.t(buyFlowConfig0, "buyFlowConfig must not be null");
        batl.t(buyFlowConfig0.b.b, "account must be set in buyFlowConfig");
        batl.c(pageDetails0 != null, "pageDetails are required to launch an overlay.");
        batl.r(s, "analyticsSessionId must be valid");
        Bundle bundle0 = fbzp.cG(0x7F161034, logContext0);  // style:WalletEmptyStyle
        bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
        bundle0.putString("analyticsSessionId", s);
        bundle0.putParcelable("initialPageDetails", pageDetails0);
        return bundle0;
    }

    public static Bundle cr(BuyFlowConfig buyFlowConfig0, String s, LogContext logContext0) {
        batl.t(buyFlowConfig0, "buyFlowConfig must not be null");
        batl.t(buyFlowConfig0.b.b, "account must be set in buyFlowConfig");
        batl.r(s, "analyticsSessionId must be valid");
        Bundle bundle0 = fbzp.cG(0x7F161034, logContext0);  // style:WalletEmptyStyle
        bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
        bundle0.putString("analyticsSessionId", s);
        return bundle0;
    }

    public final gesx cs(byte[] arr_b) {
        String s = !hzsl.e() || this.cM() == null ? null : this.cM().a().a;
        gesv gesv0 = (gesv)((ProtoLiteMessage)gesx.a).v_newBuilder();
        if(arr_b != null && arr_b.length > 0) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx0 = (gesx)gesv0.b_message;
            gesx0.b |= 1;
            gesx0.e = hfsf0;
        }
        if(!TextUtils.isEmpty(s)) {
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx1 = (gesx)gesv0.b_message;
            s.getClass();
            gesx1.b |= 0x20;
            gesx1.j = s;
        }
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx2 = (gesx)gesv0.b_message;
        gesx2.b |= 0x80;
        gesx2.l = false;
        return (gesx)((ProtoLiteBuilder)gesv0).N_build();
    }

    public final gesx ct(byte[] arr_b, byte[] arr_b1) {
        String s = !hzsl.e() || this.cM() == null ? null : this.cM().a().a;
        gesv gesv0 = (gesv)((ProtoLiteMessage)gesx.a).v_newBuilder();
        if(arr_b != null && arr_b.length > 0) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx0 = (gesx)gesv0.b_message;
            gesx0.b |= 1;
            gesx0.e = hfsf0;
        }
        if(s != null) {
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx1 = (gesx)gesv0.b_message;
            gesx1.b |= 0x20;
            gesx1.j = s;
        }
        if(arr_b1 != null) {
            gest gest0 = (gest)((ProtoLiteMessage)gesu.a).v_newBuilder();
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!gest0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gest0).ensureMutable();
            }
            gesu gesu0 = (gesu)gest0.b_message;
            gesu0.b |= 2;
            gesu0.e = hfsf1;
            gesu gesu1 = (gesu)((ProtoLiteBuilder)gest0).N_build();
            if(!gesv0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gesv0).ensureMutable();
            }
            gesx gesx2 = (gesx)gesv0.b_message;
            gesu1.getClass();
            gesx2.n = gesu1;
            gesx2.b |= 0x800;
        }
        if(!gesv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gesv0).ensureMutable();
        }
        gesx gesx3 = (gesx)gesv0.b_message;
        gesx3.b |= 0x80;
        gesx3.l = false;
        return (gesx)((ProtoLiteBuilder)gesv0).N_build();
    }

    public final void cu(int v, int v1) {
        fbzn fbzn0 = this.aV;
        if(fbzn0 != null && !this.aX) {
            this.aX = true;
            fbzn0.aa(v, v1);
        }
    }

    public final boolean cv(hcfk hcfk0) {
        if(hcfk0 != null) {
            hcfk hcfk1 = (hcfk)this.bT.d(hcfk0.c);
            return hcfk1 == null ? false : (hcfk1.d == null ? hcfl.a : hcfk1.d).c;
        }
        return false;
    }

    protected static final int cw(boolean z, boolean z1) {
        if(!z) {
            return 1;
        }
        return z1 ? 3 : 2;
    }

    public final void cx() {
        batl.m(this.bz != null, "initialPageDetails must be provided before calling handleInitialPageDetails.");
        if(!this.aY) {
            gcfz.f(this.cM(), this.bz.n, this.bz.d);
        }
        this.kZ(this.bz, true, "onInitialLoad");
        this.bz = null;
    }

    public final void cy(getj getj0, gete gete0) {
        this.cD(getj0, gete0, null, 1);
    }

    @Override  // gcjl
    public final void cz() {
        if(this.bj) {
            int v = this.bl;
            if(v != -2) {
                this.ck(v);
                this.bj = false;
                this.bl = -2;
                return;
            }
            gcfz.c(this.cM(), "PF-25");
            throw new IllegalStateException("A dependency triggered hiding the current page without showing another page.");
        }
        if(this.bl == -2) {
            return;
        }
        gcfz.c(this.cM(), "PF-26");
        throw new IllegalStateException("A dependency triggered showing a page without hiding the current page.");
    }

    public void kZ(PageDetails pageDetails0, boolean z, String s) {
        this.bv = false;
        this.bk = -1;
        if(pageDetails0.q != null && !pageDetails0.q.i.isEmpty()) {
            Log.w("PageFragment", String.format(Locale.US, "%s UiError w/internalDetails=%s", s, pageDetails0.q.i));
        }
        batl.s(pageDetails0.c);
        if(pageDetails0.c == hcdu.a) {
            Log.w("PageFragment", "No flow instruction provided.");
            pageDetails0.c = this.ak(pageDetails0);
        }
        this.aR = SystemClock.elapsedRealtime();
        if(pageDetails0.l != null) {
            switch(pageDetails0.c.ordinal()) {
                case 1: {
                    batl.m(z, "WebViewComponent should only be present at initialize flow.");
                    break;
                }
                case 5: 
                case 6: 
                case 10: {
                    break;
                }
                default: {
                    gcfz.c(this.cM(), "PF-09");
                    throw new IllegalStateException(String.format(Locale.US, "WebViewComponent cannot support this flow instruction: %s", ((int)pageDetails0.c.w)));
                }
            }
        }
        this.bg(pageDetails0, z, s);
    }

    protected void lA() {
        gcfz.c(this.cM(), "PF-30");
        throw new UnsupportedOperationException("Showing page UI is not supported");
    }

    public void lB(String s, String s1) {
        if(this.aI != null) {
            ca ca0 = new ca(this.getFragmentManager());
            ca0.o(this.aI);
            ca0.a();
        }
        gczm gczm0 = gczm.z(1, s, s1, 5);
        this.aI = gczm0;
        gczm0.ag = this;
        gczm0.show(this.getFragmentManager(), "PageFragment.ErrorDialog");
    }

    public void lC() {
        this.ci(gczm.C());
    }

    public boolean lD() {
        return this.aI != null;
    }

    protected void lE(getj getj0, String s, boolean z) {
        if(this.aI != null) {
            ca ca0 = new ca(this.getFragmentManager());
            ca0.o(this.aI);
            ca0.a();
        }
        String s1 = TextUtils.isEmpty(getj0.c) ? getj0.h : getj0.c;
        int v = 1;
        boolean z1 = (geti.b(getj0.f) == null ? geti.a : geti.b(getj0.f)) == geti.a;
        boolean z2 = this.bo(z1, z);
        if(z2) {
            v = 2;
        }
        int v1 = fbzp.cw(z1, z2);
        if(TextUtils.isEmpty(s)) {
            s = this.getString(0x7F1535C9);  // string:wallet_uic_title_possibly_recoverable_error_dialog "Request Failed"
        }
        gczm gczm0 = gczm.z(v, s, s1, v1);
        this.aI = gczm0;
        gczm0.ag = this;
        gczm0.show(this.getFragmentManager(), "PageFragment.ErrorDialog");
    }

    protected void lF(getj getj0, boolean z) {
        this.lE(getj0, null, z);
    }

    protected boolean lc() {
        return false;
    }

    protected long lf(Object object0) {
        return 0L;
    }

    protected ViewGroup lg() {
        return this.bQ;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.bR;
    }

    @Override  // gami
    public final List li() {
        return this.bS;
    }

    protected List lj() {
        return null;
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            this.ap(((gcjm)arrayList0.get(v1)));
        }
    }

    @Override  // gdcm
    public final void ll(boolean z) {
        super.ll(z || this.by.s == 3);
    }

    protected void lm(Object object0) {
        gcfz.c(this.cM(), "PF-28");
        throw new UnsupportedOperationException("Partial page update not supported.");
    }

    protected void ln() {
        gcfz.c(this.cM(), "PF-29");
        throw new UnsupportedOperationException("Hiding page UI is not supported");
    }

    @Override  // rby
    public final void lo() {
        this.am = false;
    }

    protected void lp(byte[] arr_b) {
        fbzn fbzn0 = this.aV;
        if(fbzn0 != null) {
            fbzn0.z(arr_b);
        }
    }

    protected void lz(hceu hceu0, byte[] arr_b) {
        gcfz.c(this.cM(), "PF-38");
        throw new UnsupportedOperationException("makeSubmitRequestWithFilterValue not supported.");
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.aP;
    }

    @Override  // gdcm, gamd
    public final Account oc() {
        return this.aK.b.b;
    }

    @Override  // du
    public void onActivityResult(int v, int v1, Intent intent0) {
        int v2 = -1;
    alab1:
        switch(v) {
            case 1001: {
                if(v1 == -1) {
                    this.bA = (PageDetails)intent0.getParcelableExtra("pageDetails");
                }
                else {
                    this.ll(true);
                }
                break;
            }
            case 1002: {
                this.R();
                break;
            }
            case 1004: {
                this.bo = false;
                switch(v1) {
                    case -1: {
                        this.kZ(this.ae(intent0), false, "webViewCompleteFlowWithCallbackData");
                        break alab1;
                    }
                    case 0: {
                        this.cB(6);
                        break alab1;
                    }
                    case 1: {
                        Bundle bundle0 = intent0.getBundleExtra("errorDetails");
                        if(bundle0 != null) {
                            getj getj0 = gcik.a(bundle0);
                            String s = bundle0.getString("ErrorUtils.KEY_TITLE");
                            this.ll(true);
                            this.lE(getj0, s, false);
                            break alab1;
                        }
                        gcfz.c(this.cM(), "PF-03");
                        throw new IllegalArgumentException("Error result must provide error details.");
                    }
                    case 2: {
                        this.bO(-1);
                        break alab1;
                    }
                    case 100: {
                        Bundle bundle1 = intent0.getBundleExtra("webViewComponentErrorDetails");
                        PageDetails pageDetails0 = this.A();
                        pageDetails0.c = hcdu.k;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)getj.a).v_newBuilder();
                        geti geti0 = geti.b;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((getj)hftp0.b_message).f = geti0.i;
                        ((getj)hftp0.b_message).b |= 8;
                        String s1 = bundle1.getString("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_ERROR");
                        if(s1 != null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            getj getj1 = (getj)hftp0.b_message;
                            getj1.b |= 16;
                            getj1.h = s1;
                        }
                        pageDetails0.q = (getj)hftp0.N_build();
                        this.kZ(pageDetails0, false, "webViewCompleteFlowWithError");
                        break alab1;
                    }
                    default: {
                        gcfz.c(this.cM(), "PF-04");
                        throw new RuntimeException(String.format(Locale.US, "Unknown result code from popup redirect: %d", v1));
                    }
                }
            }
            case 1005: {
                this.ll(true);
                break;
            }
            case 1006: {
                if(v1 == -1) {
                    this.lz(((hceu)gciq.b(intent0, "filterValue", ((Parser)((ProtoLiteMessage)hceu.a).jf(7, null)))), intent0.getByteArrayExtra("dependencyGraphActionToken"));
                }
                break;
            }
            case 1007: {
                this.bQ();
                break;
            }
            case 0x3F0: {
                if(v1 == -1) {
                    this.bQ();
                }
                else {
                    this.cB(1);
                }
                break;
            }
            default: {
                super.onActivityResult(v, v1, intent0);
            }
        }
        if(v >= 1000) {
            if(v == 1003) {
                v = 1003;
                goto label_65;
            }
            return;
        }
    label_65:
        if(intent0 != null) {
            v2 = intent0.getIntExtra("com.google.android.gms.wallet.firstparty.EXTRA_ERROR_CODE", -1);
        }
        NewWidgetActionEvent.a(this.bV, this.aL, (v == 1003 ? 1000 : v), 3, fbgn.X(v1), v2);
    }

    @Override  // gcyg
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(fbzn.class.isInstance(context0)) {
            this.aV = (fbzn)context0;
            if((context0 instanceof fbys)) {
                this.aW = (fbys)context0;
            }
            return;
        }
        gcfz.c(this.cM(), "PF-01");
        throw new IllegalArgumentException("Parent activity must implement fbzn");
    }

    @Override  // gdcm
    public void onCreate(Bundle bundle0) {
        Object object0;
        int v;
        MessageLite hfvm0;
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.aL = bundle1.getString("analyticsSessionId");
        PageDetails pageDetails0 = (PageDetails)bundle1.getParcelable("initialPageDetails");
        this.aY = pageDetails0 != null;
        this.setHasOptionsMenu(true);
        CharSequence charSequence0 = ((Activity)this.getContext()).getTitle();
        if(charSequence0 != null) {
            this.ba = charSequence0;
        }
        if(bundle0 == null) {
            this.ao = hzoq.a.b().a();
            this.ap = hrnt.i();
            if(bundle1.containsKey("pageProto")) {
                this.bx = gciq.a(bundle1, "pageProto", this.E());
            }
            this.aK = (BuyFlowConfig)bundle1.getParcelable("buyFlowConfig");
            if(pageDetails0 != null) {
                this.bz = pageDetails0;
            }
        }
        else {
            this.ao = bundle0.getLong("transactionSizeLimit");
            this.ap = bundle0.getBoolean("enableFileWrapperMigration");
            if(bundle0.containsKey("buyFlowConfig")) {
                this.aK = (BuyFlowConfig)bundle0.getParcelable("buyFlowConfig");
            }
            this.bh = (Map)bundle0.getSerializable("componentToIdMap");
            this.aM = bundle0.getInt("serviceConnectionSavePoint", -1);
            this.aR = bundle0.getLong("mTimeResponseReceivedMs");
            this.aX = bundle0.getBoolean("hasPageFinished");
            this.cf(((PageDetails)gcvs.a(bundle0, "pageDetails")), false);
            this.getContext();
            Parser hfvs0 = this.E();
            boolean z = this.ap;
            if(bundle0.containsKey("activePage")) {
                byte[] arr_b = bundle0.getByteArray("activePage");
                hfvm0 = arr_b == null ? null : gcvs.b(arr_b, hfvs0);
            }
            else if(bundle0.containsKey("activePagefilename")) {
                String s = bundle0.getString("activePagefilename");
                gftb.check(s);
                hfvm0 = gcvs.b(gcvs.g(s, true, z), hfvs0);
            }
            else {
                hfvm0 = null;
            }
            this.bx = hfvm0;
            if(bundle0.containsKey("requestType")) {
                switch(bundle0.getInt("requestType")) {
                    case 1: {
                        v = 2;
                        break;
                    }
                    case 2: {
                        v = 3;
                        break;
                    }
                    case 3: {
                        v = 4;
                        break;
                    }
                    case 4: {
                        v = 5;
                        break;
                    }
                    default: {
                        v = 1;
                    }
                }
                this.aq = v;
            }
            if(bundle0.containsKey("lastNetworkMessage")) {
                int v1 = this.aq;
                if(v1 == 0) {
                    object0 = null;
                }
                else {
                    switch(v1 - 1) {
                        case 1: {
                            object0 = fbzp.ah(bundle0, this.D());
                            break;
                        }
                        case 2: {
                            object0 = fbzp.ah(bundle0, this.F());
                            break;
                        }
                        case 3: {
                            object0 = fbzp.ah(bundle0, this.am());
                            break;
                        }
                        case 4: {
                            throw new IllegalArgumentException("Document upload unsupported");
                        }
                        default: {
                            object0 = null;
                        }
                    }
                }
                this.aS = object0;
            }
            if(bundle0.containsKey("apiRequestEvent")) {
                this.aQ = (TimedEvent)bundle0.getParcelable("apiRequestEvent");
            }
            if(bundle0.containsKey("componentIdGeneratorState")) {
                this.bd = gcqy.e(bundle0.getBundle("componentIdGeneratorState"));
            }
            this.bo = bundle0.getBoolean("webViewActivityLaunchState");
            if(bundle0.containsKey("droidGuardManager")) {
                gchj gchj0 = new gchj(this.getContext(), this.getLoaderManager(), this);
                this.bs = gchj0;
                Bundle bundle2 = bundle0.getBundle("droidGuardManager");
                gchj0.b = (gfgf)gciq.a(bundle2, "droidGuardForm", ((Parser)((ProtoLiteMessage)gfgf.a).jf(7, null)));
                gchj0.c = bundle2.getString("droidGuardResult");
                if(bundle2.getBoolean("hasPendingSubmit")) {
                    gchj0.f = new gchi(gchj0);
                }
            }
            this.bk = bundle0.getInt("currentAdditionalPageIndex");
        }
        if(this.bd == null) {
            this.bd = gcqy.d();
        }
        int[] arr_v = {0x7F040E05, 0x7F040721};  // attr:uicFormStartEndMargin
        Arrays.sort(arr_v);
        TypedArray typedArray0 = this.bV.obtainStyledAttributes(arr_v);
        this.be = typedArray0.getDimensionPixelSize(Arrays.binarySearch(arr_v, 0x7F040E05), 0);  // attr:uicFormStartEndMargin
        typedArray0.recycle();
        this.bf = this.getResources().getDimensionPixelSize(0x7F071516);  // dimen:wallet_spacing_material_top_bottom
        this.cm();
    }

    @Override  // du
    public final void onCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
        MenuItem menuItem0;
        int v;
        boolean z = this.ca;
        List list0 = this.lj();
        if(list0 == null) {
            v = 0;
        }
        else {
            v = list0.size();
            int v1 = 0;
            while(v1 < v) {
                hcey hcey0 = (hcey)list0.get(v1);
                int v2 = hcey0.b;
                if(v2 == 5) {
                    ++v1;
                    menuItem0 = menu0.add(0, v1, v1, ((gfgr)hcey0.c).f).setEnabled(z);
                    menuItem0.setShowAsAction(1);
                    continue;
                }
                if(v2 == 6) {
                    gfgo gfgo0 = (gfgo)hcey0.c;
                    if(gcio.k(gfgo0.d)) {
                        ++v1;
                        int v3 = gdcb.ah(this.bV, gfgo0.d);
                        MenuItem menuItem1 = menu0.add(0, v1, v1, "").setIcon(this.getResources().getDrawable(v3)).setEnabled(z);
                        kdy.a(menuItem1, gfgo0.k);
                        menuItem0 = menuItem1;
                        menuItem0.setShowAsAction(1);
                        continue;
                    }
                    gcfz.c(this.cM(), "PF-05");
                    throw new IllegalStateException("Menu item icon should be an embedded image.");
                }
                gcfz.c(this.cM(), "PF-06");
                throw new IllegalStateException("Menu item should contain a message item or an icon.");
            }
        }
        menu0.close();
        List list1 = this.ao();
        if(list1 != null) {
            int v4 = list1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                int v6 = v + 1 + v5;
                menu0.add(0, v6, v6, ((gfhc)list1.get(v5)).b).setEnabled(z);
            }
        }
    }

    @Override  // du
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        int v = menuItem0.getItemId() - 1;
        if(v >= 0) {
            ArrayList arrayList0 = this.bi;
            if(v < arrayList0.size()) {
                ((gcji)arrayList0.get(v)).a();
                return true;
            }
        }
        return false;
    }

    @Override  // gdcm
    public void onPause() {
        super.onPause();
        this.bt().removeCallbacksAndMessages(null);
        this.cl();
        this.bu = true;
    }

    @Override  // gdcm
    public void onResume() {
        super.onResume();
        if(this.by.n != null) {
            this.V();
        }
        this.ce(new fbzm(this));
        PageDetails pageDetails0 = this.bA;
        if(pageDetails0 != null) {
            int v1 = pageDetails0.c.ordinal();
            switch(v1) {
                case 5: 
                case 8: {
                    pageDetails0.c = hcdu.f;
                    this.kZ(pageDetails0, false, "returningOverlay");
                    break;
                }
                case 13: {
                    pageDetails0.c = pageDetails0.i == null ? hcdu.c : hcdu.b;
                    this.kZ(pageDetails0, false, "returningOverlay");
                    break;
                }
                case 15: {
                    pageDetails0.c = hcdu.c;
                    this.kZ(pageDetails0, false, "returningOverlay");
                    Bundle bundle0 = new Bundle();
                    bundle0.putByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN", pageDetails0.b);
                    this.T(8, bundle0);
                    break;
                }
                default: {
                    if(v1 != 9) {
                        gcfz.c(this.cM(), "PF-08");
                        throw new IllegalArgumentException(String.format(Locale.US, "Return from overlay with unexpected flow instruction: %s", ((int)pageDetails0.c.w)));
                    }
                    pageDetails0.c = hcdu.f;
                    this.kZ(pageDetails0, false, "returningOverlay");
                }
            }
            this.bA = null;
        }
        if(this.bu) {
            ArrayList arrayList0 = this.ah;
            int v2 = arrayList0.size();
            for(int v = 0; v < v2; ++v) {
                this.cb.c(((gcjm)arrayList0.get(v)));
            }
            arrayList0.clear();
        }
    }

    @Override  // gdcm
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.cl();
        bundle0.putSerializable("componentToIdMap", ((Serializable)this.bh));
        bundle0.putInt("serviceConnectionSavePoint", this.aM);
        bundle0.putParcelable("buyFlowConfig", this.aK);
        bundle0.putLong("mTimeResponseReceivedMs", this.aR);
        bundle0.putBoolean("hasPageFinished", this.aX);
        bundle0.putInt("currentAdditionalPageIndex", this.bk);
        if(this.bd != null) {
            Bundle bundle1 = new Bundle();
            this.bd.h(bundle1);
            bundle0.putBundle("componentIdGeneratorState", bundle1);
        }
        bundle0.putLong("transactionSizeLimit", this.ao);
        bundle0.putBoolean("enableFileWrapperMigration", this.ap);
        int v = (int)this.ao;
        boolean z = this.ap;
        gcvs.e(bundle0, "pageDetails", this.by, this.getContext(), v, z);
        if(this.bx != null) {
            gcvs.f(this.getContext(), bundle0, "activePage", ((MessageLite)this.bx), this.ao, true, this.ap);
        }
        fbgo fbgo0 = this.aN;
        if(fbgo0 != null) {
            fbgo0.H(bundle0);
        }
        bundle0.putInt("requestType", this.aq - 1);
        gciq.j(bundle0, "lastNetworkMessage", ((MessageLite)this.aS));
        TimedEvent timedEvent0 = this.aQ;
        if(timedEvent0 != null) {
            bundle0.putParcelable("apiRequestEvent", timedEvent0);
        }
        bundle0.putBoolean("webViewActivityLaunchState", this.bo);
        gchj gchj0 = this.bs;
        if(gchj0 != null) {
            gchj0.e = null;
            Bundle bundle2 = new Bundle();
            gciq.j(bundle2, "droidGuardForm", ((MessageLite)gchj0.b));
            bundle2.putString("droidGuardResult", gchj0.c);
            bundle2.putBoolean("hasPendingSubmit", gchj0.f != null);
            bundle0.putBundle("droidGuardManager", bundle2);
        }
    }

    @Override  // fbys
    public final void setTitle(CharSequence charSequence0) {
        this.ba = charSequence0;
    }

    protected abstract fbnw z();
}

