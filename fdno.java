public enum fdno implements fdoc {
    CLOUD_SYNC_HEARTBEAT_ALARM_MANAGER("cloud-sync-heartbeat-alarm-manager"),
    CLOUD_SYNC_HEARTBEAT_TASK_SCHEDULER("cloud-sync-heartbeat-task-scheduler"),
    CLOUD_SYNC_RPC_SEND_DROPPED("cloud-sync-rpc-send-dropped"),
    CLOUD_SYNC_RPC_SEND_SUCCEEDED("cloud-sync-rpc-send-succeeded"),
    CLOUD_SYNC_RPC_SEND_RETRY_QUEUED("cloud-sync-rpc-send-retry-queued");

    public final String f;

    private fdno(String s1) {
        this.f = s1;
    }

    @Override  // fdoc
    public final String a() {
        return this.f;
    }

    @Override
    public final String toString() {
        return this.f;
    }
}

