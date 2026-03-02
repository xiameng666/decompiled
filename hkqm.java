public enum hkqm implements hfub {
    SEI_TSM_WORKFLOW_TYPE_UNSPECIFIED(0),
    REGISTER_SE(1),
    CREATE_PAYMENT_APPLET_INSTANCE(2),
    CREATE_MIFARE_F4M_APPLET_INSTANCE(3),
    DELETE_UNUSED_APPLET_INSTANCES(4),
    UPDATE_IPASS_ARA(5),
    UNRECOGNIZED(-1);

    private final int i;

    private hkqm(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkqm.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

