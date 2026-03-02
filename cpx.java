import java.util.Objects;

public final class cpx implements ibth {
    public final cqq a;

    public cpx(cqq cqq0) {
        this.a = cqq0;
    }

    @Override  // ibth
    public final Object a() {
        cqq cqq0 = this.a;
        ctj ctj0 = (ctj)iel.a(cqq0, ctm.a);
        if(!(ctj0 instanceof ctp)) {
            Objects.toString(ctj0);
            dgr.c(("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + ctj0));
        }
        ctp ctp0 = cqq0.e;
        cqq0.e = (ctp)ctj0;
        if(ctp0 != null && !ibuq.m(cqq0.e, ctp0)) {
            cqq0.s();
        }
        return ibom.a;
    }
}

