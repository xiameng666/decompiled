import android.content.Context;
import android.widget.Toast;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvry implements evqf {
    public final dvsn a;
    public final gged_interceptors b;

    public dvry(dvsn dvsn0, gged_interceptors gged0) {
        this.a = dvsn0;
        this.b = gged0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        dvsn dvsn0 = this.a;
        if(dvsn0.aD == null) {
            ((ggtj)dvsn.a.i()).x("Valuable group was not present on delete success!");
            dvsn0.E();
            return;
        }
        gged_interceptors gged0 = this.b;
        guwf guwf0 = guwf.i;
        if(dvsn0.S(guwf0) || dvsn0.S(guwf.k)) {
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
            grjx0.k((dvsn0.ak.b ? 0x7F15244D : 0x7F15244C));  // string:pay_wallet_remove_from_wallet "Remove from Wallet?"
            grjx0.k((dvsn0.ak.b ? 0x7F15248C : 0x7F15248D));  // string:pay_wallet_valuable_delete_dialog_message "You won\'t be able to use it with 
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
            if(dvsn0.S(guwf0)) {
                dvsn0.ap.b(false, gged0, ((grns)hftp0.N_build()));
            }
            else if(dvsn0.S(guwf.k)) {
                dvsn0.ap.a(false, gged0, ((grns)hftp0.N_build()));
            }
        }
        ValuableGroup valuableGroup0 = dvsn0.aD;
        Context context0 = dvsn0.getContext();
        if(context0 != null) {
            CharSequence charSequence0 = dvsn0.getText(0x7F151E66);  // string:pay_generic_card_removed_toast "Pass removed"
            if(valuableGroup0.f().i()) {
                switch(((guwf)valuableGroup0.f().d()).ordinal()) {
                    case 1: {
                        charSequence0 = dvsn0.getText(0x7F151F5D);  // string:pay_loyalty_card_removed_toast "Loyalty card removed"
                        break;
                    }
                    case 2: {
                        charSequence0 = dvsn0.getText(0x7F151E6F);  // string:pay_gift_card_removed_toast "Gift card removed"
                        break;
                    }
                    case 3: {
                        charSequence0 = dvsn0.getText(0x7F151FD6);  // string:pay_offer_removed_toast "Offer removed"
                        break;
                    }
                    case 5: {
                        charSequence0 = dvsn0.getText(0x7F151DE3);  // string:pay_event_ticket_removed_toast "Event ticket removed"
                        break;
                    }
                    case 6: {
                        charSequence0 = dvsn0.getText(0x7F151C13);  // string:pay_boarding_pass_removed_toast "Boarding pass removed"
                        break;
                    }
                    case 7: {
                        charSequence0 = dvsn0.getText(0x7F1522B9);  // string:pay_transit_card_removed_toast "Transit card removed"
                        break;
                    }
                    case 8: {
                        charSequence0 = dvsn0.getText(0x7F151E81);  // string:pay_health_card_removed_toast "COVID-19 card removed"
                        break;
                    }
                    case 10: {
                        charSequence0 = dvsn0.getText(0x7F151E6A);  // string:pay_generic_private_pass_removed_toast "Private pass removed"
                        break;
                    }
                    default: {
                        charSequence0 = dvsn0.getText(0x7F151E66);  // string:pay_generic_card_removed_toast "Pass removed"
                    }
                }
            }
            Toast.makeText(context0, charSequence0, 1).show();
        }
        if(valuableGroup0.a() == gged0.size()) {
            dvsn0.E();
            return;
        }
        Integer integer0 = Math.max(0, dvsn0.aF.a - gged0.size());
        xob xob0 = dvsn0.an();
        if(xob0 == null) {
            ((ggtj)dvsn.a.i()).x("Could not find activity.");
            return;
        }
        GetValuablesRequest getValuablesRequest0 = dvsn0.y();
        evql evql0 = dvsn0.aT.aR(getValuablesRequest0);
        evql0.x(xob0, new dvsc(dvsn0, integer0));
        evql0.u(xob0, new dvsd(dvsn0, valuableGroup0, gged0, integer0));
        evql0.z(new dvse(dvsn0));
    }
}

