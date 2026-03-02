import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController.ImportReceiver;
import j..util.Objects;

public final class eqcv implements Runnable {
    final Intent a;
    final TargetAccountImportController.ImportReceiver b;

    public eqcv(TargetAccountImportController.ImportReceiver targetAccountImportController$ImportReceiver0, Intent intent0) {
        this.a = intent0;
        Objects.requireNonNull(targetAccountImportController$ImportReceiver0);
        this.b = targetAccountImportController$ImportReceiver0;
        super();
    }

    @Override
    public final void run() {
        Bundle bundle0 = this.a.getExtras();
        batl.s(bundle0);
        String s = bundle0.getString("restoreAccount");
        String s1 = bundle0.getString("restoreToken");
        this.b.a.d.e(s, s1);
        ResultReceiver resultReceiver0 = (ResultReceiver)bundle0.getParcelable("resultReceiver");
        if(resultReceiver0 == null) {
            eqcx.a.f("ResultReceiver was null", new Object[0]);
            return;
        }
        resultReceiver0.send(0, null);
    }
}

