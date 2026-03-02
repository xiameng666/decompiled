import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class dxus extends tk {
    public final du a;
    public gtum e;
    public hjwt f;
    public hjqn g;
    public long h;
    public ftej i;
    public ftej j;
    private final dmgi k;
    private boolean l;
    private boolean m;

    public dxus(du du0, dmgi dmgi0) {
        this.a = du0;
        this.k = dmgi0;
        this.B(true);
    }

    @Override  // tk
    public final int b() {
        return this.l || this.m ? 1 : 0;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new uq(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0B71, viewGroup0, false));  // layout:topup_settings
    }

    public final void f(boolean z, boolean z1) {
        this.l = z;
        this.m = z1;
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        View view0 = uq0.a;
        if(this.l && this.f != null) {
            Button button0 = (Button)view0.findViewById(0x7F0B00A7);  // id:AutoloadActionButton
            TextView textView0 = (TextView)view0.findViewById(0x7F0B00A1);  // id:AutoLoadSettingStatus
            if(dxtg.j(this.e)) {
                gftb.check(view0.getContext());
                button0.setText("Manage");
                gftb.check(view0.getContext());
                button0.setContentDescription("Manage autoload");
                textView0.setVisibility(0);
                Context context0 = view0.getContext();
                gftb.check(context0);
                textView0.setText(context0.getString(0x7F1521FA, new Object[]{fscd.c((this.e.d == null ? gtlg.a : this.e.d))}));  // string:pay_setting_status_description "Below %1$s"
            }
            else {
                button0.setText(0x7F1521F3);  // string:pay_setting_action_button "Turn it on"
                gftb.check(view0.getContext());
                button0.setContentDescription("Set up autoload");
                textView0.setVisibility(8);
            }
            view0.findViewById(0x7F0B00A7).setOnClickListener(new dxur(this));  // id:AutoloadActionButton
        }
        else if(view0.findViewById(0x7F0B009F) != null) {  // id:AutoLoadSetting
            view0.findViewById(0x7F0B009F).setVisibility(8);  // id:AutoLoadSetting
        }
        if(this.m && this.f != null) {
            Button button1 = (Button)view0.findViewById(0x7F0B00B5);  // id:BalanceNotificationActionButton
            TextView textView1 = (TextView)view0.findViewById(0x7F0B055B);  // id:LowBalanceSettingStatus
            if(button1 != null && textView1 != null) {
                if(dxtg.m(this.e)) {
                    button1.setText("Manage");
                    gftb.check(view0.getContext());
                    button1.setContentDescription("Manage low balance notification");
                    textView1.setVisibility(0);
                    Context context1 = view0.getContext();
                    gftb.check(context1);
                    textView1.setText(context1.getString(0x7F1521FA, new Object[]{fscd.c((this.e.d == null ? gtlg.a : this.e.d))}));  // string:pay_setting_status_description "Below %1$s"
                }
                else {
                    button1.setText("Turn it on");
                    gftb.check(view0.getContext());
                    button1.setContentDescription("Turn on low balance notification");
                    textView1.setVisibility(8);
                }
                view0.findViewById(0x7F0B00B5).setOnClickListener(new dxuq(this));  // id:BalanceNotificationActionButton
            }
            return;
        }
        view0.findViewById(0x7F0B0559).setVisibility(8);  // id:LowBalanceSetting
    }

    public final void n(hagp hagp0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hagq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hagq hagq0 = (hagq)hftp1.b_message;
        hagq0.b = hagp0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hagq hagq1 = (hagq)hftp1.N_build();
        hagq1.getClass();
        hapr0.am = hagq1;
        hapr0.d |= 0x100;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.k.b(hapr1);
    }
}

