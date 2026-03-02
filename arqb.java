import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.provider.Telephony.Mms;
import android.provider.Telephony.Sms;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class arqb extends arqo {
    public static final aqql a;
    public final argz b;
    public final arfk c;
    public final arem d;
    public final arqd e;
    public final arfi f;
    public final List g;
    public boolean h;
    public Set i;
    public Set j;
    private final Context k;
    private final long l;

    static {
        arqb.a = new aqql(new String[]{"AppDataFlavorHandler"});
    }

    public arqb(Context context0, arfk arfk0, arem arem0, arfi arfi0, argz argz0, arqd arqd0) {
        this.l = hqhq.a.j().b();
        this.h = false;
        this.k = context0;
        this.f = arfi0;
        this.b = argz0;
        this.c = arfk0;
        this.d = arem0;
        this.e = arqd0;
        aqze.h();
        this.g = new ArrayList();
        if(this.j()) {
            arqb.a.j("Deferred package list generation after handshake to get target device model", new Object[0]);
            return;
        }
        this.g(null);
    }

    @Override  // arqo
    public final File a(asby asby0) {
        throw new IOException("App data attachments flavor should not use file payload");
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        aqql aqql0 = arqb.a;
        aqql0.d("Backup data requested for: %s", new Object[]{asby0.e});
        if("restore_token_file".equals(asby0.e)) {
            return new ByteArrayInputStream(String.valueOf(bbmq.d(this.k)).getBytes(StandardCharsets.UTF_8));
        }
        if(hqhq.B()) {
            aqql0.h("Attempting to use early backed up data for package %s", new Object[]{asby0.e});
            if(!this.g.contains(asby0.e)) {
                return this.l(asby0);
            }
            File file0 = this.f.b(asby0.e);
            if(!file0.exists()) {
                return this.l(asby0);
            }
            aqql0.h("Backup file exists for package %s", new Object[]{asby0.e});
            try {
                if(asby0.e.equals("@pm@")) {
                    this.h(file0);
                }
                return new FileInputStream(file0);
            }
            catch(IOException iOException0) {
                arqb.a.f("Failed to get backup data for %s", new Object[]{asby0.e});
                throw new arra(iOException0);
            }
        }
        return this.l(asby0);
    }

    @Override  // arqo
    public final List c() {
        List list0 = new ArrayList();
        asby asby0 = asby.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asby0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asby asby1 = (asby)hftp0.b_message;
        asby1.b |= 1;
        asby1.e = "restore_token_file";
        list0.add(((asby)hftp0.N_build()));
        List list1 = this.g;
        if(list1.isEmpty()) {
            arqb.a.m("packages list to backup is empty. please check if it is initialized correctly.", new Object[0]);
        }
        for(Object object0: list1) {
            String s = (String)object0;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asby0).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            asby asby2 = (asby)hftp1.b_message;
            s.getClass();
            asby2.b |= 1;
            asby2.e = s;
            if(hqhq.B()) {
                File file0 = this.f.b(s);
                if(file0.exists()) {
                    Object[] arr_object = {s, file0.length()};
                    arqb.a.h("Backup file exist for package %s, Using real size %d", arr_object);
                    long v = file0.length();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    asby asby3 = (asby)hftp1.b_message;
                    asby3.b |= 2;
                    asby3.f = v;
                }
                else {
                    long v1 = this.l;
                    arqb.a.h("Backup file does not exist for package %s, using estimate size %d", new Object[]{s, v1});
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    asby asby4 = (asby)hftp1.b_message;
                    asby4.b |= 2;
                    asby4.f = v1;
                }
            }
            else {
                long v2 = this.l;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asby asby5 = (asby)hftp1.b_message;
                asby5.b |= 2;
                asby5.f = v2;
            }
            if(arqb.i(s) && hqmi.a.b().g()) {
                hkzb hkzb0 = this.f();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ascn.a).v_newBuilder();
                int v3 = hkzb0.c;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((ascn)hftv0).b |= 1;
                ((ascn)hftv0).c = v3;
                int v4 = hkzb0.d;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((ascn)hftv1).b |= 2;
                ((ascn)hftv1).d = v4;
                int v5 = hkzb0.e;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((ascn)hftv2).b |= 4;
                ((ascn)hftv2).e = v5;
                int v6 = hkzb0.f;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ascn ascn0 = (ascn)hftp2.b_message;
                ascn0.b |= 8;
                ascn0.f = v6;
                ascn ascn1 = (ascn)hftp2.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                asby asby6 = (asby)hftp1.b_message;
                ascn1.getClass();
                asby6.d = ascn1;
                asby6.c = 102;
            }
            list0.add(((asby)hftp1.N_build()));
        }
        return list0;
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        bbpb.b(inputStream0);
        if(!this.i.contains(asby0.e)) {
            this.f.b(asby0.e).delete();
        }
    }

    public final hkzb f() {
        argz argz0 = this.b;
        if(argz0.c == null) {
            ContentResolver contentResolver0 = argz0.a.getContentResolver();
            argz0.c = ((ProtoLiteMessage)hkzb.a).v_newBuilder();
            ProtoLiteBuilder hftp0 = argz0.c;
            int v = argz.c(contentResolver0.query(Telephony.Sms.CONTENT_URI, new String[]{"_id"}, null, null, null));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkzb hkzb0 = (hkzb)hftp0.b_message;
            hkzb0.b |= 1;
            hkzb0.c = v;
            ProtoLiteBuilder hftp1 = argz0.c;
            int v1 = argz.c(contentResolver0.query(Telephony.Mms.CONTENT_URI, new String[]{"_id"}, null, null, null));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hkzb hkzb1 = (hkzb)hftp1.b_message;
            hkzb1.b |= 2;
            hkzb1.d = v1;
            ProtoLiteBuilder hftp2 = argz0.c;
            int v2 = argz.c(contentResolver0.query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build(), new String[]{"_id"}, "ct=?", new String[]{"text/plain"}, null));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hkzb hkzb2 = (hkzb)hftp2.b_message;
            hkzb2.b |= 4;
            hkzb2.e = v2;
            ProtoLiteBuilder hftp3 = argz0.c;
            int v3 = argz.c(contentResolver0.query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build(), new String[]{"_id"}, null, null, null));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hkzb hkzb3 = (hkzb)hftp3.b_message;
            hkzb3.b |= 8;
            hkzb3.f = v3;
        }
        ProtoLiteBuilder hftp4 = argz0.c;
        argx argx0 = argz0.b;
        long v4 = argx0.j;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        hkzb hkzb4 = (hkzb)hftp4.b_message;
        hkzb4.b |= 16;
        hkzb4.g = v4;
        ProtoLiteBuilder hftp5 = argz0.c;
        long v5 = argx0.k;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        hkzb hkzb5 = (hkzb)hftp5.b_message;
        hkzb5.b |= 0x20;
        hkzb5.h = v5;
        return (hkzb)argz0.c.N_build();
    }

    public final void g(String s) {
        aqzf aqzf0;
        List list0 = this.g;
        if(!list0.isEmpty()) {
            arqb.a.m("generateBackupPackages called twice, last packagesToBackup has size %d. ", new Object[]{list0.size()});
        }
        list0.clear();
        Context context0 = this.k;
        this.i = new HashSet(arfk.b(context0));
        List list1 = context0.getPackageManager().getInstalledPackages(0);
        HashSet hashSet0 = new HashSet();
        hqhq hqhq0 = hqhq.a;
        ggfp ggfp0 = hqhq0.j().ac() ? ggfp.G(hqhq0.j().R().b) : ggnj.a;
        HashSet hashSet1 = hqhq.i().b.contains(s) ? new HashSet(hqhq0.j().P().b) : new HashSet();
        Iterator iterator0 = list1.iterator();
        while(true) {
            int v = 1;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            PackageInfo packageInfo0 = (PackageInfo)object0;
            if(hashSet1.contains(packageInfo0.packageName)) {
                v = 2;
            }
            String s1 = packageInfo0.packageName;
            if((hqhq0.j().aj() && !ggfp0.contains(s1) || aqxs.b(packageInfo0.applicationInfo, v)) && aqxs.a(packageInfo0)) {
                if(!aqzg.h(context0, packageInfo0.packageName)) {
                    aqzg.a.j("Rejecting %s backup for d2dmigrate.", new Object[]{packageInfo0.packageName});
                    aqzf0 = aqzf.h;
                }
                else if(hqhq0.j().ak() && hqhq0.j().O().b.contains(packageInfo0.packageName) && aqzg.g(context0, packageInfo0, 34)) {
                    aqzg.a.h("Skipping pkg %s as target too low for KV->Dolly", new Object[]{packageInfo0.packageName});
                    aqzf0 = aqzf.b;
                }
                else if(hqhq0.j().be() && hqhq0.j().S().b.contains(packageInfo0.packageName) && Build.VERSION.SDK_INT >= 36 && !aqzg.g(context0, packageInfo0, 36)) {
                    aqzg.a.h("Accepting " + packageInfo0.packageName + ", it\'s a first party app that only supports transfer between B+ devices. Both source and target are B+", new Object[0]);
                    aqzf0 = aqzf.a;
                }
                else {
                    aqzf0 = aqzg.b(context0, packageInfo0);
                }
                if(aqzf0 == aqzf.a) {
                    hashSet0.add(packageInfo0.packageName);
                }
            }
        }
        this.j = new HashSet(hashSet0);
        this.i.remove("com.android.providers.telephony");
        this.j.remove("com.android.providers.telephony");
        list0.addAll(this.i);
        list0.addAll(this.j);
        if(jwe.a(context0, "android.permission.READ_SMS") == 0) {
            Cursor cursor0 = this.b.b.c();
            Cursor cursor1 = this.b.b.b();
            boolean z = cursor0 == null || !cursor0.moveToFirst();
            boolean z1 = cursor1 == null || !cursor1.moveToFirst();
            bbpb.b(cursor0);
            bbpb.b(cursor1);
            if(z && z1) {
                arqb.a.d("No SMS data found. Not providing SMS as an option.", new Object[0]);
                this.h = false;
                this.d.i("com.android.providers.telephony", 6);
            }
            else {
                arqb.a.d("Including dummy telephony package.", new Object[0]);
                list0.add("com.android.providers.telephony");
                this.h = true;
            }
        }
        else {
            arqb.a.d("SMS permission not granted. Not providing SMS as an option.", new Object[0]);
            this.h = false;
            this.d.i("com.android.providers.telephony", 10);
        }
        arqb.a.j("generateBackupPackages complete. packages list has %d items", new Object[]{list0.size()});
    }

    public final void h(File file0) {
        if(this.h) {
            try {
                this.b.b(file0);
                arqb.a.h("Telephony data appended.", new Object[0]);
            }
            catch(aqwq aqwq0) {
                arqb.a.g("Couldn\'t append telephony data.", aqwq0, new Object[0]);
            }
        }
    }

    public static boolean i(String s) {
        return "com.android.providers.telephony".equals(s);
    }

    public final boolean j() {
        return !hqhq.i().b.isEmpty();
    }

    private final InputStream l(asby asby0) {
        return new arrh(new arqa(this, asby0));
    }
}

