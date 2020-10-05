import Storageable.*;

public class JobSaver {
    Storageable storage;

    public JobSaver() {
    }

    public void setStorage(Storageable storage) {
        this.storage = storage;
    }

    public void storage() {
        storage.storage();
    }
}
