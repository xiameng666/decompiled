import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;

public final class snv extends wby implements IInterface {
    final rbx a;
    final Boolean b;
    final rbo c;

    public snv() {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
    }

    public snv(rbo rbo0, rbx rbx0, Boolean boolean0) {
        Objects.requireNonNull(rbo0);
        this.c = rbo0;
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
        this.a = rbx0;
        this.b = boolean0;
    }

    private final void a(rbx rbx0, rcm rcm0, int v, boolean z, String s) {
        rbo.o(this.c);
        rbx0.d(rcm0, v, s, z);
        rbx0.b(rcm0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            snv.gr(parcel0);
            if(bundle0 == null) {
                rdk.h("BillingClient", "Response bundle is null.");
                this.a(this.a, rcn.e, 0x83, this.b.booleanValue(), null);
                return true;
            }
            if(!bundle0.containsKey("RESPONSE_CODE")) {
                this.a(this.a, rcn.e, 0x8A, this.b.booleanValue(), null);
                return true;
            }
            if(bundle0.getInt("RESPONSE_CODE") != 0) {
                rcm rcm0 = rcn.a(bundle0.getInt("RESPONSE_CODE"), bundle0.getString("DEBUG_MESSAGE", ""));
                int v1 = bundle0.getInt("RESPONSE_CODE");
                this.a(this.a, rcm0, 0x8B, this.b.booleanValue(), "Response code from Phonesky: " + v1);
                return true;
            }
            if(!bundle0.containsKey("BILLING_API_VERSION_KEY")) {
                rdk.h("BillingClient", "Billing API version not found in response bundle.");
                this.a(this.a, rcn.e, 0x89, this.b.booleanValue(), null);
                return true;
            }
            int v2 = bundle0.getInt("BILLING_API_VERSION_KEY");
            this.c.i(v2);
            this.c.i = v2 >= 3;
            Bundle bundle1 = bundle0.getBundle("EXPERIMENT_VALUES_KEY");
            if(bundle1 != null) {
                try {
                    bundle1.getBoolean("DELEGATION_API_ENABLED_KEY");
                }
                catch(Throwable throwable0) {
                    rdk.i("BillingClient", "Error reading EnableDelegationApi experiment flag: " + bundle1.toString(), throwable0);
                }
                try {
                    rco.a = bundle1.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
                }
                catch(Throwable throwable1) {
                    rdk.i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: " + bundle1.toString(), throwable1);
                }
                try {
                    bundle1.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
                }
                catch(Throwable throwable2) {
                    rdk.i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: " + bundle1.toString(), throwable2);
                }
                try {
                    bundle1.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
                }
                catch(Throwable throwable3) {
                    rdk.i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: " + bundle1.toString(), throwable3);
                }
            }
            rbo rbo0 = this.c;
            if(rbo0.j < 3) {
                rdk.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                this.a(this.a, rcn.a, 36, this.b.booleanValue(), null);
                return true;
            }
            rbx rbx0 = this.a;
            boolean z = this.b.booleanValue();
            rbo0.j(0);
            Object object0 = rbo0.a;
            synchronized(object0) {
                if(rbo0.b == 3) {
                    return true;
                }
            }
            rbx0.a(z);
            rbx0.b(rcn.f);
            return true;
        }
        return false;
    }
}

