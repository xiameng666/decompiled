import androidx.preference.TwoStatePreference;

final class ctau implements icih {
    final TwoStatePreference a;
    final TwoStatePreference b;

    public ctau(TwoStatePreference twoStatePreference0, TwoStatePreference twoStatePreference1) {
        this.a = twoStatePreference0;
        this.b = twoStatePreference1;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        this.a.k(csyn.a(((cteb)((csyf)object0).e.get(new Integer(4)))));
        this.b.k(csyn.a(((cteb)((csyf)object0).e.get(new Integer(5)))));
        return ibom.a;
    }
}

