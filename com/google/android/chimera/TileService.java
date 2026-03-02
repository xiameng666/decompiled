package com.google.android.chimera;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.quicksettings.Tile;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import wws;

@ChimeraApiVersion(added = 0L)
public class TileService extends Service {
    public static final String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    private wws a;

    public final Tile getQsTile() {
        return this.a.getQsTile();
    }

    public final boolean isLocked() {
        return this.a.isLocked();
    }

    public final boolean isSecure() {
        return this.a.isSecure();
    }

    @Override  // com.google.android.chimera.Service
    public IBinder onBind(Intent intent0) {
        try {
            return this.a.onBind(intent0);
        }
        catch(RuntimeException runtimeException0) {
            if((runtimeException0.getCause() instanceof RemoteException)) {
                return null;
            }
            throw runtimeException0;
        }
    }

    public void onClick() {
    }

    public void onStartListening() {
    }

    public void onStopListening() {
    }

    public void onTileAdded() {
    }

    public void onTileRemoved() {
    }

    @Override  // com.google.android.chimera.Service
    public boolean onUnbind(Intent intent0) {
        return this.a.onUnbind(intent0);
    }

    public static final void requestListeningState(Context context0, ComponentName componentName0) {
        wws.requestListeningState(context0, componentName0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Service.ProxyCallbacks service$ProxyCallbacks0, Context context0) {
        super.setProxyCallbacks(service$ProxyCallbacks0, context0);
        wws wws0 = new wws(this);
        this.a = wws0;
        wws0.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.Service
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((Service.ProxyCallbacks)object0), context0);
    }

    public final void setStatusIcon(Icon icon0, String s) {
        this.a.setStatusIcon(icon0, s);
    }

    public final void showDialog(Dialog dialog0) {
        this.a.showDialog(dialog0);
    }

    @ChimeraApiVersion(added = 0x88L)
    public final void startActivityAndCollapse(PendingIntent pendingIntent0) {
        this.a.startActivityAndCollapse(pendingIntent0);
    }

    @Deprecated
    public final void startActivityAndCollapse(Intent intent0) {
        this.a.startActivityAndCollapse(intent0);
    }

    public final void unlockAndRun(Runnable runnable0) {
        this.a.unlockAndRun(runnable0);
    }
}

