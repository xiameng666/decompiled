public enum ffaw {
    SET_ASSET("SetAsset", 2),
    ACK_ASSET("AckAsset", 3),
    FETCH_ASSET("FetchAsset", 4),
    CONNECT("Connect", 5),
    CRYPTO("Crypto", 6),
    SYNC_START("SyncStart", 7),
    SET_DATA_ITEM("SetDataItem", 8),
    RPC_REQUEST("RpcRequest", 9),
    CHANNEL_RPC_REQUEST("ChannelRpcRequest", 10),
    FILE_PIECE("FilePiece", 12),
    HEARTBEAT("Heartbeat", 11),
    RPC_SERVICE_REQUEST("RpcServiceRequest", 13),
    UNKNOWN("UnknownType", 1),
    CONTROL("ControlMessage", 14);

    public final String o;
    public final int p;

    private ffaw(String s1, int v1) {
        this.o = s1;
        this.p = v1;
    }
}

