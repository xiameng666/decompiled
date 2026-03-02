import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import com.android.settingslib.widget.MainSwitchBar;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.HashSet;

public final class egrw extends egsx {
    Account a;
    private boolean aA;
    private lqd aB;
    private LinearLayout aC;
    private LinearLayout aD;
    private TextView aE;
    private Button aF;
    private LinearLayout aG;
    private TextView aH;
    private RelativeLayout aI;
    private LinearLayout aJ;
    private ImageView aK;
    private TextView aL;
    private LinearLayout aM;
    private ImageView aN;
    private TextView aO;
    private LinearLayout aP;
    private ImageView aQ;
    private TextView aR;
    private ImageView aS;
    private TextView aT;
    private TextView aU;
    private ImageView aV;
    private ProgressBar aW;
    private AppCompatTextView aX;
    private lqd aY;
    private lqd aZ;
    public MainSwitchBar ag;
    public SwitchCompat ah;
    public MainSwitchBar ai;
    public boolean aj;
    public boolean ak;
    public efyq al;
    public boolean am;
    public LinearLayout an;
    public View ao;
    public gfsx ap;
    public final boolean aq;
    private final skl ar;
    private final CompoundButton.OnCheckedChangeListener as;
    private final skl at;
    private final CompoundButton.OnCheckedChangeListener au;
    private bayn aw;
    private ViewGroup ax;
    private ViewGroup ay;
    private final lqj az;
    public eguv b;
    public AccountParticleDisc c;
    public SwitchCompat d;

    public egrw() {
        this.ar = (/* MISSING LAMBDA PARAMETER */, boolean z) -> {
            this.C();
            ContentResolver.setSyncAutomatically(this.a, "com.android.contacts", z);
            this.T(6, z);
            if(this.ap.i()) {
                if(z) {
                    ((egik)this.ap.d()).e();
                }
                else {
                    ((egik)this.ap.d()).a.a(bbdg.fb);
                }
            }
            if(hwyp.a.c().K() && !z) {
                ContentResolver.cancelSync(this.a, "com.android.contacts");
            }
            this.b.n();
        };
        this.as = (/* MISSING LAMBDA PARAMETER */, boolean z) -> {
            this.C();
            ContentResolver.setSyncAutomatically(this.a, "com.android.contacts", z);
            this.T(6, z);
            if(this.ap.i()) {
                if(z) {
                    ((egik)this.ap.d()).e();
                }
                else {
                    ((egik)this.ap.d()).a.a(bbdg.fb);
                }
            }
            if(hwyp.a.c().K() && !z) {
                ContentResolver.cancelSync(this.a, "com.android.contacts");
            }
            this.b.n();
        };
        this.at = (/* MISSING LAMBDA PARAMETER */, boolean z) -> {
            if(z) {
                this.E(38);
                this.C();
                this.B(false);
                this.b.n();
                this.b.q(false);
            }
            else {
                this.E(35);
                eguv eguv0 = this.b;
                String s = this.a.name;
                try {
                    int v = eguv0.v.d(s);
                    int v1 = eguv0.v.c(s);
                    this.av.b(egxj.g(this.a));
                    egvw.y(this, v, v1);
                }
                catch(cjuh unused_ex) {
                    this.B(false);
                    this.getContext().getResources();
                    Toast.makeText(this.getContext(), "Failed to turn off sync", 0).show();
                    egvc egvc0 = this.av;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqs.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giqs)hftp0.b_message).c = 2;
                    ((giqs)hftp0.b_message).b |= 1;
                    egvc0.i(((giqs)hftp0.N_build()), this.a.name);
                }
            }
            this.b.k();
        };
        this.au = (/* MISSING LAMBDA PARAMETER */, boolean z) -> {
            if(z) {
                this.E(38);
                this.C();
                this.B(false);
                this.b.n();
                this.b.q(false);
            }
            else {
                this.E(35);
                eguv eguv0 = this.b;
                String s = this.a.name;
                try {
                    int v = eguv0.v.d(s);
                    int v1 = eguv0.v.c(s);
                    this.av.b(egxj.g(this.a));
                    egvw.y(this, v, v1);
                }
                catch(cjuh unused_ex) {
                    this.B(false);
                    this.getContext().getResources();
                    Toast.makeText(this.getContext(), "Failed to turn off sync", 0).show();
                    egvc egvc0 = this.av;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqs.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((giqs)hftp0.b_message).c = 2;
                    ((giqs)hftp0.b_message).b |= 1;
                    egvc0.i(((giqs)hftp0.N_build()), this.a.name);
                }
            }
            this.b.k();
        };
        this.az = new egrd(this);
        this.am = false;
        this.ap = gfqx.a;
        this.aq = true;
    }

    // Detected as a lambda impl.
    public final void A(egxb egxb0) {
        if(egxb0 == null) {
            this.aS.setVisibility(8);
            this.aV.setVisibility(8);
            this.aU.setVisibility(8);
            this.aT.setVisibility(8);
            this.aW.setVisibility(8);
            return;
        }
        Resources resources0 = this.getContext().getResources();
        this.aT.setVisibility(8);
        this.aS.setVisibility(8);
        int v = egsy.e(this.aV.getContext());
        this.aU.setVisibility(0);
        int v1 = 3;
        switch(egxb0.f - 1) {
            case 0: {
                int v3 = egsy.b(this.aV.getContext());
                this.I(this.aV, 0x7F080B68, v3);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                this.aU.setText("Trouble syncing");
                this.aT.setVisibility(0);
                this.aT.setText("Try again later");
                this.aS.setVisibility(0);
                this.aW.setVisibility(8);
                break;
            }
            case 1: {
                int v4 = egsy.d(this.aV.getContext());
                this.I(this.aV, 0x7F080B19, v4);  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                this.aU.setText(resources0.getQuantityString(0x7F130042, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_successful
                long v5 = egxb0.e;
                if(v5 >= 0L) {
                    CharSequence charSequence0 = egxj.f(resources0, v5);
                    if(charSequence0 != null) {
                        this.aT.setVisibility(0);
                        this.aT.setText(charSequence0);
                    }
                }
                this.aS.setVisibility(0);
                this.aW.setVisibility(8);
                break;
            }
            case 2: {
                this.I(this.aV, 0x7F080B29, v);  // drawable:quantum_gm_ic_cloud_download_vd_theme_24
                this.aU.setText("Sync in progress");
                this.aW.setVisibility(8);
                break;
            }
            case 3: {
                int v6 = egsy.c(this.aV.getContext());
                this.I(this.aV, 0x7F080B51, v6);  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                this.aU.setText("Auto-sync is off");
                this.aS.setVisibility(0);
                this.aW.setVisibility(8);
                if(this.aj) {
                    this.aU.setText("Sync is off");
                    this.aS.setVisibility(8);
                }
                break;
            }
            case 4: {
                int v7 = egsy.b(this.aV.getContext());
                this.I(this.aV, 0x7F080B68, v7);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                this.aU.setText("Permission needed");
                this.aW.setVisibility(8);
                break;
            }
            case 5: {
                int v8 = egsy.c(this.aV.getContext());
                this.I(this.aV, 0x7F080B51, v8);  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                this.aU.setText("Waiting to sync");
                this.aS.setVisibility(0);
                this.aW.setVisibility(8);
                break;
            }
            case 6: {
                this.I(this.aV, 0x7F080B2C, v);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                this.aU.setText("Starting sync");
                long v9 = egxb0.e;
                if(v9 >= 0L) {
                    CharSequence charSequence1 = egxj.f(resources0, v9);
                    if(charSequence1 != null) {
                        this.aT.setVisibility(0);
                        this.aT.setText(charSequence1);
                    }
                }
                this.O();
                break;
            }
            case 7: {
                this.I(this.aV, 0x7F080B2C, v);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                this.aU.setText("Starting sync");
                this.aT.setVisibility(0);
                this.aT.setText("Trouble syncing, waiting to try again");
                this.O();
                break;
            }
            case 8: {
                this.I(this.aV, 0x7F080B2C, v);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                this.aU.setText("Starting sync");
                this.O();
                break;
            }
            case 9: {
                this.I(this.aV, 0x7F080B2B, v);  // drawable:quantum_gm_ic_cloud_upload_vd_theme_24
                if(hwyw.c()) {
                    int v10 = egxb0.c;
                    if(v10 == 1) {
                        this.aU.setText(resources0.getString(0x7F152525, new Object[]{egxb0.b.f(Integer.valueOf(0)), resources0.getQuantityString(0x7F130053, egxb0.a, new Object[]{((int)egxb0.a)})}));  // string:people_contacts_sync_core_stv2_contacts_sync_up_progress_text "Backing up 
                                                                                                                                                                                                          // %1$d of %2$s"
                    }
                    else if(v10 == 3) {
                        this.aU.setText("Backing up contact photos");
                    }
                    else {
                        this.aU.setText(resources0.getQuantityString(0x7F130044, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_up
                    }
                }
                else {
                    this.aU.setText(resources0.getQuantityString(0x7F130044, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_up
                }
                this.O();
                break;
            }
            default: {
                this.I(this.aV, 0x7F080B29, v);  // drawable:quantum_gm_ic_cloud_download_vd_theme_24
                if(hwyw.c()) {
                    int v2 = egxb0.c;
                    if(v2 == 1) {
                        this.aU.setText(resources0.getString(0x7F152524, new Object[]{egxb0.b.f(Integer.valueOf(0)), resources0.getQuantityString(0x7F130053, egxb0.a, new Object[]{((int)egxb0.a)})}));  // string:people_contacts_sync_core_stv2_contacts_sync_down_progress_text "Getting 
                                                                                                                                                                                                          // %1$d of %2$s"
                    }
                    else if(v2 == 3) {
                        this.aU.setText("Getting contact photos");
                    }
                    else {
                        this.aU.setText(resources0.getQuantityString(0x7F130043, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_down
                    }
                }
                else {
                    this.aU.setText(resources0.getQuantityString(0x7F130043, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_down
                }
                this.O();
            }
        }
        if(this.aj) {
            hwyp hwyp0 = hwyp.a;
            if(hwyp0.c().I() && (!hxdo.a.b().i() || this.a != null)) {
                int v11 = egxb0.a;
                gfsx gfsx0 = egxb0.d;
                int v12 = (int)(((Integer)gfsx0.f(Integer.valueOf(0))));
                boolean z = egxj.q(this.a);
                boolean z1 = ContentResolver.getSyncAutomatically(this.a, "com.android.contacts") && ContentResolver.getMasterSyncAutomatically();
                boolean z2 = !hxdo.c() && this.aY.ij() != null && ((Boolean)this.aY.ij()).booleanValue();
                if(!hwyp0.c().s()) {
                    if(!egyf.b(this.getContext().getApplicationContext())) {
                        v1 = 1;
                    }
                    else if(!hwyp0.c().z() || v11 <= v12) {
                    label_138:
                        if(!z1) {
                            if(v12 <= 0) {
                                v1 = z2 ? 4 : 1;
                            }
                        }
                        else if(v11 > 0) {
                            v1 = 2;
                        }
                        else {
                            v1 = 1;
                        }
                    }
                    else if(z2) {
                        z2 = true;
                        goto label_138;
                    }
                    else {
                        v1 = 1;
                    }
                }
                else if(!egyf.b(this.getContext().getApplicationContext())) {
                    v1 = 7;
                }
                else if(!z) {
                    v1 = v11 > 0 ? 6 : 1;
                }
                else if(!z1) {
                    v1 = 5;
                }
                else {
                    v1 = 1;
                }
                this.aC.setVisibility(8);
                this.aD.setVisibility(8);
                this.aG.setVisibility(8);
                this.aJ.setVisibility(8);
                this.aM.setVisibility(8);
                this.aP.setVisibility(8);
                Resources resources1 = this.getContext().getResources();
                this.P(this.R());
                switch(v1 - 1) {
                    case 1: {
                        this.aC.setVisibility(0);
                        return;
                    }
                    case 2: {
                        goto label_163;
                    }
                    case 3: {
                        this.aG.setVisibility(0);
                        this.aH.setText(egrw.S("To restore previously synced contacts, turn Sync with Google Contacts on"));
                        return;
                    }
                    case 4: {
                        goto label_172;
                    }
                    case 5: {
                        goto label_185;
                    }
                    case 6: {
                        goto label_191;
                    }
                }
                return;
            label_163:
                if(gfsx0.i()) {
                    String s = resources1.getQuantityString(0x7F13004B, ((Integer)gfsx0.d()).intValue(), new Object[]{gfsx0.d()});  // plurals:people_contacts_sync_remove_contacts_description
                    this.aE.setText(egrw.S(s));
                    this.aD.setVisibility(0);
                    this.aF.setOnClickListener(new egrp(this, egxb0));
                    return;
                label_172:
                    this.aJ.setVisibility(0);
                    this.aL.setTextColor(this.F());
                    if(!ContentResolver.getMasterSyncAutomatically()) {
                        if(this.am) {
                            this.E(40);
                            this.am = false;
                        }
                        this.aL.setOnClickListener(new egrc(this));
                        return;
                    }
                    if(this.am) {
                        this.E(39);
                        this.am = false;
                    }
                    this.aL.setOnClickListener(new egrn(this));
                    return;
                label_185:
                    if(this.am) {
                        this.E(41);
                        this.am = false;
                    }
                    this.aM.setVisibility(0);
                    this.aO.setText(egrw.S(resources1.getQuantityString(0x7F130040, v11, new Object[]{v11})));  // plurals:people_contacts_sync_contacts_not_synced_description
                    return;
                label_191:
                    if(this.am) {
                        this.E(42);
                        this.am = false;
                    }
                    this.aP.setVisibility(0);
                    this.aR.setVisibility(0);
                    this.aR.setTextColor(this.F());
                    HashSet hashSet0 = new HashSet();
                    hashSet0.add("android.permission-group.CONTACTS");
                    this.aR.setOnClickListener(new egro(this, hashSet0));
                }
            }
        }
    }

    public final void B(boolean z) {
        boolean z1 = ContentResolver.getMasterSyncAutomatically();
        boolean z2 = egxj.q(this.a);
        if(this.aj) {
            this.P(this.R());
            boolean z3 = egyf.b(this.getContext().getApplicationContext());
            boolean z4 = this.aq;
            if(z4) {
                this.ai.setEnabled(z3);
            }
            else {
                this.ah.setEnabled(z3);
                this.ay.setEnabled(z3);
            }
            if(!z4) {
                this.ay.setOnClickListener(new egrr(this));
            }
            if(z4) {
                this.ai.b(this.at);
                this.ai.c(z2);
                this.ai.a(this.at);
            }
            else {
                this.ah.setOnCheckedChangeListener(null);
                this.ah.setChecked(z2);
                this.ah.setOnCheckedChangeListener(this.au);
            }
            if(z) {
                this.T(7, z2);
            }
        }
        else {
            if(z1 && z2) {
                this.G(egxj.l(this.a), z);
                return;
            }
            if(z1) {
                if(this.aA && this.Q()) {
                    this.G(false, z);
                    return;
                }
                this.H(false);
            }
            else {
                this.H(true);
                this.getView().findViewById(0x7F0B0C1D).setVisibility(8);  // id:auto_sync_description
                if(this.aq) {
                    this.ag.setOnClickListener(new egri(this));
                }
                else {
                    this.ax.setOnClickListener(new egrj(this));
                }
            }
            if(this.aq) {
                this.ag.b(this.ar);
                this.ag.c(false);
            }
            else {
                this.d.setOnCheckedChangeListener(null);
                this.d.setChecked(false);
            }
            if(z) {
                int v = ContentResolver.getIsSyncable(this.a, "com.android.contacts");
                String s = egxj.g(this.a);
                efpr efpr0 = this.av.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqu.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((giqu)hftv0).c = 15;
                ((giqu)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                int v1 = 3;
                ((giqu)hftp0.b_message).e = 3;
                ((giqu)hftp0.b_message).b |= 4;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giqq.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((giqq)hftv1).b |= 1;
                ((giqq)hftv1).c = z1;
                if(v < 0) {
                    v1 = 2;
                }
                else if(v != 0) {
                    v1 = 4;
                }
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((giqq)hftp1.b_message).d = v1 - 1;
                ((giqq)hftp1.b_message).b |= 2;
                giqq giqq0 = (giqq)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giqu giqu0 = (giqu)hftp0.b_message;
                giqq0.getClass();
                giqu0.h = giqq0;
                giqu0.b |= 0x20;
                efpr0.j(((giqu)hftp0.N_build()), s);
            }
        }
    }

    final void C() {
        if(this.aA && this.Q() && !egxj.q(this.a)) {
            ContentResolver.setIsSyncable(this.a, "com.android.contacts", 1);
        }
    }

    @Override  // egsx
    public final int D() {
        return 4;
    }

    public final void E(int v) {
        this.av.f(v, 4, egxj.g(this.a));
    }

    private final int F() {
        TypedArray typedArray0 = this.J().getTheme().obtainStyledAttributes(this.J().getThemeResId(), new int[]{0x101009B});
        int v = typedArray0.getColor(0, 0);
        typedArray0.recycle();
        return v;
    }

    private final void G(boolean z, boolean z1) {
        this.H(true);
        this.getView().findViewById(0x7F0B0C1D).setVisibility(0);  // id:auto_sync_description
        boolean z2 = this.aq;
        if(!z2) {
            this.ax.setOnClickListener(new egrq(this));
        }
        ((AppCompatTextView)this.getView().findViewById(0x7F0B0C1D)).setText(0x7F152517);  // id:auto_sync_description
        if(z2) {
            skl skl0 = this.ar;
            this.ag.b(skl0);
            this.ag.c(z);
            if(z1) {
                this.T(7, z);
            }
            this.ag.a(skl0);
            return;
        }
        this.d.setOnCheckedChangeListener(null);
        this.d.setChecked(z);
        if(z1) {
            this.T(7, z);
        }
        this.d.setOnCheckedChangeListener(this.as);
    }

    private final void H(boolean z) {
        if(this.aq) {
            this.ag.setEnabled(z);
            return;
        }
        this.d.setEnabled(z);
        this.ax.setEnabled(z);
    }

    private final void I(ImageView imageView0, int v, int v1) {
        imageView0.setVisibility(0);
        pcb pcb0 = pcb.b(this.getContext().getResources(), v, this.getContext().getTheme());
        pcb0.mutate();
        pcb0.setTint(v1);
        imageView0.setImageDrawable(pcb0);
    }

    private final void O() {
        int v = this.aW.getVisibility();
        this.aW.setVisibility(0);
        if(v != 0) {
            this.aW.sendAccessibilityEvent(0x4000);
        }
    }

    private final void P(boolean z) {
        RelativeLayout relativeLayout0 = this.aI;
        if(z) {
            relativeLayout0.setVisibility(0);
            return;
        }
        relativeLayout0.setVisibility(8);
    }

    private final boolean Q() {
        return !this.a.name.endsWith("@youtube.com");
    }

    private final boolean R() {
        return egxj.q(this.a) && egyf.b(this.getContext().getApplicationContext());
    }

    private static final CharSequence S(String s) {
        return Html.fromHtml(s, 0);
    }

    private final void T(int v, boolean z) {
        this.av.h(v, 4, egxj.g(this.a), egxj.r(this.J().getContainerActivity()), z);
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        egqy egqy0 = (egqy)this.J();
        eguv eguv0 = (eguv)new lso(this.J(), this.K()).a(eguv.class);
        this.b = eguv0;
        eguv0.z = this;
        eguv0.c.g(this, this.az);
        this.aB = this.b.k;
        this.b.k.g(this, (egxb egxb0) -> {
            if(egxb0 == null) {
                this.aS.setVisibility(8);
                this.aV.setVisibility(8);
                this.aU.setVisibility(8);
                this.aT.setVisibility(8);
                this.aW.setVisibility(8);
                return;
            }
            Resources resources0 = this.getContext().getResources();
            this.aT.setVisibility(8);
            this.aS.setVisibility(8);
            int v = egsy.e(this.aV.getContext());
            this.aU.setVisibility(0);
            int v1 = 3;
            switch(egxb0.f - 1) {
                case 0: {
                    int v3 = egsy.b(this.aV.getContext());
                    this.I(this.aV, 0x7F080B68, v3);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                    this.aU.setText("Trouble syncing");
                    this.aT.setVisibility(0);
                    this.aT.setText("Try again later");
                    this.aS.setVisibility(0);
                    this.aW.setVisibility(8);
                    break;
                }
                case 1: {
                    int v4 = egsy.d(this.aV.getContext());
                    this.I(this.aV, 0x7F080B19, v4);  // drawable:quantum_gm_ic_check_circle_vd_theme_24
                    this.aU.setText(resources0.getQuantityString(0x7F130042, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_successful
                    long v5 = egxb0.e;
                    if(v5 >= 0L) {
                        CharSequence charSequence0 = egxj.f(resources0, v5);
                        if(charSequence0 != null) {
                            this.aT.setVisibility(0);
                            this.aT.setText(charSequence0);
                        }
                    }
                    this.aS.setVisibility(0);
                    this.aW.setVisibility(8);
                    break;
                }
                case 2: {
                    this.I(this.aV, 0x7F080B29, v);  // drawable:quantum_gm_ic_cloud_download_vd_theme_24
                    this.aU.setText("Sync in progress");
                    this.aW.setVisibility(8);
                    break;
                }
                case 3: {
                    int v6 = egsy.c(this.aV.getContext());
                    this.I(this.aV, 0x7F080B51, v6);  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                    this.aU.setText("Auto-sync is off");
                    this.aS.setVisibility(0);
                    this.aW.setVisibility(8);
                    if(this.aj) {
                        this.aU.setText("Sync is off");
                        this.aS.setVisibility(8);
                    }
                    break;
                }
                case 4: {
                    int v7 = egsy.b(this.aV.getContext());
                    this.I(this.aV, 0x7F080B68, v7);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
                    this.aU.setText("Permission needed");
                    this.aW.setVisibility(8);
                    break;
                }
                case 5: {
                    int v8 = egsy.c(this.aV.getContext());
                    this.I(this.aV, 0x7F080B51, v8);  // drawable:quantum_gm_ic_do_not_disturb_on_vd_theme_24
                    this.aU.setText("Waiting to sync");
                    this.aS.setVisibility(0);
                    this.aW.setVisibility(8);
                    break;
                }
                case 6: {
                    this.I(this.aV, 0x7F080B2C, v);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                    this.aU.setText("Starting sync");
                    long v9 = egxb0.e;
                    if(v9 >= 0L) {
                        CharSequence charSequence1 = egxj.f(resources0, v9);
                        if(charSequence1 != null) {
                            this.aT.setVisibility(0);
                            this.aT.setText(charSequence1);
                        }
                    }
                    this.O();
                    break;
                }
                case 7: {
                    this.I(this.aV, 0x7F080B2C, v);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                    this.aU.setText("Starting sync");
                    this.aT.setVisibility(0);
                    this.aT.setText("Trouble syncing, waiting to try again");
                    this.O();
                    break;
                }
                case 8: {
                    this.I(this.aV, 0x7F080B2C, v);  // drawable:quantum_gm_ic_cloud_vd_theme_24
                    this.aU.setText("Starting sync");
                    this.O();
                    break;
                }
                case 9: {
                    this.I(this.aV, 0x7F080B2B, v);  // drawable:quantum_gm_ic_cloud_upload_vd_theme_24
                    if(hwyw.c()) {
                        int v10 = egxb0.c;
                        if(v10 == 1) {
                            this.aU.setText(resources0.getString(0x7F152525, new Object[]{egxb0.b.f(Integer.valueOf(0)), resources0.getQuantityString(0x7F130053, egxb0.a, new Object[]{((int)egxb0.a)})}));  // string:people_contacts_sync_core_stv2_contacts_sync_up_progress_text "Backing up 
                                                                                                                                                                                                              // %1$d of %2$s"
                        }
                        else if(v10 == 3) {
                            this.aU.setText("Backing up contact photos");
                        }
                        else {
                            this.aU.setText(resources0.getQuantityString(0x7F130044, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_up
                        }
                    }
                    else {
                        this.aU.setText(resources0.getQuantityString(0x7F130044, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_up
                    }
                    this.O();
                    break;
                }
                default: {
                    this.I(this.aV, 0x7F080B29, v);  // drawable:quantum_gm_ic_cloud_download_vd_theme_24
                    if(hwyw.c()) {
                        int v2 = egxb0.c;
                        if(v2 == 1) {
                            this.aU.setText(resources0.getString(0x7F152524, new Object[]{egxb0.b.f(Integer.valueOf(0)), resources0.getQuantityString(0x7F130053, egxb0.a, new Object[]{((int)egxb0.a)})}));  // string:people_contacts_sync_core_stv2_contacts_sync_down_progress_text "Getting 
                                                                                                                                                                                                              // %1$d of %2$s"
                        }
                        else if(v2 == 3) {
                            this.aU.setText("Getting contact photos");
                        }
                        else {
                            this.aU.setText(resources0.getQuantityString(0x7F130043, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_down
                        }
                    }
                    else {
                        this.aU.setText(resources0.getQuantityString(0x7F130043, egxb0.a, new Object[]{((int)egxb0.a)}));  // plurals:people_contacts_sync_core_sync_status_sync_down
                    }
                    this.O();
                }
            }
            if(this.aj) {
                hwyp hwyp0 = hwyp.a;
                if(hwyp0.c().I() && (!hxdo.a.b().i() || this.a != null)) {
                    int v11 = egxb0.a;
                    gfsx gfsx0 = egxb0.d;
                    int v12 = (int)(((Integer)gfsx0.f(Integer.valueOf(0))));
                    boolean z = egxj.q(this.a);
                    boolean z1 = ContentResolver.getSyncAutomatically(this.a, "com.android.contacts") && ContentResolver.getMasterSyncAutomatically();
                    boolean z2 = !hxdo.c() && this.aY.ij() != null && ((Boolean)this.aY.ij()).booleanValue();
                    if(!hwyp0.c().s()) {
                        if(!egyf.b(this.getContext().getApplicationContext())) {
                            v1 = 1;
                        }
                        else if(!hwyp0.c().z() || v11 <= v12) {
                        label_138:
                            if(!z1) {
                                if(v12 <= 0) {
                                    v1 = z2 ? 4 : 1;
                                }
                            }
                            else if(v11 > 0) {
                                v1 = 2;
                            }
                            else {
                                v1 = 1;
                            }
                        }
                        else if(z2) {
                            z2 = true;
                            goto label_138;
                        }
                        else {
                            v1 = 1;
                        }
                    }
                    else if(!egyf.b(this.getContext().getApplicationContext())) {
                        v1 = 7;
                    }
                    else if(!z) {
                        v1 = v11 > 0 ? 6 : 1;
                    }
                    else if(!z1) {
                        v1 = 5;
                    }
                    else {
                        v1 = 1;
                    }
                    this.aC.setVisibility(8);
                    this.aD.setVisibility(8);
                    this.aG.setVisibility(8);
                    this.aJ.setVisibility(8);
                    this.aM.setVisibility(8);
                    this.aP.setVisibility(8);
                    Resources resources1 = this.getContext().getResources();
                    this.P(this.R());
                    switch(v1 - 1) {
                        case 1: {
                            this.aC.setVisibility(0);
                            return;
                        }
                        case 2: {
                            goto label_163;
                        }
                        case 3: {
                            this.aG.setVisibility(0);
                            this.aH.setText(egrw.S("To restore previously synced contacts, turn Sync with Google Contacts on"));
                            return;
                        }
                        case 4: {
                            goto label_172;
                        }
                        case 5: {
                            goto label_185;
                        }
                        case 6: {
                            goto label_191;
                        }
                    }
                    return;
                label_163:
                    if(gfsx0.i()) {
                        String s = resources1.getQuantityString(0x7F13004B, ((Integer)gfsx0.d()).intValue(), new Object[]{gfsx0.d()});  // plurals:people_contacts_sync_remove_contacts_description
                        this.aE.setText(egrw.S(s));
                        this.aD.setVisibility(0);
                        this.aF.setOnClickListener(new egrp(this, egxb0));
                        return;
                    label_172:
                        this.aJ.setVisibility(0);
                        this.aL.setTextColor(this.F());
                        if(!ContentResolver.getMasterSyncAutomatically()) {
                            if(this.am) {
                                this.E(40);
                                this.am = false;
                            }
                            this.aL.setOnClickListener(new egrc(this));
                            return;
                        }
                        if(this.am) {
                            this.E(39);
                            this.am = false;
                        }
                        this.aL.setOnClickListener(new egrn(this));
                        return;
                    label_185:
                        if(this.am) {
                            this.E(41);
                            this.am = false;
                        }
                        this.aM.setVisibility(0);
                        this.aO.setText(egrw.S(resources1.getQuantityString(0x7F130040, v11, new Object[]{v11})));  // plurals:people_contacts_sync_contacts_not_synced_description
                        return;
                    label_191:
                        if(this.am) {
                            this.E(42);
                            this.am = false;
                        }
                        this.aP.setVisibility(0);
                        this.aR.setVisibility(0);
                        this.aR.setTextColor(this.F());
                        HashSet hashSet0 = new HashSet();
                        hashSet0.add("android.permission-group.CONTACTS");
                        this.aR.setOnClickListener(new egro(this, hashSet0));
                    }
                }
            }
        });
        this.c.h(egqy0.b(), new fntn());
        if(this.aj) {
            if(!hxdo.c()) {
                this.aY = this.b.p;
                this.b.p.g(this, new egrl(this));
            }
            this.aZ = this.b.q;
            this.b.q.g(this, new egrm(this));
        }
        if(bundle0 == null) {
            this.L();
        }
        if(this.ap.i()) {
            ((egik)this.ap.d()).a.a(bbdg.eZ);
        }
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v1 == -1 && intent0 != null) {
            if(v == 1) {
                String s = intent0.getStringExtra("authAccount");
                if(!bbqr.d(s)) {
                    this.E(5);
                    this.b.r(s);
                }
                v = 1;
            }
            super.onActivityResult(v, -1, intent0);
        }
    }

    @Override  // egsx
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.aw = bayn.f(this.getContext());
        this.aj = hwyp.i();
        this.ak = true;
        this.ap = egik.f();
        Context context0 = this.getContext();
        efol efol0 = new efol();
        efol0.a = 80;
        this.al = new egal(context0, efol0.a());
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E003E, viewGroup0, false);  // layout:account_sync_fragment_gm3
        this.aS = (ImageView)view0.findViewById(0x7F0B16B9);  // id:icon
        this.aU = (TextView)view0.findViewById(0x7F0B20C7);  // id:status
        this.aV = (ImageView)view0.findViewById(0x7F0B20CF);  // id:status_icon
        this.aT = (TextView)view0.findViewById(0x7F0B0CD7);  // id:body
        this.aW = (ProgressBar)view0.findViewById(0x7F0B1D35);  // id:progress_bar
        int v = egsy.e(this.getContext());
        this.I(this.aS, 0x7F080C0C, v);  // drawable:quantum_gm_ic_refresh_vd_theme_24
        this.aS.setOnClickListener(new egre(this));
        this.aS.setVisibility(8);
        this.aW.setIndeterminateTintList(ColorStateList.valueOf(v));
        this.aA = true;
        AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)view0.findViewById(0x7F0B0A83);  // id:account_particle_disc
        this.c = accountParticleDisc0;
        accountParticleDisc0.setOnClickListener(new egrf(this));
        egxj.k(this.getString(0x7F1507CF), this.c);  // string:common_account_spinner_a11y_tap_action "change account"
        Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B22D9);  // id:toolbar
        toolbar0.C(0x7F152528);  // string:people_contacts_sync_core_sync_card_title "Sync status"
        ((xni)this.J()).hG(toolbar0);
        ((xni)this.J()).hL().o(true);
        boolean z = this.aq;
        if(z) {
            if(this.aj) {
                this.ai = (MainSwitchBar)view0.findViewById(0x7F0B2211);  // id:sync_toggle_bar
                if(sku.a(this.getContext())) {
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.ai.getLayoutParams();
                    viewGroup$MarginLayoutParams0.setMarginStart(this.getContext().getResources().getDimensionPixelSize(0x7F071357));  // dimen:sync_toggle_bar_margin_start
                    viewGroup$MarginLayoutParams0.setMarginEnd(this.getContext().getResources().getDimensionPixelSize(0x7F071356));  // dimen:sync_toggle_bar_margin_end
                    this.ai.setLayoutParams(viewGroup$MarginLayoutParams0);
                }
            }
            this.ag = (MainSwitchBar)view0.findViewById(0x7F0B0C21);  // id:auto_sync_toggle_bar
        }
        else {
            if(this.aj) {
                this.ah = (SwitchCompat)view0.findViewById(0x7F0B2210);  // id:sync_toggle
                this.ay = (ViewGroup)view0.findViewById(0x7F0B2212);  // id:sync_toggle_container
            }
            this.d = (SwitchCompat)view0.findViewById(0x7F0B0C20);  // id:auto_sync_toggle
            this.ax = (ViewGroup)view0.findViewById(0x7F0B0C22);  // id:auto_sync_toggle_container
        }
        egxj.j(((NestedScrollView)view0.findViewById(0x7F0B0FEA)));  // id:content_scroll_view
        if(this.aj) {
            this.aI = (RelativeLayout)view0.findViewById(0x7F0B0CDB);  // id:body_container
            AppCompatTextView appCompatTextView0 = (AppCompatTextView)view0.findViewById(0x7F0B1710);  // id:info_banner
            this.aX = appCompatTextView0;
            appCompatTextView0.setText(0x7F15253B);  // string:people_contacts_sync_information_banner_version2 "Keep your Google Contacts 
                                                     // (contacts.google.com) synced with this device"
            view0.findViewById(0x7F0B0C1D).setVisibility(8);  // id:auto_sync_description
            this.aC = (LinearLayout)view0.findViewById(0x7F0B23D3);  // id:unsync_text_container
            this.aD = (LinearLayout)view0.findViewById(0x7F0B1E3F);  // id:remove_contacts_container
            this.aE = (TextView)view0.findViewById(0x7F0B1E40);  // id:remove_contacts_description
            this.aF = (Button)view0.findViewById(0x7F0B1E3E);  // id:remove_contacts_button
            this.aG = (LinearLayout)view0.findViewById(0x7F0B1E6B);  // id:restore_contacts_container
            this.aH = (TextView)view0.findViewById(0x7F0B1E6C);  // id:restore_contacts_description
            this.an = (LinearLayout)view0.findViewById(0x7F0B1E41);  // id:remove_contacts_progress_container
            this.aJ = (LinearLayout)view0.findViewById(0x7F0B237A);  // id:turn_on_auto_sync_container
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B237C);  // id:turn_on_auto_sync_icon
            this.aK = imageView0;
            imageView0.setImageResource(0x7F080B68);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
            this.aL = (TextView)view0.findViewById(0x7F0B237D);  // id:turn_on_auto_sync_text_button
            this.aM = (LinearLayout)view0.findViewById(0x7F0B0FC8);  // id:contacts_not_synced_container
            ImageView imageView1 = (ImageView)view0.findViewById(0x7F0B0FCA);  // id:contacts_not_synced_icon
            this.aN = imageView1;
            imageView1.setImageResource(0x7F080BA2);  // drawable:quantum_gm_ic_info_vd_theme_24
            this.aO = (TextView)view0.findViewById(0x7F0B0FC9);  // id:contacts_not_synced_description
            this.aP = (LinearLayout)view0.findViewById(0x7F0B19CF);  // id:need_contacts_permission_container
            ImageView imageView2 = (ImageView)view0.findViewById(0x7F0B19D1);  // id:need_contacts_permission_icon
            this.aQ = imageView2;
            imageView2.setImageResource(0x7F080B68);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
            this.aR = (TextView)view0.findViewById(0x7F0B19CE);  // id:need_contacts_permission_button
            this.ao = view0.findViewById(0x7F0B0FEA);  // id:content_scroll_view
            if(z) {
                this.ai.setVisibility(0);
                this.ag.setVisibility(8);
            }
            else {
                this.ay.setVisibility(0);
                this.ax.setVisibility(8);
            }
        }
        if(this.aw != null && this.aw.c(ehdo.a()) != null) {
            ViewGroup viewGroup1 = (ViewGroup)view0.findViewById(0x7F0B1899);  // id:manage_notification_row
            viewGroup1.setVisibility(0);
            viewGroup1.setOnClickListener(new egrg(this));
        }
        ImageView imageView3 = (ImageView)view0.findViewById(0x7F0B166C);  // id:help_and_feedback
        imageView3.setImageResource(0x7F080D45);  // drawable:quantum_ic_help_outline_vd_theme_24
        imageView3.setOnClickListener(new egrh(this));
        egxj.i(imageView3, imageView3.getContext().getResources().getDimensionPixelSize(0x7F070076));  // dimen:accessibility_required_min_touch_target_height
        return view0;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        this.c = null;
        this.d = null;
        this.ag = null;
        this.ax = null;
        this.ai = null;
        this.ah = null;
        this.ay = null;
        this.aB.k(this);
        this.aB = null;
        this.aC = null;
        this.aD = null;
        this.aE = null;
        this.aF = null;
        this.aG = null;
        this.aH = null;
        this.aJ = null;
        this.aK = null;
        this.aL = null;
        this.aM = null;
        this.aN = null;
        this.aO = null;
        this.aP = null;
        this.aQ = null;
        this.aR = null;
        if(this.aj) {
            if(!hxdo.c()) {
                this.aY.k(this);
                this.aY = null;
            }
            this.aZ.k(this);
            this.aZ = null;
        }
        this.an = null;
        this.ao = null;
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        if(this.a != null) {
            this.B(false);
        }
    }

    // Detected as a lambda impl.
    public final void y(boolean z) {
        this.C();
        ContentResolver.setSyncAutomatically(this.a, "com.android.contacts", z);
        this.T(6, z);
        if(this.ap.i()) {
            if(z) {
                ((egik)this.ap.d()).e();
            }
            else {
                ((egik)this.ap.d()).a.a(bbdg.fb);
            }
        }
        if(hwyp.a.c().K() && !z) {
            ContentResolver.cancelSync(this.a, "com.android.contacts");
        }
        this.b.n();
    }

    // Detected as a lambda impl.
    public final void z(boolean z) {
        if(z) {
            this.E(38);
            this.C();
            this.B(false);
            this.b.n();
            this.b.q(false);
        }
        else {
            this.E(35);
            eguv eguv0 = this.b;
            String s = this.a.name;
            try {
                int v = eguv0.v.d(s);
                int v1 = eguv0.v.c(s);
                this.av.b(egxj.g(this.a));
                egvw.y(this, v, v1);
            }
            catch(cjuh unused_ex) {
                this.B(false);
                this.getContext().getResources();
                Toast.makeText(this.getContext(), "Failed to turn off sync", 0).show();
                egvc egvc0 = this.av;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giqs.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((giqs)hftp0.b_message).c = 2;
                ((giqs)hftp0.b_message).b |= 1;
                egvc0.i(((giqs)hftp0.N_build()), this.a.name);
            }
        }
        this.b.k();
    }
}

