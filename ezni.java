import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import j..time.Instant;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public final class ezni extends ezna {
    private static final ggtl h;
    private final ezss i;
    private final ezrk j;
    private long n;

    static {
        ezni.h = ezqu.c();
    }

    public ezni(bkcm bkcm0, baqr baqr0, ezss ezss0, ezrk ezrk0, FacsCacheCallOptions facsCacheCallOptions0, ezqo ezqo0, fpfg fpfg0, bkcb bkcb0) {
        super("GetActivityControlsSettingsOperation", bkcm0, baqr0, facsCacheCallOptions0, ezqo0, fpfg0, hffs.i, bkcb0);
        this.i = ezss0;
        this.j = ezrk0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        long v2;
        boolean z;
        hffw hffw0;
        ezmc ezmc0;
        ggtl ggtl0 = ezni.h;
        ggtl0.h().ar(0x4431).B("Executing operation \'%s\'...", this.q());
        this.n = SystemClock.elapsedRealtime();
        this.d();
        this.e(hzdj.a.l().z());
        this.e.b();
        gmcd gmcd0 = glzd.g(this.i.a(this.b.b), new eznh(), gmap.a);
        try {
            ezmc0 = hzdj.u() ? ((ezmc)eztg.b(gmcd0, "GetActivityControlsSettingsOperation")) : ((ezmc)eztg.a(gmcd0));
        }
        catch(CancellationException cancellationException0) {
            ezni.h.h().ar(0x4433).x("Operation failed with a cancellation exception!");
            throw new cjuh(16, "Operation cancelled.", null, cancellationException0);
        }
        if(ezmc0 == null) {
            ggtl0.h().ar(17460).B("Forwarding operation \'%s\' to internal FACS API...", this.q());
            try {
                byte[] arr_b = (byte[])ezni.h(this.g.e(new FacsInternalSyncCallOptions(false)));
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hffw.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                hffw0 = (hffw)hftv0;
                z = true;
            }
            catch(hfur hfur0) {
                throw new cjuh(35002, "Failure parsing the bytes returned by the internal sync API call.", null, hfur0);
            }
        }
        else {
            hffw0 = ezmc0.c == null ? hffw.a : ezmc0.c;
            z = false;
        }
        ezrk ezrk0 = this.j;
        if(ezrk0.b()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hffw0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hffw0));
            hfem hfem0 = ezrk0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hffw hffw1 = (hffw)hftp0.b_message;
            hfem0.getClass();
            hffw1.d = hfem0;
            hffw1.b |= 1;
            hffw0 = (hffw)hftp0.N_build();
        }
        ezqo ezqo0 = this.d;
        String s = this.c();
        long v = this.b();
        long v1 = SystemClock.elapsedRealtime() - this.n;
        if(z) {
            v2 = 0L;
        }
        else {
            v2 = (ezmc0.b & 2) == 0 ? -1L : Instant.now().toEpochMilli() - ezmc0.d;
        }
        hfuo hfuo0 = hffw0.c;
        ggdy ggdy0 = new ggdy();
        for(Iterator iterator0 = hfuo0.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
            Object object0 = iterator0.next();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfes.a).v_newBuilder();
            int v3 = ((hffv)object0).c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((hfes)hftv1).b |= 1;
            ((hfes)hftv1).c = v3;
            boolean z1 = ((hffv)object0).f;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((hfes)hftv2).b |= 4;
            ((hfes)hftv2).e = z1;
            boolean z2 = ((hffv)object0).d;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfes hfes0 = (hfes)hftp1.b_message;
            hfes0.b |= 2;
            hfes0.d = z2;
            ggdy0.i(((hfes)hftp1.N_build()));
            hffw0 = hffw0;
        }
        if(hzdj.r()) {
            hfeq hfeq0 = (hfeq)((ProtoLiteMessage)hfet.a).v_newBuilder();
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet0 = (hfet)hfeq0.b_message;
            hfet0.b |= 1;
            hfet0.c = 0;
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet1 = (hfet)hfeq0.b_message;
            hfet1.b |= 2;
            hfet1.d = v1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfer.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((hfer)hftv3).b |= 1;
            ((hfer)hftv3).c = s;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            hfer hfer0 = (hfer)hftp2.b_message;
            hfer0.b |= 2;
            hfer0.d = v;
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet2 = (hfet)hfeq0.b_message;
            hfer hfer1 = (hfer)hftp2.N_build();
            hfer1.getClass();
            hfet2.e = hfer1;
            hfet2.b |= 4;
            hfeq0.a(ggdy0.h());
            if(!hfeq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hfeq0).ensureMutable();
            }
            hfet hfet3 = (hfet)hfeq0.b_message;
            hfet3.b |= 8;
            hfet3.f = v2;
            hfet hfet4 = (hfet)((ProtoLiteBuilder)hfeq0).N_build();
            cioq cioq0 = cioq.v();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hffn hffn0 = (hffn)hftp4.b_message;
            hfet4.getClass();
            hffn0.c = hfet4;
            hffn0.b = 3;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hfgj hfgj0 = (hfgj)hftp3.b_message;
            hffn hffn1 = (hffn)hftp4.N_build();
            hffn1.getClass();
            hfgj0.d = hffn1;
            hfgj0.c = 3;
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hfgc hfgc0 = (hfgc)hftp5.b_message;
            hfgc0.b |= 1;
            hfgc0.c = "com.google.android.gms#udc-facs";
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hfgj hfgj1 = (hfgj)hftp3.b_message;
            hfgc hfgc1 = (hfgc)hftp5.N_build();
            hfgc1.getClass();
            hfgj1.f = hfgc1;
            hfgj1.b |= 2;
            cczb cczb0 = cioq0.c(((ProtoLiteMessage)(((hfgj)hftp3.N_build()))));
            cczb0.c = (int)1007;
            cczb0.a();
        }
        else {
            long v4 = (long)(((Long)ezqo0.c.mr()));
            if(ezqo0.d.a(v4)) {
                hfeq hfeq1 = (hfeq)((ProtoLiteMessage)hfet.a).v_newBuilder();
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet5 = (hfet)hfeq1.b_message;
                hfet5.b |= 1;
                hfet5.c = 0;
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet6 = (hfet)hfeq1.b_message;
                hfet6.b |= 2;
                hfet6.d = v1;
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfer.a).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp6.b_message;
                ((hfer)hftv4).b |= 1;
                ((hfer)hftv4).c = s;
                if(!hftv4.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hfer hfer2 = (hfer)hftp6.b_message;
                hfer2.b |= 2;
                hfer2.d = v;
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet7 = (hfet)hfeq1.b_message;
                hfer hfer3 = (hfer)hftp6.N_build();
                hfer3.getClass();
                hfet7.e = hfer3;
                hfet7.b |= 4;
                hfeq1.a(ggdy0.h());
                if(!hfeq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfeq1).ensureMutable();
                }
                hfet hfet8 = (hfet)hfeq1.b_message;
                hfet8.b |= 8;
                hfet8.f = v2;
                hfet hfet9 = (hfet)((ProtoLiteBuilder)hfeq1).N_build();
                ayud ayud0 = (ayud)ezqo0.b.mr();
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hfgj hfgj2 = (hfgj)hftp7.b_message;
                hfgj2.b |= 1;
                hfgj2.e = (int)v4;
                ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                hffn hffn2 = (hffn)hftp8.b_message;
                hfet9.getClass();
                hffn2.c = hfet9;
                hffn2.b = 3;
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hfgj hfgj3 = (hfgj)hftp7.b_message;
                hffn hffn3 = (hffn)hftp8.N_build();
                hffn3.getClass();
                hfgj3.d = hffn3;
                hfgj3.c = 3;
                ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                if(!hftp9.b_message.isImmutable()) {
                    hftp9.ensureMutable();
                }
                hfgc hfgc2 = (hfgc)hftp9.b_message;
                hfgc2.b |= 1;
                hfgc2.c = "com.google.android.gms#udc-facs";
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hfgj hfgj4 = (hfgj)hftp7.b_message;
                hfgc hfgc3 = (hfgc)hftp9.N_build();
                hfgc3.getClass();
                hfgj4.f = hfgc3;
                hfgj4.b |= 2;
                ayuc ayuc0 = ayud0.i(((MessageLite)hftp7.N_build()));
                ayuc0.k(1007);
                ayuc0.d();
            }
        }
        ezni.h.h().ar(0x4432).B("Operation \'%s\' successful!", this.q());
        bkcm bkcm0 = this.a;
        GetActivityControlsSettingsResult getActivityControlsSettingsResult0 = new GetActivityControlsSettingsResult(hffw0.toBytesArray());
        bkcm0.c(Status.b, getActivityControlsSettingsResult0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        long v = SystemClock.elapsedRealtime();
        this.g(status0.i, v - this.n);
        this.a.c(status0, null);
    }
}

