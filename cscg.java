import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import j..util.Objects;
import j..util.Optional;

public final class cscg extends du {
    public xob a;
    private View ag;
    private final csle ah;
    public csld b;
    public Bundle c;
    public static final int d;

    static {
        bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cscg() {
        this.ah = new csle();
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.a = (xob)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.ag = layoutInflater0.inflate(0x7F0E0338, viewGroup0, false);  // layout:esim_landing_fragment
        this.b = (csld)new lso(this.a, this.ah).a(csld.class);
        MobileDataPlanDetailChimeraActivity.a(this, this.a);
        this.c = this.b.a();
        ImageView imageView0 = (ImageView)this.ag.findViewById(0x7F0B12E1);  // id:esim_landing_logo
        txc.d(this.a).h(this.b.g(this.a)).k(imageView0);
        TextView textView0 = (TextView)this.ag.findViewById(0x7F0B12EA);  // id:esim_landing_title
        String s = this.c.getString("headline_text");
        batl.s(s);
        textView0.setText(s);
        TextView textView1 = (TextView)this.ag.findViewById(0x7F0B12DD);  // id:esim_landing_first_text
        String s1 = this.c.getString("plan_description");
        batl.s(s1);
        textView1.setText(s1);
        this.b.n(this.ag, "device_info", 0x7F0B12E6, 0x7F0B12E4);  // id:esim_landing_second_text
        this.b.n(this.ag, "network_type", 0x7F0B12E9, 0x7F0B12E7);  // id:esim_landing_third_text
        this.b.n(this.ag, "performance_info", 0x7F0B12E0, 0x7F0B12DE);  // id:esim_landing_fourth_text
        this.b.n(this.ag, "important_disclaimer", 0x7F0B12B1, 0x7F0B12B1);  // id:esim_details_footer
        this.b.n(this.ag, "full_disclaimer", 0x7F0B12D9, 0x7F0B12D9);  // id:esim_landing_disclaimer
        if(this.c.getBoolean("enable_device_lock_prompt")) {
            if(hvlq.q()) {
                TextView textView2 = (TextView)this.ag.findViewById(0x7F0B12D8);  // id:esim_landing_device_lock_message
                Optional optional1 = Optional.ofNullable(this.c.getString("device_lock_prompt_text"));
                Objects.requireNonNull(textView2);
                optional1.ifPresent(new cscd(textView2));
            }
            Button button1 = (Button)this.ag.findViewById(0x7F0B12D4);  // id:esim_landing_button
            button1.setOnClickListener(new cscf(this));
            Button button2 = (Button)this.ag.findViewById(0x7F0B12DA);  // id:esim_landing_exit_button
            button2.setOnClickListener(new csce(this));
            if(hvlq.q()) {
                button1.setText(this.b.e("My device is unlocked", "My device is unlocked"));
                button2.setText(this.b.e("My device is locked", "My device is locked"));
            }
            TextView textView3 = (TextView)this.ag.findViewById(0x7F0B12D7);  // id:esim_landing_device_lock_info
            Intent intent0 = new Intent();
            if(cslj.a()) {
                intent0.setAction("android.settings.NETWORK_OPERATOR_SETTINGS");
            }
            else {
                intent0.setAction("android.settings.WIRELESS_SETTINGS");
            }
            csll csll0 = new csll(this.a, intent0);
            textView3.setText(cslm.b(((SpannedString)(this.b.q() ? this.a.getText(0x7F150F76) : this.a.getText(0x7F150F75))), csll0, "intent"));  // string:esim_landing_device_lock_info_untranslated " Not sure? Check your device 
                                                                                                                                                  // status in Settings "
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        else {
            this.ag.findViewById(0x7F0B12D6).setVisibility(8);  // id:esim_landing_confirmation
            Button button0 = (Button)this.ag.findViewById(0x7F0B12D5);  // id:esim_landing_button_next
            button0.setVisibility(0);
            button0.setOnClickListener(new cscf(this));
            if(hvlq.q()) {
                Optional optional0 = Optional.ofNullable(this.c.getString("continue_button_text"));
                Objects.requireNonNull(button0);
                optional0.ifPresent(new cscc(button0));
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = button0.getLayoutParams();
                if(this.c.getBoolean("enable_full_width_continue_button") && viewGroup$LayoutParams0 != null) {
                    viewGroup$LayoutParams0.width = -1;
                }
            }
        }
        this.b.l(hhct.eh);
        return this.ag;
    }
}

