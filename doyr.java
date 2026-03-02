import android.content.Intent;
import android.os.Bundle;

public final class doyr implements dpdi {
    @Override  // dpdi
    public final du a(Intent intent0) {
        du du0 = new dwxg();
        Bundle bundle0 = intent0 == null ? null : intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        du0.setArguments(bundle0);
        du0.bk = gfta.b(bundle0.getString("CALLING_PACKAGE"));
        return du0;
    }
}

