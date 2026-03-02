import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec.Builder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class dgan implements dgah {
    public final Context a;
    final dfsk b;
    public final dhtl c;
    public final ExecutorService d;
    public int e;
    public int f;
    private final SecureRandom g;
    private final dhde h;
    private ByteString i;
    private int j;
    private final dasx k;
    private final dcpn l;
    private final dgaj m;

    public dgan(Context context0, dfsk dfsk0, dhde dhde0, dhtl dhtl0, ExecutorService executorService0, dasx dasx0) {
        this.e = 4;
        this.j = 4;
        this.f = 0;
        this.a = context0;
        this.b = dfsk0;
        this.h = dhde0;
        this.c = dhtl0;
        this.g = new SecureRandom();
        this.i = null;
        this.d = executorService0;
        this.m = new dgaj(dhde0);
        this.l = dcpn.f(context0);
        this.k = dasx0;
    }

    public final void A(Account account0) {
        synchronized(this) {
            List list0 = this.v(account0, "nearby_sharing_private_certificate_file_for_all_contacts");
            List list1 = this.v(account0, "nearby_sharing_private_certificate_file_for_selected_contacts");
            List list2 = this.v(account0, "nearby_sharing_private_certificate_file_for_self");
            int v1 = glwy.f(new int[]{list0.size(), list1.size(), list2.size()});
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbww.a).v_newBuilder();
                if(v2 < list0.size()) {
                    dbwu dbwu0 = (dbwu)list0.get(v2);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbww dbww0 = (dbww)hftp0.b_message;
                    dbwu0.getClass();
                    dbww0.c = dbwu0;
                    dbww0.b |= 1;
                }
                if(v2 < list1.size()) {
                    dbwu dbwu1 = (dbwu)list1.get(v2);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbww dbww1 = (dbww)hftp0.b_message;
                    dbwu1.getClass();
                    dbww1.d = dbwu1;
                    dbww1.b |= 2;
                }
                if(v2 < list2.size()) {
                    dbwu dbwu2 = (dbwu)list2.get(v2);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbww dbww2 = (dbww)hftp0.b_message;
                    dbwu2.getClass();
                    dbww2.e = dbwu2;
                    dbww2.b |= 4;
                }
                arrayList0.add(((dbww)hftp0.N_build()));
            }
            if(!arrayList0.isEmpty()) {
                gged_interceptors gged0 = dgan.R();
                int v3 = ((ggna)gged0).c;
                for(int v4 = 0; v4 < v3; ++v4) {
                    this.U(account0, ((String)gged0.get(v4)));
                }
                dizg.k(this.a, account0, new String[]{"nearby_sharing_private_certificate_book"});
                cutr.e(this.a, "com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
                dfsk dfsk0 = this.b;
                if(dfsk0 != null) {
                    dfsk0.K(account0, Boolean.valueOf(false));
                }
            }
        }
    }

    public final void B(PrintWriter printWriter0) {
        String s3;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(dcpt.K()) {
            case 2: 
            case 3: {
                printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.provider.connections.CertificateManagerImpl"));
                printWriter0.write("  Public certificates:\n");
                dfsk dfsk0 = this.b;
                Account account0 = dfsk0.c();
                if(account0 == null) {
                    printWriter0.write("    No public certificate stored on device.\n");
                }
                else {
                    dbwy dbwy0 = this.o(account0);
                    cumk[] arr_cumk = {new cumk(50, "ID"), new cumk(50, "nearby presence id"), new cumk(30, "Start Time"), new cumk(30, "End Time")};
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    Collections.addAll(arrayList0, arr_cumk);
                    for(Object object0: dbwy0.b) {
                        String s = bbmu.a(((dbwx)object0).c.toByteArray());
                        heax heax0 = ((dbwx)object0).k;
                        if(heax0 == null) {
                            heax0 = heax.a;
                        }
                        cuml.b(new Object[]{s, ((long)heax0.m), DateFormat.getDateTimeInstance().format(new Date(((dbwx)object0).f)), DateFormat.getDateTimeInstance().format(new Date(((dbwx)object0).g))}, arrayList1);
                    }
                    cuml.a(printWriter0, arrayList0, arrayList1);
                }
                printWriter0.write("  Private certificates:\n");
                Account account1 = dfsk0.c();
                if(account1 == null) {
                    printWriter0.write("    No private certificate stored on device.\n");
                    FIN.finallyExec$NT(v);
                    return;
                }
                cumk[] arr_cumk1 = {new cumk(50, "ID"), new cumk(50, "Nearby Presence id"), new cumk(20, "Type"), new cumk(30, "Start Time"), new cumk(30, "End Time")};
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Collections.addAll(arrayList2, arr_cumk1);
                gged_interceptors gged0 = dgan.R();
                int v1 = ((ggna)gged0).c;
                for(int v2 = 0; v2 < v1; ++v2) {
                    String s1 = (String)gged0.get(v2);
                    for(Iterator iterator1 = this.v(account1, s1).iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                        Object object1 = iterator1.next();
                        String s2 = bbmu.a(((dbwu)object1).c.toByteArray());
                        heav heav0 = ((dbwu)object1).p;
                        if(heav0 == null) {
                            heav0 = heav.a;
                        }
                        Long long0 = (long)heav0.l;
                        switch(s1) {
                            case "nearby_sharing_private_certificate_file_for_all_contacts": {
                                s3 = "all_contacts";
                                break;
                            }
                            case "nearby_sharing_private_certificate_file_for_selected_contacts": {
                                s3 = "selected_contacts";
                                break;
                            }
                            case "nearby_sharing_private_certificate_file_for_self": {
                                s3 = "self";
                                break;
                            }
                            default: {
                                s3 = s1;
                            }
                        }
                        cuml.b(new Object[]{s2, long0, s3, DateFormat.getDateTimeInstance().format(new Date(((dbwu)object1).f)), DateFormat.getDateTimeInstance().format(new Date(((dbwu)object1).g))}, arrayList3);
                        v2 = v2;
                        v1 = v1;
                        s1 = s1;
                    }
                }
                cuml.a(printWriter0, arrayList2, arrayList3);
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
            }
        }
    }

    public final void C(dcpv dcpv0) {
        synchronized(this) {
            Account account0 = this.b.c();
            if(account0 == null) {
                return;
            }
            this.U(account0, "nearby_sharing_private_certificate_file_for_all_contacts");
            this.U(account0, "nearby_sharing_private_certificate_file_for_selected_contacts");
            cutr.e(this.a, "com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
            this.c(dcpv0);
        }
    }

    public final void D() {
        synchronized(this) {
            gged_interceptors gged0 = dgan.R();
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s = (String)gged0.get(v2);
                for(Object object0: dizg.i(this.a, new String[]{s})) {
                    File file0 = (File)object0;
                    try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
                        hftc hftc0 = hftc.a();
                        hfsl hfsl0 = hfsl.N(fileInputStream0);
                        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)dbwv.a).x_newMutableInstance();
                        try {
                            hfwc hfwc0 = hfvu.a.c(hftv0);
                            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                            hfwc0.g(hftv0);
                        }
                        catch(hfur hfur1) {
                            if(hfur1.b) {
                                hfur1 = new hfur(hfur1);
                            }
                            hfur1.a = hftv0;
                            throw hfur1;
                        }
                        catch(hfwr hfwr0) {
                            hfur hfur2 = hfwr0.a();
                            hfur2.a = hftv0;
                            throw hfur2;
                        }
                        catch(IOException iOException0) {
                            if((iOException0.getCause() instanceof hfur)) {
                                throw (hfur)iOException0.getCause();
                            }
                            hfur hfur3 = new hfur(iOException0);
                            hfur3.a = hftv0;
                            throw hfur3;
                        }
                        catch(RuntimeException runtimeException0) {
                            if((runtimeException0.getCause() instanceof hfur)) {
                                throw (hfur)runtimeException0.getCause();
                            }
                            throw runtimeException0;
                        }
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        this.T(((dbwv)hftv0).b);
                    }
                    catch(hfur hfur0) {
                        dcvz.a.e().f(hfur0).p("Failed to read proto objects. Delete all certificate files.", new Object[0]);
                        this.y();
                    }
                    catch(IOException | IllegalStateException exception0) {
                        dcvz.a.e().f(exception0).h("Failed to read %s", s);
                    }
                }
            }
            this.y();
            dcvz.a.b().p("CertificateManager has been reset", new Object[0]);
        }
    }

    final void E(Runnable runnable0) {
        this.d.execute(runnable0);
    }

    public final void F(dcpv dcpv0) {
        synchronized(this) {
            this.E(new dgai(this, dcpv0));
        }
    }

    public final boolean G(Account account0, dcpv dcpv0, List list0) {
        boolean z;
        int v4;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        bxf bxf0 = new bxf();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.o(account0).b) {
            dbwx dbwx0 = (dbwx)object0;
            bxf0.add(dbwx0.c);
            if(!dgan.ae(dbwx0)) {
                continue;
            }
            arrayList0.add(dbwx0);
        }
        ArrayList arrayList1 = new ArrayList();
        long v1 = System.currentTimeMillis();
        bxf bxf1 = new bxf();
        ArrayList arrayList2 = new ArrayList();
        int v2 = 0;
        int v3 = 0;
        for(Object object1: list0) {
            dbwx dbwx1 = (dbwx)object1;
            if(bxf0.contains(dbwx1.c)) {
                v4 = v3;
            }
            else {
                v4 = v3;
                long v5 = dbwx1.f;
                if(v5 < v1) {
                    try {
                        arrayList1.add(Integer.valueOf(glwy.a((v1 - v5) / 60000L)));
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        dcvz.a.e().f(illegalArgumentException0).h("Analytics logger skip this overflow with start time: %d", Long.valueOf(dbwx1.f));
                    }
                }
                ++v2;
            }
            if(dgan.ae(dbwx1)) {
                bxf1.add(dbwx1.c);
                arrayList2.add(dbwx1);
                v3 = v4;
            }
            else {
                v3 = v4 + 1;
            }
        }
        int v6 = arrayList0.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            dbwx dbwx2 = (dbwx)arrayList0.get(v7);
            if(bxf1.add(dbwx2.c)) {
                arrayList2.add(dbwx2);
            }
        }
        dcpn dcpn0 = this.l;
        int v8 = list0.size();
        ProtoLiteBuilder hftp0 = dcpt.L(26);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqx.a).v_newBuilder();
        gzan gzan0 = gzan.m;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gyqx)hftv0).d = gzan0.n;
        ((gyqx)hftv0).b |= 2;
        int v9 = dcpv0.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        if(v9 != 0) {
            ((gyqx)hftv1).f = v9 - 1;
            ((gyqx)hftv1).b |= 8;
            int v10 = dcpv0.b;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqx gyqx0 = (gyqx)hftp1.b_message;
            if(v10 != 0) {
                gyqx0.g = v10 - 1;
                gyqx0.b |= 16;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyqt.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((gyqt)hftv2).b |= 1;
                ((gyqt)hftv2).c = v8;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp2.b_message;
                ((gyqt)hftv3).b |= 2;
                ((gyqt)hftv3).d = v2;
                if(!hftv3.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp2.b_message;
                ((gyqt)hftv4).b |= 4;
                ((gyqt)hftv4).e = v3;
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gyqt gyqt0 = (gyqt)hftp2.b_message;
                hfuf hfuf0 = gyqt0.f;
                if(!hfuf0.c()) {
                    gyqt0.f = ProtoLiteMessage.C(hfuf0);
                }
                hfrj.E(arrayList1, gyqt0.f);
                gyqt gyqt1 = (gyqt)hftp2.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gyqx gyqx1 = (gyqx)hftp1.b_message;
                gyqt1.getClass();
                gyqx1.i = gyqt1;
                gyqx1.b |= 0x40;
                gyqx gyqx2 = (gyqx)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gysp gysp0 = (gysp)hftp0.b_message;
                gyqx2.getClass();
                gysp0.B = gyqx2;
                gysp0.b |= 0x8000000;
                dcpn0.i(new dcow(((gysp)hftp0.N_build())));
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)dbwy.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                dbwy dbwy0 = (dbwy)hftp3.b_message;
                dbwy0.b();
                hfrj.E(arrayList2, dbwy0.b);
                dbwy dbwy1 = (dbwy)hftp3.N_build();
                File file0 = this.S(account0);
                if(!file0.exists()) {
                    try {
                        file0.createNewFile();
                    }
                    catch(IOException iOException0) {
                        dcvz.a.e().f(iOException0).p("Failed to save public certificates to disk. Unable to create the file.", new Object[0]);
                        z = false;
                        goto label_135;
                    }
                }
                try {
                    FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
                    TWR.declareResource(fileOutputStream0);
                    TWR.useResource$NT(fileOutputStream0);
                    dbwy1.writeToStream(fileOutputStream0);
                    dcvz.a.b().p("Saved public certificates to disk.", new Object[0]);
                    z = true;
                }
                catch(IOException iOException1) {
                    dcvz.a.e().f(iOException1).p("Failed to save public certificates to disk.", new Object[0]);
                    z = false;
                }
            label_135:
                dasx dasx0 = this.k;
                if(dasx0 != null) {
                    dasx0.g("com.google.gms.nearby.sharing");
                }
                cutr.e(this.a, "com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD");
                FIN.finallyCodeBegin$NT(v);
                return z;
            }
            throw null;
        }
        throw null;
    }

    public final boolean H(Account account0, dcpv dcpv0) {
        List list0;
        synchronized(this) {
            if(this.e == 0) {
                return false;
            }
            list0 = this.w(account0);
            if(list0.isEmpty()) {
                dcvz.a.b().p("Skip uploadPrivateCertificates, since certificates are empty", new Object[0]);
                return false;
            }
        }
        return this.c.p(account0, null, list0, dcpv0);
    }

    public final byte[] I(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        synchronized(this) {
            try {
                Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher0.init(2, new SecretKeySpec(dgan.aa(arr_b1, 0x20), "AES"), new GCMParameterSpec(0x80, dgan.aa(arr_b2, 12)));
                return cipher0.doFinal(arr_b);
            }
            catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException exception0) {
                dcvz.a.e().f(exception0).p("Failed to decrypt bytes with secret key.", new Object[0]);
                if((exception0 instanceof NoSuchAlgorithmException)) {
                    dcow dcow0 = dcpt.H(2);
                    this.l.i(dcow0);
                }
                else if((exception0 instanceof NoSuchPaddingException)) {
                    dcow dcow1 = dcpt.H(3);
                    this.l.i(dcow1);
                }
                else if((exception0 instanceof InvalidKeyException)) {
                    dcow dcow2 = dcpt.H(4);
                    this.l.i(dcow2);
                }
                else if((exception0 instanceof InvalidAlgorithmParameterException)) {
                    dcow dcow3 = dcpt.H(5);
                    this.l.i(dcow3);
                }
                else if((exception0 instanceof IllegalBlockSizeException)) {
                    dcow dcow4 = dcpt.H(6);
                    this.l.i(dcow4);
                }
                return null;
            }
            catch(BadPaddingException unused_ex) {
                dcvz.a.b().p("Failed to decrypt bytes with secret key. BadPaddingException", new Object[0]);
                dcow dcow5 = dcpt.H(7);
                this.l.i(dcow5);
                return null;
            }
        }
    }

    public final byte[] J(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        synchronized(this) {
            try {
                Cipher cipher0 = Cipher.getInstance("AES/GCM/NoPadding");
                cipher0.init(1, new SecretKeySpec(dgan.aa(arr_b1, 0x20), "AES"), new GCMParameterSpec(0x80, dgan.aa(arr_b2, 12)));
                return cipher0.doFinal(arr_b);
            }
            catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException exception0) {
                dcvz.a.e().f(exception0).p("Failed to encrypt with secret key. Returning a random value.", new Object[0]);
                return this.K(12);
            }
        }
    }

    final byte[] K(int v) {
        return dizs.f(v, this.g);
    }

    static byte[] L(byte[] arr_b) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
            messageDigest0.update(arr_b);
            byte[] arr_b1 = messageDigest0.digest();
            dcvz.a.b().p("Generated ID from certificate.", new Object[0]);
            return arr_b1;
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            dcvz.a.e().f(noSuchAlgorithmException0).p("Failed to generate ID from certificate.", new Object[0]);
            return null;
        }
    }

    static final byte[] M(byte[] arr_b, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        try {
            Cipher cipher0 = Cipher.getInstance("AES/CTR/NoPadding");
            cipher0.init(2, new SecretKeySpec(arr_b1, "AES"), new IvParameterSpec(dgan.aa(arr_b2, 16)));
            byte[] arr_b4 = cipher0.doFinal(arr_b);
            if(MessageDigest.isEqual(dgan.Z(arr_b4), arr_b3)) {
                return arr_b4;
            }
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException unused_ex) {
        }
        return null;
    }

    final void N(dcpv dcpv0) {
        synchronized(this) {
            this.E(new dgam(this, dcpv0));
            this.F(dcpv0);
        }
    }

    private static long O(long v, long v1) {
        int v2 = Long.compare(v1, 0L);
        long v3 = v1 + v;
        if(v2 < 0 && v3 > v) {
            return 0x8000000000000000L;
        }
        return v2 <= 0 || v3 >= v ? v3 : 0x7FFFFFFFFFFFFFFFL;
    }

    private final dbwx P(dbwu dbwu0) {
        X509Certificate x509Certificate0;
        try {
            x509Certificate0 = (X509Certificate)this.h.a(dbwu0.d);
            if(x509Certificate0 != null) {
                goto label_2;
            }
        }
        catch(KeyStoreException unused_ex) {
        }
        return null;
    label_2:
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbwr.a).v_newBuilder();
        String s = dbwu0.j;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((dbwr)hftv0).b |= 1;
        ((dbwr)hftv0).c = s;
        String s1 = dbwu0.k;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        s1.getClass();
        ((dbwr)hftv1).b |= 2;
        ((dbwr)hftv1).d = s1;
        String s2 = dbwu0.l;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        s2.getClass();
        ((dbwr)hftv2).b |= 4;
        ((dbwr)hftv2).e = s2;
        String s3 = dbwu0.r;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        dbwr dbwr0 = (dbwr)hftp0.b_message;
        s3.getClass();
        dbwr0.b |= 0x100;
        dbwr0.k = s3;
        Context context0 = this.a;
        String s4 = djbw.d(context0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        s4.getClass();
        ((dbwr)hftv3).b |= 0x40;
        ((dbwr)hftv3).i = s4;
        int v = dbwu0.o;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        dbwr dbwr1 = (dbwr)hftp0.b_message;
        dbwr1.b |= 0x80;
        dbwr1.j = v;
        if(!cumz.l(context0)) {
            if(this.i == null) {
                bsaq bsaq0 = cumz.e(context0, "CertificateManager");
                if(bsaq0 != null) {
                    try {
                        byte[] arr_b = cutq.c(bsaq0.k());
                        this.i = arr_b == null ? ByteString.b : ByteString.copyFrom(arr_b);
                    }
                    catch(SecurityException securityException0) {
                        dcvz.a.e().f(securityException0).p("getBluetoothMacAddress failed due to SecurityException.", new Object[0]);
                    }
                }
            }
            ByteString hfsf0 = this.i;
            if(hfsf0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dbwr dbwr2 = (dbwr)hftp0.b_message;
                dbwr2.b |= 8;
                dbwr2.f = hfsf0;
            }
        }
        if((dbwu0.b & 0x200) != 0) {
            String s5 = dbwu0.m;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbwr dbwr3 = (dbwr)hftp0.b_message;
            s5.getClass();
            dbwr3.b |= 16;
            dbwr3.g = s5;
        }
        if((dbwu0.b & 0x400) != 0) {
            String s6 = dbwu0.n;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbwr dbwr4 = (dbwr)hftp0.b_message;
            s6.getClass();
            dbwr4.b |= 0x20;
            dbwr4.h = s6;
        }
        byte[] arr_b1 = this.J(((dbwr)hftp0.N_build()).toBytesArray(), dbwu0.i.toByteArray(), dbwu0.e.toByteArray());
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dbwx.a).v_newBuilder();
        ByteString hfsf1 = dbwu0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        hfsf1.getClass();
        ((dbwx)hftv4).b |= 1;
        ((dbwx)hftv4).c = hfsf1;
        ByteString hfsf2 = dbwu0.e;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx0 = (dbwx)hftp1.b_message;
        hfsf2.getClass();
        dbwx0.b |= 2;
        dbwx0.d = hfsf2;
        ByteString hfsf3 = ByteString.copyFrom(x509Certificate0.getPublicKey().getEncoded());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx1 = (dbwx)hftp1.b_message;
        dbwx1.b |= 4;
        dbwx1.e = hfsf3;
        SecureRandom secureRandom0 = this.g;
        long v1 = dbwu0.f - TimeUnit.MINUTES.toMillis(((long)secureRandom0.nextInt(((int)hvqs.n()))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx2 = (dbwx)hftp1.b_message;
        dbwx2.b |= 8;
        dbwx2.f = v1;
        long v2 = dbwu0.g + TimeUnit.MINUTES.toMillis(((long)secureRandom0.nextInt(((int)hvqs.n()))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx3 = (dbwx)hftp1.b_message;
        dbwx3.b |= 16;
        dbwx3.g = v2;
        ByteString hfsf4 = ByteString.copyFrom(arr_b1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx4 = (dbwx)hftp1.b_message;
        dbwx4.b |= 0x20;
        dbwx4.h = hfsf4;
        ByteString hfsf5 = ByteString.copyFrom(dgan.Z(dbwu0.i.toByteArray()));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx5 = (dbwx)hftp1.b_message;
        dbwx5.b |= 0x40;
        dbwx5.i = hfsf5;
        heax heax0 = dbwu0.q == null ? heax.a : dbwu0.q;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbwx dbwx6 = (dbwx)hftp1.b_message;
        heax0.getClass();
        dbwx6.k = heax0;
        dbwx6.b |= 0x100;
        return (dbwx)hftp1.N_build();
    }

    private final dgaq Q() {
        return new dgaq(dizs.f(14, this.g), dizs.f(2, this.g));
    }

    private static gged_interceptors R() {
        return gged_interceptors.n("nearby_sharing_private_certificate_file_for_self", "nearby_sharing_private_certificate_file_for_all_contacts", "nearby_sharing_private_certificate_file_for_selected_contacts");
    }

    private final File S(Account account0) {
        return dizg.g(this.a, account0, "nearby_sharing_public_certificate_book");
    }

    private final void T(Iterable iterable0) {
        for(Object object0: iterable0) {
            dbwu dbwu0 = (dbwu)object0;
            if(dbwu0 == null) {
                continue;
                try {
                label_5:
                    dhde dhde0 = this.h;
                    dhde0.b(dbwu0.d);
                    if((dbwu0.b & 0x1000) == 0) {
                        continue;
                    }
                    heav heav0 = dbwu0.p == null ? heav.a : dbwu0.p;
                    dhde0.b((heav0.h == null ? heau.a : heav0.h).b);
                }
                catch(KeyStoreException unused_ex) {
                }
                continue;
            }
            else {
                goto label_5;
            }
            break;
        }
    }

    private final void U(Account account0, String s) {
        synchronized(this) {
            this.T(this.v(account0, s));
            dizg.k(this.a, account0, new String[]{s});
            dfsk dfsk0 = this.b;
            if(dfsk0 != null) {
                dfsk0.K(account0, Boolean.valueOf(false));
            }
        }
    }

    private static boolean V(dbwu dbwu0, long v) {
        return dbwu0 == null || v > dbwu0.g;
    }

    private static boolean W(dbwx dbwx0, long v) {
        return (dbwx0.b & 1) != 0 && v <= dgan.O(dbwx0.g, 1800000L);
    }

    private final boolean X(dbwu dbwu0, File file0) {
        if(!file0.exists()) {
            try {
                file0.createNewFile();
            }
            catch(IOException iOException0) {
                dcvz.a.e().f(iOException0).h("Failed to save private certificate to disk. Unable to create the file %s.", file0.getName());
                return false;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(dbwu0);
        for(Object object0: this.u(file0)) {
            dbwu dbwu1 = (dbwu)object0;
            if(dgan.ad(dbwu1)) {
                try {
                    dhde dhde0 = this.h;
                    dhde0.b(dbwu1.d);
                    if((dbwu1.b & 0x1000) == 0) {
                        continue;
                    }
                    heav heav0 = dbwu1.p == null ? heav.a : dbwu1.p;
                    dhde0.b((heav0.h == null ? heau.a : heav0.h).b);
                }
                catch(KeyStoreException keyStoreException0) {
                    dcvz.a.e().f(keyStoreException0).i("Failed to delete key store entry for %s for %s", dbwu1.d, file0.getName());
                }
            }
            else {
                if(dbwu1.c.equals(dbwu0.c)) {
                    continue;
                }
                arrayList0.add(dbwu1);
            }
        }
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbwv.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbwv dbwv0 = (dbwv)hftp0.b_message;
            hfuo hfuo0 = dbwv0.b;
            if(!hfuo0.c()) {
                dbwv0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, dbwv0.b);
            ((dbwv)hftp0.N_build()).writeToStream(fileOutputStream0);
            dcvz.a.b().h("Saving the private certificate to file %s.", file0.getName());
            return true;
        }
        catch(IOException iOException1) {
            dcvz.a.e().f(iOException1).h("Failed to save private certificate to file %s.", file0.getName());
            return false;
        }
    }

    private final boolean Y(Account account0, dbwu dbwu0, String s) {
        if(dgan.ad(dbwu0)) {
            dcvz.a.b().h("Failed to save private certificate to disk %s. Certificate is expired.", s);
            return false;
        }
        boolean z = this.X(dbwu0, this.q(account0, s));
        if(z && s.equals("nearby_sharing_private_certificate_file_for_all_contacts")) {
            dasx dasx0 = this.k;
            if(dasx0 != null) {
                dasx0.g("com.google.gms.nearby.sharing");
                return true;
            }
        }
        return z;
    }

    private static byte[] Z(byte[] arr_b) {
        byte[] arr_b1 = dizs.g(arr_b, new byte[16]);
        return arr_b1 == null ? dizs.e(0x20) : arr_b1;
    }

    @Override  // dgah
    public final int a() {
        throw null;
    }

    private static byte[] aa(byte[] arr_b, int v) {
        byte[] arr_b1 = dizs.d(arr_b, new byte[0x20], v);
        return arr_b1 == null ? dizs.e(v) : arr_b1;
    }

    private final byte[] ab(dbwu dbwu0, byte[] arr_b) {
        PrivateKey privateKey0;
        if(dbwu0 != null) {
            try {
                String s = dbwu0.d;
                dhde dhde0 = this.h;
                KeyStore keyStore0 = dhde0.a;
                if(keyStore0 == null) {
                    throw new KeyStoreException("No AndroidKeyStore found on device, cannot get key.");
                }
                privateKey0 = (PrivateKey)keyStore0.getKey(s, null);
                if(privateKey0 == null) {
                    dcvz.a.e().p("No private key is available. Failed to sign with paired key.", new Object[0]);
                    return this.K(72);
                }
                X509Certificate x509Certificate0 = (X509Certificate)dhde0.a(s);
                if(x509Certificate0 != null && x509Certificate0.getPublicKey() != null) {
                    dcvz.a.d().h("Current PublicKey for signing: %s", Arrays.toString(x509Certificate0.getPublicKey().getEncoded()));
                }
            }
            catch(UnrecoverableKeyException | NoSuchAlgorithmException | KeyStoreException exception0) {
                dcvz.a.e().f(exception0).p("Failed to sign with paired key.", new Object[0]);
                return this.K(72);
            }
            try {
                Signature signature0 = Signature.getInstance("SHA256withECDSA");
                signature0.initSign(privateKey0);
                signature0.update(arr_b);
                return signature0.sign();
            }
            catch(NoSuchAlgorithmException | InvalidKeyException | SignatureException exception1) {
                dcvz.a.e().f(exception1).p("Failed to sign with paired key.", new Object[0]);
                return this.K(72);
            }
        }
        return this.K(72);
    }

    private static final boolean ac(String s, String s1, String s2, String s3, String s4) {
        if(!TextUtils.isEmpty(s)) {
            if(!TextUtils.isEmpty(s1)) {
                if(!TextUtils.isEmpty(s2)) {
                    if(!TextUtils.isEmpty(s3)) {
                        if(TextUtils.isEmpty(s4)) {
                            dcvz.a.b().p("Unable to create private certificate because we don\'t have the account name for the user.", new Object[0]);
                            return false;
                        }
                        return true;
                    }
                    dcvz.a.b().p("Unable to create private certificate because we don\'t have a icon token for the user\'s profile image.", new Object[0]);
                    return false;
                }
                dcvz.a.b().p("Unable to create private certificate because we don\'t have a url for the user\'s profile image.", new Object[0]);
                return false;
            }
            dcvz.a.b().p("Unable to create private certificate because we don\'t have the user\'s full name.", new Object[0]);
            return false;
        }
        dcvz.a.b().p("Unable to create private certificate because we don\'t have a device name.", new Object[0]);
        return false;
    }

    private static final boolean ad(dbwu dbwu0) {
        return dgan.V(dbwu0, System.currentTimeMillis());
    }

    private static final boolean ae(dbwx dbwx0) {
        return dgan.W(dbwx0, System.currentTimeMillis());
    }

    @Override  // dgah
    public final dbwu b(dcpv dcpv0) {
        dbwu dbwu0;
        synchronized(this) {
            Account account0 = this.b.c();
            boolean z = false;
            if(account0 == null) {
                dcvz.a.b().p("Failed to loadValidPrivateCertificate, due to missing account", new Object[0]);
                return null;
            }
            Map map0 = this.x(account0, dcpv0);
            if(map0.isEmpty()) {
                dcvz.a.b().p("Failed to loadValidPrivateCertificate, due to empty PrivateCertificateBook", new Object[0]);
                return null;
            }
            int v1 = this.j;
            if(dcpv0.b == 2) {
                z = true;
            }
            String s = dgan.r(v1, z);
            if(s == null) {
                return null;
            }
            dbwu0 = (dbwu)map0.get(s);
        }
        return dbwu0;
    }

    @Override  // dgah
    public final dbwu c(dcpv dcpv0) {
        int v1;
        Map map0;
        boolean z;
        synchronized(this) {
            Account account0 = this.b.c();
            z = false;
            if(account0 == null) {
                dcvz.a.b().p("Failed to load valid PrivateCertificate, due to missing account", new Object[0]);
                return null;
            }
            map0 = this.x(account0, dcpv0);
            if(map0.isEmpty()) {
                dcvz.a.e().p("Failed to load valid PrivateCertificate", new Object[0]);
                return null;
            }
            v1 = this.e;
            if(dcpv0.b == 2) {
                z = true;
            }
        }
        return (dbwu)map0.get(dgan.r(v1, z));
    }

    @Override  // dgah
    public final dgap d(byte[] arr_b, byte[] arr_b1) {
        dbwr dbwr0;
        synchronized(this) {
            Account account0 = this.b.c();
            boolean z = false;
            if(account0 == null) {
                dcvz.a.b().p("No active account has been set. Failed to query for public certificate.", new Object[0]);
                return null;
            }
            Iterator iterator0 = this.o(account0).b.iterator();
        label_9:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                dbwx dbwx0 = (dbwx)object0;
                byte[] arr_b2 = dbwx0.d.toByteArray();
                byte[] arr_b3 = dgan.M(arr_b, arr_b2, arr_b1, dbwx0.i.toByteArray());
                if(arr_b3 != null) {
                    gged_interceptors gged0 = dgan.R();
                    int v1 = ((ggna)gged0).c;
                    int v2 = 0;
                    while(v2 < v1) {
                        for(Object object1: this.v(account0, ((String)gged0.get(v2)))) {
                            if(Arrays.equals(((dbwu)object1).i.toByteArray(), arr_b3)) {
                                continue label_9;
                            }
                        }
                        ++v2;
                    }
                    byte[] arr_b4 = this.I(dbwx0.h.toByteArray(), arr_b3, arr_b2);
                    if(arr_b4 == null) {
                        continue;
                        try {
                        label_28:
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dbwr.a), arr_b4, 0, arr_b4.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            dbwr0 = (dbwr)hftv0;
                        }
                        catch(hfur unused_ex) {
                            continue;
                        }
                        if(TextUtils.isEmpty(dbwr0.c)) {
                            dcvz.a.b().p("Encrypted metadata does not contain device name. Ignore.", new Object[0]);
                            continue;
                        }
                        if(dbwx0.j) {
                            dcvz.a.a().p("Remote certificate is for self share, because remote certificate is verified for self share", new Object[0]);
                            z = true;
                        }
                        else if(!bata.b(dbwr0.h, this.b.f()) && !bata.b(dbwr0.g, this.b.e())) {
                            dcvz.a.a().p("Remote certificate is not for self share", new Object[0]);
                        }
                        else {
                            dcvz.a.a().p("Remote certificate is for self share, because remote certificate is owned by a same account share", new Object[0]);
                            z = true;
                        }
                        return new dgap(dbwx0, dbwr0, z);
                    }
                    else {
                        goto label_28;
                    }
                    break;
                }
            }
        }
        return null;
    }

    @Override  // dgah
    public final dgaq e(dcpv dcpv0) {
        dgaq dgaq5;
        byte[] arr_b;
        synchronized(this) {
            Account account0 = this.b.c();
            if(account0 == null) {
                return this.Q();
            }
            String s = dgan.r(this.e, dcpv0.b == 2);
            if(s == null) {
                return this.Q();
            }
            dbwu dbwu0 = (dbwu)this.x(account0, dcpv0).get(s);
            if(dbwu0 == null) {
                return this.Q();
            }
            cunf cunf0 = dcvz.a;
            cunf0.b().h("Loading certificates with visibility %s", djbr.t(this.e));
            if(((long)dbwu0.h.size()) >= hvqs.a.aT().aY()) {
                cunf0.b().p("Exhausted all salts: refreshing all certificates", new Object[0]);
                this.A(account0);
                dbwu0 = this.c(dcpv0);
                if(dbwu0 == null) {
                    return this.Q();
                }
            }
            ggfp ggfp0 = ggfp.G(dbwu0.h);
            for(int v1 = 0; true; ++v1) {
                arr_b = null;
                if(v1 >= 0x80) {
                    break;
                }
                byte[] arr_b1 = this.K(2);
                if(!ggfp0.contains(Integer.valueOf(glxf.b(arr_b1)))) {
                    arr_b = arr_b1;
                    break;
                }
            }
            if(arr_b == null) {
                cunf0.e().p("Failed to generate a salt: this should never happen", new Object[0]);
                return this.Q();
            }
            int v2 = glxf.b(arr_b);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbwu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbwu0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbwu dbwu1 = (dbwu)hftp0.b_message;
            hfuf hfuf0 = dbwu1.h;
            if(!hfuf0.c()) {
                dbwu1.h = ProtoLiteMessage.C(hfuf0);
            }
            dbwu1.h.i(v2);
            if(!this.Y(account0, ((dbwu)hftp0.N_build()), s)) {
                cunf0.b().h("Unable to save certificates file %s", s);
            }
            dgaq5 = this.p(dbwu0.i.toByteArray(), dbwu0.e.toByteArray(), arr_b);
        }
        return dgaq5;
    }

    @Override  // dgah
    public final void f(dcpv dcpv0) {
        synchronized(this) {
            this.z();
            this.c(dcpv0);
        }
    }

    @Override  // dgah
    public final void g(int v) {
        throw null;
    }

    @Override  // dgah
    public final void h(int v) {
        synchronized(this) {
            int v1 = this.e;
            if(v1 == v) {
                return;
            }
            this.j = v1;
            this.e = v;
        }
    }

    @Override  // dgah
    public final void i() {
        throw null;
    }

    @Override  // dgah
    public final void j(dcpv dcpv0) {
        synchronized(this) {
            this.N(dcpv0);
        }
    }

    @Override  // dgah
    public final boolean k(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        KeyFactory keyFactory0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.b.c() == null) {
            dcvz.a.e().p("Failed to verify bytes with paired key, due to missing account.", new Object[0]);
            FIN.finallyExec$NT(v);
            return false;
        }
        dcvz.a.d().h("Public Key for verification: %s", Arrays.toString(arr_b));
        try {
            keyFactory0 = KeyFactory.getInstance("EC");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            dcvz.a.e().f(noSuchAlgorithmException0).h("Failed to verify bytes with paired key: %s", "EC");
            FIN.finallyExec$NT(v);
            return false;
        }
        X509EncodedKeySpec x509EncodedKeySpec0 = new X509EncodedKeySpec(arr_b);
        try {
            PublicKey publicKey0 = keyFactory0.generatePublic(x509EncodedKeySpec0);
            Signature signature0 = Signature.getInstance("SHA256withECDSA");
            signature0.initVerify(publicKey0);
            signature0.update(arr_b1);
            boolean z = signature0.verify(arr_b2);
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(InvalidKeySpecException | NoSuchAlgorithmException | InvalidKeyException | SignatureException exception0) {
            dcvz.a.e().f(exception0).h("Failed to verify bytes with paired key: %s", x509EncodedKeySpec0.getFormat());
            FIN.finallyCodeBegin$NT(v);
            return false;
        }
    }

    @Override  // dgah
    public final byte[] l(byte[] arr_b, dcpv dcpv0) {
        byte[] arr_b1;
        synchronized(this) {
            arr_b1 = this.ab(this.c(dcpv0), arr_b);
        }
        return arr_b1;
    }

    @Override  // dgah
    public final byte[] m(byte[] arr_b, dcpv dcpv0) {
        byte[] arr_b1;
        synchronized(this) {
            arr_b1 = this.ab(this.b(dcpv0), arr_b);
        }
        return arr_b1;
    }

    public final dbwy n() {
        Account account0 = this.b.c();
        return account0 == null ? null : this.o(account0);
    }

    final dbwy o(Account account0) {
        File file0 = this.S(account0);
        if(!file0.exists()) {
            return dbwy.a;
        }
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbwy.a).v_newBuilder();
            hfsl hfsl0 = hfsl.N(fileInputStream0);
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)dbwy.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc.a);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur1) {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
                hfur1.a = hftv0;
                throw hfur1;
            }
            catch(hfwr hfwr0) {
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            }
            catch(IOException iOException0) {
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur3 = new hfur(iOException0);
                hfur3.a = hftv0;
                throw hfur3;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            ProtoLiteMessage.P_makeImmutable(hftv0);
            Iterator iterator0 = ((dbwy)hftv0).b.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                dbwx dbwx0 = (dbwx)object0;
                long v = System.currentTimeMillis();
                if(dgan.O(dbwx0.f, -1800000L) <= v && dgan.W(dbwx0, v)) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dbwy dbwy0 = (dbwy)hftp0.b_message;
                    dbwx0.getClass();
                    dbwy0.b();
                    dbwy0.b.add(dbwx0);
                }
            }
            return (dbwy)hftp0.N_build();
        }
        catch(hfur hfur0) {
            dcvz.a.e().f(hfur0).p("Failed to read proto objects. Delete all certificate files.", new Object[0]);
            this.y();
            return dbwy.a;
        }
        catch(IOException | IllegalStateException exception0) {
            dcvz.a.e().f(exception0).p("Failed to read PUBLIC_CERTIFICATES_BOOK", new Object[0]);
            return dbwy.a;
        }
    }

    final dgaq p(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        Cipher cipher0;
        byte[] arr_b3 = this.K(arr_b.length);
        try {
            cipher0 = Cipher.getInstance("AES/CTR/NoPadding");
            switch(arr_b1.length) {
                case 0: {
                    goto label_5;
                }
                case 0x20: {
                    goto label_6;
                }
            }
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException unused_ex) {
            return new dgaq(arr_b3, arr_b2);
        }
        arr_b1 = dgan.aa(arr_b1, 0x20);
        goto label_6;
    label_5:
        arr_b1 = new byte[0x20];
        try {
        label_6:
            cipher0.init(1, new SecretKeySpec(arr_b1, "AES"), new IvParameterSpec(dgan.aa(arr_b2, 16)));
            return new dgaq(cipher0.doFinal(arr_b), arr_b2);
        }
        catch(InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException unused_ex) {
            return new dgaq(arr_b3, arr_b2);
        }
    }

    final File q(Account account0, String s) {
        return dizg.g(this.a, account0, s);
    }

    static String r(int v, boolean z) {
        if(!z) {
            switch(v) {
                case 0: {
                    return null;
                }
                case 2: {
                    return "nearby_sharing_private_certificate_file_for_selected_contacts";
                }
                case 4: {
                    return "nearby_sharing_private_certificate_file_for_self";
                }
                default: {
                    return "nearby_sharing_private_certificate_file_for_all_contacts";
                }
            }
        }
        return "nearby_sharing_private_certificate_file_for_all_contacts";
    }

    final X509Certificate s(String s, long v) {
        try {
            dhde dhde0 = this.h;
            Certificate certificate0 = dhde0.a(s);
            if(certificate0 != null) {
                long v1 = System.currentTimeMillis();
                if(((X509Certificate)certificate0).getNotBefore().getTime() <= v1 && v1 < ((X509Certificate)certificate0).getNotAfter().getTime()) {
                    dcvz.a.b().p("No need to create paired key. Already exists.", new Object[0]);
                    return (X509Certificate)certificate0;
                }
                dhde0.b(s);
                dcvz.a.b().p("Deleted expired paired key.", new Object[0]);
                return dgan.t(s, v, this.m.a);
            }
        }
        catch(KeyStoreException keyStoreException0) {
            dcvz.a.e().f(keyStoreException0).p("Failed to create paired key.", new Object[0]);
            return null;
        }
        return dgan.t(s, v, this.m.a);
    }

    public static X509Certificate t(String s, long v, dhde dhde0) {
        Date date0 = new Date(v);
        Date date1 = new Date(v + hvqs.a.aT().s());
        KeyGenParameterSpec.Builder keyGenParameterSpec$Builder0 = new KeyGenParameterSpec.Builder(s, 12).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setCertificateSubject(new X500Principal("O=Google, OU=Android, C=US")).setRandomizedEncryptionRequired(false).setCertificateNotBefore(date0).setCertificateNotAfter(date1).setKeyValidityForOriginationEnd(date1);
        try {
            KeyPairGenerator keyPairGenerator0 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator0.initialize(keyGenParameterSpec$Builder0.build());
            keyPairGenerator0.generateKeyPair();
            X509Certificate x509Certificate0 = (X509Certificate)dhde0.a(s);
            dcvz.a.b().p("Successfully created paired key.", new Object[0]);
            return x509Certificate0;
        }
        catch(NoSuchAlgorithmException | NoSuchProviderException | InvalidAlgorithmParameterException | ProviderException | KeyStoreException | NullPointerException exception0) {
            dcvz.a.e().f(exception0).p("Failed to create paired key.", new Object[0]);
            return null;
        }
    }

    final List u(File file0) {
        if(!file0.exists()) {
            return ggna.a;
        }
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            hftc hftc0 = hftc.a();
            hfsl hfsl0 = hfsl.N(fileInputStream0);
            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)dbwv.a).x_newMutableInstance();
            try {
                hfwc hfwc0 = hfvu.a.c(hftv0);
                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                hfwc0.g(hftv0);
            }
            catch(hfur hfur1) {
                if(hfur1.b) {
                    hfur1 = new hfur(hfur1);
                }
                hfur1.a = hftv0;
                throw hfur1;
            }
            catch(hfwr hfwr0) {
                hfur hfur2 = hfwr0.a();
                hfur2.a = hftv0;
                throw hfur2;
            }
            catch(IOException iOException0) {
                if((iOException0.getCause() instanceof hfur)) {
                    throw (hfur)iOException0.getCause();
                }
                hfur hfur3 = new hfur(iOException0);
                hfur3.a = hftv0;
                throw hfur3;
            }
            catch(RuntimeException runtimeException0) {
                if((runtimeException0.getCause() instanceof hfur)) {
                    throw (hfur)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return ((dbwv)hftv0).b;
        }
        catch(hfur hfur0) {
            dcvz.a.e().f(hfur0).h("Failed to read proto objects. Delete all certificate files from %s.", file0.getName());
            this.y();
            return ggna.a;
        }
        catch(IOException | IllegalStateException exception0) {
            dcvz.a.e().f(exception0).h("Failed to read %s", file0.getName());
            return ggna.a;
        }
    }

    final List v(Account account0, String s) {
        return this.u(this.q(account0, s));
    }

    public final List w(Account account0) {
        List list0;
        int v3;
        synchronized(this) {
            list0 = new ArrayList();
            gged_interceptors gged0 = dgan.R();
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s = (String)gged0.get(v2);
                for(Object object0: this.v(account0, s)) {
                    dbwu dbwu0 = (dbwu)object0;
                    dbwx dbwx0 = this.P(dbwu0);
                    switch(s) {
                        case "nearby_sharing_private_certificate_file_for_all_contacts": {
                            v3 = 1;
                            break;
                        }
                        case "nearby_sharing_private_certificate_file_for_selected_contacts": {
                            v3 = 2;
                            break;
                        }
                        case "nearby_sharing_private_certificate_file_for_self": {
                            v3 = 4;
                            break;
                        }
                        default: {
                            dcvz.a.e().h("Invalid fileName %s when getVisibility", s);
                            v3 = -1;
                        }
                    }
                    if(dbwx0 != null && v3 != -1) {
                        list0.add(new dhtj(dbwx0, dbwu0.i, v3));
                    }
                }
            }
        }
        return list0;
    }

    final Map x(Account account0, dcpv dcpv0) {
        dbwu dbwu2;
        int v9;
        long v8;
        dfsk dfsk0 = this.b;
        if(dgan.ac(dfsk0.h(account0), dfsk0.j(account0), dfsk0.l(account0), dfsk0.k(account0), dfsk0.f())) {
            String s = dfsk0.h(account0);
            byte[] arr_b = s == null ? null : s.getBytes();
            gged_interceptors gged0 = dgan.R();
            int v = ((ggna)gged0).c;
        alab1:
            for(int v1 = 0; v1 < v; ++v1) {
                for(Object object0: this.v(account0, ((String)gged0.get(v1)))) {
                    dbwu dbwu0 = (dbwu)object0;
                    try {
                        dgaq dgaq0 = this.p(dbwu0.i.toByteArray(), dbwu0.e.toByteArray(), new byte[2]);
                        new dgag(1, dgaq0.b, dgaq0.a, 0, arr_b, null, 0);
                    }
                    catch(IllegalArgumentException | NullPointerException exception0) {
                        dcvz.a.e().f(exception0).p("Failed to generate encrypted metadata key", new Object[0]);
                        dcvz.a.b().p("Current private certificates are not advertisable. Deleting all.", new Object[0]);
                        this.A(account0);
                        break alab1;
                    }
                    if(!bata.b(dfsk0.j(account0), dbwu0.k)) {
                        dcvz.a.e().i("Account full name %s is not equal to the certificate full name %s.", dfsk0.j(account0), dbwu0.k);
                        dcvz.a.b().p("Current private certificates are not advertisable. Deleting all.", new Object[0]);
                        this.A(account0);
                        break alab1;
                    }
                    if(!bata.b(dbwu0.r, dfsk0.k(account0)) && !bata.b(dbwu0.l, dfsk0.l(account0))) {
                        dcvz.a.e().i("Account icon token %s is not equal to the certificate icon token %s.", dfsk0.k(account0), dbwu0.r);
                        dcvz.a.e().i("Account icon url %s is not equal to the certificate icon url %s.", dfsk0.l(account0), dbwu0.l);
                        dcvz.a.b().p("Current private certificates are not advertisable. Deleting all.", new Object[0]);
                        this.A(account0);
                        break alab1;
                    }
                    if(!bata.b(dfsk0.h(account0), dbwu0.j)) {
                        dcvz.a.e().i("Account device name %s is not equal to the certificate device name %s.", dfsk0.h(account0), dbwu0.j);
                        dcvz.a.b().p("Current private certificates are not advertisable. Deleting all.", new Object[0]);
                        this.A(account0);
                        break alab1;
                    }
                    if(!bata.b(Integer.valueOf(this.f), Integer.valueOf(dbwu0.o))) {
                        dcvz.a.e().i("Vendor id %s is not equal to the certificate vendor id %s.", Integer.valueOf(this.f), Integer.valueOf(dbwu0.o));
                        dcvz.a.b().p("Current private certificates are not advertisable. Deleting all.", new Object[0]);
                        this.A(account0);
                        break alab1;
                    }
                    v1 = v1;
                }
            }
            Map map0 = new bxd();
            long v2 = System.currentTimeMillis();
            gged_interceptors gged1 = dgan.R();
            int v3 = ((ggna)gged1).c;
            int v4 = 0;
            boolean z = false;
            while(v4 < v3) {
                String s1 = (String)gged1.get(v4);
                long v5 = v2;
                int v6 = 0;
                for(Object object1: this.v(account0, s1)) {
                    dbwu dbwu1 = (dbwu)object1;
                    if(!dgan.ad(dbwu1)) {
                        v5 = Math.max(v5, dbwu1.g);
                        ++v6;
                        v2 = v2;
                    }
                }
                while(v6 < 3) {
                    String s2 = this.b.h(account0);
                    String s3 = this.b.j(account0);
                    String s4 = this.b.l(account0);
                    String s5 = account0.name;
                    String s6 = this.b.k(account0);
                    int v7 = this.f;
                    if(!dgan.ac(s2, s3, s4, s6, s5)) {
                        dcvz.a.b().p("Failed to create private certificate because we\'re missing device information.", new Object[0]);
                        v8 = v5;
                        v9 = v6;
                        dbwu2 = null;
                    }
                    else if(s2 != null && s3 != null && s4 != null && s5 != null && s6 != null) {
                        byte[] arr_b1 = this.K(0x20);
                        byte[] arr_b2 = dgan.L(arr_b1);
                        if(arr_b2 == null) {
                            dcvz.a.b().p("Failed to create private certificate because it failed to create a secret id.", new Object[0]);
                            v8 = v5;
                            v9 = v6;
                            dbwu2 = null;
                        }
                        else {
                            String s7 = Base64.encodeToString(arr_b2, 11);
                            if(s7 == null) {
                                dcvz.a.b().p("Failed to create private certificate because it failed to create the paired key alias.", new Object[0]);
                                v8 = v5;
                                v9 = v6;
                                dbwu2 = null;
                            }
                            else {
                                X509Certificate x509Certificate0 = this.s("nearby_sharing_paired_key_alias_" + s7, v5);
                                if(x509Certificate0 == null) {
                                    dcvz.a.b().h("Failed to create private certificate because it failed to create the certificate with alias %s.", "nearby_sharing_paired_key_alias_" + s7);
                                    v8 = v5;
                                    v9 = v6;
                                    dbwu2 = null;
                                }
                                else {
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dbwu.a).v_newBuilder();
                                    v8 = v5;
                                    ByteString hfsf0 = ByteString.copyFrom(arr_b2);
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp0.b_message;
                                    v9 = v6;
                                    ((dbwu)hftv0).b |= 1;
                                    ((dbwu)hftv0).c = hfsf0;
                                    if(!hftv0.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dbwu dbwu3 = (dbwu)hftp0.b_message;
                                    dbwu3.b |= 2;
                                    dbwu3.d = "nearby_sharing_paired_key_alias_" + s7;
                                    long v10 = x509Certificate0.getNotBefore().getTime();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dbwu dbwu4 = (dbwu)hftp0.b_message;
                                    dbwu4.b |= 8;
                                    dbwu4.f = v10;
                                    long v11 = x509Certificate0.getNotAfter().getTime();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dbwu dbwu5 = (dbwu)hftp0.b_message;
                                    dbwu5.b |= 16;
                                    dbwu5.g = v11;
                                    ByteString hfsf1 = ByteString.copyFrom(arr_b1);
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dbwu dbwu6 = (dbwu)hftp0.b_message;
                                    dbwu6.b |= 4;
                                    dbwu6.e = hfsf1;
                                    ByteString hfsf2 = ByteString.copyFrom(this.K(14));
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp0.b_message;
                                    ((dbwu)hftv1).b |= 0x20;
                                    ((dbwu)hftv1).i = hfsf2;
                                    if(!hftv1.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp0.b_message;
                                    ((dbwu)hftv2).b |= 0x40;
                                    ((dbwu)hftv2).j = s2;
                                    if(!hftv2.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv3 = hftp0.b_message;
                                    ((dbwu)hftv3).b |= 0x80;
                                    ((dbwu)hftv3).k = s3;
                                    if(!hftv3.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv4 = hftp0.b_message;
                                    ((dbwu)hftv4).b |= 0x100;
                                    ((dbwu)hftv4).l = s4;
                                    if(!hftv4.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv5 = hftp0.b_message;
                                    ((dbwu)hftv5).b |= 0x4000;
                                    ((dbwu)hftv5).r = s6;
                                    if(!hftv5.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv6 = hftp0.b_message;
                                    ((dbwu)hftv6).b |= 0x400;
                                    ((dbwu)hftv6).n = s5;
                                    if(!hftv6.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    dbwu dbwu7 = (dbwu)hftp0.b_message;
                                    dbwu7.b |= 0x800;
                                    dbwu7.o = v7;
                                    ByteString hfsf3 = ByteString.copyFrom(arr_b2);
                                    int v12 = hvqn.v() ? cumz.a(this.a) : daux.a(this.a);
                                    int v13 = cumz.j(this.a) ? 3 : 4;
                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)heap.a).v_newBuilder();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((heap)hftp1.b_message).d = s2;
                                    heaq heaq0 = dava.a(v12);
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    heap heap0 = (heap)hftp1.b_message;
                                    heap0.c = heaq0.a();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv7 = hftp1.b_message;
                                    ((heap)hftv7).f = v13 - 2;
                                    if(!hftv7.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((heap)hftp1.b_message).g = hfsf3;
                                    if(hvqn.U()) {
                                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)heaw.a).v_newBuilder();
                                        hear hear0 = hear.c;
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        heaw heaw0 = (heaw)hftp2.b_message;
                                        heaw0.b = hear0.a();
                                        if(!hftp2.b_message.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        ((heaw)hftp2.b_message).c = "com.google.gms.nearby.sharing";
                                        heaw heaw1 = (heaw)hftp2.N_build();
                                        if(!hftp1.b_message.isImmutable()) {
                                            hftp1.ensureMutable();
                                        }
                                        heap heap1 = (heap)hftp1.b_message;
                                        heaw1.getClass();
                                        heap1.j = heaw1;
                                        heap1.b |= 1;
                                    }
                                    String s8 = gfta.b(Build.MANUFACTURER);
                                    String s9 = gfta.b(Build.MODEL);
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv8 = hftp1.b_message;
                                    ((heap)hftv8).i = s8;
                                    if(!hftv8.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((heap)hftp1.b_message).h = s9;
                                    Pair pair0 = dbad.c(System.currentTimeMillis(), ((heap)hftp1.N_build()), hear.c);
                                    if(pair0 == null) {
                                        dcvz.a.e().p("Failed to create local credential for Nearby Presence, this will disable social identity for clients of Nearby Presence.", new Object[0]);
                                    }
                                    else {
                                        heav heav0 = (heav)pair0.first;
                                        ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)heav0).jf(5, null);
                                        hftp3.X(((ProtoLiteMessage)heav0));
                                        long v14 = x509Certificate0.getNotBefore().getTime();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        ((heav)hftp3.b_message).d = v14;
                                        long v15 = x509Certificate0.getNotAfter().getTime();
                                        if(!hftp3.b_message.isImmutable()) {
                                            hftp3.ensureMutable();
                                        }
                                        ((heav)hftp3.b_message).e = v15;
                                        heav heav1 = (heav)hftp3.N_build();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        dbwu dbwu8 = (dbwu)hftp0.b_message;
                                        heav1.getClass();
                                        dbwu8.p = heav1;
                                        dbwu8.b |= 0x1000;
                                        heax heax0 = (heax)pair0.second;
                                        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)heax0).jf(5, null);
                                        hftp4.X(((ProtoLiteMessage)heax0));
                                        long v16 = x509Certificate0.getNotBefore().getTime();
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        ((heax)hftp4.b_message).c = v16;
                                        long v17 = x509Certificate0.getNotAfter().getTime();
                                        if(!hftp4.b_message.isImmutable()) {
                                            hftp4.ensureMutable();
                                        }
                                        ((heax)hftp4.b_message).d = v17;
                                        heax heax1 = (heax)hftp4.N_build();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        dbwu dbwu9 = (dbwu)hftp0.b_message;
                                        heax1.getClass();
                                        dbwu9.q = heax1;
                                        dbwu9.b |= 0x2000;
                                    }
                                    dcvz.a.b().p("Created a new private certificate.", new Object[0]);
                                    dbwu2 = (dbwu)hftp0.N_build();
                                }
                            }
                        }
                    }
                    else {
                        v8 = v5;
                        v9 = v6;
                        dcvz.a.b().p("Failed to create private certificate because we\'re missing device information.", new Object[0]);
                        dbwu2 = null;
                    }
                    if(dbwu2 == null) {
                        dcvz.a.e().h("Failed to create private certificate, because failed to create certificates for %s.", s1);
                        dbwu2 = null;
                    }
                    else if(!this.Y(account0, dbwu2, s1)) {
                        dcvz.a.b().h("Failed to create private certificate because it failed to save the certificate at disk %s", s1);
                        dbwu2 = null;
                    }
                    v5 = dbwu2 == null ? v8 : dbwu2.g;
                    v6 = v9 + 1;
                    gged1 = gged1;
                    v3 = v3;
                    v4 = v4;
                    z = true;
                }
                Iterator iterator2 = this.v(account0, s1).iterator();
            label_258:
                if(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    dbwu dbwu10 = (dbwu)object2;
                    long v18 = System.currentTimeMillis();
                    if(dbwu10.f <= v18 && !dgan.V(dbwu10, v18)) {
                        map0.put(s1, dbwu10);
                        ++v4;
                        v2 = v2;
                        gged1 = gged1;
                        v3 = v3;
                        continue;
                    }
                    else {
                        goto label_258;
                    }
                }
                dcvz.a.e().p("Failed to generate valid private certificates.", new Object[0]);
                this.A(account0);
                if(!hvqz.a.b().bb() && this.e != 0 && (this.b.l(account0) == null || this.b.j(account0) == null)) {
                    this.E(new dgak(this, account0, dcpv0));
                }
                map0.clear();
                return map0;
            }
            if(z) {
                this.E(new dgal(this, account0, dcpv0));
            }
            return map0;
        }
        return new bxd();
    }

    final void y() {
        dizg.l(this.a, new String[]{"nearby_sharing_public_certificate_book", "nearby_sharing_private_certificate_book", "nearby_sharing_private_certificate_file_for_self", "nearby_sharing_private_certificate_file_for_all_contacts", "nearby_sharing_private_certificate_file_for_selected_contacts"});
    }

    final void z() {
        synchronized(this) {
            Account account0 = this.b.c();
            if(account0 == null) {
                return;
            }
            this.A(account0);
        }
    }
}

