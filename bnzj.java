public enum bnzj {
    SELF_PROVISIONING(true),
    SELF_PROVISIONING_AS_BEACON(true),
    ACCESSORY_PROVISIONING(false),
    ACCEPT_SHARING(false),
    NON_ADVERTISING_ACCESSORY_PROVISIONING(false),
    SELF_PROVISIONED_MAINTENANCE(false),
    MAINTENANCE(false);

    public final boolean h;

    private bnzj(boolean z) {
        this.h = z;
    }

    public static bnzj a(String s) {
        return (bnzj)Enum.valueOf(bnzj.class, s);
    }
}

