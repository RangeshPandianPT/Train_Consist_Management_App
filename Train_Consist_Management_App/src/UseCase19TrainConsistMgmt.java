public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================\n");

        // Sorted array (VERY IMPORTANT for Binary Search)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        // Display available IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchId);

            if (result == 0) {
                found = true;
                break;
            }
            else if (result < 0) {
                low = mid + 1;   // Search right half
            }
            else {
                high = mid - 1;  // Search left half
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}