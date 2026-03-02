public enum gynl implements hfub {
    REASON_UNKNOWN(0),
    REASON_MANUAL_TURN_OFF_AUDIO_SHARING_FROM_SETTINGS(1),
    REASON_MANUAL_TURN_OFF_AUDIO_SHARING_FROM_HALF_SHEET(2),
    REASON_MANUAL_UNPAIR_TEMP_BOND_PERIPHERAL(3),
    REASON_TEMP_BOND_PERIPHERAL_DISCONNECT(4),
    REASON_NO_ACTIVE_MEDIA_SESSION(5);

    public final int g;

    private gynl(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static gynl b(int v) {
        switch(v) {
            case 0: {
                return gynl.a;
            }
            case 1: {
                return gynl.b;
            }
            case 2: {
                return gynl.c;
            }
            case 3: {
                return gynl.d;
            }
            case 4: {
                return gynl.e;
            }
            case 5: {
                return gynl.f;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

