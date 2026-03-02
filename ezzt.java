import android.content.pm.PackageInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public final class ezzt implements Runnable {
    public final ezzu a;

    public ezzt(ezzu ezzu0) {
        this.a = ezzu0;
    }

    @Override
    public final void run() {
        long v;
        gfsx gfsx0;
        ezzu ezzu0;
        File file0 = hrnt.i() ? new File(ccsb.a.b(faab.b(), "apex_info.pb")) : new File(faab.b(), "apex_info.pb");
        if(!file0.exists()) {
            ezzu.g.h("The ota package doesn\'t have %s, skipping report of apex update event", new Object[]{"apex_info.pb"});
            return;
        }
        try {
            ezzu0 = this.a;
            try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlni.a).v_newBuilder();
                hftp0.G(fileInputStream0);
                gfsx0 = gfsx.m(((hlni)hftp0.N_build()));
            }
        }
        catch(IOException iOException0) {
            ezzx.a.g("Unable to build apex metadata", iOException0, new Object[0]);
            gfsx0 = gfqx.a;
        }
        if(!gfsx0.i()) {
            return;
        }
        Object object0 = gfsx0.d();
        fabj fabj0 = new fabj(ezzu0.h);
        HashMap hashMap0 = new HashMap();
        for(Object object1: ezzu0.h.getPackageManager().getInstalledPackages(0x40000000)) {
            PackageInfo packageInfo0 = (PackageInfo)object1;
            if(packageInfo0.isApex) {
                hashMap0.put(packageInfo0.packageName, Long.valueOf(packageInfo0.getLongVersionCode()));
            }
        }
        ggeo ggeo0 = ggeo.k(hashMap0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gigy.a).v_newBuilder();
        for(Object object2: ((hlni)object0).b) {
            hlnh hlnh0 = (hlnh)object2;
            if(hlnh0.c != hlnh0.d) {
                String s = hlnh0.b;
                if(ggeo0.containsKey(s)) {
                    v = (long)(((Long)ggeo0.get(s)));
                }
                else {
                    String s1 = s.replaceFirst("com.android.", "com.google.android.");
                    v = ggeo0.containsKey(s1) ? ((long)(((Long)ggeo0.get(s1)))) : -1L;
                }
                if(v > 0L && v >= hlnh0.c) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gigx.a).v_newBuilder();
                    String s2 = hlnh0.b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    s2.getClass();
                    ((gigx)hftv0).b |= 1;
                    ((gigx)hftv0).c = s2;
                    long v1 = hlnh0.c;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((gigx)hftv1).b |= 2;
                    ((gigx)hftv1).d = v1;
                    long v2 = hlnh0.d;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    ((gigx)hftv2).b |= 4;
                    ((gigx)hftv2).e = v2;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gigx gigx0 = (gigx)hftp2.b_message;
                    gigx0.b |= 8;
                    gigx0.f = v;
                    gigx gigx1 = (gigx)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gigy gigy0 = (gigy)hftp1.b_message;
                    gigx1.getClass();
                    hfuo hfuo0 = gigy0.b;
                    if(!hfuo0.c()) {
                        gigy0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    gigy0.b.add(gigx1);
                }
            }
        }
        gigy gigy1 = (gigy)hftp1.N_build();
        ProtoLiteBuilder hftp3 = fabj0.g(14);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gigw gigw0 = (gigw)hftp3.b_message;
        gigy1.getClass();
        gigw0.q = gigy1;
        gigw0.b |= 0x4000;
        fabj0.f(((gigw)hftp3.N_build()));
    }
}

