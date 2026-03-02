package com.google.android.chimera;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.File;
import xcv;
import xcw;

@ChimeraApiVersion(added = 0L)
public abstract class BackupAgent extends ContextWrapper implements xcv, xcw {
    private BackupAgent.ProxyCallbacks a;

    public BackupAgent() {
        super(null);
    }

    public final void fullBackupFile(File file0, FullBackupDataOutput fullBackupDataOutput0) {
        this.a.chimeraSuperFullBackupFile(file0, fullBackupDataOutput0);
    }

    @Override  // xcw
    public Object getChimeraImpl() {
        return this;
    }

    @ChimeraApiVersion(added = 0x91L)
    public android.app.backup.BackupAgent getContainerBackupAgent() {
        return this.a.getContainerBackupAgent();
    }

    public abstract void onBackup(ParcelFileDescriptor arg1, BackupDataOutput arg2, ParcelFileDescriptor arg3);

    public void onCreate() {
        this.a.chimeraSuperOnCreate();
    }

    public void onDestroy() {
        this.a.chimeraSuperOnDestroy();
    }

    public void onFullBackup(FullBackupDataOutput fullBackupDataOutput0) {
        this.a.chimeraSuperOnFullBackup(fullBackupDataOutput0);
    }

    public void onQuotaExceeded(long v, long v1) {
        this.a.superOnQuotaExceeded(v, v1);
    }

    public abstract void onRestore(BackupDataInput arg1, int arg2, ParcelFileDescriptor arg3);

    public void onRestore(BackupDataInput backupDataInput0, long v, ParcelFileDescriptor parcelFileDescriptor0) {
        this.a.chimeraSuperOnRestore(backupDataInput0, v, parcelFileDescriptor0);
    }

    public void onRestoreFile(ParcelFileDescriptor parcelFileDescriptor0, long v, File file0, int v1, long v2, long v3) {
        this.a.chimeraSuperOnRestoreFile(parcelFileDescriptor0, v, file0, v1, v2, v3);
    }

    public void onRestoreFinished() {
        this.a.chimeraSuperOnRestoreFinished();
    }

    public void setProxyCallbacks(BackupAgent.ProxyCallbacks backupAgent$ProxyCallbacks0, Context context0) {
        this.a = backupAgent$ProxyCallbacks0;
        this.attachBaseContext(context0);
    }

    @Override  // xcv
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((BackupAgent.ProxyCallbacks)object0), context0);
    }
}

