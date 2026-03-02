public abstract class ctyp implements cubh {
    private final String a;

    public ctyp() {
        this.a = "QuickAccessService";
    }

    @Override  // ykl
    public final ykk a(String s) {
        ibuq.f(s, "methodName");
        switch(s.hashCode()) {
            case -780614235: {
                if(s.equals("OpenDocument")) {
                    return new yki(new ctyg(this));
                }
                break;
            }
            case 0x12A0B671: {
                if(s.equals("GetDocument")) {
                    return new ykj(new ctyh(this, null));
                }
                break;
            }
            case 739477970: {
                if(s.equals("GetChildDocuments")) {
                    return new yki(new ctyf(this));
                }
                break;
            }
            case 1485248086: {
                if(s.equals("GetThumbnail")) {
                    return new ykj(new ctyi(this, null));
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

