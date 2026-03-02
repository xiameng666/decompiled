public final class izg implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        iwp iwp0;
        Object object2 = ((iwh)object1).a;
        if((object2 instanceof ixo)) {
            iwp0 = iwp.a;
            goto label_21;
        }
        if((object2 instanceof jat)) {
            iwp0 = iwp.b;
            goto label_21;
        }
        if((object2 instanceof jbp)) {
            iwp0 = iwp.c;
            goto label_21;
        }
        if((object2 instanceof jbq)) {
            iwp0 = iwp.d;
            goto label_21;
        }
        if((object2 instanceof iwz)) {
            iwp0 = iwp.e;
            goto label_21;
        }
        if((object2 instanceof iwy)) {
            iwp0 = iwp.f;
            goto label_21;
        }
        if((object2 instanceof jaw)) {
            iwp0 = iwp.g;
        label_21:
            switch(iwp0.ordinal()) {
                case 0: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    return ibpo.e(new Object[]{iwp0, jah.a(((ixo)object2), jah.h, ((haf)object0)), ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                case 1: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    return ibpo.e(new Object[]{iwp0, jah.a(((jat)object2), jah.i, ((haf)object0)), ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                case 2: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    return ibpo.e(new Object[]{iwp0, jah.a(((jbp)object2), jah.d, ((haf)object0)), ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                case 3: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    return ibpo.e(new Object[]{iwp0, jah.a(((jbq)object2), jah.e, ((haf)object0)), ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                case 4: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    return ibpo.e(new Object[]{iwp0, jah.a(((iwz)object2), jah.f, ((haf)object0)), ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                case 5: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    return ibpo.e(new Object[]{iwp0, jah.a(((iwy)object2), jah.g, ((haf)object0)), ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                case 6: {
                    ibuq.d(object2, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    return ibpo.e(new Object[]{iwp0, ((jaw)object2).a, ((int)((iwh)object1).b), ((int)((iwh)object1).c), ((iwh)object1).d});
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        throw new UnsupportedOperationException();
    }
}

