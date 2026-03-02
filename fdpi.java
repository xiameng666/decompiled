import com.google.android.gms.wearable.node.AbstractCloudSyncManager.HeartbeatScheduledJobBroadcastReceiver;

public final class fdpi implements Runnable {
    public final AbstractCloudSyncManager.HeartbeatScheduledJobBroadcastReceiver a;
    public final int b;

    public fdpi(AbstractCloudSyncManager.HeartbeatScheduledJobBroadcastReceiver abstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver0, int v) {
        this.a = abstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.b.y(this.b);
    }
}

