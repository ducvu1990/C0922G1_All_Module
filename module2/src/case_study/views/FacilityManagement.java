package case_study.views;

import case_study.controllers.FacilityController;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.views.addNewFacility.AddNewFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final FacilityController facilityController = new FacilityController();
    public static void menuFuramaOption3() {
        int option3;
        do {
            System.out.println("---MENU Facility Management---\n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            try {
                option3 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option3) {
                case 1:
                    System.out.println(facilityController.displays());
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
                    facilityIntegerMap = facilityController.displayFacilitymaintenance();
                    for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                        System.out.println(entry);
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid number entered.");
                    break;
            }
        } while (true);
    }
    public static void addNewFacility() {
        int option32;
        int numberOfUsesVilla = 0;
        int numberOfUsesRoom = 0;
        do {
            System.out.println("---MENU add new Facility Management---\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New Room\n" +
                    "3.\tBack to menu\n");
            try {
                option32 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option32) {
                case 1:
                    System.out.println("Enter service name.");
                    String serviceNameVilla = scanner.nextLine();
                    System.out.println("Enter usable area.");
                    double usableAreaVilla = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter rental costs.");
                    double rentalCostsVilla = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter maximum number of people.");
                    int maximumNumberOfPeopleVilla = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter rental type.");
                    String rentalTypeVilla = scanner.nextLine();
                    System.out.println("Enter room standard.");
                    String roomStandardVilla = scanner.nextLine();
                    System.out.println("Enter pool area.");
                    double poolAreaVilla = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter number of floors.");
                    int numberOfFloorsVilla = Integer.parseInt(scanner.nextLine());
                    Villa villa = new Villa(serviceNameVilla, usableAreaVilla, rentalCostsVilla, maximumNumberOfPeopleVilla,
                            rentalTypeVilla, roomStandardVilla, poolAreaVilla, numberOfFloorsVilla);
                    facilityController.addFacility(villa,numberOfUsesVilla);
                    numberOfUsesVilla++;
                    break;
                case 2:
                    System.out.println("Enter service name.");
                    String serviceNameRoom = scanner.nextLine();
                    System.out.println("Enter usable area.");
                    double usableAreaRoom = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter rental costs");
                    double rentalCostsRoom = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter maximum number of people");
                    int maximumNumberOfPeopleRoom = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter rental type");
                    String rentalTypeRoom = scanner.nextLine();
                    System.out.println("Enter free service included");
                    String freeServiceIncludedRoom = scanner.nextLine();
                    Room room = new Room(serviceNameRoom,usableAreaRoom,rentalCostsRoom,maximumNumberOfPeopleRoom,
                            rentalTypeRoom,freeServiceIncludedRoom);
                    facilityController.addFacility(room,numberOfUsesRoom);
                    numberOfUsesRoom++;
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid number entered.");
                    break;
            }
        } while (true);
    }
}
