public abstract class ctxs implements ctzf {
    private final String a;

    public ctxs() {
        this.a = "AppCastService";
    }

    @Override  // ykl
    public final ykk a(String s) {
        ibuq.f(s, "methodName");
        switch(s.hashCode()) {
            case -2058830263: {
                if(s.equals("GetAppList")) {
                    return new ykj(new ctxk(this, null));
                }
                break;
            }
            case 0xCC230FA3: {
                if(s.equals("ExchangeSignalingMessages")) {
                    return new ykg(new ctxj(this));
                }
                break;
            }
            case 0x5EB93CCF: {
                if(s.equals("GetIcon")) {
                    return new ykj(new ctxl(this, null));
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }

    @Override  // ykl
    public final String b() {
        return this.a;
    }
}

