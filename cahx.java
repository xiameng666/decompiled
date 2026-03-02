import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.security.advancedprotection.AdvancedProtectionManager;
import android.widget.Toast;
import androidx.activity.result.IntentSenderRequest;
import java.security.GeneralSecurityException;

final class cahx extends ibsl implements ibtw {
    int a;
    final bboh b;
    final String c;
    final Context d;
    final AdvancedProtectionManager e;
    final aca f;
    final gra g;
    final caje h;

    public cahx(bboh bboh0, String s, caje caje0, Context context0, AdvancedProtectionManager advancedProtectionManager0, aca aca0, gra gra0, ibrl ibrl0) {
        this.b = bboh0;
        this.c = s;
        this.h = caje0;
        this.d = context0;
        this.e = advancedProtectionManager0;
        this.f = aca0;
        this.g = gra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cahx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cahx(this.b, this.c, this.h, this.d, this.e, this.f, this.g, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        fm fm0;
        Context context0;
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.a) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_10;
                }
                case 2: {
                    goto label_21;
                }
                case 3: {
                    goto label_27;
                }
                default: {
                    ibnx.b(object0);
                    goto label_32;
                }
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            goto label_57;
        }
        catch(azuh azuh0) {
            goto label_60;
        }
        catch(aztb aztb0) {
            goto label_67;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            goto label_70;
        }
        catch(Throwable throwable0) {
            caib.f(this.g);
            throw throwable0;
        }
        ibnx.b(object0);
        try {
            gmcd gmcd0 = fhra.b(this.h.a.jy(this.c));
            this.a = 1;
            object0 = icpu.c(gmcd0, this);
            if(object0 == object1) {
                return object1;
            }
            goto label_11;
        label_10:
            ibnx.b(object0);
        label_11:
            switch(((Number)object0).intValue()) {
                case 2: {
                    Toast.makeText(this.d, "Please set a screen lock to continue.", 1).show();
                    break;
                }
                case 5: {
                    gmcd gmcd1 = this.h.a(this.c);
                    this.a = 2;
                    object0 = icpu.c(gmcd1, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_22;
                label_21:
                    ibnx.b(object0);
                label_22:
                    Boolean boolean0 = (Boolean)object0;
                    gmcd gmcd2 = this.h.b(this.c);
                    this.a = 3;
                    if(icpu.c(gmcd2, this) == object1) {
                        return object1;
                    label_27:
                        ibnx.b(object0);
                    }
                    break;
                }
                case 6: 
                case 7: {
                    break;
                }
                default: {
                    Toast.makeText(this.d, "Unknown sync status.", 1).show();
                }
            }
            gmcd gmcd3 = this.h.b(this.c);
            this.a = 4;
            if(icpu.c(gmcd3, this) == object1) {
                return object1;
            }
        label_32:
            context0 = this.d;
            fm0 = null;
            xob xob0 = (context0 instanceof xob) ? ((xob)context0) : null;
            if(xob0 != null) {
                fm0 = xob0.getSupportFragmentManager();
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            goto label_57;
        }
        catch(azuh azuh0) {
            goto label_60;
        }
        catch(aztb aztb0) {
            goto label_67;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            goto label_70;
        }
        catch(Throwable throwable0) {
            caib.f(this.g);
            throw throwable0;
        }
        if(fm0 != null) {
            try {
                try {
                    if(this.e.isAdvancedProtectionEnabled()) {
                        if(fm0.h("biometric_auth_dialog") == null) {
                            new cajc().showNow(fm0, "biometric_auth_dialog");
                        }
                    }
                    else if(fm0.h("advancedProtectionOptInDialog") == null) {
                        ibuq.f(context0, "context");
                        if(an..ExternalSyntheticApiModelOutline0.m(context0.getSystemService(AdvancedProtectionManager.class)).isAdvancedProtectionEnabled()) {
                            throw new IllegalArgumentException("Must have AAPM disabled to opt-in AAPM");
                        }
                        if(alh.c(context0).b(0x80FF) != 0) {
                            throw new IllegalArgumentException("Must have a lock screen to opt-in AAPM");
                        }
                        cciv cciv0 = new cciv();
                        Bundle bundle0 = new Bundle();
                        bundle0.putBoolean("is_2g_supported", true);
                        bundle0.putBoolean("is_intrusion_logging_supported", true);
                        cciv0.setArguments(bundle0);
                        cciv0.showNow(fm0, "advancedProtectionOptInDialog");
                    }
                    ((ggtj)this.b.j()).x("fragmentManager is null");
                }
                catch(GeneralSecurityException generalSecurityException0) {
                label_57:
                    ((ggtj)((ggtj)this.b.j()).s(generalSecurityException0)).B("setConsent failed", generalSecurityException0);
                }
                catch(azuh azuh0) {
                label_60:
                    ((ggtj)((ggtj)this.b.h()).s(azuh0)).B("setConsent failed. Trying to resolving it.", azuh0);
                    PendingIntent pendingIntent0 = azuh0.c();
                    ibuq.e(pendingIntent0, "getResolution(...)");
                    IntentSenderRequest intentSenderRequest0 = new acy(pendingIntent0).a();
                    this.f.b(intentSenderRequest0);
                }
                catch(aztb aztb0) {
                label_67:
                    ((ggtj)((ggtj)this.b.j()).s(aztb0)).B("setConsent failed", aztb0);
                }
                catch(UnsupportedOperationException unsupportedOperationException0) {
                label_70:
                    ((ggtj)((ggtj)this.b.j()).s(unsupportedOperationException0)).B("setConsent failed", unsupportedOperationException0);
                }
            }
            catch(Throwable throwable0) {
                caib.f(this.g);
                throw throwable0;
            }
        }
        caib.f(this.g);
        return ibom.a;
    }
}

