import android.view.View.OnClickListener;
import android.view.View;

public final class dnii implements View.OnClickListener {
    public final dnjs a;

    public dnii(dnjs dnjs0) {
        this.a = dnjs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.i.d(hami.n);
        eflw eflw0 = new eflw();
        eflw0.b = this.a.e.getString(0x7F1523DF);  // string:pay_wallet_fops_delete_token_dialog_title "Turn off tap to pay?"
        eflw0.c = this.a.e.getString(0x7F1523DE);  // string:pay_wallet_fops_delete_token_dialog_message "You\'ll no longer be able to 
                                                   // tap to pay with this payment card. Your transaction history may also be deleted.\nTo 
                                                   // turn it back on, you\'ll need to repeat the setup process."
        eflw0.d = this.a.e.getString(0x7F1508F3);  // string:common_turn_off "Turn off"
        eflw0.e = this.a.e.getString(0x7F1507F2);  // string:common_cancel "Cancel"
        eflw0.a = 0x82770;
        eflw0.s = "Pay_ConfirmDeleteFopDialog";
        eflz eflz0 = eflw0.a();
        eflz0.setTargetFragment(this.a.e, 0x82770);
        eflz0.I(this.a.e.getParentFragmentManager(), "CONFIRM_DIALOG");
    }
}

