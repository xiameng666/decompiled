import java.util.List;

public final class eaer implements icih {
    final eaeu a;

    public eaer(eaeu eaeu0) {
        this.a = eaeu0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        eaeu eaeu0 = this.a;
        if((((frxf)object0) instanceof eafh)) {
            dzas.a(eaeu0, ((eafh)(((frxf)object0))).a, 0x404);
            return ibom.a;
        }
        if((((frxf)object0) instanceof eafg)) {
            eaeu0.I(((eafg)(((frxf)object0))).a);
            return ibom.a;
        }
        if((((frxf)object0) instanceof eaff)) {
            List list0 = eaeu0.A().n();
            eagt eagt0 = dzau.f(((hkjm)ibpo.R(list0)));
            eagu eagu0 = eaeu0.al;
            if(eagu0 == null) {
                ibuq.j("provisionData");
                eagu0 = null;
            }
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)eagu0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)eagu0));
            eagw eagw0 = eagv.a(hftp0);
            eagw0.c(eagt0);
            eagw0.i();
            eagw0.g();
            eagw0.i();
            eagw0.e(list0);
            eagu eagu1 = eagw0.a();
            ibuq.f(eagt0, "<this>");
            if((eagt0 == eagt.h || eagt0 == eagt.g) && list0.size() == 1) {
                eaeu0.I(eagu1);
                return ibom.a;
            }
            eagm eagm0 = eaeu0.ak;
            if(eagm0 == null) {
                ibuq.j("viewModel");
                eagm0 = null;
            }
            ibuq.f(eagu1, "provisionDataSelected");
            eagm0.g(eaex.a);
            icbb.b(lsc.a(eagm0), null, null, new eagc(eagm0, eagu1, null), 3);
            return ibom.a;
        }
        if((((frxf)object0) instanceof eafi)) {
            dzau.n(eaeu0.getParentFragmentManager(), ((eafi)(((frxf)object0))).a, ((eafi)(((frxf)object0))).b, ((eafi)(((frxf)object0))).c);
            return ibom.a;
        }
        if((((frxf)object0) instanceof eafj)) {
            dzau.o(eaeu0.requireContext(), eaeu0.getParentFragmentManager());
        }
        return ibom.a;
    }
}

