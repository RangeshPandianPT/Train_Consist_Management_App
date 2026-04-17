import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ============================================================
 * MAIN CLASS - UseCase11TrainConsistMgmt
 * ============================================================
 *
 * Use Case 11: Validate Train ID and Cargo Code
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * The application:
 * - Accepts Train ID input
 * - Accepts Cargo Code input
 * - Applies regex validation
 * - Displays validation result
 *
 * ============================================================
 */

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== Accept Input =====
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // ===== Define Regex Patterns =====
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // ===== Compile Patterns =====
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // ===== Create Matchers =====
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // ===== Perform Validation =====
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // ===== Display Results =====
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        // ===== Optional Feedback =====
        if (!isTrainValid) {
            System.out.println("❌ Invalid Train ID format. Expected: TRN-1234");
        }

        if (!isCargoValid) {
            System.out.println("❌ Invalid Cargo Code format. Expected: PET-AB");
        }

        System.out.println("\nUC11 validation completed...");

        scanner.close();
    }
}