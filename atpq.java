import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.bankscamwarning.ui.BankWarningDialogChimeraActivity;
import com.google.android.material.button.MaterialButton;

public final class atpq extends ibsl implements ibtw {
    int a;
    final BankWarningDialogChimeraActivity b;
    final String c;

    public atpq(BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0, String s, ibrl ibrl0) {
        this.b = bankWarningDialogChimeraActivity0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atpq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new atpq(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            long v1 = hxvd.a.c().a();
            this.a = 1;
            if(iccv.c(v1, this) == object1) {
                return object1;
            }
        }
        BankWarningDialogChimeraActivity bankWarningDialogChimeraActivity0 = this.b;
        if(!bankWarningDialogChimeraActivity0.isFinishing() && !bankWarningDialogChimeraActivity0.isDestroyed() && !bankWarningDialogChimeraActivity0.x && (bankWarningDialogChimeraActivity0.w != null && ibuq.m(this.c, bankWarningDialogChimeraActivity0.w))) {
            if(bankWarningDialogChimeraActivity0.o == null) {
                ibuq.j("bankAppScamDetectionManager");
            }
            if(!ator.j(ator.i())) {
                Dialog dialog0 = bankWarningDialogChimeraActivity0.p;
                if(dialog0 == null) {
                    ((ggtj)BankWarningDialogChimeraActivity.j.i()).x("dialog not initialized; skipping updateDialogUiOnCallEnd");
                }
                else {
                    MaterialButton materialButton0 = (MaterialButton)dialog0.findViewById(0x7F0B0D89);  // id:buttonEndCall
                    if(cjmf.b(bankWarningDialogChimeraActivity0, "android.permission.FORCE_STOP_PACKAGES") == 0) {
                        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("FORCE_STOP_PACKAGE permission is granted in updateDialogUiOnCallEnd.");
                        materialButton0.setText("Stop sharing screen now");
                        materialButton0.v(0x7F0804F5);  // drawable:gs_cancel_presentation_vd_theme_24
                        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Action button updated to only stop screen sharing");
                    }
                    else {
                        bboh bboh0 = BankWarningDialogChimeraActivity.j;
                        ((ggtj)bboh0.h()).x("FORCE_STOP_PACKAGE permission is not granted in updateDialogUiOnCallEnd.");
                        Dialog dialog1 = bankWarningDialogChimeraActivity0.p;
                        Dialog dialog2 = null;
                        if(dialog1 == null) {
                            ibuq.j("dialog");
                            dialog1 = null;
                        }
                        View view0 = dialog1.findViewById(0x7F0B0DA6);  // id:button_common_group_section
                        if(view0 != null) {
                            view0.setVisibility(8);
                        }
                        Dialog dialog3 = bankWarningDialogChimeraActivity0.p;
                        if(dialog3 == null) {
                            ibuq.j("dialog");
                            dialog3 = null;
                        }
                        View view1 = dialog3.findViewById(0x7F0B13EE);  // id:first_item
                        if(view1 != null) {
                            view1.setVisibility(8);
                        }
                        Dialog dialog4 = bankWarningDialogChimeraActivity0.p;
                        if(dialog4 == null) {
                            ibuq.j("dialog");
                            dialog4 = null;
                        }
                        View view2 = dialog4.findViewById(0x7F0B1F63);  // id:second_item
                        if(view2 != null) {
                            view2.setVisibility(8);
                        }
                        Dialog dialog5 = bankWarningDialogChimeraActivity0.p;
                        if(dialog5 == null) {
                            ibuq.j("dialog");
                            dialog5 = null;
                        }
                        TextView textView0 = (TextView)dialog5.findViewById(0x7F0B2260);  // id:textDontShare
                        if(textView0 != null) {
                            textView0.setText("Stop sharing your screen before continuing");
                        }
                        Dialog dialog6 = bankWarningDialogChimeraActivity0.p;
                        if(dialog6 == null) {
                            ibuq.j("dialog");
                            dialog6 = null;
                        }
                        TextView textView1 = (TextView)dialog6.findViewById(0x7F0B2265);  // id:textSharingScreen
                        if(textView1 != null) {
                            textView1.setText("The caller ended the call, but you are still sharing your screen");
                        }
                        Dialog dialog7 = bankWarningDialogChimeraActivity0.p;
                        if(dialog7 == null) {
                            ibuq.j("dialog");
                            dialog7 = null;
                        }
                        View view3 = dialog7.findViewById(0x7F0B0F1E);  // id:close_button_section
                        if(view3 != null) {
                            view3.setVisibility(0);
                        }
                        Dialog dialog8 = bankWarningDialogChimeraActivity0.p;
                        if(dialog8 == null) {
                            ibuq.j("dialog");
                        }
                        else {
                            dialog2 = dialog8;
                        }
                        MaterialButton materialButton1 = (MaterialButton)dialog2.findViewById(0x7F0B0D84);  // id:buttonCloseDialog
                        ((ggtj)bboh0.h()).x("Set up click listener for buttonCloseDialog");
                        materialButton1.setOnClickListener(new atpl(bankWarningDialogChimeraActivity0));
                        ibuq.c(materialButton1);
                        materialButton1.setVisibility(0);
                    }
                }
                ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Call ended & projection still active, updated dialog.");
                return ibom.a;
            }
            ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Projection already stopped, no need to update dialog.");
            return ibom.a;
        }
        ((ggtj)BankWarningDialogChimeraActivity.j.h()).x("Skipping call end broadcast after delay: activity is finishing/destroyed or dismissed by user or session id mismatch.");
        return ibom.a;
    }
}

