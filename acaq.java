import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;

public final class acaq extends AsyncTask {
    private final acbk a;
    private final Context b;
    private final Intent c;
    private final long d;
    private final acbb e;
    private final acbc f;
    private final acap g;

    public acaq(Context context0, Intent intent0, acbc acbc0, acap acap0) {
        this.a = acbk.a(context0);
        this.e = new acbb(context0);
        this.b = context0.getApplicationContext();
        this.c = intent0;
        this.d = SystemClock.uptimeMillis();
        this.f = acbc0;
        this.g = acap0;
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        int v14;
        boolean z9;
        boolean z8;
        int v13;
        CharSequence charSequence3;
        String s54;
        boolean z7;
        String s53;
        String s52;
        String s51;
        int v12;
        CharSequence charSequence2;
        boolean z6;
        Bundle bundle1;
        String s50;
        String s46;
        String s45;
        int v11;
        Object object0;
        int v10;
        String s44;
        int v9;
        String s43;
        String s42;
        int v7;
        String s41;
        String s40;
        String s39;
        String s38;
        String s37;
        int v6;
        String s36;
        String s35;
        CharSequence charSequence1;
        int v5;
        boolean z3;
        CharSequence charSequence0;
        String s34;
        String s33;
        String s32;
        String s31;
        String s30;
        String s29;
        String s25;
        String s24;
        String s23;
        String s22;
        String s21;
        String s20;
        String s19;
        String s18;
        String s17;
        int v4;
        String s15;
        String s14;
        hila hila1;
        int v2;
        boolean z2;
        String s10;
        boolean z1;
        boolean z;
        int v1;
        String s7;
        hijc hijc0;
        Void[] arr_void = (Void[])arr_object;
        int v = this.c.getBooleanExtra("com.google.android.gms.appinvite.FROM_INTENT_URL", false) ? 3 : 2;
        String s = this.c.getDataString();
        String s1 = this.c.getStringExtra("signature");
        String s2 = this.c.getStringExtra("response");
        try {
            byte[] arr_b = bbmu.d(s2);
            Signature signature0 = Signature.getInstance("SHA256withECDSA");
            X509EncodedKeySpec x509EncodedKeySpec0 = new X509EncodedKeySpec(bbmu.d(houq.a.b().k()));
            signature0.initVerify(KeyFactory.getInstance("EC").generatePublic(x509EncodedKeySpec0));
            signature0.update(arr_b);
            if(signature0.verify(bbmu.d(s1))) {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hijc.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hijc0 = (hijc)hftv0;
                if(hijc0.g < System.currentTimeMillis()) {
                    hijc0 = null;
                }
            }
            else {
                hijc0 = null;
            }
        }
        catch(Exception unused_ex) {
            hijc0 = null;
        }
        if(hijc0 == null && !TextUtils.isEmpty(s)) {
            baqr baqr0 = new baqr();
            baqr0.a = Process.myUid();
            baqr0.d = "com.google.android.gms";
            baqr0.e = "com.google.android.gms";
            acbk acbk0 = this.a;
            hijc hijc1 = acbk0.a.c(baqr0, s);
            if(hijc1 != null && (hijc1.b & 1) != 0 && !(hijc1.c == null ? hikm.a : hijc1.c).g.isEmpty()) {
                Uri uri0 = Uri.parse((hijc1.c == null ? hikm.a : hijc1.c).g);
                String s3 = String.format("%s://%s", uri0.getScheme(), uri0.getHost());
                String s4 = uri0.getPath();
                houq.g();
                String s5 = houq.c();
                String s6 = houq.d();
                acbf acbf0 = new acbf(new bbeo(acbk0.b, s3, s4, s5, s6));
                hijc0 = new acbj(acbk0.b, acbf0).c(baqr0, s);
            }
            else {
                hijc0 = hijc1;
            }
        }
        if(hijc0 != null && (hijc0.b & 1) != 0 && (!(hijc0.c == null ? hikm.a : hijc0.c).c.isEmpty() || ((hijc0.c == null ? hikm.a : hijc0.c).b & 8) != 0)) {
            hikm hikm0 = hijc0.c == null ? hikm.a : hijc0.c;
            if((hikm0.b & 8) == 0) {
                v1 = 0;
                z1 = false;
                z = false;
                s7 = null;
            }
            else {
                hijd hijd0 = hikm0.f == null ? hijd.a : hikm0.f;
                s7 = hijd0.c;
                v1 = (hijd0.b & 2) == 0 ? 0 : hijd0.d;
                Context context0 = this.b;
                z = bbmq.U(context0, s7);
                if(z) {
                    try {
                        if(context0.getPackageManager().getPackageInfo(s7, 0).versionCode < v1) {
                            z1 = true;
                            goto label_53;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                    goto label_47;
                }
                else {
                label_47:
                    z1 = false;
                }
            }
        label_53:
            String s8 = hikm0.d;
            String s9 = hikm0.c;
            s10 = (hikm0.e == null ? hikg.a : hikm0.e).c;
            if(!acfe.e(s9)) {
                z2 = false;
            }
            else if(!TextUtils.isEmpty(Uri.parse(s9).getQueryParameter("url"))) {
                z2 = true;
            }
            else {
                z2 = false;
            }
            if((hijc0.b & 4) != 0 && ((hijc0.e == null ? hijq.a : hijc0.e).b & 0x20) != 0) {
                hijq hijq0 = hijc0.e == null ? hijq.a : hijc0.e;
                String s11 = hijq0.g;
                String s12 = hijq0.j;
                String s13 = (hijq0.h == null ? hila.a : hijq0.h).d;
                v2 = v;
                hila hila0 = hijq0.h;
                if(hila0 == null) {
                    hila1 = null;
                    hila0 = hila.a;
                }
                else {
                    hila1 = hila0;
                }
                int v3 = hikz.a(hila0.c) == 0 ? 1 : hikz.a(hila0.c);
                if(hila1 == null) {
                    hila1 = hila.a;
                }
                s14 = s11;
                s15 = hila1.e;
                String s16 = hijq0.i;
                if(v3 != 2 && v3 != 3) {
                    v4 = v3;
                    s17 = s13;
                    s18 = s16;
                    s15 = null;
                    s19 = null;
                    s20 = null;
                    s21 = null;
                    s22 = null;
                    s23 = null;
                    s24 = s12;
                    s25 = null;
                }
                else {
                    String s26 = hijq0.c;
                    v4 = v3;
                    String s27 = hijq0.e;
                    if(hour.g()) {
                        s20 = s27;
                        s21 = hijq0.k;
                        s22 = hijq0.l;
                    }
                    else {
                        s20 = s27;
                        s21 = null;
                        s22 = null;
                    }
                    s25 = s26;
                    s18 = s16;
                    s19 = hijq0.f;
                    s17 = s13;
                    s24 = s12;
                    s23 = hijq0.d;
                }
            }
            else {
                v2 = v;
                s18 = null;
                s25 = null;
                s24 = null;
                s17 = null;
                s15 = null;
                s14 = null;
                s19 = null;
                v4 = 1;
                s20 = null;
                s21 = null;
                s22 = null;
                s23 = null;
            }
            aboh aboh0 = this.e.a();
            this.e.b(aboh0, (hijc0.d == null ? hikc.a : hijc0.d));
            hikc hikc0 = hijc0.d == null ? hikc.a : hijc0.d;
            if((hikc0.c == null ? hijv.a : hikc0.c).c.isEmpty()) {
            label_175:
                s29 = s24;
                s30 = s20;
                s31 = s19;
                s32 = s23;
                s33 = s25;
                s34 = s17;
                charSequence0 = s7;
                z3 = z1;
                v5 = z;
                charSequence1 = s8;
                s35 = s21;
                s36 = s9;
                v6 = v4;
                s37 = s18;
                s38 = s22;
                s39 = s14;
                s40 = s;
                s41 = s15;
                v7 = 1;
            }
            else {
                hikc hikc1 = hijc0.d == null ? hikc.a : hijc0.d;
                if(((hijw)(hikc1.c == null ? hijv.a : hikc1.c).c.get(0)).g.isEmpty()) {
                    goto label_175;
                }
                else {
                    hikc hikc2 = hijc0.d == null ? hikc.a : hijc0.d;
                    String s28 = ((hiju)((hijw)(hikc2.c == null ? hijv.a : hikc2.c).c.get(0)).g.get(0)).c;
                    if("Email".equals(s28)) {
                        s29 = s24;
                        s30 = s20;
                        s31 = s19;
                        s32 = s23;
                        s33 = s25;
                        s34 = s17;
                        charSequence0 = s7;
                        z3 = z1;
                        v5 = z;
                        charSequence1 = s8;
                        s35 = s21;
                        s36 = s9;
                        v6 = v4;
                        s37 = s18;
                        s38 = s22;
                        s39 = s14;
                        s40 = s;
                        s41 = s15;
                        v7 = 3;
                    }
                    else {
                        if("Sms".equals(s28)) {
                            s29 = s24;
                            s30 = s20;
                            s31 = s19;
                            s32 = s23;
                            s33 = s25;
                            s34 = s17;
                            charSequence0 = s7;
                            z3 = z1;
                            v5 = z;
                            charSequence1 = s8;
                            s35 = s21;
                            s36 = s9;
                            v6 = v4;
                            s37 = s18;
                            s38 = s22;
                            s39 = s14;
                            s40 = s;
                            s41 = s15;
                            v7 = 4;
                            goto label_219;
                        }
                        goto label_175;
                    }
                }
            }
        }
        else {
            v2 = v;
            Uri uri1 = this.c.getData();
            s36 = uri1 == null || !TextUtils.isEmpty(uri1.getQueryParameter("_nr")) ? null : uri1.buildUpon().appendQueryParameter("_nr", "1").toString();
            s40 = s;
            s32 = null;
            s31 = null;
            s33 = null;
            s30 = null;
            z2 = false;
            s41 = null;
            charSequence0 = null;
            s10 = null;
            v1 = 0;
            z3 = false;
            charSequence1 = null;
            s35 = null;
            v7 = 1;
            v5 = 0;
            s37 = null;
            s29 = null;
            v6 = 1;
            s39 = null;
            s34 = null;
            s38 = null;
        }
    label_219:
        HashMap hashMap0 = new HashMap();
        if(hijc0 == null) {
            s43 = s30;
            s42 = s35;
        }
        else {
            s42 = s35;
            if((hijc0.b & 4) == 0) {
                s43 = s30;
            }
            else {
                hijq hijq1 = hijc0.e == null ? hijq.a : hijc0.e;
                s43 = s30;
                hashMap0.put("utm_source", hijq1.c);
                hashMap0.put("utm_medium", hijq1.d);
                hashMap0.put("utm_campaign", hijq1.e);
            }
        }
        Context context1 = this.b;
        Intent intent0 = this.c;
        int v8 = TextUtils.isEmpty(charSequence0) || !bbmq.U(context1, ((String)charSequence0)) ? 0 : 1;
        if(v8 == 0) {
            s44 = s31;
            v9 = 0;
            v10 = 0;
        }
        else {
            try {
                v9 = v8;
                s44 = s31;
                if(context1.getPackageManager().getApplicationInfo(((String)charSequence0), 0).enabled) {
                    v10 = context1.getPackageManager().getPackageInfo(((String)charSequence0), 0).versionCode;
                }
                else {
                    v10 = 0;
                    v9 = 0;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                v10 = 0;
            }
        }
        if(v9 != 0 && (v1 == 0 || v10 >= v1)) {
            object0 = context1.getPackageManager().getLaunchIntentForPackage(((String)charSequence0));
            if(TextUtils.isEmpty(charSequence1)) {
                v11 = v1;
            label_270:
                if(object0 == null) {
                    s45 = s41;
                    s46 = s36;
                    object0 = null;
                }
                else {
                    acfe.b(intent0, ((Intent)object0));
                    acaz.b(s10, ((String)charSequence1), ((Intent)object0));
                    if(acfe.c(context1, ((Intent)object0))) {
                        s45 = s41;
                        s46 = s36;
                    }
                    else {
                        s45 = s41;
                        s46 = s36;
                        object0 = null;
                    }
                }
            }
            else {
                Uri uri2 = Uri.parse(((String)charSequence1));
                if(TextUtils.isEmpty(s10)) {
                    v11 = v1;
                }
                else {
                    v11 = v1;
                    uri2 = uri2.buildUpon().appendQueryParameter("invitation_id", s10).build();
                }
                Intent intent1 = new Intent("android.intent.action.VIEW").setPackage(((String)charSequence0));
                acfe.b(intent0, intent1);
                intent1.setData(uri2);
                acaz.b(s10, ((String)charSequence1), intent1);
                if(acfe.c(context1, intent1)) {
                    s45 = s41;
                    object0 = intent1;
                    s46 = s36;
                }
                else {
                    if(object0 != null) {
                        ((Intent)object0).setData(uri2);
                    }
                    goto label_270;
                }
            }
        }
        else {
            v11 = v1;
            if(TextUtils.isEmpty(s36)) {
                s45 = s41;
                s46 = s36;
                object0 = null;
            }
            else {
                if(acfe.e(s36)) {
                    if(houq.a.b().l()) {
                        Uri.Builder uri$Builder0 = acfe.a("market://details", hashMap0).buildUpon().appendQueryParameter("id", ((String)charSequence0));
                        s45 = s41;
                        String s47 = Uri.parse(s36).getQueryParameter("referrer");
                        if(!TextUtils.isEmpty(s47)) {
                            uri$Builder0.appendQueryParameter("referrer", s47);
                        }
                        Intent intent2 = new Intent("android.intent.action.VIEW", uri$Builder0.build());
                        intent2.setPackage("com.android.vending");
                        intent2.putExtra("overlay", true);
                        intent2.putExtra("callerId", "com.google.android.gms");
                        object0 = intent2;
                    }
                    else {
                        s45 = s41;
                        object0 = new Intent("android.intent.action.VIEW").setData(acfe.a(s36, hashMap0));
                        ((Intent)object0).setPackage("com.android.vending");
                        ((Intent)object0).addFlags(0x14000000);
                    }
                    s46 = s36;
                }
                else {
                    s45 = s41;
                    Uri uri3 = Uri.parse(s36);
                    String s48 = uri3.getHost();
                    if(s48 != null && s48.endsWith(".app.goo.gl")) {
                        String s49 = Uri.parse(s36).getHost();
                        Uri.Builder uri$Builder1 = uri3.buildUpon();
                        uri$Builder1.authority("goo.gl");
                        s46 = s36;
                        uri$Builder1.encodedPath("app/" + (s49.endsWith(".app.goo.gl") ? s49.substring(0, s49.length() - 11) : null) + uri3.getPath());
                        s50 = uri$Builder1.toString();
                    }
                    else {
                        s46 = s36;
                        s50 = s46;
                    }
                    object0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(s50));
                    acfe.b(intent0, ((Intent)object0));
                }
                if(!acfe.c(context1, ((Intent)object0))) {
                    object0 = null;
                }
            }
        }
        if(object0 == null) {
            charSequence3 = charSequence0;
            z6 = z3;
            charSequence2 = charSequence1;
            v12 = v5;
            s54 = s37;
            s53 = s29;
            s51 = s39;
            s52 = s34;
            z9 = false;
            v13 = 0;
            z8 = false;
        }
        else {
            boolean z4 = acfe.d(((Intent)object0));
            boolean z5 = v5 != 0 && !z3 && (((Intent)object0).getData() != null && (((Intent)object0).getComponent() == null || TextUtils.isEmpty(((Intent)object0).getComponent().getClassName())) && this.b.getPackageManager().resolveActivity(((Intent)object0), 0) != null);
            Context context2 = this.b;
            SharedPreferences.Editor sharedPreferences$Editor0 = acfi.b(context2, ((String)charSequence0)).edit();
            sharedPreferences$Editor0.putString("Existence Indicator", "Existence Indicator");
            sharedPreferences$Editor0.putString("invitationId", s10);
            sharedPreferences$Editor0.putString("deepLink", ((String)charSequence1));
            sharedPreferences$Editor0.putBoolean("isNewInstall", ((boolean)(v5 ^ 1)));
            sharedPreferences$Editor0.putBoolean("isInlineInstall", z4);
            sharedPreferences$Editor0.putInt("invitationChannel", v7 - 1);
            sharedPreferences$Editor0.putBoolean("launchFromContinueUrl", z2);
            sharedPreferences$Editor0.putBoolean("scionInstallEvent", false);
            sharedPreferences$Editor0.putBoolean("loggerInstallEvent", false);
            sharedPreferences$Editor0.putBoolean("hasReturnedInvitation", false);
            sharedPreferences$Editor0.putBoolean("isUpgradeInstall", z3);
            sharedPreferences$Editor0.putString("scionSource", s33);
            sharedPreferences$Editor0.putString("scionMedium", s32);
            sharedPreferences$Editor0.putString("scionLinkName", s45);
            sharedPreferences$Editor0.putString("scionLinkId", s44);
            sharedPreferences$Editor0.putString("scionCampaign", s43);
            if(hour.g()) {
                sharedPreferences$Editor0.putString("scionContent", s42);
                sharedPreferences$Editor0.putString("scionTerm", s38);
            }
            sharedPreferences$Editor0.putString("requestedLink", s34);
            sharedPreferences$Editor0.putInt("requestedLinkType", v6 - 1);
            sharedPreferences$Editor0.putString("appCode", s39);
            sharedPreferences$Editor0.putString("domainUriPrefix", s29);
            sharedPreferences$Editor0.putString("sessionId", s37);
            sharedPreferences$Editor0.putInt("minVersionCode", v11);
            sharedPreferences$Editor0.putLong("creationTimestamp", System.currentTimeMillis());
            sharedPreferences$Editor0.commit();
            if(v5 != 0 && !z3) {
                if(TextUtils.isEmpty(s10)) {
                    bundle1 = null;
                }
                else {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("com.google.firebase.appinvite.fdl.extension.InvitationId", s10);
                    bundle1 = bundle0;
                }
                z6 = z3;
                charSequence2 = charSequence1;
                v12 = v5;
                s51 = s39;
                s52 = s34;
                s53 = s29;
                z7 = z4;
                s54 = s37;
                DynamicLinkData dynamicLinkData0 = new DynamicLinkData(s40, ((String)charSequence2), v11, ((long)acfi.c(context2, ((String)charSequence0))), bundle1, null);
                charSequence3 = dynamicLinkData0;
                bauc.l(dynamicLinkData0, ((Intent)object0), "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
            }
            else {
                s51 = s39;
                charSequence3 = charSequence0;
                z6 = z3;
                charSequence2 = charSequence1;
                z7 = z4;
                s52 = s34;
                v12 = v5;
                s53 = s29;
                s54 = s37;
            }
            v13 = v5 ^ 1;
            z8 = z5;
            z9 = z7;
        }
        acbc acbc0 = this.f;
        if(z9) {
            v14 = 3;
        }
        else {
            v14 = v13 == 0 ? 1 : 2;
        }
        if(1 != v12) {
            charSequence2 = s46;
        }
        long v15 = SystemClock.uptimeMillis() - this.d;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giif.a).v_newBuilder();
        if(!TextUtils.isEmpty(charSequence3)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giix.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giix giix0 = (giix)hftp1.b_message;
            charSequence3.getClass();
            giix0.b |= 2;
            giix0.c = charSequence3;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giif giif0 = (giif)hftp0.b_message;
            giix giix1 = (giix)hftp1.N_build();
            giix1.getClass();
            giif0.c = giix1;
            giif0.b |= 1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giif)hftv1).d = v7 - 1;
        ((giif)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giif)hftv2).e = v14 - 1;
        ((giif)hftv2).b |= 8;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        giif giif1 = (giif)hftp0.b_message;
        giif1.b |= 16;
        giif1.f = z8;
        if(!TextUtils.isEmpty(s51) || !TextUtils.isEmpty(s53)) {
            giis giis0 = acbc.c(s51, s53, s52, v6, ((String)charSequence2));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giif giif2 = (giif)hftp0.b_message;
            giis0.getClass();
            giif2.g = giis0;
            giif2.b |= 0x20;
        }
        int v16 = acbc.d(((boolean)v13), z6);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((giif)hftv3).h = v16 - 1;
        ((giif)hftv3).b |= 0x40;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((giif)hftv4).b |= 0x80;
        ((giif)hftv4).i = v15;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giif)hftp0.b_message).j = v2 - 1;
        ((giif)hftp0.b_message).b |= 0x100;
        acbc0.f(((giif)hftp0.N_build()), 10, s54);
        return object0;
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        if(this.isCancelled()) {
            return;
        }
        this.g.b = true;
        this.g.c = (Intent)object0;
        xob xob0 = (xob)this.g.getContext();
        this.g.y(xob0);
    }
}

