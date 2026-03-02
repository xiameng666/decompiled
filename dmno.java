import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ViewHeader;

public final class dmno extends du {
    dmpe a;
    edon b;
    dmmm c;

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        String s = ((xni)context0).getIntent().getStringExtra("session_id");
        gftb.check(s);
        dmox dmox0 = new dmox(s);
        dmmm dmmm0 = new dmmm(new dlmk(((xni)context0)), dmox0);
        if(this.c == null) {
            this.c = dmmm0;
        }
        this.c.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E06DC, viewGroup0, false);  // layout:pay_frw_backup_failed_fragment
        String s = this.a.n == 3 ? this.getString(0x7F151E58) : this.getString(0x7F151E48);  // string:pay_frw_remove_failed "Couldn\'t remove your balance"
        ViewHeader viewHeader0 = (ViewHeader)view0.findViewById(0x7F0B047D);  // id:HeaderView
        viewHeader0.j(s);
        viewHeader0.h(dzdt.e(this.requireContext(), 0x7F080570, 0x7F0402C1));  // drawable:gs_error_vd_theme_48
        ((ActionBar)view0.findViewById(0x7F0B0ABF)).l(new ftrz(this.getText(0x7F1508F2), new dmnm(this)), new ftrz(this.getText(0x7F1507F2), new dmnn(this)));  // id:action_bar
        return view0;
    }
}

