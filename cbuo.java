import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import com.google.android.chimera.IntentOperation;
import java.util.List;

public final class cbuo extends cbhk {
    public static final bboh a;
    public String ag;
    private final ibnn al;
    private final acp am;
    private final acp an;
    private String ao;
    private final ibnn ap;
    private final ibnn aq;
    public fnja b;
    public fnyf c;
    public Account d;

    static {
        cbuo.a = bboh.b("DeviceSupervisionOptInWebViewFragment", bbcu.ac);
    }

    public cbuo() {
        this.al = new ibnz(new cbtj(this));
        this.am = this.registerForActivityResult(new adt(), (ActivityResult activityResult0) -> {
            ibuq.f(activityResult0, "result");
            if(activityResult0.a == 0) {
                this.super.E(0, null);
            }
        });
        this.an = this.registerForActivityResult(new adt(), (ActivityResult activityResult0) -> {
            ibuq.f(activityResult0, "result");
            if(activityResult0.a == -1) {
                icbb.b(lpt.a(this), null, null, new cbts(this, null), 3);
                return;
            }
            this.super.E(0, null);
        });
        cbtf cbtf0 = new cbtf(this);
        this.ap = new lsd(new ibuk(cbte.class), new cbtq(this), cbtf0, new cbtr(this));
        this.aq = new ibnz(new cbtm(this));
    }

    @Override  // cbhk
    protected final List A() {
        hukf hukf0 = hukf.a;
        if(hukf0.c().u()) {
            hfuo hfuo0 = hukf.b().b;
            ibuq.e(hfuo0, "getElementList(...)");
            hfuo hfuo1 = hukf0.c().c().b;
            ibuq.e(hfuo1, "getElementList(...)");
            return ibpo.ak(hfuo0, hfuo1);
        }
        List list0 = hukf.b().b;
        ibuq.e(list0, "getElementList(...)");
        return list0;
    }

    @Override  // cbhk
    public final void E(int v, Intent intent0) {
        if(v == -1) {
            Intent intent1 = IntentOperation.getStartIntent(this.requireContext(), "com.google.android.gms.auth.account.be.UpdateHideDmNotificationsIntentOperation", "com.google.android.gms.auth.account.be.update_hide_dm_notifications");
            if(intent1 != null) {
                intent1.putExtra("account_name", this.d);
                intent1.putExtra("hide_notifications", true);
                this.requireContext().startService(intent1);
            }
            this.y().l(this.requireContext());
            this.y().h.g(Boolean.valueOf(true));
            return;
        }
        super.E(v, null);
    }

    @Override  // cbhk
    public final void F() {
        super.E(0, null);
    }

    public final cbux G() {
        return (cbux)this.al.a();
    }

    @Override  // cbhk
    public final void H() {
        icbb.b(lpt.a(this), null, null, new cbtt(this, null), 3);
    }

    @Override  // cbhk
    public final void J(WebView webView0, String s) {
        ibuq.f(webView0, "webView");
        ibuq.f(s, "url");
        cbjn.a(webView0, s);
        if(hukf.a.c().w() && ibuq.m(s, this.ao)) {
            return;
        }
        this.aw();
    }

    @Override  // cbhk
    public final void K(String s) {
        ibuq.f(s, "url");
        hukf hukf0 = hukf.a;
        if(fpyt.b(gged_interceptors.l(hukf0.c().j())).c(Uri.parse(s))) {
            cbva.a(((xob)this.requireContext()), s);
            return;
        }
        if(hukc.a.b().c() && fpyt.b(gged_interceptors.l(hukf0.c().l())).c(Uri.parse(s))) {
            new ank().a().a(this.requireContext(), Uri.parse(s));
            return;
        }
        String s1 = Uri.parse(hukf0.c().k()).buildUpon().path(hukf0.c().g()).build().toString();
        ibuq.e(s1, "toString(...)");
        if(ibzk.G(s, s1)) {
            this.ao = s;
            this.aE(s);
            super.E(-1, null);
            return;
        }
        super.K(s);
    }

    public final gvku M() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            gvku gvku0 = gvku.b(bundle0.getInt("entry_point"));
            return gvku0 == null ? gvku.a : gvku0;
        }
        return gvku.a;
    }

    public final Object N(String s, ibrl ibrl0) {
        cbtu cbtu0;
        if((ibrl0 instanceof cbtu)) {
            cbtu0 = (cbtu)ibrl0;
            int v = cbtu0.c;
            if((v & 0x80000000) == 0) {
                cbtu0 = new cbtu(this, ibrl0);
            }
            else {
                cbtu0.c = v - 0x80000000;
            }
        }
        else {
            cbtu0 = new cbtu(this, ibrl0);
        }
        Object object0 = cbtu0.a;
        Object object1 = ibrx.a;
        switch(cbtu0.c) {
            case 0: {
                ibnx.b(object0);
                cbte cbte0 = this.y();
                cbtu0.d = s;
                cbtu0.c = 1;
                object0 = cbte0.i(cbtu0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = cbtu0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v1 = ((Number)object0).intValue();
        if(!hukf.d() && v1 > this.y().g.size()) {
            cbir cbir0 = this.R();
            if(cbir0 != null) {
                cbir.e(cbir0, gvkq.ds);
            }
        }
        if(v1 > 1) {
            this.ac(s);
        }
        return ibom.a;
    }

    // Detected as a lambda impl.
    public static final void Q(cbuo cbuo0, ActivityResult activityResult0) {
        ibuq.f(activityResult0, "result");
        if(activityResult0.a == 0) {
            cbuo0.super.E(0, null);
        }
    }

    @Override  // cbhk
    protected final cbir R() {
        return (cbir)this.aq.a();
    }

    // Detected as a lambda impl.
    public static final void W(cbuo cbuo0, ActivityResult activityResult0) {
        ibuq.f(activityResult0, "result");
        if(activityResult0.a == -1) {
            icbb.b(lpt.a(cbuo0), null, null, new cbts(cbuo0, null), 3);
            return;
        }
        cbuo0.super.E(0, null);
    }

    public final void aB() {
        ca ca0 = new ca(this.getParentFragmentManager());
        ca0.G(0x1020002, cbuq.a(this.y().k(), 2));
        ca0.a();
    }

    public static final void aC(cbuo cbuo0) {
        cbuo0.super.E(-1, null);
    }

    public final Object aD(String s) {
        cbte cbte0 = this.y();
        if(cbte0.b && cbte0.c() != null) {
            List list0 = this.y().g;
            ibuq.d(list0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            if(list0.contains(s)) {
                if(hukf.d()) {
                    cbir cbir0 = this.R();
                    if(cbir0 != null) {
                        cbir.e(cbir0, gvkq.dz);
                    }
                }
                Intent intent0 = this.y().c();
                if(intent0 != null) {
                    this.an.b(intent0);
                }
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    private final void aE(String s) {
        String s1;
        Uri.Builder uri$Builder0 = Uri.parse(hukf.a.c().f()).buildUpon().path(hukf.a.c().e()).appendQueryParameter("continue", s);
        Account account0 = this.d;
        if(account0 == null) {
            s1 = "";
        }
        else {
            s1 = account0.name;
            if(s1 == null) {
                s1 = "";
            }
        }
        Uri uri0 = uri$Builder0.appendQueryParameter("Email", s1).build();
        try {
            new ank().a().a(this.requireContext(), uri0);
            super.E(-1, null);
        }
        catch(ActivityNotFoundException unused_ex) {
            Toast.makeText(this.getContext(), "No browser available to open url", 1).show();
            super.E(0, null);
        }
    }

    @Override  // cbhk
    public final boolean ab() {
        return hukf.f() && gaec.t(this.requireContext());
    }

    public final void ac(String s) {
        Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.kids.settings.DeviceSupervisionOptInActivity").putExtra("destination", "accounts_removal").putExtra("selected_account", s).putExtra("session_id", this.y().k());
        ibuq.e(intent0, "putExtra(...)");
        this.am.b(intent0);
    }

    @Override  // cbhk
    public final void aq() {
        cbir cbir0 = this.R();
        if(cbir0 != null) {
            cbir.e(cbir0, gvkq.dr);
        }
        this.y().l(this.requireContext());
    }

    @Override  // cbhk
    public final void av(String s) {
        ibuq.f(s, "continueUrl");
        if(this.d != null) {
            icbb.b(lpt.a(this), null, null, new cbum(this, s, null), 3);
            this.aj();
            icbb.b(lpt.a(this), null, null, new cbun(this, null), 3);
            return;
        }
        cbir cbir0 = this.R();
        if(cbir0 != null) {
            cbtg cbtg0 = new cbtg();
            cbir0.a(gvkq.dp, cbtg0);
        }
        this.ag = s;
        fnyf fnyf0 = this.c;
        if(fnyf0 != null) {
            fnyf0.b();
        }
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        if(hukf.e()) {
            fnja fnja0 = this.G().e;
            if(fnja0 != null) {
                this.getLifecycle().d(fnja0);
            }
        }
        else {
            fnja fnja1 = this.b;
            if(fnja1 != null) {
                this.getLifecycle().d(fnja1);
            }
        }
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        if(hukf.e()) {
            fnja fnja0 = this.G().e;
            if(fnja0 != null) {
                this.getLifecycle().c(fnja0);
            }
        }
        else {
            fnja fnja1 = this.b;
            if(fnja1 != null) {
                this.getLifecycle().c(fnja1);
            }
        }
    }

    @Override  // cbhk
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        cbjb cbjb0 = new cbjb(new cbuh(this));
        this.ar(gvlr.c, cbjb0);
        cbje cbje0 = new cbje(new cbui(this));
        this.ar(gvlr.p, cbje0);
        cbjc cbjc0 = new cbjc(new cbuj(this));
        this.ar(gvlr.i, cbjc0);
        cbjd cbjd0 = new cbjd(new cbuk(this));
        this.ar(gvlr.v, cbjd0);
        cbjh cbjh0 = new cbjh(new cbul(this));
        this.ar(gvlr.d, cbjh0);
        if(bundle0 == null) {
            cbir cbir0 = this.R();
            if(cbir0 != null) {
                cbir0.c(gvky.bq);
            }
            if(hukc.a.b().b()) {
                cbir cbir1 = this.R();
                if(cbir1 != null) {
                    cbir1.b();
                }
            }
        }
        icbb.b(lpt.a(this), null, null, new cbtz(this, null), 3);
        icbb.b(lpt.a(this), null, null, new cbug(this, null), 3);
    }

    public final cbte y() {
        return (cbte)this.ap.a();
    }

    @Override  // cbhk
    public final String z() {
        return null;
    }
}

