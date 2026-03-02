import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import dagger.Reusable;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@Reusable
final class bpaq implements bpam {
    public static final int a;
    private static final bboh b;
    private final Context c;

    static {
        bpaq.b = bboh.b("LocReportingSvcClient", bbcu.eD);
    }

    public bpaq(Context context0) {
        this.c = context0;
    }

    @Override  // bpam
    public final void a(gsyz gsyz0) {
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.CLEAR_PENDING_SIGHTING");
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("device_id", gsyz0.b);
        context0.startService(intent0);
    }

    @Override  // bpam
    public final void b(gsyz gsyz0, Account account0, gtbr gtbr0) {
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.EID_CACHE_ADD_SINGLE_DEVICE");
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("device_id", gsyz0.b);
        intent0.putExtra("account", account0);
        hfxk.k(intent0, "precomputed_public_key_id", ((MessageLite)gtbr0));
        context0.startService(intent0);
    }

    @Override  // bpam
    public final void c() {
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.EID_CACHE_CLEAN_REMOVED_ACCOUNTS");
        if(intent0 == null) {
            return;
        }
        context0.startService(intent0);
    }

    @Override  // bpam
    public final void d() {
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.EID_CACHE_CLEAR");
        if(intent0 == null) {
            return;
        }
        context0.startService(intent0);
    }

    @Override  // bpam
    public final void e(Account account0, List list0) {
        gfsx gfsx1;
        byte[] arr_b;
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.EID_CACHE_STORE_ALL_DEVICES");
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("account", account0);
        intent0.putStringArrayListExtra("device_id_list", ((ArrayList)Collection.-EL.stream(list0).filter(new bpan()).map(new bpao()).collect(Collectors.toCollection(new bpap()))));
        for(int v = 0; v < list0.size(); ++v) {
            gtbr gtbr0 = ((fqvu)list0.get(v)).b;
            if(gtbr0.b.isEmpty()) {
                arr_b = new byte[0];
            }
            else {
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(gtbr0.b.size() * 13 + 2);
                hfwn hfwn0 = ((gtbs)gtbr0.b.get(0)).c;
                if(hfwn0 == null) {
                    hfwn0 = hfwn.a;
                }
                byteBuffer0.putShort(((short)(((int)(hfwn0.b & 0x3FFL)))));
                for(Object object0: gtbr0.b) {
                    gtbs gtbs0 = (gtbs)object0;
                    if((gtbs0.b & 4) == 0) {
                        gfsx1 = gfsx.m(Byte.valueOf(((byte)0)));
                    }
                    else {
                        gfsx gfsx0 = fquo.b(((byte)gtbs0.e));
                        if(gfsx0.i()) {
                            gfsx1 = gfsx.m(Byte.valueOf(((byte)(((fquo)gfsx0.d()).ordinal() + 1))));
                        }
                        else {
                            ((ggtj)((ggtj)((ggtj)bpaq.b.j()).p(100)).ar(0x12FF)).z("encodeComponentSetId invalid component set id: %d", gtbs0.e);
                            gfsx1 = gfqx.a;
                        }
                    }
                    if(gfsx1.i()) {
                        byteBuffer0.putInt(((int)((gtbs0.c == null ? hfwn.a : gtbs0.c).b >> 10))).put((gtbs0.d == null ? gtag.a : gtbs0.d).b.toByteArray(), 0, 8).put(((Byte)gfsx1.d()).byteValue());
                    }
                }
                arr_b = byteBuffer0.array();
            }
            intent0.putExtra("precomputed_public_key_id_list" + v, arr_b);
        }
        context0.startService(intent0);
    }

    @Override  // bpam
    public final void f(gsyz gsyz0, fqus fqus0, Account account0, boolean z, haea haea0) {
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.HANDLE_SIGHTED_DEVICE");
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("device_id", gsyz0.b);
        intent0.putExtra("component_set_or_componentless", fqus0.name());
        intent0.putExtra("account", account0);
        intent0.putExtra("fast_track", z);
        intent0.putExtra("sighting_source", haea0.a());
        context0.startService(intent0);
    }

    @Override  // bpam
    public final void g(Account account0) {
        Context context0 = this.c;
        Intent intent0 = bpsp.a(context0, "com.google.android.gms.findmydevice.spot.locationreporting.LocationReportingServiceIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.EID_CACHE_READ_EIDS_FROM_STORAGE");
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("account", account0);
        context0.startService(intent0);
    }
}

