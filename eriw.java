import android.content.Context;
import android.os.Bundle;
import android.os.SystemProperties;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class eriw extends du {
    public String a;
    MagicArchChallengeView ag;
    erir ah;
    private static final baun ai;
    private ArrayList aj;
    private int ak;
    private boolean al;
    private String am;
    private int an;
    private boolean ao;
    private boolean ap;
    private UiCustomization aq;
    private int ar;
    public String b;
    public iw c;
    public AccountChallengeWebView d;

    static {
        eriw.ai = new erqc(new String[]{"Setup", "UI", "AccountChallengeFragment"});
    }

    public final void A(ArrayList arrayList0, String s) {
        this.aj = arrayList0;
        this.a = s;
        if(this.ao) {
            MagicArchChallengeView magicArchChallengeView0 = this.ag;
            boolean z = this.ap;
            MagicArchChallengeView.a.d("Setting userDarkTheme to: %b", new Object[]{Boolean.valueOf(z)});
            magicArchChallengeView0.g = z;
            MagicArchChallengeView magicArchChallengeView1 = this.ag;
            ArrayList arrayList1 = new ArrayList(eqsh.l(arrayList0));
            magicArchChallengeView1.i = arrayList1;
            magicArchChallengeView1.j = new CountDownLatch(arrayList1.size());
            magicArchChallengeView1.post(new eroc(magicArchChallengeView1));
            return;
        }
        this.d.f(arrayList0);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        eriw.ai.d("onAttach()", new Object[0]);
        super.onAttach(context0);
        if((context0 instanceof eriv)) {
            return;
        }
        throw new RuntimeException("Parent activity should implement AccountChallengeFragment.Listener");
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        eriw.ai.d("onCreate()", new Object[0]);
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            this.aj = bundle0 == null ? bundle1.getParcelableArrayList("accounts") : bundle0.getParcelableArrayList("accounts");
            this.a = bundle1.getString("restoreAccount");
            this.al = bundle1.getBoolean("showSkipAccount", true);
            this.b = bundle1.getString("transitionTitle", this.getResources().getQuantityString(0x7F130096, (this.aj == null ? 0 : this.aj.size())));  // plurals:smartdevice_d2d_copying_accounts
            this.am = bundle1.getString("transitionDescription", "");
            this.an = bundle1.getInt("iconResId", 0x7F080B30);  // drawable:quantum_gm_ic_compare_arrows_vd_theme_24
            this.ao = bundle1.getBoolean("isFidoFlow", false);
            this.ap = bundle1.getBoolean("useDarkTheme", false);
            this.aq = (UiCustomization)bundle1.getParcelable("uiCustomization");
            this.ar = bundle1.getInt("uiTheme");
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        eriw.ai.d("onCreateView()", new Object[0]);
        if(hoxb.d()) {
            Context context0 = this.getContext();
            batl.s(context0);
            layoutInflater0 = layoutInflater0.cloneInContext(context0);
            layoutInflater0.setFactory2(new bagp());
        }
        return this.ao ? layoutInflater0.inflate(0x7F0E09E9, viewGroup0, false) : layoutInflater0.inflate(0x7F0E09D0, viewGroup0, false);  // layout:smartdevice_magic_arch_fragment
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        eriw.ai.d("onSaveInstanceState()", new Object[0]);
        bundle0.putParcelableArrayList("accounts", this.aj);
    }

    @Override  // du
    public final void onStart() {
        eriw.ai.d("onStart()", new Object[0]);
        super.onStart();
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null) {
            this.ak = xnz0.getRequestedOrientation();
            xnz0.setRequestedOrientation(xnz0.getResources().getConfiguration().orientation);
        }
    }

    @Override  // du
    public final void onStop() {
        eriw.ai.d("onStop()", new Object[0]);
        super.onStop();
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null) {
            xnz0.setRequestedOrientation(this.ak);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        boolean z = false;
        eriw.ai.d("onViewCreated()", new Object[0]);
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null) {
            if(this.ao) {
                this.ag = (MagicArchChallengeView)view0.findViewById(0x7F0B187D);  // id:magic_arch_webview
                eriq eriq0 = new eriq(this, xnz0);
                ArrayList arrayList0 = this.aj;
                if(arrayList0 == null) {
                    this.ag.c(xnz0, eriq0, this.b, this.am, this.an, this.aq, this.ar);
                }
                else {
                    this.ag.e(xnz0, eriq0, this.b, this.am, this.an, eqsh.l(arrayList0), this.aq, this.ar);
                }
                xnz0.getWindow().setSoftInputMode(16);
                if(!this.ag.g()) {
                    eqrr.a(xnz0.getWindow(), view0);
                }
            }
            else {
                this.ah = new erir(this, xnz0);
                AccountChallengeWebView accountChallengeWebView0 = (AccountChallengeWebView)view0.findViewById(0x7F0B0A65);  // id:account_challenge_webview
                this.d = accountChallengeWebView0;
                accountChallengeWebView0.q = this.ah;
                String s = SystemProperties.get("setupwizard.theme", "");
                if("glif".equals(s) || "glif_light".equals(s)) {
                    z = true;
                }
                accountChallengeWebView0.p = z;
                AccountChallengeWebView accountChallengeWebView1 = this.d;
                accountChallengeWebView1.d = this.al;
                accountChallengeWebView1.e = this.b;
                accountChallengeWebView1.f = this.am;
                accountChallengeWebView1.g = this.an;
                ArrayList arrayList1 = this.aj;
                if(arrayList1 == null) {
                    accountChallengeWebView1.c();
                }
                else {
                    accountChallengeWebView1.f(arrayList1);
                }
                xnz0.getWindow().setSoftInputMode(16);
                if(!this.d.o.gU()) {
                    eqrr.a(xnz0.getWindow(), view0);
                }
            }
        }
    }

    public final void y(CharSequence charSequence0) {
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null && xnz0.getContainerActivity() != null) {
            erpa.a(xnz0.getContainerActivity(), charSequence0);
        }
    }

    public final void z() {
        MagicArchChallengeView magicArchChallengeView0 = this.ag;
        if(magicArchChallengeView0 != null) {
            magicArchChallengeView0.d();
        }
    }
}

