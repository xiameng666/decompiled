import android.accounts.Account;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import com.android.settingslib.widget.MainSwitchBar;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;

public final class egsq extends egsx {
    public static final bboh a;
    public SwitchCompat ag;
    public MainSwitchBar ah;
    public ViewGroup ai;
    public AppCompatTextView aj;
    public AppCompatTextView ak;
    public ArrayList al;
    public AppCompatTextView am;
    public lqd an;
    public boolean ao;
    public boolean ap;
    public gfsx aq;
    public boolean ar;
    boolean as;
    public final boolean at;
    public int au;
    private ViewGroup aw;
    private ViewGroup ax;
    private lqd ay;
    private final View.OnClickListener az;
    Account b;
    eguv c;
    public AccountParticleDisc d;

    static {
        egsq.a = bboh.b("BackupAndSyncFragment", bbcu.f);
    }

    public egsq() {
        this.aq = gfqx.a;
        this.as = true;
        this.at = true;
        this.az = new egsn(this);
    }

    public final void A() {
        if(this.at) {
            this.ah.c(false);
        }
        else {
            this.ag.setChecked(false);
        }
        this.z(false);
    }

    // Detected as a lambda impl.
    public final void B(int v) {
        this.c.r = true;
        Intent intent0 = egxj.d(this.b, "Pick account for backup", this.al);
        this.H(4);
        this.startActivityForResult(intent0, v);
    }

    public final void C() {
        this.B(2);
    }

    @Override  // egsx
    public final int D() {
        return 5;
    }

    public final void E() {
        if(this.at) {
            this.ah.setEnabled(false);
            return;
        }
        this.ag.setEnabled(false);
        this.aw.setEnabled(false);
    }

    public final void F() {
        Toast.makeText(this.getContext(), 0x7F1508E3, 1).show();  // string:common_something_went_wrong "Something went wrong"
    }

    public final void G(int v, evql evql0) {
        egvc egvc0 = this.av;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqr)hftp0.b_message).c = v - 1;
        ((giqr)hftp0.b_message).b |= 1;
        int v1 = evql0.n() ? 2 : 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giqr)hftp0.b_message).d = v1 - 1;
        ((giqr)hftp0.b_message).b |= 2;
        egvc0.d(5, ((giqr)hftp0.N_build()), egxj.g(this.b));
    }

    public final void H(int v) {
        this.av.f(v, 5, egxj.g(this.b));
    }

    public final void I(int v, boolean z) {
        this.av.h(v, 5, egxj.g(this.b), egxj.r(this.J().getContainerActivity()), z);
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        eguv eguv0 = (eguv)new lso(this.J(), this.K()).a(eguv.class);
        this.c = eguv0;
        this.ay = eguv0.d;
        egsj egsj0 = new egsj(this);
        eguv0.d.g(this, egsj0);
        this.an = this.c.e;
        egqy egqy0 = (egqy)this.J();
        this.d.h(egqy0.b(), new fntn());
        this.aq = egik.f();
        if(bundle0 == null) {
            this.L();
            if(this.aq.i()) {
                ((egik)this.aq.d()).a.a(bbdg.fd);
            }
        }
        TypedArray typedArray0 = this.J().getTheme().obtainStyledAttributes(this.J().getThemeResId(), new int[]{0x101009B});
        this.au = typedArray0.getColor(0, 0);
        typedArray0.recycle();
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        lqd lqd0;
        if(v1 == -1 && intent0 != null) {
            switch(v) {
                case 1: {
                    v = 1;
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    return;
                }
            }
            String s = intent0.getStringExtra("authAccount");
            if(!TextUtils.isEmpty(s)) {
                egsd egsd0 = new egsd(this.getContext());
                if(this.ar) {
                    egsd0.b(s, true, this.am.getVisibility());
                }
                else {
                    egsd0.a(s, true, this.am.getVisibility());
                }
                if(this.ar) {
                    lqd0 = this.c.b(s);
                }
                else {
                    egsw egsw0 = this.c.x;
                    bxox bxox0 = new bxox();
                    egbk egbk0 = new egbk();
                    egbk0.b = true;
                    BackupAndSyncOptInOptions backupAndSyncOptInOptions0 = egbk0.a();
                    egsw0.a.e(s, backupAndSyncOptInOptions0).z(new egsu(egsw0, bxox0));
                    lqd0 = bxox0;
                }
                lqd0.g(this, new egse(this, s, v));
                super.onActivityResult(v, -1, intent0);
            }
        }
    }

    @Override  // egsx
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 != null) {
            this.as = bundle0.getBoolean("show_upgrade_dialog");
        }
        if(hwzg.g()) {
            this.getChildFragmentManager().af("v1_to_v2_sheepdog_opt_in", this, new egsi(this));
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0187, viewGroup0, false);  // layout:backup_sync_fragment_gm3
        this.ar = this.requireArguments().getBoolean("show_backup_and_sync_v2_consent");
        this.ai = (ViewGroup)view0.findViewById(0x7F0B0FD4);  // id:content
        this.d = (AccountParticleDisc)view0.findViewById(0x7F0B1FA1);  // id:selected_account_particle_disc
        this.c = (eguv)new lso(this.J(), this.K()).a(eguv.class);
        if(hwzg.g()) {
            this.c.w.g(this.getViewLifecycleOwner(), new egsk(this));
        }
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
        ((xni)this.J()).hG(toolbar0);
        ((xni)this.J()).hL().o(true);
        if(this.ar) {
            toolbar0.C(0x7F152508);  // string:people_backup_sync_activity_title_v2 "Sync device and SIM contacts"
        }
        else {
            toolbar0.C(0x7F152507);  // string:people_backup_sync_activity_title "Back up & sync"
        }
        ((ViewGroup)view0.findViewById(0x7F0B0A71)).setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
            this.c.r = true;
            Intent intent0 = egxj.d(this.b, "Pick account for backup", this.al);
            this.H(4);
            this.startActivityForResult(intent0, 1);
        });
        this.ax = (ViewGroup)view0.findViewById(0x7F0B0C4F);  // id:backup_account_container
        if(this.at) {
            this.ah = (MainSwitchBar)view0.findViewById(0x7F0B0C80);  // id:backup_sync_toggle_bar
            if(sku.a(this.getContext())) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.ah.getLayoutParams();
                viewGroup$MarginLayoutParams0.setMarginStart(this.getContext().getResources().getDimensionPixelSize(0x7F071357));  // dimen:sync_toggle_bar_margin_start
                viewGroup$MarginLayoutParams0.setMarginEnd(this.getContext().getResources().getDimensionPixelSize(0x7F071356));  // dimen:sync_toggle_bar_margin_end
                this.ah.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
            if(this.ar) {
                this.ah.e(this.getString(0x7F152511));  // string:people_backup_sync_v2_toggle_text "Sync device and SIM contacts automatically"
            }
            this.ah.setOnClickListener(this.az);
            egxj.j(((NestedScrollView)view0.findViewById(0x7F0B0FEA)));  // id:content_scroll_view
        }
        else {
            TextView textView0 = (TextView)view0.findViewById(0x7F0B0C82);  // id:backup_sync_toggle_text
            if(this.ar) {
                textView0.setText(0x7F152511);  // string:people_backup_sync_v2_toggle_text "Sync device and SIM contacts automatically"
            }
            this.ag = (SwitchCompat)view0.findViewById(0x7F0B0C7F);  // id:backup_sync_toggle
            ViewGroup viewGroup1 = (ViewGroup)view0.findViewById(0x7F0B0C81);  // id:backup_sync_toggle_container
            this.aw = viewGroup1;
            viewGroup1.setOnClickListener(this.az);
        }
        egxj.j(((NestedScrollView)view0.findViewById(0x7F0B0FEA)));  // id:content_scroll_view
        if(this.ar) {
            ((TextView)view0.findViewById(0x7F0B0CF5)).setText(0x7F15250F);  // id:bottom_information_text
        }
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B166C);  // id:help_and_feedback
        imageView0.setImageResource(0x7F080D45);  // drawable:quantum_ic_help_outline_vd_theme_24
        imageView0.setOnClickListener(new egsm(this));
        egxj.i(imageView0, imageView0.getContext().getResources().getDimensionPixelSize(0x7F070076));  // dimen:accessibility_required_min_touch_target_height
        AppCompatTextView appCompatTextView0 = (AppCompatTextView)view0.findViewById(0x7F0B0FC7);  // id:contacts_not_backed_up
        this.am = appCompatTextView0;
        appCompatTextView0.setCompoundDrawablesRelativeWithIntrinsicBounds(0x7F080BA2, 0, 0, 0);  // drawable:quantum_gm_ic_info_vd_theme_24
        this.ao = true;
        this.am.addOnLayoutChangeListener(new egso(this));
        this.ak = (AppCompatTextView)view0.findViewById(0x7F0B1178);  // id:display_name
        AppCompatTextView appCompatTextView1 = (AppCompatTextView)view0.findViewById(0x7F0B0A81);  // id:account_name
        this.aj = appCompatTextView1;
        appCompatTextView1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0x7F080D29, 0);  // drawable:quantum_ic_expand_more_vd_theme_24
        ((ImageView)view0.findViewById(0x7F0B2194)).setImageResource(0x7F080490);  // id:super_g
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1723);  // id:information_banner
        boolean z = this.ar;
        SpannableStringBuilder spannableStringBuilder0 = z ? new SpannableStringBuilder(this.getString(0x7F152510)) : new SpannableStringBuilder(this.getString(0x7F15250C));  // string:people_backup_sync_v2_information_banner "Google Contacts can automatically 
                                                                                                                                                                               // sync contacts on your device and SIM so they\'re backed up to your account and available 
                                                                                                                                                                               // across Google services and anywhere you sign in."
        spannableStringBuilder0.append(" ");
        int v = spannableStringBuilder0.length();
        if(z) {
            spannableStringBuilder0.append(this.getString(0x7F15166A));  // string:learn_more_contacts_sync "Learn more about contacts sync."
        }
        else {
            spannableStringBuilder0.append(this.getString(0x7F150879));  // string:common_learn_more "Learn more"
        }
        spannableStringBuilder0.setSpan(new egsp(this), v, spannableStringBuilder0.length(), 33);
        textView1.setText(spannableStringBuilder0);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.ai = null;
        this.d = null;
        this.ag = null;
        this.ah = null;
        this.ax = null;
        this.aw = null;
        this.aj = null;
        this.ak = null;
        this.am = null;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        eguv eguv0 = this.c;
        if(eguv0.r) {
            eguv0.r = false;
            return;
        }
        if(this.ao) {
            eguv0.l();
            return;
        }
        this.ay.k(this);
        this.ay = this.c.d;
        this.an.k(this);
        this.an = this.c.e;
        this.ay.g(this, new egsj(this));
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putBoolean("show_upgrade_dialog", this.as);
    }

    static egsq y(boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("show_backup_and_sync_v2_consent", z);
        egsq egsq0 = new egsq();
        egsq0.setArguments(bundle0);
        return egsq0;
    }

    public final void z(boolean z) {
        this.ax.setVisibility((z ? 0 : 8));
    }
}

