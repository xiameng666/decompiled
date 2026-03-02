import android.content.pm.SigningInfo;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.ClearCredentialStateRequest;
import android.service.credentials.CredentialProviderService;

public abstract class kwg extends CredentialProviderService {
    public abstract void a(kva arg1, CancellationSignal arg2, OutcomeReceiver arg3);

    public abstract void b(kvi arg1, CancellationSignal arg2, OutcomeReceiver arg3);

    public abstract void c(kwt arg1, CancellationSignal arg2, OutcomeReceiver arg3);

    public final void onBeginCreateCredential(BeginCreateCredentialRequest beginCreateCredentialRequest0, CancellationSignal cancellationSignal0, OutcomeReceiver outcomeReceiver0) {
        ibuq.f(beginCreateCredentialRequest0, "request");
        ibuq.f(cancellationSignal0, "cancellationSignal");
        ibuq.f(outcomeReceiver0, "callback");
        kwd kwd0 = new kwd(outcomeReceiver0);
        this.a(kxl.b(beginCreateCredentialRequest0), cancellationSignal0, kwd0);
    }

    public final void onBeginGetCredential(BeginGetCredentialRequest beginGetCredentialRequest0, CancellationSignal cancellationSignal0, OutcomeReceiver outcomeReceiver0) {
        ibuq.f(beginGetCredentialRequest0, "request");
        ibuq.f(cancellationSignal0, "cancellationSignal");
        ibuq.f(outcomeReceiver0, "callback");
        this.b(kyg.b(beginGetCredentialRequest0), cancellationSignal0, new kwe(outcomeReceiver0));
    }

    public final void onClearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest0, CancellationSignal cancellationSignal0, OutcomeReceiver outcomeReceiver0) {
        ibuq.f(clearCredentialStateRequest0, "request");
        ibuq.f(cancellationSignal0, "cancellationSignal");
        ibuq.f(outcomeReceiver0, "callback");
        kwf kwf0 = new kwf(outcomeReceiver0);
        ibuq.f(clearCredentialStateRequest0, "request");
        String s = clearCredentialStateRequest0.getCallingAppInfo().getPackageName();
        ibuq.e(s, "getPackageName(...)");
        SigningInfo signingInfo0 = clearCredentialStateRequest0.getCallingAppInfo().getSigningInfo();
        ibuq.e(signingInfo0, "getSigningInfo(...)");
        this.c(new kwt(kvu.a(s, signingInfo0, clearCredentialStateRequest0.getCallingAppInfo().getOrigin())), cancellationSignal0, kwf0);
    }
}

