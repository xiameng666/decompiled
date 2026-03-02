package com.google.android.gms.personalsafety.storage.roomdb;

import a;
import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import cctd;
import eicb;
import eicd;
import eikj;
import eikx;
import hrtd;
import java.util.concurrent.ExecutionException;
import omd;
import omn;

public abstract class PersonalSafetyRoomDb extends omn {
    private static volatile PersonalSafetyRoomDb m;

    public abstract eikj u();

    public static PersonalSafetyRoomDb v(Context context0) {
        synchronized(PersonalSafetyRoomDb.class) {
            boolean z = hrtd.a.I().bu();
            if(PersonalSafetyRoomDb.m == null) {
                try {
                    Class class1 = PersonalSafetyRoomDb.class;
                    synchronized(class1) {
                        PersonalSafetyRoomDb.m = PersonalSafetyRoomDb.x(context0);
                        if(z) {
                            PersonalSafetyRoomDb.m.w().a().get();
                        }
                    }
                }
                catch(ExecutionException | InterruptedException exception0) {
                    eicb.a(context0).q(8);
                    a.e(eicd.a.i(), "Exception reading database. Recreating: %b", Boolean.valueOf(z), exception0);
                    if((exception0.getCause() instanceof SQLiteCantOpenDatabaseException) && z) {
                        context0.deleteDatabase("personalsafety_db");
                        PersonalSafetyRoomDb.m = PersonalSafetyRoomDb.x(context0);
                    }
                }
            }
        }
        return PersonalSafetyRoomDb.m;
    }

    public abstract eikx w();

    private static PersonalSafetyRoomDb x(Context context0) {
        omd omd0 = cctd.a(context0.getApplicationContext(), PersonalSafetyRoomDb.class, "personalsafety_db");
        omd0.d();
        return (PersonalSafetyRoomDb)omd0.a();
    }
}

