import android.content.Context;
import android.os.Build.VERSION;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import jeb.synthetic.TWR;

public final class eitg {
    public static final int a;

    static {
        bboh.b("StorageInfoCommon", bbcu.al);
    }

    public static File a(Context context0) {
        return context0.getDir("phenotype_shared", 0);
    }

    public static byte[] b(Context context0, eiop eiop0, String s) {
        fplr fplr2;
        fplf fplf0;
        byte[] arr_b1;
        byte[] arr_b;
        if(Objects.equals(s, "com.android.vending")) {
            throw new eioz(0x734A, "Storage info not created for Play Store.");
        }
        try {
            boolean z = false;
            eiok eiok0 = ((eioh)eiop0).g((eiop0.f() ? "SELECT secret, device_encrypted_secret FROM android_packages WHERE name = ?" : "SELECT secret, deviceEncryptedSecret FROM StorageInfos WHERE androidPackageName = ?")).h(new Object[]{s}).i();
            try {
                if(eiok0 == null) {
                    arr_b = fplb.c();
                    arr_b1 = fplb.c();
                    eiop0.c((eiop0.f() ? "INSERT INTO android_packages (name, secret, device_encrypted_secret) VALUES (?, ?, ?)" : "INSERT OR REPLACE INTO StorageInfos (androidPackageName, secret, deviceEncryptedSecret) VALUES (?, ?, ?)")).g(new Object[]{s, arr_b, arr_b1}).d();
                }
                else {
                    arr_b = eiok0.k(0);
                    arr_b1 = eiok0.k(1);
                }
                long v = gnup.a(context0.getApplicationContext().getPackageManager(), s).d;
                ArrayList arrayList0 = new ArrayList();
                int v1 = Long.compare(v, -1L);
                if(v1 == 0 || v >= hxmg.a.b().c()) {
                    arrayList0.add(gobs.d);
                }
                if(v1 == 0 || v >= hxmg.a.b().d()) {
                    arrayList0.add(gobs.e);
                }
                File file0 = eitg.a(context0);
                File file1 = eitg.a(fhcd.a(context0));
                fpll fpll0 = (fpll)((ProtoLiteMessage)fplm.b).v_newBuilder();
                fplo fplo0 = (fplo)((ProtoLiteMessage)fplp.b).v_newBuilder();
                hxmg hxmg0 = hxmg.a;
                if(hxmg0.b().g()) {
                    long v3 = System.currentTimeMillis();
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    ((fplm)fpll0.b_message).c |= 8;
                    ((fplm)fpll0.b_message).g = v3;
                    ByteString hfsf2 = ByteString.copyFrom(arr_b);
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    ((fplm)fpll0.b_message).c |= 1;
                    ((fplm)fpll0.b_message).d = hfsf2;
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    ((fplm)fpll0.b_message).c |= 2;
                    ((fplm)fpll0.b_message).e = true;
                    fpll0.a(arrayList0);
                    String s3 = file0.getName();
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    fplm fplm1 = (fplm)fpll0.b_message;
                    s3.getClass();
                    fplm1.c |= 4;
                    fplm1.f = s3;
                    gged_interceptors gged4 = ggna.a;
                    fpll0.l(gged4);
                    fpll0.k(gged4);
                    ByteString hfsf3 = ByteString.copyFrom(arr_b1);
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    ((fplp)fplo0.b_message).c |= 1;
                    ((fplp)fplo0.b_message).d = hfsf3;
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    ((fplp)fplo0.b_message).c |= 2;
                    ((fplp)fplo0.b_message).e = true;
                    fplo0.a(arrayList0);
                    String s4 = file1.getName();
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    fplp fplp1 = (fplp)fplo0.b_message;
                    s4.getClass();
                    fplp1.c |= 4;
                    fplp1.f = s4;
                    fplo0.l(gged4);
                    fplo0.k(gged4);
                }
                else {
                    for(Object object0: hxmg0.b().e().b) {
                        fplf0 = (fplf)object0;
                        if(!fplf0.b.equals(s)) {
                            continue;
                        }
                        goto label_30;
                    }
                    fplf0 = null;
                label_30:
                    long v2 = System.currentTimeMillis();
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    ((fplm)fpll0.b_message).c |= 8;
                    ((fplm)fpll0.b_message).g = v2;
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    ((fplm)fpll0.b_message).c |= 1;
                    ((fplm)fpll0.b_message).d = hfsf0;
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    ((fplm)fpll0.b_message).c |= 2;
                    ((fplm)fpll0.b_message).e = fplf0 != null;
                    fpll0.a(arrayList0);
                    String s1 = file0.getName();
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    fplm fplm0 = (fplm)fpll0.b_message;
                    s1.getClass();
                    fplm0.c |= 4;
                    fplm0.f = s1;
                    gged_interceptors gged0 = fplf0 == null ? ggna.a : fplf0.c;
                    fpll0.l(gged0);
                    gged_interceptors gged1 = fplf0 == null ? ggna.a : fplf0.d;
                    fpll0.k(gged1);
                    ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    ((fplp)fplo0.b_message).c |= 1;
                    ((fplp)fplo0.b_message).d = hfsf1;
                    if(fplf0 != null) {
                        z = true;
                    }
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    ((fplp)fplo0.b_message).c |= 2;
                    ((fplp)fplo0.b_message).e = z;
                    fplo0.a(arrayList0);
                    String s2 = file1.getName();
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    fplp fplp0 = (fplp)fplo0.b_message;
                    s2.getClass();
                    fplp0.c |= 4;
                    fplp0.f = s2;
                    gged_interceptors gged2 = fplf0 == null ? ggna.a : fplf0.c;
                    fplo0.l(gged2);
                    gged_interceptors gged3 = fplf0 == null ? ggna.a : fplf0.d;
                    fplo0.k(gged3);
                }
                String s5 = file0.getParent();
                if(s5 != null) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fplq.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fplq fplq0 = (fplq)hftp0.b_message;
                    fplq0.b |= 1;
                    fplq0.c = s5;
                    long v4 = (long)Build.VERSION.SDK_INT;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fplq fplq1 = (fplq)hftp0.b_message;
                    fplq1.b |= 2;
                    fplq1.d = v4;
                    if(!fpll0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fpll0).ensureMutable();
                    }
                    fplm fplm2 = (fplm)fpll0.b_message;
                    fplq fplq2 = (fplq)hftp0.N_build();
                    fplq2.getClass();
                    fplm2.k = fplq2;
                    fplm2.c |= 16;
                }
                String s6 = file1.getParent();
                if(s6 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fplq.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fplq fplq3 = (fplq)hftp1.b_message;
                    fplq3.b |= 1;
                    fplq3.c = s6;
                    long v5 = (long)Build.VERSION.SDK_INT;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    fplq fplq4 = (fplq)hftp1.b_message;
                    fplq4.b |= 2;
                    fplq4.d = v5;
                    if(!fplo0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fplo0).ensureMutable();
                    }
                    fplp fplp2 = (fplp)fplo0.b_message;
                    fplq fplq5 = (fplq)hftp1.N_build();
                    fplq5.getClass();
                    fplp2.j = fplq5;
                    fplp2.c |= 8;
                }
                if(!fpll0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fpll0).ensureMutable();
                }
                ((fplm)fpll0.b_message).c |= 0x20;
                ((fplm)fpll0.b_message).l = true;
                if(!fplo0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fplo0).ensureMutable();
                }
                ((fplp)fplo0.b_message).c |= 16;
                ((fplp)fplo0.b_message).k = true;
                if(!fpll0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fpll0).ensureMutable();
                }
                ((fplm)fpll0.b_message).c |= 0x40;
                ((fplm)fpll0.b_message).m = true;
                if(!fplo0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fplo0).ensureMutable();
                }
                ((fplp)fplo0.b_message).c |= 0x20;
                ((fplp)fplo0.b_message).l = true;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fplr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fplr fplr0 = (fplr)hftp2.b_message;
                fplm fplm3 = (fplm)((ProtoLiteBuilder)fpll0).N_build();
                fplm3.getClass();
                fplr0.c = fplm3;
                fplr0.b |= 1;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fplr fplr1 = (fplr)hftp2.b_message;
                fplp fplp3 = (fplp)((ProtoLiteBuilder)fplo0).N_build();
                fplp3.getClass();
                fplr1.d = fplp3;
                fplr1.b |= 2;
                fplr2 = (fplr)hftp2.N_build();
                gftb.check(fplr2);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(eiok0, throwable0);
                throw throwable0;
            }
            if(eiok0 != null) {
                eiok0.close();
                return fplr2.toBytesArray();
            }
        }
        catch(IOException | RuntimeException exception0) {
            throw new eioz(0x734C, "Failed to create storage info for calling package: " + s, exception0);
        }
        return fplr2.toBytesArray();
    }
}

