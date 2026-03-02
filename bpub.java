import android.accounts.Account;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class bpub implements bptz {
    public final bpvx a;
    private static final bboh b;
    private final bpuq c;
    private final hftc d;
    private final Executor e;

    static {
        bpub.b = bpsv.a("WearDataLayerEventHandlerImpl");
    }

    public bpub(bpvx bpvx0, bpuq bpuq0, hftc hftc0, Executor executor0) {
        this.a = bpvx0;
        this.c = bpuq0;
        this.d = hftc0;
        this.e = executor0;
    }

    @Override  // fcfc
    public final void a(MessageEventParcelable messageEventParcelable0) {
        gfsx gfsx0;
        gmcd gmcd0;
        gmcd gmcd1;
        gfsx gfsx1;
        String s1;
        String s = messageEventParcelable0.b;
        if(bpsr.c()) {
            try {
                s1 = messageEventParcelable0.d;
                boolean z = false;
                switch(s) {
                    case "/findmydevice/provisioning-info": {
                        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fqyc.a), messageEventParcelable0.c, 0, messageEventParcelable0.c.length, this.d);
                        ProtoLiteMessage.P_makeImmutable(hftv1);
                        fquh.a("provisionWearableDevice", gdta.g(this.a.d(s1, ((fqyc)hftv1))).i(new bpua(this, s1, ((fqyc)hftv1)), this.e));
                        return;
                    }
                    case "/findmydevice/provisioning-state-change": {
                        ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)frac.a), messageEventParcelable0.c, 0, messageEventParcelable0.c.length, this.d);
                        ProtoLiteMessage.P_makeImmutable(hftv2);
                        frac frac0 = (frac)hftv2;
                        bpvx bpvx0 = this.a;
                        if(bpsy.a(frac0)) {
                            ((ggtj)bpxd.a.h()).x("Connected wearable has become provisioned.");
                            try {
                                gfsx1 = bpsq.b(((bpxd)bpvx0).g, frac0.f);
                            }
                            catch(IOException | acse exception1) {
                                a.ae(bpxd.a.i(), "Error while getting the owner account of the updated device.", exception1);
                                gmcd1 = gmbx.a;
                                fquh.a("handleProvisioningStateReport", gmcd1);
                                return;
                            }
                            if(gfsx1.i()) {
                                Account account1 = (Account)gfsx1.d();
                                bpvp bpvp0 = ((boou)((bpxd)bpvx0).e).a(account1).h();
                                gftb.checkTrue(bpsy.a(frac0));
                                if(frac0.c == 2 && fqzz.a(((Integer)frac0.d).intValue()) == 3) {
                                    z = true;
                                }
                                gdta gdta1 = gdta.g(((bpvw)bpvp0).g.j((frac0.e == null ? gsyz.a : frac0.e), bpxr.d(z)));
                                bpwm bpwm0 = new bpwm(((bpxd)bpvx0), s1);
                                gmcd1 = gdta1.f(bnlq.class, bpwm0, ((bpxd)bpvx0).h);
                            }
                            else {
                                ((ggtj)bpxd.a.i()).x("Cannot find the owner account of the updated device.");
                                gmcd1 = gmbx.a;
                            }
                        }
                        else {
                            ((ggtj)bpxd.a.h()).x("Connected wearable has become unprovisioned.");
                            gmcd1 = ((bpxd)bpvx0).i((frac0.e == null ? gsyz.a : frac0.e));
                        }
                        fquh.a("handleProvisioningStateReport", gmcd1);
                        return;
                    }
                    case "/findmydevice/spot-owner-keys-request": {
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fqzp.a), messageEventParcelable0.c, 0, messageEventParcelable0.c.length, this.d);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        bpuq bpuq0 = this.c;
                        if(!hsxd.f()) {
                            ((ggtj)bpvj.a.h()).x("Owner key publishing to wearables is disabled.");
                            gmcd0 = gmbx.a;
                            fquh.a("handleOwnerKeyRequest", gmcd0);
                            return;
                        }
                        ArrayList arrayList0 = new ArrayList();
                        Iterator iterator0 = ((fqzp)hftv0).b.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                gmcd0 = gdta.g(gdtd.a(arrayList0)).i(new bput(((bpvj)bpuq0), ((fqzp)hftv0), s1), ((bpvj)bpuq0).e);
                                fquh.a("handleOwnerKeyRequest", gmcd0);
                                return;
                            }
                            Object object0 = iterator0.next();
                            String s2 = (String)object0;
                            try {
                                gfsx0 = bpsq.b(((bpvj)bpuq0).d, s2);
                            }
                            catch(IOException | acse exception0) {
                                a.ae(bpvj.a.j(), "Failed getting account by OID.", exception0);
                                gfsx0 = gfqx.a;
                            }
                            if(gfsx0.i()) {
                                Account account0 = (Account)gfsx0.d();
                                gdta gdta0 = gdta.g(((boou)((bpvj)bpuq0).b).a(account0).b().a());
                                bpvh bpvh0 = new bpvh();
                                arrayList0.add(gdta0.e(Throwable.class, bpvh0, gmap.a));
                            }
                            else {
                                arrayList0.add(gdtd.c(gfqx.a));
                            }
                        }
                    }
                    default: {
                        ((ggtj)bpub.b.j()).R("Unrecognized message from %s at %s", s1, messageEventParcelable0.b);
                        return;
                    }
                }
            }
            catch(hfur hfur0) {
                ((ggtj)((ggtj)bpub.b.i()).s(hfur0)).R("Failed parsing message from %s at %s", s1, messageEventParcelable0.b);
                return;
            }
        }
        ((ggtj)((ggtj)bpub.b.h()).o(10, TimeUnit.MINUTES)).x("Finder wearable use cases are disabled.");
    }

    @Override  // fcec
    public final void b(fcee fcee0) {
        fcee0.a();
        if(!bpsr.c()) {
            ((ggtj)((ggtj)bpub.b.h()).o(10, TimeUnit.MINUTES)).x("Finder wearable use cases are disabled.");
            return;
        }
        switch(fcee0.a()) {
            case "/findmydevice/finder_wearable_capability": {
                fquh.a("syncDataForConnectedWearablesRegistration", this.a.e());
                return;
            }
            case "/findmydevice/spot_owner_key_consumer_capability": {
                fquh.a("lenientlyPublishOwnerKeysMetadata", this.c.a());
                return;
            }
            default: {
                ((ggtj)bpub.b.j()).B("Unrecognized capability: %s", fcee0.a());
            }
        }
    }
}

