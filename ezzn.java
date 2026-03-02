import android.content.Context;
import android.os.RecoverySystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jeb.synthetic.TWR;

public final class ezzn extends ezyn {
    public static final fagu g;
    private static final baun h;
    private final Context i;
    private final fagt j;
    private final ezxs k;

    static {
        ezzn.g = new fagu("file_path", "");
        ezzn.h = fabk.e("NonStreamingProcessPackageAction");
    }

    public ezzn(Context context0, fagj fagj0) {
        super("non-streaming-process-package", fagj0);
        this.i = context0;
        this.j = (fagt)fagt.a.b();
        this.k = (ezxs)ezxs.l.b();
    }

    @Override  // ezyj
    public final ezyi a() {
        boolean z;
        long v2;
        hlnn hlnn0;
        this.k.u(3, -1.0);
        File file0 = hrnt.i() ? new File(ccsb.a.a(((String)this.c(ezzn.g)))) : new File(((String)this.c(ezzn.g)));
        try {
            ZipFile zipFile0 = new ZipFile(file0);
            try {
                if(hwax.a.b().a()) {
                    ZipEntry zipEntry0 = zipFile0.getEntry("META-INF/com/android/metadata.pb");
                    if(zipEntry0 != null) {
                        InputStream inputStream0 = zipFile0.getInputStream(zipEntry0);
                        if(inputStream0 == null) {
                            throw new IOException("Unable to get input stream for " + zipFile0.getName());
                        }
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlnn.a).v_newBuilder();
                        hftp0.G(inputStream0);
                        hlnn0 = (hlnn)hftp0.N_build();
                        goto label_21;
                    }
                    goto label_14;
                }
                else {
                label_14:
                    ZipEntry zipEntry1 = zipFile0.getEntry("META-INF/com/android/metadata");
                    if(zipEntry1 == null) {
                        throw new IOException("Unable to find METADATA file.");
                    }
                    InputStream inputStream1 = zipFile0.getInputStream(zipEntry1);
                    if(inputStream1 == null) {
                        throw new IOException("Unable to get input stream for " + zipFile0.getName());
                    }
                    hlnn0 = ezwr.d(ezwr.f(new InputStreamReader(inputStream1)));
                }
            label_21:
                fagh[] arr_fagh = new fagh[1];
                gfsx gfsx0 = gfsx.m(hlnn0);
                arr_fagh[0] = new fagh(ezyq.h, gfsx0);
                this.j.e(arr_fagh);
            }
            finally {
                zipFile0.close();
            }
            if(ezwc.f()) {
                ArrayList arrayList0 = new ArrayList();
                ZipFile zipFile1 = new ZipFile(file0);
                TWR.declareResource(zipFile1);
                TWR.useResource$NT(zipFile1);
                Enumeration enumeration0 = zipFile1.entries();
                fafo fafo0 = null;
                long v1 = 0L;
                while(true) {
                    TWR.useResource$NT(zipFile1);
                    if(!enumeration0.hasMoreElements()) {
                        break;
                    }
                    TWR.useResource$NT(zipFile1);
                    ZipEntry zipEntry2 = (ZipEntry)enumeration0.nextElement();
                    String s = zipEntry2.getName();
                    if(zipEntry2.getExtra() == null) {
                        TWR.useResource$NT(zipFile1);
                        v2 = 0L;
                    }
                    else {
                        TWR.useResource$NT(zipFile1);
                        v2 = (long)zipEntry2.getExtra().length;
                    }
                    TWR.useResource$NT(zipFile1);
                    v1 += ((long)(s.length() + 30)) + v2;
                    if(!zipEntry2.isDirectory()) {
                        TWR.useResource$NT(zipFile1);
                        long v3 = zipEntry2.getCompressedSize();
                        if("payload.bin".equals(s)) {
                            TWR.useResource$NT(zipFile1);
                            if(zipEntry2.getMethod() != 0) {
                                TWR.useResource$NT(zipFile1);
                                throw new IOException("Invalid compression method.");
                            }
                            TWR.useResource$NT(zipFile1);
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fafo.a).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                TWR.useResource$NT(zipFile1);
                                hftp1.ensureMutable();
                            }
                            TWR.useResource$NT(zipFile1);
                            fafo.b(((fafo)hftp1.b_message));
                            if(!hftp1.b_message.isImmutable()) {
                                TWR.useResource$NT(zipFile1);
                                hftp1.ensureMutable();
                            }
                            TWR.useResource$NT(zipFile1);
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((fafo)hftv0).b = v1;
                            if(!hftv0.isImmutable()) {
                                TWR.useResource$NT(zipFile1);
                                hftp1.ensureMutable();
                            }
                            TWR.useResource$NT(zipFile1);
                            ((fafo)hftp1.b_message).c = v3;
                            fafo0 = (fafo)hftp1.N_build();
                        }
                        else {
                            TWR.useResource$NT(zipFile1);
                            if("payload_properties.txt".equals(s)) {
                                TWR.useResource$NT(zipFile1);
                                InputStream inputStream2 = zipFile1.getInputStream(zipEntry2);
                                if(inputStream2 != null) {
                                    TWR.useResource$NT(zipFile1);
                                    BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream2));
                                    ArrayList arrayList1 = new ArrayList();
                                    ghjw ghjw0 = new ghjw(bufferedReader0);
                                    while(true) {
                                        TWR.useResource$NT(zipFile1);
                                        String s1 = ghjw0.a();
                                        if(s1 == null) {
                                            break;
                                        }
                                        TWR.useResource$NT(zipFile1);
                                        arrayList1.add(s1);
                                    }
                                    TWR.useResource$NT(zipFile1);
                                    arrayList0.addAll(arrayList1);
                                }
                            }
                        }
                        v1 += v3;
                    }
                }
                if(fafo0 == null) {
                    throw new IOException("Failed to find payload entry in the given package.");
                }
                fafm fafm0 = (fafm)((ProtoLiteMessage)fafn.a).v_newBuilder();
                String s2 = "file://" + file0.getAbsolutePath();
                if(!fafm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fafm0).ensureMutable();
                }
                ((fafn)fafm0.b_message).c = s2;
                if(!fafm0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fafm0).ensureMutable();
                }
                ((fafn)fafm0.b_message).e = fafo0;
                ((fafn)fafm0.b_message).b |= 1;
                fafm0.a(arrayList0);
                fafn fafn0 = (fafn)((ProtoLiteBuilder)fafm0).N_build();
                fagh[] arr_fagh1 = new fagh[1];
                gfsx gfsx1 = gfsx.m(fafn0);
                arr_fagh1[0] = new fagh(ezyq.i, gfsx1);
                this.j.e(arr_fagh1);
            }
            RecoverySystem.verifyPackage(file0, null, null);
            if(ezwc.f()) {
                faab.f(file0);
            }
        }
        catch(IOException | GeneralSecurityException exception0) {
            ezzn.h.g("Package verification failed.", exception0, new Object[0]);
            int v4 = ezwc.f() ? 274 : 0x107;
            this.k.u(v4, -1.0);
            fagt fagt0 = (fagt)fagt.a.b();
            fagh[] arr_fagh2 = new fagh[1];
            Integer integer0 = (int)(((int)(((Integer)fagt0.a(ezyq.f).b))) + 1);
            arr_fagh2[0] = new fagh(ezyq.f, integer0);
            fagt0.e(arr_fagh2);
            return ezzr.a(this.i, false);
        }
        if(!ezwc.f()) {
            Context context0 = this.i;
            if(ezwy.g(context0, this.k.b())) {
                try {
                    ezzn.h.h("Processing the package...", new Object[0]);
                    RecoverySystem.processPackage(context0, file0, null);
                    z = true;
                }
                catch(IOException iOException0) {
                    ezzn.h.g("Error processing the package.", iOException0, new Object[0]);
                    z = false;
                }
            }
            else {
                z = false;
            }
            fagi fagi0 = new fagi();
            String s3 = (String)this.b().c(ezzn.g);
            fagi0.e(ezzk.g, s3);
            fagi0.e(ezzk.h, Boolean.valueOf(z));
            return new ezyi("non-ab-reboot", fagi0.a());
        }
        fagi fagi1 = new fagi();
        fagh[] arr_fagh3 = new fagh[1];
        String s4 = (String)this.b().c(ezzn.g);
        arr_fagh3[0] = new fagh(ezyw.g, s4);
        fagi1.d(arr_fagh3);
        return new ezyi("ab-update-prep", fagi1.a());
    }
}

