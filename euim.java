import com.google.android.gms.tapandpay.firstparty.ValuableInfo;

public final class euim extends lp {
    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        return ibuq.m(((euiq)object0), ((euiq)object1));
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        if((((euiq)object0) instanceof euin) && (((euiq)object1) instanceof euin)) {
            return ibuq.m(((euin)(((euiq)object0))).a.a, ((euin)(((euiq)object1))).a.a);
        }
        if((((euiq)object0) instanceof euip) && (((euiq)object1) instanceof euip)) {
            ValuableInfo valuableInfo0 = ((euip)(((euiq)object0))).a;
            ValuableInfo valuableInfo1 = ((euip)(((euiq)object1))).a;
            return ibuq.m(valuableInfo0.q, valuableInfo1.q) ? valuableInfo0.p == valuableInfo1.p : false;
        }
        if((((euiq)object0) instanceof euio)) {
            if(!(((euiq)object1) instanceof euio)) {
                return false;
            }
            euio euio0 = (euio)(((euiq)object0));
            throw null;
        }
        return false;
    }
}

