import android.content.Intent;
import android.os.Bundle;

public final class dozj implements dpdi {
    @Override  // dpdi
    public final du a(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        int v = bundle0.getInt("USER_CREATED_PASS_VERSION", 0);
        switch(v) {
            case 1: {
                return dwgt.y(intent0);
            }
            case 0: 
            case 2: {
                ibuq.f(intent0, "intent");
                du du0 = new dwfy();
                Bundle bundle1 = intent0.getExtras();
                if(bundle1 == null) {
                    bundle1 = new Bundle();
                }
                du0.setArguments(bundle1);
                return du0;
            }
            default: {
                throw new IllegalArgumentException("Unsupported user created pass version: " + v);
            }
        }
    }
}

