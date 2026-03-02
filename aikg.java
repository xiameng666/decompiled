import android.accounts.Account;
import android.os.Build.VERSION;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.UpdateDeviceInfoRequestEntity;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aikg {
    private final Account a;
    private final aiid b;
    private final aikh c;
    private final esaa d;
    private erzz e;
    private final aije f;
    private final aikd g;
    private static final baun h;

    static {
        aikg.h = new baun(new String[]{"Enroller"});
    }

    protected aikg(Account account0, aiid aiid0, aikh aikh0, esaa esaa0, aikd aikd0, bbey bbey0) {
        this.a = account0;
        this.b = aiid0;
        this.c = aikh0;
        this.d = esaa0;
        esaa0.j(false);
        this.g = aikd0;
        this.f = new aije(bbey0);
    }

    public final boolean a(int v, int v1) {
        byte[] arr_b1;
        String s;
        boolean z = hpqx.a.c().l();
        if(z) {
            this.e = this.d.a("update device info", 30000L);
        }
        else {
            this.d.c(30000L);
        }
        try {
            try {
                s = this.b.a(this.a, 2);
            }
            catch(acse unused_ex) {
                aikg.h.m("Credentials invalid. Update failed", new Object[0]);
                goto label_47;
            }
            if(s == null) {
                aikg.h.m("Could not get auth token. Update failed", new Object[0]);
                goto label_47;
            }
            hhpu hhpu0 = this.g.a();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhpu.a).w(((ProtoLiteMessage)hhpu0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhpu hhpu1 = (hhpu)hftp0.b_message;
            hhpu1.b |= 0x80000;
            hhpu1.u = s;
            hhpu hhpu2 = (hhpu)hftp0.N_build();
            try {
                byte[] arr_b = hhpu2.toBytesArray();
                arr_b1 = aihk.c(this.c.a, hhtt.h, arr_b, this.c.b);
            }
            catch(InvalidKeyException | NoSuchAlgorithmException | ExecutionException | InterruptedException | TimeoutException exception0) {
                aikg.h.g("error encrypting message", exception0, new Object[0]);
                goto label_47;
            }
            HashSet hashSet0 = new HashSet();
            hashSet0.add(Integer.valueOf(5));
            hashSet0.add(Integer.valueOf(4));
            hashSet0.add(Integer.valueOf(6));
            String s1 = bbmu.c(arr_b1);
            hashSet0.add(Integer.valueOf(3));
            aijb aijb0 = new aijb();
            aijb0.b(((long)Build.VERSION.SDK_INT));
            aijb0.c("com.google.android.gms");
            aijb0.d();
            aijb0.e();
            aijc aijc0 = aijb0.a();
            hashSet0.add(Integer.valueOf(2));
            try {
                baqr baqr0 = new baqr(this.c.a.getApplicationInfo().uid, this.c.b.name, this.c.b.name, "com.google.android.gms", "com.google.android.gms");
                baqr0.l(hpqx.d());
                baqr0.m("auth_token", s);
                UpdateDeviceInfoRequestEntity updateDeviceInfoRequestEntity0 = new UpdateDeviceInfoRequestEntity(hashSet0, ((DeviceClassifierEntity)aijc0), s1, v, "gcmV1", v1);
                this.f.a.o(baqr0, 1, "enrollment/updatedeviceinfo", updateDeviceInfoRequestEntity0);
                goto label_66;
            }
            catch(acse | VolleyError exception1) {
                aikg.h.g("error sending update to server", exception1, new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
    label_47:
        if(z) {
            erzz erzz0 = this.e;
            if(erzz0 != null) {
                erzz0.a();
                return false;
            }
        }
        else {
            esaa esaa0 = this.d;
            if(esaa0.l()) {
                esaa0.g();
            }
        }
        return false;
        try {
        label_57:
            if(z) {
                goto label_58;
            }
            else {
                goto label_62;
            }
            throw throwable0;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
    label_58:
        erzz erzz1 = this.e;
        if(erzz1 != null) {
            erzz1.a();
            throw throwable0;
        label_62:
            esaa esaa1 = this.d;
            if(esaa1.l()) {
                esaa1.g();
            }
        }
        throw throwable0;
    label_66:
        if(z) {
            erzz erzz2 = this.e;
            if(erzz2 != null) {
                erzz2.a();
                return true;
            }
        }
        else {
            esaa esaa2 = this.d;
            if(esaa2.l()) {
                esaa2.g();
            }
        }
        return true;
    }
}

