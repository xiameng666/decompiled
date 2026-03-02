import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;

public final class eznj extends eznd {
    private final ezog a;
    private final gful_cronetEngineProvider b;

    public eznj(Context context0, ezpn ezpn0, baqr baqr0, String s, gful_cronetEngineProvider gful0) {
        super(context0, ezpn0, baqr0, s, "GetDeviceDataUploadOptInStatusOperation");
        this.a = new ezog(this.c, this.g);
        this.i = true;
        this.b = gful0;
    }

    public static DeviceDataUploadOptInFlags b(Context context0, Account account0, ezof ezof0, ezts ezts0) {
        boolean z4;
        boolean z3;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        for(Object object0: ezof0.b) {
            hfqj hfqj0 = (hfqj)object0;
            switch(hfqj0.c) {
                case 9: {
                    if(hfqv.a(hfqj0.e) == 3) {
                        z1 = true;
                        continue;
                    }
                    else {
                        z1 = false;
                        goto label_17;
                    }
                    goto label_14;
                }
                case 10: {
                label_14:
                    if(hfqv.a(hfqj0.e) == 3) {
                        z2 = true;
                    }
                    else {
                        z2 = false;
                    label_17:
                    }
                }
            }
        }
        ezmc ezmc0 = new ezrj(ezrp.a(context0).a(account0), ezts0).a();
        if(ezmc0 != null && (ezmc0.b & 1) != 0) {
            z3 = false;
            z4 = false;
            for(Object object1: (ezmc0.c == null ? hffw.a : ezmc0.c).c) {
                hffv hffv0 = (hffv)object1;
                switch(eztq.a(hffv0.c)) {
                    case 7: {
                        z4 = hffv0.d;
                        break;
                    }
                    case 8: {
                        z3 = hffv0.d;
                    }
                }
            }
        }
        else {
            z3 = false;
            z4 = false;
        }
        if(z1 && z4) {
            z = true;
        }
        return new DeviceDataUploadOptInFlags(z2 && z3, z);
    }

    @Override  // eznd
    public final void f(Context context0) {
        boolean z5;
        boolean z4;
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags2;
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags1;
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags0;
        super.f(context0);
        this.h();
        boolean z = Long.compare(hzdj.f(), 0L) != 0 && eztl.a.d();
        boolean z1 = hzdj.s() && hzdj.q();
        if(!z1 || z) {
            try {
                ezof ezof0 = this.a.b(true, ggfp.K(Integer.valueOf(9), Integer.valueOf(10)));
                Status status0 = ezof0.a;
                if(!status0.e()) {
                    throw new cjuh(status0.i, status0.j);
                }
                deviceDataUploadOptInFlags0 = eznj.b(this.c, this.g, ezof0, this.j);
            }
            catch(Exception exception0) {
                if(!z1) {
                    throw exception0;
                }
                ezqu.a().d().s(exception0).ar(0x4436).x("Exception while calling legacy codepath for comparison logging!");
                deviceDataUploadOptInFlags0 = null;
            }
        }
        else {
            deviceDataUploadOptInFlags0 = null;
        }
        if(z1 || z) {
            try {
                deviceDataUploadOptInFlags1 = eztf.a(((fpfv)this.b.mr()));
            }
            catch(Exception exception1) {
                if(z1) {
                    throw exception1;
                }
                ezqu.a().d().s(exception1).ar(0x4435).x("Exception while calling forwarding codepath for comparison logging!");
                deviceDataUploadOptInFlags1 = null;
            }
        }
        else {
            deviceDataUploadOptInFlags1 = null;
        }
        if(hzdj.r() || z) {
            ezqo ezqo0 = eztl.a;
            if(!hzdj.r() || ccze.b(ciou.v())) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfff.a).v_newBuilder();
                if(deviceDataUploadOptInFlags1 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfew.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((hfew)hftv0).b |= 1;
                    ((hfew)hftv0).c = deviceDataUploadOptInFlags1.a;
                    boolean z2 = deviceDataUploadOptInFlags1.b;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hfew hfew0 = (hfew)hftp1.b_message;
                    hfew0.b |= 2;
                    hfew0.d = z2;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfff hfff0 = (hfff)hftp0.b_message;
                    hfew hfew1 = (hfew)hftp1.N_build();
                    hfew1.getClass();
                    hfff0.c = hfew1;
                    hfff0.b |= 1;
                }
                if(deviceDataUploadOptInFlags0 != null) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfew.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((hfew)hftv1).b |= 1;
                    ((hfew)hftv1).c = deviceDataUploadOptInFlags0.a;
                    boolean z3 = deviceDataUploadOptInFlags0.b;
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hfew hfew2 = (hfew)hftp2.b_message;
                    hfew2.b |= 2;
                    hfew2.d = z3;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfff hfff1 = (hfff)hftp0.b_message;
                    hfew hfew3 = (hfew)hftp2.N_build();
                    hfew3.getClass();
                    hfff1.d = hfew3;
                    hfff1.b |= 2;
                }
                if(hzdj.r()) {
                    ciou ciou0 = ciou.v();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                    deviceDataUploadOptInFlags2 = deviceDataUploadOptInFlags0;
                    int v = (int)(((long)(((Long)ezqo0.e.mr()))));
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hfgj hfgj0 = (hfgj)hftp3.b_message;
                    hfgj0.b |= 1;
                    hfgj0.e = v;
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hffm.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hffm hffm0 = (hffm)hftp5.b_message;
                    hfff hfff2 = (hfff)hftp0.N_build();
                    hfff2.getClass();
                    hffm0.d = hfff2;
                    hffm0.c = 1;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp5.b_message;
                    ((hffm)hftv2).b |= 1;
                    ((hffm)hftv2).e = z1;
                    if(!z1) {
                        if(deviceDataUploadOptInFlags1 == null) {
                            z4 = true;
                            deviceDataUploadOptInFlags1 = null;
                        }
                        else {
                            z4 = false;
                        }
                    }
                    else if(deviceDataUploadOptInFlags2 == null) {
                        z4 = true;
                        deviceDataUploadOptInFlags2 = null;
                    }
                    else {
                        z4 = false;
                    }
                    if(!hftv2.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hffm hffm1 = (hffm)hftp5.b_message;
                    hffm1.b |= 2;
                    hffm1.f = z4;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hffn hffn0 = (hffn)hftp4.b_message;
                    hffm hffm2 = (hffm)hftp5.N_build();
                    hffm2.getClass();
                    hffn0.c = hffm2;
                    hffn0.b = 4;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hfgj hfgj1 = (hfgj)hftp3.b_message;
                    hffn hffn1 = (hffn)hftp4.N_build();
                    hffn1.getClass();
                    hfgj1.d = hffn1;
                    hfgj1.c = 3;
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    hfgc hfgc0 = (hfgc)hftp6.b_message;
                    hfgc0.b |= 1;
                    hfgc0.c = "com.google.android.gms#udc-facs";
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hfgj hfgj2 = (hfgj)hftp3.b_message;
                    hfgc hfgc1 = (hfgc)hftp6.N_build();
                    hfgc1.getClass();
                    hfgj2.f = hfgc1;
                    hfgj2.b |= 2;
                    cczb cczb0 = ciou0.c(((ProtoLiteMessage)(((hfgj)hftp3.N_build()))));
                    cczb0.c = (int)0x3F3;
                    cczb0.a();
                }
                else {
                    deviceDataUploadOptInFlags2 = deviceDataUploadOptInFlags0;
                    ayud ayud0 = (ayud)ezqo0.b.mr();
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                    int v1 = (int)(((long)(((Long)ezqo0.e.mr()))));
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    hfgj hfgj3 = (hfgj)hftp7.b_message;
                    hfgj3.b |= 1;
                    hfgj3.e = v1;
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hffm.a).v_newBuilder();
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hffm hffm3 = (hffm)hftp9.b_message;
                    hfff hfff3 = (hfff)hftp0.N_build();
                    hfff3.getClass();
                    hffm3.d = hfff3;
                    hffm3.c = 1;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp9.b_message;
                    ((hffm)hftv3).b |= 1;
                    ((hffm)hftv3).e = z1;
                    if(!z1) {
                        if(deviceDataUploadOptInFlags1 == null) {
                            z5 = true;
                            deviceDataUploadOptInFlags1 = null;
                        }
                        else {
                            z5 = false;
                        }
                    }
                    else if(deviceDataUploadOptInFlags2 == null) {
                        z5 = true;
                        deviceDataUploadOptInFlags2 = null;
                    }
                    else {
                        z5 = false;
                    }
                    if(!hftv3.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hffm hffm4 = (hffm)hftp9.b_message;
                    hffm4.b |= 2;
                    hffm4.f = z5;
                    if(!hftp8.b_message.isImmutable()) {
                        hftp8.ensureMutable();
                    }
                    hffn hffn2 = (hffn)hftp8.b_message;
                    hffm hffm5 = (hffm)hftp9.N_build();
                    hffm5.getClass();
                    hffn2.c = hffm5;
                    hffn2.b = 4;
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    hfgj hfgj4 = (hfgj)hftp7.b_message;
                    hffn hffn3 = (hffn)hftp8.N_build();
                    hffn3.getClass();
                    hfgj4.d = hffn3;
                    hfgj4.c = 3;
                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    hfgc hfgc2 = (hfgc)hftp10.b_message;
                    hfgc2.b |= 1;
                    hfgc2.c = "com.google.android.gms#udc-facs";
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    hfgj hfgj5 = (hfgj)hftp7.b_message;
                    hfgc hfgc3 = (hfgc)hftp10.N_build();
                    hfgc3.getClass();
                    hfgj5.f = hfgc3;
                    hfgj5.b |= 2;
                    ayuc ayuc0 = ayud0.i(((MessageLite)hftp7.N_build()));
                    ayuc0.k(0x3F3);
                    ayuc0.d();
                }
                deviceDataUploadOptInFlags0 = deviceDataUploadOptInFlags2;
            }
        }
        this.i(0);
        ezpn ezpn0 = this.d;
        if(!z1) {
            deviceDataUploadOptInFlags1 = deviceDataUploadOptInFlags0;
        }
        ezpn0.b(Status.b, deviceDataUploadOptInFlags1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.i(status0.i);
        this.d.b(status0, null);
    }
}

