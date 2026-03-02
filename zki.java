import android.os.SystemClock;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class zki implements Callable {
    public final zkj a;
    public final grxw b;
    public final grxt c;
    public final fhrt d;

    public zki(zkj zkj0, grxw grxw0, grxt grxt0, fhrt fhrt0) {
        this.a = zkj0;
        this.b = grxw0;
        this.c = grxt0;
        this.d = fhrt0;
    }

    @Override
    public final Object call() {
        grxr grxr0;
        zjt zjt0;
        String s;
        gryw gryw0;
        zkj zkj0 = this.a;
        zjp zjp0 = zkj0.c;
        if(!aaua.c(((zjt)zjp0).c)) {
            throw new iapl(iapk.j);
        }
        grxw grxw0 = this.b;
        zjt.a.j("requestResource(%s): requesting via gRPC", new Object[]{((int)grxw0.c)});
        gryv gryv0 = gryv.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gryv0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gryv)hftv0).e = grxw0;
        ((gryv)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        grxt grxt0 = this.c;
        int v = grxt0.d;
        ((gryv)hftp0.b_message).d = v;
        ((gryv)hftp0.b_message).b |= 2;
        grxq grxq0 = ((zjt)zjp0).c(this.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gryv gryv1 = (gryv)hftp0.b_message;
        grxq0.getClass();
        gryv1.c = grxq0;
        gryv1.b |= 1;
        gryv gryv2 = (gryv)hftp0.N_build();
        baqr baqr0 = ((zjt)zjp0).b();
        long v1 = SystemClock.elapsedRealtime();
        try {
            zec zec0 = new zec(((zlo)((zjt)zjp0).e).a(), cmlp.a, cjxr.b);
            if(zec.c == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)gryv0));
                ibjh ibjh1 = new ibjh(((MessageLite)gryw.a));
                zec.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/SetResourceDismissalState", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            gryw0 = (gryw)zec0.d.callUnaryWithAuth(zec.c, baqr0, gryv2, ((long)zec.a), TimeUnit.MILLISECONDS, zec0.e);
            s = String.format("SetResourceDismissalState(%s, %s)", ((int)grxw0.c), v);
            zjt0 = (zjt)zjp0;
        }
        catch(Exception exception0) {
            ((zjt)zjp0).e("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/SetResourceDismissalState", String.format("SetResourceDismissalState(%s, %s)", ((int)grxw0.c), ((int)grxt0.d)), grxw0, v1, exception0);
            throw exception0;
        }
        try {
            zjt0.f("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/SetResourceDismissalState", s, grxw0, v1);
            grxr0 = gryw0.b;
        }
        catch(Exception exception0) {
            grxw0 = grxw0;
            ((zjt)zjp0).e("google.internal.identity.accountsettings.mobile.v1.AccountSettingsMobile/SetResourceDismissalState", String.format("SetResourceDismissalState(%s, %s)", ((int)grxw0.c), ((int)grxt0.d)), grxw0, v1, exception0);
            throw exception0;
        }
        if(grxr0 == null) {
            grxr0 = grxr.a;
        }
        batl.l(((ProtoLiteMessage)(grxr0.e == null ? grxw.a : grxr0.e)).equals(grxw0));
        ((zjt)zjp0).d(new zjr(((zjt)zjp0), grxw0));
        zkj.a.j("updating the resource %s with %s", new Object[]{((int)grxw0.c), grxt0});
        aatb aatb0 = zkj0.f;
        ggfn ggfn0 = new ggfn();
        for(Object object0: zkj0.d.c.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            zjv zjv0 = (zjv)map$Entry0.getKey();
            if(((ProtoLiteMessage)zjv0.a).equals(aatb0) && ((ProtoLiteMessage)zjv0.b).equals(grxw0)) {
                ggfn0.i(((lqi)map$Entry0.getValue()));
            }
        }
        ggqj ggqj0 = ggfn0.h().om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            lqi lqi0 = (lqi)object1;
            zho zho0 = (zho)lqi0.ij();
            if(zho0 != null) {
                grxr grxr1 = zho0.a;
                if(grxr1 != null) {
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)grxr1).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)grxr1));
                    boolean z = grxt0 == grxt.b;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    grxr grxr2 = (grxr)hftp1.b_message;
                    grxr2.b |= 4;
                    grxr2.g = z;
                    lqi0.ii(new zho(((grxr)hftp1.N_build()), zho0.b, zho0.c));
                }
            }
        }
        return null;
    }
}

