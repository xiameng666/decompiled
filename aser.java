import android.accounts.Account;
import android.content.Context;

public final class aser {
    public final Context a;
    private final icck b;
    private final foeg c;

    public aser(Context context0, aspd aspd0, aswy aswy0, icck icck0, foeg foeg0) {
        ibuq.f(aspd0, "healthDataBackupStateUseCase");
        ibuq.f(aswy0, "photosBackupStateDataSource");
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(foeg0, "googleOwnersProvider");
        super();
        this.a = context0;
        this.b = icck0;
        this.c = foeg0;
        aseq aseq0 = new aseq(aswy0.a(), this);
        asel asel0 = new asel(this, null);
        iclp.b(new icmj(aspd0.b, aseq0, asel0), icck0, icmy.a(0L, 3), aqqe.a);
    }

    public final Object a(Account account0, ibrl ibrl0) {
        asem asem0;
        if((ibrl0 instanceof asem)) {
            asem0 = (asem)ibrl0;
            int v = asem0.d;
            if((v & 0x80000000) == 0) {
                asem0 = new asem(this, ibrl0);
            }
            else {
                asem0.d = v - 0x80000000;
            }
        }
        else {
            asem0 = new asem(this, ibrl0);
        }
        Object object0 = asem0.b;
        Object object1 = ibrx.a;
        switch(asem0.d) {
            case 0: {
                ibnx.b(object0);
                if(account0 == null) {
                    return asdt.a;
                }
                gmcd gmcd0 = this.c.b(account0.name);
                ibuq.e(gmcd0, "loadOwner(...)");
                asem0.a = account0;
                asem0.d = 1;
                object0 = icpu.c(gmcd0, asem0);
                return object0 == object1 ? object1 : new asdu(account0, fnto.c(((foec)object0)));
            }
            case 1: {
                account0 = asem0.a;
                ibnx.b(object0);
                return new asdu(account0, fnto.c(((foec)object0)));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

