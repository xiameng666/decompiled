import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneNumberRange;
import android.telephony.TelephonyManager;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.common.api.Status;

public final class aibe extends ahyb implements cjug {
    private static final baun a;
    private final Context b;
    private final String c;
    private final TelephonyManager d;
    private final aicy e;

    static {
        aibe.a = new baun("MissCallRetrieverStub", new String[0]);
    }

    public aibe(Context context0, String s, ibrt ibrt0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(ibrt0, "coroutineContext");
        super();
        this.b = context0;
        this.c = s;
        this.d = (TelephonyManager)context0.getSystemService("phone");
        this.e = new aicy(ibrt0);
    }

    @Override  // ahyc
    public final void a(ahya ahya0, IncomingCallRetrieverRequest incomingCallRetrieverRequest0) {
        String s1;
        ibuq.f(ahya0, "missedCallRetrieverCallbacks");
        ibuq.f(incomingCallRetrieverRequest0, "incomingCallRetrieverRequest");
        ccmq.a().a(bbdg.iJ);
        String s = this.c;
        baun baun0 = aibe.a;
        baun0.h("Starting MissedCallRetriever API using Pending Intent. Calling package:%s", new Object[]{s});
        ghwp ghwp0 = aicv.c(s, ghwo.b);
        aicy aicy0 = this.e;
        aicy0.a(ghwp0);
        if(hppp.d()) {
            Context context0 = this.b;
            boolean z = aics.a(context0, s);
            baun0.h("isTestOnlyApp " + z + " : " + s, new Object[0]);
            if(z) {
                if(!hppp.a.c().i() && !hppp.a.c().f().b.contains(s) && !hppp.b().b.contains(s)) {
                    goto label_17;
                }
            }
            else if(!hppp.b().b.contains(s)) {
            label_17:
                ghwp ghwp1 = aicv.d(this.c, ghwo.c, ghwm.c);
                this.e.a(ghwp1);
                ahya0.a(null, new Status(0xCF0B, "Package is not allowed"));
                return;
            }
            if(context0.getPackageManager().hasSystemFeature("android.hardware.telephony") && (this.d != null && (jys.d() ? this.d.isDeviceVoiceCapable() : this.d.isVoiceCapable()))) {
                try {
                    new PhoneNumberRange(incomingCallRetrieverRequest0.a, incomingCallRetrieverRequest0.b, incomingCallRetrieverRequest0.c, incomingCallRetrieverRequest0.d);
                    s1 = null;
                }
                catch(NumberFormatException numberFormatException0) {
                    s1 = numberFormatException0.getMessage();
                    if(s1 == null) {
                        s1 = "Invalid number format in phone number range";
                    }
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    s1 = illegalArgumentException0.getMessage();
                    if(s1 == null) {
                        s1 = "Invalid argument provided for phone number range";
                    }
                }
                if(s1 != null) {
                    aibe.a.h("IncomingCallRetrieverRequest is invalid: " + s1, new Object[0]);
                    ghwp ghwp2 = aicv.d(this.c, ghwo.c, ghwm.e);
                    this.e.a(ghwp2);
                    ahya0.a(null, new Status(0xCF0E, s1));
                    return;
                }
                Intent intent0 = new Intent("com.google.android.gms.auth.api.phone.missedcallretriever.ACTION_USER_CONSENT");
                intent0.setPackage("com.google.android.gms");
                intent0.putExtra("EXTRA_MISSED_CALL_VERIFICATION_REQUEST", incomingCallRetrieverRequest0);
                ahya0.a(cjok.a(this.b, 0, intent0, 0x4C000000), Status.b);
                ghwp ghwp3 = aicv.c(this.c, ghwo.j);
                this.e.a(ghwp3);
                return;
            }
            baun0.h("MissCallRetriever Feature is not enabled", new Object[0]);
            aicy0.a(aicv.d(s, ghwo.c, ghwm.d));
            ahya0.a(null, new Status(0xCF0D, "Device doesn\'t support the telephony feature"));
            return;
        }
        baun0.h("MissCallRetriever Feature is not enabled", new Object[0]);
        ghwp ghwp4 = aicv.d(this.c, ghwo.c, ghwm.b);
        this.e.a(ghwp4);
        ahya0.a(null, new Status(0xCF0B, "Missed Call API is not available"));
    }
}

