import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.appinvite.AppInviteIntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public final class acba extends cjtm {
    public final long a;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Map i;
    private final String j;
    private final String n;
    private final List o;
    private final String p;
    private final String q;
    private final Uri r;
    private final String s;
    private final String t;
    private final int u;
    private final acbk v;
    private final acbb w;
    private aboh x;

    public acba(Context context0, String s, String s1, String s2, String s3, String s4, String s5, Map map0, String s6, String s7, List list0, String s8, String s9, Uri uri0, String s10, String s11, int v) {
        String s14;
        PackageInfo packageInfo0;
        acbb acbb0 = new acbb(context0);
        acbk acbk0 = acbk.a(context0);
        super(0, "AppInviteSend");
        this.b = context0;
        this.d = s;
        this.c = s1;
        this.e = s2;
        this.g = s3;
        this.f = s4;
        this.h = s5;
        this.i = map0;
        this.j = s6;
        this.n = s7;
        this.o = list0;
        this.p = s8;
        this.q = s9;
        this.r = uri0;
        this.s = s10;
        this.t = s11;
        this.u = v;
        this.a = AppInviteIntentOperation.a();
        this.w = acbb0;
        this.v = acbk0;
        if(!TextUtils.isEmpty(s6)) {
            aboh aboh0 = acbb0.a();
            this.x = aboh0;
            acbb.c(aboh0, s6);
            PackageManager packageManager0 = context0.getPackageManager();
            String s12 = null;
            try {
                packageInfo0 = null;
                packageInfo0 = packageManager0.getPackageInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            if(packageInfo0 == null) {
                s14 = null;
            }
            else {
                String s13 = packageInfo0.versionName;
                s12 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo).toString();
                s14 = s13;
            }
            aboh aboh1 = this.x;
            String s15 = this.d;
            if(!TextUtils.isEmpty(s12)) {
                aboh1.c("&an", s12);
            }
            if(!TextUtils.isEmpty(s15)) {
                aboh1.c("&aid", s15);
            }
            if(!TextUtils.isEmpty(s14)) {
                aboh1.c("&av", s14);
            }
        }
    }

    private final void b(Exception exception0) {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intent0.addCategory("android.intent.category.DEFAULT");
        long v = this.a;
        intent0.putExtra("appOperationCode", v);
        if((exception0 instanceof acax)) {
            intent0.putExtra("com.google.android.gms.appinvite.errorType", 1);
            intent0.putExtra("com.google.android.gms.appinvite.errorCode", ((acax)exception0).a);
        }
        else if(!(exception0 instanceof acbd)) {
            if((exception0 instanceof UserRecoverableAuthException)) {
                intent0.putExtra("com.google.android.gms.appinvite.errorType", 3);
                intent0.putExtra("com.google.android.gms.appinvite.authIntent", ((UserRecoverableAuthException)exception0).a());
            }
            else {
                intent0.putExtra("com.google.android.gms.appinvite.errorType", 0);
            }
        }
        else if(((acbd)exception0).b()) {
            intent0.putExtra("com.google.android.gms.appinvite.errorType", 3);
        }
        else {
            intent0.putExtra("com.google.android.gms.appinvite.errorType", 2);
        }
        AppInviteIntentOperation.b(v, intent0);
        Intent intent1 = bbmq.j(intent0);
        this.b.sendBroadcast(intent1);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        ReentrantLock reentrantLock0;
        String s;
        hijm hijm0;
        Account account0 = new Account(this.c, "com.google");
        baqr baqr0 = new baqr();
        baqr0.a = Process.myUid();
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.d = this.d;
        baqr0.e = "com.google.android.gms";
        baqr0.n(new String[]{"https://www.googleapis.com/auth/plus.native"});
        try {
            hijm0 = this.v.b(baqr0, this.e, this.g, this.f, null, this.h, this.i, null, null, this.o, this.j, this.p, this.q, (this.r == null ? null : this.r.toString()), null, 0, 0, this.s, this.t, this.u, this.n);
        }
        catch(acbd | acax exception0) {
            this.b(exception0);
            return;
        }
        if(hijm0 == null) {
            this.b(null);
            return;
        }
        hikc hikc0 = hijm0.c == null ? hikc.a : hijm0.c;
        if(hikc0 != null && (hikc0.b & 1) != 0 && !(hikc0.c == null ? hijv.a : hikc0.c).c.isEmpty()) {
            hijv hijv0 = hikc0.c == null ? hijv.a : hikc0.c;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hijv0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hijv0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hijv)hftp0.b_message).c = hfvv.a;
            for(Object object0: (hikc0.c == null ? hijv.a : hikc0.c).c) {
                hijw hijw0 = (hijw)object0;
                if(hijw0.g.size() <= 0 || !"Sms".equals(((hiju)hijw0.g.get(0)).c) || !"Sent".equals(hijw0.d) || !"Invitation".equals(hijw0.c)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hijv hijv1 = (hijv)hftp0.b_message;
                    hijw0.getClass();
                    hfuo hfuo0 = hijv1.c;
                    if(!hfuo0.c()) {
                        hijv1.c = ProtoLiteMessage.E(hfuo0);
                    }
                    hijv1.c.add(hijw0);
                }
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hikc0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hikc0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hikc hikc1 = (hikc)hftp1.b_message;
            hijv hijv2 = (hijv)hftp0.N_build();
            hijv2.getClass();
            hikc1.c = hijv2;
            hikc1.b |= 1;
            hikc hikc2 = (hikc)hftp1.N_build();
            this.w.b(this.x, hikc2);
        }
        hfuo hfuo1 = hijm0.b;
        if(hfuo1.isEmpty()) {
            this.b(null);
            return;
        }
        String[] arr_s = new String[hfuo1.size()];
        for(int v = 0; v < hfuo1.size(); ++v) {
            hiko hiko0 = ((hika)hfuo1.get(v)).d;
            if(hiko0 == null) {
                hiko0 = hiko.a;
            }
            if((((hika)hfuo1.get(v)).b & 1) == 0) {
                s = null;
            }
            else {
                hikg hikg0 = ((hika)hfuo1.get(v)).c;
                if(hikg0 == null) {
                    hikg0 = hikg.a;
                }
                s = hikg0.c;
            }
            arr_s[v] = s;
            if((((hika)hfuo1.get(v)).b & 4) != 0 && (hiko0.b & 2) != 0 && hijo.a((hiko0.d == null ? hijp.a : hiko0.d).c) == 4 && !(hiko0.d == null ? hijp.a : hiko0.d).e.isEmpty()) {
                hikl hikl0 = ((hika)hfuo1.get(v)).e;
                if(hikl0 == null) {
                    hikl0 = hikl.a;
                }
                if(!hikl0.b.isEmpty() && (((hika)hfuo1.get(v)).b & 1) != 0) {
                    Context context1 = this.b;
                    acbl acbl0 = acbl.a();
                    hikg hikg1 = ((hika)hfuo1.get(v)).c;
                    if(hikg1 == null) {
                        hikg1 = hikg.a;
                    }
                    String s1 = hikg1.c;
                    acbl0.a.lock();
                    try {
                        SQLiteDatabase sQLiteDatabase0 = acbm.c(context1).getWritableDatabase();
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("invitation_id", s1);
                        contentValues0.put("operation_id", this.n);
                        sQLiteDatabase0.insert("sms", null, contentValues0);
                        reentrantLock0 = acbl0.a;
                    }
                    catch(SQLiteException unused_ex) {
                        reentrantLock0 = acbl0.a;
                    }
                    catch(Throwable throwable0) {
                        acbl0.a.unlock();
                        throw throwable0;
                    }
                    reentrantLock0.unlock();
                }
            }
        }
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.appinvite.intent.action.INVITE_SENT");
        intent0.addCategory("android.intent.category.DEFAULT");
        intent0.putExtra("appInviteResult", arr_s);
        intent0.putExtra("appOperationCode", this.a);
        AppInviteIntentOperation.b(this.a, intent0);
        Intent intent1 = bbmq.j(intent0);
        this.b.sendBroadcast(intent1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b(null);
    }
}

