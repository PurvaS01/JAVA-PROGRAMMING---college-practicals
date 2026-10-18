class AttendanceDefaulter extends Exception {
    AttendanceDefaulter(String message) {
        super(message);
    }
}

class SYIT {
    void eligibility(int p) throws AttendanceDefaulter {
        if (p < 75) {
            throw new AttendanceDefaulter("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}

class Main {
    public static void main(String[] args) {
        SYIT obj = new SYIT();

        try {
            obj.eligibility(78);
            obj.eligibility(69);
        } catch (AttendanceDefaulter e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Executed");
        }
    }
}
