import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import j..util.Objects;
import j..util.Optional;

public final class csbe extends du {
    public xob a;
    private csdh ag;
    private final csle ah;
    public csld b;
    public Bundle c;
    private static final bboh d;

    static {
        csbe.d = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public csbe() {
        this.ah = new csle();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.a = (xob)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s1;
        View view0 = layoutInflater0.inflate(0x7F0E0335, viewGroup0, false);  // layout:esim_download_fragment
        csld csld0 = (csld)new lso(this.a, this.ah).a(csld.class);
        this.b = csld0;
        this.c = csld0.a();
        if(this.b.d.getBoolean("ESIM_SUCCESS")) {
            if(hvlq.q()) {
                MobileDataPlanDetailChimeraActivity.l(this.a, this.c, this.b.b);
                return view0;
            }
            MobileDataPlanDetailChimeraActivity.q(this.a);
            return view0;
        }
        MobileDataPlanDetailChimeraActivity.m(this, this.a, this.c);
        try {
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B12BD);  // id:esim_download_logo
            txc.d(this.a).h(this.b.g(this.a)).k(imageView0);
            ((ggtj)csbe.d.h()).x("eSIM download page logo loaded.");
            this.ag = new csdh(this.a, this, this.b);
        }
        catch(IllegalArgumentException | NullPointerException unused_ex) {
            cscb.B(this.a, this.c, hhct.dx, this.b.b);
            return view0;
        }
        ((Button)view0.findViewById(0x7F0B12B7)).setOnClickListener(new csba(this));  // id:esim_download_button
        TextView textView0 = (TextView)view0.findViewById(0x7F0B12BA);  // id:esim_download_header
        textView0.setText(this.getString(0x7F150F56, new Object[]{csld.f(this.c)}));  // string:esim_download_header "Your %s eSIM is ready. To start using the data plan, 
                                                                                      // activate your eSIM."
        if(hvlq.q()) {
            Optional optional0 = Optional.ofNullable(this.c.getString("esim_download_header"));
            Objects.requireNonNull(textView0);
            optional0.ifPresent(new csbb(textView0));
        }
        ((TextView)view0.findViewById(0x7F0B12C1)).setText(this.c.getString("esim_name"));  // id:esim_download_person_name
        ((TextView)view0.findViewById(0x7F0B12B8)).setText(this.c.getString("esim_email"));  // id:esim_download_email
        ((TextView)view0.findViewById(0x7F0B12B3)).setText(this.c.getString("esim_address_line_1"));  // id:esim_download_address_line_1
        if(this.c.containsKey("esim_address_line_2")) {
            TextView textView1 = (TextView)view0.findViewById(0x7F0B12B4);  // id:esim_download_address_line_2
            textView1.setText(this.c.getString("esim_address_line_2"));
            textView1.setVisibility(0);
        }
        ((TextView)view0.findViewById(0x7F0B12B5)).setText(this.c.getString("esim_address_line_3"));  // id:esim_download_address_line_3
        ((TextView)view0.findViewById(0x7F0B12B6)).setText(this.c.getString("esim_address_line_4"));  // id:esim_download_address_line_4
        ((TextView)view0.findViewById(0x7F0B12C4)).setText(this.c.getString("esim_phone_number"));  // id:esim_download_phone_number
        if(this.b.p() && this.c.containsKey("ESIM_PLAN_DETAILS")) {
            TextView textView2 = (TextView)view0.findViewById(0x7F0B12C6);  // id:esim_download_price
            TextView textView3 = (TextView)view0.findViewById(0x7F0B12C5);  // id:esim_download_plan_name
            View view1 = view0.findViewById(0x7F0B12C8);  // id:esim_download_price_info
            Optional optional1 = Optional.ofNullable(((MdpUpsellPlan)this.c.getParcelable("ESIM_PLAN_DETAILS")));
            if(!optional1.isEmpty()) {
                MdpUpsellPlan mdpUpsellPlan0 = (MdpUpsellPlan)optional1.get();
                String s = mdpUpsellPlan0.b;
                try {
                    s1 = csgn.e(mdpUpsellPlan0.d, mdpUpsellPlan0.e);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    ((ggtj)((ggtj)csbe.d.j()).s(illegalArgumentException0)).B("Carrier provides wrong currency string %s", mdpUpsellPlan0.e);
                    this.b.l(hhct.em);
                    return view0;
                }
                textView3.setText(s);
                textView2.setText(s1);
                view1.setVisibility(0);
            }
        }
        this.b.l(hhct.em);
        return view0;
    }

    public final void y() {
        try {
            new crxu().o(this.c.getInt("ESIM_CODE_NOTIFICATION"));
            String s = this.c.getString("esim_activation_code");
            batl.s(s);
            this.b.v(this.a, 15, false);
            this.ag.a(s);
        }
        catch(NullPointerException nullPointerException0) {
            a.ae(csbe.d.j(), "Failed to launch Euicc activity", nullPointerException0);
            cscb.B(this.a, this.c, hhct.dx, this.b.b);
        }
    }
}

