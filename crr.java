public final class crr implements ibtx {
    public final ibth a;

    public crr(ibth ibth0) {
        this.a = ibth0;
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dgg dgg0;
        hfc hfc0 = (hfc)object0;
        Integer integer0 = (Integer)object2;
        ((goz)object1).M(0xD2EF1E09);
        ctj ctj0 = (ctj)((goz)object1).h(ctm.a);
        if((ctj0 instanceof ctp)) {
            ((goz)object1).M(0xA05A7DFE);
            ((goz)object1).A();
            dgg0 = null;
        }
        else {
            ((goz)object1).M(0xA05C8408);
            Object object3 = ((goz)object1).k();
            if(object3 == gop.a) {
                object3 = new dgh();
                ((goz)object1).R(object3);
            }
            dgg0 = (dgg)object3;
            ((goz)object1).A();
        }
        Object object4 = cru.a(hfc.e, dgg0, ctj0, true, null, null, this.a);
        ((goz)object1).A();
        return object4;
    }
}

