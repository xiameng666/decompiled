public final class kan {
    private final kam a;
    private final boolean b;

    public kan(kam kam0, boolean z) {
        this.a = kam0;
        this.b = z;
    }

    public final boolean a(CharSequence charSequence0, int v) {
        if(charSequence0 == null || v < 0 || charSequence0.length() - v < 0) {
            throw new IllegalArgumentException();
        }
        if(this.a != null) {
            int v2 = 2;
            for(int v1 = 0; v1 < v && v2 == 2; ++v1) {
                switch(Character.getDirectionality(charSequence0.charAt(v1))) {
                    case 0: 
                    case 14: 
                    case 15: {
                        v2 = 1;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 16: 
                    case 17: {
                        v2 = 0;
                        break;
                    }
                    default: {
                        v2 = 2;
                    }
                }
            }
            switch(v2) {
                case 0: {
                    return true;
                }
                case 1: {
                    return false;
                }
                default: {
                    return this.b;
                }
            }
        }
        return this.b;
    }
}

