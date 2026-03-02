import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.button.MaterialButton;
import dagger.internal.Preconditions;

public final class duoy extends dokz implements fshb {
    public final gfsx a;
    public static final int b;
    private String c;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public duoy() {
        this.a = gfqx.a;
    }

    private final void A(TextView textView0, Context context0) {
        if(!TextUtils.isEmpty(this.c)) {
            textView0.setVisibility(0);
            textView0.setText(context0.getString(0x7F151D46, new Object[]{this.c}));  // string:pay_drivers_license_error_code_text "Code: %1$s"
        }
    }

    @Override  // fshb
    public final int kd() {
        return hwle.g() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        Preconditions.b(this.ap());
        dpsw.a(doly0, this.ap());
        dumn dumn0 = new dumn();
        this.a.f(dumn0);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = this.am().getString("mdoc_error_code", "");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate((hwev.c() ? 0x7F0E0589 : 0x7F0E0588), viewGroup0, false);  // layout:mdoc_provisioning_failed_fragment_exp
        dvco.a(view0, this.requireContext());
        int v = 0x7F151D44;  // string:pay_drivers_license_device_ineligible_details "This device doesn\'t support 
                             // IDs in Wallet"
        int v1 = 0x7F151D45;  // string:pay_drivers_license_device_ineligible_title "Can\'t add an ID"
        if(hwev.c()) {
            ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
            ComposeActionBar composeActionBar0 = (ComposeActionBar)view0.findViewById(0x7F0B0012);  // id:ActionBar
            TextView textView0 = (TextView)view0.findViewById(0x7F0B03B3);  // id:ErrorCode
            boolean z = ibuq.m(this.c, String.valueOf(ftqn.a(hajj.class, hajj.b)));
            fugt fugt0 = new fugt(new fryh(0x7F08056F), null, new frxo(0x7F0402C1), null, 24);  // drawable:gs_error_vd_theme_40
            if(!z) {
                v1 = 0x7F1520C6;  // string:pay_s2gpt_templated_error_header "Something went wrong"
            }
            fryr fryr0 = new fryr(v1);
            if(!z) {
                v = 0x7F151D8E;  // string:pay_drivers_license_provisioning_failure_try_again "Make sure you\'re connected 
                                 // to the internet and try again."
            }
            composeViewHeader0.b(new fuhm(fugt0, fryr0, new fryr(v)));
            composeActionBar0.d(new ftuw(new ftts(new fryr(0x7F150870), null, false, null, null, null, 0, null, null, new duow(this), 510), null, false, ftvd.a, null, null, null, true, 0x76));  // string:common_got_it "Got it"
            ibuq.c(textView0);
            this.A(textView0, this.requireContext());
        }
        else {
            TextView textView1 = (TextView)view0.findViewById(0x7F0B04FB);  // id:LaunchMdlDataCollectionTitle
            TextView textView2 = (TextView)view0.findViewById(0x7F0B04F9);  // id:LaunchMdlDataCollectionBody
            TextView textView3 = (TextView)view0.findViewById(0x7F0B03B3);  // id:ErrorCode
            ((MaterialButton)view0.findViewById(0x7F0B0460)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                dmqm dmqm0 = new dmqm();
                dmqm0.h(29);
                this.startActivity(dmqm0.c().addFlags(0x4000000));
            });
            Context context0 = this.requireContext();
            if(ibuq.m(this.c, String.valueOf(ftqn.a(hajj.class, hajj.b)))) {
                textView1.setText("Can\'t add an ID");
                textView2.setText("This device doesn\'t support IDs in Wallet");
            }
            else {
                textView1.setText("Something went wrong");
                textView2.setText("Make sure you\'re connected to the internet and try again.");
            }
            ibuq.c(textView3);
            this.A(textView3, context0);
        }
        ibuq.c(view0);
        return view0;
    }

    @Override  // du
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.y();
            return true;
        }
        return false;
    }

    // Detected as a lambda impl.
    public final void y() {
        dmqm dmqm0 = new dmqm();
        dmqm0.h(29);
        this.startActivity(dmqm0.c().addFlags(0x4000000));
    }
}

