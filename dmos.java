import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ViewHeader;
import java.util.List;

public final class dmos extends du {
    public dmpe a;
    public edon b;
    public dsoz c;
    private dmnc d;

    @Override  // du
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        String s = ((xni)context0).getIntent().getStringExtra("session_id");
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        SafeParcelable safeParcelable0 = dydw.b(((xni)context0).getIntent(), "account_info", AccountInfo.CREATOR);
        if(safeParcelable0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dmox dmox0 = new dmox(s);
        dlmk dlmk0 = new dlmk(((xni)context0));
        done done0 = new done();
        boolean z = ((Boolean)((AccountInfo)safeParcelable0).b().f(Boolean.valueOf(false))).booleanValue();
        new dmms(new dola(((AccountInfo)safeParcelable0).b, ((AccountInfo)safeParcelable0).a, z), dlmk0, dmox0, done0).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        return layoutInflater0.inflate(0x7F0E06DF, viewGroup0, false);  // layout:pay_frw_viewheader_with_cardlist
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.postponeEnterTransition();
        ViewHeader viewHeader0 = (ViewHeader)view0.findViewById(0x7F0B047D);  // id:HeaderView
        String s = this.getString(0x7F151E50);  // string:pay_frw_balance_lost_msg "Your balance will be lost"
        ibuq.e(s, "getString(...)");
        viewHeader0.j(s);
        String s1 = this.getString(0x7F151E4E);  // string:pay_frw_balance_lost_details "If you don\'t use your remaining balance, it 
                                                 // will be removed"
        ibuq.e(s1, "getString(...)");
        viewHeader0.i(s1);
        viewHeader0.h(dzdt.e(this.requireContext(), 0x7F080677, 0x7F04030C));  // drawable:gs_wallet_vd_theme_48
        ActionBar actionBar0 = (ActionBar)view0.findViewById(0x7F0B0ABF);  // id:action_bar
        CharSequence charSequence0 = this.getText(0x7F150815);  // string:common_continue "Continue"
        ibuq.e(charSequence0, "getText(...)");
        ftrz ftrz0 = new ftrz(charSequence0, new dmop(this));
        CharSequence charSequence1 = this.getText(0x7F1507F2);  // string:common_cancel "Cancel"
        ibuq.e(charSequence1, "getText(...)");
        actionBar0.l(ftrz0, new ftrz(charSequence1, new dmoq(this)));
        List list0 = this.y().j;
        if(list0.isEmpty()) {
            this.y().c(-1);
        }
        Context context0 = this.requireContext();
        dsoz dsoz0 = this.c;
        dmnc dmnc0 = null;
        if(dsoz0 == null) {
            ibuq.j("imageLoader");
            dsoz0 = null;
        }
        this.d = new dmnc(context0, dsoz0, false, list0);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1C3B);  // id:pay_frw_card_list
        this.requireContext();
        recyclerView0.ap(new LinearLayoutManager());
        dmnc dmnc1 = this.d;
        if(dmnc1 == null) {
            ibuq.j("factoryResetWizardCardAdapter");
        }
        else {
            dmnc0 = dmnc1;
        }
        recyclerView0.an(dmnc0);
        ibuq.c(recyclerView0);
        keh.b(recyclerView0, new dmor(this));
    }

    public final dmpe y() {
        dmpe dmpe0 = this.a;
        if(dmpe0 != null) {
            return dmpe0;
        }
        ibuq.j("viewModel");
        return null;
    }
}

