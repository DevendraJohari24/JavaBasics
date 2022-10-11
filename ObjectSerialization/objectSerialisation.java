package ObjectSerialization;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class objectSerialisation  {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();
        obj.i=4;

        // we will not store whole object we store only state.

        // we will save object instead of data in the file

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f) ;
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        // get Data from the file

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj1 = (Save) ois.readObject(); // Return the object of Object so we have to cast it
        System.out.println("Value of Obj " + obj1.i);
    }
}


// Error says -> Java can not allow its object to store
// because if it allows it to store then it maybe used for the malicious purpose
// To make it allow we use Marker interface -> Serializable


class Save implements Serializable{
    int i;
}