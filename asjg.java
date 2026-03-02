import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

public final class asjg implements View.OnClickListener {
    public final SetBackupAccountFlowChimeraActivity a;

    public asjg(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity0) {
        this.a = setBackupAccountFlowChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity0 = this.a;
        grje grje0 = setBackupAccountFlowChimeraActivity0.p;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)grje0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)grje0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje1 = (grje)hftp0.b_message;
        grje1.b |= 1;
        grje1.c = true;
        setBackupAccountFlowChimeraActivity0.p = (grje)hftp0.N_build();
        new asjl().show(setBackupAccountFlowChimeraActivity0.getSupportFragmentManager(), "TurnOffBackupConfirmationDialog");
    }
}

