public class hmfp extends Exception {
    public hmfl a;
    protected hmho b;

    public hmfp(hmfl hmfl0) {
        super(hmfl0.toString());
        this.a = hmfl0;
    }

    public hmfp(hmfl hmfl0, String s) {
        super(s);
        this.a = hmfl0;
    }

    public hmfp(hmho hmho0) {
        super(hmho0.toString());
        this.b = hmho0;
    }

    public hmfp(hmho hmho0, byte[] arr_b) {
        super("Unable to build DSRP output");
        this.b = hmho0;
    }

    public void a() {
    }

    public final hmho b() {
        hmho hmho0 = this.b;
        if(hmho0 != null) {
            return hmho0;
        }
        int v = this.a.ordinal();
        if(v != 3) {
            switch(v) {
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: 
                case 50: 
                case 51: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    return hmho.c;
                }
                default: {
                    return hmho.b;
                }
            }
        }
        return hmho.a;
    }

    public void c() {
    }
}

