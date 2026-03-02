import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Lock;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class aige {
    public static final baun a;
    static final Charset b;
    public final aima c;
    public final aigf d;
    public final Object e;
    private static WeakReference f;
    private final SecureRandom g;
    private boolean h;
    private long i;

    static {
        aige.a = new baun("GLSUser", new String[]{"AppCertManager"});
        aige.b = Charset.forName("UTF-8");
        aige.f = new WeakReference(null);
    }

    public aige(aima aima0, aigf aigf0) {
        this.c = aima0;
        this.d = aigf0;
        this.g = new SecureRandom();
        this.e = new Object();
        this.h = false;
        this.i = 0L;
    }

    public static aige a(Context context0) {
        aige aige0;
        synchronized(aige.class) {
            aige0 = (aige)aige.f.get();
            if(aige0 == null) {
                aige aige1 = new aige(new aima(context0), aigf.a(context0));
                aige.f = new WeakReference(aige1);
                return aige1;
            }
        }
        return aige0;
    }

    public final boolean b() {
        FileOutputStream fileOutputStream0;
        hkww hkww1;
        if(!hpfi.m()) {
            aige.a.f("DeviceKey is turned off", new Object[0]);
            return false;
        }
        synchronized(this.e) {
            long v1 = SystemClock.elapsedRealtime();
            long v2 = hpfi.a.i().h() * 1000L;
            if(v1 - this.i < v2) {
                return this.h;
            }
            this.i = v1;
            long v3 = this.g.nextLong();
            aima aima0 = this.c;
            Context context0 = aima0.b;
            long v4 = bbmq.d(context0);
            if(fgff.a(context0)) {
                aige.a.h("Google Services were not accepted. Not requesting device key.", new Object[0]);
                this.h = false;
                return false;
            }
            HashMap hashMap0 = new HashMap();
            hashMap0.put("dg_androidId", Long.toHexString(v4));
            hashMap0.put("dg_session", Long.toHexString(v3));
            hashMap0.put("dg_gmsCoreVersion", "253434029");
            hashMap0.put("dg_sdkVersion", String.valueOf(Build.VERSION.SDK_INT));
            String s = ((adcz)adcz.c.b()).b("devicekey", hashMap0);
            hkww hkww0 = null;
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
                ghom ghom0 = ghom.ac;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ghon)hftp0.b_message).e = ghom0.av;
                ((ghon)hftp0.b_message).b |= 1;
                adga.t(((ghon)hftp0.N_build()), 1002);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkwx.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hkwx)hftv0).b |= 2;
                ((hkwx)hftv0).d = v4;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((hkwx)hftv1).b |= 4;
                ((hkwx)hftv1).e = v3;
                if(s != null) {
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hkwx hkwx0 = (hkwx)hftp1.b_message;
                    hkwx0.b |= 1;
                    hkwx0.c = s;
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hkwx hkwx1 = (hkwx)hftp1.b_message;
                hkwx1.b |= 0x20;
                hkwx1.g = "missing_token";
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hkxd.a).v_newBuilder();
                int v5 = Build.VERSION.SDK_INT;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((hkxd)hftv2).b |= 1;
                ((hkxd)hftv2).c = v5;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hkxd hkxd0 = (hkxd)hftp2.b_message;
                hkxd0.b |= 2;
                hkxd0.d = 0xF1B18AD;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hkwx hkwx2 = (hkwx)hftp1.b_message;
                hkxd hkxd1 = (hkxd)hftp2.N_build();
                hkxd1.getClass();
                hkwx2.f = hkxd1;
                hkwx2.b |= 8;
                hkwx hkwx3 = (hkwx)hftp1.N_build();
                String s1 = aima0.b().e;
                String s2 = adkw.d() + "/devicekey";
                HashMap hashMap1 = new HashMap();
                hashMap1.put("Content-Type", "application/x-protobuf");
                baft.d(context0, hashMap1, s1, null, hkxq.d);
                hkww1 = (hkww)((glyq)aksq.c(hkxq.d, s2, ((ProtoLiteMessage)hkww.a), hashMap1, ((MessageLite)hkwx3), cjxx.b, cjxx.c)).u();
            }
            catch(ExecutionException | InterruptedException exception0) {
                goto label_92;
            }
            try {
                aige.d(2);
                goto label_95;
            }
            catch(ExecutionException | InterruptedException exception0) {
                hkww0 = hkww1;
            }
        label_92:
            aige.a.n("Exception while requesting key: ", exception0, new Object[0]);
            aige.d(3);
            hkww1 = hkww0;
        label_95:
            if(hkww1 != null) {
                try {
                    aigf aigf0 = this.d;
                    aigf.a.j("Storing device key...", new Object[0]);
                    Lock lock0 = aigf0.b.writeLock();
                    lock0.lock();
                    try {
                        fileOutputStream0 = aigf0.c.openFileOutput("device_key", 0);
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        throw new IOException("File could not be created to store device key.", fileNotFoundException0);
                    }
                    finally {
                        lock0.unlock();
                    }
                    try {
                        aigf0.d = hkww1;
                        hkww1.writeToStream(fileOutputStream0);
                    }
                    finally {
                        fileOutputStream0.close();
                    }
                    this.h = true;
                    return true;
                }
                catch(IOException iOException0) {
                    aige.a.n("Error storing key: ", iOException0, new Object[0]);
                }
            }
            this.h = false;
        }
        return false;
    }

    public final byte[] c(hkww hkww0, String s) {
        Mac mac0 = bbmq.C("HMACSHA256");
        if(mac0 != null) {
            try {
                mac0.init(new SecretKeySpec(hkww0.e.toByteArray(), "HMACSHA256"));
                return mac0.doFinal(s.getBytes(aige.b));
            }
            catch(InvalidKeyException invalidKeyException0) {
                aige.a.f("Invalid key.", new Object[0]);
                throw new IOException("Invalid key.", invalidKeyException0);
            }
        }
        aige.a.f("Failed to get Mac.", new Object[0]);
        throw new IOException("Failed to get Mac.");
    }

    private static final void d(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghud.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghud)hftv0).c = 1;
        ((ghud)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ghud)hftv1).e = v - 1;
        ((ghud)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghud)hftp0.b_message).d = 1;
        ((ghud)hftp0.b_message).b |= 2;
        ghud ghud0 = (ghud)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.ac;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((ghon)hftv2).e = ghom0.av;
        ((ghon)hftv2).b |= 1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghud0.getClass();
        ghon0.Z = ghud0;
        ghon0.c |= 0x4000000;
        adga.f(((ghon)hftp1.N_build()));
    }
}

