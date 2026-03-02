import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.node.accountmatching.matcher.AccountsMatcher.AccountsMatcherResult;
import com.google.android.gms.wearable.node.accountmatching.ui.AccountMatchingChimeraActivity;
import com.google.android.gms.wearable.node.accountmatching.ui.GoogleAccountInfo;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.ArrayList;

public final class fecn extends du {
    public fecr a;
    public ImageView ag;
    public ImageView ah;
    public LinearProgressIndicator ai;
    public RecyclerView aj;
    public View ak;
    public AccountMatchingChimeraActivity al;
    private Button am;
    private Button an;
    private boolean ao;
    private boolean ap;
    private Bundle aq;
    private AppTheme ar;
    public azxs b;
    public TextView c;
    public TextView d;

    public fecn() {
        this.b = null;
        this.ao = false;
        this.ap = false;
    }

    public final void A() {
        this.ag.setVisibility(0);
        this.c.setText(0x7F1500D4);  // string:account_matching_fragment_title "Sign in to your Google Accounts"
        this.d.setVisibility(0);
        this.aj.setVisibility(0);
        this.ak.setVisibility(0);
        this.ai.setVisibility(8);
        this.ah.setVisibility(8);
    }

    public final void B() {
        if(this.ao) {
            this.ap = true;
            return;
        }
        new fece().show(this.al.getSupportFragmentManager(), "account_matching_mismatch_account_dialog");
    }

    @Override  // du
    public final void onAttach(Context context0) {
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", String.format("[AccountMatchingFragment] onAttach(%s)", context0));
        }
        super.onAttach(context0);
        this.al = (AccountMatchingChimeraActivity)context0;
        cchj cchj0 = cchj.b(((AccountMatchingChimeraActivity)context0));
        this.ar = fecf.a(this.getArguments());
        acw acw0 = this.al.getActivityResultRegistry();
        Bundle bundle0 = this.getArguments();
        this.a = new fecr(this, cchj0, acw0, (bundle0 == null ? null : ((AccountsMatcher.AccountsMatcherResult)bundle0.getParcelable("accounts"))), this.aq, this.ar);
        this.aq = null;
        this.getLifecycle().c(this.a);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        azxs azxs0 = null;
        if(bundle1 != null) {
            IBinder iBinder0 = bundle1.getBinder("callback");
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
            }
        }
        this.b = azxs0;
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[AccountMatchingFragment] onCreate(...)");
        }
        if(bundle0 != null) {
            this.aq = bundle0.getBundle("presenter_state");
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        if(Log.isLoggable("Wear_AccountMatching", 4)) {
            Log.i("Wear_AccountMatching", "[AccountMatchingFragment] onCreateView");
        }
        LayoutInflater layoutInflater1 = fczo.c(this.ar, layoutInflater0);
        View view0 = fczo.i(this.ar) ? layoutInflater1.inflate(0x7F0E0EB9, viewGroup0, false) : layoutInflater1.inflate(0x7F0E0EAA, viewGroup0, false);  // layout:wearable_expressive_account_matching_sign_in_fragment
        this.c = (TextView)view0.findViewById(0x7F0B24B4);  // id:wearable_account_matching_title
        this.d = (TextView)view0.findViewById(0x7F0B24A7);  // id:wearable_account_matching_description
        this.ag = (ImageView)view0.findViewById(0x7F0B24A8);  // id:wearable_account_matching_icon
        this.ah = (ImageView)view0.findViewById(0x7F0B24A9);  // id:wearable_account_matching_loading_icon
        this.ak = view0.findViewById(0x7F0B24A6);  // id:wearable_account_matching_bottom_bar
        this.ai = (LinearProgressIndicator)view0.findViewById(0x7F0B24AA);  // id:wearable_account_matching_loading_progress_bar
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B24A3);  // id:wearable_account_matching_account_list
        this.aj = recyclerView0;
        view0.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        this.am = (Button)view0.findViewById(0x7F0B24AF);  // id:wearable_account_matching_primary_button
        Button button0 = (Button)view0.findViewById(0x7F0B24B1);  // id:wearable_account_matching_secondary_button
        this.an = button0;
        button0.setOnClickListener(new fecl(this));
        this.am.setOnClickListener(new fecm(this));
        RecyclerView recyclerView1 = this.aj;
        fecr fecr0 = this.a;
        fech fech0 = fecr0.e;
        if(fech0 == null) {
            fech0 = new fech(new fecq(fecr0), fecr0.c);
            fecr0.e = fech0;
            ArrayList arrayList0 = fecr0.b;
            fech0.a = arrayList0;
            fech0.q();
            int v1 = arrayList0.size();
            int v2 = 0;
            for(int v = 0; v < v1; ++v) {
                v2 |= ((GoogleAccountInfo)arrayList0.get(v)).b();
            }
            if(v2 != 0 || arrayList0.isEmpty()) {
                fecr0.f.z();
            }
            if(Log.isLoggable("Wear_AccountMatching", 3)) {
                Log.d("Wear_AccountMatching", String.format("[AccountMatchingPresenter] setting adapter with %s items in it", arrayList0.size()));
            }
        }
        recyclerView1.an(fech0);
        fczo.h(((LinearLayout)view0.findViewById(0x7F0B1649)), this.ar, new TextView[]{this.c});  // id:header
        return view0;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        Log.i("Wear_AccountMatching", "[AccountMatchingFragment] onDestroy()");
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        this.ao = true;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.ao = false;
        if(this.ap) {
            this.ap = false;
            this.B();
        }
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        fecr fecr0 = this.a;
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[AccountMatchingFragment] saveInstanceState()");
        }
        Bundle bundle1 = new Bundle();
        bundle1.putString("account_email", fecr0.d);
        bundle1.putParcelableArrayList("account_info_list", fecr0.b);
        bundle0.putBundle("presenter_state", bundle1);
    }

    @Deprecated
    public static fecn y(AppTheme appTheme0, AccountsMatcher.AccountsMatcherResult accountsMatcher$AccountsMatcherResult0, IBinder iBinder0) {
        if(Log.isLoggable("Wear_AccountMatching", 3)) {
            Log.d("Wear_AccountMatching", "[AccountMatchingFragment] newInstance()");
        }
        fecn fecn0 = new fecn();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("theme", appTheme0);
        bundle0.putParcelable("accounts", accountsMatcher$AccountsMatcherResult0);
        bundle0.putBinder("callback", iBinder0);
        fecn0.setArguments(bundle0);
        return fecn0;
    }

    public final void z() {
        this.am.setVisibility(0);
    }
}

