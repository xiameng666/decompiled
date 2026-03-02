public final class rie extends Exception {
    public final int a;
    public final int b;
    public final String c;

    public rie(int v, int v1, String s, String s1) {
        super(s1);
        this.a = v;
        this.b = v1;
        this.c = s;
    }

    public rie(int v, String s) {
        this(v, -1, "", s);
    }

    public rie(rhb rhb0) {
        int v;
        switch(rhb0.a) {
            case 20: {
                v = 4;
                break;
            }
            case 21: {
                v = 5;
                break;
            }
            case 22: {
                v = 6;
                break;
            }
            case 10: 
            case 30: {
                v = 3;
                break;
            }
            case 0x1F: {
                v = 7;
                break;
            }
            case 0x20: 
            case 60: {
                v = 8;
                break;
            }
            default: {
                v = 0;
            }
        }
        this(v, (rhb0.b == 0 ? -1 : rhb0.b), (rhb0.c != null && !rhb0.c.isEmpty() && !rhb0.c.equals("") ? rhb0.c : ""), rhb0.getMessage());
    }
}

