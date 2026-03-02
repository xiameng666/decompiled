import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.Arrays;
import java.util.List;

public final class gbba extends gaok {
    public gbba(gamx gamx0) {
        super(gamx0);
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Intent intent1;
        hckj hckj1;
        gamx gamx0 = this.d();
        gaxl.a();
        Context context0 = this.a;
        GoogleAccountStateSnapshot googleAccountStateSnapshot0 = gaup.a(AccountManager.get(context0));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hduv.a).v_newBuilder();
        Intent intent0 = gano0.a;
        byte[] arr_b = intent0.getByteArrayExtra("encryptedParameters");
        if(arr_b != null) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hduv hduv0 = (hduv)hftp0.b_message;
            hduv0.b |= 4;
            hduv0.e = hfsf0;
        }
        byte[] arr_b1 = intent0.getByteArrayExtra("unencryptedParameters");
        if(arr_b1 != null) {
            ByteString hfsf1 = ByteString.copyFrom(arr_b1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hduv hduv1 = (hduv)hftp0.b_message;
            hduv1.b |= 8;
            hduv1.f = hfsf1;
        }
        hduv hduv2 = (hduv)hftp0.N_build();
        String[] arr_s = intent0.getStringArrayExtra("secureDataHeader");
        WidgetConfig widgetConfig0 = gano0.f();
        byte[] arr_b2 = hduv2.toBytesArray();
        if(arr_s == null) {
            hckj1 = null;
        }
        else {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hckj.a).v_newBuilder();
            List list0 = Arrays.asList(arr_s);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hckj hckj0 = (hckj)hftp1.b_message;
            hfuo hfuo0 = hckj0.b;
            if(!hfuo0.c()) {
                hckj0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, hckj0.b);
            hckj1 = (hckj)hftp1.N_build();
        }
        ganp ganp0 = gamx0.a(gbbl.c(widgetConfig0, arr_b2, null, hckj1, intent0.getBooleanExtra("shouldLog", true), googleAccountStateSnapshot0, this.f()));
        byte[] arr_b3 = gbbl.g(ganp0, true);
        if(ganp0.b() == 0 && arr_b3 != null) {
            hdvg hdvg0 = (hdvg)gawi.g(arr_b3, ((Parser)((ProtoLiteMessage)hdvf.a).jf(7, null)));
            gaym gaym0 = this.f();
            ibuq.f(hdvg0, "uiResponse");
            ibuq.f(context0, "context");
            hcst hcst0 = gawz.a(hdvg0, context0, gaym0, null);
            intent1 = ganp.e(0);
            if(hcss.a(hcst0.e) != 5) {
                intent1.putExtra("responseType", 50);
                intent1.putExtra("widgetInitializeToken", arr_b3);
                return new ganp(intent1);
            }
            if(((hcst0.c == 5 ? ((hcsu)hcst0.d) : hcsu.a).b & 1) != 0) {
                intent1.putExtra("responseType", 49);
                hcsu hcsu0 = hcst0.c == 5 ? ((hcsu)hcst0.d) : hcsu.a;
                hcjo hcjo0 = hcsu0.c == null ? hcjo.a : hcsu0.c;
                intent1.putExtra("integratorData", (hcjo0.b == 1 ? ((ByteString)hcjo0.c) : ByteString.b).toByteArray());
                return new ganp(intent1);
            }
            intent1.putExtra("responseType", 39);
            return new ganp(intent1);
        }
        intent1 = ganp.d(ganp0.a());
        intent1.putExtra("responseType", 39);
        return new ganp(intent1);
    }
}

