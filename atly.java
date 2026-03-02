public final class atly implements atlp {
    public final omn a;
    public final oko b;
    public final okn c;

    public atly(omn omn0) {
        this.a = omn0;
        this.b = new atlw(this);
        this.c = new atlx(this);
    }

    @Override  // atlp
    public final atlo a(String s) {
        atlv atlv0 = new atlv(s);
        return (atlo)oqj.b(this.a, true, false, atlv0);
    }

    @Override  // atlp
    public final void b(atlo atlo0) {
        atlu atlu0 = new atlu(this, atlo0);
        Void void0 = (Void)oqj.b(this.a, false, true, atlu0);
    }

    public static final String c(int v) {
        switch(v - 1) {
            case 0: {
                return "RESTORED";
            }
            case 1: {
                return "FIRST_OPENED";
            }
            case 2: {
                return "CHECK_PASSED";
            }
            case 3: {
                return "DATA_RESET";
            }
            default: {
                return "UNREGISTERED";
            }
        }
    }

    public static final int d(String s) {
        switch(s) {
            case "CHECK_PASSED": {
                return 3;
            }
            case "DATA_RESET": {
                return 4;
            }
            case "FIRST_OPENED": {
                return 2;
            }
            case "RESTORED": {
                return 1;
            }
            case "UNREGISTERED": {
                return 5;
            }
            default: {
                throw new IllegalArgumentException("Can\'t convert value to enum, unknown value: " + s);
            }
        }
    }
}

