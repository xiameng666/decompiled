import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

public final class azsp {
    private static azsp a;

    public static azsp a() {
        azsp azsp0;
        synchronized(azsp.class) {
            azsp0 = azsp.a;
            if(azsp0 == null) {
                azsp azsp1 = new azsp();
                azsp.a = azsp1;
                return azsp1;
            }
        }
        return azsp0;
    }

    public static final glie b(Context context0) {
        ApplicationInfo applicationInfo0;
        int v7;
        int v6;
        int v = glhx.a(bbrc.a());
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        int v2 = glid.a(bbrc.e());
        if(v2 == 0) {
            v2 = 1;
        }
        int v3 = glia.a(bbrc.d());
        if(v3 == 0) {
            v3 = 1;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glie.a).v_newBuilder();
        String s = bbmq.q(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie0 = (glie)hftp0.b_message;
        s.getClass();
        glie0.b |= 1;
        glie0.c = s;
        long v4 = bbrc.h();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((glie)hftv0).b |= 2;
        ((glie)hftv0).d = v4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((glie)hftv1).e = v - 1;
        ((glie)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((glie)hftv2).f = v2 - 1;
        ((glie)hftv2).b |= 8;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((glie)hftp0.b_message).g = v3 - 1;
        ((glie)hftp0.b_message).b |= 16;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glkl.a).v_newBuilder();
        String s1 = System.getProperty("java.vm.version");
        if(s1 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glkl glkl0 = (glkl)hftp1.b_message;
            glkl0.b |= 1;
            glkl0.c = s1;
        }
        String s2 = System.getProperty("java.vm.vendor");
        if(s2 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glkl glkl1 = (glkl)hftp1.b_message;
            glkl1.b |= 2;
            glkl1.d = s2;
        }
        String s3 = System.getProperty("java.vm.name");
        if(s3 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glkl glkl2 = (glkl)hftp1.b_message;
            glkl2.b |= 4;
            glkl2.e = s3;
        }
        String s4 = System.getProperty("java.vm.specification.version");
        if(s4 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glkl glkl3 = (glkl)hftp1.b_message;
            glkl3.b |= 8;
            glkl3.f = s4;
        }
        String s5 = System.getProperty("java.vm.specification.vendor");
        if(s5 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glkl glkl4 = (glkl)hftp1.b_message;
            glkl4.b |= 16;
            glkl4.g = s5;
        }
        String s6 = System.getProperty("java.vm.specification.name");
        if(s6 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glkl glkl5 = (glkl)hftp1.b_message;
            glkl5.b |= 0x20;
            glkl5.h = s6;
        }
        glkl glkl6 = (glkl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie1 = (glie)hftp0.b_message;
        glkl6.getClass();
        glie1.h = glkl6;
        glie1.b |= 0x20;
        int v5 = bbmn.h(context0, "com.google.android.gms").size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie2 = (glie)hftp0.b_message;
        glie2.b |= 0x40;
        glie2.i = v5;
        try {
            switch(new azpj(context0).a(azpj.a, true).b - 1) {
                case 0: {
                    v6 = 2;
                    goto label_103;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    goto label_102;
                }
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("CoreAnalytics", "Failed to verify GMS Core signing keys", packageManager$NameNotFoundException0);
        }
        v6 = 1;
        goto label_103;
    label_102:
        v6 = 3;
    label_103:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((glie)hftp0.b_message).j = v6 - 1;
        ((glie)hftp0.b_message).b |= 0x80;
        try {
            v7 = 0;
            v7 = bbsr.b(context0).d("com.google.android.gms", 0).flags;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie3 = (glie)hftp0.b_message;
        glie3.b |= 0x100;
        glie3.k = v7;
        String s7 = bboj.a(context0, "gmscore");
        if(s7 == null) {
            File file1 = bbpp.a(context0);
            if(file1 != null && file1.exists()) {
                File[] arr_file = file1.listFiles();
                if(arr_file != null) {
                    int v8 = 0;
                    while(v8 < arr_file.length) {
                        String[] arr_s = arr_file[v8].list();
                        if(arr_s == null || arr_s.length <= 0) {
                            ++v8;
                            continue;
                        }
                        v1 = 5;
                        goto label_147;
                    }
                }
            }
            try {
                applicationInfo0 = bbsr.b(context0).d("com.google.android.gms", 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                goto label_147;
            }
            int v9 = applicationInfo0.flags & 0x80;
            if(!(hrnt.i() ? new File(ccsb.a.d(applicationInfo0.nativeLibraryDir, "libgmscore.so")) : new File(applicationInfo0.nativeLibraryDir, "libgmscore.so")).exists()) {
                v1 = 2;
            }
            else if(v9 != 0) {
                v1 = 4;
            }
            else {
                v1 = 3;
            }
        }
        else if(!s7.startsWith("/system")) {
            File file0 = bbpp.a(context0);
            v1 = file0 == null || !s7.startsWith(file0.getAbsolutePath()) ? 4 : 5;
        }
        else {
            v1 = 3;
        }
    label_147:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((glie)hftp0.b_message).l = v1 - 1;
        ((glie)hftp0.b_message).b |= 0x200;
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        gftb.check(activityManager0);
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        activityManager0.getMemoryInfo(activityManager$MemoryInfo0);
        long v10 = activityManager$MemoryInfo0.totalMem;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie4 = (glie)hftp0.b_message;
        glie4.b |= 0x2000;
        glie4.m = v10;
        boolean z = bbnp.j(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie5 = (glie)hftp0.b_message;
        glie5.b |= 0x4000;
        glie5.n = z;
        if(hris.e()) {
            Resources resources0 = context0.getResources();
            String s8 = resources0.getConfiguration().locale.getLanguage();
            if(gnuj.i(context0, resources0, hrqo.e()).c(resources0, s8, "com.google.android.gms")) {
                TypedValue typedValue0 = new TypedValue();
                try {
                    resources0.getValue("com.google.android.gms:current_locale_sanity_check", typedValue0, false);
                }
                catch(Resources.NotFoundException unused_ex) {
                    typedValue0.string = null;
                }
                String s9 = typedValue0.string == null ? "??" : typedValue0.string.toString();
                if(!s8.equals(s9)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    s8.getClass();
                    ((glie)hftv3).b |= 0x20000;
                    ((glie)hftv3).o = s8;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glie glie6 = (glie)hftp0.b_message;
                    s9.getClass();
                    glie6.b |= 0x40000;
                    glie6.p = s9;
                }
            }
        }
        String s10 = context0.getPackageManager().getInstallerPackageName("com.google.android.gms");
        if(s10 == null) {
            s10 = "";
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glie glie7 = (glie)hftp0.b_message;
        glie7.b |= 0x80000;
        glie7.q = s10;
        if(hrlu.a.g().h()) {
            String s11 = bsoa.a(context0);
            if(s11 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glie glie8 = (glie)hftp0.b_message;
                glie8.b |= 0x100000;
                glie8.r = s11;
            }
        }
        return (glie)hftp0.N_build();
    }

    public static final void c(String s, glim glim0) {
        if(s.equals("system_health")) {
            cczb cczb0 = cfov.v().c(((ProtoLiteMessage)glim0));
            cczb0.f = s;
            cczb0.a();
            return;
        }
        if(s.equals("install")) {
            cczb cczb1 = cfkl.v().c(((ProtoLiteMessage)glim0));
            cczb1.f = s;
            cczb1.a();
        }
    }

    public static final void d(Context context0, int v, int v1, glmx glmx0) {
        glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        glie glie0 = azsp.b(context0);
        if(!glil0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glil0).ensureMutable();
        }
        glim glim0 = (glim)glil0.b_message;
        glie0.getClass();
        glim0.c = glie0;
        glim0.b |= 1;
        if(!glil0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glil0).ensureMutable();
        }
        glim glim1 = (glim)glil0.b_message;
        glmx0.getClass();
        glim1.d = glmx0;
        glim1.b |= 2;
        if(v == 1) {
            azsp.c("system_health", ((glim)((ProtoLiteBuilder)glil0).N_build()));
            return;
        }
        if(v1 >= 0) {
            if(!glil0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glil0).ensureMutable();
            }
            glim glim2 = (glim)glil0.b_message;
            glim2.b |= 0x20;
            glim2.k = v1;
        }
        glim glim3 = (glim)((ProtoLiteBuilder)glil0).N_build();
        if((!bbmn.r(context0) || v != 8 && v != 10 ? hlqe.a : hlqe.d) == hlqe.d) {
            cczb cczb0 = cfos.v().c(((ProtoLiteMessage)glim3));
            cczb0.c = (int)(v - 1);
            cczb0.f = "system_health";
            cczb0.a();
            return;
        }
        cczb cczb1 = cfov.v().c(((ProtoLiteMessage)glim3));
        cczb1.c = (int)(v - 1);
        cczb1.f = "system_health";
        cczb1.a();
    }

    public static final void e(Context context0, int v, glmx glmx0) {
        azsp.d(context0, v, -1, glmx0);
    }
}

