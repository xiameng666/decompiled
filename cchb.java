import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.ExampleConsumption;
import com.google.android.gms.learning.InAppTrainerOptions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;

public final class cchb {
    public final cbzh a;
    public final fnaa b;
    private final Context c;
    private final List d;
    private final cbyw e;

    public cchb(Context context0, grgx grgx0, cbzh cbzh0, cbyw cbyw0, fnaa fnaa0) {
        grhf grhf0 = grgx0.b == null ? grhf.a : grgx0.b;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: grgx0.c) {
            byte[] arr_b = grhf0.toBytesArray();
            String s = cchb.b(((grhh)object0).b);
            hfrn hfrn0 = ((grhh)object0).c;
            if(hfrn0 == null) {
                hfrn0 = hfrn.a;
            }
            arrayList0.add(new ExampleConsumption(s, hfrn0.toBytesArray(), ((grhh)object0).d, null, arr_b));
        }
        super();
        this.c = context0;
        if(cbyw0.Y()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                ExampleConsumption exampleConsumption0 = (ExampleConsumption)object1;
                byte[] arr_b1 = exampleConsumption0.b;
                if(arr_b1 == null) {
                    arrayList1.add(exampleConsumption0);
                }
                else {
                    hfrn hfrn1 = grgu.a(arr_b1);
                    if(hfrn1 == null) {
                        arrayList1.add(exampleConsumption0);
                    }
                    else {
                        byte[] arr_b2 = hfrn1.toBytesArray();
                        arrayList1.add(new ExampleConsumption(exampleConsumption0.a, arr_b2, exampleConsumption0.c, exampleConsumption0.d, exampleConsumption0.e));
                    }
                }
            }
            arrayList0 = arrayList1;
        }
        this.d = arrayList0;
        this.a = cbzh0;
        this.e = cbyw0;
        this.b = fnaa0;
    }

    public final void a(String s, cccq cccq0, byte[] arr_b, boolean z) {
        Status status0;
        InAppTrainerOptions inAppTrainerOptions0;
        ccgy ccgy0;
        ccha ccha0;
        gmcu gmcu1;
        ccej ccej0;
        cbyw cbyw0;
        IBinder iBinder0;
        Context context1;
        gmcu gmcu0 = new gmcu();
        ccgz ccgz0 = new ccgz(this, gmcu0);
        String s1 = Uri.encode(s);
        Intent intent0 = new Intent();
        Context context0 = this.c;
        Runnable runnable0 = null;
        if("com.google.android.gms".equals("com.google.android.gms")) {
            List list0 = this.d;
            if(!list0.isEmpty()) {
                String s2 = ((ExampleConsumption)list0.get(0)).a;
                Matcher matcher0 = ccgw.a.matcher(s2);
                String s3 = matcher0.matches() ? matcher0.group(1) : null;
                ComponentName componentName0 = new ComponentName("com.google.android.gms", "com.google.android.gms.chimera.GmsInternalBoundBrokerService");
                intent0.setAction(String.format("com.google.android.gms.learning.%s.COMPUTATION_RESULT", s3)).setComponent(componentName0);
                context1 = context0.getApplicationContext();
                goto label_19;
            }
            return;
        }
        else {
            intent0.setPackage("com.google.android.gms").setAction("com.google.android.gms.learning.COMPUTATION_RESULT").setData(new Uri.Builder().scheme("app").authority("com.google.android.gms").path(s1).build());
            context1 = context0.getApplicationContext();
        }
        try {
        label_19:
            if(context1.bindService(intent0, ccgz0, 1)) {
                try {
                    iBinder0 = (IBinder)gmcu0.v(this.e.x(), TimeUnit.SECONDS);
                }
                catch(TimeoutException unused_ex) {
                    this.a.c(0x473);
                    cbyw0 = this.e;
                    goto label_145;
                }
                catch(InterruptedException unused_ex) {
                    this.a.c(0x472);
                    Thread.currentThread().interrupt();
                    cbyw0 = this.e;
                    goto label_145;
                }
                catch(ExecutionException unused_ex) {
                    cbyw0 = this.e;
                    goto label_145;
                }
                if(iBinder0 == null) {
                    ccej0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppResultHandler");
                    ccej0 = (iInterface0 instanceof ccej) ? ((ccej)iInterface0) : new cceh(iBinder0);
                }
                gmcu1 = new gmcu();
                ccha0 = new ccha(this, gmcu1);
                try {
                    ccgx ccgx0 = new ccgx(this, gmcu1);
                    iBinder0.linkToDeath(ccgx0, 0);
                    ccgy0 = new ccgy(iBinder0, ccgx0);
                    goto label_47;
                }
                catch(RemoteException unused_ex) {
                    goto label_114;
                }
                catch(InterruptedException unused_ex) {
                    goto label_117;
                }
                catch(TimeoutException unused_ex) {
                    goto label_121;
                }
                catch(ExecutionException | IllegalStateException exception0) {
                    goto label_125;
                }
            }
            else {
                this.a.c(1140);
                cbyw0 = this.e;
            }
            goto label_145;
        }
        catch(Throwable throwable0) {
            goto label_136;
        }
        goto label_125;
        try {
        label_47:
            if(ccej0.a() > 0) {
                if(cccq0.b() - 1 == 0) {
                    fnaf fnaf0 = cccq0.a();
                    cbze cbze1 = new cbze();
                    cbze1.a = 0x7FFFFFFF;
                    cbze1.e(fnaf0.c);
                    cbze1.f(s);
                    cbze1.d(arr_b);
                    if((fnaf0.b & 1) != 0) {
                        cbze1.f = cccg.a((fnaf0.e == null ? fnal.a : fnaf0.e));
                    }
                    inAppTrainerOptions0 = cbze1.a();
                }
                else {
                    fnah fnah0 = cccq0.c();
                    cbze cbze0 = new cbze();
                    cbze0.a = 0x7FFFFFFF;
                    cbze0.f(s);
                    cbze0.f = cccg.a((fnah0.f == null ? fnal.a : fnah0.f));
                    cbze0.d(arr_b);
                    if(fnah0.h.isEmpty()) {
                        Uri uri2 = Uri.parse(fnah0.c);
                        Uri uri3 = Uri.parse(fnah0.g);
                        Uri uri4 = Uri.parse(fnah0.e);
                        InAppTrainerOptions.a(uri2);
                        InAppTrainerOptions.a(uri3);
                        InAppTrainerOptions.a(uri4);
                        cbze0.b = 3;
                        cbze0.c = uri2;
                        cbze0.g = uri3;
                        cbze0.d = uri4;
                    }
                    else {
                        HashMap hashMap0 = new HashMap();
                        for(Object object0: fnah0.h) {
                            hashMap0.put(((fnag)object0).b, Uri.parse(((fnag)object0).c));
                        }
                        Uri uri0 = Uri.parse(fnah0.c);
                        Uri uri1 = Uri.parse(fnah0.e);
                        InAppTrainerOptions.a(uri0);
                        for(Object object1: hashMap0.values()) {
                            InAppTrainerOptions.a(((Uri)object1));
                        }
                        InAppTrainerOptions.a(uri1);
                        cbze0.b = 3;
                        cbze0.c = uri0;
                        cbze0.h = hashMap0;
                        cbze0.d = uri1;
                    }
                    inAppTrainerOptions0 = cbze0.a();
                }
                ccej0.b(inAppTrainerOptions0, z, this.d, ccha0);
                status0 = (Status)gmcu1.v(this.e.y(), TimeUnit.SECONDS);
            }
            else {
                status0 = new Status(0);
                this.a.c(0x467);
            }
            if(status0 == null) {
                this.a.c(0x475);
            }
            else {
                switch(status0.i) {
                    case 0: {
                        this.a.b(1102);
                        break;
                    }
                    case 25002: {
                        this.a.b(1102);
                        break;
                    }
                    default: {
                        this.a.c(0x475);
                    }
                }
            }
            goto label_143;
        }
        catch(RemoteException unused_ex) {
        }
        catch(InterruptedException unused_ex) {
            goto label_116;
        }
        catch(TimeoutException unused_ex) {
            goto label_120;
        }
        catch(ExecutionException | IllegalStateException exception0) {
            goto label_124;
        }
        catch(Throwable throwable0) {
            goto label_135;
        }
        runnable0 = ccgy0;
        try {
        label_114:
            this.a.c(0x471);
            goto label_130;
        label_116:
            runnable0 = ccgy0;
        label_117:
            this.a.c(0x46F);
            Thread.currentThread().interrupt();
            goto label_130;
        label_120:
            runnable0 = ccgy0;
        label_121:
            this.a.c(0x470);
            goto label_130;
        label_124:
            runnable0 = ccgy0;
        label_125:
            this.b.j(exception0, "An exception was thrown during result handling.");
            this.a.c(0x45F);
        }
        catch(Throwable throwable0) {
            goto label_136;
        }
    label_130:
        if(runnable0 != null) {
            runnable0.run();
        }
        cbyw0 = this.e;
        goto label_145;
    label_135:
        runnable0 = ccgy0;
    label_136:
        if(runnable0 != null) {
            runnable0.run();
        }
        this.e.ac();
        try {
            context1.unbindService(ccgz0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.a.c(0x45A);
        }
        throw throwable0;
    label_143:
        ccgy0.run();
        cbyw0 = this.e;
    label_145:
        cbyw0.ac();
        try {
            context1.unbindService(ccgz0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.a.c(0x45A);
        }
    }

    private static String b(String s) {
        URI uRI0;
        try {
            uRI0 = new URI(s);
        }
        catch(URISyntaxException uRISyntaxException0) {
            throw new IllegalArgumentException("Invalid collection uri.", uRISyntaxException0);
        }
        String s1 = uRI0.getRawPath();
        if(s1 != null) {
            return s1;
        }
        throw new IllegalArgumentException("Invalid collection uri.");
    }
}

