
package com.example.paulo.cyberplay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import android.os.Parcelable;

import com.example.paulo.cyberplay.model.Jogo;

import org.parceler.Generated;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2016-05-03T13:46-0300")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Jogo$$Parcelable
    implements Parcelable, ParcelWrapper<Jogo>
{

    private Jogo jogo$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Jogo$$Parcelable.Creator$$0 CREATOR = new Jogo$$Parcelable.Creator$$0();

    public Jogo$$Parcelable(Jogo jogo$$2) {
        jogo$$0 = jogo$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(jogo$$0, parcel$$0, flags, new HashSet<Integer>());
    }

    public static void write(Jogo jogo$$1, android.os.Parcel parcel$$1, int flags$$0, Set<Integer> identitySet$$0) {
        int identity$$0 = System.identityHashCode(jogo$$1);
        parcel$$1 .writeInt(identity$$0);
        if (!identitySet$$0 .contains(identity$$0)) {
            identitySet$$0 .add(identity$$0);
            if (jogo$$1 == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeString(jogo$$1 .desenvolvedora);
                parcel$$1 .writeString(jogo$$1 .titulo);
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public Jogo getParcel() {
        return jogo$$0;
    }

    public static Jogo read(android.os.Parcel parcel$$3, Map<Integer, Object> identityMap$$0) {
        Jogo jogo$$3;
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$0 .containsKey(identity$$1)) {
            Jogo jogo$$4 = ((Jogo) identityMap$$0 .get(identity$$1));
            if ((jogo$$4 == null)&&(identity$$1 != 0)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return jogo$$4;
        }
        if (parcel$$3 .readInt() == -1) {
            jogo$$3 = null;
            identityMap$$0 .put(identity$$1, null);
        } else {
            Jogo jogo$$5;
            identityMap$$0 .put(identity$$1, null);
            jogo$$5 = new Jogo();
            identityMap$$0 .put(identity$$1, jogo$$5);
            jogo$$5 .desenvolvedora = parcel$$3 .readString();
            jogo$$5 .titulo = parcel$$3 .readString();
            jogo$$3 = jogo$$5;
        }
        return jogo$$3;
    }

    public final static class Creator$$0
        implements Creator<Jogo$$Parcelable>
    {


        @Override
        public Jogo$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Jogo$$Parcelable(read(parcel$$2, new HashMap<Integer, Object>()));
        }

        @Override
        public Jogo$$Parcelable[] newArray(int size) {
            return new Jogo$$Parcelable[size] ;
        }

    }

}
