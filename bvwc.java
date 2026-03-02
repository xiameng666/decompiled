import android.content.Context;
import com.google.android.chimera.config.ModuleManager.ModuleApkInfo;
import com.google.android.chimera.config.ModuleManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class bvwc implements Factory {
    private final Provider a;

    public bvwc(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        ModuleManager.ModuleApkInfo moduleManager$ModuleApkInfo0 = ModuleManager.get(((Context)this.a.get())).getCurrentModuleApk();
        Object object0 = moduleManager$ModuleApkInfo0 == null ? "com.google.android.gms" : moduleManager$ModuleApkInfo0.apkPackageName;
        Preconditions.f(object0);
        return object0;
    }
}

