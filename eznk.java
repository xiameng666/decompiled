import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import java.util.ArrayList;

public final class eznk extends eznd {
    public eznk(Context context0, ezpn ezpn0, baqr baqr0, String s) {
        super(context0, ezpn0, baqr0, s, "GetDeviceDataUploadOptedInAccountsOperation");
        this.i = true;
    }

    private final DeviceDataUploadOptedInAccountsParcelable b(Context context0, boolean z) {
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags0;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Context context1 = this.c;
        ezoi.a(context1);
        for(Object object0: bbmn.h(context0, "com.google.android.gms")) {
            Account account0 = (Account)object0;
            if(z) {
                deviceDataUploadOptInFlags0 = eztf.a(ezth.a.a(account0));
            }
            else {
                ezof ezof0 = new ezog(context1, account0).a();
                Status status0 = ezof0.a;
                if(!status0.e()) {
                    throw new cjuh(status0.i, status0.j);
                }
                deviceDataUploadOptInFlags0 = eznj.b(context1, account0, ezof0, this.j);
            }
            if(deviceDataUploadOptInFlags0.b) {
                arrayList1.add(account0.name);
            }
            if(!deviceDataUploadOptInFlags0.a) {
                continue;
            }
            arrayList0.add(account0.name);
            continue;
        }
        return new DeviceDataUploadOptedInAccountsParcelable(arrayList0, arrayList1);
    }

    @Override  // eznd
    protected final void f(Context context0) {
        boolean z3;
        boolean z2;
        hffg hffg1;
        hffg hffg0;
        DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable1;
        DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable0;
        super.f(context0);
        this.h();
        boolean z = Long.compare(hzdj.f(), 0L) != 0 && eztl.a.d();
        boolean z1 = hzdj.s() && hzdj.q();
        if(!z1 || z) {
            try {
                deviceDataUploadOptedInAccountsParcelable0 = this.b(context0, false);
            }
            catch(Exception exception0) {
                if(!z1) {
                    throw exception0;
                }
                ezqu.a().d().s(exception0).ar(0x4438).x("Exception while calling legacy codepath for comparison logging!");
                deviceDataUploadOptedInAccountsParcelable0 = null;
            }
        }
        else {
            deviceDataUploadOptedInAccountsParcelable0 = null;
        }
        if(z1 || z) {
            try {
                deviceDataUploadOptedInAccountsParcelable1 = this.b(context0, true);
            }
            catch(Exception exception1) {
                if(z1) {
                    throw exception1;
                }
                ezqu.a().d().s(exception1).ar(0x4437).x("Exception while calling forwarding codepath for comparison logging!");
                deviceDataUploadOptedInAccountsParcelable1 = null;
            }
        }
        else {
            deviceDataUploadOptedInAccountsParcelable1 = null;
        }
        if(hzdj.r() || z) {
            ezqo ezqo0 = eztl.a;
            if(!hzdj.r() || ccze.b(ciou.v())) {
                if(deviceDataUploadOptedInAccountsParcelable1 != null && deviceDataUploadOptedInAccountsParcelable0 != null) {
                    hffg0 = ezqo.a(deviceDataUploadOptedInAccountsParcelable1.a, deviceDataUploadOptedInAccountsParcelable0.a);
                    hffg1 = ezqo.a(deviceDataUploadOptedInAccountsParcelable1.b, deviceDataUploadOptedInAccountsParcelable0.b);
                }
                else {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hffg.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hffg.a).v_newBuilder();
                    if(deviceDataUploadOptedInAccountsParcelable1 != null) {
                        int v = deviceDataUploadOptedInAccountsParcelable1.a.size();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hffg hffg2 = (hffg)hftp0.b_message;
                        hffg2.b |= 2;
                        hffg2.d = v;
                        int v1 = deviceDataUploadOptedInAccountsParcelable1.b.size();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hffg hffg3 = (hffg)hftp1.b_message;
                        hffg3.b |= 2;
                        hffg3.d = v1;
                    }
                    if(deviceDataUploadOptedInAccountsParcelable0 != null) {
                        int v2 = deviceDataUploadOptedInAccountsParcelable0.a.size();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hffg hffg4 = (hffg)hftp0.b_message;
                        hffg4.b |= 4;
                        hffg4.e = v2;
                        int v3 = deviceDataUploadOptedInAccountsParcelable0.b.size();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hffg hffg5 = (hffg)hftp1.b_message;
                        hffg5.b |= 4;
                        hffg5.e = v3;
                    }
                    hffg hffg6 = (hffg)hftp0.N_build();
                    hffg1 = (hffg)hftp1.N_build();
                    hffg0 = hffg6;
                }
                if(hzdj.r()) {
                    ciou ciou0 = ciou.v();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hffm.a).v_newBuilder();
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hffh.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp5.b_message;
                    hffg0.getClass();
                    ((hffh)hftv0).c = hffg0;
                    ((hffh)hftv0).b |= 1;
                    if(!hftv0.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hffh hffh0 = (hffh)hftp5.b_message;
                    hffg1.getClass();
                    hffh0.d = hffg1;
                    hffh0.b |= 2;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hffm hffm0 = (hffm)hftp4.b_message;
                    hffh hffh1 = (hffh)hftp5.N_build();
                    hffh1.getClass();
                    hffm0.d = hffh1;
                    hffm0.c = 2;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp4.b_message;
                    ((hffm)hftv1).b |= 1;
                    ((hffm)hftv1).e = z1;
                    if(!z1) {
                        if(deviceDataUploadOptedInAccountsParcelable1 == null) {
                            z2 = true;
                            deviceDataUploadOptedInAccountsParcelable1 = null;
                        }
                        else {
                            z2 = false;
                        }
                    }
                    else if(deviceDataUploadOptedInAccountsParcelable0 == null) {
                        z2 = true;
                        deviceDataUploadOptedInAccountsParcelable0 = null;
                    }
                    else {
                        z2 = false;
                    }
                    if(!hftv1.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hffm hffm1 = (hffm)hftp4.b_message;
                    hffm1.b |= 2;
                    hffm1.f = z2;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hffn hffn0 = (hffn)hftp3.b_message;
                    hffm hffm2 = (hffm)hftp4.N_build();
                    hffm2.getClass();
                    hffn0.c = hffm2;
                    hffn0.b = 4;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hfgj hfgj0 = (hfgj)hftp2.b_message;
                    hffn hffn1 = (hffn)hftp3.N_build();
                    hffn1.getClass();
                    hfgj0.d = hffn1;
                    hfgj0.c = 3;
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    hfgc hfgc0 = (hfgc)hftp6.b_message;
                    hfgc0.b |= 1;
                    hfgc0.c = "com.google.android.gms#udc-facs";
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hfgj hfgj1 = (hfgj)hftp2.b_message;
                    hfgc hfgc1 = (hfgc)hftp6.N_build();
                    hfgc1.getClass();
                    hfgj1.f = hfgc1;
                    hfgj1.b |= 2;
                    cczb cczb0 = ciou0.c(((ProtoLiteMessage)(((hfgj)hftp2.N_build()))));
                    cczb0.c = (int)0x3F4;
                    cczb0.a();
                }
                else {
                    ayud ayud0 = (ayud)ezqo0.b.mr();
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hfgj.a).v_newBuilder();
                    int v4 = (int)(((long)(((Long)ezqo0.e.mr()))));
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    hfgj hfgj2 = (hfgj)hftp7.b_message;
                    hfgj2.b |= 1;
                    hfgj2.e = v4;
                    ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hffn.a).v_newBuilder();
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)hffm.a).v_newBuilder();
                    ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)hffh.a).v_newBuilder();
                    if(!hftp10.b_message.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp10.b_message;
                    hffg0.getClass();
                    ((hffh)hftv2).c = hffg0;
                    ((hffh)hftv2).b |= 1;
                    if(!hftv2.isImmutable()) {
                        hftp10.ensureMutable();
                    }
                    hffh hffh2 = (hffh)hftp10.b_message;
                    hffg1.getClass();
                    hffh2.d = hffg1;
                    hffh2.b |= 2;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hffm hffm3 = (hffm)hftp9.b_message;
                    hffh hffh3 = (hffh)hftp10.N_build();
                    hffh3.getClass();
                    hffm3.d = hffh3;
                    hffm3.c = 2;
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp9.b_message;
                    ((hffm)hftv3).b |= 1;
                    ((hffm)hftv3).e = z1;
                    if(!z1) {
                        if(deviceDataUploadOptedInAccountsParcelable1 == null) {
                            z3 = true;
                            deviceDataUploadOptedInAccountsParcelable1 = null;
                        }
                        else {
                            z3 = false;
                        }
                    }
                    else if(deviceDataUploadOptedInAccountsParcelable0 == null) {
                        z3 = true;
                        deviceDataUploadOptedInAccountsParcelable0 = null;
                    }
                    else {
                        z3 = false;
                    }
                    if(!hftv3.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    hffm hffm4 = (hffm)hftp9.b_message;
                    hffm4.b |= 2;
                    hffm4.f = z3;
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
                    hfgj hfgj3 = (hfgj)hftp7.b_message;
                    hffn hffn3 = (hffn)hftp8.N_build();
                    hffn3.getClass();
                    hfgj3.d = hffn3;
                    hfgj3.c = 3;
                    ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)hfgc.a).v_newBuilder();
                    if(!hftp11.b_message.isImmutable()) {
                        hftp11.ensureMutable();
                    }
                    hfgc hfgc2 = (hfgc)hftp11.b_message;
                    hfgc2.b |= 1;
                    hfgc2.c = "com.google.android.gms#udc-facs";
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    hfgj hfgj4 = (hfgj)hftp7.b_message;
                    hfgc hfgc3 = (hfgc)hftp11.N_build();
                    hfgc3.getClass();
                    hfgj4.f = hfgc3;
                    hfgj4.b |= 2;
                    ayuc ayuc0 = ayud0.i(((MessageLite)hftp7.N_build()));
                    ayuc0.k(0x3F4);
                    ayuc0.d();
                }
            }
        }
        this.i(0);
        ezpn ezpn0 = this.d;
        if(!z1) {
            deviceDataUploadOptedInAccountsParcelable1 = deviceDataUploadOptedInAccountsParcelable0;
        }
        ezpn0.c(Status.b, deviceDataUploadOptedInAccountsParcelable1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.i(status0.i);
        this.d.c(status0, null);
    }
}

