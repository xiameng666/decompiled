import com.google.android.gms.trustagent.activeunlock.primary.ui.screenlock.AssociatedDeviceScreenLockSetUpFragment;

public final class eywc extends ibuo implements ibts {
    public eywc(Object object0) {
        super(1, object0, AssociatedDeviceScreenLockSetUpFragment.class, "updateState", "updateState(Lcom/google/android/gms/trustagent/activeunlock/primary/ui/screenlock/AssociatedScreenLockSetUpUiState;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((eywv)object0), "p0");
        AssociatedDeviceScreenLockSetUpFragment associatedDeviceScreenLockSetUpFragment0 = (AssociatedDeviceScreenLockSetUpFragment)this.e;
        associatedDeviceScreenLockSetUpFragment0.ag.c(((eywv)object0).a);
        switch(((eywv)object0).b.ordinal()) {
            case 0: {
                return ibom.a;
            }
            case 1: {
                associatedDeviceScreenLockSetUpFragment0.C();
                icbb.b(lpt.a(associatedDeviceScreenLockSetUpFragment0.getViewLifecycleOwner()), null, null, new eywn(associatedDeviceScreenLockSetUpFragment0, null), 3);
                associatedDeviceScreenLockSetUpFragment0.B().i();
                return ibom.a;
            }
            case 2: {
                associatedDeviceScreenLockSetUpFragment0.C();
                eyuf.a(associatedDeviceScreenLockSetUpFragment0, new eywo(associatedDeviceScreenLockSetUpFragment0.B()));
                associatedDeviceScreenLockSetUpFragment0.B().i();
                return ibom.a;
            }
            case 3: {
                associatedDeviceScreenLockSetUpFragment0.C();
                eyxf eyxf0 = new eyxf();
                eyxf0.setArguments(jyu.a(new ibns[]{new ibns("dialogType", ((int)1))}));
                eyxf0.show(associatedDeviceScreenLockSetUpFragment0.getChildFragmentManager(), "ScreenLockSetUpFailureDialogFragment");
                associatedDeviceScreenLockSetUpFragment0.B().i();
                return ibom.a;
            }
            case 4: {
                if(associatedDeviceScreenLockSetUpFragment0 == null) {
                    ibuq.i("hostFragment");
                    associatedDeviceScreenLockSetUpFragment0 = null;
                }
                eyxf eyxf1 = new eyxf();
                eyxf1.setArguments(jyu.a(new ibns[]{new ibns("dialogType", ((int)0))}));
                eyxf1.show(associatedDeviceScreenLockSetUpFragment0.getChildFragmentManager(), "ScreenLockSetUpFailureDialogFragment");
                associatedDeviceScreenLockSetUpFragment0.d = eyxf1;
                associatedDeviceScreenLockSetUpFragment0.B().i();
                return ibom.a;
            }
            case 5: {
                xoc.b(associatedDeviceScreenLockSetUpFragment0).finish();
                associatedDeviceScreenLockSetUpFragment0.B().i();
                return ibom.a;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

