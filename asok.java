import android.os.Build.VERSION;
import java.util.concurrent.Callable;

public final class asok implements Callable {
    public final asom a;

    public asok(asom asom0) {
        this.a = asom0;
    }

    @Override
    public final Object call() {
        if(((long)Build.VERSION.SDK_INT) >= hqii.d()) {
            return this.a.a.d(this.a.b) ? ccni.c : ccni.d;
        }
        return ccni.e;
    }
}

