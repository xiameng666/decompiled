package com.google.android.chimera;

import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.FullBackupDataOutput;
import android.os.ParcelFileDescriptor;
import java.io.File;

public interface BackupAgent.ProxyCallbacks {
    void chimeraSuperFullBackupFile(File arg1, FullBackupDataOutput arg2);

    void chimeraSuperOnCreate();

    void chimeraSuperOnDestroy();

    void chimeraSuperOnFullBackup(FullBackupDataOutput arg1);

    void chimeraSuperOnRestore(BackupDataInput arg1, long arg2, ParcelFileDescriptor arg3);

    void chimeraSuperOnRestoreFile(ParcelFileDescriptor arg1, long arg2, File arg3, int arg4, long arg5, long arg6);

    void chimeraSuperOnRestoreFinished();

    BackupAgent getContainerBackupAgent();

    void superOnQuotaExceeded(long arg1, long arg2);
}

