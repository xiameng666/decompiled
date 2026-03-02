import android.accounts.Account;
import com.google.android.gms.backup.common.util.session.ParcelableSession;

public final class fcni implements glzn {
    public final fcnm a;
    public final gqtz b;
    public final grnv c;
    public final Integer d;

    public fcni(fcnm fcnm0, gqtz gqtz0, grnv grnv0, Integer integer0) {
        this.a = fcnm0;
        this.b = gqtz0;
        this.c = grnv0;
        this.d = integer0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gqtz gqtz0 = this.b;
        fcmk.a.d("logSetAccountAndBackupEnabled: contextId=%s", new Object[]{gqtz0.sn});
        grkh grkh0 = ParcelableSession.b().c();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Integer integer0 = this.d;
        grnk grnk0 = (grnk)hftp0.b_message;
        this.c.getClass();
        grnk0.s = this.c;
        grnk0.d |= 0x40;
        grnk grnk1 = (grnk)hftp0.N_build();
        gmcd[] arr_gmcd = new gmcd[2];
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grjj.a).v_newBuilder();
        if(integer0 != null) {
            int v = (int)integer0;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grjj grjj0 = (grjj)hftp1.b_message;
            grjj0.b |= 1;
            grjj0.c = v;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        grkv grkv0 = (grkv)hftp2.b_message;
        grjj grjj1 = (grjj)hftp1.N_build();
        grjj1.getClass();
        grkv0.g = grjj1;
        grkv0.b |= 4;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grku.a).v_newBuilder();
        gqub gqub0 = gqub.u;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((grku)hftv0).c = gqub0.mk;
        ((grku)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        grku grku0 = (grku)hftp3.b_message;
        grkv grkv1 = (grkv)hftp2.N_build();
        grkv1.getClass();
        grku0.d = grkv1;
        grku0.b |= 2;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns0 = (grns)hftp4.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grns grns1 = (grns)hftp4.b_message;
        grnk1.getClass();
        grns1.f = grnk1;
        grns1.b |= 8;
        grkf grkf0 = (grkf)((ProtoLiteMessage)grkg.a).v_newBuilder();
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grns grns2 = (grns)hftp4.N_build();
        grns2.getClass();
        grkg0.g = grns2;
        grkg0.b |= 8;
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        fcnm fcnm0 = this.a;
        grkg grkg1 = (grkg)grkf0.b_message;
        grku grku1 = (grku)hftp3.N_build();
        grku1.getClass();
        grkg1.f = grku1;
        grkg1.b |= 4;
        fcmk fcmk0 = fcnm0.h;
        arr_gmcd[0] = fhra.b(aqrn.d(fcmk0.b, grkf0, ((Account)object0), grkh0));
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grjl.a).v_newBuilder();
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = grno.b;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        ((grnp)hftp6.b_message).c = grno0.d;
        ((grnp)hftp6.b_message).b |= 1;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grjl grjl0 = (grjl)hftp5.b_message;
        grnp grnp0 = (grnp)hftp6.N_build();
        grnp0.getClass();
        grjl0.c = grnp0;
        grjl0.b |= 1;
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp5.b_message;
        ((grjl)hftv1).b |= 2;
        ((grjl)hftv1).d = true;
        if(!hftv1.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp5.b_message;
        ((grjl)hftv2).b |= 8;
        ((grjl)hftv2).f = true;
        if(!hftv2.isImmutable()) {
            hftp5.ensureMutable();
        }
        grjl grjl1 = (grjl)hftp5.b_message;
        grjl1.b |= 0x20;
        grjl1.h = true;
        if(integer0 != null) {
            int v1 = (int)integer0;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            grjl grjl2 = (grjl)hftp5.b_message;
            grjl2.b |= 0x800;
            grjl2.l = v1;
        }
        arr_gmcd[1] = fcmk0.a(((Account)object0), grkh0, gqtz0, grnk1, ((grjl)hftp5.N_build()));
        gmbt gmbt0 = gmbt.h(gmbu.f(arr_gmcd));
        fcmq fcmq0 = new fcmq(fcnm0, gqtz0);
        return glzd.f(glyi.g(gmbt0, Throwable.class, fcmq0, gmap.a), new fcmr(((Account)object0)), gmap.a);
    }
}

