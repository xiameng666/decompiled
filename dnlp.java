import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.CardRewardsDetailsIntentArgs;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dnlp extends dokz implements ednc {
    public Account a;
    public fhwk ag;
    public ibnf ah;
    public final dnla ai;
    public ComposeViewHeader aj;
    public RecyclerView ak;
    public azts al;
    public static final int am;
    private AndroidInjector an;
    private final ibnn ao;
    public dnpp b;
    public dmet c;
    public fuok d;

    static {
        bboh.b("CardRewardsDetailsFragment", bbcu.cZ);
    }

    public dnlp() {
        this.ai = new dnla();
        dnlk dnlk0 = new dnlk(this);
        dnlm dnlm0 = new dnlm(new dnll(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dnlm0);
        this.ao = new lsd(new ibuk(dnlc.class), new dnln(ibnn0), dnlk0, new dnlo(ibnn0));
    }

    public final fhwk A() {
        fhwk fhwk0 = this.ag;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.an == null) {
            doly doly0 = dolz.a(this);
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            dxed dxed0 = dxee.a(doly0);
            done done0 = new done();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.an = new dnms(dolg0, dxed0, done0, domv0);
        }
        AndroidInjector androidInjector0 = this.an;
        if(androidInjector0 != null) {
            androidInjector0.inject(this);
        }
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            CardRewardsDetailsIntentArgs cardRewardsDetailsIntentArgs0 = ednn.b(this).P;
            dnlc dnlc0 = this.z();
            String s = cardRewardsDetailsIntentArgs0 == null ? null : cardRewardsDetailsIntentArgs0.b;
            String s1 = cardRewardsDetailsIntentArgs0 == null ? null : cardRewardsDetailsIntentArgs0.a;
            icck icck0 = lsc.a(dnlc0);
            dnlb dnlb0 = new dnlb(dnlc0, s1, s, null);
            icbb.b(icck0, dnlc0.d, null, dnlb0, 2);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "layoutInflater");
        View view0 = layoutInflater0.inflate(0x7F0E01C9, viewGroup0, false);  // layout:card_rewards_details_fragment
        this.A().f(view0, this.A().a.a(0x4128F));
        ibuq.c(view0);
        ((Toolbar)view0.findViewById(0x7F0B08D8)).x(new dnle(this));  // id:Toolbar
        ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)view0.findViewById(0x7F0B0184);  // id:CardRewardsViewHeader
        ibuq.f(composeViewHeader0, "<set-?>");
        this.aj = composeViewHeader0;
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B017C);  // id:CardRewardsList
        ibuq.f(recyclerView0, "<set-?>");
        this.ak = recyclerView0;
        RecyclerView recyclerView1 = this.y();
        this.requireContext();
        recyclerView1.ap(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.y();
        if(recyclerView2 != null) {
            recyclerView2.an(this.ai);
        }
        NestedScrollView nestedScrollView0 = (NestedScrollView)view0.findViewById(0x7F0B017D);  // id:CardRewardsNestedScrollView
        fuok fuok0 = this.d;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok0 = null;
        }
        ibuq.c(nestedScrollView0);
        fuop.h(fuok0, nestedScrollView0);
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icbb.b(lpt.a(this.getViewLifecycleOwner()), null, null, new dnlg(this, null), 3);
        icbb.b(lpt.a(this.getViewLifecycleOwner()), null, null, new dnli(this, null), 3);
    }

    public final RecyclerView y() {
        RecyclerView recyclerView0 = this.ak;
        if(recyclerView0 != null) {
            return recyclerView0;
        }
        ibuq.j("rewardsListView");
        return null;
    }

    public final dnlc z() {
        return (dnlc)this.ao.a();
    }
}

