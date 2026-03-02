public enum fehf {
    CLIENT_SOCKET_CREATED("The BLE client socket has been created"),
    CLIENT_SOCKET_DESTROYED("The BLE client socket has been erased"),
    CONNECTED("The connection has been established and is active"),
    DISCONNECTED("The connection has been dropped");

    public final String e;

    private fehf(String s1) {
        this.e = s1;
    }
}

