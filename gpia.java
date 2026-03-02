public final class gpia extends gpji {
    public static final iaoa a;
    public static final iaoa b;
    private final glzm c;

    static {
        gpia.a = new iant("Authorization", iaof_metadata.c);
        gpia.b = new iant("X-Auth-Time", iaof_metadata.c);
    }

    public gpia(glzm glzm0) {
        this.c = glzm0;
    }

    @Override  // gpji
    public final gpkv a() {
        return new gphz(this.c);
    }
}

