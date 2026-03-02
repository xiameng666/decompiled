final class desi implements ibtx {
    final fzp a;
    final ibts b;
    final ibth c;

    public desi(fzp fzp0, ibts ibts0, ibth ibth0) {
        this.a = fzp0;
        this.b = ibts0;
        this.c = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        String s = isq.c(0x7F152BBC, ((goz)object1));  // string:sharing_bluetooth_turned_on_toast_message "Bluetooth turned on"
        ((goz)object1).M(5004770);
        ibts ibts0 = this.b;
        boolean z = ((goz)object1).X(ibts0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new desh(ibts0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ibth ibth0 = cmig.a(((cmhw)object0), ((ibth)object3));
        devo.P(this.a, s, ibth0, this.c, ((goz)object1));
        return ibom.a;
    }
}

