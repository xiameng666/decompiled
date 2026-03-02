public enum bmcf {
    CMD_PING((byte)0x81),
    CMD_MSG((byte)0x83),
    CMD_INIT((byte)0x86),
    CMD_WINK(-120),
    CMD_CBOR((byte)0x90),
    CMD_CANCEL((byte)0x91),
    CMD_KEEPALIVE(-69),
    CMD_ERROR(-65);

    public final byte i;

    private bmcf(byte b) {
        this.i = b;
    }
}

