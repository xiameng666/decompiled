package com.google.android.gms.googlehelp.common;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import bauc;
import bbcu;
import bbmq;
import bbmu;
import bbnh;
import bboh;
import bbpr;
import blei;
import bthf;
import btie;
import btim;
import btin;
import btjc;
import btkc;
import btnt;
import btoa;
import bttg;
import btvm;
import btvz;
import btwq;
import bxd;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import gfta;
import ggtj;
import gnxf;
import gnzm;
import hftc;
import hfur;
import hgff;
import hjex;
import hjfo;
import hjfp;
import hjfq;
import hjfr;
import hjfs;
import hjft;
import hjfu;
import hjfx;
import hjga;
import htkd;
import htkq;
import htlc;
import htlj;
import htlv;
import htnx;
import htoa;
import htom;
import htos;
import htpn;
import htqu;
import htra;
import htsk;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelpConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public PendingIntent A;
    Boolean B;
    public int C;
    public static final Parcelable.Creator CREATOR;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    String H;
    public String I;
    public String J;
    public String K;
    boolean L;
    ND4CSettings M;
    public String N;
    List O;
    public boolean P;
    public String Q;
    int R;
    public int S;
    public List T;
    public boolean U;
    public String V;
    public gnxf W;
    public hgff X;
    public Intent Y;
    public List Z;
    public static final Set a;
    public Map aa;
    public boolean ab;
    public String ac;
    public int ad;
    public String ae;
    public float af;
    public long ag;
    public boolean ah;
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public int am;
    public List an;
    public int ao;
    private static final bboh ap;
    private static final Object aq;
    public String b;
    public String c;
    public Account d;
    public String e;
    public Bundle f;
    boolean g;
    public boolean h;
    public List i;
    public hjfr j;
    hjga k;
    public int l;
    @Deprecated
    public Bundle m;
    @Deprecated
    public Bitmap n;
    @Deprecated
    public byte[] o;
    @Deprecated
    public int p;
    @Deprecated
    public int q;
    String r;
    public Uri s;
    public List t;
    List u;
    boolean v;
    public boolean w;
    public String x;
    public ErrorReport y;
    public ThemeSettings z;

    static {
        HelpConfig.ap = bboh.b("gH_HelpConfig", bbcu.aw);
        HelpConfig.CREATOR = new btin();
        Set set0 = bbnh.e(4, false);
        set0.add(hjex.e);
        set0.add(hjex.b);
        set0.add(hjex.c);
        set0.add(hjex.d);
        HelpConfig.a = DesugarCollections.unmodifiableSet(set0);
        HelpConfig.aq = new Object();
    }

    public HelpConfig() {
        this(null, null, null, null, null, true, true, new ArrayList(), null, null, 0, null, null, null, 0, 0, null, null, new ArrayList(), new ArrayList(), false, false, null, new ErrorReport(), new ThemeSettings(), null, Boolean.valueOf(true), -1, false, false, false, false, null, null, null, null, false, null, null, new ArrayList(), false, null, 0, 0, new ArrayList(), false, null, null, null, null, new ArrayList());
    }

    public HelpConfig(String s, String s1, Account account0, String s2, Bundle bundle0, boolean z, boolean z1, List list0, Bundle bundle1, Bundle bundle2, int v, Bundle bundle3, Bitmap bitmap0, byte[] arr_b, int v1, int v2, String s3, Uri uri0, List list1, List list2, boolean z2, boolean z3, String s4, ErrorReport errorReport0, ThemeSettings themeSettings0, PendingIntent pendingIntent0, Boolean boolean0, int v3, boolean z4, boolean z5, boolean z6, boolean z7, String s5, String s6, String s7, String s8, boolean z8, ND4CSettings nD4CSettings0, String s9, List list3, boolean z9, String s10, int v4, int v5, List list4, boolean z10, String s11, Bundle bundle4, Bundle bundle5, Intent intent0, List list5) {
        ArrayList arrayList0;
        this.am = 0;
        this.C = v3;
        this.D = z4;
        this.E = z5;
        this.F = z6;
        this.b = s;
        this.K = s8;
        this.c = s1;
        this.d = account0;
        this.e = s2;
        this.f = btnt.a(htom.d()) ? btoa.e(bundle0) : bundle0;
        this.g = z;
        this.h = z1;
        this.G = z7;
        this.i = list0;
        hgff hgff0 = null;
        hjfr hjfr0 = null;
        if(bundle1 != null && bundle1.containsKey("EXTRA_ESCALATION_OPTIONS")) {
            try {
                byte[] arr_b1 = bundle1.getByteArray("EXTRA_ESCALATION_OPTIONS");
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hjfr.a), arr_b1, 0, arr_b1.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hjfr0 = (hjfr)hftv0;
            }
            catch(hfur unused_ex) {
            }
        }
        this.j = hjfr0;
        hjga hjga0 = null;
        if(bundle2 != null && bundle2.containsKey("EXTRA_REALTIME_SUPPORT_STATUS")) {
            try {
                byte[] arr_b2 = bundle2.getByteArray("EXTRA_REALTIME_SUPPORT_STATUS");
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hjga.a), arr_b2, 0, arr_b2.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                hjga0 = (hjga)hftv1;
            }
            catch(hfur unused_ex) {
            }
        }
        this.k = hjga0;
        this.l = v;
        this.x = s4;
        this.H = s5;
        this.I = s6;
        this.L = z8;
        this.A = pendingIntent0;
        this.m = btnt.a(htom.d()) ? btoa.e(bundle3) : bundle3;
        this.n = bitmap0;
        this.o = arr_b;
        this.p = v1;
        this.q = v2;
        this.y = errorReport0;
        this.r = s3;
        this.s = uri0;
        this.t = list1;
        this.z = themeSettings0;
        this.u = list2;
        this.v = z2;
        this.w = z3;
        this.aa = new bxd();
        this.ab = false;
        this.ac = "";
        this.ao = 1;
        this.ad = -1;
        this.ae = "";
        this.af = -1.0f;
        this.ag = -1L;
        this.ah = false;
        this.B = boolean0;
        this.J = s7;
        this.M = nD4CSettings0;
        this.N = s9;
        this.O = list3;
        if(list3 == null) {
            arrayList0 = new ArrayList();
        }
        else {
            arrayList0 = new ArrayList(list3.size());
            for(Object object0: list3) {
                arrayList0.add(((gnzm)bthf.a.ic().kt(((FRDProductSpecificDataEntry)object0))));
            }
        }
        this.an = arrayList0;
        if(btnt.a(htqu.a.b().b())) {
            this.P = z9;
        }
        if(btnt.a(htra.c())) {
            this.Q = s10;
        }
        if(btnt.a(htlj.k())) {
            this.R = v4;
        }
        if(btkc.d(s)) {
            this.S = v5;
            this.T = list4;
        }
        if(!TextUtils.isEmpty(s8)) {
            s = s8;
        }
        if(btnt.c(s, htlj.j(), htlj.e(), htlj.f())) {
            this.U = z10;
        }
        gnxf gnxf0 = null;
        this.V = s11;
        if(btnt.b(htlv.c())) {
            if(bundle4 != null && bundle4.containsKey("EXTRA_STARTING_FLOW")) {
                try {
                    byte[] arr_b3 = bundle4.getByteArray("EXTRA_STARTING_FLOW");
                    hftc hftc2 = hftc.a();
                    ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gnxf.a), arr_b3, 0, arr_b3.length, hftc2);
                    ProtoLiteMessage.P_makeImmutable(hftv2);
                    gnxf0 = (gnxf)hftv2;
                }
                catch(hfur unused_ex) {
                }
            }
            this.W = gnxf0;
            if(bundle5 != null && bundle5.containsKey("EXTRA_GSE_SESSION_OPTIONS")) {
                try {
                    byte[] arr_b4 = bundle5.getByteArray("EXTRA_GSE_SESSION_OPTIONS");
                    hftc hftc3 = hftc.a();
                    ProtoLiteMessage hftv3 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgff.a), arr_b4, 0, arr_b4.length, hftc3);
                    ProtoLiteMessage.P_makeImmutable(hftv3);
                    hgff0 = (hgff)hftv3;
                }
                catch(hfur unused_ex) {
                }
            }
            this.X = hgff0;
        }
        if(btnt.b(htlj.l())) {
            this.Y = intent0;
            this.Z = list5;
        }
    }

    public final boolean A(hjex hjex0) {
        if(hjex0 == hjex.c && !this.i.isEmpty()) {
            return true;
        }
        if(this.j != null && this.B(hjex0)) {
            switch(hjex0.ordinal()) {
                case 1: {
                    return (this.j.d == null ? hjfo.a : this.j.d).c;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    return (this.j.c == null ? hjfq.a : this.j.c).c;
                }
                case 6: {
                    return (this.j.e == null ? hjfp.a : this.j.e).b;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean B(hjex hjex0) {
        if(this.j == null) {
            return false;
        }
        switch(hjex0.ordinal()) {
            case 1: {
                return (this.j.b & 4) != 0;
            }
            case 2: {
                return (this.j.b & 2) != 0;
            }
            case 3: {
                return (this.j.b & 1) != 0;
            }
            case 6: {
                return (this.j.b & 8) != 0;
            }
            default: {
                return false;
            }
        }
    }

    public final boolean C() {
        return this.am == 1 || this.am == 2 || (this.am == 3 || this.am == 4);
    }

    public final boolean D() {
        return this.j == null ? false : ((this.j.f == null ? hjfx.a : this.j.f).b & 4) != 0;
    }

    public final boolean E() {
        return this.M != null && this.M.a;
    }

    public final boolean F() {
        return !TextUtils.isEmpty(this.ak);
    }

    public final boolean G() {
        return this.R == 2;
    }

    public final boolean H() {
        return !TextUtils.isEmpty(this.aj);
    }

    public final boolean I() {
        return this.R == 1;
    }

    public final boolean J(Context context0) {
        return context0 != null && !this.i.isEmpty() && bbpr.b(context0, ((String)this.i.get(0)));
    }

    public final boolean K() {
        return btnt.b(htlc.a.b().a()) && this.L;
    }

    public final boolean L() {
        return btnt.b(htlj.i()) && Boolean.parseBoolean(this.j(btie.v)) && this.v();
    }

    public final boolean M() {
        return !TextUtils.isEmpty(this.i()) || !TextUtils.isEmpty(this.m());
    }

    public final boolean N() {
        if(this.w) {
            return true;
        }
        String s = this.j(btie.e);
        return TextUtils.isEmpty(s) ? this.v : s.equalsIgnoreCase("top");
    }

    public final void O(hjfr hjfr0) {
        this.j = hjfr0;
        this.l = !htkq.a.b().e() || !this.t() ? 0 : 3;
    }

    public final void P(boolean z, long v) {
        this.ah = z;
        this.ag = v;
    }

    public final void Q(boolean z) {
        if(btwq.c(this)) {
            this.U = z;
        }
    }

    private final void R(Bundle bundle0) {
        if(bundle0 != null) {
            Bundle bundle1 = this.f;
            if(bundle1 != null) {
                bundle1.putAll(bundle0);
                return;
            }
            this.f = bundle0;
            return;
        }
        if(System.nanoTime() - this.ag > htkd.a.o().n() * 1000000L) {
            if(this.f == null) {
                this.f = new Bundle(1);
            }
            this.f.putString("gms:googlehelp:async_help_psd_failure", "timeout");
            this.F = true;
        }
    }

    private static void S(GoogleHelp googleHelp0, Context context0) {
        if(googleHelp0.A || googleHelp0.B) {
            Bundle bundle0 = googleHelp0.d;
            if(bundle0 != null) {
                if(bundle0.containsKey("gms:googlehelp:sync_help_psd_collection_time_ms")) {
                    btoa.E(0x8A, Long.valueOf(bundle0.getString("gms:googlehelp:sync_help_psd_collection_time_ms")).longValue(), googleHelp0, context0);
                    bttg.v(context0, googleHelp0, 53, Long.parseLong(bundle0.getString("gms:googlehelp:sync_help_psd_collection_time_ms")));
                    return;
                }
                if(bundle0.containsKey("gms:googlehelp:sync_help_psd_failure")) {
                    btoa.D(106, 62, bundle0.getString("gms:googlehelp:sync_help_psd_failure"), googleHelp0, context0);
                    return;
                }
                if(bundle0.containsKey("gms:googlehelp:async_help_psd_failure") && TextUtils.equals("null_api_client", bundle0.getString("gms:googlehelp:async_help_psd_failure"))) {
                    btoa.C(105, 0x8F, googleHelp0, context0);
                    bttg.y(context0, googleHelp0, 0x3F, 60);
                }
                if(bundle0.containsKey("gms:feedback:async_feedback_psd_failure") && TextUtils.equals("null_api_client", bundle0.getString("gms:feedback:async_feedback_psd_failure"))) {
                    btoa.C(104, 0x8F, googleHelp0, context0);
                    bttg.y(context0, googleHelp0, 0x40, 60);
                }
                if(bundle0.containsKey("gms:feedback:async_feedback_psbd_failure") && TextUtils.equals("null_api_client", bundle0.getString("gms:feedback:async_feedback_psbd_failure"))) {
                    btoa.C(103, 0x8F, googleHelp0, context0);
                    bttg.y(context0, googleHelp0, 65, 60);
                }
            }
        }
    }

    public final int a() {
        String s = this.j(btie.b);
        try {
            return Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            return -1;
        }
    }

    static Bundle b(hgff hgff0) {
        if(hgff0 != null && !((ProtoLiteMessage)hgff0).equals(hgff.a)) {
            Bundle bundle0 = new Bundle();
            bundle0.putByteArray("EXTRA_GSE_SESSION_OPTIONS", hgff0.toBytesArray());
            return bundle0;
        }
        return null;
    }

    public final Bundle c(Context context0) {
        if(this.D && !this.F) {
            this.r(context0);
        }
        return this.f;
    }

    public static HelpConfig d(GoogleHelp googleHelp0, Context context0) {
        Bundle bundle0;
        hgff hgff0;
        String s3;
        String s2;
        String s = TextUtils.isEmpty(googleHelp0.D) ? blei.c() : googleHelp0.D;
        String s1 = googleHelp0.e;
        List list0 = null;
        if(!btnt.a(htos.a.b().a()) || !TextUtils.isEmpty(s1)) {
            if(TextUtils.isEmpty(googleHelp0.F)) {
                s2 = googleHelp0.d == null || !googleHelp0.d.containsKey("genie-eng:app_pkg_name") ? null : googleHelp0.d.getString("genie-eng:app_pkg_name");
            }
            else {
                s2 = googleHelp0.F;
            }
            if(TextUtils.isEmpty(s2)) {
                s3 = null;
            }
            else {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvm.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((btvm)hftv0).b |= 0x40;
                ((btvm)hftv0).h = s;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s1.getClass();
                ((btvm)hftv1).b |= 2;
                ((btvm)hftv1).d = s1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((btvm)hftp0.b_message).i = 0xA9;
                ((btvm)hftp0.b_message).b |= 0x100;
                if(btoa.x(s1, htnx.a.b().a())) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((btvm)hftp0.b_message).j = 20;
                    ((btvm)hftp0.b_message).b |= 0x400;
                    bttg.o(context0, s, s1, 2);
                }
                else {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((btvm)hftp0.b_message).j = 21;
                    ((btvm)hftp0.b_message).b |= 0x400;
                    bttg.o(context0, s, s1, 3);
                    s2 = null;
                }
                MetricsIntentOperation.a(context0, ((btvm)hftp0.N_build()), false);
                s3 = s2;
            }
        }
        else {
            s3 = null;
        }
        Account account0 = googleHelp0.c;
        if(account0 == null && googleHelp0.E) {
            List list1 = btim.c(context0);
            if(!list1.isEmpty()) {
                account0 = (Account)list1.get(0);
            }
        }
        if(btnt.b(htlv.c())) {
            String s4 = googleHelp0.O;
            if(s4 == null) {
                hgff0 = hgff.a;
            }
            else {
                try {
                    byte[] arr_b = bbmu.d(s4);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgff.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv2);
                    hgff0 = (hgff)hftv2;
                }
                catch(hfur unused_ex) {
                    hgff0 = hgff.a;
                }
            }
            bundle0 = HelpConfig.b(hgff0);
        }
        else {
            bundle0 = null;
        }
        Intent intent0 = btnt.b(htlj.l()) ? googleHelp0.P : null;
        if(btnt.b(htlj.l())) {
            list0 = googleHelp0.Q;
        }
        return new HelpConfig(s1, googleHelp0.b, account0, s, googleHelp0.d, googleHelp0.h, googleHelp0.i, googleHelp0.j, null, null, 0, googleHelp0.k, googleHelp0.l, googleHelp0.m, googleHelp0.n, googleHelp0.o, googleHelp0.p, googleHelp0.q, googleHelp0.r, googleHelp0.t, googleHelp0.u, false, null, googleHelp0.v, googleHelp0.s, googleHelp0.y, Boolean.valueOf(true), googleHelp0.z, googleHelp0.A, googleHelp0.B, false, googleHelp0.E, null, null, null, s3, googleHelp0.G, googleHelp0.H, null, googleHelp0.J, googleHelp0.I, googleHelp0.K, googleHelp0.L, googleHelp0.M, googleHelp0.N, false, null, null, bundle0, intent0, list0);
    }

    public static HelpConfig e(Activity activity0, Bundle bundle0, Intent intent0) {
        gnxf gnxf0;
        HelpConfig helpConfig1;
        if(bundle0 != null) {
            HelpConfig helpConfig0 = (HelpConfig)bundle0.getParcelable("EXTRA_HELP_CONFIG");
            if(helpConfig0 != null) {
                helpConfig0.P(true, bundle0.getLong("EXTRA_START_TICK", System.nanoTime()));
            }
            return helpConfig0;
        }
        if(intent0 == null) {
            ((ggtj)HelpConfig.ap.i()).x("Can\'t construct HelpConfig; calling intent is null.");
            return null;
        }
        if(intent0.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp0 = (InProductHelp)bauc.b(intent0, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            HelpConfig.S(inProductHelp0.a, activity0);
            helpConfig1 = HelpConfig.d(inProductHelp0.a, activity0);
            helpConfig1.aj = inProductHelp0.b;
            helpConfig1.ak = inProductHelp0.c;
            helpConfig1.R = inProductHelp0.d;
            helpConfig1.am = inProductHelp0.f;
            helpConfig1.al = inProductHelp0.e;
            if(!btnt.b(htlv.c())) {
                goto label_38;
            }
            String s = inProductHelp0.g;
            if(s == null) {
                gnxf0 = gnxf.a;
            }
            else {
                try {
                    byte[] arr_b = bbmu.d(s);
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gnxf.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gnxf0 = (gnxf)hftv0;
                }
                catch(hfur unused_ex) {
                    gnxf0 = gnxf.a;
                }
            }
            helpConfig1.W = gnxf0;
            goto label_38;
        }
        if(intent0.hasExtra("EXTRA_GOOGLE_HELP")) {
            GoogleHelp googleHelp0 = (GoogleHelp)intent0.getParcelableExtra("EXTRA_GOOGLE_HELP");
            HelpConfig.S(googleHelp0, activity0);
            helpConfig1 = HelpConfig.d(googleHelp0, activity0);
            goto label_38;
        }
        if(intent0.hasExtra("EXTRA_HELP_CONFIG")) {
            helpConfig1 = (HelpConfig)intent0.getParcelableExtra("EXTRA_HELP_CONFIG");
        label_38:
            boolean z = intent0.hasExtra("EXTRA_START_TICK");
            helpConfig1.P(z, (z ? intent0.getLongExtra("EXTRA_START_TICK", -1L) : System.nanoTime()));
            if(TextUtils.isEmpty(helpConfig1.b)) {
                String s1 = bbmq.p(activity0);
                if(TextUtils.isEmpty(s1)) {
                    ((ggtj)HelpConfig.ap.i()).x("Received empty package name, and can\'t continue. Please fix help integration");
                    Intent intent1 = new Intent("android.intent.action.VIEW").setData(Uri.parse(htkd.z()));
                    if(bbmq.ae(activity0, intent1)) {
                        activity0.startActivity(intent1);
                    }
                    activity0.finish();
                    return helpConfig1;
                }
                helpConfig1.b = s1;
            }
            if(btnt.a(htsk.a.b().a()) && intent0.hasExtra("EXTRA_CUSTOM_FEEDBACK")) {
                helpConfig1.A = (PendingIntent)intent0.getParcelableExtra("EXTRA_CUSTOM_FEEDBACK");
            }
            try {
                PackageManager packageManager0 = activity0.getPackageManager();
                helpConfig1.ai = (String)packageManager0.getApplicationLabel(packageManager0.getApplicationInfo(helpConfig1.b, 0));
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                ((ggtj)((ggtj)HelpConfig.ap.j()).s(packageManager$NameNotFoundException0)).B("Fetching ApplicationInfo of %s failed.", helpConfig1.b);
            }
            return helpConfig1;
        }
        ((ggtj)HelpConfig.ap.i()).B("HelpConfig could not be created from intent: %s", intent0);
        return null;
    }

    public final hjex f() {
        hjfr hjfr0 = this.j;
        if(hjfr0 == null) {
            return hjex.a;
        }
        hjex hjex0 = hjex.b((hjfr0.f == null ? hjfx.a : hjfr0.f).f);
        return hjex0 == null ? hjex.a : hjex0;
    }

    public final String g() {
        return TextUtils.isEmpty(this.K) ? this.b : this.K;
    }

    public final String h() {
        if(!TextUtils.isEmpty(this.H)) {
            return this.H;
        }
        return this.s() ? (this.j.d == null ? hjfo.a : this.j.d).d : null;
    }

    public final String i() {
        return TextUtils.isEmpty(this.j(btie.s)) ? "" : htkd.z() + this.j(btie.s);
    }

    public final String j(btie btie0) {
        String s = (String)this.aa.get(btie0);
        return s == null ? btie0.y : s;
    }

    public final String k() {
        String s = this.j(btie.c);
        if(TextUtils.isEmpty(s)) {
            hjfr hjfr0 = this.j;
            if(hjfr0 != null && (hjfr0.b & 0x1000) != 0) {
                s = (hjfr0.i == null ? hjfu.a : hjfr0.i).c;
            }
        }
        if(btnt.a(htoa.c()) && TextUtils.isEmpty(s)) {
            return TextUtils.isEmpty(this.J) ? "" : this.J;
        }
        return s;
    }

    public final String l() {
        return this.M == null ? "" : this.M.b;
    }

    public final String m() {
        return TextUtils.isEmpty(this.j(btie.r)) ? "" : htkd.z() + this.j(btie.r);
    }

    public final String n() {
        return gfta.b(this.V);
    }

    public final List o() {
        if(this.u == null) {
            return new ArrayList();
        }
        List list0 = new ArrayList();
        for(Object object0: this.u) {
            btjc btjc0 = new btjc();
            btjc0.a = ((OfflineSuggestion)object0).a;
            btjc0.d = 4;
            btjc0.e = ((OfflineSuggestion)object0).b;
            btjc0.f = ((OfflineSuggestion)object0).c;
            btjc0.g = ((OfflineSuggestion)object0).d;
            list0.add(btjc0.a());
        }
        return list0;
    }

    public final List p(Context context0) {
        Bundle bundle0 = this.c(context0);
        if(bundle0 == null) {
            return null;
        }
        Set set0 = bundle0.keySet();
        if(set0.isEmpty()) {
            return null;
        }
        List list0 = new ArrayList(set0.size());
        for(Object object0: set0) {
            String s = bundle0.getString(((String)object0));
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((String)object0).getClass();
            ((btvz)hftv0).b |= 1;
            ((btvz)hftv0).c = (String)object0;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            btvz btvz0 = (btvz)hftp0.b_message;
            s.getClass();
            btvz0.b |= 2;
            btvz0.d = s;
            list0.add(((btvz)hftp0.N_build()));
        }
        return list0;
    }

    public final Set q() {
        if(this.j != null && (this.j.g == null ? hjfs.a : this.j.g).b.size() > 0) {
            Set set0 = HelpConfig.a;
            Set set1 = new LinkedHashSet(set0.size());
            int v = (this.j.g == null ? hjfs.a : this.j.g).b.size();
            for(int v1 = 0; v1 < v; ++v1) {
                hjex hjex0 = hjex.b((this.j.g == null ? hjfs.a : this.j.g).b.d(v1));
                if(hjex0 == null) {
                    hjex0 = hjex.a;
                }
                set1.add(hjex0);
            }
            set1.addAll(set0);
            return set1;
        }
        return HelpConfig.a;
    }

    public final void r(Context context0) {
        String s = btoa.l(this.ag);
        GoogleHelp googleHelp0 = new GoogleHelp(this.c);
        if(this.d != null && !TextUtils.isEmpty(this.d.name)) {
            googleHelp0.c = new Account(this.d.name, "com.google");
        }
        googleHelp0.e = this.b;
        googleHelp0.D = this.e;
        Bundle bundle0 = btoa.d(context0, s, googleHelp0);
        if(bundle0 != null) {
            this.F = true;
        }
        if(btnt.a(htpn.a.b().b())) {
            synchronized(HelpConfig.aq) {
                this.R(bundle0);
            }
            return;
        }
        this.R(bundle0);
    }

    public final boolean s() {
        return this.B(hjex.b);
    }

    public final boolean t() {
        return !TextUtils.isEmpty(this.N);
    }

    public final boolean u() {
        return this.j == null || (this.j.b & 0x2000) == 0 ? false : !(this.j.j == null ? hjft.a : this.j.j).c.isEmpty();
    }

    public final boolean v() {
        return this.d != null;
    }

    public final boolean w() {
        return !TextUtils.isEmpty(this.c);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Bundle bundle2;
        Bundle bundle1;
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 5, this.e, false);
        baub.g(parcel0, 6, this.f, false);
        baub.e(parcel0, 8, this.g);
        baub.e(parcel0, 9, this.h);
        baub.x(parcel0, 11, this.i, false);
        baub.g(parcel0, 15, this.m, false);
        baub.t(parcel0, 16, this.n, v, false);
        baub.v(parcel0, 19, this.r, false);
        baub.t(parcel0, 22, this.s, v, false);
        baub.y(parcel0, 23, this.t, false);
        baub.y(parcel0, 25, this.u, false);
        baub.v(parcel0, 0x1F, this.x, false);
        baub.i(parcel0, 0x20, this.o, false);
        baub.o(parcel0, 33, this.p);
        baub.o(parcel0, 34, this.q);
        hjfr hjfr0 = this.j;
        Bundle bundle0 = null;
        if(hjfr0 == null) {
            bundle1 = null;
        }
        else {
            bundle1 = new Bundle();
            bundle1.putByteArray("EXTRA_ESCALATION_OPTIONS", hjfr0.toBytesArray());
        }
        baub.g(parcel0, 35, bundle1, false);
        baub.o(parcel0, 36, this.l);
        baub.e(parcel0, 38, this.v);
        baub.t(parcel0, 39, this.y, v, false);
        baub.t(parcel0, 41, this.z, v, false);
        baub.e(parcel0, 42, this.w);
        hjga hjga0 = this.k;
        if(hjga0 == null) {
            bundle2 = null;
        }
        else {
            bundle2 = new Bundle();
            bundle2.putByteArray("EXTRA_REALTIME_SUPPORT_STATUS", hjga0.toBytesArray());
        }
        baub.g(parcel0, 50, bundle2, false);
        baub.t(parcel0, 52, this.A, v, false);
        baub.z(parcel0, 53, this.B);
        baub.o(parcel0, 56, this.C);
        baub.e(parcel0, 57, this.D);
        baub.e(parcel0, 58, this.E);
        baub.e(parcel0, 59, this.F);
        baub.e(parcel0, 60, this.G);
        baub.v(parcel0, 61, this.H, false);
        baub.v(parcel0, 62, this.I, false);
        baub.v(parcel0, 0x3F, this.J, false);
        baub.v(parcel0, 0x40, this.K, false);
        baub.e(parcel0, 65, this.L);
        baub.t(parcel0, 66, this.M, v, false);
        baub.v(parcel0, 67, this.N, false);
        baub.y(parcel0, 68, this.O, false);
        baub.e(parcel0, 69, this.P);
        baub.v(parcel0, 70, this.Q, false);
        baub.o(parcel0, 71, this.R);
        baub.o(parcel0, 72, this.S);
        baub.y(parcel0, 73, this.T, false);
        baub.e(parcel0, 74, this.U);
        baub.v(parcel0, 75, this.V, false);
        gnxf gnxf0 = this.W;
        if(gnxf0 != null) {
            bundle0 = new Bundle();
            bundle0.putByteArray("EXTRA_STARTING_FLOW", gnxf0.toBytesArray());
        }
        baub.g(parcel0, 76, bundle0, false);
        baub.g(parcel0, 77, HelpConfig.b(this.X), false);
        baub.t(parcel0, 78, this.Y, v, false);
        baub.x(parcel0, 0x4F, this.Z, false);
        baub.c(parcel0, v1);
    }

    public final boolean x() {
        return this.u != null && !this.u.isEmpty();
    }

    public final boolean y() {
        return !TextUtils.isEmpty(this.ac);
    }

    public final boolean z() {
        return this.ag != -1L;
    }
}

