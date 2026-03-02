import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.auth.UserRecoverableAuthException;

public final class erwq extends clso {
    public final ertd a;
    public final ibnf b;
    public final Context c;
    public final cmhi d;
    public final cltr e;
    public final icig f;
    public final gra g;
    public final gra h;
    public final gra i;
    public final gra j;
    public final icmn k;
    public final icig l;
    public final icnj m;
    public final clsk n;
    public final ervd o;
    public final clnw p;
    public final erth q;
    public final icnl r;
    public static final int s;
    private final ibnf t;

    static {
        bboh.b("SpatulaSettingsViewModel", bbcu.gt);
    }

    public erwq(ertd ertd0, clsk clsk0, ervd ervd0, clnw clnw0, ibnf ibnf0, ibnf ibnf1, Context context0, cmhi cmhi0, erth erth0) {
        ibuq.f(clsk0, "selectedAccountRepository");
        ibuq.f(ibnf0, "spatulaSettingsEditCapabilityProvider");
        ibuq.f(ibnf1, "spatulaSettingsSupervisedStateProvider");
        ibuq.f(cmhi0, "gmsCoreMetrics");
        ibuq.f(erth0, "safetyCoreAvailabilityProvider");
        super();
        this.a = ertd0;
        this.n = clsk0;
        this.o = ervd0;
        this.p = clnw0;
        this.t = ibnf0;
        this.b = ibnf1;
        this.c = context0;
        this.d = cmhi0;
        this.q = erth0;
        cltr cltr0 = new cltr(lsc.a(this));
        this.e = cltr0;
        this.f = cltr0.b;
        this.g = new ParcelableSnapshotMutableState(null, gul.a);
        Boolean boolean0 = Boolean.valueOf(false);
        this.h = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.i = new ParcelableSnapshotMutableState(boolean0, gul.a);
        this.j = new ParcelableSnapshotMutableState(null, gul.a);
        icmn icmn0 = icmu.e(1, 0, 2, 2);
        this.k = icmn0;
        erwm erwm0 = new erwm(icmn0);
        icoj icoj0 = new icoj(new erwi(null, this), erwm0);
        this.l = new icoj(new erwj(null, this), icoj0);
        icnl icnl0 = icnm.a(erxm.a);
        this.r = icnl0;
        this.m = new icmp(icnl0);
    }

    public final ervi a() {
        String s = this.p.b(0x7F1508DD);  // string:common_sign_in "Sign in"
        String s1 = this.p.b(0x7F15086F);  // string:common_google_settings_sign_in_prompt "Sign in to your Google Account to 
                                           // get helpful service recommendations"
        String s2 = this.p.b(0x7F15086E);  // string:common_google_settings_sign_in_button "@com.google.android.gms:string/common_sign_in"
        String s3 = this.p.b(0x7F150905);  // string:common_warning_content_desc "Warning"
        return new ervi(s, s1, s2, new ervt(this), true, s3);
    }

    public final ervi b(Boolean boolean0) {
        String s = this.p.b(0x7F152F2D);  // string:spatula_settings_install_safetycore_title "SafetyCore is not installed"
        String s1 = this.p.b(0x7F152F2C);  // string:spatula_settings_install_safetycore "Install SafetyCore"
        String s2 = this.p.b(0x7F150905);  // string:common_warning_content_desc "Warning"
        return new ervi(s, (ibuq.m(boolean0, Boolean.valueOf(true)) ? this.p.b(0x7F152F2F) : this.p.b(0x7F152F2E)), s1, new ervv(this), true, s2);  // string:spatula_settings_install_safetycore_warning_supervised_user "SafetyCore needs 
                                                                                                                                                    // to be installed to enable this feature. Please install it from the Play Store. Note 
                                                                                                                                                    // that once installed, only your parent will be able to turn it off."
    }

    public final erws c(ertz ertz0, String s) {
        boolean z = false;
        erws erws0 = new erws(null, s, false, 0xBF);
        if((ertz0 instanceof erty)) {
            Object object0 = ((erty)ertz0).a;
            if(object0 != null) {
                z = ((Boolean)object0).booleanValue();
            }
            return erws.a(erws0, true, Boolean.valueOf(z), null, false, null, null, false, 0xFC);
        }
        if((ertz0 instanceof ertw)) {
            ervs ervs0 = new ervs(this, s, ertz0);
            return erws.a(erws0, false, ((Boolean)((ertw)ertz0).a), null, false, ervs0, null, false, 0xDD);
        }
        if(!(ertz0 instanceof ertx)) {
            throw new ibnq();
        }
        Boolean boolean0 = (Boolean)((ertx)ertz0).a;
        if(boolean0 != null) {
            z = boolean0.booleanValue();
        }
        return this.k(erws.a(erws0, false, Boolean.valueOf(z), null, false, null, s, false, 0xBD), ((ertx)ertz0).b);
    }

    @Override  // eopt
    public final void e(Bundle bundle0) {
        String s = bundle0 == null ? null : bundle0.getString("extra.accountName");
        icbb.b(lsc.a(this), null, null, new erwg(s, this, null), 3);
    }

    public final Object f(erws erws0, String s, ibrl ibrl0) {
        Object object2;
        erwo erwo0;
        if((ibrl0 instanceof erwo)) {
            erwo0 = (erwo)ibrl0;
            int v = erwo0.c;
            if((v & 0x80000000) == 0) {
                erwo0 = new erwo(this, ibrl0);
            }
            else {
                erwo0.c = v - 0x80000000;
            }
        }
        else {
            erwo0 = new erwo(this, ibrl0);
        }
        Object object0 = erwo0.a;
        Object object1 = ibrx.a;
        switch(erwo0.c) {
            case 0: {
                ibnx.b(object0);
                ertk ertk0 = (ertk)this.t.get();
                erwo0.d = erws0;
                erwo0.c = 1;
                object2 = ertk0.a(s, erwo0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                erws0 = erwo0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 == null) {
            return ((Boolean)object2).booleanValue() ? erws0 : erws.a(erws0, false, null, null, false, null, null, false, 0xEF);
        }
        return this.k(erws0, throwable0);
    }

    public final Object g(erws erws0, String s, ibrl ibrl0) {
        Object object2;
        erwp erwp0;
        if((ibrl0 instanceof erwp)) {
            erwp0 = (erwp)ibrl0;
            int v = erwp0.c;
            if((v & 0x80000000) == 0) {
                erwp0 = new erwp(this, ibrl0);
            }
            else {
                erwp0.c = v - 0x80000000;
            }
        }
        else {
            erwp0 = new erwp(this, ibrl0);
        }
        Object object0 = erwp0.a;
        Object object1 = ibrx.a;
        switch(erwp0.c) {
            case 0: {
                ibnx.b(object0);
                eruv eruv0 = (eruv)this.b.get();
                erwp0.d = erws0;
                erwp0.c = 1;
                object2 = eruv0.a(s, erwp0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                erws0 = erwp0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        return throwable0 == null ? erws.a(erws0, false, null, null, false, null, null, ((Boolean)object2).booleanValue(), 0x7F) : this.k(erws0, throwable0);
    }

    public final void h() {
        icbb.b(lsc.a(this), null, null, new erwh(this, null), 3);
    }

    public final void i(String s, Boolean boolean0) {
        icbb.b(lsc.a(this), null, null, new erwn(this, s, boolean0, null), 3);
    }

    private final ervi j() {
        return new ervi(this.p.b(0x7F150842), this.p.b(0x7F1508E3), this.p.b(0x7F1508C9), new ervu(this));  // string:common_google_play_services_error_dialog_title "Error"
    }

    private final erws k(erws erws0, Throwable throwable0) {
        ervi ervi0 = null;
        if((throwable0 instanceof eruz)) {
            Throwable throwable1 = throwable0.getCause();
            if(!(throwable1 instanceof acsr)) {
                if((throwable1 instanceof UserRecoverableAuthException)) {
                    ervi0 = this.a();
                }
                else {
                    new ibuk(throwable0.getClass()).c();
                }
            }
            else if((throwable0.getCause() instanceof UserRecoverableAuthException)) {
                Throwable throwable2 = throwable0.getCause();
                ibuq.d(throwable2, "null cannot be cast to non-null type com.google.android.gms.auth.GooglePlayServicesAvailabilityException");
                Intent intent0 = ((acsr)throwable2).a();
                ervi0 = intent0 == null ? this.j() : new ervi(this.p.b(0x7F150842), "Account action needed", "Fix", new ervp(this, intent0));  // string:common_google_play_services_error_dialog_title "Error"
            }
            else {
                ervi0 = this.j();
            }
        }
        else {
            new ibuk(throwable0.getClass()).c();
        }
        if(ervi0 == null) {
            ervi0 = this.j();
        }
        return erws.a(erws0, false, null, ervi0, false, null, null, false, 0xF3);
    }
}

