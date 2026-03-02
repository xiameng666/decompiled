import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.chimera.IntentOperation;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.util.ArrayList;
import java.util.Locale;

public final class fvwf extends fxmn {
    public Button a;
    private Button al;

    @Override  // fxmn
    protected final void A() {
        fxmr.b(this.c, EAlertUxArgs.a(1, huqb.i(), this.ag));
    }

    @Override  // fxmn
    protected final void B() {
        this.a.setVisibility(8);
        this.al.setVisibility(0);
    }

    @Override  // fxmn
    protected final void C() {
        this.c.getWindow().addFlags(0x4280480);
        this.c.getWindow().getDecorView().setSystemUiVisibility(0x1706);
        this.c.getTheme().applyStyle(0x7F1603A6, true);  // style:EewAppTheme
        fxmp.e(this.c);
        im im0 = this.c.hL();
        if(im0 != null) {
            im0.h();
        }
        xni xni0 = this.c;
        if((xni0.getApplicationContext().getResources().getConfiguration().screenLayout & 15) < 3) {
            xni0.setRequestedOrientation(1);
        }
    }

    @Override  // fxmn
    protected final void D(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        this.d = layoutInflater0.inflate(0x7F0E0314, viewGroup0, false);  // layout:ealert_take_action_v2
        if(this.ag.n == 2) {
            View view0 = this.d.findViewById(0x7F0B11CB);  // id:ealert_call_to_action_v_dch_panel_id
            View view1 = this.d.findViewById(0x7F0B11CC);  // id:ealert_call_to_action_v_protect_panel_id
            if(view0 != null && view1 != null) {
                view0.setVisibility(8);
                view1.setVisibility(0);
            }
        }
        TextView textView0 = (TextView)this.d.findViewById(0x7F0B22B8);  // id:title
        if(this.ag.g) {
            textView0.setText("Test " + this.getString(0x7F150EBB));  // string:ealert_take_action_title "Earthquake"
        }
        TextView textView1 = (TextView)this.d.findViewById(0x7F0B223B);  // id:take_action_eew_magnitude
        TextView textView2 = (TextView)this.d.findViewById(0x7F0B223A);  // id:take_action_eew_distance
        textView1.setText((this.ag.r ? String.format(Locale.getDefault(), "Estimated magnitude %.1f", ((float)this.ag.c)) : ""));
        double f = this.ag.e;
        if(fxmp.g(Locale.getDefault())) {
            textView2.setText(this.c.getString(0x7F150DF1, new Object[]{((double)(f * 0.621371))}));  // string:distance_to_epicenter_mile "%.1f miles away"
        }
        else {
            textView2.setText(this.c.getString(0x7F150DF0, new Object[]{f}));  // string:distance_to_epicenter_km "%.1f km away"
        }
        ((TextView)this.d.findViewById(0x7F0B223C)).setText(this.getString((this.ag.m == 2 ? 0x7F151468 : 0x7F150EBA)));  // id:take_action_footer
        this.a = (Button)this.d.findViewById(0x7F0B223E);  // id:take_action_mute
        this.al = (Button)this.d.findViewById(0x7F0B223F);  // id:take_action_next
        if(this.ah) {
            Button button0 = (Button)this.d.findViewById(0x7F0B223F);  // id:take_action_next
            this.al = button0;
            button0.setText(0x7F150785);  // string:close_demo "Close Demo"
            this.al.setOnClickListener(new fvwb(this));
            return;
        }
        this.a.setVisibility(0);
        this.al.setVisibility(8);
        this.a.setOnTouchListener(new fvwc(this));
        this.a.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> if(this.ai) {
            Button button0 = this.a;
            if(button0 != null && this.al != null) {
                button0.setVisibility(8);
                this.al.setVisibility(0);
                this.y(false);
                fxmt.b().a(this.ag.h, this.ag.i, this.ag.k, 13);
            }
        });
        this.al.setOnClickListener(new fvwe(this));
    }

    @Override  // fxmn
    public final void onDestroy() {
        super.onDestroy();
        this.y(false);
    }

    protected final void y(boolean z) {
        if(this.ai) {
            this.F();
            if(!z && huqb.P() && this.c.getIntent() != null && this.c.getIntent().hasExtra("TALK_TO_NODE_IDS_ARG")) {
                ArrayList arrayList0 = this.c.getIntent().getStringArrayListExtra("TALK_TO_NODE_IDS_ARG");
                batl.s(arrayList0);
                if(arrayList0.isEmpty()) {
                    ((ggtj)fxmn.b.h()).x("No nearby nodes to mute");
                    return;
                }
                ((ggtj)fxmn.b.h()).x("Requesting mute on nearby nodes");
                Intent intent0 = IntentOperation.getStartIntent(this.c, "com.google.android.location.ealert.EAlertTalkToNodeIntentOperation", "com.google.android.gms.location.EALERT_TALK_TO_WEAR");
                batl.s(intent0);
                intent0.putExtra("EALERT_PATH_TO_TALK_ARG", "/ealert_mute_alarm");
                intent0.putStringArrayListExtra("TALK_TO_NODE_IDS_ARG", arrayList0);
                this.c.startService(intent0);
            }
        }
    }

    // Detected as a lambda impl.
    public final void z(boolean z) {
        if(this.ai) {
            Button button0 = this.a;
            if(button0 != null && this.al != null) {
                button0.setVisibility(8);
                this.al.setVisibility(0);
                this.y(z);
                fxmt.b().a(this.ag.h, this.ag.i, this.ag.k, 13);
            }
        }
    }
}

