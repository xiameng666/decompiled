import android.content.Context;
import android.os.Bundle;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;

public final class alnm implements ywx {
    @Override  // ywx
    public final Bundle a(Context context0, Bundle bundle0, ywb ywb0) {
        Bundle bundle1 = new Bundle(Bundler.class.getClassLoader());
        alro.a.a();
        boolean z = true;
        switch(alnj.c(new alnj(context0).a)) {
            case 1: 
            case 2: {
                break;
            }
            default: {
                z = false;
            }
        }
        BundlerType.a("boolean");
        bundle1.putBoolean("return", z);
        return bundle1;
    }
}

