import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

public interface ajoy extends IInterface {
    PendingIntent a(SetupAccountWorkflowRequest arg1);

    PendingIntent b(AccountRemovalAllowedWorkflowRequest arg1);

    PendingIntent c(StartAddAccountSessionWorkflowRequest arg1);

    Bundle d(SetupAccountWorkflowRequest arg1);

    PendingIntent e(FinishSessionWorkflowRequest arg1);

    PendingIntent f(UpdateCredentialsWorkflowRequest arg1);

    PendingIntent g(ConfirmCredentialsWorkflowRequest arg1);

    PendingIntent j(TokenWorkflowRequest arg1);

    PendingIntent k(UpdateCredentialsWorkflowRequest arg1);

    Bundle n(TokenWorkflowRequest arg1);
}

