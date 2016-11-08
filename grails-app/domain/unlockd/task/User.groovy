package unlockd.task

class User {

    static constraints = {
    }

    Integer fileId

    String firstName

    String lastName

    String toString() {
        return "${fileId}, ${firstName} ${lastName}"
    }

    public void setFileId(int value) {
        if (value % 2 == 0) {
            throw new IllegalArgumentException("File Id must be odd")
        }
    }

    public void setFirstName(String value) {
        firstName = value.toLowerCase().
    }
}
