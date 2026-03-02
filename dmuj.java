import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dmuj {
    public final dmhi a;
    public final edmu b;
    private final fbio c;

    public dmuj(dmhi dmhi0, fbio fbio0, edmu edmu0) {
        this.a = dmhi0;
        this.c = fbio0;
        this.b = edmu0;
    }

    public final ByteString a() {
        WalletCustomTheme walletCustomTheme0;
        fbir fbir0 = GetClientTokenRequest.a();
        if(hwev.c()) {
            walletCustomTheme0 = new WalletCustomTheme();
            walletCustomTheme0.e(5);
        }
        else {
            walletCustomTheme0 = new WalletCustomTheme();
        }
        fbir0.c(walletCustomTheme0);
        GetClientTokenRequest getClientTokenRequest0 = fbir0.a();
        return ByteString.copyFrom(((byte[])evrg.o(this.c.e(getClientTokenRequest0), hwtu.a.e().d(), TimeUnit.SECONDS)));
    }

    public final hkgr b(List list0, int v, String s, String s1, hkgy hkgy0) {
        hkgn hkgn0 = (hkgn)((ProtoLiteMessage)hkgo.a).v_newBuilder();
        ByteString hfsf0 = this.a();
        if(!hkgn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkgn0).ensureMutable();
        }
        ((hkgo)hkgn0.b_message).d = hfsf0;
        if(!hkgn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkgn0).ensureMutable();
        }
        hkgo hkgo0 = (hkgo)hkgn0.b_message;
        hkgo0.b();
        hfrj.E(list0, hkgo0.c);
        if(!hkgn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hkgn0).ensureMutable();
        }
        ((hkgo)hkgn0.b_message).f = v - 2;
        if(hkgy0 != null) {
            if(!hkgn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgn0).ensureMutable();
            }
            ((hkgo)hkgn0.b_message).h = hkgy0;
            ((hkgo)hkgn0.b_message).b |= 8;
        }
        hwoz.i();
        if(hwoz.g() && s1 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtnx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gtnx)hftp0.b_message).b = s1;
            gtnx gtnx0 = (gtnx)hftp0.N_build();
            if(!hkgn0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hkgn0).ensureMutable();
            }
            hkgo hkgo1 = (hkgo)hkgn0.b_message;
            gtnx0.getClass();
            hkgo1.g = gtnx0;
            hkgo1.b |= 4;
        }
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hkgn0).N_build();
        batl.b(((boolean)(dpuj.aq.cL.startsWith("e/") ^ 1)));
        return (hkgr)dptv.g(this.a, dpuj.aq, ((MessageLite)hftv0), ((MessageLite)hkgr.a), null, 0L, s, gtmu.b);
    }
}

