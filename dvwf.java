import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvwf implements evqf {
    public final dvxj a;
    public final gged_interceptors b;

    public dvwf(dvxj dvxj0, gged_interceptors gged0) {
        this.a = dvxj0;
        this.b = gged0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        dvxj dvxj0 = this.a;
        if(!dvxj0.aS.i()) {
            ((ggtj)dvxj.a.i()).x("Valuable group was not present on delete success!");
            dvxj0.I();
            return;
        }
        gged_interceptors gged0 = this.b;
        guwf guwf0 = guwf.i;
        if(dvxj0.T(guwf0) || dvxj0.T(guwf.k)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grns.a).v_newBuilder();
            gqtz gqtz0 = gqtz.jV;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grns grns0 = (grns)hftp0.b_message;
            grns0.c = gqtz0.a();
            grns0.b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
            grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
            grjx0.k((dvxj0.an.b ? 0x7F15244D : 0x7F15244C));  // string:pay_wallet_remove_from_wallet "Remove from Wallet?"
            grjx0.k((dvxj0.an.b ? 0x7F15248C : 0x7F15248D));  // string:pay_wallet_valuable_delete_dialog_message "You won\'t be able to use it with 
                                                              // Google Wallet or find it in your Google Account"
            grjx0.k(0x7F1507F2);  // string:common_cancel "Cancel"
            grjx0.k(0x7F1508C6);  // string:common_remove "Remove"
            grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grnk grnk0 = (grnk)hftp1.b_message;
            grjy0.getClass();
            grnk0.j = grjy0;
            grnk0.b |= 0x200;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grns grns1 = (grns)hftp0.b_message;
            grnk grnk1 = (grnk)hftp1.N_build();
            grnk1.getClass();
            grns1.f = grnk1;
            grns1.b |= 8;
            if(dvxj0.T(guwf0)) {
                dvxj0.d.b(false, gged0, ((grns)hftp0.N_build()));
            }
            else if(dvxj0.T(guwf.k)) {
                dvxj0.d.a(false, gged0, ((grns)hftp0.N_build()));
            }
        }
        ValuableGroup valuableGroup0 = (ValuableGroup)dvxj0.aS.d();
        if(valuableGroup0.a() == gged0.size()) {
            Intent intent0 = new Intent();
            intent0.putExtra("snackbar_message", dvxj0.E(valuableGroup0));
            dvxj0.ao().setResult(0x5BEDF, intent0);
            dvxj0.ar();
            return;
        }
        Context context0 = dvxj0.getContext();
        if(context0 != null) {
            Toast.makeText(context0, dvxj0.E(valuableGroup0), 1).show();
        }
        if(valuableGroup0.a() == gged0.size()) {
            dvxj0.I();
            return;
        }
        Integer integer0 = Math.max(0, dvxj0.aB.c - gged0.size());
        xob xob0 = dvxj0.an();
        if(xob0 == null) {
            ((ggtj)dvxj.a.i()).x("Could not find activity.");
            return;
        }
        GetValuablesRequest getValuablesRequest0 = dvxj0.y();
        evql evql0 = dvxj0.aY.aR(getValuablesRequest0);
        evql0.x(xob0, new dvwk(dvxj0, integer0));
        evql0.u(xob0, new dvwl(dvxj0, valuableGroup0, gged0, integer0));
        evql0.z(new dvwm(dvxj0));
    }
}

