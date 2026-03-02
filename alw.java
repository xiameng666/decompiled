public final class alw implements lqj {
    public final amf a;

    public alw(amf amf0) {
        this.a = amf0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            amf amf0 = this.a;
            CharSequence charSequence0 = amf0.a.e();
            if(charSequence0 == null) {
                charSequence0 = amf0.getString(0x7F150D05);  // string:default_error_msg "Unknown error"
            }
            amf0.A(13, charSequence0);
            amf0.y(2);
            amf0.a.o(false);
        }
    }
}

