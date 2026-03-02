import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest.SettingChange;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ezod extends eznd {
    private static final bboh a;
    private final UdcWriteLocalSettingsRequest b;
    private final ezog n;
    private final gful_cronetEngineProvider o;
    private final gful_cronetEngineProvider p;

    static {
        ezod.a = bboh.d();
    }

    public ezod(Context context0, ezpn ezpn0, baqr baqr0, String s, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest0) {
        super(context0, ezpn0, baqr0, s, "WriteLocalSettingsOperation");
        this.b = udcWriteLocalSettingsRequest0;
        this.n = new ezog(this.c, this.g);
        this.o = gful0;
        this.p = gful1;
    }

    private final Status b() {
        Context context0 = this.c;
        if(!bbmq.Y(context0)) {
            String s = this.e.d;
            if(!bbmt.e(hzdj.a.l().D().split(","), s)) {
                ((ggtj)((ggtj)ezod.a.j()).ar(0x444E)).B("writeLocalSettings called by non-whitelisted package: %s", this.e.d);
                return Status.d;
            }
        }
        boolean z = false;
        boolean z1 = hzdj.s() && hzdj.a.l().Q();
        if(z1) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfem.a).v_newBuilder();
            UdcWriteLocalSettingsRequest.SettingChange[] arr_udcWriteLocalSettingsRequest$SettingChange = this.b.a;
            for(int v = 0; v < arr_udcWriteLocalSettingsRequest$SettingChange.length; ++v) {
                UdcWriteLocalSettingsRequest.SettingChange udcWriteLocalSettingsRequest$SettingChange0 = arr_udcWriteLocalSettingsRequest$SettingChange[v];
                switch(udcWriteLocalSettingsRequest$SettingChange0.a) {
                    case 9: {
                        boolean z2 = udcWriteLocalSettingsRequest$SettingChange0.b;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hfem hfem0 = (hfem)hftp0.b_message;
                        hfem0.b |= 2;
                        hfem0.d = z2;
                        break;
                    }
                    case 10: {
                        boolean z3 = udcWriteLocalSettingsRequest$SettingChange0.b;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hfem hfem1 = (hfem)hftp0.b_message;
                        hfem1.b |= 1;
                        hfem1.c = z3;
                    }
                }
            }
            int v1 = ((hfem)hftp0.b_message).b;
            if((v1 & 2) != 0 || (v1 & 1) != 0) {
                Object object0 = this.o.mr();
                hfgs hfgs0 = (hfgs)((ProtoLiteMessage)hfgu.a).v_newBuilder();
                if(!hfgs0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hfgs0).ensureMutable();
                }
                hfgu hfgu0 = (hfgu)hfgs0.b_message;
                hfem hfem2 = (hfem)hftp0.N_build();
                hfem2.getClass();
                hfgu0.f = hfem2;
                hfgu0.b |= 8;
                gmcd gmcd0 = ((fpfv)object0).c(((hfgu)((ProtoLiteBuilder)hfgs0).N_build()));
                if(hzdj.u()) {
                    eztg.b(gmcd0, "WriteLocalSettingsOperation");
                }
                else {
                    eztg.a(gmcd0);
                }
            }
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            UdcWriteLocalSettingsRequest.SettingChange[] arr_udcWriteLocalSettingsRequest$SettingChange1 = this.b.a;
            for(int v2 = 0; v2 < arr_udcWriteLocalSettingsRequest$SettingChange1.length; ++v2) {
                UdcWriteLocalSettingsRequest.SettingChange udcWriteLocalSettingsRequest$SettingChange1 = arr_udcWriteLocalSettingsRequest$SettingChange1[v2];
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfqn.a).v_newBuilder();
                int v3 = udcWriteLocalSettingsRequest$SettingChange1.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hfqn)hftv0).b |= 1;
                ((hfqn)hftv0).c = v3;
                int v4 = udcWriteLocalSettingsRequest$SettingChange1.b ? 3 : 4;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hfqn)hftp1.b_message).d = v4 - 1;
                ((hfqn)hftp1.b_message).b |= 2;
                arrayList0.add(((hfqn)hftp1.N_build()));
            }
            hfqn[] arr_hfqn = (hfqn[])arrayList0.toArray(new hfqn[0]);
            this.n.a.d(arr_hfqn);
            if(hzdj.a.l().M()) {
                ggtj ggtj0 = (ggtj)((ggtj)ezod.a.h()).ar(0x444D);
                baqr baqr0 = this.e;
                ggtj0.R("writeLocalSettings() sending FACS_CACHE_UPDATED[_EXPLICIT] broadcasts for user %s. Package: %s", baqr0.b, baqr0.d);
                new ezsg(context0).a(baqr0.b);
            }
        }
        if(hzdj.d() == 0L) {
        label_78:
            if(hzdj.r() && !ccze.b(cioj.v())) {
                try {
                label_79:
                    UdcCacheResponse udcCacheResponse0 = null;
                    UdcCacheRequest udcCacheRequest0 = new UdcCacheRequest(new int[]{10, 9});
                    udcCacheResponse0 = (UdcCacheResponse)evrg.o(((ezms)this.p.mr()).e(udcCacheRequest0), hzdj.a.l().l(), TimeUnit.MILLISECONDS);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    throw new cjuh(14, "Thread interrupted while reading for comparison logging!", null, interruptedException0);
                }
                catch(ExecutionException | TimeoutException exception0) {
                    ezqu.a().d().s(exception0).ar(0x444C).x("Exception while reading back just-written local settings!");
                }
                UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest0 = this.b;
                ezqo ezqo0 = eztl.a;
                if(!hzdj.r() || ccze.b(cioj.v())) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hffl.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hffk.a).v_newBuilder();
                    Iterable iterable0 = gggq.j(Arrays.asList(udcWriteLocalSettingsRequest0.a), new ezqm());
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hffk hffk0 = (hffk)hftp3.b_message;
                    hfuo hfuo0 = hffk0.b;
                    if(!hfuo0.c()) {
                        hffk0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    hfrj.E(iterable0, hffk0.b);
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hffl hffl0 = (hffl)hftp2.b_message;
                    hffk hffk1 = (hffk)hftp3.N_build();
                    hffk1.getClass();
                    hffl0.c = hffk1;
                    hffl0.b |= 1;
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hfew.a).v_newBuilder();
                    if(udcCacheResponse0 != null) {
                        for(Object object1: udcCacheResponse0.a) {
                            UdcCacheResponse.UdcSetting udcCacheResponse$UdcSetting0 = (UdcCacheResponse.UdcSetting)object1;
                            switch(udcCacheResponse$UdcSetting0.a) {
                                case 9: {
                                    boolean z4 = udcCacheResponse$UdcSetting0.b == 2;
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    hfew hfew0 = (hfew)hftp4.b_message;
                                    hfew0.b |= 2;
                                    hfew0.d = z4;
                                    break;
                                }
                                case 10: {
                                    boolean z5 = udcCacheResponse$UdcSetting0.b == 2;
                                    if(!hftp4.b_message.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    hfew hfew1 = (hfew)hftp4.b_message;
                                    hfew1.b |= 1;
                                    hfew1.c = z5;
                                }
                            }
                        }
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hffl hffl1 = (hffl)hftp2.b_message;
                        hfew hfew2 = (hfew)hftp4.N_build();
                        hfew2.getClass();
                        hffl1.d = hfew2;
                        hffl1.b |= 2;
                    }
                    if(hzdj.r()) {
                        cioj cioj0 = cioj.v();
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hffm.a).v_newBuilder();
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        hffm hffm0 = (hffm)hftp7.b_message;
                        hffl hffl2 = (hffl)hftp2.N_build();
                        hffl2.getClass();
                        hffm0.d = hffl2;
                        hffm0.c = 4;
                        if(!hftp7.b_message.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp7.b_message;
                        ((hffm)hftv1).b |= 1;
                        ((hffm)hftv1).e = z1;
                        if(udcCacheResponse0 == null) {
                            z = true;
                        }
                        if(!hftv1.isImmutable()) {
                            hftp7.ensureMutable();
                        }
                        hffm hffm1 = (hffm)hftp7.b_message;
                        hffm1.b |= 2;
                        hffm1.f = z;
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        hffn hffn0 = (hffn)hftp6.b_message;
                        hffm hffm2 = (hffm)hftp7.N_build();
                        hffm2.getClass();
                        hffn0.c = hffm2;
                        hffn0.b = 4;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        hfgj hfgj0 = (hfgj)hftp5.b_message;
                        hffn hffn1 = (hffn)hftp6.N_build();
                        hffn1.getClass();
                        hfgj0.d = hffn1;
                        hfgj0.c = 3;
                        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        hfgc hfgc0 = (hfgc)hftp8.b_message;
                        hfgc0.b |= 1;
                        hfgc0.c = "com.google.android.gms#udc-facs";
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        hfgj hfgj1 = (hfgj)hftp5.b_message;
                        hfgc hfgc1 = (hfgc)hftp8.N_build();
                        hfgc1.getClass();
                        hfgj1.f = hfgc1;
                        hfgj1.b |= 2;
                        cczb cczb0 = cioj0.c(((ProtoLiteMessage)(((hfgj)hftp5.N_build()))));
                        cczb0.c = (int)1009;
                        cczb0.a();
                        return Status.b;
                    }
                    ayud ayud0 = (ayud)ezqo0.b.mr();
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                    int v6 = (int)(((long)(((Long)ezqo0.f.mr()))));
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hfgj hfgj2 = (hfgj)hftp9.b_message;
                    hfgj2.b |= 1;
                    hfgj2.e = v6;
                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                    ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)hffm.a).v_newBuilder();
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    hffm hffm3 = (hffm)hftp11.b_message;
                    hffl hffl3 = (hffl)hftp2.N_build();
                    hffl3.getClass();
                    hffm3.d = hffl3;
                    hffm3.c = 4;
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp11.b_message;
                    ((hffm)hftv2).b |= 1;
                    ((hffm)hftv2).e = z1;
                    if(udcCacheResponse0 == null) {
                        z = true;
                    }
                    if(!hftv2.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    hffm hffm4 = (hffm)hftp11.b_message;
                    hffm4.b |= 2;
                    hffm4.f = z;
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    hffn hffn2 = (hffn)hftp10.b_message;
                    hffm hffm5 = (hffm)hftp11.N_build();
                    hffm5.getClass();
                    hffn2.c = hffm5;
                    hffn2.b = 4;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hfgj hfgj3 = (hfgj)hftp9.b_message;
                    hffn hffn3 = (hffn)hftp10.N_build();
                    hffn3.getClass();
                    hfgj3.d = hffn3;
                    hfgj3.c = 3;
                    ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                    if(!hftp12.b_message.isImmutable()) {
                        hftp12.ensureMutable();
                    }
                    hfgc hfgc2 = (hfgc)hftp12.b_message;
                    hfgc2.b |= 1;
                    hfgc2.c = "com.google.android.gms#udc-facs";
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hfgj hfgj4 = (hfgj)hftp9.b_message;
                    hfgc hfgc3 = (hfgc)hftp12.N_build();
                    hfgc3.getClass();
                    hfgj4.f = hfgc3;
                    hfgj4.b |= 2;
                    ayuc ayuc0 = ayud0.i(((MessageLite)hftp9.N_build()));
                    ayuc0.k(1009);
                    ayuc0.d();
                    return Status.b;
                }
            }
        }
        else {
            long v5 = (long)(((Long)eztl.a.f.mr()));
            if(eztl.a.d.a(v5)) {
                goto label_79;
            }
            else {
                goto label_78;
            }
        }
        return Status.b;
    }

    @Override  // eznd
    public final void f(Context context0) {
        super.f(context0);
        this.h();
        Status status0 = this.b();
        this.i(status0.i);
        this.d.d(status0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.i(status0.i);
        this.d.d(status0);
    }
}

