import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.wallet.ui.common.PageDetails;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.wallet.ui.common.FormHeaderView;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class fbzl extends fbzp implements fbei, gdaa {
    private final gcyt a;
    gcyu aD;
    boolean aE;
    final Runnable aF;
    int aG;

    public fbzl() {
        this.aG = 1;
        this.aF = fbej.a(this, "autoSubmit");
        this.a = new fbzk(this);
    }

    protected abstract List I();

    @Override  // fbzp
    protected void M() {
        super.M();
        if(hzrv.c() && !this.ca && this.aU == 0 && this.lb(null)) {
            this.aP.l(true);
        }
    }

    protected abstract void Q(gesr arg1);

    @Override  // fbzp
    public void T(int v, Bundle bundle0) {
        switch(v) {
            case 1: {
                if(this.cn()) {
                    this.M();
                    this.bi();
                }
                break;
            }
            case 3: {
                String s = bundle0.getString("EventListener.EXTRA_FORM_ID");
                int v1 = bundle0.getInt("EventListener.EXTRA_FIELD_ID");
                List list0 = this.I();
                if(list0 != null) {
                    for(Object object0: list0) {
                        gesr gesr0 = (gesr)object0;
                        if(gesr0.b.equals(s) && (gesr0.c != 0 && gesr0.c == v1)) {
                            this.Q(gesr0);
                        }
                    }
                }
                break;
            }
            case 4: {
                gdga gdga0 = this.aW(this.bR);
                if(gdga0 != null && gdga0.S() && !this.aQ()) {
                    throw new IllegalStateException("Gaia password challenge not support in current flow.");
                }
                if(bundle0.getBoolean("EventListener.EXTRA_SHOULD_AUTO_SUBMIT", false)) {
                    this.by.h = bundle0.getLong("EventListener.EXTRA_AUTO_SUBMIT_TIME_OUT_MILLIS", 0L);
                    this.by.a = true;
                }
            }
        }
        super.T(v, bundle0);
    }

    @Override  // fbzp
    public void W(int v) {
        super.W(v);
        this.bi();
        if(v == 1) {
            getj getj0 = this.by.q;
            if(getj0 != null && gdcb.U(getj0)) {
                this.bd(getj0.g);
            }
        }
    }

    protected abstract void Y();

    @Override  // fbzp
    public void aI(WalletExitResult walletExitResult0) {
        if(gdcb.Q(this.bV, getd.g) && !this.co() && !this.aX && this.ma()) {
            gcyu gcyu0 = (gcyu)this.getFragmentManager().h("closeConfirm");
            this.aD = gcyu0;
            if(gcyu0 == null) {
                this.aD = fbzy.A(this.bV);
            }
            this.aD.ai = this.a;
            this.aD.show(this.getFragmentManager(), "closeConfirm");
            return;
        }
        super.aI(walletExitResult0);
    }

    @Override  // fbei
    public void aJ(Bundle bundle0) {
        if("autoSubmit".equals(fbej.b(bundle0))) {
            this.aE = true;
            this.Y();
            this.bt().removeCallbacks(this.aF);
            return;
        }
        if("scrollToTop".equals(fbej.b(bundle0))) {
            this.V();
        }
    }

    @Override  // gdaj
    public final gdaj aV() {
        Object object0 = this.cJ();
        return (object0 instanceof gdaj) ? ((gdaj)object0) : null;
    }

    public final gdga aW(List list0) {
        for(Object object0: list0) {
            Object object1 = ((gczs)object0).e;
            if((object1 instanceof gdga)) {
                return (gdga)object1;
            }
            if((object1 instanceof gdak)) {
                gdga gdga0 = this.aW(((gdak)object1).lh());
                if(gdga0 != null) {
                    return gdga0;
                }
            }
        }
        return null;
    }

    @Override  // gdaj
    public final String aX(String s) {
        if(s == null) {
            s = "%1$s, %2$s";
        }
        return gczs.c(this.bR, s);
    }

    @Override  // gdaa
    public final ArrayList aY() {
        return gczs.d(this.bR);
    }

    @Override  // fbzp
    protected final void aZ(fbze fbze0) {
        if(gfeo.a(fbze0.b.e) != 4 && gfeo.a(fbze0.b.e) != 7) {
            super.aZ(fbze0);
            return;
        }
        this.ba(fbze0);
    }

    protected void ay() {
    }

    protected final void ba(fbze fbze0) {
        gfep gfep0 = fbze0.b;
        for(Object object0: gfep0.j) {
            MessageLite hfvm0 = this.al(((Long)object0).longValue());
            if((hfvm0 instanceof gewu)) {
                fcab.ac(((gewu)hfvm0));
            }
            if(!(hfvm0 instanceof gexr)) {
                continue;
            }
            if(gfep0.j.size() > 1) {
                throw new IllegalArgumentException("Currently if there is a DynamicList and using it in field group is disabled, it should be the only component");
            }
            return;
        }
        SummaryExpanderWrapper summaryExpanderWrapper0 = fbey.b(gfep0, fbze0.c, this, this, true);
        summaryExpanderWrapper0.setId(this.bd.a());
        fbze0.c.addView(summaryExpanderWrapper0);
        this.bG.add(summaryExpanderWrapper0);
        fbze0.e.d(summaryExpanderWrapper0);
        fbzd fbzd0 = new fbzd(fbze0);
        fbzd0.b(summaryExpanderWrapper0);
        fbze fbze1 = fbzd0.a();
        for(Object object1: gfep0.j) {
            this.bI(fbze1, ((Long)object1).longValue());
        }
    }

    @Override  // fbzp
    protected final void bb(fbze fbze0) {
        if(gfeo.a(fbze0.b.e) != 4 && gfeo.a(fbze0.b.e) != 7) {
            super.bb(fbze0);
            return;
        }
        this.ba(fbze0);
    }

    @Override  // fbzp
    protected final void bc() {
        this.ll(((boolean)(this.by.a ^ 1)));
    }

    public final void bd(List list0) {
        for(Object object0: list0) {
            getg getg0 = (getg)object0;
            if(!this.ly(getg0)) {
                throw new IllegalArgumentException("FormFieldMessage could not be applied: " + (getg0.b == null ? gesr.a : getg0.b).b);
            }
        }
    }

    @Override  // fbzp
    protected final void be(Bundle bundle0) {
        super.be(bundle0);
        gcyu gcyu0 = (gcyu)this.getFragmentManager().h("closeConfirm");
        this.aD = gcyu0;
        if(gcyu0 != null) {
            gcyu0.ai = this.a;
        }
    }

    @Override  // fbzp
    protected final void bf(fbze fbze0, int v, long v1) {
        switch(v) {
            case 10: {
                throw new IllegalArgumentException("Document upload unsupported");
            }
            case 24: {
                geye geye0 = (geye)this.al(v1);
                ViewGroup viewGroup0 = fbze0.c;
                this.bW.inflate(0x7F0E0E39, viewGroup0, true);  // layout:wallet_view_instrument_activation_holder
                FormHeaderView formHeaderView0 = (FormHeaderView)viewGroup0.findViewById(0x7F0B1744);  // id:instrument_activation_fragment_form_header
                if((geye0.b & 1) == 0) {
                    formHeaderView0.setVisibility(8);
                }
                else {
                    formHeaderView0.setVisibility(0);
                    formHeaderView0.a((geye0.e == null ? gewg.a : geye0.e), this.bW, null, this.bS);
                    this.bR.add(new gczs((geye0.e == null ? gewg.a : geye0.e).d, formHeaderView0, null));
                }
                FrameLayout frameLayout0 = (FrameLayout)viewGroup0.findViewById(0x7F0B1745);  // id:instrument_activation_fragment_holder
                fbzd fbzd0 = new fbzd(fbze0);
                fbzd0.b(frameLayout0);
                this.bH(fbzd0.a(), v1);
                return;
            }
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 28: 
            case 34: 
            case 35: 
            case 37: {
                this.bK(fbze0, v1);
                return;
            }
            case 0: 
            case 1: 
            case 3: 
            case 7: 
            case 11: 
            case 16: 
            case 17: 
            case 25: 
            case 26: 
            case 27: 
            case 29: 
            case 30: 
            case 0x1F: 
            case 0x20: 
            case 33: 
            case 36: 
            case 38: 
            case 39: {
                super.bf(fbze0, v, v1);
                return;
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown field type %d", v));
            }
        }
    }

    @Override  // fbzp
    public final void bg(PageDetails pageDetails0, boolean z, String s) {
        boolean z1 = false;
        switch(pageDetails0.c.ordinal()) {
            case 2: {
                if(this.bx == null) {
                    Log.e("PageFormFragment", "No mActivePage for continue with current page instruction.");
                    this.bO(-1);
                    return;
                }
                pageDetails0.a = pageDetails0.a || this.by.a;
                if(pageDetails0.h == 0L) {
                    pageDetails0.h = this.by.h;
                }
                if(pageDetails0.s == 1) {
                    pageDetails0.s = this.by.s;
                }
                break;
            }
            case 7: {
                pageDetails0.a = true;
                break;
            }
            case 10: {
                getj getj0 = pageDetails0.q;
                if(getj0 == null) {
                    Log.e("PageFormFragment", "No error provided for HANDLE_UI_ERROR instruction.");
                    this.bO(-1);
                    return;
                }
                if(gdcb.U(getj0) && z) {
                    this.cf(pageDetails0, false);
                    this.aU = 1;
                    this.bR();
                    z1 = true;
                }
                else if(gdcb.U(pageDetails0.q)) {
                    this.cf(pageDetails0, true);
                    this.ll(true);
                    this.bd(pageDetails0.q.g);
                    this.aP.G();
                    z1 = true;
                }
            }
        }
        if(pageDetails0.c == hcdu.k && z1) {
            return;
        }
        super.bg(pageDetails0, z, s);
    }

    public final void bh() {
        this.aE = false;
        this.by.a = false;
    }

    final void bi() {
        long v = 0L;
        if(this.by.a && !this.aE) {
            if(this.la()) {
                if(this.by.h > 0L) {
                    v = SystemClock.elapsedRealtime() - this.aR;
                }
                if(v >= this.by.h) {
                    this.aE = true;
                    this.Y();
                    return;
                }
                this.bt().removeCallbacks(this.aF);
                this.bt().postDelayed(this.aF, this.by.h - v);
                return;
            }
            this.ay();
        }
    }

    @Override  // fbzp
    protected final boolean bo(boolean z, boolean z1) {
        return z ? z1 || this.by.a : false;
    }

    protected final boolean bp(List list0, boolean z) {
        return gczs.p(this.bR, list0, z);
    }

    public final void bq() {
        if(gdcb.Q(this.bV, getd.g) && !this.co() && !this.aX && this.ma()) {
            this.aG = 6;
            gcyu gcyu0 = (gcyu)this.getFragmentManager().h("closeConfirm");
            this.aD = gcyu0;
            if(gcyu0 == null) {
                this.aD = fbzy.A(this.bV);
            }
            this.aD.ai = this.a;
            this.aD.show(this.getFragmentManager(), "closeConfirm");
            return;
        }
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
            this.cB(6);
        }
    }

    @Override  // fbzp
    public void kZ(PageDetails pageDetails0, boolean z, String s) {
        if(pageDetails0.q == null) {
            this.aE = false;
        }
        super.kZ(pageDetails0, z, s);
    }

    @Override  // gdaa
    public final void lW(int v) {
        gczs.i(this.bR, v);
    }

    @Override  // gdaa
    public final boolean lX() {
        return gczs.l(this.bR);
    }

    @Override  // gdaa
    public final boolean lY() {
        return gczs.m(this.bR);
    }

    @Override  // gdaa
    public final boolean lZ() {
        return gczs.n(this.bR);
    }

    @Override  // gdaa
    public final boolean la() {
        ArrayList arrayList0 = this.bR;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = ((gczs)arrayList0.get(v1)).e;
            if((object0 instanceof gdaa) && !((gdaa)object0).la()) {
                return false;
            }
        }
        return true;
    }

    @Override  // gdan
    public final boolean lb(List list0) {
        return this.bp(list0, false);
    }

    @Override  // fbzp
    protected final boolean lc() {
        return true;
    }

    @Override  // gdan
    public final boolean ld(List list0) {
        boolean z = this.bp(list0, true);
        if(!z) {
            this.aP.G();
        }
        return z;
    }

    @Override  // gdan
    public final boolean le() {
        return gczs.q(this.bR);
    }

    @Override  // gdaa
    public boolean ly(getg getg0) {
        ArrayList arrayList0 = this.bR;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = ((gczs)arrayList0.get(v1)).e;
            if((object0 instanceof gdaa) && ((gdaa)object0).ly(getg0)) {
                return true;
            }
        }
        return false;
    }

    @Override  // gdaa
    public final boolean ma() {
        return gczs.o(this.bR);
    }

    @Override  // fbzp
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.aE = bundle0.getBoolean("doneAutoSubmitForThisPage", false);
            this.aG = gkkv.a(bundle0.getInt("exitAction", 0));
        }
    }

    @Override  // fbzp
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("doneAutoSubmitForThisPage", this.aE);
        int v = this.aG - 1;
        if(this.aG == 0) {
            throw null;
        }
        bundle0.putInt("exitAction", v);
    }
}

