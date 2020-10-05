import Storageable.*;

public class JobSaverTest {
    public static void main(String[] args) {
        JobSaver js = new JobSaver();
        Storageable st = new Queue();
        js.setStorage(st);
        js.storage();
    }
}
