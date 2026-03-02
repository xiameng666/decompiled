import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.wearable.node.A2AEncryption.PairingReceiver;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;

public final class fdpd {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public hhsq d;
    public final fdpc e;
    public final fdzn f;
    private static final byte[] g;
    private boolean h;

    static {
        fdpd.a = new byte[]{67, 0x4F, 78, 70, 73, 82, 77};
        fdpd.b = new byte[]{67, 76, 73, 69, 78, 84};
        fdpd.c = new byte[]{83, 69, 82, 86, 69, 82};
        fdpd.g = new byte[]{82, 69, 83, 85, 77, 69};
    }

    public fdpd(fdpc fdpc0, fdzn fdzn0) {
        this.e = fdpc0;
        this.f = fdzn0;
    }

    public final void a(byte[] arr_b) {
        ffau ffau0 = fdpd.j(arr_b, null, 0);
        this.e.b(ffau0, this);
    }

    public final boolean b(Context context0, boolean z, Intent intent0) {
        try {
            this.d = null;
            this.h = false;
            hhtx hhtx0 = new hhtx(1, hhtv.a);
            Log.i("A2AEncryption", "sending init");
            ffau ffau0 = fdpd.j(hhtx0.d(), Boolean.valueOf(true), (z ? 2 : 3));
            this.e.b(ffau0, this);
            Log.i("A2AEncryption", "reading response");
            ffau ffau1 = this.e.a(this);
            byte[] arr_b = fdpd.f(ffau1);
            feys feys0 = ffau1.g == null ? feys.a : ffau1.g;
            switch((feyr.a(feys0.f) == 0 ? 1 : feyr.a(feys0.f))) {
                case 2: {
                    this.h = true;
                    z = z;
                    break;
                }
                case 3: {
                    this.h = true;
                    z = false;
                }
            }
            if(arr_b == null) {
                Log.e("A2AEncryption", "Missing crypto negotiation response");
            }
            else {
                hhtx0.b(arr_b);
            }
            Log.i("A2AEncryption", "sending final");
            this.a(hhtx0.d());
            String s = Base64.encodeToString(hhtx0.e(16), 3);
            if(!z && context0 != null) {
                intent0.putExtra("code", s);
                Log.i("A2AEncryption", "Asking user to approve");
                Intent intent1 = new Intent("com.google.android.clockwork.A2APairing");
                intent1.setComponent(new ComponentName("com.google.android.apps.wearable.settings", "com.google.android.clockwork.settings.A2ABroadcastReceiver"));
                intent1.putExtra("code", s);
                intent1.addFlags(0x10000000);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("com.google.android.clockwork.A2AReject");
                intentFilter0.addAction("com.google.android.clockwork.A2AAccept");
                Semaphore semaphore0 = new Semaphore(0);
                A2AEncryption.PairingReceiver a2AEncryption$PairingReceiver0 = new A2AEncryption.PairingReceiver(semaphore0, s);
                jwe.b(context0, a2AEncryption$PairingReceiver0, intentFilter0, 2);
                Intent intent2 = new Intent("com.google.android.clockwork.A2AAccept");
                intent2.putExtra("code", s);
                intent2.setPackage("com.google.android.gms");
                Intent intent3 = new Intent("com.google.android.clockwork.A2AReject");
                intent3.putExtra("code", s);
                intent3.setPackage("com.google.android.gms");
                intent1.putExtra("accept", PendingIntent.getBroadcast(context0, 0, intent2, 0x12000000));
                intent1.putExtra("reject", PendingIntent.getBroadcast(context0, 0, intent3, 0x12000000));
                context0.sendBroadcast(intent1);
                try {
                    try {
                        if(!semaphore0.tryAcquire(30L, TimeUnit.SECONDS)) {
                            Log.i("A2AEncryption", "Approval timed out");
                            goto label_54;
                        }
                        goto label_56;
                    }
                    catch(InterruptedException unused_ex) {
                        Log.e("A2AEncryption", "Interrupted exception in userApprovesOfCode()");
                    }
                }
                catch(Throwable throwable0) {
                    context0.unregisterReceiver(a2AEncryption$PairingReceiver0);
                    throw throwable0;
                }
            label_54:
                context0.unregisterReceiver(a2AEncryption$PairingReceiver0);
                return false;
            label_56:
                context0.unregisterReceiver(a2AEncryption$PairingReceiver0);
                if(!a2AEncryption$PairingReceiver0.a.booleanValue()) {
                    return false;
                }
            }
            hhtx0.c();
            hhsq hhsq0 = hhtx0.a();
            this.d = hhsq0;
            if(hhsq0 == null) {
                Log.e("A2AEncryption", "toConnectionContext() returned null session");
            }
        }
        catch(hhtu | hhti unused_ex) {
            Log.e("A2AEncryption", "Alert or handshake exception establishing encryption");
            try {
                this.a(new byte[0]);
            }
            catch(IOException unused_ex) {
            }
        }
        catch(IOException iOException0) {
            Log.e("A2AEncryption", "IOException during encryption " + iOException0.toString());
        }
        return z;
    }

    static boolean c(byte[] arr_b, hhsq hhsq0, hhsq hhsq1, byte[] arr_b1) {
        if(arr_b.length != 0x20) {
            Log.e("A2AEncryption", "failing because digest.length is " + arr_b.length);
            return false;
        }
        return MessageDigest.isEqual(arr_b, fdpd.d(hhsq0, hhsq1, arr_b1));
    }

    static byte[] d(hhsq hhsq0, hhsq hhsq1, byte[] arr_b) {
        try {
            byte[] arr_b1 = hhsq0.l();
            byte[] arr_b2 = hhsq1.l();
            if(arr_b1 == null && arr_b2 == null) {
                arr_b1 = new byte[0];
            }
            else if(arr_b1 == null) {
                arr_b1 = arr_b2;
            }
            else if(arr_b2 != null) {
                byte[] arr_b3 = new byte[arr_b1.length + arr_b2.length];
                System.arraycopy(arr_b1, 0, arr_b3, 0, arr_b1.length);
                System.arraycopy(arr_b2, 0, arr_b3, arr_b1.length, arr_b2.length);
                arr_b1 = arr_b3;
            }
            return hhur.k(new SecretKeySpec(arr_b1, ""), fdpd.g, arr_b);
        }
        catch(NoSuchAlgorithmException | InvalidKeyException exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public final byte[] e(byte[] arr_b) {
        hhsq hhsq0 = this.d;
        if(hhsq0 != null) {
            try {
                return hhsq0.j(arr_b);
            }
            catch(SignatureException signatureException0) {
                throw new IOException(signatureException0);
            }
        }
        throw new IllegalStateException("D2DConnectionContext session is null.");
    }

    public static byte[] f(ffau ffau0) {
        return (ffau0.b & 16) == 0 ? null : (ffau0.g == null ? feys.a : ffau0.g).c.toByteArray();
    }

    public final byte[] g() {
        byte[] arr_b = fdpd.f(this.e.a(this));
        if(arr_b != null) {
            return arr_b;
        }
        throw new IOException("Missing crypto negotiation response");
    }

    public static final void h(Context context0, Intent intent0, boolean z) {
        if(intent0.getStringExtra("code") == null) {
            return;
        }
        if(Log.isLoggable("A2AEncryption", 4)) {
            Log.i("A2AEncryption", "Sending A2A result: " + z);
        }
        intent0.addFlags(0x10000000);
        intent0.putExtra("success", z);
        intent0.setComponent(new ComponentName("com.google.android.apps.wearable.settings", "com.google.android.clockwork.settings.A2ABroadcastReceiver"));
        context0.sendBroadcast(intent0);
    }

    public final void i(String s) {
        if(this.h) {
            this.a(new byte[0]);
        }
        Log.e("A2AEncryption", s);
    }

    public static ffau j(byte[] arr_b, Boolean boolean0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffau.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feys.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        feys feys0 = (feys)hftp1.b_message;
        feys0.b |= 1;
        feys0.c = hfsf0;
        if(boolean0 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            feys feys1 = (feys)hftp1.b_message;
            feys1.b |= 4;
            feys1.e = true;
        }
        if(v != 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((feys)hftp1.b_message).f = v - 1;
            ((feys)hftp1.b_message).b |= 8;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffau ffau0 = (ffau)hftp0.b_message;
        feys feys2 = (feys)hftp1.N_build();
        feys2.getClass();
        ffau0.g = feys2;
        ffau0.b |= 16;
        return (ffau)hftp0.N_build();
    }
}

