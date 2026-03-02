import android.os.ParcelUuid;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jeb.synthetic.FIN;

public final class dgkw implements dgko {
    public final cuvm a;
    public final icck b;
    public final gmcq c;
    public final icgv d;
    public final icig e;
    public static final int f;
    private static final Strategy g;
    private static final ParcelUuid h;
    private boolean i;
    private final dgkr j;
    private final icta k;

    static {
        dgkw.g = Strategy.c;
        dgkw.h = cutq.a("FEF3");
    }

    public dgkw(cuvm cuvm0, icck icck0) {
        this.a = cuvm0;
        this.b = icck0;
        this.c = gmcq.b(hvqs.b());
        icgv icgv0 = icgx.a(0x7FFFFFFF, 0, null, 6);
        this.d = icgv0;
        this.k = new icta();
        this.j = new dgkr(this);
        this.e = new icjm(new icia(icgv0, true), new dgks(this, null));
    }

    @Override  // dgko
    public final Object a(byte[] arr_b, dgld dgld0, ibrl ibrl0) {
        Object object3;
        icta icta2;
        Throwable throwable2;
        Object object2;
        evql evql0;
        icta icta0;
        dgkt dgkt0;
        if((ibrl0 instanceof dgkt)) {
            dgkt0 = (dgkt)ibrl0;
            int v = dgkt0.e;
            if((v & 0x80000000) == 0) {
                dgkt0 = new dgkt(this, ibrl0);
            }
            else {
                dgkt0.e = v - 0x80000000;
            }
        }
        else {
            dgkt0 = new dgkt(this, ibrl0);
        }
        Object object0 = dgkt0.c;
        Object object1 = ibrx.a;
        switch(dgkt0.e) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.k;
                dgkt0.a = arr_b;
                dgkt0.b = dgld0;
                dgkt0.f = icta0;
                dgkt0.e = 1;
                if(icta0.b(dgkt0) != object1) {
                    goto label_27;
                }
                return object1;
            }
            case 1: {
                icta icta1 = dgkt0.f;
                dgld0 = (dgld)dgkt0.b;
                byte[] arr_b1 = (byte[])dgkt0.a;
                ibnx.b(object0);
                icta0 = icta1;
                arr_b = arr_b1;
                try {
                label_27:
                    if(this.i) {
                        throw new IllegalStateException("Calling start while the broadcast provider has been started.");
                    }
                    AdvertisingOptions advertisingOptions0 = dgkw.d(dgld0);
                    evql0 = this.a.n(arr_b, "NearbySharing", this.j, advertisingOptions0);
                }
                catch(Throwable throwable0) {
                    icta0.d();
                    throw throwable0;
                }
                try {
                    dgkt0.a = dgld0;
                    dgkt0.b = icta0;
                    dgkt0.f = null;
                    dgkt0.e = 2;
                    object2 = ictn.b(evql0, dgkt0);
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    icta2 = icta0;
                    goto label_54;
                }
                if(object2 != object1) {
                    object0 = object2;
                    icta2 = icta0;
                    goto label_55;
                }
                return object1;
            }
            case 2: {
                icta2 = (icta)dgkt0.b;
                dgld0 = (dgld)dgkt0.a;
                try {
                    ibnx.b(object0);
                    goto label_55;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_54:
                    object0 = ibnx.a(throwable2);
                label_55:
                    Throwable throwable3 = ibnw.a(object0);
                    if((throwable3 instanceof CancellationException)) {
                        throw throwable3;
                    }
                    Throwable throwable4 = ibnw.a(object0);
                    if(throwable4 == null) {
                        Void void0 = (Void)object0;
                        dcvz.a.b().p("[broadcast provider] advertising started.", new Object[0]);
                        this.i = true;
                        object3 = ibom.a;
                    }
                    else {
                        dcvz.a.c().f(throwable4).h("[NS_ERROR] Failed to start advertising with %s.", dgld0);
                        object3 = ibnx.a(throwable4);
                    }
                    goto label_72;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta0 = icta2;
        icta0.d();
        throw throwable0;
    label_72:
        icta2.d();
        return object3;
    }

    @Override  // dgko
    public final Object b(ibrl ibrl0) {
        icta icta1;
        dgku dgku0;
        if((ibrl0 instanceof dgku)) {
            dgku0 = (dgku)ibrl0;
            int v = dgku0.c;
            if((v & 0x80000000) == 0) {
                dgku0 = new dgku(this, ibrl0);
            }
            else {
                dgku0.c = v - 0x80000000;
            }
        }
        else {
            dgku0 = new dgku(this, ibrl0);
        }
        Object object0 = dgku0.a;
        Object object1 = ibrx.a;
        switch(dgku0.c) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.k;
                dgku0.d = icta0;
                dgku0.c = 1;
                if(icta0.b(dgku0) != object1) {
                    icta1 = icta0;
                    break;
                }
                return object1;
            }
            case 1: {
                icta1 = dgku0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        int v1 = FIN.finallyOpen$NT();
        if(this.i) {
            this.a.s();
            this.i = false;
            FIN.finallyCodeBegin$NT(v1);
            return ibom.a;
        }
        throw new IllegalStateException("Calling stop while the broadcast provider is not started.");
    }

    @Override  // dgko
    public final Object c(byte[] arr_b, dgld dgld0, ibrl ibrl0) {
        Object object2;
        dgld dgld1;
        icta icta2;
        Throwable throwable2;
        evql evql0;
        icta icta1;
        byte[] arr_b1;
        dgkv dgkv0;
        if((ibrl0 instanceof dgkv)) {
            dgkv0 = (dgkv)ibrl0;
            int v = dgkv0.e;
            if((v & 0x80000000) == 0) {
                dgkv0 = new dgkv(this, ibrl0);
            }
            else {
                dgkv0.e = v - 0x80000000;
            }
        }
        else {
            dgkv0 = new dgkv(this, ibrl0);
        }
        Object object0 = dgkv0.c;
        Object object1 = ibrx.a;
        switch(dgkv0.e) {
            case 0: {
                ibnx.b(object0);
                icta icta0 = this.k;
                dgkv0.a = arr_b;
                dgkv0.b = dgld0;
                dgkv0.f = icta0;
                dgkv0.e = 1;
                if(icta0.b(dgkv0) != object1) {
                    arr_b1 = arr_b;
                    icta1 = icta0;
                    goto label_27;
                }
                return object1;
            }
            case 1: {
                icta1 = dgkv0.f;
                dgld0 = (dgld)dgkv0.b;
                arr_b1 = (byte[])dgkv0.a;
                ibnx.b(object0);
                try {
                label_27:
                    if(!this.i) {
                        throw new IllegalStateException("Calling update while the broadcast provider is not started.");
                    }
                    AdvertisingOptions advertisingOptions0 = dgkw.d(dgld0);
                    evql0 = this.a.w(arr_b1, advertisingOptions0);
                }
                catch(Throwable throwable0) {
                    icta1.d();
                    throw throwable0;
                }
                try {
                    dgkv0.a = dgld0;
                    dgkv0.b = icta1;
                    dgkv0.f = null;
                    dgkv0.e = 2;
                    object0 = ictn.b(evql0, dgkv0);
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    icta2 = icta1;
                    dgld1 = dgld0;
                    goto label_55;
                }
                if(object0 != object1) {
                    icta2 = icta1;
                    dgld1 = dgld0;
                    goto label_56;
                }
                return object1;
            }
            case 2: {
                icta2 = (icta)dgkv0.b;
                dgld1 = (dgld)dgkv0.a;
                try {
                    ibnx.b(object0);
                    goto label_56;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_55:
                    object0 = ibnx.a(throwable2);
                label_56:
                    Throwable throwable4 = ibnw.a(object0);
                    if((throwable4 instanceof CancellationException)) {
                        throw throwable4;
                    }
                    Throwable throwable5 = ibnw.a(object0);
                    if(throwable5 == null) {
                        Void void0 = (Void)object0;
                        dcvz.a.b().h("[broadcast provider] advertising options updated (%s).", dgld1);
                        object2 = ibom.a;
                    }
                    else {
                        dcvz.a.c().f(throwable5).h("[NS_ERROR] Failed to update advertising with %s.", dgld1);
                        object2 = ibnx.a(throwable5);
                    }
                    goto label_73;
                }
                catch(Throwable throwable3) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta1 = icta2;
        throwable0 = throwable3;
        icta1.d();
        throw throwable0;
    label_73:
        icta2.d();
        return object2;
    }

    private static final AdvertisingOptions d(dgld dgld0) {
        AdvertisingOptions advertisingOptions0 = new AdvertisingOptions();
        advertisingOptions0.a = dgkw.g;
        cuut.c(advertisingOptions0);
        advertisingOptions0.l = true;
        advertisingOptions0.r = dgld0.b;
        advertisingOptions0.w = dgld0.f;
        cuut.a(advertisingOptions0);
        int[] arr_v = ibpo.aF(dgld0.d);
        advertisingOptions0.x = Arrays.copyOf(arr_v, arr_v.length);
        int[] arr_v1 = ibpo.aF(dgld0.e);
        advertisingOptions0.y = Arrays.copyOf(arr_v1, arr_v1.length);
        advertisingOptions0.F = hvqz.N();
        advertisingOptions0.G = hvqz.O();
        advertisingOptions0.H = dgld0.g;
        advertisingOptions0.A = dgld0.a;
        advertisingOptions0.C = dgld0.h;
        if(dgld0.i) {
            advertisingOptions0.h = dgkw.h;
        }
        Set set0 = dgld0.c;
        if(!set0.isEmpty()) {
            cuut.b(advertisingOptions0);
            advertisingOptions0.s = (UwbSenderInfo[])set0.toArray(new UwbSenderInfo[0]);
        }
        cuut.d(advertisingOptions0);
        return advertisingOptions0;
    }
}

