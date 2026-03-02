import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.Locale;

public final class fbws extends cjtm {
    public static final byte[] a;
    private final fbwo b;
    private final GetClientTokenRequest c;
    private final Bundle d;
    private final fblx e;
    private final Context f;
    private final String g;
    private final azql h;
    private final gamy i;

    static {
        fbws.a = new byte[0];
    }

    public fbws(Context context0, GetClientTokenRequest getClientTokenRequest0, Bundle bundle0, fblx fblx0, fbwo fbwo0, String s, azql azql0, gamy gamy0) {
        super(4, "getClientToken");
        this.f = context0;
        this.c = getClientTokenRequest0;
        this.d = bundle0;
        this.e = fblx0;
        this.b = fbwo0;
        this.g = s;
        this.h = azql0;
        this.i = gamy0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        this.h.d(this.g);
        GetClientTokenRequest getClientTokenRequest0 = this.c;
        BuyFlowConfig buyFlowConfig0 = fbxe.c(this.d, getClientTokenRequest0.a);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gklc.a).v_newBuilder();
        Context context1 = this.f;
        long v = SystemClock.elapsedRealtime();
        hceb hceb0 = fbed.c(context1, 0x7F160ED5);  // style:Theme_Wallet_Dark
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hceb0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)hceb0));
        if(getClientTokenRequest0.b) {
            hcea hcea0 = hcea.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hceb hceb1 = (hceb)hftp1.b_message;
            hcea0.getClass();
            hceb1.g = hcea0;
            hceb1.b |= 8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gklc gklc0 = (gklc)hftp0.b_message;
            gklc0.b |= 4;
            gklc0.e = true;
            Account account0 = buyFlowConfig0.b.b;
            if(account0 == null) {
                Log.e("GetClientTokenOperation", "GetClientToken called for facilitated payments with null account");
                fbxe.h(context1, buyFlowConfig0, hftp0, 5, v);
                Status status0 = new Status(10, "GetClientToken requires a valid account for facilitated payments.");
                GetClientTokenResponse getClientTokenResponse0 = new GetClientTokenResponse(new byte[0]);
                this.e.d(status0, getClientTokenResponse0, Bundle.EMPTY);
                return;
            }
            fbwo fbwo0 = this.b;
            azth azth0 = fbwo0.e(buyFlowConfig0, account0, null);
            Status status1 = azth0.a;
            if(status1.e()) {
                int v1 = azth0.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gklc gklc1 = (gklc)hftp0.b_message;
                gklc1.b |= 8;
                gklc1.f = v1;
                gfdh gfdh0 = (gfdh)((ProtoLiteMessage)gfdm.a).v_newBuilder();
                if(!gfdh0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gfdh0).ensureMutable();
                }
                gfdm gfdm0 = (gfdm)gfdh0.b_message;
                gfdm0.b |= 1;
                gfdm0.c = v1 ^ 1;
                gfdm gfdm1 = (gfdm)((ProtoLiteBuilder)gfdh0).N_build();
                if(v1 != 0) {
                    eskv eskv0 = fbwo0.g(buyFlowConfig0, account0, null);
                    if(eskv0.a().e()) {
                        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gfdm1).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)gfdm1));
                        if(!((gfdh)hftp2).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((gfdh)hftp2))).ensureMutable();
                        }
                        ((gfdm)((gfdh)hftp2).b_message).d = hfvv.a;
                        ((gfdh)hftp2).a(fbru.H(eskv0.b().a));
                        gfdm1 = (gfdm)((ProtoLiteBuilder)(((gfdh)hftp2))).N_build();
                        goto label_63;
                    }
                    Log.w("GetClientTokenOperation", String.format(Locale.US, "Failed to fetch cards for Android Pay! status = %s message = %s", ((int)eskv0.a().i), eskv0.a().j));
                    fbxe.h(context1, buyFlowConfig0, hftp0, 4, v);
                    GetClientTokenResponse getClientTokenResponse1 = new GetClientTokenResponse(fbws.a);
                    this.e.d(Status.d, getClientTokenResponse1, Bundle.EMPTY);
                    return;
                }
            label_63:
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hcea0).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hcea hcea1 = (hcea)hftp3.b_message;
                gfdm1.getClass();
                hcea1.c = gfdm1;
                hcea1.b |= 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hceb hceb2 = (hceb)hftp1.b_message;
                hcea hcea2 = (hcea)hftp3.N_build();
                hcea2.getClass();
                hceb2.g = hcea2;
                hceb2.b |= 8;
                goto label_84;
            }
            SystemClock.elapsedRealtime();
            Log.w("GetClientTokenOperation", String.format(Locale.US, "Service layer check failed! status = %s message = %s", ((int)status1.i), status1.j));
            fbxe.h(context1, buyFlowConfig0, hftp0, 3, v);
            GetClientTokenResponse getClientTokenResponse2 = new GetClientTokenResponse(fbws.a);
            this.e.d(Status.d, getClientTokenResponse2, Bundle.EMPTY);
            return;
        }
    label_84:
        int v2 = 3;
        int v3 = getClientTokenRequest0.c == 2 ? 3 : 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hceb)hftp1.b_message).d = v3 - 1;
        ((hceb)hftp1.b_message).b |= 2;
        if(getClientTokenRequest0.c != 2) {
            v2 = 2;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hceb)hftp1.b_message).e = v2 - 1;
        ((hceb)hftp1.b_message).b |= 4;
        ProtoLiteBuilder hftp4 = gbgs.b();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        fbbw fbbw0 = (fbbw)hftp4.b_message;
        fbbw0.b |= 8;
        fbbw0.h = true;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        fbbw fbbw1 = (fbbw)hftp4.b_message;
        fbbw1.b |= 0x80;
        fbbw1.m = false;
        fbbw fbbw2 = (fbbw)hftp4.N_build();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hcec.a).v_newBuilder();
        gesx gesx0 = fbox.c(this.i, buyFlowConfig0, context1, fbbw2, getClientTokenRequest0.a);
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp5.b_message;
        gesx0.getClass();
        ((hcec)hftv0).c = gesx0;
        ((hcec)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp5.ensureMutable();
        }
        hcec hcec0 = (hcec)hftp5.b_message;
        hceb hceb3 = (hceb)hftp1.N_build();
        hceb3.getClass();
        hcec0.d = hceb3;
        hcec0.b |= 2;
        byte[] arr_b = ((hcec)hftp5.N_build()).toBytesArray();
        fbxe.h(context1, buyFlowConfig0, hftp0, 2, v);
        SystemClock.elapsedRealtime();
        GetClientTokenResponse getClientTokenResponse3 = new GetClientTokenResponse(arr_b);
        this.e.d(Status.b, getClientTokenResponse3, Bundle.EMPTY);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        GetClientTokenResponse getClientTokenResponse0 = new GetClientTokenResponse(fbws.a);
        this.e.d(Status.d, getClientTokenResponse0, Bundle.EMPTY);
    }
}

