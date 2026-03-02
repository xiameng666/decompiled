import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.identity.credentialprovider.AuxiliaryClearCredentialResponse;
import com.google.android.gms.identitycredentials.ClearCreationOptionsRequest;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportRequest;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryRequest.ClearTypedRegistryOption;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportRequest;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import java.util.List;

public final class bxyi {
    public static final bxxz a;
    public final String b;
    public final int c;
    public final long d;
    public final Context e;

    static {
        bxyi.a = new bxxz();
    }

    public bxyi(String s, int v, long v1, Context context0) {
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = s;
        this.c = v;
        this.d = v1;
        this.e = context0;
    }

    public final Object a(ClearCreationOptionsRequest clearCreationOptionsRequest0, ibrl ibrl0) {
        bxya bxya0;
        if((ibrl0 instanceof bxya)) {
            bxya0 = (bxya)ibrl0;
            int v = bxya0.c;
            if((v & 0x80000000) == 0) {
                bxya0 = new bxya(this, ibrl0);
            }
            else {
                bxya0.c = v - 0x80000000;
            }
        }
        else {
            bxya0 = new bxya(this, ibrl0);
        }
        Object object0 = bxya0.a;
        Object object1 = ibrx.a;
        switch(bxya0.c) {
            case 0: {
                ibnx.b(object0);
                ClearRegistryRequest.ClearTypedRegistryOption clearRegistryRequest$ClearTypedRegistryOption0 = clearCreationOptionsRequest0.b == null ? null : new ClearRegistryRequest.ClearTypedRegistryOption(clearCreationOptionsRequest0.b.a, clearCreationOptionsRequest0.b.b, false, clearCreationOptionsRequest0.b.c);
                ClearRegistryRequest clearRegistryRequest0 = new ClearRegistryRequest(clearCreationOptionsRequest0.a, clearRegistryRequest$ClearTypedRegistryOption0);
                bxya0.c = 1;
                object0 = this.c(clearRegistryRequest0, bxxf.b, bxya0);
                return object0 == object1 ? object1 : new ClearCreationOptionsResponse(((ClearRegistryResponse)object0).a);
            }
            case 1: {
                ibnx.b(object0);
                return new ClearCreationOptionsResponse(((ClearRegistryResponse)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(ClearExportRequest clearExportRequest0, ibrl ibrl0) {
        bxyc bxyc0;
        if((ibrl0 instanceof bxyc)) {
            bxyc0 = (bxyc)ibrl0;
            int v = bxyc0.c;
            if((v & 0x80000000) == 0) {
                bxyc0 = new bxyc(this, ibrl0);
            }
            else {
                bxyc0.c = v - 0x80000000;
            }
        }
        else {
            bxyc0 = new bxyc(this, ibrl0);
        }
        Object object0 = bxyc0.a;
        Object object1 = ibrx.a;
        switch(bxyc0.c) {
            case 0: {
                ibnx.b(object0);
                ClearRegistryRequest clearRegistryRequest0 = new ClearRegistryRequest(false, clearExportRequest0.c);
                bxyc0.c = 1;
                object0 = this.c(clearRegistryRequest0, bxxf.c, bxyc0);
                return object0 == object1 ? object1 : new ClearExportResponse(((ClearRegistryResponse)object0).a);
            }
            case 1: {
                ibnx.b(object0);
                return new ClearExportResponse(((ClearRegistryResponse)object0).a);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(ClearRegistryRequest clearRegistryRequest0, bxxf bxxf0, ibrl ibrl0) {
        bxyd bxyd0;
        if((ibrl0 instanceof bxyd)) {
            bxyd0 = (bxyd)ibrl0;
            int v = bxyd0.c;
            if((v & 0x80000000) == 0) {
                bxyd0 = new bxyd(this, ibrl0);
            }
            else {
                bxyd0.c = v - 0x80000000;
            }
        }
        else {
            bxyd0 = new bxyd(this, ibrl0);
        }
        Object object0 = bxyd0.a;
        Object object1 = ibrx.a;
        switch(bxyd0.c) {
            case 0: {
                ibnx.b(object0);
                bxxv bxxv0 = new bxxv(bxxf0);
                try {
                    List list0 = bxyk.a(this.e, this.b);
                    bxyd0.c = 1;
                    object0 = bxxv0.a(this.b, list0, clearRegistryRequest0, bxyd0);
                    if(object0 == object1) {
                        return object1;
                    label_20:
                        ibnx.b(object0);
                    }
                    return new ClearRegistryResponse(((Boolean)object0).booleanValue());
                }
                catch(Exception exception0) {
                    break;
                }
            }
            case 1: {
                goto label_20;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new cjuh(8, "Failed to clear all credentials. " + exception0.toString(), null, exception0);
    }

    public final Object d(RegisterCreationOptionsRequest registerCreationOptionsRequest0, ibrl ibrl0) {
        bxye bxye0;
        if((ibrl0 instanceof bxye)) {
            bxye0 = (bxye)ibrl0;
            int v = bxye0.c;
            if((v & 0x80000000) == 0) {
                bxye0 = new bxye(this, ibrl0);
            }
            else {
                bxye0.c = v - 0x80000000;
            }
        }
        else {
            bxye0 = new bxye(this, ibrl0);
        }
        Object object0 = bxye0.a;
        Object object1 = ibrx.a;
        switch(bxye0.c) {
            case 0: {
                ibnx.b(object0);
                bxxv bxxv0 = new bxxv(bxxf.b);
                bxye0.c = 1;
                return this.g(bxxv0, registerCreationOptionsRequest0.c, registerCreationOptionsRequest0.d, registerCreationOptionsRequest0.a, registerCreationOptionsRequest0.b, bxzq.c, registerCreationOptionsRequest0.e, bxye0) == object1 ? object1 : new RegisterCreationOptionsResponse();
            }
            case 1: {
                ibnx.b(object0);
                return new RegisterCreationOptionsResponse();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(RegistrationRequest registrationRequest0, ibrl ibrl0) {
        bxyf bxyf0;
        if((ibrl0 instanceof bxyf)) {
            bxyf0 = (bxyf)ibrl0;
            int v = bxyf0.c;
            if((v & 0x80000000) == 0) {
                bxyf0 = new bxyf(this, ibrl0);
            }
            else {
                bxyf0.c = v - 0x80000000;
            }
        }
        else {
            bxyf0 = new bxyf(this, ibrl0);
        }
        Object object0 = bxyf0.a;
        Object object1 = ibrx.a;
        switch(bxyf0.c) {
            case 0: {
                ibnx.b(object0);
                bxxv bxxv0 = new bxxv(bxxf.a);
                bxyf0.c = 1;
                return this.g(bxxv0, registrationRequest0.c, registrationRequest0.f, registrationRequest0.a, registrationRequest0.b, bxzq.b, registrationRequest0.g, bxyf0) == object1 ? object1 : new RegistrationResponse();
            }
            case 1: {
                ibnx.b(object0);
                return new RegistrationResponse();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object f(RegisterExportRequest registerExportRequest0, ibrl ibrl0) {
        bxyg bxyg0;
        if((ibrl0 instanceof bxyg)) {
            bxyg0 = (bxyg)ibrl0;
            int v = bxyg0.c;
            if((v & 0x80000000) == 0) {
                bxyg0 = new bxyg(this, ibrl0);
            }
            else {
                bxyg0.c = v - 0x80000000;
            }
        }
        else {
            bxyg0 = new bxyg(this, ibrl0);
        }
        Object object0 = bxyg0.a;
        Object object1 = ibrx.a;
        switch(bxyg0.c) {
            case 0: {
                ibnx.b(object0);
                bxxv bxxv0 = new bxxv(bxxf.c);
                bxyg0.c = 1;
                return this.g(bxxv0, "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC", registerExportRequest0.c, registerExportRequest0.b, registerExportRequest0.a, bxzq.d, "", bxyg0) == object1 ? object1 : new RegisterExportResponse();
            }
            case 1: {
                ibnx.b(object0);
                return new RegisterExportResponse();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object g(bxxe bxxe0, String s, String s1, byte[] arr_b, byte[] arr_b1, bxzq bxzq0, String s2, ibrl ibrl0) {
        bxzq bxzq1;
        bxyh bxyh0;
        if((ibrl0 instanceof bxyh)) {
            bxyh0 = (bxyh)ibrl0;
            int v = bxyh0.c;
            if((v & 0x80000000) == 0) {
                bxyh0 = new bxyh(this, ibrl0);
            }
            else {
                bxyh0.c = v - 0x80000000;
            }
        }
        else {
            bxyh0 = new bxyh(this, ibrl0);
        }
        Object object0 = bxyh0.a;
        Object object1 = ibrx.a;
        switch(bxyh0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    List list0 = bxyk.a(this.e, this.b);
                    bxzq1 = bxzq0;
                    bxxw bxxw0 = s1.length() == 0 ? new bxxw(s, null, null, arr_b, arr_b1, s2, 6) : new bxxw(null, s, ibpo.b(s1), arr_b, arr_b1, s2, 1);
                    bxzq1 = bxzq0;
                    bxyh0.d = bxzq1;
                    bxyh0.c = 1;
                    object0 = bxxe0.e(this.b, list0, bxxw0, bxyh0);
                    if(object0 == object1) {
                        return object1;
                    label_23:
                        bxzq bxzq2 = bxyh0.d;
                        bxzq1 = bxzq2;
                        ibnx.b(object0);
                        bxzq1 = bxzq2;
                    }
                    if(((Boolean)object0).booleanValue()) {
                        return ibom.a;
                    }
                    goto label_33;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    break;
                }
            }
            case 1: {
                goto label_23;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        bxzl.g(this.d, this.c, bxzq1, bxzp.d);
        throw new cjuh(8, "The callingPackage, " + this.b + ", does not exist.", null, packageManager$NameNotFoundException0);
    label_33:
        bxzl.g(this.d, this.c, bxzq1, bxzp.e);
        throw new cjuh(8, "Failed to persist registry data.");
    }

    public final Object h(String s, ibrl ibrl0) {
        bxtw bxtw0;
        bxyb bxyb0;
        if((ibrl0 instanceof bxyb)) {
            bxyb0 = (bxyb)ibrl0;
            int v = bxyb0.c;
            if((v & 0x80000000) == 0) {
                bxyb0 = new bxyb(this, ibrl0);
            }
            else {
                bxyb0.c = v - 0x80000000;
            }
        }
        else {
            bxyb0 = new bxyb(this, ibrl0);
        }
        Object object0 = bxyb0.a;
        Object object1 = ibrx.a;
        switch(bxyb0.c) {
            case 0: {
                ibnx.b(object0);
                Context context0 = this.e;
                String s1 = this.b;
                kvx kvx0 = byca.b(context0, s1, null);
                if(kvx0 == null) {
                    bxzl.c(this.d, this.c, bxzg.e);
                    throw new cjuh(10, a.a(s1, "The calling package ", " does not exist."));
                }
                kwt kwt0 = new kwt(kvx0);
                ahpw ahpw0 = new bxql(context0).b;
                Bundle bundle0 = new Bundle();
                kvu.b(bundle0, kwt0.a);
                azzc azzc0 = new azzc();
                azzc0.a = new ahuh(((ahul)ahpw0), bundle0, s);
                azzc0.d = 0x6B0;
                azzc0.c = new Feature[]{amju.k};
                bxsy bxsy0 = bxsy.g(((azts)ahpw0).iG(azzc0.a())).k(new bxqd()).e(new bxlw(aztb.class).a(new bxqe()));
                bxyb0.c = 1;
                object0 = icpu.c(bxsy0, bxyb0);
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
        kkw kkw0 = ((AuxiliaryClearCredentialResponse)object0).a;
        if(kkw0 == null) {
            bxzl.c(this.d, this.c, bxzg.b);
            return new ClearCredentialStateResponse();
        }
        bxzl.c(this.d, this.c, bxzg.d);
        if((kkw0 instanceof kkz)) {
        }
        else if((kkw0 instanceof kkx)) {
        }
        else if((kkw0 instanceof kla)) {
        }
        else if((kkw0 instanceof kky)) {
        }
        else if((kkw0 instanceof kkv)) {
        }
        bxtw0 = new bxtw(kkw0.getMessage());
        throw new cjuh(8, bxtw0.getMessage(), null, bxtw0);
    }
}

