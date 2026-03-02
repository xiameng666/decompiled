package com.google.android.gms.backup.settings.backupnow;

import android.net.Network;
import android.net.NetworkCapabilities;
import asgu;
import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class CustomBackupRunner.2 extends NetworkCallbackWrapper {
    final AtomicBoolean a;
    final asgu b;

    public CustomBackupRunner.2(asgu asgu0, AtomicBoolean atomicBoolean0) {
        this.a = atomicBoolean0;
        Objects.requireNonNull(asgu0);
        this.b = asgu0;
        super("backup", "CustomBackupRunnerNetworkCallback");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network0, NetworkCapabilities networkCapabilities0) {
        if(!networkCapabilities0.hasCapability(11)) {
            this.a.set(true);
            this.b.b();
            CustomBackupResult customBackupResult0 = new CustomBackupResult(false, "NETWORK_METERED");
            this.b.e.d(this.b.b, customBackupResult0);
        }
    }
}

