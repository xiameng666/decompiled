import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

public final class bdki implements ibth {
    public final bdku a;

    public bdki(bdku bdku0) {
        this.a = bdku0;
    }

    @Override  // ibth
    public final Object a() {
        bdku bdku0 = this.a;
        Parcelable parcelable0 = bdku0.requireArguments().getParcelable("request_intent_key");
        Intent intent0 = (parcelable0 instanceof Intent) ? ((Intent)parcelable0) : null;
        if(intent0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object0 = new lua(bdku0.getDefaultViewModelCreationExtras());
        Bundle bundle0 = jyu.a(new ibns[]{new ibns("request_intent_key", intent0)});
        ((lua)object0).b(lrm.c, bundle0);
        return object0;
    }
}

