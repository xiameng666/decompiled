import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt.AuthenticationResult;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.activity.result.IntentSenderRequest;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public final class byof extends lsb {
    public final byax a;
    public final icnj b;
    public byai c;
    public long d;
    public AtomicLong e;
    public final icnl f;

    public byof(Intent intent0) {
        ibuq.f(intent0, "intent");
        super();
        ibuq.f(intent0, "intent");
        bybb bybb0 = jys.d() && !ibuq.m("com.google.android.gms.identitycredentials.action.CREATE_CREDENTIAL_QUERY_BASED", intent0.getAction()) && !ibuq.m("com.google.android.gms.identitycredentials.action.GET_CREDENTIAL_QUERY_BASED", intent0.getAction()) ? new bybj() : new bybb();
        this.a = bybb0;
        icnl icnl0 = icnm.a(null);
        this.f = icnl0;
        this.b = icnl0;
        this.e = new AtomicLong(0L);
        icbb.b(lsc.a(this), null, null, new byoc(this, null), 3);
    }

    public final void A(byak byak0, goz goz0, int v) {
        ibuq.f(byak0, "uiEvent");
        goz goz1 = goz0.ao(0x21D3B830);
        int v1 = 1;
        int v2 = (v & 6) == 0 ? (goz1.V(byak0.ordinal()) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v2 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            Boolean boolean0 = Boolean.valueOf(true);
            goz1.M(-1633490746);
            int v3 = goz1.Z(this);
            if((v2 & 14) != 4) {
                v1 = 0;
            }
            Object object0 = goz1.j();
            if((v3 | v1) != 0 || object0 == gop.a) {
                object0 = new byod(this, byak0, null);
                goz1.P(object0);
            }
            goz1.x();
            gqe.f(boolean0, ((ibtw)object0), goz1);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new byoa(this, byak0, v);
        }
    }

    public final long a() {
        return this.e.get();
    }

    public final Intent b() {
        return bxvq.a(new bxzw(0, "Failed to launch provider UI"), this.a);
    }

    public final CancellationSignal c() {
        byom byom0 = (byom)this.b.b();
        if(byom0 != null) {
            return byom0.h == null ? null : byom0.h.d;
        }
        return null;
    }

    public final byao e() {
        byom byom0 = (byom)this.b.b();
        if(byom0 != null) {
            return byom0.h == null ? null : byom0.h.c;
        }
        return null;
    }

    public final void f() {
        icnj icnj0 = this.b;
        byom byom0 = (byom)icnj0.b();
        Object object0 = null;
        if(byom0 != null) {
            byom byom1 = (byom)icnj0.b();
            if(byom1 != null) {
                bysj bysj0 = byom1.a;
                if(bysj0 != null) {
                    object0 = bysj.a(bysj0, bysl.a, null, 0xFB);
                }
            }
            object0 = byom.a(byom0, ((bysj)object0), null, null, null, null, null, 0xFE);
        }
        this.f.g(object0);
    }

    public final void g() {
        byom byom0 = (byom)this.b.b();
        bxzv bxzv0 = null;
        if(byom0 != null) {
            bysj bysj0 = byom0.a;
            if(bysj0 != null) {
                byot byot0 = bysj0.f;
                if(byot0 != null) {
                    bxzv0 = byot0.b;
                }
            }
        }
        if(bxzv0 != null) {
            byof.y(this, bxzv0);
            return;
        }
        this.r();
    }

    public final void h(bxzv bxzv0, BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0, byam byam0) {
        byar byar0;
        ibuq.f(bxzv0, "selectedEntry");
        Object object0 = null;
        if(bxzv0.d != null) {
            icnl icnl0 = this.f;
            byom byom0 = (byom)this.b.b();
            if(byom0 != null) {
                bxzz bxzz0 = bxzz.b;
                if(biometricPrompt$AuthenticationResult0 == null && byam0 == null) {
                    byar0 = byom0.h;
                }
                else if(biometricPrompt$AuthenticationResult0 == null) {
                    byar0 = byar.a(byom0.h, null, byam0, null, 13);
                }
                else {
                    byaq byaq0 = new byaq(biometricPrompt$AuthenticationResult0);
                    byar0 = byar.a(byom0.h, byaq0, null, null, 14);
                }
                object0 = byom.a(byom0, null, null, bxzv0, bxzz0, null, byar0, 0x73);
            }
            icnl0.g(object0);
            return;
        }
        Intent intent0 = bxvq.b(new byal(bxzv0.a, bxzv0.b, bxzv0.c, null), this.a);
        icnl icnl1 = this.f;
        byom byom1 = (byom)icnl1.b();
        if(byom1 != null) {
            object0 = byom.a(byom1, null, null, null, null, new bxzt(bxzu.b, intent0), null, 0xEF);
        }
        icnl1.g(object0);
    }

    public final void i(byot byot0) {
        bysl bysl0;
        ibuq.f(byot0, "activeEntry");
        boolean z = bysk.c(byot0, false);
        if(z) {
            this.p(byao.a);
        }
        byom byom0 = (byom)this.b.b();
        if(byom0 != null) {
            bysj bysj0 = byom0.a;
            if(bysj0 != null) {
                if(z) {
                    bysl0 = bysl.b;
                }
                else {
                    bysl0 = bysj0.d.h.contains(byot0.a.d) || !bysj0.g || bysj0.d.g != null && bysj0.d.g.length() > 0 ? bysl.a : bysl.d;
                }
                byom byom1 = byom.a(byom0, bysj.a(bysj0, bysl0, byot0, 0xDB), null, null, null, null, null, 0xFE);
                this.f.g(byom1);
            }
        }
    }

    public final void j() {
        byom byom0 = null;
        Intent intent0 = bxvq.a(new bxzw(2, null), this.a);
        icnl icnl0 = this.f;
        byom byom1 = (byom)icnl0.b();
        if(byom1 != null) {
            byom0 = byom.a(byom1, null, null, null, null, new bxzt(bxzu.d, intent0), null, 0xEF);
        }
        icnl0.g(byom0);
    }

    public final void k() {
        icnj icnj0 = this.b;
        byom byom0 = (byom)icnj0.b();
        Object object0 = null;
        if(byom0 != null) {
            byom byom1 = (byom)icnj0.b();
            if(byom1 != null) {
                bysj bysj0 = byom1.a;
                if(bysj0 != null) {
                    object0 = bysj.a(bysj0, bysl.a, null, 0xFB);
                }
            }
            object0 = byom.a(byom0, ((bysj)object0), null, null, null, null, null, 0xFE);
        }
        this.f.g(object0);
    }

    public final void l(byan byan0) {
        ibuq.f(byan0, "biometricFlowType");
        this.p(byao.a);
        switch(byan0.ordinal()) {
            case 0: {
                this.m();
                return;
            }
            case 1: {
                this.k();
                return;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    public final void m() {
        icnj icnj0 = this.b;
        byom byom0 = (byom)icnj0.b();
        Object object0 = null;
        if(byom0 != null) {
            byom byom1 = (byom)icnj0.b();
            if(byom1 != null) {
                byvv byvv0 = byom1.b;
                if(byvv0 != null) {
                    object0 = byvv.a(byvv0, byvx.a, null, false, 0x6F);
                }
            }
            object0 = byom.a(byom0, null, ((byvv)object0), null, null, null, null, 0xFD);
        }
        this.f.g(object0);
    }

    public final void n(bxzv bxzv0, BiometricPrompt.AuthenticationResult biometricPrompt$AuthenticationResult0, byam byam0) {
        byar byar0;
        ibuq.f(bxzv0, "entry");
        if(byam0 != null) {
            Objects.toString(byam0.b);
        }
        icnl icnl0 = this.f;
        Object object0 = null;
        if(bxzv0.d == null) {
            Intent intent0 = bxvq.b(new byal(bxzv0.a, bxzv0.b, bxzv0.c, null), this.a);
            byom byom1 = (byom)this.b.b();
            if(byom1 != null) {
                object0 = byom.a(byom1, null, null, null, null, new bxzt(bxzu.b, intent0), null, 0xEF);
            }
        }
        else {
            byom byom0 = (byom)this.b.b();
            if(byom0 != null) {
                bxzz bxzz0 = bxzz.b;
                if(biometricPrompt$AuthenticationResult0 == null && byam0 == null) {
                    byar0 = byom0.h;
                }
                else if(biometricPrompt$AuthenticationResult0 == null) {
                    byar0 = byar.a(byom0.h, null, byam0, null, 13);
                }
                else {
                    byaq byaq0 = new byaq(biometricPrompt$AuthenticationResult0);
                    byar0 = byar.a(byom0.h, byaq0, null, null, 14);
                }
                object0 = byom.a(byom0, null, null, bxzv0, bxzz0, null, byar0, 0x73);
            }
        }
        icnl0.g(object0);
    }

    public final void o(aca aca0) {
        ibuq.f(aca0, "launcher");
        icnl icnl0 = this.f;
        byom byom0 = (byom)icnl0.b();
        byam byam0 = null;
        bxzv bxzv0 = byom0 == null ? null : byom0.c;
        PendingIntent pendingIntent0 = bxzv0 == null ? null : bxzv0.d;
        byom byom1 = (byom)icnl0.b();
        byar byar0 = byom1 == null ? null : byom1.h;
        if(pendingIntent0 != null) {
            byom byom2 = (byom)icnl0.b();
            icnl0.g((byom2 == null ? null : byom.a(byom2, null, null, null, bxzz.c, null, null, 0xF7)));
            Intent intent0 = bxzv0.e;
            if(intent0 != null) {
                byom byom3 = (byom)icnl0.b();
                intent0.putExtra("IS_AUTO_SELECTED", (byom3 == null ? null : Boolean.valueOf(byom3.f)));
            }
            if(jys.d()) {
                if((byar0 == null ? null : byar0.a) == null) {
                    if(byar0 != null) {
                        byam0 = byar0.b;
                    }
                    if(byam0 != null) {
                        if(intent0 != null) {
                            ibuq.d(byar0.b, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.model.biometrics.BiometricError");
                            intent0.putExtra("androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_CODE", byar0.b.a);
                        }
                        if(intent0 != null) {
                            ibuq.d(byar0.b, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.model.biometrics.BiometricError");
                            intent0.putExtra("androidx.credentials.provider.BIOMETRIC_AUTH_ERROR_MESSAGE", byar0.b.b);
                        }
                        if(intent0 != null) {
                            intent0.putExtra("androidx.credentials.provider.BIOMETRIC_FRAMEWORK_OPTION", false);
                        }
                    }
                }
                else {
                    if(intent0 != null) {
                        ibuq.d(byar0.a, "null cannot be cast to non-null type com.google.android.gms.identitycredentials.model.biometrics.BiometricResult");
                        intent0.putExtra("androidx.credentials.provider.BIOMETRIC_AUTH_RESULT", byar0.a.a.getAuthenticationType());
                    }
                    if(intent0 != null) {
                        intent0.putExtra("androidx.credentials.provider.BIOMETRIC_FRAMEWORK_OPTION", false);
                    }
                }
            }
            acy acy0 = new acy(pendingIntent0);
            acy0.a = intent0;
            IntentSenderRequest intentSenderRequest0 = acy0.a();
            try {
                aca0.b(intentSenderRequest0);
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.w("CredentialSelector", "Failed to launch provider UI: " + activityNotFoundException0.toString());
                this.r();
            }
            return;
        }
        this.r();
    }

    public final void p(byao byao0) {
        ibuq.f(byao0, "biometricPromptState");
        byom byom0 = (byom)this.b.b();
        byom byom1 = byom0 == null ? null : byom.a(byom0, null, null, null, null, null, byar.a(byom0.h, null, null, byao0, 11), 0x7F);
        this.f.g(byom1);
    }

    public final void q(String s) {
        ibuq.f(s, "errorMessage");
        Log.w("CredentialSelector", s);
        this.r();
    }

    public final void r() {
        Intent intent0 = this.b();
        byom byom0 = (byom)this.f.b();
        byom byom1 = byom0 == null ? null : byom.a(byom0, null, null, null, null, new bxzt(bxzu.b, intent0), null, 0xEF);
        this.f.g(byom1);
    }

    public final void v() {
        Intent intent0 = this.b();
        byom byom0 = new byom(null, null, null, null, new bxzt(bxzu.g, intent0), false, null, 0xAC);
        this.f.g(byom0);
    }

    public final void w(Intent intent0, Context context0, long v) {
        ibuq.f(intent0, "intent");
        this.d = v;
        icbb.b(lsc.a(this), null, null, new byoe(this, intent0, context0, null), 3);
    }

    public final void x() {
        byom byom0 = null;
        Intent intent0 = bxvq.a(new bxzw(1, null), this.a);
        icnl icnl0 = this.f;
        byom byom1 = (byom)icnl0.b();
        if(byom1 != null) {
            byom0 = byom.a(byom1, null, null, null, null, new bxzt(bxzu.e, intent0), null, 0xEF);
        }
        icnl0.g(byom0);
    }

    public static void y(byof byof0, bxzv bxzv0) {
        byof0.h(bxzv0, null, null);
    }

    public static void z(byof byof0, bxzv bxzv0) {
        byof0.n(bxzv0, null, null);
    }
}

