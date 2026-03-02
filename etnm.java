import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class etnm {
    public static final bboh a;

    static {
        etnm.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public static final void a(gtuh gtuh0, Context context0, cjlv cjlv0) {
        Notification notification0;
        if(!gtuh0.c.isEmpty() && !gtuh0.d.isEmpty() && !gtuh0.f.isEmpty()) {
            String s = esff.b(context0, gtuh0.f);
            if(!TextUtils.isEmpty(s)) {
                AccountInfo accountInfo0 = new AccountInfo(s, gtuh0.f, 0);
                esgi esgi0 = new esgi(accountInfo0, esge.d(), context0);
                juo juo0 = etoi.a(context0, fsdw.d);
                juo0.D(gtuh0.c);
                juo0.k(gtuh0.d);
                if(!gtuh0.n.isEmpty()) {
                    juo0.R(gtuh0.n);
                }
                etoi.h(context0, juo0, gtuh0.e, etoh.a);
                etoi.e(context0, juo0, gtuh0.i, etoh.a);
                int v = gtuh0.g;
                if(v == 0) {
                    etoi.i(context0, juo0);
                }
                else {
                    juo0.D = v;
                }
                etoi.k(context0, juo0, gtuh0.h);
                if(!gtuh0.p.isEmpty()) {
                    etoi.j(juo0, gtuh0.p);
                }
                etnp etnp0 = etnq.a((gtuh0.k == null ? gfog.a : gtuh0.k), esgi0);
                int v1 = etnp0.c;
                if(v1 == 1) {
                    juo0.l(etnm.b(context0, etnr.a(context0, accountInfo0, gtuh0.l)));
                    juo0.h = etnm.b(context0, etnr.b(context0, accountInfo0, gtuh0.l, etnp0.b, etnp0.a));
                    juo0.m = gtuh0.m;
                    juo0.h(gtuh0.o);
                    notification0 = juo0.a();
                }
                else {
                    String s1 = gtuh0.l;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjzl.a).v_newBuilder();
                    gjsj gjsj0 = gjsj.bk;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gjzl)hftp0.b_message).e = gjsj0.cW;
                    ((gjzl)hftp0.b_message).b |= 1;
                    gjtr gjtr0 = gjtr.a;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjtr0).v_newBuilder();
                    if(s1 != null) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gjtr gjtr1 = (gjtr)hftp1.b_message;
                        gjtr1.b |= 4;
                        gjtr1.e = s1;
                    }
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjzl gjzl0 = (gjzl)hftp0.b_message;
                    gjtr gjtr2 = (gjtr)hftp1.N_build();
                    gjtr2.getClass();
                    gjzl0.A = gjtr2;
                    gjzl0.b |= 0x8000000;
                    gjsj gjsj1 = gjsj.bm;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjzl gjzl1 = (gjzl)hftp0.b_message;
                    gjzl1.e = gjsj1.cW;
                    gjzl1.b |= 1;
                    gjtr gjtr3 = gjzl1.A;
                    if(gjtr3 != null) {
                        gjtr0 = gjtr3;
                    }
                    notification0 = null;
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gjtr0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)gjtr0));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((gjtr)hftp2.b_message).c = v1 - 1;
                    ((gjtr)hftp2.b_message).b |= 1;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjzl gjzl2 = (gjzl)hftp0.b_message;
                    gjtr gjtr4 = (gjtr)hftp2.N_build();
                    gjtr4.getClass();
                    gjzl2.A = gjtr4;
                    gjzl2.b |= 0x8000000;
                    new etmv(esgi0).l(((gjzl)hftp0.N_build()));
                }
                if(notification0 != null && gtuh0.j) {
                    fsdx fsdx0 = hytb.f() ? new fsdx(notification0) : new fsdx(notification0, gfny.b);
                    fsdx0.e();
                    cjlv0.i("com.google.android.gms.tapandpay.notifications.LocalNotificationManager", 1001, fsdx0, (hkoy.b(gtuh0.q) == null ? hkoy.br : hkoy.b(gtuh0.q)));
                }
            }
        }
    }

    private static PendingIntent b(Context context0, Intent intent0) {
        return PendingIntent.getService(context0, 0, intent0, 0xC000000);
    }
}

