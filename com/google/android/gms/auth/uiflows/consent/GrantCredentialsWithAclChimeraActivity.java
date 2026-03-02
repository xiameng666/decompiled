package com.google.android.gms.auth.uiflows.consent;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import adga;
import ajct;
import ajol;
import ajpt;
import amen;
import ameq;
import amer;
import amew;
import amez;
import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import bazc;
import bazd;
import baze;
import bazg;
import bazh;
import bbcu;
import bbmo;
import bbmu;
import bbnp;
import bboh;
import bbqa;
import ca;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fm;
import gged_interceptors;
import ggtj;
import ghow;
import ghpa;
import hfrj;
import hftc;
import hfuo;
import hfur;
import hfvv;
import java.util.ArrayList;
import java.util.Iterator;
import zdr;

@GmsCoreVeId(257102)
public class GrantCredentialsWithAclChimeraActivity extends amez implements View.OnClickListener {
    private zdr A;
    private Button B;
    private Button C;
    private ScrollViewWithEvents D;
    long h;
    public static final int i;
    private static final bboh j;
    private String k;
    private int l;
    private String m;
    private String n;
    private ArrayList o;
    private int p;
    private boolean q;
    private boolean t;
    private Drawable u;
    private String z;

    static {
        GrantCredentialsWithAclChimeraActivity.j = bboh.b("GLSActivity", bbcu.cf);
    }

    public GrantCredentialsWithAclChimeraActivity() {
        this.o = new ArrayList();
        this.h = 0L;
    }

    private final Intent b(ajpt ajpt0, ajol ajol0) {
        Intent intent0 = new Intent();
        ArrayList arrayList0 = this.o;
        int v = arrayList0.size();
        String s = null;
        FACLConfig fACLConfig0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            ScopeData scopeData0 = (ScopeData)arrayList0.get(v1);
            if(scopeData0.g) {
                fACLConfig0 = new FACLConfig(scopeData0.n, scopeData0.h, scopeData0.o, scopeData0.l, scopeData0.m, scopeData0.k);
            }
            if(scopeData0.b()) {
                s = scopeData0.f;
            }
        }
        ConsentResult consentResult0 = new ConsentResult(ajpt0, s, fACLConfig0, ajol0, this.getIntent().getStringExtra("GrantCredentialsWithAclChimeraActivityconsentCookieWrapper"));
        intent0.putExtra(ConsentResult.a, consentResult0);
        return intent0;
    }

    @Override  // amdx
    public final String gQ() {
        return "GrantCredentialsWithAclActivity";
    }

    private final void k(Bundle bundle0) {
        this.k = bundle0.getString("callingPkg");
        this.l = bundle0.getInt("callingUid");
        this.m = bundle0.getString("service");
        this.n = bundle0.getString("acctName");
        this.p = bundle0.getInt("lastScopeIndex");
        this.q = bundle0.getBoolean("GrantCredentialsWithAclChimeraActivityhasTitle");
        ArrayList arrayList0 = bundle0.getParcelableArrayList("scopeData");
        if(arrayList0 != null) {
            this.o.clear();
            this.o.addAll(arrayList0);
        }
        this.t = bundle0.getBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp");
        ajct ajct0 = new ajct(this);
        this.u = ajct0.a(this.k);
        CharSequence charSequence0 = ajct0.b(this.k);
        if(charSequence0 != null) {
            this.z = charSequence0.toString();
            return;
        }
        if(this.t) {
            this.z = bundle0.getString("GrantCredentialsWithAclChimeraActivityremoteAppLabel");
        }
    }

    private final void l() {
        ArrayList arrayList0 = this.o;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ScopeData scopeData0 = (ScopeData)arrayList0.get(v1);
            scopeData0.f = null;
            scopeData0.h = null;
            scopeData0.k = false;
            scopeData0.l = false;
            scopeData0.m = false;
            scopeData0.n = false;
            scopeData0.o = false;
        }
        this.gN(0, this.b(ajpt.A, ajol.c));
        this.C.setEnabled(false);
        this.B.setEnabled(false);
    }

    private static final String o(int v) {
        return "scopeFragment" + v;
    }

    @Override  // xnz
    public final void onBackPressed() {
        this.l();
        super.onBackPressed();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        ProtoLiteBuilder hftp1;
        ProtoLiteBuilder hftp0;
        String s;
        int v = view0.getId();
        if(v == 0x7F0B0DFD) {  // id:cancel_button
            this.l();
            return;
        }
        if(v == 0x7F0B0A30) {  // id:accept_button
            ScrollViewWithEvents scrollViewWithEvents0 = this.D;
            boolean z = scrollViewWithEvents0.a(scrollViewWithEvents0.getScrollY());
            scrollViewWithEvents0.a = z;
            if(z) {
                int v1 = this.o.size();
                int v2 = 0;
                while(v2 < v1) {
                    ScopeData scopeData0 = (ScopeData)this.o.get(v2);
                    amer amer0 = (amer)this.gy().h(GrantCredentialsWithAclChimeraActivity.o(v2));
                    if(amer0 != null) {
                        ArrayList arrayList0 = amer0.c;
                        if(arrayList0 != null) {
                            if(arrayList0.isEmpty()) {
                                s = "";
                            }
                            else {
                                ArrayList arrayList1 = amer0.c;
                                String s1 = amer0.b.f;
                                if(s1 == null) {
                                    hftp0 = null;
                                }
                                else {
                                    try {
                                        byte[] arr_b = bbmu.f(s1);
                                        hftc hftc0 = hftc.a();
                                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)bazc.a), arr_b, 0, arr_b.length, hftc0);
                                        ProtoLiteMessage.P_makeImmutable(hftv0);
                                        hftp0 = null;
                                        Iterator iterator0 = ((bazc)hftv0).b.iterator();
                                        while(true) {
                                            if(!iterator0.hasNext()) {
                                                goto label_51;
                                            }
                                            Object object0 = iterator0.next();
                                            bazd bazd0 = (bazd)object0;
                                            if((bazd0.b & 2) != 0) {
                                                baze baze0 = bazd0.c == null ? baze.a : bazd0.c;
                                                hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)baze0).jf(5, null);
                                                hftp1.X(((ProtoLiteMessage)baze0));
                                                break;
                                            }
                                        }
                                    }
                                    catch(hfur hfur0) {
                                        goto label_46;
                                    }
                                    try {
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        ((baze)hftp1.b_message).b = hfvv.a;
                                        hftp0 = hftp1;
                                        goto label_51;
                                    }
                                    catch(hfur hfur0) {
                                        hftp0 = hftp1;
                                    }
                                label_46:
                                    bboh bboh0 = amer.a;
                                    if(((ggtj)bboh0.j()).ag()) {
                                        ((ggtj)bboh0.j()).B("Failed to get SharingRoster from RenderedSharingRoster: %s", hfur0.getMessage());
                                    }
                                }
                            label_51:
                                if(hftp0 == null) {
                                    hftp0 = ((ProtoLiteMessage)baze.a).v_newBuilder();
                                }
                                if(arrayList1 != null && !arrayList1.isEmpty()) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for(Object object1: arrayList1) {
                                        AudienceMember audienceMember0 = (AudienceMember)object1;
                                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bazg.a).v_newBuilder();
                                        int v3 = audienceMember0.b;
                                        int v4 = 1;
                                    alab1:
                                        switch(v3) {
                                            case 1: {
                                                int v5 = audienceMember0.c;
                                                switch(v5) {
                                                    case -1: {
                                                        String s2 = audienceMember0.d;
                                                        if(!hftp2.b_message.isImmutable()) {
                                                            hftp2.ensureMutable();
                                                        }
                                                        bazg bazg0 = (bazg)hftp2.b_message;
                                                        s2.getClass();
                                                        bazg0.b |= 2;
                                                        bazg0.d = s2;
                                                        break alab1;
                                                    }
                                                    case 1: {
                                                        break;
                                                    }
                                                    default: {
                                                        v4 = 3;
                                                        if(v5 == 2) {
                                                            v4 = 2;
                                                        }
                                                        else {
                                                            switch(v5) {
                                                                case 3: {
                                                                    break;
                                                                }
                                                                case 4: {
                                                                    v4 = 4;
                                                                    break;
                                                                }
                                                                default: {
                                                                    throw new IllegalArgumentException("Unknown system group type: " + v5);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if(!hftp2.b_message.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                ((bazg)hftp2.b_message).e = v4;
                                                ((bazg)hftp2.b_message).b |= 4;
                                                break;
                                            }
                                            case 2: {
                                                String s3 = audienceMember0.e;
                                                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)bazh.a).v_newBuilder();
                                                if(s3 != null && s3.startsWith("e:")) {
                                                    String s4 = s3.startsWith("e:") ? s3.substring(2) : null;
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    bazh bazh0 = (bazh)hftp3.b_message;
                                                    s4.getClass();
                                                    bazh0.b |= 1;
                                                    bazh0.c = s4;
                                                }
                                                else {
                                                    String s5 = s3 == null || !s3.startsWith("g:") ? null : s3.substring(2);
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    bazh bazh1 = (bazh)hftp3.b_message;
                                                    s5.getClass();
                                                    bazh1.b |= 4;
                                                    bazh1.d = s5;
                                                }
                                                if(!hftp2.b_message.isImmutable()) {
                                                    hftp2.ensureMutable();
                                                }
                                                bazg bazg1 = (bazg)hftp2.b_message;
                                                bazh bazh2 = (bazh)hftp3.N_build();
                                                bazh2.getClass();
                                                bazg1.c = bazh2;
                                                bazg1.b |= 1;
                                                break;
                                            }
                                            default: {
                                                throw new IllegalArgumentException("Unknown member type: " + v3);
                                            }
                                        }
                                        arrayList2.add(((bazg)hftp2.N_build()));
                                    }
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((baze)hftp0.b_message).b = hfvv.a;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    baze baze1 = (baze)hftp0.b_message;
                                    hfuo hfuo0 = baze1.b;
                                    if(!hfuo0.c()) {
                                        baze1.b = ProtoLiteMessage.E(hfuo0);
                                    }
                                    hfrj.E(arrayList2, baze1.b);
                                }
                                s = bbmu.c(((baze)hftp0.N_build()).toBytesArray());
                            }
                            scopeData0.f = s;
                            goto label_136;
                        }
                    }
                    if(amer0 != null && (amer0.b != null && amer0.b.g)) {
                        scopeData0.h = amer0.y();
                        scopeData0.n = amer0.b == null ? false : amer0.b.n;
                        scopeData0.o = amer0.b == null ? false : amer0.b.o;
                    }
                    else {
                        scopeData0.f = null;
                        scopeData0.h = null;
                        scopeData0.n = false;
                        scopeData0.o = false;
                    }
                label_136:
                    ++v2;
                }
                this.gN(-1, this.b(ajpt.c, ajol.b));
                this.C.setEnabled(false);
                this.B.setEnabled(false);
                return;
            }
            this.D.pageScroll(130);
            ++this.h;
        }
    }

    @Override  // amez
    public final void onCreate(Bundle bundle0) {
        String s2;
        super.onCreate(bundle0);
        String s = null;
        if(bundle0 != null) {
            this.k(bundle0);
            goto label_8;
        }
        if(this.getIntent().getExtras() != null) {
            this.k(this.getIntent().getExtras());
        label_8:
            if(this.n != null && this.k != null && this.m != null) {
                if(!this.t || this.u != null && this.z != null) {
                    goto label_14;
                }
                bboh bboh0 = GrantCredentialsWithAclChimeraActivity.j;
                if(((ggtj)bboh0.j()).ag()) {
                    ((ggtj)bboh0.j()).B("Failed to get ApplicationInfo for package: %s", this.k);
                    this.gN(0, null);
                    return;
                label_14:
                    this.requestWindowFeature(1);
                    this.setContentView(0x7F0E010E);  // layout:auth_consent_request_access_to_google_service
                    this.A = new amew(this, this, gged_interceptors.l(new Account(this.n, "com.google")));
                    ListView listView0 = (ListView)this.findViewById(0x102000A);
                    listView0.setAdapter(this.A);
                    listView0.setItemsCanFocus(false);
                    LinearLayout linearLayout0 = (LinearLayout)this.findViewById(0x7F0B1F2A);  // id:scopes_layout
                    this.D = (ScrollViewWithEvents)this.findViewById(0x7F0B1F40);  // id:scroll_view
                    fm fm0 = this.gy();
                    if(fm0.h("headerFragment") == null) {
                        ca ca0 = new ca(fm0);
                        ca0.u(0x7F0B1652, ameq.y(this.z), "headerFragment");  // id:header_fragment_layout
                        ca0.a();
                    }
                    if(this.o == null || this.o.isEmpty()) {
                        this.o = new ArrayList();
                        String s1 = this.m;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghpa.a).v_newBuilder();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghow.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        s1.getClass();
                        ((ghow)hftv0).b |= 1;
                        ((ghow)hftv0).c = s1;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((ghow)hftp1.b_message).d = 2;
                        ((ghow)hftp1.b_message).b |= 2;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ghpa ghpa0 = (ghpa)hftp0.b_message;
                        ghow ghow0 = (ghow)hftp1.N_build();
                        ghow0.getClass();
                        ghpa0.d = ghow0;
                        ghpa0.b |= 2;
                        adga.s(403, ((ghpa)hftp0.N_build()));
                        if(bbqa.d()) {
                            s2 = "UnsupportedTokenLabel";
                        }
                        else {
                            try {
                                PackageManager packageManager0 = this.getPackageManager();
                                PermissionInfo permissionInfo0 = packageManager0.getPermissionInfo("com.google.android.googleapps.permission.GOOGLE_AUTH." + s1, 0);
                                if(permissionInfo0.labelRes == 0) {
                                label_60:
                                    if(permissionInfo0.nonLocalizedLabel != null) {
                                        s2 = permissionInfo0.nonLocalizedLabel.toString();
                                        goto label_67;
                                    label_66:
                                        s2 = null;
                                    }
                                    else if(permissionInfo0.name != null) {
                                        s2 = permissionInfo0.name;
                                    }
                                    else {
                                        goto label_66;
                                    }
                                }
                                else {
                                    CharSequence charSequence0 = packageManager0.getText(permissionInfo0.packageName, permissionInfo0.labelRes, null);
                                    if(charSequence0 != null) {
                                        s2 = charSequence0.toString();
                                        goto label_67;
                                    }
                                    goto label_60;
                                }
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                                goto label_66;
                            }
                        }
                    label_67:
                        if(s2 == null) {
                            s2 = this.m;
                        }
                        if(s2.equals("SID") || s2.equals("LSID")) {
                            s2 = "Use SID and LSID cookies to gain access to all your Google account data.";
                            s = "Much like a password, Session Identification (SID) and Local Session Identification (LSID) cookies associate your identity with a series of requests from a browser. They allow full access to all of your account data. Only browsers have a legitimate use for these cookies.";
                        }
                        ScopeData scopeData0 = new ScopeData(s2, s, null, null, false, null, null, false, false, false, false, false, false, ScopeData.a, null);
                        this.o.add(scopeData0);
                    }
                    fm fm1 = this.gy();
                    ca ca1 = new ca(fm1);
                    int v1 = this.o.size();
                    for(int v = 0; v < v1; ++v) {
                        ScopeData scopeData1 = (ScopeData)this.o.get(v);
                        String s3 = GrantCredentialsWithAclChimeraActivity.o(v);
                        if(fm1.h(s3) == null) {
                            String s4 = this.z;
                            String s5 = this.n;
                            String s6 = this.k;
                            Bundle bundle1 = new Bundle();
                            bundle1.putInt("scope_index", v);
                            bundle1.putString("app_name", s4);
                            bundle1.putString("account_name", s5);
                            bundle1.putString("calling_package", s6);
                            bundle1.putParcelable("scope_data", scopeData1);
                            amer amer0 = new amer();
                            amer0.setArguments(bundle1);
                            ca1.u(0x7F0B1F2A, amer0, s3);  // id:scopes_layout
                        }
                    }
                    if(!ca1.l()) {
                        ca1.a();
                    }
                    ((TextView)this.findViewById(0x7F0B14B9)).setText("By continuing, you allow this app and Google to use your information in accordance with their respective terms of service and privacy policies.");  // id:footnote
                    Button button0 = (Button)this.findViewById(0x7F0B0DFD);  // id:cancel_button
                    this.B = button0;
                    button0.setOnClickListener(this);
                    Button button1 = (Button)this.findViewById(0x7F0B0A30);  // id:accept_button
                    this.C = button1;
                    button1.setOnClickListener(this);
                    Resources resources0 = this.getResources();
                    bbmo.b(this.getContainerActivity(), ((double)(bbnp.o(resources0) ? resources0.getDimension(0x7F070EB7) : resources0.getDimension(0x7F070EB6))));  // dimen:plus_auth_dialog_tablet_resize_factor
                    amen.a(this);
                    return;
                }
            }
            else {
                bboh bboh1 = GrantCredentialsWithAclChimeraActivity.j;
                if(((ggtj)bboh1.j()).ag()) {
                    ((ggtj)bboh1.j()).Y("%s started with username=%s callingPackage=%s service=%s", this.getClass().getSimpleName(), (this.n == null ? null : "<omitted>"), this.k, this.m);
                }
            }
            this.gN(0, null);
            return;
        }
        this.gN(0, null);
    }

    @Override  // amdx
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putString("callingPkg", this.k);
        bundle0.putInt("callingUid", this.l);
        bundle0.putString("service", this.m);
        bundle0.putString("acctName", this.n);
        bundle0.putParcelableArrayList("scopeData", this.o);
        bundle0.putInt("lastScopeIndex", this.p);
        bundle0.putBoolean("GrantCredentialsWithAclChimeraActivityhasTitle", this.q);
        bundle0.putBoolean("GrantCredentialsWithAclChimeraActivityisRemoteApp", this.t);
        bundle0.putString("GrantCredentialsWithAclChimeraActivityremoteAppLabel", this.z);
    }

    @Override  // xnz
    public final void onStart() {
        super.onStart();
    }

    @Override  // amdx
    public final void onStop() {
        super.onStop();
    }
}

