import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.gms.auth.proximity.phonehub.UpdateCameraRollAccessStateIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.UpdateLocalFeatureStateIntentOperation;
import com.google.android.gms.common.ui.URLSpanNoUnderline;

public final class alkt extends du {
    public String a;
    private boolean ag;
    private String ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private boolean ao;
    private bbpj ap;
    public boolean b;
    public aliu c;
    public alrs d;

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = new aliu();
        this.d = alrs.b(this, new alkn(this));
        this.ap = bbpj.a(this.getContext());
        Bundle bundle1 = this.getArguments();
        this.a = bundle1.getString("SELECTED_ACCOUNT");
        this.ag = bundle1.getBoolean("BETTER_TOGETHER_ENABLED");
        this.ah = bundle1.getString("DEVICE_NAME");
        this.b = "PHONE_HUB".equals(bundle1.getString("ORIGIN"));
        this.ai = bundle1.getBoolean("WIFI_SYNC_ENABLED");
        this.aj = bundle1.getBoolean("WIFI_SYNC_SUPPORTED");
        this.ak = bundle1.getBoolean("WIFI_SYNC_CONTROLLED_BY_TIDEPOOL");
        this.al = bundle1.getBoolean("HAS_CAMERA_ROLL_CLIENT_SUPPORT");
        this.am = bundle1.getBoolean("CAMERA_ROLL_ENABLED");
        this.an = bundle1.getBoolean("NOTIFICATIONS_ENABLED");
        this.ao = bundle1.getBoolean("PERSONAL_PROFILE_SYNC_ENABLED");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0190, viewGroup0, false);  // layout:better_together_settings_fragment
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1FE8);  // id:settings_subheadTextView
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1FD6);  // id:settings_headlineTextView
        TextView textView2 = (TextView)view0.findViewById(0x7F0B1FD3);  // id:settings_disclaimerTextView
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B1FD9);  // id:settings_imageView
        if(this.ah == null) {
            this.ah = this.getString(0x7F1508BE);  // string:common_phone_lowercase "phone"
        }
        if(this.ag) {
            if(this.aj) {
                boolean z = this.ai;
                Switch switch0 = (Switch)view0.findViewById(0x7F0B250B);  // id:wifiSyncToggle
                switch0.setVisibility(0);
                switch0.setChecked(z);
                switch0.setOnClickListener(new alkm(this, gqus.l, switch0));
                view0.findViewById(0x7F0B250C).setVisibility(0);  // id:wifiSyncToggleSummary
                view0.findViewById(0x7F0B1FB8).setVisibility(0);  // id:separator
            }
            if(this.ak) {
                LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B2508);  // id:wifiSyncInTidepoolRedirectContainer
                linearLayout0.setVisibility(0);
                linearLayout0.setOnClickListener(new alks(this));
                view0.findViewById(0x7F0B250A).setVisibility(0);  // id:wifiSyncInTidepoolRedirectTitle
                view0.findViewById(0x7F0B2509).setVisibility(0);  // id:wifiSyncInTidepoolRedirectSummary
            }
            if(this.al) {
                Switch switch1 = (Switch)view0.findViewById(0x7F0B0DF5);  // id:cameraRollToggle
                switch1.setVisibility(0);
                switch1.setChecked(this.am);
                switch1.setOnClickListener(new alkq(this, switch1));
                view0.findViewById(0x7F0B0DF6).setVisibility(0);  // id:cameraRollToggleSummary
                view0.findViewById(0x7F0B1FB8).setVisibility(0);  // id:separator
            }
            if(hpzm.y()) {
                Switch switch2 = (Switch)view0.findViewById(0x7F0B1A49);  // id:notificationsToggle
                switch2.setVisibility(0);
                switch2.setChecked(this.an);
                switch2.setOnClickListener(new alkr(this, switch2));
                view0.findViewById(0x7F0B1A4A).setVisibility(0);  // id:notificationsToggleSummary
                view0.findViewById(0x7F0B1FB8).setVisibility(0);  // id:separator
            }
            if(hpzm.s() && hpzm.A() && this.ap.h()) {
                Switch switch3 = (Switch)view0.findViewById(0x7F0B1C5B);  // id:personalProfileSyncToggle
                switch3.setVisibility(0);
                switch3.setChecked(this.ao);
                switch3.setOnClickListener(new alkp(this, switch3));
                view0.findViewById(0x7F0B1C5C).setVisibility(0);  // id:personalProfileSyncToggleSummary
                view0.findViewById(0x7F0B1FB8).setVisibility(0);  // id:separator
            }
            imageView0.setImageDrawable(this.getContext().getDrawable(0x7F0801EF));  // drawable:android_enabled
            imageView0.setContentDescription(this.getString(0x7F152A59));  // string:settings_summary_enabled "Linked to Chromebook"
            textView1.setText(0x7F152A59);  // string:settings_summary_enabled "Linked to Chromebook"
            textView0.setText(URLSpanNoUnderline.a(Html.fromHtml(this.getString(0x7F152A57, new Object[]{this.ah, this.z()}))));  // string:settings_subhead_enabled "Your %1$s and Chromebook will connect automatically. 
                                                                                                                                  // %2$s"
            Button button0 = (Button)view0.findViewById(0x7F0B1FD2);  // id:settings_disableButton
            button0.setVisibility(0);
            button0.setOnClickListener(new alko(this));
            textView2.setVisibility(8);
        }
        else {
            if(hpzt.a.b().x()) {
                if((this.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
                    imageView0.setImageDrawable(this.getContext().getDrawable(0x7F0801F1));  // drawable:android_setup_dark
                }
                else {
                    imageView0.setImageDrawable(this.getContext().getDrawable(0x7F0801F2));  // drawable:android_setup_light
                }
            }
            textView1.setText(this.getString(0x7F152A58, new Object[]{this.ah}));  // string:settings_summary_disabled "Your %s is not linked to a Chromebook"
            textView0.setText(URLSpanNoUnderline.a(Html.fromHtml(this.getString(0x7F152A56, new Object[]{this.z()}))));  // string:settings_subhead_disabled "Link devices so you can text from your computer, 
                                                                                                                         // share your phone\'s internet connection, and simplify unlocking.* Use your Chromebook 
                                                                                                                         // to set up.<br>%s"
        }
        textView0.setMovementMethod(LinkMovementMethod.getInstance());
        return view0;
    }

    public final void y(boolean z) {
        Intent intent0;
        Context context0 = this.getContext();
        if(hpzm.R()) {
            String s = this.a;
            intent0 = UpdateLocalFeatureStateIntentOperation.a(this.getContext(), s, z);
        }
        else {
            String s1 = this.a;
            intent0 = UpdateCameraRollAccessStateIntentOperation.a(this.getContext(), s1, z);
        }
        context0.startService(intent0);
        this.c.O(z);
    }

    private final String z() {
        return String.format("<a href=\"%s\">%s</a>", hpzt.c(), this.getString(0x7F150879));  // string:common_learn_more "Learn more"
    }
}

