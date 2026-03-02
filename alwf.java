import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

public final class alwf extends DialogFragment {
    @Override  // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle0) {
        int v = this.getArguments().getInt("error_dialog_code");
        Activity activity0 = this.getActivity();
        return azpm.a.a(activity0, v, 101, null);
    }

    @Override  // android.app.DialogFragment
    public final void onDismiss(DialogInterface dialogInterface0) {
        ((SourceChimeraActivity)this.getActivity()).o = false;
    }
}

