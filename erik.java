import android.content.Context;
import android.os.Trace;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeRequest;
import com.google.android.gms.smartdevice.setup.auth.GetChallengeResponse;

public final class erik extends cjtm {
    private final erhw a;
    private final GetChallengeRequest b;
    private final erhr c;

    public erik(erhw erhw0, GetChallengeRequest getChallengeRequest0, erhr erhr0, azug azug0) {
        super(275, "GetChallenge", azug0);
        this.a = erhw0;
        this.b = getChallengeRequest0;
        this.c = erhr0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        GetChallengeResponse getChallengeResponse0;
        Status status0 = Status.b;
        Trace.beginSection("GetChallengeOperation-execute");
        try {
            getChallengeResponse0 = this.c.a(this.b);
        }
        catch(erhq erhq0) {
            getChallengeResponse0 = null;
            status0 = new Status(erhq0.a);
        }
        Trace.endSection();
        this.a.b(status0, getChallengeResponse0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.b(status0, null);
    }
}

