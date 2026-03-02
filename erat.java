import android.accounts.Account;
import android.app.backup.BackupManager;
import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.chimera.modules.smartdevice.AppContextProvider;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

public final class erat {
    public static final baun a;
    public static final BackupManager b;
    public static final aqee c;
    public final Account d;
    public final ajzg e;
    public gmls f;
    public KeyPair g;
    public int h;
    public int i;
    public static final azts j;

    static {
        erat.a = new erqc(new String[]{"LskfValidationManager"});
        erat.b = new BackupManager(AppContextProvider.a());
        erat.c = new aqee(AppContextProvider.a());
        ajqo ajqo0 = new ajqo();
        ajqo0.a = "";
        ajqo0.f = 6;
        ajqp ajqp0 = ajqo0.a();
        erat.j = new azts(AppContextProvider.a(), ajqp0);
    }

    public erat(Account account0, gmls gmls0, ajzg ajzg0, int v) {
        this.h = 0;
        this.d = account0;
        this.f = gmls0;
        this.e = ajzg0;
        this.i = v;
    }

    public static int a(int v, int v1) {
        return Math.min(((int)hyis.g()) - v1, ((int)hyis.a.k().u()) - v);
    }

    public final JSONObject b() {
        ByteString hfsf0 = this.f.e;
        hftc hftc0 = hftc.a();
        hfsl hfsl0 = hfsf0.k();
        ProtoLiteMessage hftv0 = ((ProtoLiteMessage)aktv.a).x_newMutableInstance();
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hftv0);
        }
        catch(hfur hfur0) {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        }
        catch(hfwr hfwr0) {
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        }
        catch(IOException iOException0) {
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            hfsl0.z(0);
        }
        catch(hfur hfur3) {
            hfur3.a = hftv0;
            throw hfur3;
        }
        ProtoLiteMessage.P_makeImmutable(hftv0);
        aktu aktu0 = aktu.b(((aktv)hftv0).c);
        if(aktu0 == null) {
            aktu0 = aktu.a;
        }
        try {
            this.g = gqpc.a();
        }
        catch(NoSuchAlgorithmException unused_ex) {
            erat.a.m("Failed to generate keyPair.", new Object[0]);
            throw new eras(7);
        }
        if(this.i <= 0) {
            throw new eras(10);
        }
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("lskf_type", aktu0.e);
        KeyPair keyPair0 = this.g;
        batl.s(keyPair0);
        jSONObject0.put("encoded_public_key", bbmu.a(gqpc.f(keyPair0.getPublic())));
        jSONObject0.put("remaining_attempts", this.i);
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.put("lskf_details", jSONObject0);
        return jSONObject1;
    }

    public static gmls c(Account account0, azts azts0) {
        gmls gmls0;
        long v = bbmq.f(AppContextProvider.a());
        if(Long.compare(v, 0L) != 0) {
            try {
                String s = account0.name;
                azzc azzc0 = new azzc();
                azzc0.a = new ajuj(azts0, s);
                azzc0.c = new Feature[]{amjz.c};
                azzc0.d = 0x669;
                List list0 = (List)evrg.o(azts0.iG(azzc0.a()), hygl.c(), TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException executionException0) {
                erat.a.n("listVaults() failed.", executionException0, new Object[0]);
                throw (executionException0.getCause() instanceof aztb) ? new eras(executionException0.getCause()) : new eras(6);
            }
            catch(InterruptedException interruptedException0) {
                erat.a.n("listVaults() failed.", interruptedException0, new Object[0]);
                throw new eras(15);
            }
            catch(TimeoutException timeoutException0) {
                erat.a.n("listVaults() failed.", timeoutException0, new Object[0]);
                throw new eras(16);
            }
            for(Object object0: list0) {
                byte[] arr_b = (byte[])object0;
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gmls.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gmls0 = (gmls)hftv0;
                }
                catch(hfur hfur0) {
                    erat.a.e("Vault could not be parsed.", hfur0, new Object[0]);
                    continue;
                }
                if(erat.e(gmls0) == v) {
                    return gmls0;
                }
            }
            erat.a.m("No backups of device found.", new Object[0]);
            throw new eras(14);
        }
        erat.a.m("Failed to get Android ID. Cannot get vault for device.", new Object[0]);
        throw new eras(13);
    }

    public final byte[] d(byte[] arr_b, azts azts0) {
        RecoveryRequest recoveryRequest0 = new RecoveryRequest();
        recoveryRequest0.a = this.d.name;
        recoveryRequest0.c = arr_b;
        recoveryRequest0.e = this.f.h.toByteArray();
        recoveryRequest0.d = (this.f.d == null ? gmlt.a : this.f.d).toBytesArray();
        recoveryRequest0.f = this.f.e.toByteArray();
        try {
            azzc azzc0 = new azzc();
            azzc0.a = new ajuc(azts0, recoveryRequest0);
            azzc0.c = new Feature[]{amjz.g};
            azzc0.d = 0x682;
            return (byte[])evrg.o(azts0.iG(azzc0.a()), hygl.c(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            erat.a.n("generateOpenVaultRequest() failed.", exception0, new Object[0]);
            return null;
        }
    }

    private static long e(gmls gmls0) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap((gmls0.d == null ? gmlt.a : gmls0.d).e.toByteArray()).order(ByteOrder.LITTLE_ENDIAN);
        try {
            return byteBuffer0.getLong(9);
        }
        catch(BufferUnderflowException bufferUnderflowException0) {
            erat.a.n("Error extracting Android Id from vault. Returning -1.", bufferUnderflowException0, new Object[0]);
            return -1L;
        }
    }
}

