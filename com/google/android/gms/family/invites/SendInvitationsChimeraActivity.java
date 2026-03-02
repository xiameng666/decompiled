package com.google.android.gms.family.invites;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import avyq;
import batl;
import bbhx;
import bbqr;
import bkcy;
import bkda;
import bkdi;
import bkdl;
import bkdn;
import bkdx;
import bkef;
import bkej;
import bkek;
import bkel;
import bkem;
import bken;
import bkeo;
import bkeq;
import bkeu;
import clht;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.family.AppContextProvider;
import com.google.android.gms.family.v2.model.ContactPerson.ContactMethod;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import com.google.android.gms.family.v2.model.PageData;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import godp;
import goet;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import lup;
import wof;
import woi;
import woo;
import xni;

@GmsCoreVeId(0x3F3AD)
public class SendInvitationsChimeraActivity extends xni implements View.OnClickListener, bkdl, bkej {
    private ViewGroup A;
    private ViewGroup B;
    private ViewGroup C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private String J;
    private bkeu K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private int P;
    private String Q;
    private PageData R;
    private PageData S;
    private PageData T;
    private ContactPickerOptionsData U;
    public WalletCustomTheme j;
    public String k;
    public ArrayList l;
    public bkeq m;
    public ResultReceiver n;
    public bkda o;
    public bkcy p;
    public goet q;
    private static final int[] r;
    private int s;
    private lup t;
    private SmsSentReceiver u;
    private bkek v;
    private final SparseArray w;
    private boolean x;
    private ArrayList y;
    private ViewGroup z;

    static {
        SendInvitationsChimeraActivity.r = new int[]{1, 2, 3, 4};
    }

    public SendInvitationsChimeraActivity() {
        this.l = new ArrayList();
        this.w = new SparseArray();
        this.x = false;
        this.y = new ArrayList();
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = "2";
        this.q = goet.a;
        this.U = new ContactPickerOptionsData(godp.a);
    }

    private final void A() {
        this.z(3);
        PageData pageData0 = this.S;
        if(pageData0 != null) {
            HashMap hashMap0 = pageData0.a;
            if(hashMap0 != null) {
                Integer integer0 = (int)2;
                if(hashMap0.containsKey(integer0)) {
                    this.y(this.B, ((String)this.S.a.get(integer0)));
                }
            }
        }
        RecyclerView recyclerView0 = (RecyclerView)this.B.findViewById(0x7F0B144E);  // id:fm_invitations_failed_list
        recyclerView0.ap(new LinearLayoutManager());
        List list0 = this.w(new HashSet(Arrays.asList(new Integer[]{((int)7), ((int)13)})));
        PageData pageData1 = this.S;
        if(pageData1 != null) {
            HashMap hashMap1 = pageData1.a;
            if(hashMap1 != null) {
                Integer integer1 = (int)3;
                if(hashMap1.containsKey(integer1)) {
                    TextView textView0 = (TextView)this.B.findViewById(0x7F0B1450);  // id:fm_invitations_retry_error_title
                    PageData pageData2 = this.S;
                    batl.s(pageData2);
                    bkdx.a(textView0, ((String)pageData2.a.get(integer1)), new bkdn(this.S, this, this.k));
                }
            }
        }
        recyclerView0.an(new bkef(list0, true, this));
        Button button0 = (Button)this.B.findViewById(0x7F0B1456);  // id:fm_invitations_skip_retry_button
        PageData pageData3 = this.S;
        if(pageData3 != null) {
            HashMap hashMap2 = pageData3.a;
            if(hashMap2 != null) {
                Integer integer2 = (int)5;
                if(hashMap2.containsKey(integer2)) {
                    button0.setText(((CharSequence)this.S.a.get(integer2)));
                }
            }
        }
        button0.setOnClickListener(this);
        Button button1 = (Button)this.B.findViewById(0x7F0B1451);  // id:fm_invitations_retry_now_button
        PageData pageData4 = this.S;
        if(pageData4 != null) {
            HashMap hashMap3 = pageData4.a;
            if(hashMap3 != null) {
                Integer integer3 = (int)4;
                if(hashMap3.containsKey(integer3)) {
                    button1.setText(((CharSequence)this.S.a.get(integer3)));
                }
            }
        }
        button1.setOnClickListener(this);
    }

    private final void B(int v, boolean z) {
        int v4;
        Contact contact0;
        ArrayList arrayList0 = this.l;
        int v1 = arrayList0.size();
        int v2 = 0;
        while(v2 < v1) {
            contact0 = (Contact)arrayList0.get(v2);
            ++v2;
            if(contact0.d != v) {
                continue;
            }
            goto label_9;
        }
        contact0 = null;
    label_9:
        if(contact0 == null) {
            Log.w("Family", String.format(Locale.US, "[SendInvChimeraAct] Failed to find contact in array, contactId:" + v));
            return;
        }
        int v3 = contact0.j;
        if(!z) {
            switch(v3) {
                case 1: {
                    v4 = 7;
                    break;
                }
                case 5: {
                    v4 = 13;
                    break;
                }
                default: {
                    if(v3 != 6 && v3 != 7) {
                        switch(v3) {
                            case 9: {
                                v4 = 13;
                                break;
                            }
                            case 10: {
                                v4 = 14;
                                break;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    else {
                        v4 = 14;
                    }
                }
            }
        }
        else if(v3 != 10) {
            v4 = 11;
        }
        else {
            v4 = 12;
        }
        contact0.j = v4;
    }

    private final boolean C() {
        return this.getIntent().getBooleanExtra("isDirectAddInvitations", false);
    }

    private final boolean D() {
        return this.getIntent().getBooleanExtra("isOnboardInvitations", false);
    }

    @Override  // bkej
    public final void a() {
        int v = this.s;
        if(v != 1) {
            switch(v) {
                case 2: {
                    this.t();
                    return;
                }
                case 3: {
                    goto label_8;
                }
            }
            if(v == 4) {
                this.u();
                return;
            label_8:
                this.A();
            }
        }
        else if(!this.H) {
            this.H = true;
            this.K.g(this.L, 10);
            this.U.g = this.getIntent().getIntExtra("max-available-slots", 5);
            if(!this.C()) {
            }
            this.U.a(new int[]{0});
            Intent intent0 = new Intent().setClassName(this, "com.google.android.gms.family.v2.invites.contactpicker.ContactPickerActivity").putExtra("customTheme", this.getIntent().getIntExtra("customTheme", 0)).putExtra("predefinedTheme", bbqr.c(this.getIntent().getStringExtra("predefinedTheme"))).putExtra("contactPickerOptions", this.U);
            if(this.C() && Objects.equals(this.J, "agsa")) {
                this.startActivityForResult(intent0, 3);
                return;
            }
            this.startActivityForResult(intent0, 1);
        }
    }

    final int g(int v) {
        bkeo bkeo1;
        synchronized(this) {
            bkeo bkeo0 = new bkeo();
            bkeo1 = (bkeo)this.w.get(v, bkeo0);
        }
        return bkeo1.a + bkeo1.b;
    }

    @Override  // bkdl
    public final Context getContext() {
        return this;
    }

    final void l(String s, int v) {
        this.D = 0;
        this.E = 0;
        ArrayList arrayList0 = this.l;
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            Contact contact0 = (Contact)arrayList0.get(v1);
            switch(contact0.j) {
                case 1: {
                    contact0.j = 3;
                    break;
                }
                case 7: {
                    contact0.j = 4;
                }
            }
        }
        String s1 = this.getIntent().getStringExtra("appId");
        batl.s(s1);
        this.t.c(v, null, new bkel(this, s1, s));
    }

    public final void m(int v, int v1) {
        Intent intent0 = new Intent();
        intent0.putExtra("num-invitations-sent", v1);
        intent0.putExtra("num-invitations-created", this.E + this.D);
        if(this.C() && "agsa".equals(this.J)) {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelableArrayList("direct-add-contacts-list", new ArrayList(this.w(new HashSet(Arrays.asList(new Integer[]{((int)15)})))));
            intent0.putExtras(bundle0);
        }
        this.o.b();
        intent0.putExtra("consistencyToken", this.o.b());
        intent0.putExtra("tokenExpirationTimeSecs", this.o.a());
        this.setResult(v, intent0);
        if(this.l != null && !this.l.isEmpty()) {
            bkeu bkeu0 = this.K;
            boolean z = this.L;
            int v2 = this.M;
            int v3 = this.N;
            int v4 = this.O;
            int v5 = this.P;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wof.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((wof)hftv0).c = 3;
            ((wof)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((wof)hftv1).b |= 2;
            ((wof)hftv1).d = v2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((wof)hftv2).b |= 4;
            ((wof)hftv2).e = v3;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((wof)hftv3).b |= 8;
            ((wof)hftv3).f = v4;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            wof wof0 = (wof)hftp0.b_message;
            wof0.b |= 16;
            wof0.g = v5;
            wof wof1 = (wof)hftp0.N_build();
            if(z) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)woo.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                woo woo0 = (woo)hftp1.b_message;
                wof1.getClass();
                woo0.d = wof1;
                woo0.b |= 2;
                bkeu0.c(((woo)hftp1.N_build()));
            }
            else {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)woi.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                woi woi0 = (woi)hftp2.b_message;
                wof1.getClass();
                woi0.d = wof1;
                woi0.b |= 2;
                bkeu0.b(((woi)hftp2.N_build()));
            }
        }
        this.finish();
    }

    final void n(int v, boolean z) {
        synchronized(this) {
            bkeo bkeo0 = new bkeo();
            SparseArray sparseArray0 = this.w;
            bkeo bkeo1 = (bkeo)sparseArray0.get(v, bkeo0);
            if(z) {
                ++bkeo1.a;
            }
            else {
                ++bkeo1.b;
            }
            sparseArray0.put(v, bkeo1);
        }
    }

    public final void o() {
        this.p(this.l);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 2: {
                this.v.a();
                return;
            }
            case 1: 
            case 3: {
                switch(v1) {
                    case -1: {
                        ArrayList arrayList0 = new ArrayList();
                        batl.s(intent0);
                        if(intent0.getParcelableArrayListExtra("selectedContacts") != null) {
                            batl.s(intent0);
                            arrayList0 = intent0.getParcelableArrayListExtra("selectedContacts");
                            batl.s(arrayList0);
                        }
                        ArrayList arrayList1 = new ArrayList();
                        int v2 = 0;
                        int v3 = 0;
                        int v4 = 0;
                        for(Object object0: arrayList0) {
                            ContactPerson.ContactMethod contactPerson$ContactMethod0 = (ContactPerson.ContactMethod)((ContactPerson)object0).d.get(0);
                            Contact contact0 = new Contact();
                            contact0.b = ((ContactPerson)object0).a;
                            contact0.d = v4;
                            contact0.g = ((ContactPerson)object0).c;
                            int v5 = contactPerson$ContactMethod0.a;
                            if(v5 == 1) {
                                contact0.a = contactPerson$ContactMethod0.b;
                                ++v2;
                            }
                            else if(v5 == 0) {
                                contact0.c = contactPerson$ContactMethod0.b;
                                ++v3;
                            }
                            contact0.j = 1;
                            arrayList1.add(contact0);
                            ++v4;
                        }
                        this.M = v2;
                        this.N = v3;
                        this.l = arrayList1;
                        if(arrayList1.isEmpty()) {
                            this.m(-1, 0);
                            return;
                        }
                        this.t();
                        if(v == 1) {
                            this.l(this.k, 2000);
                            return;
                        }
                        this.t.c(2000, null, new bken(this, this.J, this.l));
                        return;
                    }
                    case 0: {
                        this.m(0, 0);
                    }
                }
            }
        }
    }

    @Override  // xnb
    public final void onBackPressed() {
        switch(this.s) {
            case 1: {
                super.onBackPressed();
                return;
            }
            case 2: {
                return;
            }
            default: {
                this.m(0, this.F);
            }
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        switch(view0.getId()) {
            case 0x7F0B1451: {  // id:fm_invitations_retry_now_button
                this.y.clear();
                this.w.clear();
                if(this.x) {
                    this.l(this.k, 3000);
                }
                else {
                    String s = this.k;
                    this.D = 0;
                    this.E = 0;
                    HashSet hashSet0 = new HashSet(Collections.singletonList(Integer.valueOf(13)));
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = this.l;
                    int v1 = arrayList1.size();
                    for(int v = 0; v < v1; ++v) {
                        Contact contact0 = (Contact)arrayList1.get(v);
                        if(hashSet0.contains(Integer.valueOf(contact0.j)) && contact0.b()) {
                            arrayList0.add(contact0);
                            contact0.j = 10;
                        }
                    }
                    this.m.a(arrayList0, s);
                }
                this.G = true;
                this.z(2);
                PageData pageData0 = this.T;
                if(pageData0 != null) {
                    HashMap hashMap0 = pageData0.a;
                    if(hashMap0 != null) {
                        Integer integer0 = (int)2;
                        if(hashMap0.containsKey(integer0)) {
                            this.y(this.A, ((String)this.T.a.get(integer0)));
                        }
                    }
                }
                return;
            }
            case 0x7F0B1454: {  // id:fm_invitations_skip_failures_button
                this.m(-1, this.F);
                return;
            }
            case 0x7F0B1456: {  // id:fm_invitations_skip_retry_button
                this.m(-1, this.F);
            }
        }
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        String s = this.getIntent().getStringExtra("clientCallingPackage");
        if(s != null) {
            bkdi.e(this, this.getIntent(), s);
            this.Q = Integer.toString(ModuleManager.get(this).getCurrentModule().moduleVersion);
        }
        this.t = this.getSupportLoaderManager();
        this.setContentView(0x7F0E03DF);  // layout:fm_invitations_base
        this.o = new bkda();
        if(this.getIntent().getStringExtra("consistencyToken") != null) {
            this.o.c(this.getIntent().getStringExtra("consistencyToken"), this.getIntent().getLongExtra("tokenExpirationTimeSecs", 0L));
        }
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x7F0B1457);  // id:fm_invitations_startup_page
        this.z = viewGroup0;
        this.y(viewGroup0, "Send invitations");
        this.A = (ViewGroup)this.findViewById(0x7F0B1452);  // id:fm_invitations_sending
        this.B = (ViewGroup)this.findViewById(0x7F0B144F);  // id:fm_invitations_retry_error
        this.C = (ViewGroup)this.findViewById(0x7F0B1453);  // id:fm_invitations_skip_failures
        this.n = new SendInvitationsResultReceiver(new clht(Looper.getMainLooper()), new WeakReference(this));
        String s1 = this.getIntent().getStringExtra("accountName");
        batl.s(s1);
        this.k = s1;
        String s2 = this.getIntent().getStringExtra("appId");
        batl.s(s2);
        this.J = s2;
        goet goet0 = goet.b(this.getIntent().getIntExtra("inviteeRole", 3));
        batl.s(goet0);
        this.q = goet0;
        this.p = new bkcy(this.J, this.Q);
        this.T = (PageData)this.getIntent().getParcelableExtra("invitesSendingPagedata");
        this.S = (PageData)this.getIntent().getParcelableExtra("invitesRetryPagedata");
        this.R = (PageData)this.getIntent().getParcelableExtra("invitesRetryLaterPagedata");
        if(this.getIntent().getParcelableExtra("contactPickerOptions") != null) {
            ContactPickerOptionsData contactPickerOptionsData0 = (ContactPickerOptionsData)this.getIntent().getParcelableExtra("contactPickerOptions");
            batl.s(contactPickerOptionsData0);
            this.U = contactPickerOptionsData0;
        }
        int v = bkdi.a(this.getIntent());
        WalletCustomTheme walletCustomTheme0 = new WalletCustomTheme();
        walletCustomTheme0.g(avyq.a(this, v));
        this.j = walletCustomTheme0;
        this.L = this.D();
        bkeu bkeu0 = new bkeu(this);
        this.K = bkeu0;
        bkeu0.d(this.k, this.Q, this.J);
        this.K.g(this.L, 2);
        this.u = new SmsSentReceiver(this.n);
        SmsManager smsManager0 = bbhx.a(AppContextProvider.a());
        batl.s(smsManager0);
        this.m = new bkeq(this, smsManager0);
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.family.invites");
        this.getApplicationContext().registerReceiver(this.u, intentFilter0);
        if(bundle0 == null) {
            this.s = 1;
            this.H = false;
        }
        else {
            this.s = bundle0.getInt("currentState");
            if(bundle0.getParcelableArrayList("selectedContacts") != null) {
                ArrayList arrayList0 = bundle0.getParcelableArrayList("selectedContacts");
                batl.s(arrayList0);
                this.l = arrayList0;
            }
            this.H = bundle0.getBoolean("selectionActivityLaunched");
            this.I = bundle0.getBoolean("permissionRecoveryLaunched");
            this.x = bundle0.getBoolean("creationFailed");
            if(bundle0.getParcelableArrayList("failedSendingContacts") != null) {
                ArrayList arrayList1 = bundle0.getParcelableArrayList("failedSendingContacts");
                batl.s(arrayList1);
                this.y = arrayList1;
            }
            this.D = bundle0.getInt("numInvitationsSentSuccessfully");
            this.E = bundle0.getInt("numInvitationsSendingFailures");
            this.F = bundle0.getInt("numInvited");
            this.G = bundle0.getBoolean("retried");
        }
        bkek bkek0 = new bkek(this);
        this.v = bkek0;
        if(!this.I) {
            bkek0.a();
            this.I = true;
            return;
        }
        this.a();
    }

    @Override  // xni
    public final void onDestroy() {
        bkeu bkeu0 = this.K;
        if(bkeu0 != null) {
            bkeu0.g(this.L, 3);
        }
        this.getApplicationContext().unregisterReceiver(this.u);
        super.onDestroy();
    }

    @Override  // xoi
    public final void onResume() {
        super.onResume();
    }

    @Override  // xnb
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("selectionActivityLaunched", this.H);
        bundle0.putBoolean("permissionRecoveryLaunched", this.I);
        bundle0.putInt("currentState", this.s);
        bundle0.putParcelableArrayList("selectedContacts", this.l);
        bundle0.putBoolean("creationFailed", this.x);
        bundle0.putParcelableArrayList("failedSendingContacts", this.y);
        bundle0.putInt("numInvitationsSentSuccessfully", this.D);
        bundle0.putInt("numInvitationsSendingFailures", this.E);
        bundle0.putInt("numInvited", this.F);
        bundle0.putBoolean("retried", this.G);
    }

    public final void p(List list0) {
        if(list0.isEmpty()) {
            return;
        }
        this.x = true;
        for(Object object0: list0) {
            Contact contact0 = (Contact)object0;
            this.y.add(contact0);
            switch(contact0.j) {
                case 3: {
                    contact0.j = 7;
                    break;
                }
                case 4: {
                    contact0.j = 8;
                }
            }
        }
        this.v();
    }

    public final void q(Contact contact0, boolean z) {
        this.B(contact0.d, z);
        this.v();
    }

    final void r(Contact contact0) {
        ++this.E;
        this.y.add(contact0);
        if(!TextUtils.isEmpty(contact0.f)) {
            this.x(contact0, false);
            return;
        }
        this.B(contact0.d, false);
        this.v();
    }

    public final void s(Contact contact0) {
        if(contact0.b()) {
            this.n(contact0.d, true);
            if(this.g(contact0.d) < contact0.h) {
                return;
            }
            int v = contact0.d;
            bkeo bkeo0 = new bkeo();
            if(((bkeo)this.w.get(v, bkeo0)).b != 0) {
                this.r(contact0);
                return;
            }
        }
        ++this.D;
        ++this.F;
        if(contact0.b()) {
            ++this.O;
        }
        else {
            ++this.P;
        }
        if(contact0.b()) {
            this.x(contact0, true);
            return;
        }
        this.B(contact0.d, true);
        this.v();
    }

    final void t() {
        this.z(2);
        PageData pageData0 = this.T;
        if(pageData0 != null) {
            HashMap hashMap0 = pageData0.a;
            if(hashMap0 != null) {
                Integer integer0 = (int)2;
                if(hashMap0.containsKey(integer0)) {
                    this.y(this.A, ((String)this.T.a.get(integer0)));
                }
            }
        }
    }

    public final void u() {
        this.z(4);
        PageData pageData0 = this.R;
        if(pageData0 != null) {
            HashMap hashMap0 = pageData0.a;
            if(hashMap0 != null) {
                Integer integer0 = (int)2;
                if(hashMap0.containsKey(integer0)) {
                    this.y(this.C, ((String)this.R.a.get(integer0)));
                }
            }
        }
        RecyclerView recyclerView0 = (RecyclerView)this.C.findViewById(0x7F0B144E);  // id:fm_invitations_failed_list
        recyclerView0.ap(new LinearLayoutManager());
        List list0 = this.w(new HashSet(Arrays.asList(new Integer[]{((int)8), ((int)14), ((int)16)})));
        PageData pageData1 = this.R;
        if(pageData1 != null) {
            HashMap hashMap1 = pageData1.a;
            if(hashMap1 != null) {
                Integer integer1 = (int)3;
                if(hashMap1.containsKey(integer1)) {
                    TextView textView0 = (TextView)this.C.findViewById(0x7F0B1458);  // id:fm_invitations_text_skip_failures_title
                    PageData pageData2 = this.R;
                    batl.s(pageData2);
                    bkdx.a(textView0, ((String)pageData2.a.get(integer1)), new bkdn(this.R, this, this.k));
                }
            }
        }
        recyclerView0.an(new bkef(list0, true, this));
        Button button0 = (Button)this.C.findViewById(0x7F0B1454);  // id:fm_invitations_skip_failures_button
        TextView textView1 = (TextView)this.C.findViewById(0x7F0B1455);  // id:fm_invitations_skip_list_header
        if(this.C()) {
            textView1.setVisibility(8);
        }
        else {
            textView1.setText(0x7F151243);  // string:fm_invitations_text_invitations "Invitations"
            textView1.setVisibility(0);
        }
        PageData pageData3 = this.R;
        if(pageData3 != null) {
            HashMap hashMap2 = pageData3.a;
            if(hashMap2 != null) {
                Integer integer2 = (int)4;
                if(hashMap2.containsKey(integer2)) {
                    button0.setText(((CharSequence)this.R.a.get(integer2)));
                }
            }
        }
        button0.setOnClickListener(this);
    }

    public final void v() {
        HashSet hashSet0 = new HashSet(Arrays.asList(new Integer[]{((int)1), ((int)3), ((int)4), ((int)9), ((int)10)}));
        ArrayList arrayList0 = this.l;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            boolean z = hashSet0.contains(Integer.valueOf(((Contact)arrayList0.get(v1)).j));
            ++v1;
            if(z) {
                return;
            }
        }
        if(this.y.isEmpty()) {
            this.m(-1, this.F);
            return;
        }
        if(!this.G) {
            this.A();
            return;
        }
        this.u();
    }

    private final List w(Set set0) {
        List list0 = new ArrayList();
        ArrayList arrayList0 = this.l;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Contact contact0 = (Contact)arrayList0.get(v1);
            if(set0.contains(Integer.valueOf(contact0.j))) {
                list0.add(contact0);
            }
        }
        return list0;
    }

    private final void x(Contact contact0, boolean z) {
        this.t.c(contact0.d + 10000, null, new bkem(this, contact0, z));
    }

    private final void y(ViewGroup viewGroup0, String s) {
        Toolbar toolbar0 = (Toolbar)viewGroup0.findViewById(0x7F0B149C);  // id:fm_toolbar
        toolbar0.D(bbqr.c(s));
        if(this.D()) {
            toolbar0.F(0xFF000000);
            toolbar0.setBackgroundResource(0x106000B);
        }
    }

    private final void z(int v) {
        ViewGroup viewGroup0;
        this.s = v;
        int[] arr_v = SendInvitationsChimeraActivity.r;
        for(int v1 = 0; v1 < 4; ++v1) {
            int v2 = arr_v[v1];
            if(v2 == 2) {
                viewGroup0 = this.A;
            }
            else {
                switch(v2) {
                    case 3: {
                        viewGroup0 = this.B;
                        break;
                    }
                    case 4: {
                        viewGroup0 = this.C;
                        break;
                    }
                    default: {
                        viewGroup0 = this.z;
                    }
                }
            }
            viewGroup0.setVisibility((v2 == v ? 0 : 8));
        }
    }
}

