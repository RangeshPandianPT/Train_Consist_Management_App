public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("====================================\n");

        // Case 1: Empty bogie list (to trigger exception)
        String[] bogieIds = {};   // Empty array

        String searchId = "BG309";

        try {
            // ---- STATE VALIDATION ----
            if (bogieIds.length == 0) {
                throw new IllegalStateException("Error: No bogies available for search!");
            }

            // ---- SEARCH LOGIC (Linear Search) ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie " + searchId + " found.");
            } else {
                System.out.println("Bogie " + searchId + " NOT found.");
            }

        } catch (IllegalStateException e) {
            // Handle exception
            System.out.println(e.getMessage());
        }

        System.out.println("\nUC20 operation completed...");
    }
}