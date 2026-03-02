public enum bmla {
    SHUTDOWN(0),
    CTAP(1),
    UPDATE(2),
    JSON(3),
    UNKNOWN(100);

    final byte f;

    private bmla(int v1) {
        this.f = (byte)v1;
    }

    static bmla a(byte b) {
        switch(b) {
            case 0: {
                return bmla.a;
            }
            case 1: {
                return bmla.b;
            }
            case 2: {
                return bmla.c;
            }
            case 3: {
                return bmla.d;
            }
            case 4: {
                return bmla.e;
            }
            default: {
                throw new IllegalArgumentException("message type not found");
            }
        }
    }
}

