import android.util.LongSparseArray;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

public final class dxte {
    public final dmhi a;
    private final fbio b;

    public dxte(dmhi dmhi0, fbio fbio0) {
        this.a = dmhi0;
        this.b = fbio0;
    }

    public final evql a(gtla gtla0, gtui gtui0, gtur gtur0, gtuw gtuw0, byte[] arr_b, LongSparseArray longSparseArray0) {
        evqp evqp0 = new evqp();
        long v = gtuw0.d;
        byte[] arr_b1 = (byte[])longSparseArray0.get(gtur0.g, new byte[0]);
        dxtd dxtd0 = new dxtd(this, evqp0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtuy.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtuy gtuy0 = (gtuy)hftp0.b_message;
        gtuy0.c = gtla0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtuy)hftv0).f = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtuy gtuy1 = (gtuy)hftp0.b_message;
        gtui0.getClass();
        gtuy1.h = gtui0;
        gtuy1.b |= 1;
        if(gtur0.c.isEmpty()) {
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gtuy)hftp0.b_message).g = hfsf1;
        }
        else {
            ByteString hfsf0 = gtur0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtuy gtuy2 = (gtuy)hftp0.b_message;
            hfsf0.getClass();
            gtuy2.d = hfsf0;
        }
        if(arr_b.length > 0) {
            ByteString hfsf2 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gtuy)hftp0.b_message).e = hfsf2;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        dptv.l(this.a, dpuj.bF, ((MessageLite)hftv1), ((MessageLite)gtuz.a), dxtd0);
        return evqp0.a;
    }

    public final evql b() {
        WalletCustomTheme walletCustomTheme0;
        fbir fbir0 = GetClientTokenRequest.a();
        if(hwfk.a.b().br()) {
            walletCustomTheme0 = new WalletCustomTheme();
            walletCustomTheme0.e(5);
        }
        else {
            walletCustomTheme0 = new WalletCustomTheme();
        }
        fbir0.c(walletCustomTheme0);
        fbir0.a.b = true;
        GetClientTokenRequest getClientTokenRequest0 = fbir0.a();
        return this.b.e(getClientTokenRequest0);
    }

    public final void c(hjwt hjwt0, hjqn hjqn0, long v, gtum gtum0, dpue dpue0) {
        this.d(hjwt0, hjqn0, v, gtum0, dpue0, 0L);
    }

    public final void d(hjwt hjwt0, hjqn hjqn0, long v, gtum gtum0, dpue dpue0, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtun.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hjwt0.getClass();
        ((gtun)hftv0).c = hjwt0;
        ((gtun)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hjqn0.getClass();
        ((gtun)hftv1).e = hjqn0;
        ((gtun)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gtun)hftv2).f = v;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtun gtun0 = (gtun)hftp0.b_message;
        gtum0.getClass();
        gtun0.d = gtum0;
        gtun0.b |= 2;
        gtun gtun1 = (gtun)hftp0.N_build();
        if(v1 == 0L) {
            dptv.l(this.a, dpuj.bE, ((MessageLite)gtun1), ((MessageLite)gtuo.a), dpue0);
            return;
        }
        dptv.o(this.a, dpuj.bE, ((MessageLite)gtun1), ((MessageLite)gtuo.a), dpue0, v1, gtmu.d);
    }

    public static boolean e(gtur gtur0) {
        return (gtur0.b & 2) == 0 ? true : geol.a((gtur0.h == null ? geom.a : gtur0.h).b) != 5;
    }

    public final void f(ProtoLiteBuilder hftp0, dpue dpue0) {
        evql evql0 = this.b();
        evql0.b(new dxtb(this, hftp0, dpue0));
        evql0.A(new dxtc(dpue0));
    }

    public final gmcd g(gtni gtni0, gtlg gtlg0, gfsx gfsx0, gfsx gfsx1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtut.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtut)hftv0).e = 70672;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtut gtut0 = (gtut)hftp0.b_message;
        gtut0.f = gtni0.a();
        gtut0.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtut gtut1 = (gtut)hftp0.b_message;
        gtlg0.getClass();
        gtut1.g = gtlg0;
        gtut1.b |= 4;
        if(gfsx0.i()) {
            String s = (String)gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtut gtut2 = (gtut)hftp0.b_message;
            gtut2.b |= 8;
            gtut2.h = s;
        }
        if(gfsx1.i()) {
            gtus gtus0 = (gtus)gfsx1.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gtut)hftp0.b_message).d = gtus0;
            ((gtut)hftp0.b_message).c = 7;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        return dptv.b(this.a, dpuj.bB, ((MessageLite)hftv1), ((MessageLite)gtuu.a));
    }
}

