import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;

public final class zmd implements Callable {
    public final zmi a;
    public final grxw b;
    public final long c;
    public final Set d;

    public zmd(zmi zmi0, grxw grxw0, long v, Set set0) {
        this.a = zmi0;
        this.b = grxw0;
        this.c = v;
        this.d = set0;
    }

    @Override
    public final Object call() {
        fhrt fhrt1;
        boolean z1;
        String s2;
        long v4;
        int v3;
        grxr grxr0;
        zjt zjt0;
        String s1;
        Object object0;
        zmi zmi0 = this.a;
        zjp zjp0 = zmi0.g;
        if(!aaua.c(((zjt)zjp0).c)) {
            throw new iapl(iapk.j);
        }
        grxw grxw0 = this.b;
        String s = aaus.a();
        boolean z = cchl.d();
        int v = ((zjt)zjp0).f.a();
        zjt.a.j("requestResource(%s): requesting via gRPC", new Object[]{((int)grxw0.c)});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grvz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fhrt fhrt0 = zmi0.d;
        grvz grvz0 = (grvz)hftp0.b_message;
        grxw0.getClass();
        grvz0.d = grxw0;
        grvz0.b |= 2;
        grxq grxq0 = ((zjt)zjp0).c(fhrt0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        grxq0.getClass();
        ((grvz)hftv0).c = grxq0;
        ((grvz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvz grvz1 = (grvz)hftp0.b_message;
        hfuo hfuo0 = grvz1.e;
        if(!hfuo0.c()) {
            grvz1.e = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.d, grvz1.e);
        grvz grvz2 = (grvz)hftp0.N_build();
        baqr baqr0 = ((zjt)zjp0).b();
        long v1 = SystemClock.elapsedRealtime();
        try {
            object0 = new zec(((zlo)((zjt)zjp0).e).a(), cmlp.a, cjxo.c).a(baqr0, grvz2);
            s1 = String.format("GetResource(%s)", ((int)grxw0.c));
            zjt0 = (zjt)zjp0;
        }
        catch(Exception exception0) {
            ((zjt)zjp0).e("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", String.format("GetResource(%s)", ((int)grxw0.c)), grxw0, v1, exception0);
            throw exception0;
        }
        try {
            zjt0.f("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", s1, grxw0, v1);
            grxr0 = object0.c;
        }
        catch(Exception exception0) {
            grxw0 = grxw0;
            ((zjt)zjp0).e("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/GetResource", String.format("GetResource(%s)", ((int)grxw0.c)), grxw0, v1, exception0);
            throw exception0;
        }
        if(grxr0 == null) {
            grxr0 = grxr.a;
        }
        long v2 = this.c;
        batl.l(((ProtoLiteMessage)(grxr0.e == null ? grxw.a : grxr0.e)).equals(grxw0));
        ArrayList arrayList0 = new ArrayList();
        if((object0.b & 1) == 0) {
            v3 = v;
            v4 = v2;
            s2 = s;
            z1 = z;
            fhrt1 = fhrt0;
        }
        else {
            v3 = v;
            v4 = v2;
            s2 = s;
            z1 = z;
            fhrt1 = fhrt0;
            arrayList0.add(((zjt)zjp0).a((object0.c == null ? grxr.a : object0.c), v4, s2, z1, fhrt1, v3));
        }
        for(Object object1: object0.d) {
            arrayList0.add(((zjt)zjp0).a(((grxr)object1), v4, s2, z1, fhrt1, v3));
        }
        ((zjt)zjp0).d(new zjs(((zjt)zjp0), arrayList0));
        return object0;
    }
}

