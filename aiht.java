import android.accounts.Account;
import android.content.Context;
import android.os.Build.VERSION;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.authzen.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.ToggleEasyUnlockRequestEntity;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aiht extends aihu {
    private final boolean a;
    private final Account b;
    private static final baun c;
    private final aijl d;

    static {
        aiht.c = new baun(new String[]{"ChangeEasyUnlockStateOperation"});
    }

    public aiht(aijl aijl0, Account account0, boolean z) {
        super("ChangeEasyUnlockState");
        this.b = account0;
        batl.s(aijl0);
        this.d = aijl0;
        this.a = z;
    }

    @Override  // aihu
    protected final void b(Context context0) {
        boolean z;
        HashSet hashSet0 = new HashSet();
        hashSet0.add(Integer.valueOf(4));
        String s = this.c(context0);
        hashSet0.add(Integer.valueOf(7));
        aijb aijb0 = new aijb();
        aijb0.b(((long)Build.VERSION.SDK_INT));
        aijb0.c("com.google.android.gms");
        aijb0.d();
        aijb0.e();
        aijc aijc0 = aijb0.a();
        hashSet0.add(Integer.valueOf(3));
        ToggleEasyUnlockRequestEntity toggleEasyUnlockRequestEntity0 = new ToggleEasyUnlockRequestEntity(hashSet0, false, ((DeviceClassifierEntity)aijc0), this.a, null, false, s);
        try {
            String s1 = this.b.name;
            baqr baqr0 = new baqr(context0.getApplicationInfo().uid, s1, s1, "com.google.android.gms", "com.google.android.gms");
            baqr0.l(hpqx.d());
            z = true;
            new bbey(context0, hpra.c(), "cryptauth/v1/", false, null, null, 0x1002).o(baqr0, 1, "deviceSync/toggleeasyunlock", toggleEasyUnlockRequestEntity0);
        }
        catch(acse | VolleyError exception0) {
            z = false;
            aiht.c.g("Failed to make the API call to change EasyUnlock state.", exception0, new Object[0]);
        }
        this.d.a(z);
    }

    private final String c(Context context0) {
        try {
            return bbmu.b(aihk.b(context0, this.b).b);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new cjuh(8, exception0.getMessage());
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.a(false);
    }
}

