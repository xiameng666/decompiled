import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;

final class dfyq {
    final ShareTarget a;
    final dfzz b;

    public dfyq(dfzz dfzz0, ShareTarget shareTarget0) {
        this.a = shareTarget0;
        Objects.requireNonNull(dfzz0);
        this.b = dfzz0;
        super();
    }

    public final void a(String s) {
        int v8;
        dfzz dfzz1;
        int v2;
        dfzz dfzz0 = this.b;
        ShareTarget shareTarget0 = this.a;
        dfzz0.bc(shareTarget0, s);
        dcnp dcnp0 = dfzz0.Y(shareTarget0);
        if(dcnp0 == null) {
            dfzz0.bh(shareTarget0, new dcnn(1007).a());
            dfzz0.aH(shareTarget0);
            dcvz.a.b().h("Failed to connect to %s, callback is null.", shareTarget0);
            return;
        }
        String s1 = dfzz0.ap(shareTarget0);
        if(s1 == null) {
            dcnp0.e(shareTarget0, new dcnn(1007).a());
            dcvz.a.b().h("Failed to connect to %s, endpointId is null.", shareTarget0);
            return;
        }
        if(!dfzz0.bt()) {
            dcnp0.e(shareTarget0, new dcnn(1007).a());
            dcvz.a.b().h("Failed to connect to %s.", shareTarget0);
            return;
        }
        dfzz0.Y.set(false);
        dfzz0.Z.set(0L);
        dfzz0.aa.set(0L);
        if(!dfzz0.N.remove(shareTarget0) && hvqz.ak()) {
            dcvz.a.b().h("Failed to connect to %s, because it has been onLost.", shareTarget0);
            dcnp0.e(shareTarget0, new dcnn(1007).a());
            return;
        }
        dfzz0.L.offer(shareTarget0);
        if(!hvqz.ak()) {
            dcnp0.e(shareTarget0, new dcnn(1001).a());
        }
        Account account0 = dfzz0.v.c();
        String s2 = dfzz0.v.h(account0);
        Context context0 = dfzz0.i;
        int v = djbm.d(context0);
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 10;
        dcpu0.b = 2;
        dcpv dcpv0 = new dcpv(dcpu0);
        byte[] arr_b = dfzz0.bH(v, s2, null, shareTarget0.r, dcpv0);
        int v1 = dfzz0.s;
        if(shareTarget0.d == 3 && v1 == 2) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getApplicationContext().getSystemService("connectivity");
            if(connectivityManager0 == null) {
                dcvz.a.e().p("Failed to get connectivity manager.", new Object[0]);
                v1 = 2;
                goto label_53;
            }
            else {
                NetworkInfo networkInfo0 = connectivityManager0.getNetworkInfo(1);
                if(networkInfo0 == null) {
                    dcvz.a.e().p("Failed to get wifi network info.", new Object[0]);
                    v1 = 2;
                    goto label_53;
                }
                else if(networkInfo0.isConnected()) {
                    v2 = 2;
                }
                else {
                    v1 = 2;
                    goto label_53;
                }
            }
        }
        else {
        label_53:
            if(v1 == 1) {
                v2 = 1;
            }
            else if(!dfzz.br(shareTarget0.e(), Long.parseLong(hvqs.bb()))) {
                v2 = v1;
            }
            else {
                v2 = 1;
            }
        }
        dfzz0.bd(shareTarget0, false);
        dfzz0.bf(shareTarget0, true);
        long v3 = dfzz0.P(shareTarget0);
        int v4 = dfzz0.L(shareTarget0);
        int v5 = dfzz0.K();
        Intent intent0 = dfzz0.P;
        long v6 = dfzz0.w.c();
        long v7 = dfzz0.P(shareTarget0);
        dfzz0.w.i(dcpt.o(v3, v4, v5, shareTarget0, dcpt.w(context0, dfzz0.ah(), intent0, v6, v7, dfzz0.t.a())));
        dgap dgap0 = dfzz0.ae(shareTarget0).c;
        byte[] arr_b1 = null;
        if(dgap0 == null) {
            dcvz.a.b().h("Unable to get the MacAddress for %s because we don\'t have a certificate for that target", shareTarget0);
        }
        else {
            dbwr dbwr0 = dgap0.b;
            if((dbwr0.b & 8) == 0) {
                dcvz.a.b().h("Unable to get the MacAddress for %s because the certificate does not have a BT MAC", shareTarget0);
            }
            else {
                ByteString hfsf0 = dbwr0.f;
                if(hfsf0.size() == 6) {
                    arr_b1 = hfsf0.toByteArray();
                }
                else {
                    dcvz.a.b().h("Unable to get the MacAddress for %s because the certificate\'s BT MAC is not 6 bytes long", shareTarget0);
                }
            }
        }
        if(dfzz.br(shareTarget0.e(), hvqs.az())) {
            dfzz1 = dfzz0;
            v8 = 3;
        }
        else if(shareTarget0.f().isEmpty() && shareTarget0.d().isEmpty()) {
            v8 = 2;
            dfzz1 = dfzz0;
        }
        else {
            dfzz1 = dfzz0;
            v8 = 1;
        }
        dfxx dfxx0 = new dfxx(dfzz1, shareTarget0, s1, dcnp0, arr_b, arr_b1, v2, v8);
        dfzz1.m.execute(dfxx0);
    }
}

