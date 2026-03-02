import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.UserManager;
import android.safetycenter.SafetyCenterManager;
import android.safetycenter.SafetyEvent;
import android.safetycenter.SafetySourceData.Builder;
import android.safetycenter.SafetySourceStatus.Builder;
import android.safetycenter.SafetySourceStatus;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

public final class beuv {
    public final Context a;
    public static final int b;
    private static final bboh c;
    private final bgoi d;
    private final ibnn e;
    private final ibnn f;

    static {
        beuv.c = bboh.b("PasswordCheckupSafetyCen", bbcu.cX);
    }

    public beuv(Context context0, bgoi bgoi0) {
        this.a = context0;
        this.d = bgoi0;
        this.e = new ibnz(new beus(this));
        this.f = new ibnz(new beut(this));
    }

    public final void a(SafetyEvent safetyEvent0) {
        int v;
        SafetySourceStatus safetySourceStatus0;
        ibuq.f(safetyEvent0, "safetyEvent");
        if(!this.d().isSafetyCenterEnabled()) {
            return;
        }
        Context context0 = this.a;
        Account account0 = (Account)ibpo.T(bbmn.h(context0, "com.google.android.gms"));
        if(account0 == null) {
            safetySourceStatus0 = new SafetySourceStatus.Builder(context0.getString(this.b()), "Add a Google Account", 100).setPendingIntent(cliy.a(context0)).build();
        }
        else {
            SafetySourceStatus.Builder safetySourceStatus$Builder0 = new SafetySourceStatus.Builder(context0.getString(this.b()), "Check security of passwords saved to your Google Account", 100);
            bgoi bgoi0 = this.d;
            CredentialManagerAccount credentialManagerAccount0 = CredentialManagerAccount.a(account0.name);
            if(this.e()) {
                v = 0xE2006B93;
            }
            else {
                v = this.f() ? -157034555 : 0x487545E7;
            }
            azzc azzc0 = new azzc();
            azzc0.d = 26803;
            azzc0.a = new bgoo(credentialManagerAccount0, v);
            Object object0 = evrg.n(((azts)bgoi0).iG(azzc0.a()));
            ibuq.e(object0, "await(...)");
            safetySourceStatus0 = safetySourceStatus$Builder0.setPendingIntent(((PendingIntent)object0)).build();
        }
        ibuq.e(safetySourceStatus0, "build(...)");
        try {
            this.d().setSafetySourceData("GooglePasswordCheckup", new SafetySourceData.Builder().setStatus(safetySourceStatus0).build(), safetyEvent0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(beuv.c.j(), "Failed to set SafetySourceData", illegalArgumentException0);
        }
        catch(NullPointerException nullPointerException0) {
            a.ae(beuv.c.j(), "Failed to set SafetySourceData, NPE", nullPointerException0);
        }
    }

    private final int b() {
        if(this.e()) {
            return 0x7F152680;  // string:pwm_checkup_safety_center_work_profile_title "Password Checkup for work"
        }
        return this.f() ? 0x7F15267E : 0x7F152678;  // string:pwm_checkup_safety_center_private_profile_title "Password Checkup for private 
                                                    // space"
    }

    private final UserManager c() {
        return (UserManager)this.e.a();
    }

    private final SafetyCenterManager d() {
        Object object0 = this.f.a();
        ibuq.e(object0, "getValue(...)");
        return (SafetyCenterManager)object0;
    }

    private final boolean e() {
        return this.c().isManagedProfile();
    }

    private final boolean f() {
        return jys.d() && ap.a() && this.c().isPrivateProfile();
    }
}

