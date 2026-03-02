import com.google.android.gms.wallet.PaymentData;

final class dxqv implements acn, ibum {
    final dxqw a;

    public dxqv(dxqw dxqw0) {
        this.a = dxqw0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, dxqw.class, "paymentDataResultCallback", "paymentDataResultCallback(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof acn) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((fbgq)object0), "p0");
        int v = ((fbgq)object0).b.i;
        dxqw dxqw0 = this.a;
        dxmj dxmj0 = null;
        switch(v) {
            case 0: {
                Object object1 = ((fbgq)object0).a;
                if(object1 != null) {
                    dxmj dxmj1 = dxqw0.aq;
                    if(dxmj1 == null) {
                        ibuq.j("viewModel");
                    }
                    else {
                        dxmj0 = dxmj1;
                    }
                    dxmj0.c(((PaymentData)object1));
                    return;
                }
                ((ggtj)dxqw.a.j()).x("Payment data is null");
                dxqw.U(dxqw0, null, null, null, true, 7);
                return;
            }
            case 1: 
            case 8: {
                ((ggtj)dxqw.a.j()).z("Payment unsuccessful. Status code: %d", v);
                dxqw.U(dxqw0, null, null, null, true, 7);
                return;
            }
            case 16: {
                dxmj dxmj2 = dxqw0.aq;
                if(dxmj2 == null) {
                    ibuq.j("viewModel");
                }
                else {
                    dxmj0 = dxmj2;
                }
                dxmj0.e();
                return;
            }
            default: {
                ((ggtj)dxqw.a.j()).z("Unexpected status code: %d", v);
                dxqw.U(dxqw0, null, null, null, true, 7);
            }
        }
    }
}

