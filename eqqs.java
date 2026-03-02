import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.d2d.ui.accountpicker.AccountCard;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;

public final class eqqs extends eqor {
    @Override  // eqor
    public final void onViewCreated(View view0, Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        batl.t(bundle1, "Arguments cannot be null - this should never happen");
        ParcelableDeviceOwner parcelableDeviceOwner0 = (ParcelableDeviceOwner)bundle1.getParcelable("defaultAccount");
        batl.t(parcelableDeviceOwner0, "Default account cannot be null");
        AccountCard accountCard0 = (AccountCard)this.c.findViewById(0x7F0B0FE3).findViewById(0x7F0B0A62);  // id:content_container
        accountCard0.a(parcelableDeviceOwner0);
        eqqp eqqp0 = new eqqp(this, bundle1);
        eqqq eqqq0 = new eqqq(this, bundle1);
        int v = 1;
        if(hyfy.c()) {
            accountCard0.b();
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)((LinearLayout)accountCard0.a.findViewById(0x7F0B0A63)).getLayoutParams();  // id:account_card_content_layout
            if(frameLayout$LayoutParams0 != null) {
                frameLayout$LayoutParams0.setMarginStart(0);
                frameLayout$LayoutParams0.setMarginEnd(0);
            }
            gaff gaff0 = (gaff)this.c.t(gaff.class);
            gafh gafh0 = gaff0.k;
            gafh0.f(0);
            gafh0.f = eqqp0;
            String s = parcelableDeviceOwner0.c;
            if(s == null) {
                gafh0.d(this.getString(0x7F15080A));  // string:common_confirm "Confirm"
            }
            else {
                gafh0.d(this.getString(0x7F152E50, new Object[]{s}));  // string:smartdevice_d2d_account_picker_continue_text "Continue as %s"
            }
            if(bundle1.getBoolean("showOtherAccountsButton")) {
                gafh gafh1 = gaff0.l;
                gafh1.f(0);
                gafh1.f = eqqq0;
                gafh1.d(this.getResources().getQuantityString(0x7F130095, 1));  // plurals:smartdevice_d2d_account_picker_choose_other_text
            }
            UiCustomization uiCustomization0 = (UiCustomization)bundle1.getParcelable("uiCustomization");
            if(!hygx.g() || uiCustomization0 == null) {
                return;
            }
            eqpc.a(uiCustomization0, this.c);
            return;
        }
        View view1 = this.c.findViewById(0x7F0B0FE3);  // id:content_container
        Button button0 = (Button)view1.findViewById(0x7F0B0DA8);  // id:button_continue
        Button button1 = (Button)view1.findViewById(0x7F0B0DA5);  // id:button_choose_other
        boolean z = bundle1.getBoolean("showOtherAccountsButton");
        int v1 = z ? 0 : 8;
        button0.setVisibility(v1);
        button1.setVisibility(v1);
        if(z) {
            button0.setOnClickListener(eqqp0);
            button1.setOnClickListener(eqqq0);
            String s1 = parcelableDeviceOwner0.c;
            if(s1 == null) {
                button0.setText(this.getString(0x7F150815));  // string:common_continue "Continue"
            }
            else {
                button0.setText(this.getString(0x7F152E50, new Object[]{s1}));  // string:smartdevice_d2d_account_picker_continue_text "Continue as %s"
            }
            Resources resources0 = this.getResources();
            if(bundle1.getBoolean("multiSelectEnabled")) {
                v = 2;
            }
            button1.setText(resources0.getQuantityString(0x7F130095, v));  // plurals:smartdevice_d2d_account_picker_choose_other_text
            Context context0 = this.getContext();
            if(context0 != null && gaec.B(context0)) {
                gaiz.a(context0, button0);
                boolean z1 = gaec.y(context0);
                gafj.b(context0, button1, z1, false, new gada((gaec.h(context0).c(context0, gaea.I) == 0 || z1 ? 0x7F1608AB : 0x7F1608AA), gaea.I, gaea.B, gaea.C, gaea.E, null, gaea.J, gaea.K, gaea.x, gaea.z, gaea.j, gaea.k, gaea.y, gaea.v, gaea.w));  // style:SucPartnerCustomizationButton.Secondary
                eqpc.b(context0, button0);
            }
            return;
        }
        gafh gafh2 = ((gaff)this.c.t(gaff.class)).k;
        gafh2.f(0);
        gafh2.d(this.getString(0x7F15089B));  // string:common_next "Next"
        gafh2.f = eqqp0;
    }

    @Override  // eqor
    public final void y(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        layoutInflater0.inflate(0x7F0E09DD, viewGroup0, true);  // layout:smartdevice_default_account_prompt
    }
}

