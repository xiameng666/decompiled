import android.content.Context;
import android.safetycenter.SafetyCenterManager;

public final class cqiu implements Runnable {
    public final Context a;

    public cqiu(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        SafetyCenterManager safetyCenterManager0 = (SafetyCenterManager)this.a.getSystemService(SafetyCenterManager.class);
        cqnf cqnf0 = new cqnf(this.a);
        cqqo cqqo0 = new cqqo(this.a, cqnf0);
        if(safetyCenterManager0 != null) {
            cqqp.a(safetyCenterManager0, cqqo0, cqix.a);
        }
    }
}

