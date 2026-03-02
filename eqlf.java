import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class eqlf {
    private static final erqc a;
    private final Context b;
    private final adlb c;
    private final DevicePolicyManager d;

    static {
        eqlf.a = new erqc(new String[]{"ManagedAccountHelper"});
    }

    public eqlf(Context context0) {
        new ajnv(context0.getApplicationContext());
        DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getApplicationContext().getSystemService("device_policy");
        admk admk0 = new admk(context0.getApplicationContext());
        super();
        this.b = context0.getApplicationContext();
        this.d = devicePolicyManager0;
        this.c = admk0;
    }

    public final Intent a(Account account0, Bundle bundle0, ManagedAuthOptions managedAuthOptions0) {
        Bundle bundle1 = managedAuthOptions0.a();
        if(managedAuthOptions0.b == 1) {
            bundle1.putBoolean("smartdevice.do_active", true);
        }
        boolean z = bbmq.T();
        boolean z1 = bbmn.w(this.b, account0.name);
        boolean z2 = eqsh.s(this.b);
        Intent intent0 = bags.d(this.b, account0, true, false, bundle0, false, "com.google.android.gms", z, null, z1, 2, bundle1, false, z2);
        if(intent0 == null) {
            eqlf.a.m("Failed to resolve device management intent", new Object[0]);
        }
        return intent0;
    }

    public final boolean b() {
        return this.d != null && this.d.getDeviceOwner() != null;
    }

    public final boolean c(Account account0) {
        DeviceManagementInfoResponse deviceManagementInfoResponse0;
        boolean z = false;
        eqlf.a.d("Use AccountDataServiceClient.", new Object[0]);
        evql evql0 = this.c.b(account0);
        try {
            deviceManagementInfoResponse0 = (DeviceManagementInfoResponse)evrg.o(evql0, hygl.a.d().b(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            Exception exception1 = evql0.i();
            if((exception1 instanceof aztb)) {
                int v = ((aztb)exception1).b();
                eqlf.a.m("getDeviceManagementInfo status: " + v, new Object[0]);
            }
            eqlf.a.l(exception0);
            deviceManagementInfoResponse0 = null;
        }
        if(deviceManagementInfoResponse0 != null && !TextUtils.isEmpty(deviceManagementInfoResponse0.b)) {
            z = true;
        }
        eqlf.a.j("isManagedAccount(%s) = %s", new Object[]{account0, Boolean.valueOf(z)});
        return z;
    }
}

