public final class alt implements lqj {
    public final amf a;

    public alt(amf amf0) {
        this.a = amf0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((amt)object0) != null) {
            int v = ((amt)object0).a;
            switch(v) {
                case 18: 
                case 21: {
                    v = 1;
                    break;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 20: 
                case 22: {
                    break;
                }
                default: {
                    v = 8;
                }
            }
            amf amf0 = this.a;
            CharSequence charSequence0 = ((amt)object0).b;
            if(charSequence0 == null) {
                charSequence0 = amf0.getString(0x7F150D05) + " " + v;  // string:default_error_msg "Unknown error"
            }
            amf0.A(v, charSequence0);
            amf0.a.i(null);
        }
    }
}

