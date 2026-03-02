import com.google.android.libraries.messaging.lighter.model.ContactId.ContactType;

public final class flnr extends gfsd {
    @Override  // gfsd
    protected final Object a(Object object0) {
        switch(((flnx)object0).ordinal()) {
            case 0: {
                return ContactId.ContactType.a;
            }
            case 1: {
                return ContactId.ContactType.b;
            }
            case 2: {
                return ContactId.ContactType.c;
            }
            case 3: {
                return ContactId.ContactType.d;
            }
            case 4: {
                return ContactId.ContactType.a;
            }
            case 5: {
                return ContactId.ContactType.e;
            }
            default: {
                throw new IllegalArgumentException("unknown enum value: " + ((flnx)object0).toString());
            }
        }
    }

    @Override  // gfsd
    protected final Object b(Object object0) {
        switch(((ContactId.ContactType)object0).ordinal()) {
            case 0: {
                return flnx.a;
            }
            case 1: {
                return flnx.b;
            }
            case 2: {
                return flnx.c;
            }
            case 3: {
                return flnx.d;
            }
            case 4: {
                return flnx.f;
            }
            default: {
                throw new IllegalArgumentException("unknown enum value: " + ((ContactId.ContactType)object0).toString());
            }
        }
    }
}

