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

public final class dmnu extends du {
    public dmpe a;
    public dsoz b;

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
        new dmmo(new dola(((AccountInfo)safeParcelable0).b, ((AccountInfo)safeParcelable0).a, z), dlmk0, dmox0, done0).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        return layoutInflater0.inflate(0x7F0E06DF, viewGroup0, false);  // layout:pay_frw_viewheader_with_cardlist
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ftrz ftrz1;
        ibuq.f(view0, "view");
        dmls dmls0 = this.y().k;
        if(dmls0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ViewHeader viewHeader0 = (ViewHeader)view0.findViewById(0x7F0B047D);  // id:HeaderView
        CharSequence charSequence0 = this.requireContext().getText((dmnu.z(dmls0) ? 0x7F151E4A : 0x7F151E48));  // string:pay_frw_backup_failed_with_these "Couldn\'t back up these transit passes"
        ibuq.e(charSequence0, "getText(...)");
        viewHeader0.j(charSequence0);
        CharSequence charSequence1 = this.requireContext().getText((dmnu.z(dmls0) ? 0x7F151E4B : 0x7F151E49));  // string:pay_frw_backup_failed_with_these_seek_help "Something went wrong backing 
                                                                                                                // up these transit passes. Try again or call the transit agency for help."
        ibuq.e(charSequence1, "getText(...)");
        viewHeader0.i(charSequence1);
        viewHeader0.h(dzdt.e(this.requireContext(), 0x7F080570, 0x7F0402C1));  // drawable:gs_error_vd_theme_48
        ActionBar actionBar0 = (ActionBar)view0.findViewById(0x7F0B0ABF);  // id:action_bar
        CharSequence charSequence2 = this.getText(0x7F1508F2);  // string:common_try_again "Try again"
        ibuq.e(charSequence2, "getText(...)");
        ftrz ftrz0 = new ftrz(charSequence2, new dmns(this, dmls0));
        if(dmnu.z(dmls0)) {
            CharSequence charSequence3 = this.getText(0x7F151E52);  // string:pay_frw_continue_anyway "Continue anyway"
            ibuq.e(charSequence3, "getText(...)");
            ftrz1 = new ftrz(charSequence3, new dmnq(this));
        }
        else {
            CharSequence charSequence4 = this.getText(0x7F1507F2);  // string:common_cancel "Cancel"
            ibuq.e(charSequence4, "getText(...)");
            ftrz1 = new ftrz(charSequence4, new dmnr(this));
        }
        actionBar0.l(ftrz0, ftrz1);
        if(dmnu.z(dmls0)) {
            this.postponeEnterTransition();
            RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1C3B);  // id:pay_frw_card_list
            this.requireContext();
            recyclerView0.ap(new LinearLayoutManager());
            Context context0 = this.requireContext();
            dsoz dsoz0 = this.b;
            if(dsoz0 == null) {
                ibuq.j("imageTargetLoader");
                dsoz0 = null;
            }
            recyclerView0.an(new dmnc(context0, dsoz0, false, dmls0.c));
            ibuq.c(recyclerView0);
            keh.b(recyclerView0, new dmnt(this));
            return;
        }
        View view1 = view0.findViewById(0x7F0B05D9);  // id:NestedScrollView
        if(view1 != null) {
            view1.setVisibility(8);
        }
        View view2 = view0.findViewById(0x7F0B0368);  // id:Divider
        if(view2 != null) {
            view2.setVisibility(8);
        }
    }

    public final dmpe y() {
        dmpe dmpe0 = this.a;
        if(dmpe0 != null) {
            return dmpe0;
        }
        ibuq.j("viewModel");
        return null;
    }

    private static final boolean z(dmls dmls0) {
        return !dmls0.b.isEmpty();
    }
}

