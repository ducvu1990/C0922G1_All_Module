package case_study.views;

import case_study.controllers.FacilityController;
import case_study.models.facility.Facility;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.utils.Validate;

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
                    Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
                    facilityIntegerMap = facilityController.displayFacilitymaintenance();
                    for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                        System.out.println(entry);
                    }
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    Map<Facility, Integer> facilityIntegerMapMaintenance = new LinkedHashMap<>();
                    facilityIntegerMapMaintenance = facilityController.displayFacilitymaintenance();
                    for (Map.Entry<Facility, Integer> entry : facilityIntegerMapMaintenance.entrySet()) {
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

    private static final String SERVICE_CODE_VILLA = "^SVVL-[0-9]{4}";
    private static final String SERVICE_CODE_ROOM = "^SVRO-[0-9]{4}";
    private static final String SERVICE_NAME = "[A-Z][a-z]+";
    private static final String USABLE_AREA = "[3-9][0-9]+.[0-9]+";
    private static final String RENTAL_COSTS = "[0-9]+";
    private static final String MAXIMUN_NUMBER_OF_PEOPLE = "^[0-2][0-9]$";
    private static final String NUMBER_OF_FLOORS = "[0-9]+";
    private static final String RENTAL_TYPE = "[A-Z][a-z]+";

    public static void addNewFacility() {
        int option32 = 0;
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
                System.err.println(e.getMessage());            }
            switch (option32) {
                case 1:
                    System.out.println("Enter service code.");
                    String serviceCodeVilla;
                    do {
                        serviceCodeVilla = scanner.nextLine();
                        if (Validate.validate(SERVICE_CODE_VILLA, serviceCodeVilla)){
                            break;
                        }else {
                            System.err.println("Incorrect input, please re-enter.");
                        }
                    }while (true);
                    if (facilityController.checkServiceCode(serviceCodeVilla)){
                        System.err.println("Code already exists.");
                    }else {
                        System.out.println("Enter service name.");
                        String serviceNameVilla;
                        do {
                            serviceNameVilla = scanner.nextLine();
                            if (Validate.validate(SERVICE_NAME, serviceNameVilla)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);

                        System.out.println("Enter usable area.");
                        String usableAreaVillaScecnner;
                        do {
                            usableAreaVillaScecnner = scanner.nextLine();
                            if (Validate.validate(USABLE_AREA, usableAreaVillaScecnner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        double usableAreaVilla = Double.parseDouble(usableAreaVillaScecnner);

                        System.out.println("Enter rental costs.");
                        String rentalCostsVillaScenner;
                        do {
                            rentalCostsVillaScenner = scanner.nextLine();
                            if (Validate.validate(RENTAL_COSTS, rentalCostsVillaScenner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        double rentalCostsVilla = Double.parseDouble(rentalCostsVillaScenner);

                        System.out.println("Enter maximum number of people.");
                        String maximumNumberOfPeopleVillaScanner;
                        do {
                            maximumNumberOfPeopleVillaScanner = scanner.nextLine();
                            if (Validate.validate(MAXIMUN_NUMBER_OF_PEOPLE, maximumNumberOfPeopleVillaScanner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        int maximumNumberOfPeopleVilla = Integer.parseInt(maximumNumberOfPeopleVillaScanner);

                        System.out.println("Enter rental type.");
                        String rentalTypeVilla;
                        do {
                            rentalTypeVilla = scanner.nextLine();
                            if (Validate.validate(RENTAL_TYPE, rentalTypeVilla)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);

                        System.out.println("Enter room standard.");
                        String roomStandardVilla = scanner.nextLine();

                        System.out.println("Enter pool area.");
                        double poolAreaVilla = Double.parseDouble(scanner.nextLine());

                        System.out.println("Enter number of floors.");
                        String numberOfFloorsVillaScenner;
                        do {
                            numberOfFloorsVillaScenner = scanner.nextLine();
                            if (Validate.validate(NUMBER_OF_FLOORS, numberOfFloorsVillaScenner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        int numberOfFloorsVilla = Integer.parseInt(numberOfFloorsVillaScenner);

                        Villa villa = new Villa(serviceCodeVilla, serviceNameVilla, usableAreaVilla, rentalCostsVilla, maximumNumberOfPeopleVilla,
                                rentalTypeVilla, roomStandardVilla, poolAreaVilla, numberOfFloorsVilla);
                        facilityController.addFacility(villa, numberOfUsesVilla);
                        numberOfUsesVilla++;
                    }
                    break;
                case 2:
                    System.out.println("Enter service code.");
                    String serviceCodeRoom;
                    do {
                        serviceCodeRoom = scanner.nextLine();
                        if (Validate.validate(SERVICE_CODE_ROOM, serviceCodeRoom)){
                            break;
                        }else {
                            System.err.println("Incorrect input, please re-enter.");
                        }
                    }while (true);
                    if (facilityController.checkServiceCode(serviceCodeRoom)){
                        System.err.println("Code already exists.");
                    }else {
                        System.out.println("Enter service name.");
                        String serviceNameRoom;
                        do {
                            serviceNameRoom = scanner.nextLine();
                            if (Validate.validate(SERVICE_NAME, serviceNameRoom)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);

                        System.out.println("Enter usable area.");
                        String usableAreaRoomScecnner;
                        do {
                            usableAreaRoomScecnner = scanner.nextLine();
                            if (Validate.validate(USABLE_AREA, usableAreaRoomScecnner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        double usableAreaRoom = Double.parseDouble(usableAreaRoomScecnner);

                        System.out.println("Enter rental costs.");
                        String rentalCostsRoomScenner;
                        do {
                            rentalCostsRoomScenner = scanner.nextLine();
                            if (Validate.validate(RENTAL_COSTS, rentalCostsRoomScenner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        double rentalCostsRoom = Double.parseDouble(rentalCostsRoomScenner);

                        System.out.println("Enter maximum number of people.");
                        String maximumNumberOfPeopleRoomScanner;
                        do {
                            maximumNumberOfPeopleRoomScanner = scanner.nextLine();
                            if (Validate.validate(MAXIMUN_NUMBER_OF_PEOPLE, maximumNumberOfPeopleRoomScanner)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        int maximumNumberOfPeopleRoom = Integer.parseInt(maximumNumberOfPeopleRoomScanner);

                        System.out.println("Enter rental type.");
                        String rentalTypeRoom;
                        do {
                            rentalTypeRoom = scanner.nextLine();
                            if (Validate.validate(RENTAL_TYPE, rentalTypeRoom)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);

                        System.out.println("Enter free service included");
                        String freeServiceIncludedRoom = scanner.nextLine();

                        Room room = new Room(serviceCodeRoom, serviceNameRoom, usableAreaRoom, rentalCostsRoom, maximumNumberOfPeopleRoom,
                                rentalTypeRoom, freeServiceIncludedRoom);
                        facilityController.addFacility(room, numberOfUsesRoom);
                        numberOfUsesRoom++;
                    }
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
