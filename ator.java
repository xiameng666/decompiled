import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ator implements atpb {
    public static final bboh a;
    public final ActivityManager b;
    public final PackageManager c;
    public final AtomicReference d;
    public final atpd e;
    public final icck f;
    public iced g;
    public final icnl h;
    private static final Pattern i;
    private final Context j;
    private final atpc k;

    static {
        Pattern pattern0 = Pattern.compile("Media Projection:\\s*\\(([^,]+), uid=\\d+\\)");
        ibuq.e(pattern0, "compile(...)");
        ator.i = pattern0;
        ator.a = bboh.b("BankAppScamDetector", bbcu.gX);
    }

    public ator(Context context0) {
        atpa atpa0 = new atpa(context0);
        ibuq.f(cclw.d, "backgroundDispatcher");
        super();
        this.j = context0;
        this.k = atpa0;
        Object object0 = context0.getSystemService("activity");
        ibuq.d(object0, "null cannot be cast to non-null type android.app.ActivityManager");
        this.b = (ActivityManager)object0;
        PackageManager packageManager0 = context0.getPackageManager();
        ibuq.e(packageManager0, "getPackageManager(...)");
        this.c = packageManager0;
        this.d = new AtomicReference(null);
        this.e = new atpd();
        this.f = iccl.b(cclw.d);
        this.h = icnm.a(null);
    }

    public final Object a(String s, String s1, ibrl ibrl0) {
        atoj atoj0;
        if((ibrl0 instanceof atoj)) {
            atoj0 = (atoj)ibrl0;
            int v = atoj0.c;
            if((v & 0x80000000) == 0) {
                atoj0 = new atoj(this, ibrl0);
            }
            else {
                atoj0.c = v - 0x80000000;
            }
        }
        else {
            atoj0 = new atoj(this, ibrl0);
        }
        Object object0 = atoj0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(atoj0.c) {
            case 0: {
                ibnx.b(object0);
                atoj0.d = s1;
                atoj0.c = 1;
                object0 = this.k.a(s, atoj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s1 = atoj0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!ibuq.m((((atpg)object0) == null ? null : ((atpg)object0).c), s1) || !((atpg)object0).e && !((atpg)object0).d) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override  // atpb
    public final Object b(String s, String s1, ibrl ibrl0) {
        aton aton0;
        if((ibrl0 instanceof aton)) {
            aton0 = (aton)ibrl0;
            int v = aton0.c;
            if((v & 0x80000000) == 0) {
                aton0 = new aton(this, ibrl0);
            }
            else {
                aton0.c = v - 0x80000000;
            }
        }
        else {
            aton0 = new aton(this, ibrl0);
        }
        Object object0 = aton0.a;
        Object object1 = ibrx.a;
        switch(aton0.c) {
            case 0: {
                ibnx.b(object0);
                this.f();
                if(!ibuq.m(s1, this.d())) {
                    ((ggtj)ator.a.h()).B("The request %s to possiblyReshowDialog is not for current session", s1);
                    return ibom.a;
                }
                icnl icnl0 = this.h;
                if(!ibuq.m(icnl0.b(), s)) {
                    ((ggtj)ator.a.h()).R("Skipping dialog reshow: foreground app (%s) doesn\'t match bank app passed (%s).", icnl0.b(), s);
                    return ibom.a;
                }
                aton0.d = s;
                aton0.e = s1;
                aton0.c = 1;
                object0 = this.a(s, s1, aton0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s1 = aton0.e;
                s = aton0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            ((ggtj)ator.a.h()).x("Skipping dialog reshow: user already pressed \'End Call\'. or `Continue`");
            return ibom.a;
        }
        String s2 = ator.i();
        boolean z = ator.j(s2);
        if(s2 == null) {
            ((ggtj)ator.a.h()).x("Skipping dialog reshow: No active media projection.");
            return ibom.a;
        }
        if(z) {
            ((ggtj)ator.a.h()).B("Skipping dialog reshow: Active media projection by ignored app. %s", s2);
            return ibom.a;
        }
        String s3 = this.e();
        if(!ibuq.m(s3, s)) {
            ggtj ggtj0 = (ggtj)ator.a.h();
            if(s3 == null) {
                s3 = "null";
            }
            ggtj0.R("Top app package name (%s) does not match target bank app package name (%s).", s3, s);
            return ibom.a;
        }
        ((ggtj)ator.a.h()).R("Reshowing BankWarningDialogActivity for %s / %s", s, s1);
        this.m(s2, s, true);
        return ibom.a;
    }

    public final Object c(String s, ibrl ibrl0) {
        String s2;
        atoo atoo0;
        if((ibrl0 instanceof atoo)) {
            atoo0 = (atoo)ibrl0;
            int v = atoo0.c;
            if((v & 0x80000000) == 0) {
                atoo0 = new atoo(this, ibrl0);
            }
            else {
                atoo0.c = v - 0x80000000;
            }
        }
        else {
            atoo0 = new atoo(this, ibrl0);
        }
        Object object0 = atoo0.a;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(atoo0.c) {
            case 0: {
                ibnx.b(object0);
                String s1 = (String)this.d.get();
                if(s1 == null) {
                    ((ggtj)ator.a.i()).x("Session ID is null, not showing dialog.");
                    return Boolean.valueOf(false);
                }
                atoo0.d = s1;
                atoo0.c = 1;
                Object object2 = this.k.a(s, atoo0);
                if(object2 != object1) {
                    object0 = object2;
                    s2 = s1;
                    break;
                }
                return object1;
            }
            case 1: {
                s2 = atoo0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s3 = null;
        ((ggtj)ator.a.h()).R("Checking if dialog should be shown for current session id %s and stored session id %s for bankApp", s2, (((atpg)object0) == null ? null : ((atpg)object0).c));
        if(((atpg)object0) != null) {
            s3 = ((atpg)object0).c;
        }
        if(!ibuq.m(s3, s2) || !((atpg)object0).d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final String d() {
        return (String)this.d.get();
    }

    public final String e() {
        try {
            List list0 = this.b.getRunningTasks(1);
            ibuq.c(list0);
            ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)ibpo.T(list0);
            if(activityManager$RunningTaskInfo0 != null) {
                return activityManager$RunningTaskInfo0.topActivity == null ? null : activityManager$RunningTaskInfo0.topActivity.getPackageName();
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(ator.a.i(), "Failed to get top activity package name.", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            a.ae(ator.a.i(), "Failed to get top activity package name.", securityException0);
        }
        catch(IllegalStateException illegalStateException0) {
            a.ae(ator.a.i(), "Failed to get top activity package name.", illegalStateException0);
        }
        return null;
    }

    public final void f() {
        atoi atoi0 = new atoi(this, null);
        icbb.b(this.f, null, null, atoi0, 3);
    }

    public final void g() {
        AtomicReference atomicReference0 = this.d;
        if(atomicReference0.get() == null) {
            atomicReference0.set(UUID.randomUUID().toString());
            ((ggtj)ator.a.h()).B("Started new session with id: %s", atomicReference0.get());
        }
    }

    public final void h() {
        if(this.g != null && this.g.y()) {
            ((ggtj)ator.a.h()).x("Stopping banking app foreground detection.");
            iced iced0 = this.g;
            if(iced0 != null) {
                iceb.a(iced0);
            }
        }
        this.g = null;
        this.h.g(null);
    }

    public static final String i() {
        String s;
        byte[] arr_b;
        FileInputStream fileInputStream0;
        UnsupportedOperationException unsupportedOperationException1;
        IndexOutOfBoundsException indexOutOfBoundsException1;
        NullPointerException nullPointerException1;
        IllegalStateException illegalStateException1;
        IllegalArgumentException illegalArgumentException1;
        SecurityException securityException1;
        IOException iOException1;
        ParcelFileDescriptor parcelFileDescriptor2;
        ParcelFileDescriptor parcelFileDescriptor1;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        try {
            ParcelFileDescriptor[] arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
            ibuq.c(arr_parcelFileDescriptor);
            parcelFileDescriptor1 = arr_parcelFileDescriptor[0];
            parcelFileDescriptor2 = arr_parcelFileDescriptor[1];
            goto label_49;
        }
        catch(IOException iOException0) {
        }
        catch(SecurityException securityException0) {
            securityException1 = securityException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_91;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            illegalArgumentException1 = illegalArgumentException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_94;
        }
        catch(IllegalStateException illegalStateException0) {
            illegalStateException1 = illegalStateException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_97;
        }
        catch(NullPointerException nullPointerException0) {
            nullPointerException1 = nullPointerException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_100;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            indexOutOfBoundsException1 = indexOutOfBoundsException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_103;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            unsupportedOperationException1 = unsupportedOperationException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_106;
        }
        catch(AssertionError assertionError0) {
            goto label_42;
        }
        catch(Throwable throwable0) {
            parcelFileDescriptor1 = null;
            goto label_114;
        }
        try {
            iOException1 = iOException0;
            parcelFileDescriptor2 = null;
            parcelFileDescriptor1 = null;
            goto label_88;
        }
        catch(Throwable throwable1) {
            goto label_112;
        }
    label_42:
        AssertionError assertionError1 = assertionError0;
        parcelFileDescriptor2 = null;
        parcelFileDescriptor1 = null;
        goto label_109;
        try {
        label_49:
            FileDescriptor fileDescriptor0 = parcelFileDescriptor2.getFileDescriptor();
            ibuq.e(fileDescriptor0, "getFileDescriptor(...)");
            ibuq.f(fileDescriptor0, "outputFd");
            boolean z = Debug.dumpService("media_projection", fileDescriptor0, null);
            parcelFileDescriptor2.close();
            if(z) {
                fileInputStream0 = new FileInputStream(parcelFileDescriptor1.getFileDescriptor());
                goto label_59;
            }
            else {
                ((ggtj)ator.a.i()).x("media projection service dump failed.");
                parcelFileDescriptor1.close();
            }
            goto label_125;
        }
        catch(IOException iOException1) {
            goto label_88;
        }
        catch(SecurityException securityException1) {
            goto label_91;
        }
        catch(IllegalArgumentException illegalArgumentException1) {
            goto label_94;
        }
        catch(IllegalStateException illegalStateException1) {
            goto label_97;
        }
        catch(NullPointerException nullPointerException1) {
            goto label_100;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
            goto label_103;
        }
        catch(UnsupportedOperationException unsupportedOperationException1) {
            goto label_106;
        }
        catch(AssertionError assertionError1) {
            goto label_109;
        }
        catch(Throwable throwable1) {
            goto label_112;
        }
        try {
        label_59:
            int v = fileInputStream0.available();
            arr_b = new byte[v];
            fileInputStream0.read(arr_b, 0, v);
            goto label_66;
        }
        catch(Throwable throwable2) {
            try {
                ibsx.a(fileInputStream0, throwable2);
                throw throwable2;
            label_66:
                ibsx.a(fileInputStream0, null);
                parcelFileDescriptor1.close();
                Matcher matcher0 = ator.i.matcher(new String(arr_b, ibyo.a));
                ibuq.e(matcher0, "matcher(...)");
                if(matcher0.find()) {
                    s = matcher0.group(1);
                    if(s != null) {
                        ((ggtj)ator.a.h()).B("Active Media Projection: Package=%s", s);
                        goto label_74;
                    }
                    goto label_83;
                }
                else {
                    goto label_85;
                }
                goto label_125;
            }
            catch(IOException iOException1) {
                goto label_88;
            }
            catch(SecurityException securityException1) {
                goto label_91;
            }
            catch(IllegalArgumentException illegalArgumentException1) {
                goto label_94;
            }
            catch(IllegalStateException illegalStateException1) {
                goto label_97;
            }
            catch(NullPointerException nullPointerException1) {
                goto label_100;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
                goto label_103;
            }
            catch(UnsupportedOperationException unsupportedOperationException1) {
                goto label_106;
            }
            catch(AssertionError assertionError1) {
                goto label_109;
            }
            catch(Throwable throwable1) {
                goto label_112;
            }
        }
        try {
        label_74:
            parcelFileDescriptor2.close();
        }
        catch(IOException iOException2) {
            a.ae(ator.a.j(), "IOException closing writePfd.", iOException2);
        }
        try {
            parcelFileDescriptor1.close();
        }
        catch(IOException iOException3) {
            a.ae(ator.a.j(), "IOException closing readPfd.", iOException3);
        }
        return s;
        try {
        label_83:
            ((ggtj)ator.a.i()).x("Active media projection found, but package name is absent.");
            goto label_125;
        label_85:
            ((ggtj)ator.a.h()).x("No active media projection.");
            goto label_125;
        }
        catch(IOException iOException1) {
        }
        catch(SecurityException securityException1) {
            goto label_91;
        }
        catch(IllegalArgumentException illegalArgumentException1) {
            goto label_94;
        }
        catch(IllegalStateException illegalStateException1) {
            goto label_97;
        }
        catch(NullPointerException nullPointerException1) {
            goto label_100;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
            goto label_103;
        }
        catch(UnsupportedOperationException unsupportedOperationException1) {
            goto label_106;
        }
        catch(AssertionError assertionError1) {
            goto label_109;
        }
        catch(Throwable throwable1) {
            goto label_112;
        }
        try {
        label_88:
            ((ggtj)((ggtj)ator.a.i()).s(iOException1)).x("IOException during media projection check.");
            goto label_125;
        label_91:
            ((ggtj)((ggtj)ator.a.i()).s(securityException1)).x("SecurityException during media projection check.");
            goto label_125;
        label_94:
            ((ggtj)((ggtj)ator.a.i()).s(illegalArgumentException1)).x("IllegalArgumentException during media projection check.");
            goto label_125;
        label_97:
            ((ggtj)((ggtj)ator.a.i()).s(illegalStateException1)).x("IllegalStateException during media projection check.");
            goto label_125;
        label_100:
            ((ggtj)((ggtj)ator.a.i()).s(nullPointerException1)).x("NullPointerException during media projection check.");
            goto label_125;
        label_103:
            ((ggtj)((ggtj)ator.a.i()).s(indexOutOfBoundsException1)).x("IndexOutOfBoundsException during media projection check.");
            goto label_125;
        label_106:
            ((ggtj)((ggtj)ator.a.i()).s(unsupportedOperationException1)).x("UnsupportedOperationException during media projection check.");
            goto label_125;
        label_109:
            ((ggtj)((ggtj)ator.a.i()).s(assertionError1)).x("AssertionError during media projection check.");
            goto label_125;
        }
        catch(Throwable throwable1) {
        label_112:
            throwable0 = throwable1;
            parcelFileDescriptor0 = parcelFileDescriptor2;
        }
    label_114:
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(IOException iOException4) {
                a.ae(ator.a.j(), "IOException closing writePfd.", iOException4);
            }
        }
        if(parcelFileDescriptor1 != null) {
            try {
                parcelFileDescriptor1.close();
            }
            catch(IOException iOException5) {
                a.ae(ator.a.j(), "IOException closing readPfd.", iOException5);
            }
        }
        throw throwable0;
    label_125:
        if(parcelFileDescriptor2 != null) {
            try {
                parcelFileDescriptor2.close();
            }
            catch(IOException iOException6) {
                a.ae(ator.a.j(), "IOException closing writePfd.", iOException6);
            }
        }
        if(parcelFileDescriptor1 != null) {
            try {
                parcelFileDescriptor1.close();
                return null;
            }
            catch(IOException iOException7) {
                a.ae(ator.a.j(), "IOException closing readPfd.", iOException7);
            }
        }
        return null;
    }

    public static final boolean j(String s) {
        return s == null || hxvd.a.c().f().b.contains(s);
    }

    static void k(ator ator0, String s, String s1) {
        ator0.m(s, s1, false);
    }

    public static final boolean l(String s) {
        return s != null && hxvd.a.c().e().b.contains(s);
    }

    private final void m(String s, String s1, boolean z) {
        Intent intent0 = new Intent("com.google.android.gms.security.bankscamwarning.BANK_SCAM_WARNING_DIALOG").setPackage("com.google.android.gms");
        ibuq.e(intent0, "setPackage(...)");
        intent0.addFlags(0x10000000);
        intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_PROJECTION_PACKAGE_NAME", s);
        intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_BANK_APP_PACKAGE_NAME", s1);
        intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_SESSION_ID", ((String)this.d.get()));
        intent0.putExtra("com.google.android.gms.bankscamwarning.EXTRA_IS_DIALOG_RELAUNCHED_AFTER_IMPLICIT_DISMISSAL", z);
        try {
            this.j.startActivity(intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            a.ae(ator.a.i(), "Failed to start BankWarningDialogActivity.", activityNotFoundException0);
        }
        catch(SecurityException securityException0) {
            a.ae(ator.a.i(), "Failed to start BankWarningDialogActivity.", securityException0);
        }
    }
}

