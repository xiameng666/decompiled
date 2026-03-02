import androidx.activity.result.ActivityResult;

public final class ajxz implements acn {
    public final ajyc a;

    public ajxz(ajyc ajyc0) {
        this.a = ajyc0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ajyc ajyc0 = this.a;
        if(((ActivityResult)object0).a == -1) {
            ((ggtj)ajyc.a.h()).x("Getting key again after challenge");
            ajyc0.a(true);
            return;
        }
        ((ggtj)ajyc.a.h()).x("Activity did not end with RESULT_OK");
        ajyc0.b(ajxm.e);
        ajyc0.f.ii(Boolean.valueOf(true));
    }
}

