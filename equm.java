import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class equm {
    public static final baun a;
    static final byte[] b;
    public final ereg c;
    public eqxa d;
    public final Context e;
    public ServiceConnection f;
    public final HashMap g;
    hhtx h;
    private final epze i;
    private final int j;
    private final eqlr k;

    static {
        equm.a = new erqc(new String[]{"PostSetup", "PostSetupManager"});
        equm.b = "smartdevice.postsetup.key".getBytes(Charset.forName("UTF-8"));
    }

    public equm(Context context0, int v, eqlr eqlr0) {
        eqrm eqrm0 = new eqrm(context0);
        super();
        this.g = new HashMap();
        this.i = eqrm0;
        this.j = v;
        this.k = eqlr0;
        if(v == 100) {
            eqlr0.d(7);
        }
        else {
            eqlr0.d(6);
        }
        this.e = context0;
        this.c = new ereg(context0);
    }

    public final void a(eqvw eqvw0) {
        epze epze0 = this.i;
        cjpc cjpc0 = ((eqrm)epze0).b;
        long v = epze0.a();
        String s = cjpd.c(cjpc0, "os_migration_session_id", null);
        ConnectionHint connectionHint0 = new ConnectionHint();
        if(v != 0L) {
            connectionHint0.b = Long.toString(v);
            Set set0 = connectionHint0.a;
            set0.add(Integer.valueOf(2));
            byte[] arr_b = epze0.d();
            String s1 = cjpd.c(cjpc0, "wifi_direct_address", null);
            String s2 = cjpd.c(cjpc0, "pkg_name", null);
            String s3 = cjpd.c(cjpc0, "pkg_version", null);
            String s4 = cjpd.c(cjpc0, "target_bt_address", null);
            byte[] arr_b1 = s4 == null ? null : bbmu.f(s4);
            if(arr_b != null) {
                connectionHint0.c = arr_b;
                set0.add(Integer.valueOf(3));
            }
            if(s1 != null) {
                connectionHint0.d = s1;
                set0.add(Integer.valueOf(4));
            }
            if(s2 != null) {
                connectionHint0.e = s2;
                set0.add(Integer.valueOf(5));
            }
            if(s3 != null) {
                connectionHint0.f = s3;
                set0.add(Integer.valueOf(6));
            }
            if(arr_b1 != null) {
                connectionHint0.g = arr_b1;
                set0.add(Integer.valueOf(7));
            }
            int v1 = cjpd.a(cjpc0, "user_verification_status", 0);
            eqrm.a.d("Got UserVerificationStatus: %d", new Object[]{v1});
            connectionHint0.h = v1;
            set0.add(Integer.valueOf(8));
            this.k.c(v);
        }
        if(!TextUtils.isEmpty(s)) {
            String s5 = cjpd.c(cjpc0, "os_migration_password", null);
            connectionHint0.i = s;
            Set set1 = connectionHint0.a;
            set1.add(Integer.valueOf(9));
            if(s5 != null) {
                connectionHint0.j = s5;
                set1.add(Integer.valueOf(10));
            }
        }
        if(TextUtils.isEmpty(connectionHint0.b) && TextUtils.isEmpty(connectionHint0.i)) {
            this.o(eqvw0, new Status(10590), connectionHint0);
            return;
        }
        this.o(eqvw0, Status.b, connectionHint0);
    }

    final void b(Status status0, boolean z) {
        boolean z1 = status0.e();
        if(z1 && !z) {
            return;
        }
        eqlr eqlr0 = this.k;
        eqmf eqmf0 = eqlr0.a;
        eqmf0.b(z1);
        if(!status0.e()) {
            int v = status0.i;
            eqmf0.b(false);
            eqmf0.b.add(Integer.valueOf(v));
            gjna gjna0 = eqmf0.a;
            if(!gjna0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gjna0).ensureMutable();
            }
            gjnb gjnb0 = (gjnb)gjna0.b_message;
            gjnb0.b |= 2;
            gjnb0.d = v;
        }
        eqlr0.a();
    }

    public final void c(eqvw eqvw0, Status status0, Bundle bundle0) {
        equm.a.d("OnGetRestoreInformation called", new Object[0]);
        try {
            this.b(status0, false);
            eqvw0.f(status0, bundle0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }

    public final void d(eqvw eqvw0, String s, String s1, Status status0, StartServiceResponse startServiceResponse0) {
        equm.a.d("returnStartServiceOnSourceResult", new Object[0]);
        equm.a.d("onStartServiceOnSource called", new Object[0]);
        try {
            eqvw0.a(status0, startServiceResponse0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
        kau kau0 = new kau(s, s1);
        HashMap hashMap0 = this.g;
        ServiceConnection serviceConnection0 = (ServiceConnection)hashMap0.get(kau0);
        if(serviceConnection0 == null) {
            equm.a.m("Could not find service connection to unbind for package: %s and action: %s", new Object[]{s, s1});
            return;
        }
        bbic.a().b(this.e, serviceConnection0);
        hashMap0.remove(kau0);
    }

    public final void e(eqvw eqvw0, HandshakeData handshakeData0) {
        byte[] arr_b3;
        byte[] arr_b2;
        byte[] arr_b1;
        if(!this.k(200)) {
            this.n(eqvw0, new Status(10593), new PostSetupAuthData());
            return;
        }
        byte[] arr_b = this.i.d();
        if(arr_b == null) {
            equm.a.m("No shared secret stored on target device.", new Object[0]);
            this.n(eqvw0, new Status(10590), new PostSetupAuthData());
            return;
        }
        if(handshakeData0 == null) {
            arr_b1 = null;
        }
        else {
            try {
                arr_b1 = handshakeData0.b;
            label_12:
                if(arr_b1 != null) {
                    this.h.b(arr_b1);
                    goto label_18;
                }
                goto label_30;
            }
            catch(hhtu | hhti exception0) {
                goto label_16;
            }
        }
        goto label_12;
    label_16:
        eqvw eqvw1 = eqvw0;
        goto label_35;
        try {
        label_18:
            arr_b2 = this.h.e(0x20);
        }
        catch(hhti unused_ex) {
            this.n(eqvw0, new Status(0x2960), new PostSetupAuthData());
            return;
        }
        try {
            arr_b3 = equm.l(arr_b, arr_b2);
        }
        catch(IOException | IllegalArgumentException exception1) {
            equm.a.g("Error happened when generateCode. ", exception1, new Object[0]);
            this.n(eqvw0, new Status(13), new PostSetupAuthData());
            return;
        }
        this.j(handshakeData0, arr_b3, arr_b, eqvw0, 200);
        return;
        try {
        label_30:
            eqvw1 = eqvw0;
            equm.a.m("Handshake data is invalid for authenticate().", new Object[0]);
            this.n(eqvw1, new Status(13), new PostSetupAuthData());
            return;
        }
        catch(hhtu | hhti exception0) {
        }
    label_35:
        equm.a.l(exception0);
        this.n(eqvw1, new Status(0x2960), new PostSetupAuthData());
    }

    public final void f(eqvw eqvw0, HandshakeData handshakeData0) {
        byte[] arr_b1;
        try {
            this.h = new hhtx(4, hhtv.a);
            if(!this.k(200)) {
                this.p(eqvw0, new Status(10593), new HandshakeData());
                return;
            }
            byte[] arr_b = handshakeData0 == null ? null : handshakeData0.b;
            if(arr_b == null) {
                equm.a.m("Handshake data couldn\'t be null for sourceInit().", new Object[0]);
                this.p(eqvw0, new Status(13), new HandshakeData());
                return;
            }
            this.h.b(arr_b);
            arr_b1 = this.h.d();
        }
        catch(hhtu | hhti | IllegalStateException exception0) {
            equm.a.l(exception0);
            this.p(eqvw0, new Status(0x2960), new HandshakeData());
            return;
        }
        HandshakeData handshakeData1 = new HandshakeData(arr_b1);
        this.p(eqvw0, Status.b, handshakeData1);
    }

    public final void g(eqvw eqvw0, HandshakeData handshakeData0) {
        byte[] arr_b2;
        byte[] arr_b1;
        if(this.j == 100 && (this.h != null && this.h.f() == 3)) {
            byte[] arr_b = this.i.d();
            if(arr_b == null) {
                equm.a.m("No shared secret stored on target device.", new Object[0]);
                this.n(eqvw0, new Status(10590), new PostSetupAuthData());
                return;
            }
            if(handshakeData0 == null) {
                arr_b1 = null;
            }
            else {
                try {
                    arr_b1 = handshakeData0.b;
                label_10:
                    if(arr_b1 != null) {
                        arr_b2 = equm.l(arr_b, arr_b1);
                        goto label_16;
                    }
                    goto label_18;
                }
                catch(IOException | IllegalArgumentException exception0) {
                    goto label_14;
                }
            }
            goto label_10;
        label_14:
            eqvw eqvw1 = eqvw0;
            equm.a.g("Error happened when generateCode. ", exception0, new Object[0]);
            this.n(eqvw1, new Status(13), new PostSetupAuthData());
            return;
        label_16:
            this.j(handshakeData0, arr_b2, arr_b, eqvw0, 100);
            return;
            try {
            label_18:
                eqvw1 = eqvw0;
                equm.a.m("Handshake data is invalid for authenticate().", new Object[0]);
                this.n(eqvw1, new Status(13), new PostSetupAuthData());
                return;
            }
            catch(IOException | IllegalArgumentException exception0) {
            }
            equm.a.g("Error happened when generateCode. ", exception0, new Object[0]);
            this.n(eqvw1, new Status(13), new PostSetupAuthData());
            return;
        }
        this.n(eqvw0, new Status(10593), new PostSetupAuthData());
    }

    public final void h(eqvw eqvw0, HandshakeData handshakeData0) {
        byte[] arr_b4;
        byte[] arr_b3;
        byte[] arr_b2;
        byte[] arr_b1;
        if(!this.k(100)) {
            this.q(eqvw0, new Status(10593), new HandshakeData());
            return;
        }
        byte[] arr_b = this.i.d();
        if(arr_b == null) {
            equm.a.m("No shared secret stored on target device.", new Object[0]);
            this.q(eqvw0, new Status(10590), new HandshakeData());
            return;
        }
        if(handshakeData0 == null) {
            arr_b1 = null;
        }
        else {
            try {
                arr_b1 = handshakeData0.b;
            label_12:
                if(arr_b1 == null) {
                    equm.a.m("Handshake data couldn\'t be null for targetFinish().", new Object[0]);
                    this.q(eqvw0, new Status(13), new HandshakeData());
                    return;
                }
                this.h.b(arr_b1);
                arr_b2 = this.h.d();
                goto label_23;
            }
            catch(hhtu | hhti | IllegalStateException exception0) {
            }
            equm.a.l(exception0);
            this.q(eqvw0, new Status(0x2960), new HandshakeData());
            return;
        }
        goto label_12;
        try {
        label_23:
            arr_b3 = this.h.e(0x20);
        }
        catch(hhti unused_ex) {
            this.q(eqvw0, new Status(0x2960), new HandshakeData());
            return;
        }
        try {
            arr_b4 = equm.l(arr_b, arr_b3);
        }
        catch(IOException | IllegalArgumentException exception1) {
            equm.a.g("Error getting HMAC.", exception1, new Object[0]);
            this.q(eqvw0, new Status(13), new HandshakeData());
            return;
        }
        HandshakeData handshakeData1 = new HandshakeData(arr_b2, arr_b4);
        this.q(eqvw0, Status.b, handshakeData1);
    }

    public final void i(eqvw eqvw0) {
        byte[] arr_b;
        try {
            this.h = new hhtx(1, hhtv.a);
            if(!this.k(100)) {
                this.r(eqvw0, new Status(10593), new HandshakeData());
                return;
            }
            arr_b = this.h.d();
        }
        catch(hhti unused_ex) {
            this.r(eqvw0, new Status(0x2960), new HandshakeData());
            return;
        }
        HandshakeData handshakeData0 = new HandshakeData(arr_b);
        this.r(eqvw0, Status.b, handshakeData0);
    }

    final void j(HandshakeData handshakeData0, byte[] arr_b, byte[] arr_b1, eqvw eqvw0, int v) {
        byte[] arr_b3;
        if(handshakeData0.c != null && MessageDigest.isEqual(handshakeData0.c, arr_b)) {
            this.h.c();
            try {
                byte[] arr_b2 = this.h.a().l();
                try {
                    arr_b3 = hhur.k(new SecretKeySpec(arr_b2, "HmacSHA256"), arr_b1, equm.b);
                }
                catch(Exception exception1) {
                    throw new IOException(exception1);
                }
                PostSetupAuthData postSetupAuthData0 = new PostSetupAuthData(arr_b3);
                if(v == 200) {
                    byte[] arr_b4 = new byte[0x20];
                    new SecureRandom().nextBytes(arr_b4);
                    postSetupAuthData0.c = new HandshakeData(arr_b4, equm.l(arr_b1, arr_b4));
                    postSetupAuthData0.a.add(Integer.valueOf(3));
                }
                this.n(eqvw0, Status.b, postSetupAuthData0);
            }
            catch(hhti | NoSuchAlgorithmException | IOException exception0) {
                equm.a.n("Error getting a symmetric key from ukey2Handshake. ", exception0, new Object[0]);
                this.n(eqvw0, new Status(0x2960), new PostSetupAuthData());
            }
            equm.a.d("Post authentication succeed. ", new Object[0]);
            return;
        }
        this.n(eqvw0, new Status(0x295F), new PostSetupAuthData());
        equm.a.m("HMAC on two devices don\'t match. ", new Object[0]);
    }

    final boolean k(int v) {
        if(this.j != v) {
            equm.a.m("Device is not in the right Role.", new Object[0]);
            return false;
        }
        if(this.h != null && this.h.f() == 1) {
            return true;
        }
        equm.a.m("Handshake is not started yet", new Object[0]);
        return false;
    }

    public static byte[] l(byte[] arr_b, byte[] arr_b1) {
        if(arr_b1 == null) {
            throw new IllegalArgumentException("Missing argument, message.");
        }
        Mac mac0 = bbmq.C("HmacSHA256");
        if(mac0 != null) {
            try {
                mac0.init(new SecretKeySpec(arr_b, "HmacSHA256"));
                return mac0.doFinal(arr_b1);
            }
            catch(InvalidKeyException invalidKeyException0) {
                equm.a.l(invalidKeyException0);
                throw new IOException("Invalid key.", invalidKeyException0);
            }
        }
        throw new IOException("Failed to get Mac.");
    }

    public static final void m(eqvw eqvw0, Status status0) {
        equm.a.d("onCleanRestoreInformationResult called", new Object[0]);
        try {
            eqvw0.b(status0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }

    private final void n(eqvw eqvw0, Status status0, PostSetupAuthData postSetupAuthData0) {
        try {
            this.b(status0, true);
            eqvw0.e(status0, postSetupAuthData0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }

    private final void o(eqvw eqvw0, Status status0, ConnectionHint connectionHint0) {
        try {
            this.b(status0, false);
            eqvw0.c(status0, connectionHint0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }

    private final void p(eqvw eqvw0, Status status0, HandshakeData handshakeData0) {
        try {
            this.b(status0, false);
            eqvw0.d(status0, handshakeData0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }

    private final void q(eqvw eqvw0, Status status0, HandshakeData handshakeData0) {
        try {
            this.b(status0, false);
            eqvw0.h(status0, handshakeData0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }

    private final void r(eqvw eqvw0, Status status0, HandshakeData handshakeData0) {
        try {
            this.b(status0, false);
            eqvw0.i(status0, handshakeData0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
    }
}

