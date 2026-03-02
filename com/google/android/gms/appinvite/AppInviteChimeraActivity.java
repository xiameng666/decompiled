package com.google.android.gms.appinvite;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import acar;
import acas;
import acat;
import acav;
import acaw;
import acay;
import acba;
import acbc;
import accl;
import accn;
import accs;
import acct;
import accu;
import accv;
import aceb;
import acey;
import acfh;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import avyq;
import azou;
import azql;
import bbcu;
import bbml;
import bbmn;
import bbmq;
import bboh;
import ca;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.ListSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import du;
import fm;
import ggtj;
import giig;
import giim;
import giip;
import giiq;
import giiy;
import gija;
import gijb;
import gijh;
import hfrj;
import hfuo;
import houq;
import hour;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import jwe;
import org.xmlpull.v1.XmlPullParserException;
import uq;
import xni;

@GmsCoreVeId(0x3EBF0)
@Deprecated
public class AppInviteChimeraActivity extends xni implements accl, acct, accu, accv, TextWatcher {
    private accn A;
    private bbml B;
    private Uri C;
    private View.OnClickListener D;
    private String E;
    private String F;
    private String G;
    private String H;
    private boolean I;
    private boolean J;
    private CharSequence K;
    private CharSequence L;
    private int M;
    private boolean N;
    private long O;
    private long P;
    private long Q;
    private long R;
    private long S;
    public String j;
    public aceb k;
    public Toolbar l;
    public TextView m;
    public EditText n;
    public accs o;
    public acbc p;
    public boolean q;
    public boolean r;
    private static final bboh s;
    private AppInviteChimeraActivity.AppInviteResponseReceiver t;
    private List u;
    private Account v;
    private View w;
    private ImageView x;
    private View y;
    private ImageView z;

    static {
        AppInviteChimeraActivity.s = bboh.b("AppInvite", bbcu.aK);
    }

    private final void A(Account account0, boolean z) {
        ArrayList arrayList4;
        ArrayList arrayList3;
        ArrayList arrayList2;
        ArrayList arrayList1;
        if(account0.equals(this.v)) {
            return;
        }
        if(this.v != null) {
            acbc acbc0 = this.p;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giig.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giig giig0 = (giig)hftp0.b_message;
            giig0.b |= 1;
            giig0.c = true;
            acbc0.f(((giig)hftp0.N_build()), 9, acbc0.a);
        }
        if(this.k.a.getParent() != null) {
            ((ViewGroup)this.k.a.getParent()).removeView(this.k.a);
        }
        this.v = account0;
        this.l.v(0x7F080A58);
        this.l.t(0x7F150808);  // string:common_choose_account "Choose account"
        this.y.setVisibility(8);
        ArrayList arrayList0 = null;
        this.z.setImageDrawable(null);
        fm fm0 = this.getSupportFragmentManager();
        accn accn0 = (accn)fm0.h("selectionFragment");
        this.A = accn0;
        if(z || accn0 == null) {
            Intent intent0 = this.getIntent();
            boolean z1 = this.getPackageManager().hasSystemFeature("android.hardware.telephony") && this.checkSelfPermission("android.permission.SEND_SMS") == 0;
            if(azql.c(this).g(this.j)) {
                arrayList0 = intent0.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
                arrayList1 = intent0.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
                arrayList2 = AppInviteChimeraActivity.D(intent0, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
                arrayList3 = AppInviteChimeraActivity.D(intent0, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
                arrayList4 = AppInviteChimeraActivity.D(intent0, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
            }
            else {
                arrayList4 = null;
                arrayList1 = null;
                arrayList2 = null;
                arrayList3 = null;
            }
            Resources resources0 = this.getResources();
            houq houq0 = houq.a;
            String[] arr_s = houq0.b().f().split(";");
            String[] arr_s1 = houq0.b().d().split(";");
            String[] arr_s2 = houq0.b().e().split(";");
            if(!z1) {
                arr_s = AppInviteChimeraActivity.E(arr_s);
                arr_s1 = AppInviteChimeraActivity.E(arr_s1);
                arr_s2 = AppInviteChimeraActivity.E(arr_s2);
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new CustomSectionInfo(new int[]{0x7F0E00A3}));  // layout:appinvite_edit_message
            SelectionSectionInfo selectionSectionInfo0 = new SelectionSectionInfo();
            selectionSectionInfo0.p = true;
            selectionSectionInfo0.a = "Add recipients";
            arrayList5.add(selectionSectionInfo0);
            ListSectionInfo listSectionInfo0 = new ListSectionInfo("suggested");
            listSectionInfo0.b = arr_s;
            listSectionInfo0.i = 1;
            listSectionInfo0.l = arrayList0;
            listSectionInfo0.m = arrayList2;
            listSectionInfo0.b(arrayList3);
            listSectionInfo0.c(arrayList4);
            listSectionInfo0.g = "Suggestions from Google";
            arrayList5.add(listSectionInfo0);
            ListSectionInfo listSectionInfo1 = new ListSectionInfo("identityPeople");
            listSectionInfo1.d = "useCachedContacts";
            listSectionInfo1.b = arr_s1;
            listSectionInfo1.e = true;
            listSectionInfo1.i = 2;
            listSectionInfo1.l = arrayList1;
            listSectionInfo1.g = "Everyone";
            arrayList5.add(listSectionInfo1);
            this.A = accn.A(this.v.name, ((int)houq0.b().b()), null, true, null, false, arr_s2, false, resources0.getInteger(0x7F0C0009), resources0.getInteger(0x7F0C0008), arrayList5, this.j, false, null, null, null, null, true);  // integer:appinivte_num_portrait_grid_columns
            ca ca0 = new ca(fm0);
            ca0.z(0x7F0B14C5, this.A, "selectionFragment");  // id:fragment_container
            ca0.b();
        }
        this.A.d = this;
        this.A.ag = this;
        this.A.ah = this;
        this.A.ay = this;
    }

    private final void B() {
        int v = this.A == null || !this.A.M() ? 0 : 1;
        this.w.setVisibility((1 == v ? 0 : 8));
        if(v == 0) {
            if(this.B == null) {
                bbml bbml0 = acey.y(this.x);
                this.B = bbml0;
                this.x.setImageDrawable(bbml0);
            }
            if(!this.B.isRunning()) {
                this.B.start();
            }
            this.x.setVisibility(0);
        }
        else {
            if(this.B != null && this.B.isRunning()) {
                this.B.stop();
            }
            this.x.setVisibility(8);
        }
        this.supportInvalidateOptionsMenu();
        fm fm0 = this.getSupportFragmentManager();
        ca ca0 = new ca(fm0);
        du du0 = fm0.h("progressFragment");
        if(this.u == null || this.u.isEmpty()) {
            if(du0 != null) {
                ca0.o(du0);
            }
        }
        else if(du0 == null) {
            ca0.v(acey.z(), "progressFragment");
        }
        if(!ca0.l()) {
            ca0.b();
        }
    }

    private static final String C() {
        return UUID.randomUUID().toString();
    }

    private static final ArrayList D(Intent intent0, String s) {
        ArrayList arrayList0 = intent0.getCharSequenceArrayListExtra(s);
        if(arrayList0 != null) {
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                CharSequence charSequence0 = (CharSequence)arrayList0.get(v1);
                arrayList1.add((charSequence0 == null ? null : charSequence0.toString()));
            }
            return arrayList1;
        }
        return null;
    }

    private static final String[] E(String[] arr_s) {
        ArrayList arrayList0 = new ArrayList(Arrays.asList(arr_s));
        arrayList0.remove("phone");
        return arrayList0.size() == arr_s.length ? arr_s : ((String[])arrayList0.toArray(new String[arrayList0.size()]));
    }

    public final Bundle a(int v, CharSequence charSequence0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("View_id", avyq.a(this, v));
        bundle0.putCharSequence("TextView_text", charSequence0);
        return bundle0;
    }

    @Override  // android.text.TextWatcher
    public final void afterTextChanged(Editable editable0) {
        int v = 100 - editable0.length();
        String s = this.v();
        if(v < 0) {
            this.n.announceForAccessibility(this.v());
            this.I = true;
            this.J = true;
        }
        else if(!this.J && v <= 10) {
            this.n.announceForAccessibility(this.v());
            this.I = true;
            this.J = true;
        }
        this.m.setText(String.format("%1$d/%2$d", editable0.length(), ((int)100)));
        this.m.setContentDescription(s);
        this.supportInvalidateOptionsMenu();
        if(!this.I) {
            this.n.announceForAccessibility(this.v());
            this.I = true;
        }
        this.q = true;
    }

    @Override  // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // accu
    public final void g(ContactPerson.ContactMethod contactPerson$ContactMethod0, boolean z) {
        acbc acbc0 = this.p;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gija.a).v_newBuilder();
        switch(contactPerson$ContactMethod0.a) {
            case 0: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gija)hftp0.b_message).c = 1;
                ((gija)hftp0.b_message).b |= 1;
                break;
            }
            case 1: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gija)hftp0.b_message).c = 2;
                ((gija)hftp0.b_message).b |= 1;
                break;
            }
            case 2: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gija)hftp0.b_message).c = 3;
                ((gija)hftp0.b_message).b |= 1;
                break;
            }
            default: {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gija)hftp0.b_message).c = 0;
                ((gija)hftp0.b_message).b |= 1;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gija gija0 = (gija)hftp0.b_message;
        gija0.b |= 2;
        gija0.d = z;
        acbc0.f(((gija)hftp0.N_build()), 7, acbc0.a);
    }

    @Override  // acct
    public final void l() {
        acfh.a(this, "Failed to load", false, true);
        this.finish();
    }

    @Override  // acct
    public final void m(int v, int v1) {
        synchronized(this) {
            long v3 = SystemClock.uptimeMillis() - this.O;
            this.Q = v3;
            if(this.P == 0L) {
                this.P = v3;
            }
            this.B();
            acbc acbc0 = this.p;
            long v4 = this.Q;
            long v5 = this.P;
            long v6 = this.R;
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(acbc.e(2, v4));
            arrayList0.add(acbc.e(1, v5));
            arrayList0.add(acbc.e(3, v6));
            arrayList0.add(acbc.e(4, 0L));
            arrayList0.add(acbc.e(5, 0L));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gijh.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gijh)hftv0).b |= 1;
            ((gijh)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gijh gijh0 = (gijh)hftp0.b_message;
            gijh0.b |= 2;
            gijh0.d = v1;
            if(!arrayList0.isEmpty()) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gijh gijh1 = (gijh)hftp0.b_message;
                hfuo hfuo0 = gijh1.e;
                if(!hfuo0.c()) {
                    gijh1.e = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(arrayList0, gijh1.e);
            }
            acbc0.f(((gijh)hftp0.N_build()), 3, acbc0.a);
        }
    }

    @Override  // acct
    public final void n(int v, int v1) {
        synchronized(this) {
            if(this.P == 0L) {
                this.P = SystemClock.uptimeMillis() - this.O;
            }
            this.B();
        }
    }

    @Override  // accu
    public final void o(ContactPerson contactPerson0, int v, int v1, boolean z) {
        acbc acbc0 = this.p;
        giim giim0 = null;
        if(contactPerson0 != null) {
            ContactPerson.ContactMethod contactPerson$ContactMethod0 = contactPerson0.a();
            if(contactPerson$ContactMethod0 != null) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giim.a).v_newBuilder();
                switch(contactPerson$ContactMethod0.a) {
                    case 0: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giim)hftp0.b_message).c = 1;
                        ((giim)hftp0.b_message).b |= 1;
                        break;
                    }
                    case 1: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giim)hftp0.b_message).c = 2;
                        ((giim)hftp0.b_message).b |= 1;
                        break;
                    }
                    case 2: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giim)hftp0.b_message).c = 3;
                        ((giim)hftp0.b_message).b |= 1;
                        break;
                    }
                    default: {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((giim)hftp0.b_message).c = 0;
                        ((giim)hftp0.b_message).b |= 1;
                    }
                }
                giim0 = (giim)hftp0.N_build();
            }
        }
        int v2 = giip.a(v);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giiq.a).v_newBuilder();
        if(v2 != 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((giiq)hftp1.b_message).c = v2 - 1;
            ((giiq)hftp1.b_message).b |= 1;
        }
        if(giim0 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((giiq)hftp1.b_message).d = giim0;
            ((giiq)hftp1.b_message).b |= 2;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giiq)hftv0).b |= 4;
        ((giiq)hftv0).e = v1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        giiq giiq0 = (giiq)hftp1.b_message;
        giiq0.b |= 8;
        giiq0.f = z;
        acbc0.f(((giiq)hftp1.N_build()), 5, acbc0.a);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1) {
            if(v1 == -1) {
                String s = intent0.getStringExtra("authAccount");
                this.A(new Account(s, "com.google"), true);
                SharedPreferences.Editor sharedPreferences$Editor0 = this.getSharedPreferences("appinvite.default_account_prefs", 0).edit();
                sharedPreferences$Editor0.putString(this.j, s);
                sharedPreferences$Editor0.apply();
                this.w();
                return;
            }
            if(this.v == null) {
                this.x(false);
                this.setResult(202);
                this.finish();
            }
        }
        else if(v == 2) {
            if(v1 == -1) {
                this.z();
                return;
            }
            acfh.a(this, "Message failed to send", false, true);
            this.setResult(203);
            this.finish();
        }
    }

    @Override  // xnb
    public final void onBackPressed() {
        super.onBackPressed();
        if(this.isFinishing()) {
            this.x(false);
        }
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        Account account2;
        Account account1;
        super.onCreate(bundle0);
        if(hour.f()) {
            ((ggtj)AppInviteChimeraActivity.s.i()).x("AppinviteChimeraActivityDisabled");
            this.finish();
            return;
        }
        this.setContentView(0x7F0E0094);  // layout:appinvite_activity
        String s = bbmq.p(this);
        this.j = s;
        String s1 = bbmq.l(this, s);
        this.F = bundle0 == null ? AppInviteChimeraActivity.C() : bundle0.getString("sessionId");
        this.p = new acbc(this.F);
        this.O = SystemClock.uptimeMillis();
        Intent intent0 = this.getIntent();
        ArrayList arrayList0 = intent0.getParcelableArrayListExtra("com.google.android.gms.appinvite.ADDITIONAL_SUGGESTIONS");
        ArrayList arrayList1 = intent0.getParcelableArrayListExtra("com.google.android.gms.appinvite.additionalPeople");
        ArrayList arrayList2 = AppInviteChimeraActivity.D(intent0, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PERSON_IDS");
        ArrayList arrayList3 = AppInviteChimeraActivity.D(intent0, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_EMAIL_ADDRESSES");
        ArrayList arrayList4 = AppInviteChimeraActivity.D(intent0, "com.google.android.gms.appinvite.EXCLUDED_SUGGESTED_PHONE_NUMBERS");
        CharSequence charSequence0 = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.MESSAGE");
        Uri uri0 = (Uri)intent0.getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        String s2 = uri0 == null ? null : uri0.toString();
        int v = charSequence0 == null ? 0 : charSequence0.length();
        if(TextUtils.isEmpty(this.j)) {
            this.p.b(false, arrayList0, arrayList1, arrayList2, arrayList3, arrayList4, this.j, s1, v, s2);
            acfh.a(this, "Failed to start", false, true);
            this.setResult((TextUtils.isEmpty(this.j) ? 201 : 200));
            this.finish();
            return;
        }
        this.N = !TextUtils.isEmpty(intent0.getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT")) && !TextUtils.isEmpty(intent0.getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT"));
        this.setTitle(intent0.getCharSequenceExtra("com.google.android.gms.appinvite.TITLE"));
        Toolbar toolbar0 = (Toolbar)this.findViewById(0x7F0B22D9);  // id:toolbar
        this.l = toolbar0;
        this.hG(toolbar0);
        this.w = this.findViewById(0x7F0B14C5);  // id:fragment_container
        this.x = (ImageView)this.findViewById(0x7F0B1D35);  // id:progress_bar
        this.u = new ArrayList();
        if(bundle0 != null) {
            long[] arr_v = bundle0.getLongArray("pendingOperations");
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                this.u.add(Long.valueOf(arr_v[v1]));
            }
        }
        if(bundle0 == null) {
            this.p.b(true, arrayList0, arrayList1, arrayList2, arrayList3, arrayList4, this.j, s1, v, s2);
            Account account0 = (Account)intent0.getParcelableExtra("com.google.android.gms.appinvite.ACCOUNT_NAME");
            this.r = false;
            account1 = account0;
        }
        else {
            account1 = (Account)bundle0.getParcelable("account");
            this.r = bundle0.getBoolean("messageFocused");
            this.q = bundle0.getBoolean("message_edited");
            charSequence0 = bundle0.getString("message");
            this.I = bundle0.getBoolean("messageLimitFirstEdit");
            this.J = bundle0.getBoolean("messageLimitNearWarning");
        }
        aceb aceb0 = new aceb(this.getLayoutInflater().inflate(0x7F0E00A3, ((ViewGroup)this.w), false));  // layout:appinvite_edit_message
        this.k = aceb0;
        View view0 = aceb0.z;
        if(this.N) {
            view0.setOnClickListener(new acar(this));
        }
        else {
            view0.setVisibility(8);
        }
        this.C = intent0.getData();
        this.y = this.k.y;
        this.z = this.k.x;
        this.k.x.setContentDescription("Invitation image preview");
        this.D = new acas(this);
        accs accs0 = (accs)this.getSupportFragmentManager().h("imagePreviewFragment");
        this.o = accs0;
        if(accs0 != null) {
            accs0.ag = this.D;
        }
        this.z.setOnClickListener(new acat(this));
        this.m = this.k.w;
        this.n = this.k.u;
        this.k.u.setText(charSequence0);
        if(charSequence0 != null && charSequence0.length() > 100) {
            this.afterTextChanged(this.n.getText());
        }
        this.n.addTextChangedListener(this);
        this.n.setOnFocusChangeListener(new acav(this));
        this.E = intent0.getStringExtra("com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID");
        this.G = intent0.getStringExtra("com.google.android.gms.appinvite.iosTargetApplication");
        this.H = this.getIntent().getStringExtra("com.google.android.gms.appinvite.androidTargetApplication");
        this.K = azql.c(this).g(this.j) ? intent0.getCharSequenceExtra("com.google.android.gms.appinvite.DESCRIPTION") : null;
        this.L = intent0.getCharSequenceExtra("com.google.android.gms.appinvite.BUTTON_TEXT");
        this.M = intent0.getIntExtra("com.google.android.gms.appinvite.appMinimumVersionCode", 0);
        try {
            Resources resources0 = this.createPackageContext(this.j, 0).getResources();
            int v2 = resources0.getIdentifier("ai_config", "xml", this.j);
            if(v2 != 0) {
                this.y(resources0.getXml(v2));
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            a.ae(AppInviteChimeraActivity.s.i(), "getCallingAppInviteConfiguration failed", packageManager$NameNotFoundException0);
        }
        if(account1 == null) {
            String s3 = this.getSharedPreferences("appinvite.default_account_prefs", 0).getString(this.j, null);
            if(!TextUtils.isEmpty(s3)) {
                account1 = new Account(s3, "com.google");
            }
        }
        if(account1 != null && bbmn.o(this, account1, this.j)) {
            account2 = account1;
        }
        else {
            List list0 = bbmn.h(this, this.j);
            account2 = list0.size() == 1 ? ((Account)list0.get(0)) : null;
        }
        if(account2 == null) {
            this.s();
            return;
        }
        this.A(account2, false);
        this.w();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F100006, menu0);  // menu:appinvite_activity
        MenuItem menuItem0 = menu0.getItem(0);
        if(this.A != null && this.A.M() && !this.A.as.isEmpty() && this.n.getText().length() != 0 && this.n.getText().length() <= 100) {
            menuItem0.getIcon().setColorFilter(this.getResources().getColor(0x7F060BFF), PorterDuff.Mode.MULTIPLY);  // color:material_grey_white_1000
            menuItem0.setEnabled(true);
            return super.onCreateOptionsMenu(menu0);
        }
        menuItem0.getIcon().setColorFilter(this.getResources().getColor(0x7F060046), PorterDuff.Mode.MULTIPLY);  // color:appinvite_disabled_send
        menuItem0.setEnabled(false);
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x7F0B18EF && !this.A.as.isEmpty()) {  // id:menu_send
            this.z();
            this.x(true);
            this.B();
            return true;
        }
        return false;
    }

    @Override  // xoi
    protected final void onPause() {
        this.unregisterReceiver(this.t);
        if(this.B != null && this.B.isRunning()) {
            this.B.stop();
        }
        super.onPause();
    }

    @Override  // xoi
    protected final void onResumeFragments() {
        super.onResumeFragments();
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intentFilter0.addCategory("android.intent.category.DEFAULT");
        AppInviteChimeraActivity.AppInviteResponseReceiver appInviteChimeraActivity$AppInviteResponseReceiver0 = new AppInviteChimeraActivity.AppInviteResponseReceiver(this);
        this.t = appInviteChimeraActivity$AppInviteResponseReceiver0;
        jwe.b(this, appInviteChimeraActivity$AppInviteResponseReceiver0, intentFilter0, 4);
        ArrayList arrayList0 = new ArrayList(this.u);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Long long0 = (Long)arrayList0.get(v1);
            acay acay0 = AppInviteIntentOperation.b;
            if(acay0.a(long0)) {
                this.t((acay0.a(long0) ? ((Intent)acay0.a.get(long0)) : null));
            }
        }
        this.B();
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        int v = this.u.size();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = (long)(((Long)this.u.get(v1)));
        }
        bundle0.putLongArray("pendingOperations", arr_v);
        bundle0.putString("sessionId", this.F);
        bundle0.putParcelable("account", this.v);
        bundle0.putString("message", this.n.getText().toString());
        bundle0.putBoolean("messageFocused", this.r);
        bundle0.putBoolean("messageLimitFirstEdit", this.I);
        bundle0.putBoolean("messageLimitNearWarning", this.J);
        bundle0.putBoolean("message_edited", this.q);
    }

    @Override  // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    @Override  // accu
    public final void p(boolean z) {
        acbc acbc0 = this.p;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giiy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giiy giiy0 = (giiy)hftp0.b_message;
        giiy0.b |= 1;
        giiy0.c = ((int)z) ^ 1;
        acbc0.f(((giiy)hftp0.N_build()), 6, acbc0.a);
    }

    @Override  // accv
    public final void q(ContactPerson contactPerson0, boolean z) {
        if(z != this.A.as.isEmpty()) {
            this.supportInvalidateOptionsMenu();
        }
    }

    @Override  // accu
    public final void r() {
        synchronized(this) {
            this.R = SystemClock.uptimeMillis() - this.O;
        }
    }

    public final void s() {
        ArrayList arrayList0 = new ArrayList(bbmn.h(this, this.j));
        this.startActivityForResult(azou.b(this.v, arrayList0, new String[]{"com.google"}, true, false, 1), 1);
    }

    public final void t(Intent intent0) {
        long v = intent0.getLongExtra("appOperationCode", -1L);
        Long long0 = v;
        if(!this.u.contains(long0)) {
            acfh.a(this, "Message failed to send", false, true);
            this.B();
            return;
        }
        this.u.remove(long0);
        long0.getClass();
        acay acay0 = AppInviteIntentOperation.b;
        Long long1 = v;
        HashMap hashMap0 = acay0.a;
        if(hashMap0.containsKey(long1)) {
            hashMap0.remove(long1);
            acay0.b.remove(long1);
        }
        if(intent0.hasExtra("com.google.android.gms.appinvite.errorType")) {
            switch(intent0.getIntExtra("com.google.android.gms.appinvite.errorType", 0)) {
                case 1: {
                    this.setResult(intent0.getIntExtra("com.google.android.gms.appinvite.errorCode", 204));
                    this.finish();
                    break;
                }
                case 2: {
                    this.B();
                    this.S = 0L;
                    break;
                }
                case 3: {
                    Intent intent1 = (Intent)intent0.getParcelableExtra("com.google.android.gms.appinvite.authIntent");
                    if(intent1 == null) {
                        this.setResult(203);
                        this.finish();
                    }
                    else {
                        this.startActivityForResult(intent1, 2);
                    }
                    break;
                }
                default: {
                    this.setResult(204);
                    this.finish();
                }
            }
            if(this.isFinishing()) {
                this.x(false);
                return;
            }
            acfh.a(this, "Message failed to send", false, true);
            return;
        }
        String[] arr_s = intent0.getStringArrayExtra("appInviteResult");
        acfh.a(this, "Your invitation has been sent", false, false);
        Intent intent2 = new Intent();
        intent2.putExtra("com.google.android.gms.appinvite.RESULT_INVITATION_IDS", arr_s);
        this.setResult(-1, intent2);
        this.finish();
        this.x(true);
    }

    @Override  // accl
    public final uq u() {
        return this.k;
    }

    private final String v() {
        int v = 100 - this.n.getText().length();
        return v >= 0 ? this.getResources().getQuantityString(0x7F130006, v, new Object[]{v}) : this.getResources().getQuantityString(0x7F130005, -v, new Object[]{((int)(-v))});  // plurals:appinvite_message_within_limit
    }

    private final void w() {
        if(bbmn.h(this, this.j).size() > 1) {
            this.l.x(new acaw(this));
        }
    }

    private final void x(boolean z) {
        long v = this.S == 0L ? 0L : SystemClock.uptimeMillis() - this.S;
        acbc acbc0 = this.p;
        List list0 = this.A == null ? null : this.A.B();
        long v1 = SystemClock.uptimeMillis() - this.O;
        boolean z1 = Long.compare(this.P, 0L) != 0 && this.Q != 0L;
        boolean z2 = this.Q != 0L;
        int[] arr_v = new int[4];
        acbc.a(list0, arr_v);
        int v2 = arr_v[0];
        int v3 = arr_v[1];
        int v4 = arr_v[2];
        int v5 = arr_v[3];
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gijb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gijb)hftv0).b |= 1;
        ((gijb)hftv0).c = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gijb)hftv1).b |= 2;
        ((gijb)hftv1).d = v2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gijb)hftv2).b |= 4;
        ((gijb)hftv2).e = v5;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gijb)hftv3).b |= 8;
        ((gijb)hftv3).f = v4;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gijb)hftv4).b |= 16;
        ((gijb)hftv4).g = v3;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gijb)hftv5).b |= 0x20;
        ((gijb)hftv5).h = v;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((gijb)hftv6).b |= 0x40;
        ((gijb)hftv6).i = v1;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp0.b_message;
        ((gijb)hftv7).b |= 0x80;
        ((gijb)hftv7).j = z1;
        if(!hftv7.isImmutable()) {
            hftp0.ensureMutable();
        }
        gijb gijb0 = (gijb)hftp0.b_message;
        gijb0.b |= 0x100;
        gijb0.k = z2;
        acbc0.f(((gijb)hftp0.N_build()), 8, acbc0.a);
    }

    private final void y(XmlResourceParser xmlResourceParser0) {
        try {
            xmlResourceParser0.next();
            for(int v = xmlResourceParser0.getEventType(); true; v = xmlResourceParser0.next()) {
                if(v == 1) {
                    return;
                }
                if(xmlResourceParser0.getEventType() == 2 && xmlResourceParser0.getName().toLowerCase(Locale.ROOT).equals("string")) {
                    String s = xmlResourceParser0.getAttributeValue(null, "name");
                    String s1 = xmlResourceParser0.nextText().trim();
                    if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                        switch(s) {
                            case "ai_android_target_application": {
                                if(TextUtils.isEmpty(this.H)) {
                                    this.H = s1;
                                }
                                break;
                            }
                            case "ai_ios_target_application": {
                                if(TextUtils.isEmpty(this.G)) {
                                    this.G = s1;
                                }
                                break;
                            }
                            case "ga_trackingId": {
                                if(TextUtils.isEmpty(this.E)) {
                                    this.E = s1;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(XmlPullParserException | IOException exception0) {
            a.ae(AppInviteChimeraActivity.s.i(), "Error parsing configuration file", exception0);
        }
    }

    private final void z() {
        HashMap hashMap0;
        this.S = SystemClock.uptimeMillis();
        Uri uri0 = (Uri)this.getIntent().getParcelableExtra("com.google.android.gms.appinvite.DEEP_LINK_URL");
        Bundle bundle0 = this.getIntent().getBundleExtra("com.google.android.gms.appinvite.REFERRAL_PARAMETERS_URI");
        String s = null;
        if(bundle0 == null) {
            hashMap0 = null;
        }
        else {
            HashMap hashMap1 = new HashMap(bundle0.size());
            for(Object object0: bundle0.keySet()) {
                String s1 = (String)object0;
                if(s1 != null) {
                    String s2 = bundle0.getString(s1);
                    if(s2 != null) {
                        hashMap1.put(s1, s2);
                    }
                }
            }
            hashMap0 = hashMap1;
        }
        String s3 = uri0 == null ? null : uri0.toString();
        String s4 = this.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT");
        String s5 = this.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT");
        boolean z = this.C != null && !this.C.getScheme().equals("https") && !this.C.getScheme().equals("http");
        Context context0 = this.getApplicationContext();
        String s6 = bbmq.p(this);
        String s7 = this.v.name;
        String s8 = this.n.getText().toString();
        boolean z1 = this.N;
        String s9 = this.E;
        String s10 = AppInviteChimeraActivity.C();
        ArrayList arrayList0 = this.A.as;
        String s11 = this.G;
        String s12 = this.H;
        Uri uri1 = z ? null : this.C;
        String s13 = this.K == null ? null : this.K.toString();
        CharSequence charSequence0 = this.L;
        if(charSequence0 != null) {
            s = charSequence0.toString();
        }
        acba acba0 = new acba(context0, s6, s7, s8, (z1 ? s5 : null), (z1 ? s4 : null), s3, hashMap0, s9, s10, arrayList0, s11, s12, uri1, s13, s, this.M);
        AppInviteIntentOperation.a.offer(acba0);
        this.startService(IntentOperation.getStartIntent(this, AppInviteIntentOperation.class, "com.google.android.gms.appinvite.send.INTENT"));
        this.u.add(Long.valueOf(acba0.a));
    }
}

