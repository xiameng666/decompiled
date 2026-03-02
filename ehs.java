public final class ehs implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        jat jat0;
        Object object1 = ((iwh)object0).a;
        if((object1 instanceof ixa)) {
            ibuq.d(object1, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
            if(!eid.a(((ixa)object1).b())) {
                iwh[] arr_iwh = {((iwh)object0), null};
                ibuq.d(object1, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                jbf jbf0 = ((ixa)object1).b();
                if(jbf0 == null) {
                    jat0 = new jat(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFF);
                }
                else {
                    jat0 = jbf0.a;
                    if(jat0 == null) {
                        jat0 = new jat(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 0xFFFF);
                    }
                }
                arr_iwh[1] = new iwh(jat0, ((iwh)object0).b, ((iwh)object0).c);
                return ibpo.e(arr_iwh);
            }
        }
        return ibpo.e(new iwh[]{((iwh)object0)});
    }
}

