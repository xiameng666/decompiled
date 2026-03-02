import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j..time.Instant;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class ctfl {
    private static final bboh a;
    private final Context b;
    private final csud c;
    private final csyu d;
    private final csxk e;
    private final csus f;
    private final csvh g;
    private List h;
    private final ctdo i;

    static {
        ctfl.a = cume.a(new ibuk(ctfl.class));
    }

    public ctfl(Context context0, csud csud0, csyu csyu0, csxk csxk0, csus csus0, csvh csvh0, ctdo ctdo0) {
        ibuq.f(csud0, "accountsRepository");
        ibuq.f(csyu0, "settingsRepository");
        ibuq.f(csxk0, "settingsManager");
        ibuq.f(csus0, "cacheStorage");
        super();
        this.b = context0;
        this.c = csud0;
        this.d = csyu0;
        this.e = csxk0;
        this.f = csus0;
        this.g = csvh0;
        this.i = ctdo0;
    }

    public final Object a(ibrl ibrl0) {
        Object object3;
        Object object2;
        ctfi ctfi0;
        if((ibrl0 instanceof ctfi)) {
            ctfi0 = (ctfi)ibrl0;
            int v = ctfi0.d;
            if((v & 0x80000000) == 0) {
                ctfi0 = new ctfi(this, ibrl0);
            }
            else {
                ctfi0.d = v - 0x80000000;
            }
        }
        else {
            ctfi0 = new ctfi(this, ibrl0);
        }
        Object object0 = ctfi0.b;
        Object object1 = ibrx.a;
        switch(ctfi0.d) {
            case 0: {
                ibnx.b(object0);
                object2 = (List)this.c.c.b();
                ctfi0.a = object2;
                ctfi0.d = 1;
                object0 = this.c(((List)object2), ctfi0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                object2 = ctfi0.a;
                ibnx.b(object0);
            label_22:
                if(((Boolean)object0).booleanValue()) {
                    ((ggtj)ctfl.a.h()).x("Device is default eligible, setting default on");
                    if(hvmp.c()) {
                        try {
                            Account account0 = (Account)ibpo.R(((List)object2));
                            ctfi0.a = null;
                            ctfi0.d = 2;
                            if(this.e.k(account0, ctfi0) != object1) {
                                goto label_38;
                            }
                            return object1;
                        }
                        catch(Throwable throwable0) {
                            goto label_41;
                        }
                        goto label_38;
                    }
                    else {
                        try {
                            Account account1 = (Account)ibpo.R(((List)object2));
                            ctfi0.a = null;
                            ctfi0.d = 3;
                            if(this.e.k(account1, ctfi0) != object1) {
                                goto label_46;
                            }
                            return object1;
                        }
                        catch(Throwable throwable1) {
                            goto label_49;
                        }
                    }
                    return object1;
                }
                ((ggtj)ctfl.a.h()).x("Device is not default eligible");
                return ibom.a;
            }
            case 2: {
                try {
                    ibnx.b(object0);
                label_38:
                    object3 = ibom.a;
                }
                catch(Throwable throwable0) {
                label_41:
                    object3 = ibnx.a(throwable0);
                }
                Throwable throwable2 = ibnw.a(object3);
                if(throwable2 != null && ((throwable2 instanceof CancellationException) || (throwable2 instanceof InterruptedException) || !(throwable2 instanceof Exception))) {
                    throw throwable2;
                }
                goto label_50;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            ibnx.b(object0);
        label_46:
            object3 = ibom.a;
        }
        catch(Throwable throwable1) {
        label_49:
            object3 = ibnx.a(throwable1);
        }
    label_50:
        int v1 = 0;
        if(ibnw.b(object3)) {
            ibom ibom0 = (ibom)object3;
            gzzx gzzx0 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
            gzzx0.b(haam.b);
            haan haan0 = gzzx0.a();
            this.i.g(haaq.b, haan0);
            this.i.c.a(bbdg.qo);
            this.i.i((this.h == null ? 0 : this.h.size()), ctdg.a, ctdl.d);
            ibuq.e("New cross-device features", "getString(...)");
            ibuq.e("You can now move calls between your devices. More features are coming soon.", "getString(...)");
            Intent intent0 = cssn.b().putExtra("EXTRA_SETTINGS_INTENT_SOURCE", "WELCOME_NOTIFICATION").putExtra("EXTRA_SETTINGS_SKIP_OPT_IN", true);
            ibuq.e(intent0, "putExtra(...)");
            juh juh0 = new juf(0, "Settings", this.g.a(intent0)).a();
            Intent intent1 = bbmq.j(new Intent());
            intent1.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.multidevice.ui.enrollment.MultideviceWelcomeActivity"));
            intent1.addFlags(0x14000000);
            ibuq.e(intent1, "apply(...)");
            PendingIntent pendingIntent0 = this.g.a(intent1);
            csvh.d(this.g, 0xBB61F777, "com.google.android.gms.multidevice.data.notifications.WELCOME_CHANNEL_ID", evuh.cn, "New cross-device features", "You can now move calls between your devices. More features are coming soon.", juh0, pendingIntent0, null, 0x80);
            this.g.b.l(haav.b);
        }
        Throwable throwable3 = ibnw.a(object3);
        if(throwable3 != null) {
            a.e(ctfl.a.j(), "Write of multidevice setting status failed: %s", new foqj(throwable3.getClass()), throwable3);
            ctdo ctdo0 = this.i;
            List list0 = this.h;
            if(list0 != null) {
                v1 = list0.size();
            }
            ctdo0.i(v1, ctdg.c, ctdl.d);
            return ibom.a;
        }
        return ibom.a;
    }

    public final Object b(Account account0, ibrl ibrl0) {
        ctfj ctfj0;
        if((ibrl0 instanceof ctfj)) {
            ctfj0 = (ctfj)ibrl0;
            int v = ctfj0.c;
            if((v & 0x80000000) == 0) {
                ctfj0 = new ctfj(this, ibrl0);
            }
            else {
                ctfj0.c = v - 0x80000000;
            }
        }
        else {
            ctfj0 = new ctfj(this, ibrl0);
        }
        Object object0 = ctfj0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(ctfj0.c) {
            case 0: {
                ibnx.b(object0);
                ctfj0.c = 1;
                object0 = this.f.a(account0, ctfj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Instant instant0 = null;
        Instant instant1 = ((hfwn)object0) == null ? null : hfyo.d(((hfwn)object0));
        if(instant1 != null) {
            instant0 = instant1.plus(hfyo.c(hvmz.a.d().c()));
        }
        if(instant0 == null || !Instant.now().isBefore(instant0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c(List list0, ibrl ibrl0) {
        ctfl ctfl0;
        Account account0;
        ctfk ctfk0;
        if((ibrl0 instanceof ctfk)) {
            ctfk0 = (ctfk)ibrl0;
            int v = ctfk0.d;
            if((v & 0x80000000) == 0) {
                ctfk0 = new ctfk(this, ibrl0);
            }
            else {
                ctfk0.d = v - 0x80000000;
            }
        }
        else {
            ctfk0 = new ctfk(this, ibrl0);
        }
        Object object0 = ctfk0.b;
        Object object1 = ibrx.a;
        switch(ctfk0.d) {
            case 0: {
                ibnx.b(object0);
                bboh bboh0 = ctfl.a;
                ((ggtj)bboh0.h()).x("Checking if device is default eligible");
                if(!bbqa.d()) {
                    gzzx gzzx0 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                    gzzx0.b(haam.a);
                    haan haan0 = gzzx0.a();
                    this.i.g(haaq.c, haan0);
                    ((ggtj)bboh0.h()).x("Platform version too low for default opt-in");
                    return Boolean.valueOf(false);
                }
                if(this.d.p()) {
                    gzzx gzzx1 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                    gzzx1.b(haam.a);
                    haan haan1 = gzzx1.a();
                    this.i.g(haaq.d, haan1);
                    ((ggtj)bboh0.h()).x("Setting status already set");
                    return Boolean.valueOf(false);
                }
                if(list0.isEmpty()) {
                    gzzx gzzx2 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                    gzzx2.b(haam.d);
                    haan haan2 = gzzx2.a();
                    this.i.g(haaq.i, haan2);
                    ((ggtj)bboh0.h()).x("Accounts do not match for default opt-in");
                    return Boolean.valueOf(false);
                }
                if(list0.size() != 1) {
                    gzzx gzzx3 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                    gzzx3.b(haam.c);
                    haan haan3 = gzzx3.a();
                    this.i.g(haaq.e, haan3);
                    ((ggtj)bboh0.h()).x("Accounts do not match for default opt-in");
                    return Boolean.valueOf(false);
                }
                account0 = (Account)ibpo.R(list0);
                if(!ibuq.m(account0.type, "com.google") || bbmn.t(this.b)) {
                    goto label_51;
                }
                ctfk0.a = account0;
                ctfk0.d = 1;
                object0 = this.b(account0, ctfk0);
                if(object0 != object1) {
                    goto label_59;
                label_51:
                    gzzx gzzx4 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                    gzzx4.b(haam.b);
                    haan haan4 = gzzx4.a();
                    this.i.g(haaq.h, haan4);
                    ((ggtj)bboh0.h()).x("Only Google account on device is Work account and therefore ineligible for enabling cross-device services by default");
                    return Boolean.valueOf(false);
                }
                return object1;
            }
            case 1: {
                account0 = (Account)ctfk0.a;
                ibnx.b(object0);
            label_59:
                if(((Boolean)object0).booleanValue()) {
                    goto label_84;
                }
                else {
                    ((ggtj)ctfl.a.h()).x("Refreshing device list because cache is invalid");
                    ctfk0.a = account0;
                    ctfk0.d = 2;
                    object0 = this.f.d(account0, ctfk0);
                    if(object0 != object1) {
                        goto label_68;
                    }
                }
                return object1;
            }
            case 2: {
                account0 = (Account)ctfk0.a;
                ibnx.b(object0);
            label_68:
                if(((Boolean)object0).booleanValue()) {
                    goto label_84;
                }
                else {
                    ((ggtj)ctfl.a.h()).x("Could not refresh devices and trying again");
                    ctfk0.a = account0;
                    ctfk0.d = 3;
                    object0 = this.f.d(account0, ctfk0);
                    if(object0 != object1) {
                        goto label_77;
                    }
                }
                return object1;
            }
            case 3: {
                account0 = (Account)ctfk0.a;
                ibnx.b(object0);
            label_77:
                if(!((Boolean)object0).booleanValue()) {
                    gzzx gzzx5 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
                    gzzx5.b(haam.b);
                    haan haan5 = gzzx5.a();
                    this.i.g(haaq.g, haan5);
                    ((ggtj)ctfl.a.h()).x("Second attempt to refresh devices also failed. Exiting eligibility checker");
                    return Boolean.valueOf(false);
                }
            label_84:
                ctfk0.a = this;
                ctfk0.d = 4;
                object0 = this.f.b(account0, ctfk0);
                if(object0 != object1) {
                    ctfl0 = this;
                    break;
                }
                return object1;
            }
            case 4: {
                ctfl0 = (ctfl)ctfk0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ctfl0.h = (List)object0;
        if(this.h != null && !this.h.isEmpty()) {
            ((ggtj)ctfl.a.h()).x("Device eligible to have cross-device services enabled by default");
            return Boolean.valueOf(true);
        }
        gzzx gzzx6 = gzzw.a(((ProtoLiteMessage)haan.a).v_newBuilder());
        gzzx6.b(haam.b);
        haan haan6 = gzzx6.a();
        this.i.g(haaq.f, haan6);
        ((ggtj)ctfl.a.h()).x("Account does not have multiple devices");
        return Boolean.valueOf(false);
    }
}

