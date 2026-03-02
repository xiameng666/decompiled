import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;

public final class ezsx extends de {
    public DialogInterface.OnCancelListener ag;

    public ezsx() {
        this.ag = null;
    }

    @Override  // de
    public final void onCancel(DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.ag;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        this.setRetainInstance(true);
        super.onCreate(bundle0);
    }

    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        String s = this.getArguments().getString("ProgressDialogMessage");
        Dialog dialog0 = new ProgressDialog(this.getContext());
        if(!TextUtils.isEmpty(s)) {
            ((ProgressDialog)dialog0).setMessage(s);
        }
        ((ProgressDialog)dialog0).setIndeterminate(true);
        ((ProgressDialog)dialog0).setCanceledOnTouchOutside(false);
        return dialog0;
    }

    @Override  // de
    public final void onDestroyView() {
        if(this.getDialog() != null && this.getRetainInstance()) {
            this.getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}

